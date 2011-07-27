--------------------------------------------------------------------------------
-- Clean Log Format (CLF)
--------------------------------------------------------------------------------
/*
  Specifications: http://twiki.corp.yahoo.com/view/Ysti18n/ShastaApplicationsReq
  Building: http://twiki.corp.yahoo.com/view/Ysti18n/ShastaCleanLogRunning

  Running:
    export SHASTA_HOME=/homes/shasta/projects/shasta/releases/current/etc/shasta_apps/workflow/CLF

    pig -f /homes/romainr/projects/shasta/releases/shasta_apps-0.1.12.0.1277317020.T44539/etc/shasta_apps/workflow/CLF/CLF.pig \
      -Dmapred.job.queue.name=search_general \
      -Dmapred.map.tasks.speculative.execution=true \
      -param input="/data/SDS/data/search_France/20091001\/*\/*\/*" \
      -param output="tmp/franceCleanLog20091001" \
      -param market="France" \
      -param language="fr" \
      -param reducer="83" \
      -param srcid=18877 \
      -param lib_path=~/projects/shasta/releases/shasta_apps-0.1.12.0.1277317020.T44539/lib/jars \
      -param anonymized_source=1 \
      -Dmapred.cache.archives="/user/shasta/cacheArchives/ygeo_gt-1.4.1_il-7.4.0.tar.gz#ygeo" \
      -Dmapred.child.java.opts="-server -Xmx640m -Djava.net.preferIPv4Stack=true -Djava.library.path=./ygeo/lib" \
      -Dmapred.child.env=LD_LIBRARY_PATH=./ygeo/lib \
      -Dmapred.create.symlink=yes \
      -Dmapred.job.map.memory.mb=3072

  INFO:
    - 'bcookie' is always the first field, trick for not losing the column names
    - UDF jars must be in .
*/
--------------------------------------------------------------------------------

REGISTER $lib_path/shasta_apps.jar;
REGISTER $lib_path/gtlocip.jar;
REGISTER $lib_path/internetlocality.jar;


%DEFAULT geo_info 'timezone,countrywoeid,statewoeid,countywoeid,townwoeid,zipwoeid';
%DEFAULT normalizers 'unicode_nfc,space';
%DEFAULT record_filters 'bcookie_age';
%DEFAULT session_filters 'noref_nofr,ydod,trackmenot,noclick';
%DEFAULT param_set '';
%DEfAULT anonymized_source '0';

DEFINE QUERY_NORMALIZER com.yahoo.search.shasta.udf.normalizer.DispatcherNormalizer('$normalizers');
DEFINE QUERY_LANGUAGE_DETECTOR com.yahoo.search.shasta.udf.detector.QueryLanguageDetector();
DEFINE IS_ANONYMIZED com.yahoo.search.shasta.udf.detector.AnonymizationDetector();
DEFINE BCOOKIE_TIMESTAMP_DECODER com.yahoo.search.shasta.udf.decoder.BCookieTimestampDecoder();
DEFINE IP_DECODER com.yahoo.search.shasta.udf.decoder.IPDecoder('$geo_info');
DEFINE ANONYMOUS_IP_DECODER com.yahoo.search.shasta.udf.decoder.AnonymousIPDecoder('$geo_info');
DEFINE DETECT_RECORD_TYPE com.yahoo.search.shasta.udf.qss.RecordTypeDetector();
DEFINE GET_SLK_SEC_INFO com.yahoo.search.shasta.udf.qss.SlkSecFieldsMerger('qss-spell;domain-spell;qrw;it;qss-qrw;domain-qrw;dqrw;rfrw');

DEFINE RECORD_FILTER com.yahoo.search.shasta.udf.recordfilter.DispatcherRecordFilter(
  '$record_filters',
  '$param_set'
);
DEFINE SESSION_FILTER com.yahoo.search.shasta.udf.sessionfilter.DispatcherSessionFilter(
  '$session_filters',
  '$param_set'
);
DEFINE MERGE_VIEW_INFO com.yahoo.search.shasta.udf.util.BagMapFieldsMerger('sec;slk;pst');
DEFINE JOIN_BAG com.yahoo.search.shasta.udf.util.BagJoiner('|');

sds = LOAD '$input'
  USING com.yahoo.yst.sds.ULT.ULTLoader()
  AS (simpleFields:MAP[], mapFields:map[], mapListFields:map[]);

/**
 * Beginning projection and transformation.
 */
records = FOREACH sds
  GENERATE
    (CHARARRAY) simpleFields#'bcookie' AS bcookie,
    ($anonymized_source == 1 ? 
      (LONG) simpleFields#'bcookie_age' :
      BCOOKIE_TIMESTAMP_DECODER((CHARARRAY) simpleFields#'bcookie')) AS bcookie_timestamp,
    (LONG) simpleFields#'timestamp' AS timestamp,
    (CHARARRAY) simpleFields#'type' AS sds_type,
    QUERY_NORMALIZER(
      (CHARARRAY) mapFields#'page_params'#'query') AS query,
    (INT) simpleFields#'src_spaceid' AS spaceid,
    (CHARARRAY) simpleFields#'ydod' AS ydod,
    (CHARARRAY) simpleFields#'referrer' AS referrer,
    (CHARARRAY) mapFields#'page_params'#'frcode' AS frcode,
    (CHARARRAY) '$language' AS language,
    (CHARARRAY) mapFields#'page_params'#'sp' AS suggestion,
    (CHARARRAY) mapFields#'page_params'#'ipc' AS ipc,
    (CHARARRAY) mapFields#'demog'#'c' AS user_country,
    (CHARARRAY) mapFields#'demog'#'g' AS user_gender,
    (CHARARRAY) mapFields#'demog'#'p' AS user_postal,
    (CHARARRAY) mapFields#'demog'#'y' AS user_year,
    (CHARARRAY) mapFields#'page_params'#'acf' AS acf,
    ($anonymized_source == 1 ?
      (map[]) ANONYMOUS_IP_DECODER((CHARARRAY) simpleFields#'ip_blob') :
      (map[]) IP_DECODER((CHARARRAY) simpleFields#'ip')) AS geo,
    (CHARARRAY) simpleFields#'dst_spaceid' AS dst_spaceid,
    (CHARARRAY) mapFields#'page_params'#'vtestid' AS bucket,
    (CHARARRAY) mapFields#'page_params'#'hedb' AS hedb,
    (CHARARRAY) mapFields#'page_params'#'pao' AS pao,
    (CHARARRAY) mapFields#'page_params'#'pso' AS pso,
    (CHARARRAY) mapFields#'page_params'#'cydir' AS cydir,
    DETECT_RECORD_TYPE(
      (CHARARRAY) simpleFields#'type',
      (map[]) GET_SLK_SEC_INFO(
        mapListFields#'viewinfo',  -- pig parser bug? putting cast bag{tuple(map[])} no longer works
        (map[]) mapFields#'clickinfo'),
      (CHARARRAY) mapFields#'page_params'#'sp',
      (CHARARRAY) mapFields#'page_params'#'fr2') AS qss_type,
    (CHARARRAY) mapFields#'page_params'#'fr2' AS fr2,
    (CHARARRAY) mapFields#'page_params'#'ins' AS ins,
    (CHARARRAY) mapFields#'page_params'#'n_sr' AS n_sr,
    (CHARARRAY) mapFields#'page_params'#'i_res' AS i_res,
    QUERY_NORMALIZER(
       (CHARARRAY) mapFields#'page_params'#'pqstr') AS pqstr,
    (CHARARRAY) mapFields#'page_params'#'lang' AS lang,
    (INT) (mapFields#'clickinfo'#'pos' IS null ? 0 : mapFields#'clickinfo'#'pos') AS clk_pos,
    (CHARARRAY) mapFields#'clickinfo'#'targurl' AS clk_url,
    (CHARARRAY) mapFields#'clickinfo'#'sec' AS clk_sec,
    (CHARARRAY) mapFields#'clickinfo'#'slk' AS clk_slk,
    (INT) mapFields#'page_params'#'pagenum' AS pagenum,
    (INT) mapFields#'page_params'#'spnt' AS spnt,
    (INT) mapFields#'page_params'#'n_gps' AS n_gps,
    (INT) mapFields#'page_params'#'n_vps' AS n_vps,
    (CHARARRAY) mapFields#'page_params'#'gprid' AS gprid,
    (CHARARRAY) simpleFields#'srcpvid' AS srcpvid,
    (CHARARRAY) mapFields#'page_params'#'ddinfo' AS ddinfo,
    (INT) simpleFields#'srcid' AS srcid,
    MERGE_VIEW_INFO(
      mapListFields#'viewinfo') AS view_infos {tuples: (key:chararray,value:chararray)}
;
--DEBUG-- STORE records INTO '$output-POST_PROJECTION';


/**
 * Per record filters.
 */
records_clean = FILTER records
  BY query IS NOT null
  AND query != ''
  AND qss_type IS NOT null
  AND bcookie IS NOT null
  AND timestamp IS NOT null
  AND srcid == $srcid
  AND NOT RECORD_FILTER(*)    -- venus or bcookie age record filter
;
--DEBUG-- STORE records_clean INTO '$output-POST_PER_RECORD_FILTER';


/**
 * Per session filters.
 */
records_group = GROUP records_clean
  BY bcookie PARALLEL $reducer
;
records_group_clean = FILTER records_group
  BY NOT SESSION_FILTER(records_clean)    -- ydod session filter
;
records = FOREACH records_group_clean
{
  records_sorted = ORDER records_clean BY timestamp, sds_type;
  GENERATE FLATTEN(records_sorted) AS bcookie;    -- trick for not losing the column names
}
;
--DEBUG-- STORE records INTO '$output-POST_PER_SESSION_FILTER';


/**
 * Final projection.
 */
fields = FOREACH records {
  also_top_list = FILTER view_infos BY key == 'sec' AND value == 'rel';
  also_bottom_list = FILTER view_infos BY key == 'sec' AND value == 'rel-bot';
  pst_list = FILTER view_infos BY key == 'pst';
  GENERATE
    bcookie,        -- 1
    timestamp,      -- 2
    sds_type,       -- 3
    query,          -- 4
    QUERY_LANGUAGE_DETECTOR(query, '$market', '$language') as language,  -- 5
    suggestion,     -- 6
    ipc,            -- 7
    user_country,   -- 8
    user_gender,    -- 9
    user_postal,    -- 10
    user_year,      -- 11
    acf,            -- 12
    geo#'timezone', -- 13
    geo#'countrywoeid',  -- 14
    geo#'statewoeid',    -- 15
    geo#'countywoeid',   -- 16
    geo#'townwoeid',     -- 17
    geo#'zipwoeid',      -- 18
    spaceid,        -- 19
    dst_spaceid,    -- 20
    bucket,         -- 21
    hedb,           -- 22
    pao,            -- 23
    pso,            -- 24
    cydir,          -- 25
    qss_type,       -- 26
    fr2,            -- 27
    frcode,         -- 28
    ins,            -- 29
    n_sr,           -- 30
    i_res,          -- 31
    pqstr,          -- 32
    lang,           -- 33
    JOIN_BAG(pst_list.value) AS pst,  -- 34
    clk_pos,        -- 35
    clk_url,        -- 36
    clk_sec,        -- 37
    clk_slk,        -- 38
    pagenum,        -- 39
    spnt,           -- 40
    (INT) SIZE(also_top_list) AS also_top,  -- 41
    (INT) SIZE(also_bottom_list) AS alsotry_bot,  -- 42
    n_gps,          -- 43
    n_vps,          -- 44
    gprid,          -- 45
    srcpvid,        -- 46
    ddinfo,         -- 47
    ($anonymized_source == 1 AND IS_ANONYMIZED(query) ? 1 : null),        -- 48
    ($anonymized_source == 1 AND IS_ANONYMIZED(suggestion) ? 1 : null)    -- 49    
  ;
};

STORE fields INTO '$output';

