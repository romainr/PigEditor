package org.apache.pigeditor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.apache.pigeditor.services.PigGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPigParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_COGROUP_TYPE", "RULE_DOUBLENUMBER", "RULE_EXECCOMMAND", "RULE_DIGIT", "RULE_INT", "RULE_ID", "RULE_SL_COMMENT", "RULE_LONGINTEGER", "RULE_FLOATINGPOINT", "RULE_LETTER", "RULE_SPECIALCHAR", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'='", "'LOAD'", "'FOREACH'", "'FILTER'", "'BY'", "'GROUP'", "'USING'", "'COGROUP'", "'ORDER'", "'CROSS'", "'UNION'", "'ON'", "'JOIN'", "'LIMIT'", "'SAMPLE'", "'DISTINCT'", "'STREAM'", "'THROUGH'", "'MAPREDUCE'", "'SPLIT'", "'INTO'", "','", "'STORE'", "'DESCRIBE'", "'EXPLAIN'", "'DUMP'", "'('", "')'", "'OR'", "'AND'", "'?'", "':'", "'+'", "'IS'", "'NOT'", "'NULL'", "'.'", "'::'", "'-'", "'MATCHES'", "'*'", "'AS'", "'PARALLEL'", "'REGISTER'", "'%DEFAULT'", "'%DECLARE'", "'DEFINE'", "'$'", "'ALL'", "'/'", "'\\\\'", "'INT'", "'LONG'", "'FLOAT'", "'DOUBLE'", "'CHARARRAY'", "'BYTEARRAY'", "'TUPLE'", "'BAG'", "'{'", "'}'", "'MAP[]'", "'EQ'", "'GT'", "'LT'", "'GTE'", "'LTE'", "'NEQ'", "'=='", "'<'", "'<='", "'>'", "'>='", "'!='", "'#'", "'%'", "'ASC'", "'DESC'", "'PARTITION'", "'LEFT'", "'RIGHT'", "'FULL'", "'OUTER'", "'ANY'", "'INNER'", "'GENERATE'", "'IF'", "'\\\\u'"
    };
    public static final int RULE_ID=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int RULE_LETTER=14;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=16;
    public static final int RULE_COGROUP_TYPE=5;
    public static final int RULE_STRING=4;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int RULE_DIGIT=8;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_LONGINTEGER=12;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_EXECCOMMAND=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLENUMBER=6;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_FLOATINGPOINT=13;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SPECIALCHAR=15;
    public static final int RULE_WS=17;

    // delegates
    // delegators


        public InternalPigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPigParser.tokenNames; }
    public String getGrammarFileName() { return "../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g"; }



     	private PigGrammarAccess grammarAccess;
     	
        public InternalPigParser(TokenStream input, PigGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Query";	
       	}
       	
       	@Override
       	protected PigGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQuery"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:67:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:68:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:69:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery75);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:76:1: ruleQuery returns [EObject current=null] : ( (lv_elements_0_0= ruleStatement ) )* ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:79:28: ( ( (lv_elements_0_0= ruleStatement ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:80:1: ( (lv_elements_0_0= ruleStatement ) )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:80:1: ( (lv_elements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_SL_COMMENT)||(LA1_0>=42 && LA1_0<=45)||(LA1_0>=63 && LA1_0<=66)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:81:1: (lv_elements_0_0= ruleStatement )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:81:1: (lv_elements_0_0= ruleStatement )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:82:3: lv_elements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryAccess().getElementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleQuery130);
            	    lv_elements_0_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQueryRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:106:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:107:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:108:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement166);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:115:1: ruleStatement returns [EObject current=null] : ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= ';' ) | ruleCommentStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_21=null;
        EObject this_DefineStatement_0 = null;

        EObject this_LoadStatement_1 = null;

        EObject this_ForeachStatement_2 = null;

        EObject this_FilterStatement_3 = null;

        EObject this_GroupByStatement_4 = null;

        EObject this_OrderStatement_5 = null;

        EObject this_LimitStatement_6 = null;

        EObject this_DistinctStatement_7 = null;

        EObject this_CrossStatement_8 = null;

        EObject this_JoinStatement_9 = null;

        EObject this_CoGroupByStatement_10 = null;

        EObject this_StreamStatement_11 = null;

        EObject this_MrStatement_13 = null;

        EObject this_SplitStatement_14 = null;

        EObject this_UnionStatement_15 = null;

        EObject this_SampleStatement_16 = null;

        EObject this_StoreStatement_17 = null;

        EObject this_DumpStatement_18 = null;

        EObject this_DescribeStatement_19 = null;

        EObject this_ExplainStatement_20 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:118:28: ( ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= ';' ) | ruleCommentStatement ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:119:1: ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= ';' ) | ruleCommentStatement )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:119:1: ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= ';' ) | ruleCommentStatement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=42 && LA5_0<=45)||(LA5_0>=63 && LA5_0<=66)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_SL_COMMENT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:119:2: ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= ';' )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:119:2: ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= ';' )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:119:3: (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= ';'
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:119:3: (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement )
                    int alt4=11;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:120:5: this_DefineStatement_0= ruleDefineStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getDefineStatementParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_ruleDefineStatement_in_ruleStatement225);
                            this_DefineStatement_0=ruleDefineStatement();

                            state._fsp--;

                             
                                    current = this_DefineStatement_0; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:130:5: this_LoadStatement_1= ruleLoadStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getLoadStatementParserRuleCall_0_0_1()); 
                                
                            pushFollow(FOLLOW_ruleLoadStatement_in_ruleStatement252);
                            this_LoadStatement_1=ruleLoadStatement();

                            state._fsp--;

                             
                                    current = this_LoadStatement_1; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:139:6: ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:139:6: ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:139:7: (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )?
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:139:7: (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement )
                            int alt2=10;
                            alt2 = dfa2.predict(input);
                            switch (alt2) {
                                case 1 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:140:5: this_ForeachStatement_2= ruleForeachStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getForeachStatementParserRuleCall_0_0_2_0_0()); 
                                        
                                    pushFollow(FOLLOW_ruleForeachStatement_in_ruleStatement281);
                                    this_ForeachStatement_2=ruleForeachStatement();

                                    state._fsp--;

                                     
                                            current = this_ForeachStatement_2; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:150:5: this_FilterStatement_3= ruleFilterStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getFilterStatementParserRuleCall_0_0_2_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleFilterStatement_in_ruleStatement308);
                                    this_FilterStatement_3=ruleFilterStatement();

                                    state._fsp--;

                                     
                                            current = this_FilterStatement_3; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 3 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:160:5: this_GroupByStatement_4= ruleGroupByStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getGroupByStatementParserRuleCall_0_0_2_0_2()); 
                                        
                                    pushFollow(FOLLOW_ruleGroupByStatement_in_ruleStatement335);
                                    this_GroupByStatement_4=ruleGroupByStatement();

                                    state._fsp--;

                                     
                                            current = this_GroupByStatement_4; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 4 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:170:5: this_OrderStatement_5= ruleOrderStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getOrderStatementParserRuleCall_0_0_2_0_3()); 
                                        
                                    pushFollow(FOLLOW_ruleOrderStatement_in_ruleStatement362);
                                    this_OrderStatement_5=ruleOrderStatement();

                                    state._fsp--;

                                     
                                            current = this_OrderStatement_5; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 5 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:180:5: this_LimitStatement_6= ruleLimitStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getLimitStatementParserRuleCall_0_0_2_0_4()); 
                                        
                                    pushFollow(FOLLOW_ruleLimitStatement_in_ruleStatement389);
                                    this_LimitStatement_6=ruleLimitStatement();

                                    state._fsp--;

                                     
                                            current = this_LimitStatement_6; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 6 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:190:5: this_DistinctStatement_7= ruleDistinctStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getDistinctStatementParserRuleCall_0_0_2_0_5()); 
                                        
                                    pushFollow(FOLLOW_ruleDistinctStatement_in_ruleStatement416);
                                    this_DistinctStatement_7=ruleDistinctStatement();

                                    state._fsp--;

                                     
                                            current = this_DistinctStatement_7; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 7 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:200:5: this_CrossStatement_8= ruleCrossStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getCrossStatementParserRuleCall_0_0_2_0_6()); 
                                        
                                    pushFollow(FOLLOW_ruleCrossStatement_in_ruleStatement443);
                                    this_CrossStatement_8=ruleCrossStatement();

                                    state._fsp--;

                                     
                                            current = this_CrossStatement_8; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 8 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:210:5: this_JoinStatement_9= ruleJoinStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getJoinStatementParserRuleCall_0_0_2_0_7()); 
                                        
                                    pushFollow(FOLLOW_ruleJoinStatement_in_ruleStatement470);
                                    this_JoinStatement_9=ruleJoinStatement();

                                    state._fsp--;

                                     
                                            current = this_JoinStatement_9; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 9 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:220:5: this_CoGroupByStatement_10= ruleCoGroupByStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getCoGroupByStatementParserRuleCall_0_0_2_0_8()); 
                                        
                                    pushFollow(FOLLOW_ruleCoGroupByStatement_in_ruleStatement497);
                                    this_CoGroupByStatement_10=ruleCoGroupByStatement();

                                    state._fsp--;

                                     
                                            current = this_CoGroupByStatement_10; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 10 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:230:5: this_StreamStatement_11= ruleStreamStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getStreamStatementParserRuleCall_0_0_2_0_9()); 
                                        
                                    pushFollow(FOLLOW_ruleStreamStatement_in_ruleStatement524);
                                    this_StreamStatement_11=ruleStreamStatement();

                                    state._fsp--;

                                     
                                            current = this_StreamStatement_11; 
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:238:2: ( ruleParallelClause )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==62) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:239:5: ruleParallelClause
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()); 
                                        
                                    pushFollow(FOLLOW_ruleParallelClause_in_ruleStatement541);
                                    ruleParallelClause();

                                    state._fsp--;

                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:248:5: this_MrStatement_13= ruleMrStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getMrStatementParserRuleCall_0_0_3()); 
                                
                            pushFollow(FOLLOW_ruleMrStatement_in_ruleStatement571);
                            this_MrStatement_13=ruleMrStatement();

                            state._fsp--;

                             
                                    current = this_MrStatement_13; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 5 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:258:5: this_SplitStatement_14= ruleSplitStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getSplitStatementParserRuleCall_0_0_4()); 
                                
                            pushFollow(FOLLOW_ruleSplitStatement_in_ruleStatement598);
                            this_SplitStatement_14=ruleSplitStatement();

                            state._fsp--;

                             
                                    current = this_SplitStatement_14; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 6 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:268:5: this_UnionStatement_15= ruleUnionStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getUnionStatementParserRuleCall_0_0_5()); 
                                
                            pushFollow(FOLLOW_ruleUnionStatement_in_ruleStatement625);
                            this_UnionStatement_15=ruleUnionStatement();

                            state._fsp--;

                             
                                    current = this_UnionStatement_15; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 7 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:278:5: this_SampleStatement_16= ruleSampleStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getSampleStatementParserRuleCall_0_0_6()); 
                                
                            pushFollow(FOLLOW_ruleSampleStatement_in_ruleStatement652);
                            this_SampleStatement_16=ruleSampleStatement();

                            state._fsp--;

                             
                                    current = this_SampleStatement_16; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 8 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:288:5: this_StoreStatement_17= ruleStoreStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getStoreStatementParserRuleCall_0_0_7()); 
                                
                            pushFollow(FOLLOW_ruleStoreStatement_in_ruleStatement679);
                            this_StoreStatement_17=ruleStoreStatement();

                            state._fsp--;

                             
                                    current = this_StoreStatement_17; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 9 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:298:5: this_DumpStatement_18= ruleDumpStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getDumpStatementParserRuleCall_0_0_8()); 
                                
                            pushFollow(FOLLOW_ruleDumpStatement_in_ruleStatement706);
                            this_DumpStatement_18=ruleDumpStatement();

                            state._fsp--;

                             
                                    current = this_DumpStatement_18; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 10 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:308:5: this_DescribeStatement_19= ruleDescribeStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getDescribeStatementParserRuleCall_0_0_9()); 
                                
                            pushFollow(FOLLOW_ruleDescribeStatement_in_ruleStatement733);
                            this_DescribeStatement_19=ruleDescribeStatement();

                            state._fsp--;

                             
                                    current = this_DescribeStatement_19; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 11 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:318:5: this_ExplainStatement_20= ruleExplainStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getExplainStatementParserRuleCall_0_0_10()); 
                                
                            pushFollow(FOLLOW_ruleExplainStatement_in_ruleStatement760);
                            this_ExplainStatement_20=ruleExplainStatement();

                            state._fsp--;

                             
                                    current = this_ExplainStatement_20; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,19,FOLLOW_19_in_ruleStatement772); 

                        	newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:332:5: ruleCommentStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getCommentStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCommentStatement_in_ruleStatement795);
                    ruleCommentStatement();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleDefineStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:347:1: entryRuleDefineStatement returns [EObject current=null] : iv_ruleDefineStatement= ruleDefineStatement EOF ;
    public final EObject entryRuleDefineStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:348:2: (iv_ruleDefineStatement= ruleDefineStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:349:2: iv_ruleDefineStatement= ruleDefineStatement EOF
            {
             newCompositeNode(grammarAccess.getDefineStatementRule()); 
            pushFollow(FOLLOW_ruleDefineStatement_in_entryRuleDefineStatement830);
            iv_ruleDefineStatement=ruleDefineStatement();

            state._fsp--;

             current =iv_ruleDefineStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineStatement840); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineStatement"


    // $ANTLR start "ruleDefineStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:356:1: ruleDefineStatement returns [EObject current=null] : ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause ) ;
    public final EObject ruleDefineStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DefineClause_1 = null;

        EObject this_DefaultClause_2 = null;

        EObject this_DeclareClause_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:359:28: ( ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:360:1: ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:360:1: ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt6=1;
                }
                break;
            case 66:
                {
                alt6=2;
                }
                break;
            case 64:
                {
                alt6=3;
                }
                break;
            case 65:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:361:5: ruleRegisterClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getRegisterClauseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRegisterClause_in_ruleDefineStatement881);
                    ruleRegisterClause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:370:5: this_DefineClause_1= ruleDefineClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getDefineClauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDefineClause_in_ruleDefineStatement908);
                    this_DefineClause_1=ruleDefineClause();

                    state._fsp--;

                     
                            current = this_DefineClause_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:380:5: this_DefaultClause_2= ruleDefaultClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getDefaultClauseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDefaultClause_in_ruleDefineStatement935);
                    this_DefaultClause_2=ruleDefaultClause();

                    state._fsp--;

                     
                            current = this_DefaultClause_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:390:5: this_DeclareClause_3= ruleDeclareClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getDeclareClauseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeclareClause_in_ruleDefineStatement962);
                    this_DeclareClause_3=ruleDeclareClause();

                    state._fsp--;

                     
                            current = this_DeclareClause_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineStatement"


    // $ANTLR start "entryRuleLoadStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:406:1: entryRuleLoadStatement returns [EObject current=null] : iv_ruleLoadStatement= ruleLoadStatement EOF ;
    public final EObject entryRuleLoadStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:407:2: (iv_ruleLoadStatement= ruleLoadStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:408:2: iv_ruleLoadStatement= ruleLoadStatement EOF
            {
             newCompositeNode(grammarAccess.getLoadStatementRule()); 
            pushFollow(FOLLOW_ruleLoadStatement_in_entryRuleLoadStatement997);
            iv_ruleLoadStatement=ruleLoadStatement();

            state._fsp--;

             current =iv_ruleLoadStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadStatement1007); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadStatement"


    // $ANTLR start "ruleLoadStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:415:1: ruleLoadStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LOAD' this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? ) ;
    public final EObject ruleLoadStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:418:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LOAD' this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:419:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LOAD' this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:419:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LOAD' this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:419:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LOAD' this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:419:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:420:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:420:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:421:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getLoadStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleLoadStatement1053);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLoadStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleLoadStatement1065); 

                	newLeafNode(otherlv_1, grammarAccess.getLoadStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleLoadStatement1077); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadStatementAccess().getLOADKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLoadStatement1088); 
             
                newLeafNode(this_STRING_3, grammarAccess.getLoadStatementAccess().getSTRINGTerminalRuleCall_3()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:449:1: ( ruleLoadUsing )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:450:5: ruleLoadUsing
                    {
                     
                            newCompositeNode(grammarAccess.getLoadStatementAccess().getLoadUsingParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLoadUsing_in_ruleLoadStatement1104);
                    ruleLoadUsing();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:457:3: ( ruleAsClause )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==61) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:458:5: ruleAsClause
                    {
                     
                            newCompositeNode(grammarAccess.getLoadStatementAccess().getAsClauseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAsClause_in_ruleLoadStatement1122);
                    ruleAsClause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadStatement"


    // $ANTLR start "entryRuleForeachStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:473:1: entryRuleForeachStatement returns [EObject current=null] : iv_ruleForeachStatement= ruleForeachStatement EOF ;
    public final EObject entryRuleForeachStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:474:2: (iv_ruleForeachStatement= ruleForeachStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:475:2: iv_ruleForeachStatement= ruleForeachStatement EOF
            {
             newCompositeNode(grammarAccess.getForeachStatementRule()); 
            pushFollow(FOLLOW_ruleForeachStatement_in_entryRuleForeachStatement1159);
            iv_ruleForeachStatement=ruleForeachStatement();

            state._fsp--;

             current =iv_ruleForeachStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachStatement1169); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeachStatement"


    // $ANTLR start "ruleForeachStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:482:1: ruleForeachStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FOREACH' ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) ) ;
    public final EObject ruleForeachStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_items_4_0 = null;

        EObject lv_items_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:485:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FOREACH' ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:486:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FOREACH' ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:486:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FOREACH' ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:486:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FOREACH' ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:486:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:487:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:487:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:488:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getForeachStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleForeachStatement1215);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForeachStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleForeachStatement1227); 

                	newLeafNode(otherlv_1, grammarAccess.getForeachStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleForeachStatement1239); 

                	newLeafNode(otherlv_2, grammarAccess.getForeachStatementAccess().getFOREACHKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:512:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:513:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:513:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:514:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getForeachStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleForeachStatement1260);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForeachStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:530:2: ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==79) ) {
                alt10=1;
            }
            else if ( (LA10_0==105) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:530:3: ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:530:3: ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:530:4: ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= ';' )?
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:530:4: ( (lv_items_4_0= rulenested_blk ) )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:531:1: (lv_items_4_0= rulenested_blk )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:531:1: (lv_items_4_0= rulenested_blk )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:532:3: lv_items_4_0= rulenested_blk
                    {
                     
                    	        newCompositeNode(grammarAccess.getForeachStatementAccess().getItemsNested_blkParserRuleCall_4_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulenested_blk_in_ruleForeachStatement1283);
                    lv_items_4_0=rulenested_blk();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForeachStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_4_0, 
                            		"nested_blk");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:548:2: (otherlv_5= ';' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==19) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==19||LA9_1==62) ) {
                            alt9=1;
                        }
                        else if ( (LA9_1==EOF) ) {
                            int LA9_4 = input.LA(3);

                            if ( (LA9_4==EOF) ) {
                                alt9=1;
                            }
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:548:4: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleForeachStatement1296); 

                                	newLeafNode(otherlv_5, grammarAccess.getForeachStatementAccess().getSemicolonKeyword_4_0_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:553:6: ( (lv_items_6_0= rulegenerate_clause ) )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:553:6: ( (lv_items_6_0= rulegenerate_clause ) )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:554:1: (lv_items_6_0= rulegenerate_clause )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:554:1: (lv_items_6_0= rulegenerate_clause )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:555:3: lv_items_6_0= rulegenerate_clause
                    {
                     
                    	        newCompositeNode(grammarAccess.getForeachStatementAccess().getItemsGenerate_clauseParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulegenerate_clause_in_ruleForeachStatement1326);
                    lv_items_6_0=rulegenerate_clause();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForeachStatementRule());
                    	        }
                           		add(
                           			current, 
                           			"items",
                            		lv_items_6_0, 
                            		"generate_clause");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeachStatement"


    // $ANTLR start "entryRuleFilterStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:579:1: entryRuleFilterStatement returns [EObject current=null] : iv_ruleFilterStatement= ruleFilterStatement EOF ;
    public final EObject entryRuleFilterStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:580:2: (iv_ruleFilterStatement= ruleFilterStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:581:2: iv_ruleFilterStatement= ruleFilterStatement EOF
            {
             newCompositeNode(grammarAccess.getFilterStatementRule()); 
            pushFollow(FOLLOW_ruleFilterStatement_in_entryRuleFilterStatement1363);
            iv_ruleFilterStatement=ruleFilterStatement();

            state._fsp--;

             current =iv_ruleFilterStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterStatement1373); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterStatement"


    // $ANTLR start "ruleFilterStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:588:1: ruleFilterStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FILTER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ( (lv_cond_5_0= ruleCondition ) ) ) ;
    public final EObject ruleFilterStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_cond_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:591:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FILTER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ( (lv_cond_5_0= ruleCondition ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:592:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FILTER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ( (lv_cond_5_0= ruleCondition ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:592:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FILTER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ( (lv_cond_5_0= ruleCondition ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:592:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'FILTER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ( (lv_cond_5_0= ruleCondition ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:592:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:593:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:593:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:594:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getFilterStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleFilterStatement1419);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleFilterStatement1431); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleFilterStatement1443); 

                	newLeafNode(otherlv_2, grammarAccess.getFilterStatementAccess().getFILTERKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:618:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:619:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:619:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:620:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getFilterStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleFilterStatement1464);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleFilterStatement1476); 

                	newLeafNode(otherlv_4, grammarAccess.getFilterStatementAccess().getBYKeyword_4());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:640:1: ( (lv_cond_5_0= ruleCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:641:1: (lv_cond_5_0= ruleCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:641:1: (lv_cond_5_0= ruleCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:642:3: lv_cond_5_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getFilterStatementAccess().getCondConditionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleFilterStatement1497);
            lv_cond_5_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterStatementRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_5_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterStatement"


    // $ANTLR start "entryRuleGroupByStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:666:1: entryRuleGroupByStatement returns [EObject current=null] : iv_ruleGroupByStatement= ruleGroupByStatement EOF ;
    public final EObject entryRuleGroupByStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:667:2: (iv_ruleGroupByStatement= ruleGroupByStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:668:2: iv_ruleGroupByStatement= ruleGroupByStatement EOF
            {
             newCompositeNode(grammarAccess.getGroupByStatementRule()); 
            pushFollow(FOLLOW_ruleGroupByStatement_in_entryRuleGroupByStatement1533);
            iv_ruleGroupByStatement=ruleGroupByStatement();

            state._fsp--;

             current =iv_ruleGroupByStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByStatement1543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupByStatement"


    // $ANTLR start "ruleGroupByStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:675:1: ruleGroupByStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'GROUP' ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= 'USING' rulegroup_type )? ( rulepartition_clause )? ) ;
    public final EObject ruleGroupByStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:678:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'GROUP' ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= 'USING' rulegroup_type )? ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:679:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'GROUP' ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= 'USING' rulegroup_type )? ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:679:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'GROUP' ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= 'USING' rulegroup_type )? ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:679:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'GROUP' ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= 'USING' rulegroup_type )? ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:679:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:680:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:680:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:681:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getGroupByStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleGroupByStatement1589);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupByStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleGroupByStatement1601); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupByStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleGroupByStatement1613); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupByStatementAccess().getGROUPKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:705:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:706:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:706:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:707:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getGroupByStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleGroupByStatement1634);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupByStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:723:2: ( (lv_items_4_0= rulegroup_item_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:724:1: (lv_items_4_0= rulegroup_item_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:724:1: (lv_items_4_0= rulegroup_item_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:725:3: lv_items_4_0= rulegroup_item_list
            {
             
            	        newCompositeNode(grammarAccess.getGroupByStatementAccess().getItemsGroup_item_listParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulegroup_item_list_in_ruleGroupByStatement1655);
            lv_items_4_0=rulegroup_item_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupByStatementRule());
            	        }
                   		set(
                   			current, 
                   			"items",
                    		lv_items_4_0, 
                    		"group_item_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:741:2: (otherlv_5= 'USING' rulegroup_type )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:741:4: otherlv_5= 'USING' rulegroup_type
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleGroupByStatement1668); 

                        	newLeafNode(otherlv_5, grammarAccess.getGroupByStatementAccess().getUSINGKeyword_5_0());
                        
                     
                            newCompositeNode(grammarAccess.getGroupByStatementAccess().getGroup_typeParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_rulegroup_type_in_ruleGroupByStatement1684);
                    rulegroup_type();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:753:3: ( rulepartition_clause )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==98) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:754:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getGroupByStatementAccess().getPartition_clauseParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleGroupByStatement1702);
                    rulepartition_clause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupByStatement"


    // $ANTLR start "entryRuleCoGroupByStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:769:1: entryRuleCoGroupByStatement returns [EObject current=null] : iv_ruleCoGroupByStatement= ruleCoGroupByStatement EOF ;
    public final EObject entryRuleCoGroupByStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoGroupByStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:770:2: (iv_ruleCoGroupByStatement= ruleCoGroupByStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:771:2: iv_ruleCoGroupByStatement= ruleCoGroupByStatement EOF
            {
             newCompositeNode(grammarAccess.getCoGroupByStatementRule()); 
            pushFollow(FOLLOW_ruleCoGroupByStatement_in_entryRuleCoGroupByStatement1739);
            iv_ruleCoGroupByStatement=ruleCoGroupByStatement();

            state._fsp--;

             current =iv_ruleCoGroupByStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoGroupByStatement1749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCoGroupByStatement"


    // $ANTLR start "ruleCoGroupByStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:778:1: ruleCoGroupByStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'COGROUP' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? ) ;
    public final EObject ruleCoGroupByStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_COGROUP_TYPE_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_aliases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:781:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'COGROUP' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:782:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'COGROUP' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:782:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'COGROUP' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:782:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'COGROUP' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:782:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:783:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:783:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:784:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getCoGroupByStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleCoGroupByStatement1795);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoGroupByStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCoGroupByStatement1807); 

                	newLeafNode(otherlv_1, grammarAccess.getCoGroupByStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCoGroupByStatement1819); 

                	newLeafNode(otherlv_2, grammarAccess.getCoGroupByStatementAccess().getCOGROUPKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:808:1: ( (lv_aliases_3_0= rulejoin_sub_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:809:1: (lv_aliases_3_0= rulejoin_sub_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:809:1: (lv_aliases_3_0= rulejoin_sub_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:810:3: lv_aliases_3_0= rulejoin_sub_clause
            {
             
            	        newCompositeNode(grammarAccess.getCoGroupByStatementAccess().getAliasesJoin_sub_clauseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulejoin_sub_clause_in_ruleCoGroupByStatement1840);
            lv_aliases_3_0=rulejoin_sub_clause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCoGroupByStatementRule());
            	        }
                   		set(
                   			current, 
                   			"aliases",
                    		lv_aliases_3_0, 
                    		"join_sub_clause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:826:2: (otherlv_4= 'USING' this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:826:4: otherlv_4= 'USING' this_COGROUP_TYPE_5= RULE_COGROUP_TYPE
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleCoGroupByStatement1853); 

                        	newLeafNode(otherlv_4, grammarAccess.getCoGroupByStatementAccess().getUSINGKeyword_4_0());
                        
                    this_COGROUP_TYPE_5=(Token)match(input,RULE_COGROUP_TYPE,FOLLOW_RULE_COGROUP_TYPE_in_ruleCoGroupByStatement1864); 
                     
                        newLeafNode(this_COGROUP_TYPE_5, grammarAccess.getCoGroupByStatementAccess().getCOGROUP_TYPETerminalRuleCall_4_1()); 
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:834:3: ( rulepartition_clause )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==98) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:835:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getCoGroupByStatementAccess().getPartition_clauseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleCoGroupByStatement1882);
                    rulepartition_clause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCoGroupByStatement"


    // $ANTLR start "entryRuleOrderStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:850:1: entryRuleOrderStatement returns [EObject current=null] : iv_ruleOrderStatement= ruleOrderStatement EOF ;
    public final EObject entryRuleOrderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:851:2: (iv_ruleOrderStatement= ruleOrderStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:852:2: iv_ruleOrderStatement= ruleOrderStatement EOF
            {
             newCompositeNode(grammarAccess.getOrderStatementRule()); 
            pushFollow(FOLLOW_ruleOrderStatement_in_entryRuleOrderStatement1919);
            iv_ruleOrderStatement=ruleOrderStatement();

            state._fsp--;

             current =iv_ruleOrderStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderStatement1929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrderStatement"


    // $ANTLR start "ruleOrderStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:859:1: ruleOrderStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'ORDER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ruleorder_by_clause (otherlv_6= 'USING' ruleFuncClause )? ) ;
    public final EObject ruleOrderStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:862:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'ORDER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ruleorder_by_clause (otherlv_6= 'USING' ruleFuncClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:863:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'ORDER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ruleorder_by_clause (otherlv_6= 'USING' ruleFuncClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:863:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'ORDER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ruleorder_by_clause (otherlv_6= 'USING' ruleFuncClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:863:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'ORDER' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'BY' ruleorder_by_clause (otherlv_6= 'USING' ruleFuncClause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:863:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:864:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:864:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:865:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getOrderStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleOrderStatement1975);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleOrderStatement1987); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleOrderStatement1999); 

                	newLeafNode(otherlv_2, grammarAccess.getOrderStatementAccess().getORDERKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:889:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:890:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:890:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:891:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getOrderStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleOrderStatement2020);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrderStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleOrderStatement2032); 

                	newLeafNode(otherlv_4, grammarAccess.getOrderStatementAccess().getBYKeyword_4());
                
             
                    newCompositeNode(grammarAccess.getOrderStatementAccess().getOrder_by_clauseParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleorder_by_clause_in_ruleOrderStatement2048);
            ruleorder_by_clause();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:919:1: (otherlv_6= 'USING' ruleFuncClause )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:919:3: otherlv_6= 'USING' ruleFuncClause
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleOrderStatement2060); 

                        	newLeafNode(otherlv_6, grammarAccess.getOrderStatementAccess().getUSINGKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getOrderStatementAccess().getFuncClauseParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleFuncClause_in_ruleOrderStatement2076);
                    ruleFuncClause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrderStatement"


    // $ANTLR start "entryRuleCrossStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:939:1: entryRuleCrossStatement returns [EObject current=null] : iv_ruleCrossStatement= ruleCrossStatement EOF ;
    public final EObject entryRuleCrossStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:940:2: (iv_ruleCrossStatement= ruleCrossStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:941:2: iv_ruleCrossStatement= ruleCrossStatement EOF
            {
             newCompositeNode(grammarAccess.getCrossStatementRule()); 
            pushFollow(FOLLOW_ruleCrossStatement_in_entryRuleCrossStatement2113);
            iv_ruleCrossStatement=ruleCrossStatement();

            state._fsp--;

             current =iv_ruleCrossStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrossStatement2123); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCrossStatement"


    // $ANTLR start "ruleCrossStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:948:1: ruleCrossStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'CROSS' ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? ) ;
    public final EObject ruleCrossStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_aliases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:951:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'CROSS' ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:952:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'CROSS' ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:952:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'CROSS' ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:952:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'CROSS' ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:952:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:953:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:953:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:954:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getCrossStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleCrossStatement2169);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCrossStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCrossStatement2181); 

                	newLeafNode(otherlv_1, grammarAccess.getCrossStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleCrossStatement2193); 

                	newLeafNode(otherlv_2, grammarAccess.getCrossStatementAccess().getCROSSKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:978:1: ( (lv_aliases_3_0= rulerel_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:979:1: (lv_aliases_3_0= rulerel_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:979:1: (lv_aliases_3_0= rulerel_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:980:3: lv_aliases_3_0= rulerel_list
            {
             
            	        newCompositeNode(grammarAccess.getCrossStatementAccess().getAliasesRel_listParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulerel_list_in_ruleCrossStatement2214);
            lv_aliases_3_0=rulerel_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCrossStatementRule());
            	        }
                   		set(
                   			current, 
                   			"aliases",
                    		lv_aliases_3_0, 
                    		"rel_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:996:2: ( rulepartition_clause )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==98) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:997:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getCrossStatementAccess().getPartition_clauseParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleCrossStatement2231);
                    rulepartition_clause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCrossStatement"


    // $ANTLR start "entryRuleUnionStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1012:1: entryRuleUnionStatement returns [EObject current=null] : iv_ruleUnionStatement= ruleUnionStatement EOF ;
    public final EObject entryRuleUnionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1013:2: (iv_ruleUnionStatement= ruleUnionStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1014:2: iv_ruleUnionStatement= ruleUnionStatement EOF
            {
             newCompositeNode(grammarAccess.getUnionStatementRule()); 
            pushFollow(FOLLOW_ruleUnionStatement_in_entryRuleUnionStatement2268);
            iv_ruleUnionStatement=ruleUnionStatement();

            state._fsp--;

             current =iv_ruleUnionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionStatement2278); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionStatement"


    // $ANTLR start "ruleUnionStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1021:1: ruleUnionStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'UNION' otherlv_3= 'ON' ( (lv_aliases_4_0= rulerel_list ) ) ) ;
    public final EObject ruleUnionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_aliases_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1024:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'UNION' otherlv_3= 'ON' ( (lv_aliases_4_0= rulerel_list ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1025:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'UNION' otherlv_3= 'ON' ( (lv_aliases_4_0= rulerel_list ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1025:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'UNION' otherlv_3= 'ON' ( (lv_aliases_4_0= rulerel_list ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1025:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'UNION' otherlv_3= 'ON' ( (lv_aliases_4_0= rulerel_list ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1025:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1026:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1026:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1027:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getUnionStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleUnionStatement2324);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnionStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleUnionStatement2336); 

                	newLeafNode(otherlv_1, grammarAccess.getUnionStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleUnionStatement2348); 

                	newLeafNode(otherlv_2, grammarAccess.getUnionStatementAccess().getUNIONKeyword_2());
                
            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleUnionStatement2360); 

                	newLeafNode(otherlv_3, grammarAccess.getUnionStatementAccess().getONKeyword_3());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1055:1: ( (lv_aliases_4_0= rulerel_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1056:1: (lv_aliases_4_0= rulerel_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1056:1: (lv_aliases_4_0= rulerel_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1057:3: lv_aliases_4_0= rulerel_list
            {
             
            	        newCompositeNode(grammarAccess.getUnionStatementAccess().getAliasesRel_listParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulerel_list_in_ruleUnionStatement2381);
            lv_aliases_4_0=rulerel_list();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnionStatementRule());
            	        }
                   		set(
                   			current, 
                   			"aliases",
                    		lv_aliases_4_0, 
                    		"rel_list");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionStatement"


    // $ANTLR start "entryRuleJoinStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1081:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1082:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1083:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
             newCompositeNode(grammarAccess.getJoinStatementRule()); 
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement2417);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;

             current =iv_ruleJoinStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement2427); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinStatement"


    // $ANTLR start "ruleJoinStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1090:1: ruleJoinStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'JOIN' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' rulejoin_type )? ( rulepartition_clause )? ) ;
    public final EObject ruleJoinStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_aliases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1093:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'JOIN' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' rulejoin_type )? ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1094:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'JOIN' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' rulejoin_type )? ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1094:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'JOIN' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' rulejoin_type )? ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1094:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'JOIN' ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= 'USING' rulejoin_type )? ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1094:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1095:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1095:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1096:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleJoinStatement2473);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleJoinStatement2485); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleJoinStatement2497); 

                	newLeafNode(otherlv_2, grammarAccess.getJoinStatementAccess().getJOINKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1120:1: ( (lv_aliases_3_0= rulejoin_sub_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1121:1: (lv_aliases_3_0= rulejoin_sub_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1121:1: (lv_aliases_3_0= rulejoin_sub_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1122:3: lv_aliases_3_0= rulejoin_sub_clause
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getAliasesJoin_sub_clauseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulejoin_sub_clause_in_ruleJoinStatement2518);
            lv_aliases_3_0=rulejoin_sub_clause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinStatementRule());
            	        }
                   		set(
                   			current, 
                   			"aliases",
                    		lv_aliases_3_0, 
                    		"join_sub_clause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1138:2: (otherlv_4= 'USING' rulejoin_type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1138:4: otherlv_4= 'USING' rulejoin_type
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleJoinStatement2531); 

                        	newLeafNode(otherlv_4, grammarAccess.getJoinStatementAccess().getUSINGKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getJoinStatementAccess().getJoin_typeParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_rulejoin_type_in_ruleJoinStatement2547);
                    rulejoin_type();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1150:3: ( rulepartition_clause )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==98) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1151:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getJoinStatementAccess().getPartition_clauseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleJoinStatement2565);
                    rulepartition_clause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinStatement"


    // $ANTLR start "entryRuleLimitStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1166:1: entryRuleLimitStatement returns [EObject current=null] : iv_ruleLimitStatement= ruleLimitStatement EOF ;
    public final EObject entryRuleLimitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1167:2: (iv_ruleLimitStatement= ruleLimitStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1168:2: iv_ruleLimitStatement= ruleLimitStatement EOF
            {
             newCompositeNode(grammarAccess.getLimitStatementRule()); 
            pushFollow(FOLLOW_ruleLimitStatement_in_entryRuleLimitStatement2602);
            iv_ruleLimitStatement=ruleLimitStatement();

            state._fsp--;

             current =iv_ruleLimitStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimitStatement2612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLimitStatement"


    // $ANTLR start "ruleLimitStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1175:1: ruleLimitStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LIMIT' ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt ) ;
    public final EObject ruleLimitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1178:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LIMIT' ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1179:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LIMIT' ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1179:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LIMIT' ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1179:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'LIMIT' ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1179:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1180:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1180:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1181:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getLimitStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleLimitStatement2658);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLimitStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleLimitStatement2670); 

                	newLeafNode(otherlv_1, grammarAccess.getLimitStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleLimitStatement2682); 

                	newLeafNode(otherlv_2, grammarAccess.getLimitStatementAccess().getLIMITKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1205:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1206:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1206:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1207:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getLimitStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleLimitStatement2703);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLimitStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getLimitStatementAccess().getScalarIntParserRuleCall_4()); 
                
            pushFollow(FOLLOW_rulescalarInt_in_ruleLimitStatement2719);
            rulescalarInt();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLimitStatement"


    // $ANTLR start "entryRuleSampleStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1239:1: entryRuleSampleStatement returns [EObject current=null] : iv_ruleSampleStatement= ruleSampleStatement EOF ;
    public final EObject entryRuleSampleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1240:2: (iv_ruleSampleStatement= ruleSampleStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1241:2: iv_ruleSampleStatement= ruleSampleStatement EOF
            {
             newCompositeNode(grammarAccess.getSampleStatementRule()); 
            pushFollow(FOLLOW_ruleSampleStatement_in_entryRuleSampleStatement2754);
            iv_ruleSampleStatement=ruleSampleStatement();

            state._fsp--;

             current =iv_ruleSampleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSampleStatement2764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSampleStatement"


    // $ANTLR start "ruleSampleStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1248:1: ruleSampleStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SAMPLE' ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER ) ;
    public final EObject ruleSampleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DOUBLENUMBER_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1251:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SAMPLE' ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1252:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SAMPLE' ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1252:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SAMPLE' ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1252:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SAMPLE' ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1252:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1253:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1253:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1254:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getSampleStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleSampleStatement2810);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSampleStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSampleStatement2822); 

                	newLeafNode(otherlv_1, grammarAccess.getSampleStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleSampleStatement2834); 

                	newLeafNode(otherlv_2, grammarAccess.getSampleStatementAccess().getSAMPLEKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1278:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1279:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1279:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1280:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getSampleStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleSampleStatement2855);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSampleStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_DOUBLENUMBER_4=(Token)match(input,RULE_DOUBLENUMBER,FOLLOW_RULE_DOUBLENUMBER_in_ruleSampleStatement2866); 
             
                newLeafNode(this_DOUBLENUMBER_4, grammarAccess.getSampleStatementAccess().getDOUBLENUMBERTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSampleStatement"


    // $ANTLR start "entryRuleDistinctStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1308:1: entryRuleDistinctStatement returns [EObject current=null] : iv_ruleDistinctStatement= ruleDistinctStatement EOF ;
    public final EObject entryRuleDistinctStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistinctStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1309:2: (iv_ruleDistinctStatement= ruleDistinctStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1310:2: iv_ruleDistinctStatement= ruleDistinctStatement EOF
            {
             newCompositeNode(grammarAccess.getDistinctStatementRule()); 
            pushFollow(FOLLOW_ruleDistinctStatement_in_entryRuleDistinctStatement2901);
            iv_ruleDistinctStatement=ruleDistinctStatement();

            state._fsp--;

             current =iv_ruleDistinctStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistinctStatement2911); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistinctStatement"


    // $ANTLR start "ruleDistinctStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1317:1: ruleDistinctStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'DISTINCT' ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? ) ;
    public final EObject ruleDistinctStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1320:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'DISTINCT' ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1321:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'DISTINCT' ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1321:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'DISTINCT' ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1321:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'DISTINCT' ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1321:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1322:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1322:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1323:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDistinctStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDistinctStatement2957);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistinctStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleDistinctStatement2969); 

                	newLeafNode(otherlv_1, grammarAccess.getDistinctStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleDistinctStatement2981); 

                	newLeafNode(otherlv_2, grammarAccess.getDistinctStatementAccess().getDISTINCTKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1347:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1348:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1348:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1349:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getDistinctStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleDistinctStatement3002);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDistinctStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1365:2: ( rulepartition_clause )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==98) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1366:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getDistinctStatementAccess().getPartition_clauseParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleDistinctStatement3019);
                    rulepartition_clause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistinctStatement"


    // $ANTLR start "entryRuleStreamStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1381:1: entryRuleStreamStatement returns [EObject current=null] : iv_ruleStreamStatement= ruleStreamStatement EOF ;
    public final EObject entryRuleStreamStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1382:2: (iv_ruleStreamStatement= ruleStreamStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1383:2: iv_ruleStreamStatement= ruleStreamStatement EOF
            {
             newCompositeNode(grammarAccess.getStreamStatementRule()); 
            pushFollow(FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement3056);
            iv_ruleStreamStatement=ruleStreamStatement();

            state._fsp--;

             current =iv_ruleStreamStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamStatement3066); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStreamStatement"


    // $ANTLR start "ruleStreamStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1390:1: ruleStreamStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'STREAM' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'THROUGH' (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? ) ;
    public final EObject ruleStreamStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_EXECCOMMAND_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1393:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'STREAM' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'THROUGH' (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1394:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'STREAM' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'THROUGH' (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1394:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'STREAM' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'THROUGH' (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1394:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'STREAM' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'THROUGH' (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1394:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1395:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1395:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1396:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getStreamStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleStreamStatement3112);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleStreamStatement3124); 

                	newLeafNode(otherlv_1, grammarAccess.getStreamStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleStreamStatement3136); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamStatementAccess().getSTREAMKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1420:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1421:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1421:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1422:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getStreamStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleStreamStatement3157);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStreamStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleStreamStatement3169); 

                	newLeafNode(otherlv_4, grammarAccess.getStreamStatementAccess().getTHROUGHKeyword_4());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1442:1: (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_EXECCOMMAND) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1442:2: this_EXECCOMMAND_5= RULE_EXECCOMMAND
                    {
                    this_EXECCOMMAND_5=(Token)match(input,RULE_EXECCOMMAND,FOLLOW_RULE_EXECCOMMAND_in_ruleStreamStatement3181); 
                     
                        newLeafNode(this_EXECCOMMAND_5, grammarAccess.getStreamStatementAccess().getEXECCOMMANDTerminalRuleCall_5_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1448:5: ruleIDENTIFIER
                    {
                     
                            newCompositeNode(grammarAccess.getStreamStatementAccess().getIDENTIFIERParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleStreamStatement3202);
                    ruleIDENTIFIER();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1455:2: ( ruleAsClause )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==61) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1456:5: ruleAsClause
                    {
                     
                            newCompositeNode(grammarAccess.getStreamStatementAccess().getAsClauseParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleAsClause_in_ruleStreamStatement3219);
                    ruleAsClause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreamStatement"


    // $ANTLR start "entryRuleMrStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1471:1: entryRuleMrStatement returns [EObject current=null] : iv_ruleMrStatement= ruleMrStatement EOF ;
    public final EObject entryRuleMrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMrStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1472:2: (iv_ruleMrStatement= ruleMrStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1473:2: iv_ruleMrStatement= ruleMrStatement EOF
            {
             newCompositeNode(grammarAccess.getMrStatementRule()); 
            pushFollow(FOLLOW_ruleMrStatement_in_entryRuleMrStatement3256);
            iv_ruleMrStatement=ruleMrStatement();

            state._fsp--;

             current =iv_ruleMrStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMrStatement3266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMrStatement"


    // $ANTLR start "ruleMrStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1480:1: ruleMrStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'MAPREDUCE' this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? ) ;
    public final EObject ruleMrStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token this_EXECCOMMAND_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject this_StoreStatement_4 = null;

        EObject lv_load_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1483:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'MAPREDUCE' this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1484:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'MAPREDUCE' this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1484:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'MAPREDUCE' this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1484:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'MAPREDUCE' this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1484:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1485:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1485:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1486:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getMrStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleMrStatement3312);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMrStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleMrStatement3324); 

                	newLeafNode(otherlv_1, grammarAccess.getMrStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleMrStatement3336); 

                	newLeafNode(otherlv_2, grammarAccess.getMrStatementAccess().getMAPREDUCEKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMrStatement3347); 
             
                newLeafNode(this_STRING_3, grammarAccess.getMrStatementAccess().getSTRINGTerminalRuleCall_3()); 
                
             
                    newCompositeNode(grammarAccess.getMrStatementAccess().getStoreStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleStoreStatement_in_ruleMrStatement3368);
            this_StoreStatement_4=ruleStoreStatement();

            state._fsp--;

             
                    current = this_StoreStatement_4; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1523:1: ( (lv_load_5_0= ruleLoadStatement ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1524:1: (lv_load_5_0= ruleLoadStatement )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1524:1: (lv_load_5_0= ruleLoadStatement )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1525:3: lv_load_5_0= ruleLoadStatement
            {
             
            	        newCompositeNode(grammarAccess.getMrStatementAccess().getLoadLoadStatementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleLoadStatement_in_ruleMrStatement3388);
            lv_load_5_0=ruleLoadStatement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMrStatementRule());
            	        }
                   		set(
                   			current, 
                   			"load",
                    		lv_load_5_0, 
                    		"LoadStatement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1541:2: (this_EXECCOMMAND_6= RULE_EXECCOMMAND )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_EXECCOMMAND) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1541:3: this_EXECCOMMAND_6= RULE_EXECCOMMAND
                    {
                    this_EXECCOMMAND_6=(Token)match(input,RULE_EXECCOMMAND,FOLLOW_RULE_EXECCOMMAND_in_ruleMrStatement3400); 
                     
                        newLeafNode(this_EXECCOMMAND_6, grammarAccess.getMrStatementAccess().getEXECCOMMANDTerminalRuleCall_6()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMrStatement"


    // $ANTLR start "entryRuleSplitStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1553:1: entryRuleSplitStatement returns [EObject current=null] : iv_ruleSplitStatement= ruleSplitStatement EOF ;
    public final EObject entryRuleSplitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1554:2: (iv_ruleSplitStatement= ruleSplitStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1555:2: iv_ruleSplitStatement= ruleSplitStatement EOF
            {
             newCompositeNode(grammarAccess.getSplitStatementRule()); 
            pushFollow(FOLLOW_ruleSplitStatement_in_entryRuleSplitStatement3437);
            iv_ruleSplitStatement=ruleSplitStatement();

            state._fsp--;

             current =iv_ruleSplitStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitStatement3447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSplitStatement"


    // $ANTLR start "ruleSplitStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1562:1: ruleSplitStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SPLIT' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'INTO' ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= ',' ( (lv_branches_7_0= rulesplit_branch ) ) )+ ) ;
    public final EObject ruleSplitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_branches_5_0 = null;

        EObject lv_branches_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1565:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SPLIT' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'INTO' ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= ',' ( (lv_branches_7_0= rulesplit_branch ) ) )+ ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1566:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SPLIT' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'INTO' ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= ',' ( (lv_branches_7_0= rulesplit_branch ) ) )+ )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1566:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SPLIT' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'INTO' ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= ',' ( (lv_branches_7_0= rulesplit_branch ) ) )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1566:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= '=' otherlv_2= 'SPLIT' ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= 'INTO' ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= ',' ( (lv_branches_7_0= rulesplit_branch ) ) )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1566:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1567:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1567:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1568:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getSplitStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleSplitStatement3493);
            lv_name_0_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSplitStatementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSplitStatement3505); 

                	newLeafNode(otherlv_1, grammarAccess.getSplitStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleSplitStatement3517); 

                	newLeafNode(otherlv_2, grammarAccess.getSplitStatementAccess().getSPLITKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1592:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1593:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1593:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1594:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getSplitStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleSplitStatement3538);
            lv_type_3_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSplitStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleSplitStatement3550); 

                	newLeafNode(otherlv_4, grammarAccess.getSplitStatementAccess().getINTOKeyword_4());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1614:1: ( (lv_branches_5_0= rulesplit_branch ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1615:1: (lv_branches_5_0= rulesplit_branch )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1615:1: (lv_branches_5_0= rulesplit_branch )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1616:3: lv_branches_5_0= rulesplit_branch
            {
             
            	        newCompositeNode(grammarAccess.getSplitStatementAccess().getBranchesSplit_branchParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulesplit_branch_in_ruleSplitStatement3571);
            lv_branches_5_0=rulesplit_branch();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSplitStatementRule());
            	        }
                   		add(
                   			current, 
                   			"branches",
                    		lv_branches_5_0, 
                    		"split_branch");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1632:2: (otherlv_6= ',' ( (lv_branches_7_0= rulesplit_branch ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1632:4: otherlv_6= ',' ( (lv_branches_7_0= rulesplit_branch ) )
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleSplitStatement3584); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSplitStatementAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1636:1: ( (lv_branches_7_0= rulesplit_branch ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1637:1: (lv_branches_7_0= rulesplit_branch )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1637:1: (lv_branches_7_0= rulesplit_branch )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1638:3: lv_branches_7_0= rulesplit_branch
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSplitStatementAccess().getBranchesSplit_branchParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesplit_branch_in_ruleSplitStatement3605);
            	    lv_branches_7_0=rulesplit_branch();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSplitStatementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"branches",
            	            		lv_branches_7_0, 
            	            		"split_branch");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSplitStatement"


    // $ANTLR start "entryRuleStoreStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1662:1: entryRuleStoreStatement returns [EObject current=null] : iv_ruleStoreStatement= ruleStoreStatement EOF ;
    public final EObject entryRuleStoreStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1663:2: (iv_ruleStoreStatement= ruleStoreStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1664:2: iv_ruleStoreStatement= ruleStoreStatement EOF
            {
             newCompositeNode(grammarAccess.getStoreStatementRule()); 
            pushFollow(FOLLOW_ruleStoreStatement_in_entryRuleStoreStatement3643);
            iv_ruleStoreStatement=ruleStoreStatement();

            state._fsp--;

             current =iv_ruleStoreStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStoreStatement3653); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStoreStatement"


    // $ANTLR start "ruleStoreStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1671:1: ruleStoreStatement returns [EObject current=null] : (otherlv_0= 'STORE' ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= 'INTO' this_STRING_3= RULE_STRING (otherlv_4= 'USING' ruleFuncClause )? ) ;
    public final EObject ruleStoreStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1674:28: ( (otherlv_0= 'STORE' ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= 'INTO' this_STRING_3= RULE_STRING (otherlv_4= 'USING' ruleFuncClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1675:1: (otherlv_0= 'STORE' ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= 'INTO' this_STRING_3= RULE_STRING (otherlv_4= 'USING' ruleFuncClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1675:1: (otherlv_0= 'STORE' ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= 'INTO' this_STRING_3= RULE_STRING (otherlv_4= 'USING' ruleFuncClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1675:3: otherlv_0= 'STORE' ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= 'INTO' this_STRING_3= RULE_STRING (otherlv_4= 'USING' ruleFuncClause )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleStoreStatement3690); 

                	newLeafNode(otherlv_0, grammarAccess.getStoreStatementAccess().getSTOREKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1679:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1680:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1680:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1681:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getStoreStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleStoreStatement3711);
            lv_type_1_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStoreStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleStoreStatement3723); 

                	newLeafNode(otherlv_2, grammarAccess.getStoreStatementAccess().getINTOKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStoreStatement3734); 
             
                newLeafNode(this_STRING_3, grammarAccess.getStoreStatementAccess().getSTRINGTerminalRuleCall_3()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1705:1: (otherlv_4= 'USING' ruleFuncClause )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1705:3: otherlv_4= 'USING' ruleFuncClause
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleStoreStatement3746); 

                        	newLeafNode(otherlv_4, grammarAccess.getStoreStatementAccess().getUSINGKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getStoreStatementAccess().getFuncClauseParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleFuncClause_in_ruleStoreStatement3762);
                    ruleFuncClause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStoreStatement"


    // $ANTLR start "entryRuleDescribeStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1725:1: entryRuleDescribeStatement returns [EObject current=null] : iv_ruleDescribeStatement= ruleDescribeStatement EOF ;
    public final EObject entryRuleDescribeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescribeStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1726:2: (iv_ruleDescribeStatement= ruleDescribeStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1727:2: iv_ruleDescribeStatement= ruleDescribeStatement EOF
            {
             newCompositeNode(grammarAccess.getDescribeStatementRule()); 
            pushFollow(FOLLOW_ruleDescribeStatement_in_entryRuleDescribeStatement3799);
            iv_ruleDescribeStatement=ruleDescribeStatement();

            state._fsp--;

             current =iv_ruleDescribeStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescribeStatement3809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescribeStatement"


    // $ANTLR start "ruleDescribeStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1734:1: ruleDescribeStatement returns [EObject current=null] : (otherlv_0= 'DESCRIBE' ( (lv_type_1_0= ruleAliasType ) ) ) ;
    public final EObject ruleDescribeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1737:28: ( (otherlv_0= 'DESCRIBE' ( (lv_type_1_0= ruleAliasType ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1738:1: (otherlv_0= 'DESCRIBE' ( (lv_type_1_0= ruleAliasType ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1738:1: (otherlv_0= 'DESCRIBE' ( (lv_type_1_0= ruleAliasType ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1738:3: otherlv_0= 'DESCRIBE' ( (lv_type_1_0= ruleAliasType ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleDescribeStatement3846); 

                	newLeafNode(otherlv_0, grammarAccess.getDescribeStatementAccess().getDESCRIBEKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1742:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1743:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1743:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1744:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getDescribeStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleDescribeStatement3867);
            lv_type_1_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDescribeStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescribeStatement"


    // $ANTLR start "entryRuleExplainStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1768:1: entryRuleExplainStatement returns [EObject current=null] : iv_ruleExplainStatement= ruleExplainStatement EOF ;
    public final EObject entryRuleExplainStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplainStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1769:2: (iv_ruleExplainStatement= ruleExplainStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1770:2: iv_ruleExplainStatement= ruleExplainStatement EOF
            {
             newCompositeNode(grammarAccess.getExplainStatementRule()); 
            pushFollow(FOLLOW_ruleExplainStatement_in_entryRuleExplainStatement3903);
            iv_ruleExplainStatement=ruleExplainStatement();

            state._fsp--;

             current =iv_ruleExplainStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplainStatement3913); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplainStatement"


    // $ANTLR start "ruleExplainStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1777:1: ruleExplainStatement returns [EObject current=null] : (otherlv_0= 'EXPLAIN' ( (lv_type_1_0= ruleAliasType ) ) ) ;
    public final EObject ruleExplainStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1780:28: ( (otherlv_0= 'EXPLAIN' ( (lv_type_1_0= ruleAliasType ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1781:1: (otherlv_0= 'EXPLAIN' ( (lv_type_1_0= ruleAliasType ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1781:1: (otherlv_0= 'EXPLAIN' ( (lv_type_1_0= ruleAliasType ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1781:3: otherlv_0= 'EXPLAIN' ( (lv_type_1_0= ruleAliasType ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleExplainStatement3950); 

                	newLeafNode(otherlv_0, grammarAccess.getExplainStatementAccess().getEXPLAINKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1785:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1786:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1786:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1787:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getExplainStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleExplainStatement3971);
            lv_type_1_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExplainStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplainStatement"


    // $ANTLR start "entryRuleDumpStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1811:1: entryRuleDumpStatement returns [EObject current=null] : iv_ruleDumpStatement= ruleDumpStatement EOF ;
    public final EObject entryRuleDumpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDumpStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1812:2: (iv_ruleDumpStatement= ruleDumpStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1813:2: iv_ruleDumpStatement= ruleDumpStatement EOF
            {
             newCompositeNode(grammarAccess.getDumpStatementRule()); 
            pushFollow(FOLLOW_ruleDumpStatement_in_entryRuleDumpStatement4007);
            iv_ruleDumpStatement=ruleDumpStatement();

            state._fsp--;

             current =iv_ruleDumpStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDumpStatement4017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDumpStatement"


    // $ANTLR start "ruleDumpStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1820:1: ruleDumpStatement returns [EObject current=null] : (otherlv_0= 'DUMP' ( (lv_type_1_0= ruleAliasType ) ) ) ;
    public final EObject ruleDumpStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1823:28: ( (otherlv_0= 'DUMP' ( (lv_type_1_0= ruleAliasType ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1824:1: (otherlv_0= 'DUMP' ( (lv_type_1_0= ruleAliasType ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1824:1: (otherlv_0= 'DUMP' ( (lv_type_1_0= ruleAliasType ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1824:3: otherlv_0= 'DUMP' ( (lv_type_1_0= ruleAliasType ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleDumpStatement4054); 

                	newLeafNode(otherlv_0, grammarAccess.getDumpStatementAccess().getDUMPKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1828:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1829:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1829:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1830:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getDumpStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleDumpStatement4075);
            lv_type_1_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDumpStatementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDumpStatement"


    // $ANTLR start "entryRuleCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1854:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1855:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1856:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition4111);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition4121); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1863:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= '(' ruleType otherlv_2= ')' )? this_OrCondition_3= ruleOrCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_OrCondition_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1866:28: ( ( (otherlv_0= '(' ruleType otherlv_2= ')' )? this_OrCondition_3= ruleOrCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1867:1: ( (otherlv_0= '(' ruleType otherlv_2= ')' )? this_OrCondition_3= ruleOrCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1867:1: ( (otherlv_0= '(' ruleType otherlv_2= ')' )? this_OrCondition_3= ruleOrCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1867:2: (otherlv_0= '(' ruleType otherlv_2= ')' )? this_OrCondition_3= ruleOrCondition
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1867:2: (otherlv_0= '(' ruleType otherlv_2= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=71 && LA25_1<=79)||LA25_1==81) ) {
                    alt25=1;
                }
                else if ( (LA25_1==46) ) {
                    int LA25_4 = input.LA(3);

                    if ( (LA25_4==RULE_ID) ) {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==41||LA25_5==51) ) {
                            alt25=1;
                        }
                        else if ( (LA25_5==47) ) {
                            int LA25_6 = input.LA(5);

                            if ( (LA25_6==47) ) {
                                int LA25_7 = input.LA(6);

                                if ( (LA25_7==RULE_STRING||(LA25_7>=RULE_DIGIT && LA25_7<=RULE_ID)||(LA25_7>=RULE_LONGINTEGER && LA25_7<=RULE_FLOATINGPOINT)||LA25_7==25||LA25_7==46||(LA25_7>=54 && LA25_7<=56)||LA25_7==58||LA25_7==67||LA25_7==107) ) {
                                    alt25=1;
                                }
                            }
                        }
                    }
                }
            }
            switch (alt25) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1867:4: otherlv_0= '(' ruleType otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleCondition4159); 

                        	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCondition4175);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleCondition4186); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_2());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOrCondition_in_ruleCondition4210);
            this_OrCondition_3=ruleOrCondition();

            state._fsp--;

             
                    current = this_OrCondition_3; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOrCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1900:1: entryRuleOrCondition returns [EObject current=null] : iv_ruleOrCondition= ruleOrCondition EOF ;
    public final EObject entryRuleOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1901:2: (iv_ruleOrCondition= ruleOrCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1902:2: iv_ruleOrCondition= ruleOrCondition EOF
            {
             newCompositeNode(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_ruleOrCondition_in_entryRuleOrCondition4245);
            iv_ruleOrCondition=ruleOrCondition();

            state._fsp--;

             current =iv_ruleOrCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrCondition4255); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1909:1: ruleOrCondition returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* ) ;
    public final EObject ruleOrCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndCondition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1912:28: ( (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1913:1: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1913:1: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1914:5: this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndCondition_in_ruleOrCondition4302);
            this_AndCondition_0=ruleAndCondition();

            state._fsp--;

             
                    current = this_AndCondition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1922:1: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==48) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1922:2: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1922:2: ()
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1923:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleOrCondition4323); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getORKeyword_1_1());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1932:1: ( (lv_right_3_0= ruleAndCondition ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1933:1: (lv_right_3_0= ruleAndCondition )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1933:1: (lv_right_3_0= ruleAndCondition )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1934:3: lv_right_3_0= ruleAndCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndCondition_in_ruleOrCondition4344);
            	    lv_right_3_0=ruleAndCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrConditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"AndCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1958:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1959:2: (iv_ruleAndCondition= ruleAndCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1960:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
             newCompositeNode(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_ruleAndCondition_in_entryRuleAndCondition4382);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;

             current =iv_ruleAndCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndCondition4392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1967:1: ruleAndCondition returns [EObject current=null] : (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleUnaryCondition ) ) )* ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryCondition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1970:28: ( (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleUnaryCondition ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1971:1: (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleUnaryCondition ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1971:1: (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleUnaryCondition ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1972:5: this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleUnaryCondition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndConditionAccess().getUnaryConditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnaryCondition_in_ruleAndCondition4439);
            this_UnaryCondition_0=ruleUnaryCondition();

            state._fsp--;

             
                    current = this_UnaryCondition_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1980:1: ( () otherlv_2= 'AND' ( (lv_right_3_0= ruleUnaryCondition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==49) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1980:2: () otherlv_2= 'AND' ( (lv_right_3_0= ruleUnaryCondition ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1980:2: ()
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1981:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleAndCondition4460); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getANDKeyword_1_1());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1990:1: ( (lv_right_3_0= ruleUnaryCondition ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1991:1: (lv_right_3_0= ruleUnaryCondition )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1991:1: (lv_right_3_0= ruleUnaryCondition )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:1992:3: lv_right_3_0= ruleUnaryCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndConditionAccess().getRightUnaryConditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryCondition_in_ruleAndCondition4481);
            	    lv_right_3_0=ruleUnaryCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"UnaryCondition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRuleUnaryCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2016:1: entryRuleUnaryCondition returns [EObject current=null] : iv_ruleUnaryCondition= ruleUnaryCondition EOF ;
    public final EObject entryRuleUnaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2017:2: (iv_ruleUnaryCondition= ruleUnaryCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2018:2: iv_ruleUnaryCondition= ruleUnaryCondition EOF
            {
             newCompositeNode(grammarAccess.getUnaryConditionRule()); 
            pushFollow(FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition4519);
            iv_ruleUnaryCondition=ruleUnaryCondition();

            state._fsp--;

             current =iv_ruleUnaryCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryCondition4529); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryCondition"


    // $ANTLR start "ruleUnaryCondition"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2025:1: ruleUnaryCondition returns [EObject current=null] : ( (otherlv_0= '(' this_Condition_1= ruleCondition (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= ')' ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) ) ;
    public final EObject ruleUnaryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_Condition_1 = null;

        EObject lv_leftExp_3_0 = null;

        EObject lv_rightExp_5_0 = null;

        EObject lv_right_9_0 = null;

        EObject this_TE_10 = null;

        EObject lv_right_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2028:28: ( ( (otherlv_0= '(' this_Condition_1= ruleCondition (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= ')' ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2029:1: ( (otherlv_0= '(' this_Condition_1= ruleCondition (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= ')' ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2029:1: ( (otherlv_0= '(' this_Condition_1= ruleCondition (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= ')' ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_STRING||(LA31_0>=RULE_DIGIT && LA31_0<=RULE_ID)||(LA31_0>=RULE_LONGINTEGER && LA31_0<=RULE_FLOATINGPOINT)||LA31_0==25||(LA31_0>=54 && LA31_0<=56)||LA31_0==58||LA31_0==67||LA31_0==107) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2029:2: (otherlv_0= '(' this_Condition_1= ruleCondition (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= ')' ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2029:2: (otherlv_0= '(' this_Condition_1= ruleCondition (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= ')' ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2029:4: otherlv_0= '(' this_Condition_1= ruleCondition (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= ')' ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )?
                    {
                    otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleUnaryCondition4567); 

                        	newLeafNode(otherlv_0, grammarAccess.getUnaryConditionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getUnaryConditionAccess().getConditionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4589);
                    this_Condition_1=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2042:1: (otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==50) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2042:3: otherlv_2= '?' ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= ':' ( (lv_rightExp_5_0= ruleCondition ) )
                            {
                            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleUnaryCondition4601); 

                                	newLeafNode(otherlv_2, grammarAccess.getUnaryConditionAccess().getQuestionMarkKeyword_0_2_0());
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2046:1: ( (lv_leftExp_3_0= ruleCondition ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2047:1: (lv_leftExp_3_0= ruleCondition )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2047:1: (lv_leftExp_3_0= ruleCondition )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2048:3: lv_leftExp_3_0= ruleCondition
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getLeftExpConditionParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4622);
                            lv_leftExp_3_0=ruleCondition();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUnaryConditionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"leftExp",
                                    		lv_leftExp_3_0, 
                                    		"Condition");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_4=(Token)match(input,51,FOLLOW_51_in_ruleUnaryCondition4634); 

                                	newLeafNode(otherlv_4, grammarAccess.getUnaryConditionAccess().getColonKeyword_0_2_2());
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2068:1: ( (lv_rightExp_5_0= ruleCondition ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2069:1: (lv_rightExp_5_0= ruleCondition )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2069:1: (lv_rightExp_5_0= ruleCondition )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2070:3: lv_rightExp_5_0= ruleCondition
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getRightExpConditionParserRuleCall_0_2_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4655);
                            lv_rightExp_5_0=ruleCondition();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUnaryConditionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"rightExp",
                                    		lv_rightExp_5_0, 
                                    		"Condition");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,47,FOLLOW_47_in_ruleUnaryCondition4669); 

                        	newLeafNode(otherlv_6, grammarAccess.getUnaryConditionAccess().getRightParenthesisKeyword_0_3());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2090:1: ( () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==52) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2090:2: () otherlv_8= '+' ( (lv_right_9_0= ruleCondition ) )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2090:2: ()
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2091:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_0_4_0(),
                                        current);
                                

                            }

                            otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleUnaryCondition4691); 

                                	newLeafNode(otherlv_8, grammarAccess.getUnaryConditionAccess().getPlusSignKeyword_0_4_1());
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2100:1: ( (lv_right_9_0= ruleCondition ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2101:1: (lv_right_9_0= ruleCondition )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2101:1: (lv_right_9_0= ruleCondition )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2102:3: lv_right_9_0= ruleCondition
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getRightConditionParserRuleCall_0_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4712);
                            lv_right_9_0=ruleCondition();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUnaryConditionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"right",
                                    		lv_right_9_0, 
                                    		"Condition");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2119:6: (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2119:6: (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2120:5: this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )?
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryConditionAccess().getTEParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleTE_in_ruleUnaryCondition4744);
                    this_TE_10=ruleTE();

                    state._fsp--;

                     
                            current = this_TE_10; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2128:1: ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==59||(LA30_0>=82 && LA30_0<=93)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2128:2: () rulerel_op ( (lv_right_13_0= ruleTE ) )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2128:2: ()
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2129:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_1_1_0(),
                                        current);
                                

                            }

                             
                                    newCompositeNode(grammarAccess.getUnaryConditionAccess().getRel_opParserRuleCall_1_1_1()); 
                                
                            pushFollow(FOLLOW_rulerel_op_in_ruleUnaryCondition4769);
                            rulerel_op();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2142:1: ( (lv_right_13_0= ruleTE ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2143:1: (lv_right_13_0= ruleTE )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2143:1: (lv_right_13_0= ruleTE )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2144:3: lv_right_13_0= ruleTE
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getRightTEParserRuleCall_1_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTE_in_ruleUnaryCondition4789);
                            lv_right_13_0=ruleTE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUnaryConditionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"right",
                                    		lv_right_13_0, 
                                    		"TE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryCondition"


    // $ANTLR start "entryRuleTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2168:1: entryRuleTE returns [EObject current=null] : iv_ruleTE= ruleTE EOF ;
    public final EObject entryRuleTE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2169:2: (iv_ruleTE= ruleTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2170:2: iv_ruleTE= ruleTE EOF
            {
             newCompositeNode(grammarAccess.getTERule()); 
            pushFollow(FOLLOW_ruleTE_in_entryRuleTE4828);
            iv_ruleTE=ruleTE();

            state._fsp--;

             current =iv_ruleTE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTE4838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTE"


    // $ANTLR start "ruleTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2177:1: ruleTE returns [EObject current=null] : (this_Expression_0= ruleExpression (otherlv_1= 'IS' (otherlv_2= 'NOT' )? otherlv_3= 'NULL' )? ) ;
    public final EObject ruleTE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2180:28: ( (this_Expression_0= ruleExpression (otherlv_1= 'IS' (otherlv_2= 'NOT' )? otherlv_3= 'NULL' )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2181:1: (this_Expression_0= ruleExpression (otherlv_1= 'IS' (otherlv_2= 'NOT' )? otherlv_3= 'NULL' )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2181:1: (this_Expression_0= ruleExpression (otherlv_1= 'IS' (otherlv_2= 'NOT' )? otherlv_3= 'NULL' )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2182:5: this_Expression_0= ruleExpression (otherlv_1= 'IS' (otherlv_2= 'NOT' )? otherlv_3= 'NULL' )?
            {
             
                    newCompositeNode(grammarAccess.getTEAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleTE4885);
            this_Expression_0=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2190:1: (otherlv_1= 'IS' (otherlv_2= 'NOT' )? otherlv_3= 'NULL' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2190:3: otherlv_1= 'IS' (otherlv_2= 'NOT' )? otherlv_3= 'NULL'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleTE4897); 

                        	newLeafNode(otherlv_1, grammarAccess.getTEAccess().getISKeyword_1_0());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2194:1: (otherlv_2= 'NOT' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==54) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2194:3: otherlv_2= 'NOT'
                            {
                            otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleTE4910); 

                                	newLeafNode(otherlv_2, grammarAccess.getTEAccess().getNOTKeyword_1_1());
                                

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleTE4924); 

                        	newLeafNode(otherlv_3, grammarAccess.getTEAccess().getNULLKeyword_1_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTE"


    // $ANTLR start "entryRulefunc_eval"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2210:1: entryRulefunc_eval returns [EObject current=null] : iv_rulefunc_eval= rulefunc_eval EOF ;
    public final EObject entryRulefunc_eval() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunc_eval = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2211:2: (iv_rulefunc_eval= rulefunc_eval EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2212:2: iv_rulefunc_eval= rulefunc_eval EOF
            {
             newCompositeNode(grammarAccess.getFunc_evalRule()); 
            pushFollow(FOLLOW_rulefunc_eval_in_entryRulefunc_eval4962);
            iv_rulefunc_eval=rulefunc_eval();

            state._fsp--;

             current =iv_rulefunc_eval; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunc_eval4972); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunc_eval"


    // $ANTLR start "rulefunc_eval"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2219:1: rulefunc_eval returns [EObject current=null] : ( ruleFuncName () otherlv_2= '(' ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= ')' ) ;
    public final EObject rulefunc_eval() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arg_list_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2222:28: ( ( ruleFuncName () otherlv_2= '(' ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= ')' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2223:1: ( ruleFuncName () otherlv_2= '(' ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= ')' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2223:1: ( ruleFuncName () otherlv_2= '(' ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= ')' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2224:5: ruleFuncName () otherlv_2= '(' ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= ')'
            {
             
                    newCompositeNode(grammarAccess.getFunc_evalAccess().getFuncNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFuncName_in_rulefunc_eval5013);
            ruleFuncName();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2231:1: ()
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunc_evalAccess().getFunc_evalAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_rulefunc_eval5033); 

                	newLeafNode(otherlv_2, grammarAccess.getFunc_evalAccess().getLeftParenthesisKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2241:1: ( (lv_arg_list_3_0= rulereal_arg_list ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING||(LA34_0>=RULE_DIGIT && LA34_0<=RULE_ID)||(LA34_0>=RULE_LONGINTEGER && LA34_0<=RULE_FLOATINGPOINT)||LA34_0==25||LA34_0==46||(LA34_0>=54 && LA34_0<=56)||LA34_0==58||LA34_0==60||LA34_0==67||LA34_0==107) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2242:1: (lv_arg_list_3_0= rulereal_arg_list )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2242:1: (lv_arg_list_3_0= rulereal_arg_list )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2243:3: lv_arg_list_3_0= rulereal_arg_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunc_evalAccess().getArg_listReal_arg_listParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulereal_arg_list_in_rulefunc_eval5054);
                    lv_arg_list_3_0=rulereal_arg_list();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunc_evalRule());
                    	        }
                           		set(
                           			current, 
                           			"arg_list",
                            		lv_arg_list_3_0, 
                            		"real_arg_list");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_rulefunc_eval5067); 

                	newLeafNode(otherlv_4, grammarAccess.getFunc_evalAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunc_eval"


    // $ANTLR start "entryRulereal_arg_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2271:1: entryRulereal_arg_list returns [EObject current=null] : iv_rulereal_arg_list= rulereal_arg_list EOF ;
    public final EObject entryRulereal_arg_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_arg_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2272:2: (iv_rulereal_arg_list= rulereal_arg_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2273:2: iv_rulereal_arg_list= rulereal_arg_list EOF
            {
             newCompositeNode(grammarAccess.getReal_arg_listRule()); 
            pushFollow(FOLLOW_rulereal_arg_list_in_entryRulereal_arg_list5103);
            iv_rulereal_arg_list=rulereal_arg_list();

            state._fsp--;

             current =iv_rulereal_arg_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereal_arg_list5113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereal_arg_list"


    // $ANTLR start "rulereal_arg_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2280:1: rulereal_arg_list returns [EObject current=null] : ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= ',' ( (lv_args_2_0= rulereal_arg ) ) )* ) ;
    public final EObject rulereal_arg_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2283:28: ( ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= ',' ( (lv_args_2_0= rulereal_arg ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2284:1: ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= ',' ( (lv_args_2_0= rulereal_arg ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2284:1: ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= ',' ( (lv_args_2_0= rulereal_arg ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2284:2: ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= ',' ( (lv_args_2_0= rulereal_arg ) ) )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2284:2: ( (lv_args_0_0= rulereal_arg ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2285:1: (lv_args_0_0= rulereal_arg )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2285:1: (lv_args_0_0= rulereal_arg )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2286:3: lv_args_0_0= rulereal_arg
            {
             
            	        newCompositeNode(grammarAccess.getReal_arg_listAccess().getArgsReal_argParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulereal_arg_in_rulereal_arg_list5159);
            lv_args_0_0=rulereal_arg();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReal_arg_listRule());
            	        }
                   		add(
                   			current, 
                   			"args",
                    		lv_args_0_0, 
                    		"real_arg");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2302:2: (otherlv_1= ',' ( (lv_args_2_0= rulereal_arg ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==41) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2302:4: otherlv_1= ',' ( (lv_args_2_0= rulereal_arg ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_41_in_rulereal_arg_list5172); 

            	        	newLeafNode(otherlv_1, grammarAccess.getReal_arg_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2306:1: ( (lv_args_2_0= rulereal_arg ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2307:1: (lv_args_2_0= rulereal_arg )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2307:1: (lv_args_2_0= rulereal_arg )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2308:3: lv_args_2_0= rulereal_arg
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReal_arg_listAccess().getArgsReal_argParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulereal_arg_in_rulereal_arg_list5193);
            	    lv_args_2_0=rulereal_arg();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReal_arg_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"args",
            	            		lv_args_2_0, 
            	            		"real_arg");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereal_arg_list"


    // $ANTLR start "entryRulereal_arg"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2332:1: entryRulereal_arg returns [EObject current=null] : iv_rulereal_arg= rulereal_arg EOF ;
    public final EObject entryRulereal_arg() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_arg = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2333:2: (iv_rulereal_arg= rulereal_arg EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2334:2: iv_rulereal_arg= rulereal_arg EOF
            {
             newCompositeNode(grammarAccess.getReal_argRule()); 
            pushFollow(FOLLOW_rulereal_arg_in_entryRulereal_arg5231);
            iv_rulereal_arg=rulereal_arg();

            state._fsp--;

             current =iv_rulereal_arg; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereal_arg5241); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulereal_arg"


    // $ANTLR start "rulereal_arg"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2341:1: rulereal_arg returns [EObject current=null] : (this_Condition_0= ruleCondition | ruleSTAR ) ;
    public final EObject rulereal_arg() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2344:28: ( (this_Condition_0= ruleCondition | ruleSTAR ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2345:1: (this_Condition_0= ruleCondition | ruleSTAR )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2345:1: (this_Condition_0= ruleCondition | ruleSTAR )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING||(LA36_0>=RULE_DIGIT && LA36_0<=RULE_ID)||(LA36_0>=RULE_LONGINTEGER && LA36_0<=RULE_FLOATINGPOINT)||LA36_0==25||LA36_0==46||(LA36_0>=54 && LA36_0<=56)||LA36_0==58||LA36_0==67||LA36_0==107) ) {
                alt36=1;
            }
            else if ( (LA36_0==60) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2346:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getReal_argAccess().getConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_rulereal_arg5288);
                    this_Condition_0=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2356:5: ruleSTAR
                    {
                     
                            newCompositeNode(grammarAccess.getReal_argAccess().getSTARParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSTAR_in_rulereal_arg5309);
                    ruleSTAR();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulereal_arg"


    // $ANTLR start "entryRuleExpression"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2371:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2372:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2373:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5344);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5354); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2380:1: ruleExpression returns [EObject current=null] : ( (otherlv_0= 'NOT' )? this_AddExpression_1= ruleAddExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AddExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2383:28: ( ( (otherlv_0= 'NOT' )? this_AddExpression_1= ruleAddExpression ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2384:1: ( (otherlv_0= 'NOT' )? this_AddExpression_1= ruleAddExpression )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2384:1: ( (otherlv_0= 'NOT' )? this_AddExpression_1= ruleAddExpression )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2384:2: (otherlv_0= 'NOT' )? this_AddExpression_1= ruleAddExpression
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2384:2: (otherlv_0= 'NOT' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2384:4: otherlv_0= 'NOT'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleExpression5392); 

                        	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getNOTKeyword_0());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAddExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAddExpression_in_ruleExpression5416);
            this_AddExpression_1=ruleAddExpression();

            state._fsp--;

             
                    current = this_AddExpression_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddExpression"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2405:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2406:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2407:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression5451);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression5461); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2414:1: ruleAddExpression returns [EObject current=null] : (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_multi_expr_0 = null;

        EObject lv_mul_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2417:28: ( (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2418:1: (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2418:1: (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2419:5: this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMulti_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulemulti_expr_in_ruleAddExpression5508);
            this_multi_expr_0=rulemulti_expr();

            state._fsp--;

             
                    current = this_multi_expr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2427:1: ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52||LA39_0==58) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2427:2: ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2427:2: ( rulePLUS | ruleMINUS )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==52) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==58) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2428:5: rulePLUS
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getAddExpressionAccess().getPLUSParserRuleCall_1_0_0()); 
            	                
            	            pushFollow(FOLLOW_rulePLUS_in_ruleAddExpression5525);
            	            rulePLUS();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2437:5: ruleMINUS
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMINUSParserRuleCall_1_0_1()); 
            	                
            	            pushFollow(FOLLOW_ruleMINUS_in_ruleAddExpression5546);
            	            ruleMINUS();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2444:2: ( (lv_mul_exp_3_0= rulemulti_expr ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2445:1: (lv_mul_exp_3_0= rulemulti_expr )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2445:1: (lv_mul_exp_3_0= rulemulti_expr )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2446:3: lv_mul_exp_3_0= rulemulti_expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getMul_expMulti_exprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulemulti_expr_in_ruleAddExpression5567);
            	    lv_mul_exp_3_0=rulemulti_expr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mul_exp",
            	            		lv_mul_exp_3_0, 
            	            		"multi_expr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRulemulti_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2470:1: entryRulemulti_expr returns [EObject current=null] : iv_rulemulti_expr= rulemulti_expr EOF ;
    public final EObject entryRulemulti_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemulti_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2471:2: (iv_rulemulti_expr= rulemulti_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2472:2: iv_rulemulti_expr= rulemulti_expr EOF
            {
             newCompositeNode(grammarAccess.getMulti_exprRule()); 
            pushFollow(FOLLOW_rulemulti_expr_in_entryRulemulti_expr5605);
            iv_rulemulti_expr=rulemulti_expr();

            state._fsp--;

             current =iv_rulemulti_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemulti_expr5615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemulti_expr"


    // $ANTLR start "rulemulti_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2479:1: rulemulti_expr returns [EObject current=null] : (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* ) ;
    public final EObject rulemulti_expr() throws RecognitionException {
        EObject current = null;

        EObject this_cast_expr_0 = null;

        EObject lv_mul_cast_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2482:28: ( (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2483:1: (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2483:1: (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2484:5: this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulti_exprAccess().getCast_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecast_expr_in_rulemulti_expr5662);
            this_cast_expr_0=rulecast_expr();

            state._fsp--;

             
                    current = this_cast_expr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2492:1: ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60||LA41_0==69||LA41_0==95) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2492:2: ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2492:2: ( ruleSTAR | ruleDIV | rulePERCENT )
            	    int alt40=3;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case 95:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2493:5: ruleSTAR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMulti_exprAccess().getSTARParserRuleCall_1_0_0()); 
            	                
            	            pushFollow(FOLLOW_ruleSTAR_in_rulemulti_expr5679);
            	            ruleSTAR();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2502:5: ruleDIV
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMulti_exprAccess().getDIVParserRuleCall_1_0_1()); 
            	                
            	            pushFollow(FOLLOW_ruleDIV_in_rulemulti_expr5700);
            	            ruleDIV();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2511:5: rulePERCENT
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMulti_exprAccess().getPERCENTParserRuleCall_1_0_2()); 
            	                
            	            pushFollow(FOLLOW_rulePERCENT_in_rulemulti_expr5721);
            	            rulePERCENT();

            	            state._fsp--;

            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2518:2: ( (lv_mul_cast_4_0= rulecast_expr ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2519:1: (lv_mul_cast_4_0= rulecast_expr )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2519:1: (lv_mul_cast_4_0= rulecast_expr )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2520:3: lv_mul_cast_4_0= rulecast_expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulti_exprAccess().getMul_castCast_exprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecast_expr_in_rulemulti_expr5742);
            	    lv_mul_cast_4_0=rulecast_expr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMulti_exprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mul_cast",
            	            		lv_mul_cast_4_0, 
            	            		"cast_expr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemulti_expr"


    // $ANTLR start "entryRulecast_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2544:1: entryRulecast_expr returns [EObject current=null] : iv_rulecast_expr= rulecast_expr EOF ;
    public final EObject entryRulecast_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecast_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2545:2: (iv_rulecast_expr= rulecast_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2546:2: iv_rulecast_expr= rulecast_expr EOF
            {
             newCompositeNode(grammarAccess.getCast_exprRule()); 
            pushFollow(FOLLOW_rulecast_expr_in_entryRulecast_expr5780);
            iv_rulecast_expr=rulecast_expr();

            state._fsp--;

             current =iv_rulecast_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecast_expr5790); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecast_expr"


    // $ANTLR start "rulecast_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2553:1: rulecast_expr returns [EObject current=null] : this_unary_expr_0= ruleunary_expr ;
    public final EObject rulecast_expr() throws RecognitionException {
        EObject current = null;

        EObject this_unary_expr_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2556:28: (this_unary_expr_0= ruleunary_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2558:5: this_unary_expr_0= ruleunary_expr
            {
             
                    newCompositeNode(grammarAccess.getCast_exprAccess().getUnary_exprParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleunary_expr_in_rulecast_expr5836);
            this_unary_expr_0=ruleunary_expr();

            state._fsp--;

             
                    current = this_unary_expr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecast_expr"


    // $ANTLR start "entryRuleunary_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2574:1: entryRuleunary_expr returns [EObject current=null] : iv_ruleunary_expr= ruleunary_expr EOF ;
    public final EObject entryRuleunary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2575:2: (iv_ruleunary_expr= ruleunary_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2576:2: iv_ruleunary_expr= ruleunary_expr EOF
            {
             newCompositeNode(grammarAccess.getUnary_exprRule()); 
            pushFollow(FOLLOW_ruleunary_expr_in_entryRuleunary_expr5870);
            iv_ruleunary_expr=ruleunary_expr();

            state._fsp--;

             current =iv_ruleunary_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_expr5880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleunary_expr"


    // $ANTLR start "ruleunary_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2583:1: ruleunary_expr returns [EObject current=null] : (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr ) ;
    public final EObject ruleunary_expr() throws RecognitionException {
        EObject current = null;

        EObject this_expr_eval_0 = null;

        EObject this_neg_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2586:28: ( (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2587:1: (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2587:1: (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_STRING||(LA42_0>=RULE_DIGIT && LA42_0<=RULE_ID)||(LA42_0>=RULE_LONGINTEGER && LA42_0<=RULE_FLOATINGPOINT)||LA42_0==25||(LA42_0>=55 && LA42_0<=56)||LA42_0==67||LA42_0==107) ) {
                alt42=1;
            }
            else if ( (LA42_0==58) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2588:5: this_expr_eval_0= ruleexpr_eval
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_exprAccess().getExpr_evalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleexpr_eval_in_ruleunary_expr5927);
                    this_expr_eval_0=ruleexpr_eval();

                    state._fsp--;

                     
                            current = this_expr_eval_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2598:5: this_neg_expr_1= ruleneg_expr
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_exprAccess().getNeg_exprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleneg_expr_in_ruleunary_expr5954);
                    this_neg_expr_1=ruleneg_expr();

                    state._fsp--;

                     
                            current = this_neg_expr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleunary_expr"


    // $ANTLR start "entryRuleexpr_eval"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2614:1: entryRuleexpr_eval returns [EObject current=null] : iv_ruleexpr_eval= ruleexpr_eval EOF ;
    public final EObject entryRuleexpr_eval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr_eval = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2615:2: (iv_ruleexpr_eval= ruleexpr_eval EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2616:2: iv_ruleexpr_eval= ruleexpr_eval EOF
            {
             newCompositeNode(grammarAccess.getExpr_evalRule()); 
            pushFollow(FOLLOW_ruleexpr_eval_in_entryRuleexpr_eval5989);
            iv_ruleexpr_eval=ruleexpr_eval();

            state._fsp--;

             current =iv_ruleexpr_eval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr_eval5999); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpr_eval"


    // $ANTLR start "ruleexpr_eval"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2623:1: ruleexpr_eval returns [EObject current=null] : ( ruleconst_expr | this_var_expr_1= rulevar_expr ) ;
    public final EObject ruleexpr_eval() throws RecognitionException {
        EObject current = null;

        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2626:28: ( ( ruleconst_expr | this_var_expr_1= rulevar_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2627:1: ( ruleconst_expr | this_var_expr_1= rulevar_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2627:1: ( ruleconst_expr | this_var_expr_1= rulevar_expr )
            int alt43=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_DIGIT:
            case RULE_INT:
            case RULE_LONGINTEGER:
            case RULE_FLOATINGPOINT:
            case 55:
            case 107:
                {
                alt43=1;
                }
                break;
            case 67:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==RULE_INT||LA43_2==46||LA43_2==56||LA43_2==67) ) {
                    alt43=2;
                }
                else if ( (LA43_2==RULE_ID) ) {
                    int LA43_4 = input.LA(3);

                    if ( (LA43_4==EOF||LA43_4==19||LA43_4==26||LA43_4==41||(LA43_4>=47 && LA43_4<=53)||(LA43_4>=58 && LA43_4<=62)||LA43_4==69||(LA43_4>=82 && LA43_4<=93)||LA43_4==95||(LA43_4>=98 && LA43_4<=102)||LA43_4==104) ) {
                        alt43=1;
                    }
                    else if ( (LA43_4==RULE_ID||LA43_4==46||LA43_4==56||LA43_4==67) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 25:
            case 56:
                {
                alt43=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2628:5: ruleconst_expr
                    {
                     
                            newCompositeNode(grammarAccess.getExpr_evalAccess().getConst_exprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleconst_expr_in_ruleexpr_eval6040);
                    ruleconst_expr();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2637:5: this_var_expr_1= rulevar_expr
                    {
                     
                            newCompositeNode(grammarAccess.getExpr_evalAccess().getVar_exprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulevar_expr_in_ruleexpr_eval6067);
                    this_var_expr_1=rulevar_expr();

                    state._fsp--;

                     
                            current = this_var_expr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpr_eval"


    // $ANTLR start "entryRulevar_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2653:1: entryRulevar_expr returns [EObject current=null] : iv_rulevar_expr= rulevar_expr EOF ;
    public final EObject entryRulevar_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2654:2: (iv_rulevar_expr= rulevar_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2655:2: iv_rulevar_expr= rulevar_expr EOF
            {
             newCompositeNode(grammarAccess.getVar_exprRule()); 
            pushFollow(FOLLOW_rulevar_expr_in_entryRulevar_expr6102);
            iv_rulevar_expr=rulevar_expr();

            state._fsp--;

             current =iv_rulevar_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevar_expr6112); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevar_expr"


    // $ANTLR start "rulevar_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2662:1: rulevar_expr returns [EObject current=null] : (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* ) ;
    public final EObject rulevar_expr() throws RecognitionException {
        EObject current = null;

        EObject this_projectable_expr_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2665:28: ( (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2666:1: (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2666:1: (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2667:5: this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )*
            {
             
                    newCompositeNode(grammarAccess.getVar_exprAccess().getProjectable_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprojectable_expr_in_rulevar_expr6159);
            this_projectable_expr_0=ruleprojectable_expr();

            state._fsp--;

             
                    current = this_projectable_expr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2675:1: ( ruledot_proj | rulepound_proj )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=56 && LA44_0<=57)) ) {
                    alt44=1;
                }
                else if ( (LA44_0==94) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2676:5: ruledot_proj
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVar_exprAccess().getDot_projParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruledot_proj_in_rulevar_expr6175);
            	    ruledot_proj();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2685:5: rulepound_proj
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVar_exprAccess().getPound_projParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulepound_proj_in_rulevar_expr6196);
            	    rulepound_proj();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevar_expr"


    // $ANTLR start "entryRuleprojectable_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2700:1: entryRuleprojectable_expr returns [EObject current=null] : iv_ruleprojectable_expr= ruleprojectable_expr EOF ;
    public final EObject entryRuleprojectable_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprojectable_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2701:2: (iv_ruleprojectable_expr= ruleprojectable_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2702:2: iv_ruleprojectable_expr= ruleprojectable_expr EOF
            {
             newCompositeNode(grammarAccess.getProjectable_exprRule()); 
            pushFollow(FOLLOW_ruleprojectable_expr_in_entryRuleprojectable_expr6233);
            iv_ruleprojectable_expr=ruleprojectable_expr();

            state._fsp--;

             current =iv_ruleprojectable_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprojectable_expr6243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprojectable_expr"


    // $ANTLR start "ruleprojectable_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2709:1: ruleprojectable_expr returns [EObject current=null] : (this_func_eval_0= rulefunc_eval | rulecol_ref ) ;
    public final EObject ruleprojectable_expr() throws RecognitionException {
        EObject current = null;

        EObject this_func_eval_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2712:28: ( (this_func_eval_0= rulefunc_eval | rulecol_ref ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2713:1: (this_func_eval_0= rulefunc_eval | rulecol_ref )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2713:1: (this_func_eval_0= rulefunc_eval | rulecol_ref )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2714:5: this_func_eval_0= rulefunc_eval
                    {
                     
                            newCompositeNode(grammarAccess.getProjectable_exprAccess().getFunc_evalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulefunc_eval_in_ruleprojectable_expr6290);
                    this_func_eval_0=rulefunc_eval();

                    state._fsp--;

                     
                            current = this_func_eval_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2724:5: rulecol_ref
                    {
                     
                            newCompositeNode(grammarAccess.getProjectable_exprAccess().getCol_refParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecol_ref_in_ruleprojectable_expr6311);
                    rulecol_ref();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprojectable_expr"


    // $ANTLR start "entryRuledot_proj"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2739:1: entryRuledot_proj returns [String current=null] : iv_ruledot_proj= ruledot_proj EOF ;
    public final String entryRuledot_proj() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledot_proj = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2740:2: (iv_ruledot_proj= ruledot_proj EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2741:2: iv_ruledot_proj= ruledot_proj EOF
            {
             newCompositeNode(grammarAccess.getDot_projRule()); 
            pushFollow(FOLLOW_ruledot_proj_in_entryRuledot_proj6347);
            iv_ruledot_proj=ruledot_proj();

            state._fsp--;

             current =iv_ruledot_proj.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledot_proj6358); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledot_proj"


    // $ANTLR start "ruledot_proj"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2748:1: ruledot_proj returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' | kw= '::' ) this_col_alias_or_index_2= rulecol_alias_or_index ) ;
    public final AntlrDatatypeRuleToken ruledot_proj() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_col_alias_or_index_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2751:28: ( ( (kw= '.' | kw= '::' ) this_col_alias_or_index_2= rulecol_alias_or_index ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2752:1: ( (kw= '.' | kw= '::' ) this_col_alias_or_index_2= rulecol_alias_or_index )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2752:1: ( (kw= '.' | kw= '::' ) this_col_alias_or_index_2= rulecol_alias_or_index )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2752:2: (kw= '.' | kw= '::' ) this_col_alias_or_index_2= rulecol_alias_or_index
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2752:2: (kw= '.' | kw= '::' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            else if ( (LA46_0==57) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2753:2: kw= '.'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruledot_proj6397); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDot_projAccess().getFullStopKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2760:2: kw= '::'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruledot_proj6416); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDot_projAccess().getColonColonKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDot_projAccess().getCol_alias_or_indexParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulecol_alias_or_index_in_ruledot_proj6439);
            this_col_alias_or_index_2=rulecol_alias_or_index();

            state._fsp--;


            		current.merge(this_col_alias_or_index_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledot_proj"


    // $ANTLR start "entryRulecol_alias_or_index"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2784:1: entryRulecol_alias_or_index returns [String current=null] : iv_rulecol_alias_or_index= rulecol_alias_or_index EOF ;
    public final String entryRulecol_alias_or_index() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_alias_or_index = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2785:2: (iv_rulecol_alias_or_index= rulecol_alias_or_index EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2786:2: iv_rulecol_alias_or_index= rulecol_alias_or_index EOF
            {
             newCompositeNode(grammarAccess.getCol_alias_or_indexRule()); 
            pushFollow(FOLLOW_rulecol_alias_or_index_in_entryRulecol_alias_or_index6485);
            iv_rulecol_alias_or_index=rulecol_alias_or_index();

            state._fsp--;

             current =iv_rulecol_alias_or_index.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_alias_or_index6496); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecol_alias_or_index"


    // $ANTLR start "rulecol_alias_or_index"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2793:1: rulecol_alias_or_index returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index ) ;
    public final AntlrDatatypeRuleToken rulecol_alias_or_index() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_col_alias_0 = null;

        AntlrDatatypeRuleToken this_col_index_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2796:28: ( (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2797:1: (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2797:1: (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==67) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2798:5: this_col_alias_0= rulecol_alias
                    {
                     
                            newCompositeNode(grammarAccess.getCol_alias_or_indexAccess().getCol_aliasParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecol_alias_in_rulecol_alias_or_index6543);
                    this_col_alias_0=rulecol_alias();

                    state._fsp--;


                    		current.merge(this_col_alias_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2810:5: this_col_index_1= rulecol_index
                    {
                     
                            newCompositeNode(grammarAccess.getCol_alias_or_indexAccess().getCol_indexParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecol_index_in_rulecol_alias_or_index6576);
                    this_col_index_1=rulecol_index();

                    state._fsp--;


                    		current.merge(this_col_index_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecol_alias_or_index"


    // $ANTLR start "entryRulecol_alias"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2828:1: entryRulecol_alias returns [String current=null] : iv_rulecol_alias= rulecol_alias EOF ;
    public final String entryRulecol_alias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_alias = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2829:2: (iv_rulecol_alias= rulecol_alias EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2830:2: iv_rulecol_alias= rulecol_alias EOF
            {
             newCompositeNode(grammarAccess.getCol_aliasRule()); 
            pushFollow(FOLLOW_rulecol_alias_in_entryRulecol_alias6622);
            iv_rulecol_alias=rulecol_alias();

            state._fsp--;

             current =iv_rulecol_alias.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_alias6633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecol_alias"


    // $ANTLR start "rulecol_alias"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2837:1: rulecol_alias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= ruleIDENTIFIER ;
    public final AntlrDatatypeRuleToken rulecol_alias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2840:28: (this_IDENTIFIER_0= ruleIDENTIFIER )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2842:5: this_IDENTIFIER_0= ruleIDENTIFIER
            {
             
                    newCompositeNode(grammarAccess.getCol_aliasAccess().getIDENTIFIERParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleIDENTIFIER_in_rulecol_alias6679);
            this_IDENTIFIER_0=ruleIDENTIFIER();

            state._fsp--;


            		current.merge(this_IDENTIFIER_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecol_alias"


    // $ANTLR start "entryRulecol_index"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2860:1: entryRulecol_index returns [String current=null] : iv_rulecol_index= rulecol_index EOF ;
    public final String entryRulecol_index() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_index = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2861:2: (iv_rulecol_index= rulecol_index EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2862:2: iv_rulecol_index= rulecol_index EOF
            {
             newCompositeNode(grammarAccess.getCol_indexRule()); 
            pushFollow(FOLLOW_rulecol_index_in_entryRulecol_index6724);
            iv_rulecol_index=rulecol_index();

            state._fsp--;

             current =iv_rulecol_index.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_index6735); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecol_index"


    // $ANTLR start "rulecol_index"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2869:1: rulecol_index returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken rulecol_index() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_DOLLAR_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2872:28: ( (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2873:1: (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2873:1: (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2874:5: this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT )
            {
             
                    newCompositeNode(grammarAccess.getCol_indexAccess().getDOLLARParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDOLLAR_in_rulecol_index6782);
            this_DOLLAR_0=ruleDOLLAR();

            state._fsp--;


            		current.merge(this_DOLLAR_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2884:1: (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_DIGIT) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_INT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2884:6: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rulecol_index6803); 

                    		current.merge(this_DIGIT_1);
                        
                     
                        newLeafNode(this_DIGIT_1, grammarAccess.getCol_indexAccess().getDIGITTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2892:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulecol_index6829); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getCol_indexAccess().getINTTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecol_index"


    // $ANTLR start "entryRulepound_proj"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2907:1: entryRulepound_proj returns [String current=null] : iv_rulepound_proj= rulepound_proj EOF ;
    public final String entryRulepound_proj() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepound_proj = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2908:2: (iv_rulepound_proj= rulepound_proj EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2909:2: iv_rulepound_proj= rulepound_proj EOF
            {
             newCompositeNode(grammarAccess.getPound_projRule()); 
            pushFollow(FOLLOW_rulepound_proj_in_entryRulepound_proj6876);
            iv_rulepound_proj=rulepound_proj();

            state._fsp--;

             current =iv_rulepound_proj.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepound_proj6887); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepound_proj"


    // $ANTLR start "rulepound_proj"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2916:1: rulepound_proj returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= 'NULL' ) ) ;
    public final AntlrDatatypeRuleToken rulepound_proj() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_POUND_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2919:28: ( (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= 'NULL' ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2920:1: (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= 'NULL' ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2920:1: (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= 'NULL' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2921:5: this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= 'NULL' )
            {
             
                    newCompositeNode(grammarAccess.getPound_projAccess().getPOUNDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePOUND_in_rulepound_proj6934);
            this_POUND_0=rulePOUND();

            state._fsp--;


            		current.merge(this_POUND_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2931:1: (this_STRING_1= RULE_STRING | kw= 'NULL' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            else if ( (LA49_0==55) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2931:6: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulepound_proj6955); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getPound_projAccess().getSTRINGTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2940:2: kw= 'NULL'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_rulepound_proj6979); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPound_projAccess().getNULLKeyword_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepound_proj"


    // $ANTLR start "entryRuleneg_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2955:1: entryRuleneg_expr returns [EObject current=null] : iv_ruleneg_expr= ruleneg_expr EOF ;
    public final EObject entryRuleneg_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleneg_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2956:2: (iv_ruleneg_expr= ruleneg_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2957:2: iv_ruleneg_expr= ruleneg_expr EOF
            {
             newCompositeNode(grammarAccess.getNeg_exprRule()); 
            pushFollow(FOLLOW_ruleneg_expr_in_entryRuleneg_expr7022);
            iv_ruleneg_expr=ruleneg_expr();

            state._fsp--;

             current =iv_ruleneg_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleneg_expr7032); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleneg_expr"


    // $ANTLR start "ruleneg_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2964:1: ruleneg_expr returns [EObject current=null] : (otherlv_0= '-' this_cast_expr_1= rulecast_expr ) ;
    public final EObject ruleneg_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_cast_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2967:28: ( (otherlv_0= '-' this_cast_expr_1= rulecast_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2968:1: (otherlv_0= '-' this_cast_expr_1= rulecast_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2968:1: (otherlv_0= '-' this_cast_expr_1= rulecast_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2968:3: otherlv_0= '-' this_cast_expr_1= rulecast_expr
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleneg_expr7069); 

                	newLeafNode(otherlv_0, grammarAccess.getNeg_exprAccess().getHyphenMinusKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNeg_exprAccess().getCast_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulecast_expr_in_ruleneg_expr7091);
            this_cast_expr_1=rulecast_expr();

            state._fsp--;

             
                    current = this_cast_expr_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleneg_expr"


    // $ANTLR start "entryRulerel_op"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2989:1: entryRulerel_op returns [String current=null] : iv_rulerel_op= rulerel_op EOF ;
    public final String entryRulerel_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2990:2: (iv_rulerel_op= rulerel_op EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2991:2: iv_rulerel_op= rulerel_op EOF
            {
             newCompositeNode(grammarAccess.getRel_opRule()); 
            pushFollow(FOLLOW_rulerel_op_in_entryRulerel_op7127);
            iv_rulerel_op=rulerel_op();

            state._fsp--;

             current =iv_rulerel_op.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op7138); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op"


    // $ANTLR start "rulerel_op"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:2998:1: rulerel_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= 'MATCHES' ) ;
    public final AntlrDatatypeRuleToken rulerel_op() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_rel_op_eq_0 = null;

        AntlrDatatypeRuleToken this_rel_op_ne_1 = null;

        AntlrDatatypeRuleToken this_rel_op_gt_2 = null;

        AntlrDatatypeRuleToken this_rel_op_gte_3 = null;

        AntlrDatatypeRuleToken this_rel_op_lt_4 = null;

        AntlrDatatypeRuleToken this_rel_op_lte_5 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3001:28: ( (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= 'MATCHES' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3002:1: (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= 'MATCHES' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3002:1: (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= 'MATCHES' )
            int alt50=7;
            switch ( input.LA(1) ) {
            case 82:
            case 88:
                {
                alt50=1;
                }
                break;
            case 87:
            case 93:
                {
                alt50=2;
                }
                break;
            case 83:
            case 91:
                {
                alt50=3;
                }
                break;
            case 85:
            case 92:
                {
                alt50=4;
                }
                break;
            case 84:
            case 89:
                {
                alt50=5;
                }
                break;
            case 86:
            case 90:
                {
                alt50=6;
                }
                break;
            case 59:
                {
                alt50=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3003:5: this_rel_op_eq_0= rulerel_op_eq
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_eqParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulerel_op_eq_in_rulerel_op7185);
                    this_rel_op_eq_0=rulerel_op_eq();

                    state._fsp--;


                    		current.merge(this_rel_op_eq_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3015:5: this_rel_op_ne_1= rulerel_op_ne
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_neParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerel_op_ne_in_rulerel_op7218);
                    this_rel_op_ne_1=rulerel_op_ne();

                    state._fsp--;


                    		current.merge(this_rel_op_ne_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3027:5: this_rel_op_gt_2= rulerel_op_gt
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_gtParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulerel_op_gt_in_rulerel_op7251);
                    this_rel_op_gt_2=rulerel_op_gt();

                    state._fsp--;


                    		current.merge(this_rel_op_gt_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3039:5: this_rel_op_gte_3= rulerel_op_gte
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_gteParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulerel_op_gte_in_rulerel_op7284);
                    this_rel_op_gte_3=rulerel_op_gte();

                    state._fsp--;


                    		current.merge(this_rel_op_gte_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3051:5: this_rel_op_lt_4= rulerel_op_lt
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_ltParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulerel_op_lt_in_rulerel_op7317);
                    this_rel_op_lt_4=rulerel_op_lt();

                    state._fsp--;


                    		current.merge(this_rel_op_lt_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3063:5: this_rel_op_lte_5= rulerel_op_lte
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_lteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulerel_op_lte_in_rulerel_op7350);
                    this_rel_op_lte_5=rulerel_op_lte();

                    state._fsp--;


                    		current.merge(this_rel_op_lte_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3075:2: kw= 'MATCHES'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_rulerel_op7374); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRel_opAccess().getMATCHESKeyword_6()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op"


    // $ANTLR start "entryRulerel_op_eq"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3088:1: entryRulerel_op_eq returns [String current=null] : iv_rulerel_op_eq= rulerel_op_eq EOF ;
    public final String entryRulerel_op_eq() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_eq = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3089:2: (iv_rulerel_op_eq= rulerel_op_eq EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3090:2: iv_rulerel_op_eq= rulerel_op_eq EOF
            {
             newCompositeNode(grammarAccess.getRel_op_eqRule()); 
            pushFollow(FOLLOW_rulerel_op_eq_in_entryRulerel_op_eq7415);
            iv_rulerel_op_eq=rulerel_op_eq();

            state._fsp--;

             current =iv_rulerel_op_eq.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_eq7426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op_eq"


    // $ANTLR start "rulerel_op_eq"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3097:1: rulerel_op_eq returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ ) ;
    public final AntlrDatatypeRuleToken rulerel_op_eq() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_EQ_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_EQ_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3100:28: ( (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3101:1: (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3101:1: (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==82) ) {
                alt51=1;
            }
            else if ( (LA51_0==88) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3102:5: this_STR_OP_EQ_0= ruleSTR_OP_EQ
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_eqAccess().getSTR_OP_EQParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_EQ_in_rulerel_op_eq7473);
                    this_STR_OP_EQ_0=ruleSTR_OP_EQ();

                    state._fsp--;


                    		current.merge(this_STR_OP_EQ_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3114:5: this_NUM_OP_EQ_1= ruleNUM_OP_EQ
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_eqAccess().getNUM_OP_EQParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_EQ_in_rulerel_op_eq7506);
                    this_NUM_OP_EQ_1=ruleNUM_OP_EQ();

                    state._fsp--;


                    		current.merge(this_NUM_OP_EQ_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op_eq"


    // $ANTLR start "entryRulerel_op_ne"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3132:1: entryRulerel_op_ne returns [String current=null] : iv_rulerel_op_ne= rulerel_op_ne EOF ;
    public final String entryRulerel_op_ne() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_ne = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3133:2: (iv_rulerel_op_ne= rulerel_op_ne EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3134:2: iv_rulerel_op_ne= rulerel_op_ne EOF
            {
             newCompositeNode(grammarAccess.getRel_op_neRule()); 
            pushFollow(FOLLOW_rulerel_op_ne_in_entryRulerel_op_ne7552);
            iv_rulerel_op_ne=rulerel_op_ne();

            state._fsp--;

             current =iv_rulerel_op_ne.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_ne7563); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op_ne"


    // $ANTLR start "rulerel_op_ne"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3141:1: rulerel_op_ne returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE ) ;
    public final AntlrDatatypeRuleToken rulerel_op_ne() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_NE_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_NE_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3144:28: ( (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3145:1: (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3145:1: (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==87) ) {
                alt52=1;
            }
            else if ( (LA52_0==93) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3146:5: this_STR_OP_NE_0= ruleSTR_OP_NE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_neAccess().getSTR_OP_NEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_NE_in_rulerel_op_ne7610);
                    this_STR_OP_NE_0=ruleSTR_OP_NE();

                    state._fsp--;


                    		current.merge(this_STR_OP_NE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3158:5: this_NUM_OP_NE_1= ruleNUM_OP_NE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_neAccess().getNUM_OP_NEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_NE_in_rulerel_op_ne7643);
                    this_NUM_OP_NE_1=ruleNUM_OP_NE();

                    state._fsp--;


                    		current.merge(this_NUM_OP_NE_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op_ne"


    // $ANTLR start "entryRulerel_op_gt"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3176:1: entryRulerel_op_gt returns [String current=null] : iv_rulerel_op_gt= rulerel_op_gt EOF ;
    public final String entryRulerel_op_gt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_gt = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3177:2: (iv_rulerel_op_gt= rulerel_op_gt EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3178:2: iv_rulerel_op_gt= rulerel_op_gt EOF
            {
             newCompositeNode(grammarAccess.getRel_op_gtRule()); 
            pushFollow(FOLLOW_rulerel_op_gt_in_entryRulerel_op_gt7689);
            iv_rulerel_op_gt=rulerel_op_gt();

            state._fsp--;

             current =iv_rulerel_op_gt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_gt7700); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op_gt"


    // $ANTLR start "rulerel_op_gt"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3185:1: rulerel_op_gt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT ) ;
    public final AntlrDatatypeRuleToken rulerel_op_gt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_GT_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_GT_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3188:28: ( (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3189:1: (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3189:1: (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==83) ) {
                alt53=1;
            }
            else if ( (LA53_0==91) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3190:5: this_STR_OP_GT_0= ruleSTR_OP_GT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gtAccess().getSTR_OP_GTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_GT_in_rulerel_op_gt7747);
                    this_STR_OP_GT_0=ruleSTR_OP_GT();

                    state._fsp--;


                    		current.merge(this_STR_OP_GT_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3202:5: this_NUM_OP_GT_1= ruleNUM_OP_GT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gtAccess().getNUM_OP_GTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_GT_in_rulerel_op_gt7780);
                    this_NUM_OP_GT_1=ruleNUM_OP_GT();

                    state._fsp--;


                    		current.merge(this_NUM_OP_GT_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op_gt"


    // $ANTLR start "entryRulerel_op_gte"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3220:1: entryRulerel_op_gte returns [String current=null] : iv_rulerel_op_gte= rulerel_op_gte EOF ;
    public final String entryRulerel_op_gte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_gte = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3221:2: (iv_rulerel_op_gte= rulerel_op_gte EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3222:2: iv_rulerel_op_gte= rulerel_op_gte EOF
            {
             newCompositeNode(grammarAccess.getRel_op_gteRule()); 
            pushFollow(FOLLOW_rulerel_op_gte_in_entryRulerel_op_gte7826);
            iv_rulerel_op_gte=rulerel_op_gte();

            state._fsp--;

             current =iv_rulerel_op_gte.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_gte7837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op_gte"


    // $ANTLR start "rulerel_op_gte"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3229:1: rulerel_op_gte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE ) ;
    public final AntlrDatatypeRuleToken rulerel_op_gte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_GTE_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_GTE_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3232:28: ( (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3233:1: (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3233:1: (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==85) ) {
                alt54=1;
            }
            else if ( (LA54_0==92) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3234:5: this_STR_OP_GTE_0= ruleSTR_OP_GTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gteAccess().getSTR_OP_GTEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_GTE_in_rulerel_op_gte7884);
                    this_STR_OP_GTE_0=ruleSTR_OP_GTE();

                    state._fsp--;


                    		current.merge(this_STR_OP_GTE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3246:5: this_NUM_OP_GTE_1= ruleNUM_OP_GTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gteAccess().getNUM_OP_GTEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_GTE_in_rulerel_op_gte7917);
                    this_NUM_OP_GTE_1=ruleNUM_OP_GTE();

                    state._fsp--;


                    		current.merge(this_NUM_OP_GTE_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op_gte"


    // $ANTLR start "entryRulerel_op_lt"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3264:1: entryRulerel_op_lt returns [String current=null] : iv_rulerel_op_lt= rulerel_op_lt EOF ;
    public final String entryRulerel_op_lt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_lt = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3265:2: (iv_rulerel_op_lt= rulerel_op_lt EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3266:2: iv_rulerel_op_lt= rulerel_op_lt EOF
            {
             newCompositeNode(grammarAccess.getRel_op_ltRule()); 
            pushFollow(FOLLOW_rulerel_op_lt_in_entryRulerel_op_lt7963);
            iv_rulerel_op_lt=rulerel_op_lt();

            state._fsp--;

             current =iv_rulerel_op_lt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_lt7974); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op_lt"


    // $ANTLR start "rulerel_op_lt"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3273:1: rulerel_op_lt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT ) ;
    public final AntlrDatatypeRuleToken rulerel_op_lt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_LT_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_LT_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3276:28: ( (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3277:1: (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3277:1: (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==84) ) {
                alt55=1;
            }
            else if ( (LA55_0==89) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3278:5: this_STR_OP_LT_0= ruleSTR_OP_LT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_ltAccess().getSTR_OP_LTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_LT_in_rulerel_op_lt8021);
                    this_STR_OP_LT_0=ruleSTR_OP_LT();

                    state._fsp--;


                    		current.merge(this_STR_OP_LT_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3290:5: this_NUM_OP_LT_1= ruleNUM_OP_LT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_ltAccess().getNUM_OP_LTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_LT_in_rulerel_op_lt8054);
                    this_NUM_OP_LT_1=ruleNUM_OP_LT();

                    state._fsp--;


                    		current.merge(this_NUM_OP_LT_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op_lt"


    // $ANTLR start "entryRulerel_op_lte"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3308:1: entryRulerel_op_lte returns [String current=null] : iv_rulerel_op_lte= rulerel_op_lte EOF ;
    public final String entryRulerel_op_lte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_lte = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3309:2: (iv_rulerel_op_lte= rulerel_op_lte EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3310:2: iv_rulerel_op_lte= rulerel_op_lte EOF
            {
             newCompositeNode(grammarAccess.getRel_op_lteRule()); 
            pushFollow(FOLLOW_rulerel_op_lte_in_entryRulerel_op_lte8100);
            iv_rulerel_op_lte=rulerel_op_lte();

            state._fsp--;

             current =iv_rulerel_op_lte.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_lte8111); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_op_lte"


    // $ANTLR start "rulerel_op_lte"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3317:1: rulerel_op_lte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE ) ;
    public final AntlrDatatypeRuleToken rulerel_op_lte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_LTE_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_LTE_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3320:28: ( (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3321:1: (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3321:1: (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==86) ) {
                alt56=1;
            }
            else if ( (LA56_0==90) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3322:5: this_STR_OP_LTE_0= ruleSTR_OP_LTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_lteAccess().getSTR_OP_LTEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_LTE_in_rulerel_op_lte8158);
                    this_STR_OP_LTE_0=ruleSTR_OP_LTE();

                    state._fsp--;


                    		current.merge(this_STR_OP_LTE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3334:5: this_NUM_OP_LTE_1= ruleNUM_OP_LTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_lteAccess().getNUM_OP_LTEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_LTE_in_rulerel_op_lte8191);
                    this_NUM_OP_LTE_1=ruleNUM_OP_LTE();

                    state._fsp--;


                    		current.merge(this_NUM_OP_LTE_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_op_lte"


    // $ANTLR start "entryRuleAliasType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3352:1: entryRuleAliasType returns [EObject current=null] : iv_ruleAliasType= ruleAliasType EOF ;
    public final EObject entryRuleAliasType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3353:2: (iv_ruleAliasType= ruleAliasType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3354:2: iv_ruleAliasType= ruleAliasType EOF
            {
             newCompositeNode(grammarAccess.getAliasTypeRule()); 
            pushFollow(FOLLOW_ruleAliasType_in_entryRuleAliasType8236);
            iv_ruleAliasType=ruleAliasType();

            state._fsp--;

             current =iv_ruleAliasType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasType8246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasType"


    // $ANTLR start "ruleAliasType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3361:1: ruleAliasType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAliasType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3364:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3365:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3365:1: ( (otherlv_0= RULE_ID ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3366:1: (otherlv_0= RULE_ID )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3366:1: (otherlv_0= RULE_ID )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3367:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAliasTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasType8290); 

            		newLeafNode(otherlv_0, grammarAccess.getAliasTypeAccess().getReferencedStatementCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasType"


    // $ANTLR start "entryRuleFlattenGeneratedItem"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3386:1: entryRuleFlattenGeneratedItem returns [EObject current=null] : iv_ruleFlattenGeneratedItem= ruleFlattenGeneratedItem EOF ;
    public final EObject entryRuleFlattenGeneratedItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlattenGeneratedItem = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3387:2: (iv_ruleFlattenGeneratedItem= ruleFlattenGeneratedItem EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3388:2: iv_ruleFlattenGeneratedItem= ruleFlattenGeneratedItem EOF
            {
             newCompositeNode(grammarAccess.getFlattenGeneratedItemRule()); 
            pushFollow(FOLLOW_ruleFlattenGeneratedItem_in_entryRuleFlattenGeneratedItem8325);
            iv_ruleFlattenGeneratedItem=ruleFlattenGeneratedItem();

            state._fsp--;

             current =iv_ruleFlattenGeneratedItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlattenGeneratedItem8335); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlattenGeneratedItem"


    // $ANTLR start "ruleFlattenGeneratedItem"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3395:1: ruleFlattenGeneratedItem returns [EObject current=null] : ( (this_Condition_0= ruleCondition | otherlv_1= '*' ) (otherlv_2= 'AS' ( ruleFieldDef | ruleFieldFefList ) )? ) ;
    public final EObject ruleFlattenGeneratedItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_Condition_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3398:28: ( ( (this_Condition_0= ruleCondition | otherlv_1= '*' ) (otherlv_2= 'AS' ( ruleFieldDef | ruleFieldFefList ) )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3399:1: ( (this_Condition_0= ruleCondition | otherlv_1= '*' ) (otherlv_2= 'AS' ( ruleFieldDef | ruleFieldFefList ) )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3399:1: ( (this_Condition_0= ruleCondition | otherlv_1= '*' ) (otherlv_2= 'AS' ( ruleFieldDef | ruleFieldFefList ) )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3399:2: (this_Condition_0= ruleCondition | otherlv_1= '*' ) (otherlv_2= 'AS' ( ruleFieldDef | ruleFieldFefList ) )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3399:2: (this_Condition_0= ruleCondition | otherlv_1= '*' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_STRING||(LA57_0>=RULE_DIGIT && LA57_0<=RULE_ID)||(LA57_0>=RULE_LONGINTEGER && LA57_0<=RULE_FLOATINGPOINT)||LA57_0==25||LA57_0==46||(LA57_0>=54 && LA57_0<=56)||LA57_0==58||LA57_0==67||LA57_0==107) ) {
                alt57=1;
            }
            else if ( (LA57_0==60) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3400:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getFlattenGeneratedItemAccess().getConditionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleFlattenGeneratedItem8383);
                    this_Condition_0=ruleCondition();

                    state._fsp--;

                     
                            current = this_Condition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3409:7: otherlv_1= '*'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleFlattenGeneratedItem8400); 

                        	newLeafNode(otherlv_1, grammarAccess.getFlattenGeneratedItemAccess().getAsteriskKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3413:2: (otherlv_2= 'AS' ( ruleFieldDef | ruleFieldFefList ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==61) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3413:4: otherlv_2= 'AS' ( ruleFieldDef | ruleFieldFefList )
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleFlattenGeneratedItem8414); 

                        	newLeafNode(otherlv_2, grammarAccess.getFlattenGeneratedItemAccess().getASKeyword_1_0());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3417:1: ( ruleFieldDef | ruleFieldFefList )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_ID) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==46) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3418:5: ruleFieldDef
                            {
                             
                                    newCompositeNode(grammarAccess.getFlattenGeneratedItemAccess().getFieldDefParserRuleCall_1_1_0()); 
                                
                            pushFollow(FOLLOW_ruleFieldDef_in_ruleFlattenGeneratedItem8431);
                            ruleFieldDef();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3427:5: ruleFieldFefList
                            {
                             
                                    newCompositeNode(grammarAccess.getFlattenGeneratedItemAccess().getFieldFefListParserRuleCall_1_1_1()); 
                                
                            pushFollow(FOLLOW_ruleFieldFefList_in_ruleFlattenGeneratedItem8452);
                            ruleFieldFefList();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlattenGeneratedItem"


    // $ANTLR start "entryRuleCommentStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3442:1: entryRuleCommentStatement returns [String current=null] : iv_ruleCommentStatement= ruleCommentStatement EOF ;
    public final String entryRuleCommentStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3443:2: (iv_ruleCommentStatement= ruleCommentStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3444:2: iv_ruleCommentStatement= ruleCommentStatement EOF
            {
             newCompositeNode(grammarAccess.getCommentStatementRule()); 
            pushFollow(FOLLOW_ruleCommentStatement_in_entryRuleCommentStatement8491);
            iv_ruleCommentStatement=ruleCommentStatement();

            state._fsp--;

             current =iv_ruleCommentStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentStatement8502); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentStatement"


    // $ANTLR start "ruleCommentStatement"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3451:1: ruleCommentStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SL_COMMENT_0= RULE_SL_COMMENT ;
    public final AntlrDatatypeRuleToken ruleCommentStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SL_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3454:28: (this_SL_COMMENT_0= RULE_SL_COMMENT )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3455:5: this_SL_COMMENT_0= RULE_SL_COMMENT
            {
            this_SL_COMMENT_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleCommentStatement8541); 

            		current.merge(this_SL_COMMENT_0);
                
             
                newLeafNode(this_SL_COMMENT_0, grammarAccess.getCommentStatementAccess().getSL_COMMENTTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentStatement"


    // $ANTLR start "entryRuleAlias"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3470:1: entryRuleAlias returns [String current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final String entryRuleAlias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlias = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3471:2: (iv_ruleAlias= ruleAlias EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3472:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias8586);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias8597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3479:1: ruleAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleAlias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3482:28: (this_ID_0= RULE_ID )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3483:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlias8636); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getAliasAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleParallelClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3498:1: entryRuleParallelClause returns [String current=null] : iv_ruleParallelClause= ruleParallelClause EOF ;
    public final String entryRuleParallelClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParallelClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3499:2: (iv_ruleParallelClause= ruleParallelClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3500:2: iv_ruleParallelClause= ruleParallelClause EOF
            {
             newCompositeNode(grammarAccess.getParallelClauseRule()); 
            pushFollow(FOLLOW_ruleParallelClause_in_entryRuleParallelClause8681);
            iv_ruleParallelClause=ruleParallelClause();

            state._fsp--;

             current =iv_ruleParallelClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallelClause8692); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParallelClause"


    // $ANTLR start "ruleParallelClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3507:1: ruleParallelClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PARALLEL' this_scalarInt_1= rulescalarInt ) ;
    public final AntlrDatatypeRuleToken ruleParallelClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_scalarInt_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3510:28: ( (kw= 'PARALLEL' this_scalarInt_1= rulescalarInt ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3511:1: (kw= 'PARALLEL' this_scalarInt_1= rulescalarInt )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3511:1: (kw= 'PARALLEL' this_scalarInt_1= rulescalarInt )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3512:2: kw= 'PARALLEL' this_scalarInt_1= rulescalarInt
            {
            kw=(Token)match(input,62,FOLLOW_62_in_ruleParallelClause8730); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParallelClauseAccess().getPARALLELKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getParallelClauseAccess().getScalarIntParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulescalarInt_in_ruleParallelClause8752);
            this_scalarInt_1=rulescalarInt();

            state._fsp--;


            		current.merge(this_scalarInt_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParallelClause"


    // $ANTLR start "entryRuleRegisterClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3536:1: entryRuleRegisterClause returns [String current=null] : iv_ruleRegisterClause= ruleRegisterClause EOF ;
    public final String entryRuleRegisterClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegisterClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3537:2: (iv_ruleRegisterClause= ruleRegisterClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3538:2: iv_ruleRegisterClause= ruleRegisterClause EOF
            {
             newCompositeNode(grammarAccess.getRegisterClauseRule()); 
            pushFollow(FOLLOW_ruleRegisterClause_in_entryRuleRegisterClause8798);
            iv_ruleRegisterClause=ruleRegisterClause();

            state._fsp--;

             current =iv_ruleRegisterClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisterClause8809); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegisterClause"


    // $ANTLR start "ruleRegisterClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3545:1: ruleRegisterClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'REGISTER' this_PathClause_1= rulePathClause ) ;
    public final AntlrDatatypeRuleToken ruleRegisterClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PathClause_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3548:28: ( (kw= 'REGISTER' this_PathClause_1= rulePathClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3549:1: (kw= 'REGISTER' this_PathClause_1= rulePathClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3549:1: (kw= 'REGISTER' this_PathClause_1= rulePathClause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3550:2: kw= 'REGISTER' this_PathClause_1= rulePathClause
            {
            kw=(Token)match(input,63,FOLLOW_63_in_ruleRegisterClause8847); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRegisterClauseAccess().getREGISTERKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getRegisterClauseAccess().getPathClauseParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePathClause_in_ruleRegisterClause8869);
            this_PathClause_1=rulePathClause();

            state._fsp--;


            		current.merge(this_PathClause_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegisterClause"


    // $ANTLR start "entryRuleDefaultClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3574:1: entryRuleDefaultClause returns [EObject current=null] : iv_ruleDefaultClause= ruleDefaultClause EOF ;
    public final EObject entryRuleDefaultClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3575:2: (iv_ruleDefaultClause= ruleDefaultClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3576:2: iv_ruleDefaultClause= ruleDefaultClause EOF
            {
             newCompositeNode(grammarAccess.getDefaultClauseRule()); 
            pushFollow(FOLLOW_ruleDefaultClause_in_entryRuleDefaultClause8914);
            iv_ruleDefaultClause=ruleDefaultClause();

            state._fsp--;

             current =iv_ruleDefaultClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultClause8924); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultClause"


    // $ANTLR start "ruleDefaultClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3583:1: ruleDefaultClause returns [EObject current=null] : (otherlv_0= '%DEFAULT' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) ;
    public final EObject ruleDefaultClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3586:28: ( (otherlv_0= '%DEFAULT' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3587:1: (otherlv_0= '%DEFAULT' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3587:1: (otherlv_0= '%DEFAULT' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3587:3: otherlv_0= '%DEFAULT' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleDefaultClause8961); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultClauseAccess().getDEFAULTKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3591:1: ( (lv_name_1_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3592:1: (lv_name_1_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3592:1: (lv_name_1_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3593:3: lv_name_1_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDefaultClauseAccess().getNameAliasParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDefaultClause8982);
            lv_name_1_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefaultClauseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefaultClause8993); 
             
                newLeafNode(this_STRING_2, grammarAccess.getDefaultClauseAccess().getSTRINGTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultClause"


    // $ANTLR start "entryRuleDeclareClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3621:1: entryRuleDeclareClause returns [EObject current=null] : iv_ruleDeclareClause= ruleDeclareClause EOF ;
    public final EObject entryRuleDeclareClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3622:2: (iv_ruleDeclareClause= ruleDeclareClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3623:2: iv_ruleDeclareClause= ruleDeclareClause EOF
            {
             newCompositeNode(grammarAccess.getDeclareClauseRule()); 
            pushFollow(FOLLOW_ruleDeclareClause_in_entryRuleDeclareClause9028);
            iv_ruleDeclareClause=ruleDeclareClause();

            state._fsp--;

             current =iv_ruleDeclareClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclareClause9038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclareClause"


    // $ANTLR start "ruleDeclareClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3630:1: ruleDeclareClause returns [EObject current=null] : (otherlv_0= '%DECLARE' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) ;
    public final EObject ruleDeclareClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3633:28: ( (otherlv_0= '%DECLARE' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3634:1: (otherlv_0= '%DECLARE' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3634:1: (otherlv_0= '%DECLARE' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3634:3: otherlv_0= '%DECLARE' ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleDeclareClause9075); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclareClauseAccess().getDECLAREKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3638:1: ( (lv_name_1_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3639:1: (lv_name_1_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3639:1: (lv_name_1_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3640:3: lv_name_1_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDeclareClauseAccess().getNameAliasParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDeclareClause9096);
            lv_name_1_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeclareClauseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeclareClause9107); 
             
                newLeafNode(this_STRING_2, grammarAccess.getDeclareClauseAccess().getSTRINGTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclareClause"


    // $ANTLR start "entryRuleDefineClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3668:1: entryRuleDefineClause returns [EObject current=null] : iv_ruleDefineClause= ruleDefineClause EOF ;
    public final EObject entryRuleDefineClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3669:2: (iv_ruleDefineClause= ruleDefineClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3670:2: iv_ruleDefineClause= ruleDefineClause EOF
            {
             newCompositeNode(grammarAccess.getDefineClauseRule()); 
            pushFollow(FOLLOW_ruleDefineClause_in_entryRuleDefineClause9142);
            iv_ruleDefineClause=ruleDefineClause();

            state._fsp--;

             current =iv_ruleDefineClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineClause9152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineClause"


    // $ANTLR start "ruleDefineClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3677:1: ruleDefineClause returns [EObject current=null] : (otherlv_0= 'DEFINE' ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause ) ;
    public final EObject ruleDefineClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3680:28: ( (otherlv_0= 'DEFINE' ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3681:1: (otherlv_0= 'DEFINE' ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3681:1: (otherlv_0= 'DEFINE' ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3681:3: otherlv_0= 'DEFINE' ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleDefineClause9189); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineClauseAccess().getDEFINEKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3685:1: ( (lv_name_1_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3686:1: (lv_name_1_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3686:1: (lv_name_1_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3687:3: lv_name_1_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDefineClauseAccess().getNameAliasParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDefineClause9210);
            lv_name_1_0=ruleAlias();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefineClauseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Alias");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

             
                    newCompositeNode(grammarAccess.getDefineClauseAccess().getFuncClauseParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleFuncClause_in_ruleDefineClause9226);
            ruleFuncClause();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineClause"


    // $ANTLR start "entryRuleLoadUsing"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3719:1: entryRuleLoadUsing returns [String current=null] : iv_ruleLoadUsing= ruleLoadUsing EOF ;
    public final String entryRuleLoadUsing() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLoadUsing = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3720:2: (iv_ruleLoadUsing= ruleLoadUsing EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3721:2: iv_ruleLoadUsing= ruleLoadUsing EOF
            {
             newCompositeNode(grammarAccess.getLoadUsingRule()); 
            pushFollow(FOLLOW_ruleLoadUsing_in_entryRuleLoadUsing9262);
            iv_ruleLoadUsing=ruleLoadUsing();

            state._fsp--;

             current =iv_ruleLoadUsing.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadUsing9273); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadUsing"


    // $ANTLR start "ruleLoadUsing"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3728:1: ruleLoadUsing returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'USING' this_FuncClause_1= ruleFuncClause ) ;
    public final AntlrDatatypeRuleToken ruleLoadUsing() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FuncClause_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3731:28: ( (kw= 'USING' this_FuncClause_1= ruleFuncClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3732:1: (kw= 'USING' this_FuncClause_1= ruleFuncClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3732:1: (kw= 'USING' this_FuncClause_1= ruleFuncClause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3733:2: kw= 'USING' this_FuncClause_1= ruleFuncClause
            {
            kw=(Token)match(input,26,FOLLOW_26_in_ruleLoadUsing9311); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLoadUsingAccess().getUSINGKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getLoadUsingAccess().getFuncClauseParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFuncClause_in_ruleLoadUsing9333);
            this_FuncClause_1=ruleFuncClause();

            state._fsp--;


            		current.merge(this_FuncClause_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadUsing"


    // $ANTLR start "entryRuleFuncClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3757:1: entryRuleFuncClause returns [String current=null] : iv_ruleFuncClause= ruleFuncClause EOF ;
    public final String entryRuleFuncClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFuncClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3758:2: (iv_ruleFuncClause= ruleFuncClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3759:2: iv_ruleFuncClause= ruleFuncClause EOF
            {
             newCompositeNode(grammarAccess.getFuncClauseRule()); 
            pushFollow(FOLLOW_ruleFuncClause_in_entryRuleFuncClause9379);
            iv_ruleFuncClause=ruleFuncClause();

            state._fsp--;

             current =iv_ruleFuncClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncClause9390); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncClause"


    // $ANTLR start "ruleFuncClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3766:1: ruleFuncClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FuncName_0= ruleFuncName kw= '(' (this_STRING_2= RULE_STRING )? (kw= ',' this_STRING_4= RULE_STRING )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFuncClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        Token this_STRING_4=null;
        AntlrDatatypeRuleToken this_FuncName_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3769:28: ( (this_FuncName_0= ruleFuncName kw= '(' (this_STRING_2= RULE_STRING )? (kw= ',' this_STRING_4= RULE_STRING )* kw= ')' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3770:1: (this_FuncName_0= ruleFuncName kw= '(' (this_STRING_2= RULE_STRING )? (kw= ',' this_STRING_4= RULE_STRING )* kw= ')' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3770:1: (this_FuncName_0= ruleFuncName kw= '(' (this_STRING_2= RULE_STRING )? (kw= ',' this_STRING_4= RULE_STRING )* kw= ')' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3771:5: this_FuncName_0= ruleFuncName kw= '(' (this_STRING_2= RULE_STRING )? (kw= ',' this_STRING_4= RULE_STRING )* kw= ')'
            {
             
                    newCompositeNode(grammarAccess.getFuncClauseAccess().getFuncNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFuncName_in_ruleFuncClause9437);
            this_FuncName_0=ruleFuncName();

            state._fsp--;


            		current.merge(this_FuncName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,46,FOLLOW_46_in_ruleFuncClause9455); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFuncClauseAccess().getLeftParenthesisKeyword_1()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3787:1: (this_STRING_2= RULE_STRING )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3787:6: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFuncClause9471); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getFuncClauseAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3794:3: (kw= ',' this_STRING_4= RULE_STRING )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==41) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3795:2: kw= ',' this_STRING_4= RULE_STRING
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFuncClause9492); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFuncClauseAccess().getCommaKeyword_3_0()); 
            	        
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFuncClause9507); 

            	    		current.merge(this_STRING_4);
            	        
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getFuncClauseAccess().getSTRINGTerminalRuleCall_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            kw=(Token)match(input,47,FOLLOW_47_in_ruleFuncClause9527); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFuncClauseAccess().getRightParenthesisKeyword_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncClause"


    // $ANTLR start "entryRuleFuncName"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3821:1: entryRuleFuncName returns [String current=null] : iv_ruleFuncName= ruleFuncName EOF ;
    public final String entryRuleFuncName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFuncName = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3822:2: (iv_ruleFuncName= ruleFuncName EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3823:2: iv_ruleFuncName= ruleFuncName EOF
            {
             newCompositeNode(grammarAccess.getFuncNameRule()); 
            pushFollow(FOLLOW_ruleFuncName_in_entryRuleFuncName9568);
            iv_ruleFuncName=ruleFuncName();

            state._fsp--;

             current =iv_ruleFuncName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncName9579); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncName"


    // $ANTLR start "ruleFuncName"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3830:1: ruleFuncName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= '.' | kw= '$' )+ ;
    public final AntlrDatatypeRuleToken ruleFuncName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3833:28: ( (this_ID_0= RULE_ID | kw= '.' | kw= '$' )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3834:1: (this_ID_0= RULE_ID | kw= '.' | kw= '$' )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3834:1: (this_ID_0= RULE_ID | kw= '.' | kw= '$' )+
            int cnt62=0;
            loop62:
            do {
                int alt62=4;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt62=1;
                    }
                    break;
                case 56:
                    {
                    alt62=2;
                    }
                    break;
                case 67:
                    {
                    alt62=3;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3834:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuncName9619); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getFuncNameAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3843:2: kw= '.'
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_ruleFuncName9643); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFuncNameAccess().getFullStopKeyword_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3850:2: kw= '$'
            	    {
            	    kw=(Token)match(input,67,FOLLOW_67_in_ruleFuncName9662); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFuncNameAccess().getDollarSignKeyword_2()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncName"


    // $ANTLR start "entryRulePathClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3863:1: entryRulePathClause returns [String current=null] : iv_rulePathClause= rulePathClause EOF ;
    public final String entryRulePathClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3864:2: (iv_rulePathClause= rulePathClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3865:2: iv_rulePathClause= rulePathClause EOF
            {
             newCompositeNode(grammarAccess.getPathClauseRule()); 
            pushFollow(FOLLOW_rulePathClause_in_entryRulePathClause9704);
            iv_rulePathClause=rulePathClause();

            state._fsp--;

             current =iv_rulePathClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathClause9715); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathClause"


    // $ANTLR start "rulePathClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3872:1: rulePathClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ALL' | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= '.' | kw= '$' | kw= '/' | kw= '\\\\' | kw= '-' )+ ;
    public final AntlrDatatypeRuleToken rulePathClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_scalar_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3875:28: ( (kw= 'ALL' | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= '.' | kw= '$' | kw= '/' | kw= '\\\\' | kw= '-' )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3876:1: (kw= 'ALL' | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= '.' | kw= '$' | kw= '/' | kw= '\\\\' | kw= '-' )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3876:1: (kw= 'ALL' | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= '.' | kw= '$' | kw= '/' | kw= '\\\\' | kw= '-' )+
            int cnt63=0;
            loop63:
            do {
                int alt63=9;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3877:2: kw= 'ALL'
            	    {
            	    kw=(Token)match(input,68,FOLLOW_68_in_rulePathClause9753); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getALLKeyword_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3884:5: this_scalar_1= rulescalar
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPathClauseAccess().getScalarParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_rulescalar_in_rulePathClause9781);
            	    this_scalar_1=rulescalar();

            	    state._fsp--;


            	    		current.merge(this_scalar_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3895:10: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathClause9807); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPathClauseAccess().getIDTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3904:2: kw= '.'
            	    {
            	    kw=(Token)match(input,56,FOLLOW_56_in_rulePathClause9831); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getFullStopKeyword_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3911:2: kw= '$'
            	    {
            	    kw=(Token)match(input,67,FOLLOW_67_in_rulePathClause9850); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getDollarSignKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3918:2: kw= '/'
            	    {
            	    kw=(Token)match(input,69,FOLLOW_69_in_rulePathClause9869); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getSolidusKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3925:2: kw= '\\\\'
            	    {
            	    kw=(Token)match(input,70,FOLLOW_70_in_rulePathClause9888); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getReverseSolidusKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3932:2: kw= '-'
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_rulePathClause9907); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getHyphenMinusKeyword_7()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathClause"


    // $ANTLR start "entryRuleAsClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3945:1: entryRuleAsClause returns [String current=null] : iv_ruleAsClause= ruleAsClause EOF ;
    public final String entryRuleAsClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAsClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3946:2: (iv_ruleAsClause= ruleAsClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3947:2: iv_ruleAsClause= ruleAsClause EOF
            {
             newCompositeNode(grammarAccess.getAsClauseRule()); 
            pushFollow(FOLLOW_ruleAsClause_in_entryRuleAsClause9949);
            iv_ruleAsClause=ruleAsClause();

            state._fsp--;

             current =iv_ruleAsClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsClause9960); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsClause"


    // $ANTLR start "ruleAsClause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3954:1: ruleAsClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'AS' (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) ) ;
    public final AntlrDatatypeRuleToken ruleAsClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasDef_1 = null;

        AntlrDatatypeRuleToken this_AliasDefList_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3957:28: ( (kw= 'AS' (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3958:1: (kw= 'AS' (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3958:1: (kw= 'AS' (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3959:2: kw= 'AS' (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList )
            {
            kw=(Token)match(input,61,FOLLOW_61_in_ruleAsClause9998); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsClauseAccess().getASKeyword_0()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3964:1: (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==46) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3965:5: this_AliasDef_1= ruleAliasDef
                    {
                     
                            newCompositeNode(grammarAccess.getAsClauseAccess().getAliasDefParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleAliasDef_in_ruleAsClause10021);
                    this_AliasDef_1=ruleAliasDef();

                    state._fsp--;


                    		current.merge(this_AliasDef_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3977:5: this_AliasDefList_2= ruleAliasDefList
                    {
                     
                            newCompositeNode(grammarAccess.getAsClauseAccess().getAliasDefListParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAliasDefList_in_ruleAsClause10054);
                    this_AliasDefList_2=ruleAliasDefList();

                    state._fsp--;


                    		current.merge(this_AliasDefList_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsClause"


    // $ANTLR start "entryRuleAliasDef"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3995:1: entryRuleAliasDef returns [String current=null] : iv_ruleAliasDef= ruleAliasDef EOF ;
    public final String entryRuleAliasDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDef = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3996:2: (iv_ruleAliasDef= ruleAliasDef EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:3997:2: iv_ruleAliasDef= ruleAliasDef EOF
            {
             newCompositeNode(grammarAccess.getAliasDefRule()); 
            pushFollow(FOLLOW_ruleAliasDef_in_entryRuleAliasDef10101);
            iv_ruleAliasDef=ruleAliasDef();

            state._fsp--;

             current =iv_ruleAliasDef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDef10112); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasDef"


    // $ANTLR start "ruleAliasDef"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4004:1: ruleAliasDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Alias_0= ruleAlias (kw= ':' this_Type_2= ruleType )? ) ;
    public final AntlrDatatypeRuleToken ruleAliasDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Alias_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4007:28: ( (this_Alias_0= ruleAlias (kw= ':' this_Type_2= ruleType )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4008:1: (this_Alias_0= ruleAlias (kw= ':' this_Type_2= ruleType )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4008:1: (this_Alias_0= ruleAlias (kw= ':' this_Type_2= ruleType )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4009:5: this_Alias_0= ruleAlias (kw= ':' this_Type_2= ruleType )?
            {
             
                    newCompositeNode(grammarAccess.getAliasDefAccess().getAliasParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAlias_in_ruleAliasDef10159);
            this_Alias_0=ruleAlias();

            state._fsp--;


            		current.merge(this_Alias_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4019:1: (kw= ':' this_Type_2= ruleType )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==51) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4020:2: kw= ':' this_Type_2= ruleType
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleAliasDef10178); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasDefAccess().getColonKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getAliasDefAccess().getTypeParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAliasDef10200);
                    this_Type_2=ruleType();

                    state._fsp--;


                    		current.merge(this_Type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasDef"


    // $ANTLR start "entryRuleAliasDefList"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4044:1: entryRuleAliasDefList returns [String current=null] : iv_ruleAliasDefList= ruleAliasDefList EOF ;
    public final String entryRuleAliasDefList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDefList = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4045:2: (iv_ruleAliasDefList= ruleAliasDefList EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4046:2: iv_ruleAliasDefList= ruleAliasDefList EOF
            {
             newCompositeNode(grammarAccess.getAliasDefListRule()); 
            pushFollow(FOLLOW_ruleAliasDefList_in_entryRuleAliasDefList10248);
            iv_ruleAliasDefList=ruleAliasDefList();

            state._fsp--;

             current =iv_ruleAliasDefList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDefList10259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasDefList"


    // $ANTLR start "ruleAliasDefList"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4053:1: ruleAliasDefList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_AliasDef_1= ruleAliasDef (kw= ',' this_AliasDef_3= ruleAliasDef )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleAliasDefList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasDef_1 = null;

        AntlrDatatypeRuleToken this_AliasDef_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4056:28: ( (kw= '(' this_AliasDef_1= ruleAliasDef (kw= ',' this_AliasDef_3= ruleAliasDef )* kw= ')' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4057:1: (kw= '(' this_AliasDef_1= ruleAliasDef (kw= ',' this_AliasDef_3= ruleAliasDef )* kw= ')' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4057:1: (kw= '(' this_AliasDef_1= ruleAliasDef (kw= ',' this_AliasDef_3= ruleAliasDef )* kw= ')' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4058:2: kw= '(' this_AliasDef_1= ruleAliasDef (kw= ',' this_AliasDef_3= ruleAliasDef )* kw= ')'
            {
            kw=(Token)match(input,46,FOLLOW_46_in_ruleAliasDefList10297); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAliasDefListAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getAliasDefListAccess().getAliasDefParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAliasDef_in_ruleAliasDefList10319);
            this_AliasDef_1=ruleAliasDef();

            state._fsp--;


            		current.merge(this_AliasDef_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4074:1: (kw= ',' this_AliasDef_3= ruleAliasDef )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==41) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4075:2: kw= ',' this_AliasDef_3= ruleAliasDef
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleAliasDefList10338); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getAliasDefListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getAliasDefListAccess().getAliasDefParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleAliasDef_in_ruleAliasDefList10360);
            	    this_AliasDef_3=ruleAliasDef();

            	    state._fsp--;


            	    		current.merge(this_AliasDef_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            kw=(Token)match(input,47,FOLLOW_47_in_ruleAliasDefList10380); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAliasDefListAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAliasDefList"


    // $ANTLR start "entryRuleIDENTIFIER"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4105:1: entryRuleIDENTIFIER returns [String current=null] : iv_ruleIDENTIFIER= ruleIDENTIFIER EOF ;
    public final String entryRuleIDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDENTIFIER = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4106:2: (iv_ruleIDENTIFIER= ruleIDENTIFIER EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4107:2: iv_ruleIDENTIFIER= ruleIDENTIFIER EOF
            {
             newCompositeNode(grammarAccess.getIDENTIFIERRule()); 
            pushFollow(FOLLOW_ruleIDENTIFIER_in_entryRuleIDENTIFIER10421);
            iv_ruleIDENTIFIER=ruleIDENTIFIER();

            state._fsp--;

             current =iv_ruleIDENTIFIER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDENTIFIER10432); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDENTIFIER"


    // $ANTLR start "ruleIDENTIFIER"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4114:1: ruleIDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4117:28: (this_ID_0= RULE_ID )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4118:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDENTIFIER10471); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getIDENTIFIERAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDENTIFIER"


    // $ANTLR start "entryRuleFieldDef"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4133:1: entryRuleFieldDef returns [String current=null] : iv_ruleFieldDef= ruleFieldDef EOF ;
    public final String entryRuleFieldDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldDef = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4134:2: (iv_ruleFieldDef= ruleFieldDef EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4135:2: iv_ruleFieldDef= ruleFieldDef EOF
            {
             newCompositeNode(grammarAccess.getFieldDefRule()); 
            pushFollow(FOLLOW_ruleFieldDef_in_entryRuleFieldDef10516);
            iv_ruleFieldDef=ruleFieldDef();

            state._fsp--;

             current =iv_ruleFieldDef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldDef10527); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDef"


    // $ANTLR start "ruleFieldDef"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4142:1: ruleFieldDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ':' this_Type_2= ruleType )? ) ;
    public final AntlrDatatypeRuleToken ruleFieldDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4145:28: ( (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ':' this_Type_2= ruleType )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4146:1: (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ':' this_Type_2= ruleType )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4146:1: (this_IDENTIFIER_0= ruleIDENTIFIER (kw= ':' this_Type_2= ruleType )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4147:5: this_IDENTIFIER_0= ruleIDENTIFIER (kw= ':' this_Type_2= ruleType )?
            {
             
                    newCompositeNode(grammarAccess.getFieldDefAccess().getIDENTIFIERParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleFieldDef10574);
            this_IDENTIFIER_0=ruleIDENTIFIER();

            state._fsp--;


            		current.merge(this_IDENTIFIER_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4157:1: (kw= ':' this_Type_2= ruleType )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4158:2: kw= ':' this_Type_2= ruleType
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleFieldDef10593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFieldDefAccess().getColonKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFieldDefAccess().getTypeParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleFieldDef10615);
                    this_Type_2=ruleType();

                    state._fsp--;


                    		current.merge(this_Type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDef"


    // $ANTLR start "entryRuleFieldFefList"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4182:1: entryRuleFieldFefList returns [String current=null] : iv_ruleFieldFefList= ruleFieldFefList EOF ;
    public final String entryRuleFieldFefList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldFefList = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4183:2: (iv_ruleFieldFefList= ruleFieldFefList EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4184:2: iv_ruleFieldFefList= ruleFieldFefList EOF
            {
             newCompositeNode(grammarAccess.getFieldFefListRule()); 
            pushFollow(FOLLOW_ruleFieldFefList_in_entryRuleFieldFefList10663);
            iv_ruleFieldFefList=ruleFieldFefList();

            state._fsp--;

             current =iv_ruleFieldFefList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldFefList10674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldFefList"


    // $ANTLR start "ruleFieldFefList"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4191:1: ruleFieldFefList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_FieldDef_1= ruleFieldDef (kw= ',' this_FieldDef_3= ruleFieldDef )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleFieldFefList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FieldDef_1 = null;

        AntlrDatatypeRuleToken this_FieldDef_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4194:28: ( (kw= '(' this_FieldDef_1= ruleFieldDef (kw= ',' this_FieldDef_3= ruleFieldDef )* kw= ')' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4195:1: (kw= '(' this_FieldDef_1= ruleFieldDef (kw= ',' this_FieldDef_3= ruleFieldDef )* kw= ')' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4195:1: (kw= '(' this_FieldDef_1= ruleFieldDef (kw= ',' this_FieldDef_3= ruleFieldDef )* kw= ')' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4196:2: kw= '(' this_FieldDef_1= ruleFieldDef (kw= ',' this_FieldDef_3= ruleFieldDef )* kw= ')'
            {
            kw=(Token)match(input,46,FOLLOW_46_in_ruleFieldFefList10712); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFieldFefListAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getFieldFefListAccess().getFieldDefParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFieldDef_in_ruleFieldFefList10734);
            this_FieldDef_1=ruleFieldDef();

            state._fsp--;


            		current.merge(this_FieldDef_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4212:1: (kw= ',' this_FieldDef_3= ruleFieldDef )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==41) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4213:2: kw= ',' this_FieldDef_3= ruleFieldDef
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFieldFefList10753); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFieldFefListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFieldFefListAccess().getFieldDefParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleFieldDef_in_ruleFieldFefList10775);
            	    this_FieldDef_3=ruleFieldDef();

            	    state._fsp--;


            	    		current.merge(this_FieldDef_3);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            kw=(Token)match(input,47,FOLLOW_47_in_ruleFieldFefList10795); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFieldFefListAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldFefList"


    // $ANTLR start "entryRuleType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4243:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4244:2: (iv_ruleType= ruleType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4245:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType10836);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType10847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4252:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleType_0 = null;

        AntlrDatatypeRuleToken this_TupleType_1 = null;

        AntlrDatatypeRuleToken this_MapType_2 = null;

        AntlrDatatypeRuleToken this_bag_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4255:28: ( (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4256:1: (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4256:1: (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type )
            int alt69=4;
            switch ( input.LA(1) ) {
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt69=1;
                }
                break;
            case 46:
            case 77:
                {
                alt69=2;
                }
                break;
            case 81:
                {
                alt69=3;
                }
                break;
            case 78:
            case 79:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4257:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType10894);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;


                    		current.merge(this_SimpleType_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4269:5: this_TupleType_1= ruleTupleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleType_in_ruleType10927);
                    this_TupleType_1=ruleTupleType();

                    state._fsp--;


                    		current.merge(this_TupleType_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4281:5: this_MapType_2= ruleMapType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMapTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMapType_in_ruleType10960);
                    this_MapType_2=ruleMapType();

                    state._fsp--;


                    		current.merge(this_MapType_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4293:5: this_bag_type_3= rulebag_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBag_typeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulebag_type_in_ruleType10993);
                    this_bag_type_3=rulebag_type();

                    state._fsp--;


                    		current.merge(this_bag_type_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSimpleType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4311:1: entryRuleSimpleType returns [String current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final String entryRuleSimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4312:2: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4313:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType11039);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType11050); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4320:1: ruleSimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'INT' | kw= 'LONG' | kw= 'FLOAT' | kw= 'DOUBLE' | kw= 'CHARARRAY' | kw= 'BYTEARRAY' ) ;
    public final AntlrDatatypeRuleToken ruleSimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4323:28: ( (kw= 'INT' | kw= 'LONG' | kw= 'FLOAT' | kw= 'DOUBLE' | kw= 'CHARARRAY' | kw= 'BYTEARRAY' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4324:1: (kw= 'INT' | kw= 'LONG' | kw= 'FLOAT' | kw= 'DOUBLE' | kw= 'CHARARRAY' | kw= 'BYTEARRAY' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4324:1: (kw= 'INT' | kw= 'LONG' | kw= 'FLOAT' | kw= 'DOUBLE' | kw= 'CHARARRAY' | kw= 'BYTEARRAY' )
            int alt70=6;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt70=1;
                }
                break;
            case 72:
                {
                alt70=2;
                }
                break;
            case 73:
                {
                alt70=3;
                }
                break;
            case 74:
                {
                alt70=4;
                }
                break;
            case 75:
                {
                alt70=5;
                }
                break;
            case 76:
                {
                alt70=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4325:2: kw= 'INT'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleSimpleType11088); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getINTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4332:2: kw= 'LONG'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleSimpleType11107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getLONGKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4339:2: kw= 'FLOAT'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleSimpleType11126); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getFLOATKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4346:2: kw= 'DOUBLE'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleSimpleType11145); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getDOUBLEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4353:2: kw= 'CHARARRAY'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleSimpleType11164); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getCHARARRAYKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4360:2: kw= 'BYTEARRAY'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleSimpleType11183); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getBYTEARRAYKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleTupleType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4373:1: entryRuleTupleType returns [String current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final String entryRuleTupleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTupleType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4374:2: (iv_ruleTupleType= ruleTupleType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4375:2: iv_ruleTupleType= ruleTupleType EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_ruleTupleType_in_entryRuleTupleType11224);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;

             current =iv_ruleTupleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleType11235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleType"


    // $ANTLR start "ruleTupleType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4382:1: ruleTupleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'TUPLE' )? this_AliasDefList_1= ruleAliasDefList ) ;
    public final AntlrDatatypeRuleToken ruleTupleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasDefList_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4385:28: ( ( (kw= 'TUPLE' )? this_AliasDefList_1= ruleAliasDefList ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4386:1: ( (kw= 'TUPLE' )? this_AliasDefList_1= ruleAliasDefList )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4386:1: ( (kw= 'TUPLE' )? this_AliasDefList_1= ruleAliasDefList )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4386:2: (kw= 'TUPLE' )? this_AliasDefList_1= ruleAliasDefList
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4386:2: (kw= 'TUPLE' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==77) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4387:2: kw= 'TUPLE'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleTupleType11274); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTupleTypeAccess().getTUPLEKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getTupleTypeAccess().getAliasDefListParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAliasDefList_in_ruleTupleType11298);
            this_AliasDefList_1=ruleAliasDefList();

            state._fsp--;


            		current.merge(this_AliasDefList_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleType"


    // $ANTLR start "entryRulebag_type"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4411:1: entryRulebag_type returns [String current=null] : iv_rulebag_type= rulebag_type EOF ;
    public final String entryRulebag_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebag_type = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4412:2: (iv_rulebag_type= rulebag_type EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4413:2: iv_rulebag_type= rulebag_type EOF
            {
             newCompositeNode(grammarAccess.getBag_typeRule()); 
            pushFollow(FOLLOW_rulebag_type_in_entryRulebag_type11344);
            iv_rulebag_type=rulebag_type();

            state._fsp--;

             current =iv_rulebag_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebag_type11355); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebag_type"


    // $ANTLR start "rulebag_type"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4420:1: rulebag_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'BAG' )? kw= '{' ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )? this_TupleType_4= ruleTupleType )? kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulebag_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_2 = null;

        AntlrDatatypeRuleToken this_TupleType_4 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4423:28: ( ( (kw= 'BAG' )? kw= '{' ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )? this_TupleType_4= ruleTupleType )? kw= '}' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4424:1: ( (kw= 'BAG' )? kw= '{' ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )? this_TupleType_4= ruleTupleType )? kw= '}' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4424:1: ( (kw= 'BAG' )? kw= '{' ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )? this_TupleType_4= ruleTupleType )? kw= '}' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4424:2: (kw= 'BAG' )? kw= '{' ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )? this_TupleType_4= ruleTupleType )? kw= '}'
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4424:2: (kw= 'BAG' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==78) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4425:2: kw= 'BAG'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_rulebag_type11394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBag_typeAccess().getBAGKeyword_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,79,FOLLOW_79_in_rulebag_type11409); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBag_typeAccess().getLeftCurlyBracketKeyword_1()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4436:1: ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )? this_TupleType_4= ruleTupleType )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ID||LA74_0==46||LA74_0==77) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4436:2: (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )? this_TupleType_4= ruleTupleType
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4436:2: (this_IDENTIFIER_2= ruleIDENTIFIER kw= ':' )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_ID) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4437:5: this_IDENTIFIER_2= ruleIDENTIFIER kw= ':'
                            {
                             
                                    newCompositeNode(grammarAccess.getBag_typeAccess().getIDENTIFIERParserRuleCall_2_0_0()); 
                                
                            pushFollow(FOLLOW_ruleIDENTIFIER_in_rulebag_type11433);
                            this_IDENTIFIER_2=ruleIDENTIFIER();

                            state._fsp--;


                            		current.merge(this_IDENTIFIER_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            kw=(Token)match(input,51,FOLLOW_51_in_rulebag_type11451); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBag_typeAccess().getColonKeyword_2_0_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getBag_typeAccess().getTupleTypeParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleType_in_rulebag_type11475);
                    this_TupleType_4=ruleTupleType();

                    state._fsp--;


                    		current.merge(this_TupleType_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,80,FOLLOW_80_in_rulebag_type11495); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBag_typeAccess().getRightCurlyBracketKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebag_type"


    // $ANTLR start "entryRuleMapType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4478:1: entryRuleMapType returns [String current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final String entryRuleMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4479:2: (iv_ruleMapType= ruleMapType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4480:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType11536);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType11547); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4487:1: ruleMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'MAP[]' ;
    public final AntlrDatatypeRuleToken ruleMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4490:28: (kw= 'MAP[]' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4492:2: kw= 'MAP[]'
            {
            kw=(Token)match(input,81,FOLLOW_81_in_ruleMapType11584); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getMapTypeAccess().getMAPKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleSTR_OP_EQ"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4507:1: entryRuleSTR_OP_EQ returns [String current=null] : iv_ruleSTR_OP_EQ= ruleSTR_OP_EQ EOF ;
    public final String entryRuleSTR_OP_EQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_EQ = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4508:2: (iv_ruleSTR_OP_EQ= ruleSTR_OP_EQ EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4509:2: iv_ruleSTR_OP_EQ= ruleSTR_OP_EQ EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_EQRule()); 
            pushFollow(FOLLOW_ruleSTR_OP_EQ_in_entryRuleSTR_OP_EQ11626);
            iv_ruleSTR_OP_EQ=ruleSTR_OP_EQ();

            state._fsp--;

             current =iv_ruleSTR_OP_EQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_EQ11637); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTR_OP_EQ"


    // $ANTLR start "ruleSTR_OP_EQ"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4516:1: ruleSTR_OP_EQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EQ' ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_EQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4519:28: (kw= 'EQ' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4521:2: kw= 'EQ'
            {
            kw=(Token)match(input,82,FOLLOW_82_in_ruleSTR_OP_EQ11674); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTR_OP_EQAccess().getEQKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTR_OP_EQ"


    // $ANTLR start "entryRuleSTR_OP_GT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4534:1: entryRuleSTR_OP_GT returns [String current=null] : iv_ruleSTR_OP_GT= ruleSTR_OP_GT EOF ;
    public final String entryRuleSTR_OP_GT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_GT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4535:2: (iv_ruleSTR_OP_GT= ruleSTR_OP_GT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4536:2: iv_ruleSTR_OP_GT= ruleSTR_OP_GT EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_GTRule()); 
            pushFollow(FOLLOW_ruleSTR_OP_GT_in_entryRuleSTR_OP_GT11714);
            iv_ruleSTR_OP_GT=ruleSTR_OP_GT();

            state._fsp--;

             current =iv_ruleSTR_OP_GT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_GT11725); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTR_OP_GT"


    // $ANTLR start "ruleSTR_OP_GT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4543:1: ruleSTR_OP_GT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GT' ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_GT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4546:28: (kw= 'GT' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4548:2: kw= 'GT'
            {
            kw=(Token)match(input,83,FOLLOW_83_in_ruleSTR_OP_GT11762); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTR_OP_GTAccess().getGTKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTR_OP_GT"


    // $ANTLR start "entryRuleSTR_OP_LT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4561:1: entryRuleSTR_OP_LT returns [String current=null] : iv_ruleSTR_OP_LT= ruleSTR_OP_LT EOF ;
    public final String entryRuleSTR_OP_LT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_LT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4562:2: (iv_ruleSTR_OP_LT= ruleSTR_OP_LT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4563:2: iv_ruleSTR_OP_LT= ruleSTR_OP_LT EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_LTRule()); 
            pushFollow(FOLLOW_ruleSTR_OP_LT_in_entryRuleSTR_OP_LT11802);
            iv_ruleSTR_OP_LT=ruleSTR_OP_LT();

            state._fsp--;

             current =iv_ruleSTR_OP_LT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_LT11813); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTR_OP_LT"


    // $ANTLR start "ruleSTR_OP_LT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4570:1: ruleSTR_OP_LT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LT' ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_LT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4573:28: (kw= 'LT' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4575:2: kw= 'LT'
            {
            kw=(Token)match(input,84,FOLLOW_84_in_ruleSTR_OP_LT11850); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTR_OP_LTAccess().getLTKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTR_OP_LT"


    // $ANTLR start "entryRuleSTR_OP_GTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4588:1: entryRuleSTR_OP_GTE returns [String current=null] : iv_ruleSTR_OP_GTE= ruleSTR_OP_GTE EOF ;
    public final String entryRuleSTR_OP_GTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_GTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4589:2: (iv_ruleSTR_OP_GTE= ruleSTR_OP_GTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4590:2: iv_ruleSTR_OP_GTE= ruleSTR_OP_GTE EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_GTERule()); 
            pushFollow(FOLLOW_ruleSTR_OP_GTE_in_entryRuleSTR_OP_GTE11890);
            iv_ruleSTR_OP_GTE=ruleSTR_OP_GTE();

            state._fsp--;

             current =iv_ruleSTR_OP_GTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_GTE11901); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTR_OP_GTE"


    // $ANTLR start "ruleSTR_OP_GTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4597:1: ruleSTR_OP_GTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GTE' ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_GTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4600:28: (kw= 'GTE' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4602:2: kw= 'GTE'
            {
            kw=(Token)match(input,85,FOLLOW_85_in_ruleSTR_OP_GTE11938); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTR_OP_GTEAccess().getGTEKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTR_OP_GTE"


    // $ANTLR start "entryRuleSTR_OP_LTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4615:1: entryRuleSTR_OP_LTE returns [String current=null] : iv_ruleSTR_OP_LTE= ruleSTR_OP_LTE EOF ;
    public final String entryRuleSTR_OP_LTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_LTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4616:2: (iv_ruleSTR_OP_LTE= ruleSTR_OP_LTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4617:2: iv_ruleSTR_OP_LTE= ruleSTR_OP_LTE EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_LTERule()); 
            pushFollow(FOLLOW_ruleSTR_OP_LTE_in_entryRuleSTR_OP_LTE11978);
            iv_ruleSTR_OP_LTE=ruleSTR_OP_LTE();

            state._fsp--;

             current =iv_ruleSTR_OP_LTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_LTE11989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTR_OP_LTE"


    // $ANTLR start "ruleSTR_OP_LTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4624:1: ruleSTR_OP_LTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LTE' ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_LTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4627:28: (kw= 'LTE' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4629:2: kw= 'LTE'
            {
            kw=(Token)match(input,86,FOLLOW_86_in_ruleSTR_OP_LTE12026); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTR_OP_LTEAccess().getLTEKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTR_OP_LTE"


    // $ANTLR start "entryRuleSTR_OP_NE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4642:1: entryRuleSTR_OP_NE returns [String current=null] : iv_ruleSTR_OP_NE= ruleSTR_OP_NE EOF ;
    public final String entryRuleSTR_OP_NE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_NE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4643:2: (iv_ruleSTR_OP_NE= ruleSTR_OP_NE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4644:2: iv_ruleSTR_OP_NE= ruleSTR_OP_NE EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_NERule()); 
            pushFollow(FOLLOW_ruleSTR_OP_NE_in_entryRuleSTR_OP_NE12066);
            iv_ruleSTR_OP_NE=ruleSTR_OP_NE();

            state._fsp--;

             current =iv_ruleSTR_OP_NE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_NE12077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTR_OP_NE"


    // $ANTLR start "ruleSTR_OP_NE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4651:1: ruleSTR_OP_NE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'NEQ' ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_NE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4654:28: (kw= 'NEQ' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4656:2: kw= 'NEQ'
            {
            kw=(Token)match(input,87,FOLLOW_87_in_ruleSTR_OP_NE12114); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTR_OP_NEAccess().getNEQKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTR_OP_NE"


    // $ANTLR start "entryRuleNUM_OP_EQ"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4671:1: entryRuleNUM_OP_EQ returns [String current=null] : iv_ruleNUM_OP_EQ= ruleNUM_OP_EQ EOF ;
    public final String entryRuleNUM_OP_EQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_EQ = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4672:2: (iv_ruleNUM_OP_EQ= ruleNUM_OP_EQ EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4673:2: iv_ruleNUM_OP_EQ= ruleNUM_OP_EQ EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_EQRule()); 
            pushFollow(FOLLOW_ruleNUM_OP_EQ_in_entryRuleNUM_OP_EQ12156);
            iv_ruleNUM_OP_EQ=ruleNUM_OP_EQ();

            state._fsp--;

             current =iv_ruleNUM_OP_EQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_EQ12167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUM_OP_EQ"


    // $ANTLR start "ruleNUM_OP_EQ"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4680:1: ruleNUM_OP_EQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '==' ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_EQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4683:28: (kw= '==' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4685:2: kw= '=='
            {
            kw=(Token)match(input,88,FOLLOW_88_in_ruleNUM_OP_EQ12204); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNUM_OP_EQAccess().getEqualsSignEqualsSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUM_OP_EQ"


    // $ANTLR start "entryRuleNUM_OP_LT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4698:1: entryRuleNUM_OP_LT returns [String current=null] : iv_ruleNUM_OP_LT= ruleNUM_OP_LT EOF ;
    public final String entryRuleNUM_OP_LT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_LT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4699:2: (iv_ruleNUM_OP_LT= ruleNUM_OP_LT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4700:2: iv_ruleNUM_OP_LT= ruleNUM_OP_LT EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_LTRule()); 
            pushFollow(FOLLOW_ruleNUM_OP_LT_in_entryRuleNUM_OP_LT12244);
            iv_ruleNUM_OP_LT=ruleNUM_OP_LT();

            state._fsp--;

             current =iv_ruleNUM_OP_LT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_LT12255); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUM_OP_LT"


    // $ANTLR start "ruleNUM_OP_LT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4707:1: ruleNUM_OP_LT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '<' ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_LT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4710:28: (kw= '<' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4712:2: kw= '<'
            {
            kw=(Token)match(input,89,FOLLOW_89_in_ruleNUM_OP_LT12292); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNUM_OP_LTAccess().getLessThanSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUM_OP_LT"


    // $ANTLR start "entryRuleNUM_OP_LTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4725:1: entryRuleNUM_OP_LTE returns [String current=null] : iv_ruleNUM_OP_LTE= ruleNUM_OP_LTE EOF ;
    public final String entryRuleNUM_OP_LTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_LTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4726:2: (iv_ruleNUM_OP_LTE= ruleNUM_OP_LTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4727:2: iv_ruleNUM_OP_LTE= ruleNUM_OP_LTE EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_LTERule()); 
            pushFollow(FOLLOW_ruleNUM_OP_LTE_in_entryRuleNUM_OP_LTE12332);
            iv_ruleNUM_OP_LTE=ruleNUM_OP_LTE();

            state._fsp--;

             current =iv_ruleNUM_OP_LTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_LTE12343); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUM_OP_LTE"


    // $ANTLR start "ruleNUM_OP_LTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4734:1: ruleNUM_OP_LTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '<=' ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_LTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4737:28: (kw= '<=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4739:2: kw= '<='
            {
            kw=(Token)match(input,90,FOLLOW_90_in_ruleNUM_OP_LTE12380); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNUM_OP_LTEAccess().getLessThanSignEqualsSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUM_OP_LTE"


    // $ANTLR start "entryRuleNUM_OP_GT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4752:1: entryRuleNUM_OP_GT returns [String current=null] : iv_ruleNUM_OP_GT= ruleNUM_OP_GT EOF ;
    public final String entryRuleNUM_OP_GT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_GT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4753:2: (iv_ruleNUM_OP_GT= ruleNUM_OP_GT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4754:2: iv_ruleNUM_OP_GT= ruleNUM_OP_GT EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_GTRule()); 
            pushFollow(FOLLOW_ruleNUM_OP_GT_in_entryRuleNUM_OP_GT12420);
            iv_ruleNUM_OP_GT=ruleNUM_OP_GT();

            state._fsp--;

             current =iv_ruleNUM_OP_GT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_GT12431); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUM_OP_GT"


    // $ANTLR start "ruleNUM_OP_GT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4761:1: ruleNUM_OP_GT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '>' ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_GT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4764:28: (kw= '>' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4766:2: kw= '>'
            {
            kw=(Token)match(input,91,FOLLOW_91_in_ruleNUM_OP_GT12468); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNUM_OP_GTAccess().getGreaterThanSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUM_OP_GT"


    // $ANTLR start "entryRuleNUM_OP_GTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4779:1: entryRuleNUM_OP_GTE returns [String current=null] : iv_ruleNUM_OP_GTE= ruleNUM_OP_GTE EOF ;
    public final String entryRuleNUM_OP_GTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_GTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4780:2: (iv_ruleNUM_OP_GTE= ruleNUM_OP_GTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4781:2: iv_ruleNUM_OP_GTE= ruleNUM_OP_GTE EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_GTERule()); 
            pushFollow(FOLLOW_ruleNUM_OP_GTE_in_entryRuleNUM_OP_GTE12508);
            iv_ruleNUM_OP_GTE=ruleNUM_OP_GTE();

            state._fsp--;

             current =iv_ruleNUM_OP_GTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_GTE12519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUM_OP_GTE"


    // $ANTLR start "ruleNUM_OP_GTE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4788:1: ruleNUM_OP_GTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '>=' ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_GTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4791:28: (kw= '>=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4793:2: kw= '>='
            {
            kw=(Token)match(input,92,FOLLOW_92_in_ruleNUM_OP_GTE12556); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNUM_OP_GTEAccess().getGreaterThanSignEqualsSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUM_OP_GTE"


    // $ANTLR start "entryRuleNUM_OP_NE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4806:1: entryRuleNUM_OP_NE returns [String current=null] : iv_ruleNUM_OP_NE= ruleNUM_OP_NE EOF ;
    public final String entryRuleNUM_OP_NE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_NE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4807:2: (iv_ruleNUM_OP_NE= ruleNUM_OP_NE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4808:2: iv_ruleNUM_OP_NE= ruleNUM_OP_NE EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_NERule()); 
            pushFollow(FOLLOW_ruleNUM_OP_NE_in_entryRuleNUM_OP_NE12596);
            iv_ruleNUM_OP_NE=ruleNUM_OP_NE();

            state._fsp--;

             current =iv_ruleNUM_OP_NE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_NE12607); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUM_OP_NE"


    // $ANTLR start "ruleNUM_OP_NE"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4815:1: ruleNUM_OP_NE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!=' ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_NE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4818:28: (kw= '!=' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4820:2: kw= '!='
            {
            kw=(Token)match(input,93,FOLLOW_93_in_ruleNUM_OP_NE12644); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getNUM_OP_NEAccess().getExclamationMarkEqualsSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUM_OP_NE"


    // $ANTLR start "entryRuleSEMI_COLON"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4833:1: entryRuleSEMI_COLON returns [String current=null] : iv_ruleSEMI_COLON= ruleSEMI_COLON EOF ;
    public final String entryRuleSEMI_COLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMI_COLON = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4834:2: (iv_ruleSEMI_COLON= ruleSEMI_COLON EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4835:2: iv_ruleSEMI_COLON= ruleSEMI_COLON EOF
            {
             newCompositeNode(grammarAccess.getSEMI_COLONRule()); 
            pushFollow(FOLLOW_ruleSEMI_COLON_in_entryRuleSEMI_COLON12684);
            iv_ruleSEMI_COLON=ruleSEMI_COLON();

            state._fsp--;

             current =iv_ruleSEMI_COLON.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEMI_COLON12695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSEMI_COLON"


    // $ANTLR start "ruleSEMI_COLON"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4842:1: ruleSEMI_COLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ';' ;
    public final AntlrDatatypeRuleToken ruleSEMI_COLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4845:28: (kw= ';' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4847:2: kw= ';'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleSEMI_COLON12732); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSEMI_COLONAccess().getSemicolonKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSEMI_COLON"


    // $ANTLR start "entryRulePOUND"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4872:1: entryRulePOUND returns [String current=null] : iv_rulePOUND= rulePOUND EOF ;
    public final String entryRulePOUND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOUND = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4873:2: (iv_rulePOUND= rulePOUND EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4874:2: iv_rulePOUND= rulePOUND EOF
            {
             newCompositeNode(grammarAccess.getPOUNDRule()); 
            pushFollow(FOLLOW_rulePOUND_in_entryRulePOUND12784);
            iv_rulePOUND=rulePOUND();

            state._fsp--;

             current =iv_rulePOUND.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOUND12795); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOUND"


    // $ANTLR start "rulePOUND"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4881:1: rulePOUND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#' ;
    public final AntlrDatatypeRuleToken rulePOUND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4884:28: (kw= '#' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4886:2: kw= '#'
            {
            kw=(Token)match(input,94,FOLLOW_94_in_rulePOUND12832); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPOUNDAccess().getNumberSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOUND"


    // $ANTLR start "entryRuleCOMMA"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4901:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4902:2: (iv_ruleCOMMA= ruleCOMMA EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4903:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
             newCompositeNode(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_ruleCOMMA_in_entryRuleCOMMA12874);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;

             current =iv_ruleCOMMA.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMMA12885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCOMMA"


    // $ANTLR start "ruleCOMMA"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4910:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ',' ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4913:28: (kw= ',' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4915:2: kw= ','
            {
            kw=(Token)match(input,41,FOLLOW_41_in_ruleCOMMA12922); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getCOMMAAccess().getCommaKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCOMMA"


    // $ANTLR start "entryRuleDIV"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4930:1: entryRuleDIV returns [String current=null] : iv_ruleDIV= ruleDIV EOF ;
    public final String entryRuleDIV() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIV = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4931:2: (iv_ruleDIV= ruleDIV EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4932:2: iv_ruleDIV= ruleDIV EOF
            {
             newCompositeNode(grammarAccess.getDIVRule()); 
            pushFollow(FOLLOW_ruleDIV_in_entryRuleDIV12964);
            iv_ruleDIV=ruleDIV();

            state._fsp--;

             current =iv_ruleDIV.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIV12975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIV"


    // $ANTLR start "ruleDIV"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4939:1: ruleDIV returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '/' ;
    public final AntlrDatatypeRuleToken ruleDIV() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4942:28: (kw= '/' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4944:2: kw= '/'
            {
            kw=(Token)match(input,69,FOLLOW_69_in_ruleDIV13012); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDIVAccess().getSolidusKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIV"


    // $ANTLR start "entryRulePERCENT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4957:1: entryRulePERCENT returns [String current=null] : iv_rulePERCENT= rulePERCENT EOF ;
    public final String entryRulePERCENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4958:2: (iv_rulePERCENT= rulePERCENT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4959:2: iv_rulePERCENT= rulePERCENT EOF
            {
             newCompositeNode(grammarAccess.getPERCENTRule()); 
            pushFollow(FOLLOW_rulePERCENT_in_entryRulePERCENT13052);
            iv_rulePERCENT=rulePERCENT();

            state._fsp--;

             current =iv_rulePERCENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENT13063); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePERCENT"


    // $ANTLR start "rulePERCENT"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4966:1: rulePERCENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '%' ;
    public final AntlrDatatypeRuleToken rulePERCENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4969:28: (kw= '%' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4971:2: kw= '%'
            {
            kw=(Token)match(input,95,FOLLOW_95_in_rulePERCENT13100); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPERCENTAccess().getPercentSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePERCENT"


    // $ANTLR start "entryRulePLUS"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4984:1: entryRulePLUS returns [String current=null] : iv_rulePLUS= rulePLUS EOF ;
    public final String entryRulePLUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLUS = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4985:2: (iv_rulePLUS= rulePLUS EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4986:2: iv_rulePLUS= rulePLUS EOF
            {
             newCompositeNode(grammarAccess.getPLUSRule()); 
            pushFollow(FOLLOW_rulePLUS_in_entryRulePLUS13140);
            iv_rulePLUS=rulePLUS();

            state._fsp--;

             current =iv_rulePLUS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLUS13151); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePLUS"


    // $ANTLR start "rulePLUS"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4993:1: rulePLUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulePLUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4996:28: (kw= '+' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:4998:2: kw= '+'
            {
            kw=(Token)match(input,52,FOLLOW_52_in_rulePLUS13188); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPLUSAccess().getPlusSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePLUS"


    // $ANTLR start "entryRuleMINUS"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5011:1: entryRuleMINUS returns [String current=null] : iv_ruleMINUS= ruleMINUS EOF ;
    public final String entryRuleMINUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMINUS = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5012:2: (iv_ruleMINUS= ruleMINUS EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5013:2: iv_ruleMINUS= ruleMINUS EOF
            {
             newCompositeNode(grammarAccess.getMINUSRule()); 
            pushFollow(FOLLOW_ruleMINUS_in_entryRuleMINUS13228);
            iv_ruleMINUS=ruleMINUS();

            state._fsp--;

             current =iv_ruleMINUS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMINUS13239); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMINUS"


    // $ANTLR start "ruleMINUS"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5020:1: ruleMINUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleMINUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5023:28: (kw= '-' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5025:2: kw= '-'
            {
            kw=(Token)match(input,58,FOLLOW_58_in_ruleMINUS13276); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getMINUSAccess().getHyphenMinusKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMINUS"


    // $ANTLR start "entryRuleSTAR"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5038:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5039:2: (iv_ruleSTAR= ruleSTAR EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5040:2: iv_ruleSTAR= ruleSTAR EOF
            {
             newCompositeNode(grammarAccess.getSTARRule()); 
            pushFollow(FOLLOW_ruleSTAR_in_entryRuleSTAR13316);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;

             current =iv_ruleSTAR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTAR13327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5047:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5050:28: (kw= '*' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5052:2: kw= '*'
            {
            kw=(Token)match(input,60,FOLLOW_60_in_ruleSTAR13364); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTAR"


    // $ANTLR start "entryRuleDOLLAR"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5067:1: entryRuleDOLLAR returns [String current=null] : iv_ruleDOLLAR= ruleDOLLAR EOF ;
    public final String entryRuleDOLLAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOLLAR = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5068:2: (iv_ruleDOLLAR= ruleDOLLAR EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5069:2: iv_ruleDOLLAR= ruleDOLLAR EOF
            {
             newCompositeNode(grammarAccess.getDOLLARRule()); 
            pushFollow(FOLLOW_ruleDOLLAR_in_entryRuleDOLLAR13406);
            iv_ruleDOLLAR=ruleDOLLAR();

            state._fsp--;

             current =iv_ruleDOLLAR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOLLAR13417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOLLAR"


    // $ANTLR start "ruleDOLLAR"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5076:1: ruleDOLLAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '$' ;
    public final AntlrDatatypeRuleToken ruleDOLLAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5079:28: (kw= '$' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5081:2: kw= '$'
            {
            kw=(Token)match(input,67,FOLLOW_67_in_ruleDOLLAR13454); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOLLARAccess().getDollarSignKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOLLAR"


    // $ANTLR start "entryRulegroup_type"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5094:1: entryRulegroup_type returns [String current=null] : iv_rulegroup_type= rulegroup_type EOF ;
    public final String entryRulegroup_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegroup_type = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5095:2: (iv_rulegroup_type= rulegroup_type EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5096:2: iv_rulegroup_type= rulegroup_type EOF
            {
             newCompositeNode(grammarAccess.getGroup_typeRule()); 
            pushFollow(FOLLOW_rulegroup_type_in_entryRulegroup_type13494);
            iv_rulegroup_type=rulegroup_type();

            state._fsp--;

             current =iv_rulegroup_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_type13505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_type"


    // $ANTLR start "rulegroup_type"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5103:1: rulegroup_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken rulegroup_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5106:28: (this_STRING_0= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5107:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulegroup_type13544); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getGroup_typeAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegroup_type"


    // $ANTLR start "entryRulegroup_item_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5122:1: entryRulegroup_item_list returns [EObject current=null] : iv_rulegroup_item_list= rulegroup_item_list EOF ;
    public final EObject entryRulegroup_item_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup_item_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5123:2: (iv_rulegroup_item_list= rulegroup_item_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5124:2: iv_rulegroup_item_list= rulegroup_item_list EOF
            {
             newCompositeNode(grammarAccess.getGroup_item_listRule()); 
            pushFollow(FOLLOW_rulegroup_item_list_in_entryRulegroup_item_list13588);
            iv_rulegroup_item_list=rulegroup_item_list();

            state._fsp--;

             current =iv_rulegroup_item_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_item_list13598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_item_list"


    // $ANTLR start "rulegroup_item_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5131:1: rulegroup_item_list returns [EObject current=null] : (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* ) ;
    public final EObject rulegroup_item_list() throws RecognitionException {
        EObject current = null;

        EObject this_group_item_0 = null;

        EObject lv_items_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5134:28: ( (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5135:1: (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5135:1: (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5136:5: this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getGroup_item_listAccess().getGroup_itemParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulegroup_item_in_rulegroup_item_list13645);
            this_group_item_0=rulegroup_item();

            state._fsp--;

             
                    current = this_group_item_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5144:1: ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==41) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5145:5: ruleCOMMA ( (lv_items_2_0= rulegroup_item ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getGroup_item_listAccess().getCOMMAParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCOMMA_in_rulegroup_item_list13661);
            	    ruleCOMMA();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5152:1: ( (lv_items_2_0= rulegroup_item ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5153:1: (lv_items_2_0= rulegroup_item )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5153:1: (lv_items_2_0= rulegroup_item )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5154:3: lv_items_2_0= rulegroup_item
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroup_item_listAccess().getItemsGroup_itemParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulegroup_item_in_rulegroup_item_list13681);
            	    lv_items_2_0=rulegroup_item();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroup_item_listRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"items",
            	            		lv_items_2_0, 
            	            		"group_item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegroup_item_list"


    // $ANTLR start "entryRuleorder_by_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5178:1: entryRuleorder_by_clause returns [String current=null] : iv_ruleorder_by_clause= ruleorder_by_clause EOF ;
    public final String entryRuleorder_by_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleorder_by_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5179:2: (iv_ruleorder_by_clause= ruleorder_by_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5180:2: iv_ruleorder_by_clause= ruleorder_by_clause EOF
            {
             newCompositeNode(grammarAccess.getOrder_by_clauseRule()); 
            pushFollow(FOLLOW_ruleorder_by_clause_in_entryRuleorder_by_clause13720);
            iv_ruleorder_by_clause=ruleorder_by_clause();

            state._fsp--;

             current =iv_ruleorder_by_clause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleorder_by_clause13731); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleorder_by_clause"


    // $ANTLR start "ruleorder_by_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5187:1: ruleorder_by_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_STAR_0= ruleSTAR (kw= 'ASC' | kw= 'DESC' )? ) | this_order_col_list_3= ruleorder_col_list ) ;
    public final AntlrDatatypeRuleToken ruleorder_by_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_STAR_0 = null;

        AntlrDatatypeRuleToken this_order_col_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5190:28: ( ( (this_STAR_0= ruleSTAR (kw= 'ASC' | kw= 'DESC' )? ) | this_order_col_list_3= ruleorder_col_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5191:1: ( (this_STAR_0= ruleSTAR (kw= 'ASC' | kw= 'DESC' )? ) | this_order_col_list_3= ruleorder_col_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5191:1: ( (this_STAR_0= ruleSTAR (kw= 'ASC' | kw= 'DESC' )? ) | this_order_col_list_3= ruleorder_col_list )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==60) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_ID||LA77_0==25||LA77_0==46||LA77_0==67) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5191:2: (this_STAR_0= ruleSTAR (kw= 'ASC' | kw= 'DESC' )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5191:2: (this_STAR_0= ruleSTAR (kw= 'ASC' | kw= 'DESC' )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5192:5: this_STAR_0= ruleSTAR (kw= 'ASC' | kw= 'DESC' )?
                    {
                     
                            newCompositeNode(grammarAccess.getOrder_by_clauseAccess().getSTARParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleSTAR_in_ruleorder_by_clause13779);
                    this_STAR_0=ruleSTAR();

                    state._fsp--;


                    		current.merge(this_STAR_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5202:1: (kw= 'ASC' | kw= 'DESC' )?
                    int alt76=3;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==96) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==97) ) {
                        alt76=2;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5203:2: kw= 'ASC'
                            {
                            kw=(Token)match(input,96,FOLLOW_96_in_ruleorder_by_clause13798); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_by_clauseAccess().getASCKeyword_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5210:2: kw= 'DESC'
                            {
                            kw=(Token)match(input,97,FOLLOW_97_in_ruleorder_by_clause13817); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_by_clauseAccess().getDESCKeyword_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5217:5: this_order_col_list_3= ruleorder_col_list
                    {
                     
                            newCompositeNode(grammarAccess.getOrder_by_clauseAccess().getOrder_col_listParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleorder_col_list_in_ruleorder_by_clause13848);
                    this_order_col_list_3=ruleorder_col_list();

                    state._fsp--;


                    		current.merge(this_order_col_list_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleorder_by_clause"


    // $ANTLR start "entryRuleorder_col_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5235:1: entryRuleorder_col_list returns [String current=null] : iv_ruleorder_col_list= ruleorder_col_list EOF ;
    public final String entryRuleorder_col_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleorder_col_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5236:2: (iv_ruleorder_col_list= ruleorder_col_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5237:2: iv_ruleorder_col_list= ruleorder_col_list EOF
            {
             newCompositeNode(grammarAccess.getOrder_col_listRule()); 
            pushFollow(FOLLOW_ruleorder_col_list_in_entryRuleorder_col_list13894);
            iv_ruleorder_col_list=ruleorder_col_list();

            state._fsp--;

             current =iv_ruleorder_col_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleorder_col_list13905); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleorder_col_list"


    // $ANTLR start "ruleorder_col_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5244:1: ruleorder_col_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_order_col_0= ruleorder_col (kw= ',' this_order_col_2= ruleorder_col )* ) ;
    public final AntlrDatatypeRuleToken ruleorder_col_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_order_col_0 = null;

        AntlrDatatypeRuleToken this_order_col_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5247:28: ( (this_order_col_0= ruleorder_col (kw= ',' this_order_col_2= ruleorder_col )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5248:1: (this_order_col_0= ruleorder_col (kw= ',' this_order_col_2= ruleorder_col )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5248:1: (this_order_col_0= ruleorder_col (kw= ',' this_order_col_2= ruleorder_col )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5249:5: this_order_col_0= ruleorder_col (kw= ',' this_order_col_2= ruleorder_col )*
            {
             
                    newCompositeNode(grammarAccess.getOrder_col_listAccess().getOrder_colParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleorder_col_in_ruleorder_col_list13952);
            this_order_col_0=ruleorder_col();

            state._fsp--;


            		current.merge(this_order_col_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5259:1: (kw= ',' this_order_col_2= ruleorder_col )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==41) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5260:2: kw= ',' this_order_col_2= ruleorder_col
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleorder_col_list13971); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getOrder_col_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getOrder_col_listAccess().getOrder_colParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleorder_col_in_ruleorder_col_list13993);
            	    this_order_col_2=ruleorder_col();

            	    state._fsp--;


            	    		current.merge(this_order_col_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleorder_col_list"


    // $ANTLR start "entryRuleorder_col"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5284:1: entryRuleorder_col returns [String current=null] : iv_ruleorder_col= ruleorder_col EOF ;
    public final String entryRuleorder_col() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleorder_col = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5285:2: (iv_ruleorder_col= ruleorder_col EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5286:2: iv_ruleorder_col= ruleorder_col EOF
            {
             newCompositeNode(grammarAccess.getOrder_colRule()); 
            pushFollow(FOLLOW_ruleorder_col_in_entryRuleorder_col14041);
            iv_ruleorder_col=ruleorder_col();

            state._fsp--;

             current =iv_ruleorder_col.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleorder_col14052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleorder_col"


    // $ANTLR start "ruleorder_col"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5293:1: ruleorder_col returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_col_ref_0= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? ) | (kw= '(' this_col_ref_4= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleorder_col() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_col_ref_0 = null;

        AntlrDatatypeRuleToken this_col_ref_4 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5296:28: ( ( (this_col_ref_0= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? ) | (kw= '(' this_col_ref_4= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? kw= ')' ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5297:1: ( (this_col_ref_0= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? ) | (kw= '(' this_col_ref_4= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? kw= ')' ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5297:1: ( (this_col_ref_0= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? ) | (kw= '(' this_col_ref_4= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? kw= ')' ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_ID||LA81_0==25||LA81_0==67) ) {
                alt81=1;
            }
            else if ( (LA81_0==46) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5297:2: (this_col_ref_0= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5297:2: (this_col_ref_0= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5298:5: this_col_ref_0= rulecol_ref (kw= 'ASC' | kw= 'DESC' )?
                    {
                     
                            newCompositeNode(grammarAccess.getOrder_colAccess().getCol_refParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulecol_ref_in_ruleorder_col14100);
                    this_col_ref_0=rulecol_ref();

                    state._fsp--;


                    		current.merge(this_col_ref_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5308:1: (kw= 'ASC' | kw= 'DESC' )?
                    int alt79=3;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==96) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==97) ) {
                        alt79=2;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5309:2: kw= 'ASC'
                            {
                            kw=(Token)match(input,96,FOLLOW_96_in_ruleorder_col14119); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getASCKeyword_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5316:2: kw= 'DESC'
                            {
                            kw=(Token)match(input,97,FOLLOW_97_in_ruleorder_col14138); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getDESCKeyword_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5322:6: (kw= '(' this_col_ref_4= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? kw= ')' )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5322:6: (kw= '(' this_col_ref_4= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? kw= ')' )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5323:2: kw= '(' this_col_ref_4= rulecol_ref (kw= 'ASC' | kw= 'DESC' )? kw= ')'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleorder_col14161); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrder_colAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getOrder_colAccess().getCol_refParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulecol_ref_in_ruleorder_col14183);
                    this_col_ref_4=rulecol_ref();

                    state._fsp--;


                    		current.merge(this_col_ref_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5339:1: (kw= 'ASC' | kw= 'DESC' )?
                    int alt80=3;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==96) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==97) ) {
                        alt80=2;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5340:2: kw= 'ASC'
                            {
                            kw=(Token)match(input,96,FOLLOW_96_in_ruleorder_col14202); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getASCKeyword_1_2_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5347:2: kw= 'DESC'
                            {
                            kw=(Token)match(input,97,FOLLOW_97_in_ruleorder_col14221); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getDESCKeyword_1_2_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,47,FOLLOW_47_in_ruleorder_col14236); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrder_colAccess().getRightParenthesisKeyword_1_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleorder_col"


    // $ANTLR start "entryRulepartition_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5366:1: entryRulepartition_clause returns [String current=null] : iv_rulepartition_clause= rulepartition_clause EOF ;
    public final String entryRulepartition_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepartition_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5367:2: (iv_rulepartition_clause= rulepartition_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5368:2: iv_rulepartition_clause= rulepartition_clause EOF
            {
             newCompositeNode(grammarAccess.getPartition_clauseRule()); 
            pushFollow(FOLLOW_rulepartition_clause_in_entryRulepartition_clause14278);
            iv_rulepartition_clause=rulepartition_clause();

            state._fsp--;

             current =iv_rulepartition_clause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepartition_clause14289); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepartition_clause"


    // $ANTLR start "rulepartition_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5375:1: rulepartition_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'PARTITION' kw= 'BY' this_FuncName_2= ruleFuncName ) ;
    public final AntlrDatatypeRuleToken rulepartition_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FuncName_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5378:28: ( (kw= 'PARTITION' kw= 'BY' this_FuncName_2= ruleFuncName ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5379:1: (kw= 'PARTITION' kw= 'BY' this_FuncName_2= ruleFuncName )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5379:1: (kw= 'PARTITION' kw= 'BY' this_FuncName_2= ruleFuncName )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5380:2: kw= 'PARTITION' kw= 'BY' this_FuncName_2= ruleFuncName
            {
            kw=(Token)match(input,98,FOLLOW_98_in_rulepartition_clause14327); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPartition_clauseAccess().getPARTITIONKeyword_0()); 
                
            kw=(Token)match(input,24,FOLLOW_24_in_rulepartition_clause14340); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPartition_clauseAccess().getBYKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getPartition_clauseAccess().getFuncNameParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleFuncName_in_rulepartition_clause14362);
            this_FuncName_2=ruleFuncName();

            state._fsp--;


            		current.merge(this_FuncName_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepartition_clause"


    // $ANTLR start "entryRulerel_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5410:1: entryRulerel_list returns [EObject current=null] : iv_rulerel_list= rulerel_list EOF ;
    public final EObject entryRulerel_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerel_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5411:2: (iv_rulerel_list= rulerel_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5412:2: iv_rulerel_list= rulerel_list EOF
            {
             newCompositeNode(grammarAccess.getRel_listRule()); 
            pushFollow(FOLLOW_rulerel_list_in_entryRulerel_list14407);
            iv_rulerel_list=rulerel_list();

            state._fsp--;

             current =iv_rulerel_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_list14417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerel_list"


    // $ANTLR start "rulerel_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5419:1: rulerel_list returns [EObject current=null] : ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= ',' ( (lv_type_2_0= ruleAliasType ) ) )* ) ;
    public final EObject rulerel_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5422:28: ( ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= ',' ( (lv_type_2_0= ruleAliasType ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5423:1: ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= ',' ( (lv_type_2_0= ruleAliasType ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5423:1: ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= ',' ( (lv_type_2_0= ruleAliasType ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5423:2: ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= ',' ( (lv_type_2_0= ruleAliasType ) ) )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5423:2: ( (lv_type_0_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5424:1: (lv_type_0_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5424:1: (lv_type_0_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5425:3: lv_type_0_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getRel_listAccess().getTypeAliasTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_rulerel_list14463);
            lv_type_0_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRel_listRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5441:2: (otherlv_1= ',' ( (lv_type_2_0= ruleAliasType ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==41) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5441:4: otherlv_1= ',' ( (lv_type_2_0= ruleAliasType ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_41_in_rulerel_list14476); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRel_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5445:1: ( (lv_type_2_0= ruleAliasType ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5446:1: (lv_type_2_0= ruleAliasType )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5446:1: (lv_type_2_0= ruleAliasType )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5447:3: lv_type_2_0= ruleAliasType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRel_listAccess().getTypeAliasTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAliasType_in_rulerel_list14497);
            	    lv_type_2_0=ruleAliasType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRel_listRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"type",
            	            		lv_type_2_0, 
            	            		"AliasType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerel_list"


    // $ANTLR start "entryRulejoin_type"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5471:1: entryRulejoin_type returns [String current=null] : iv_rulejoin_type= rulejoin_type EOF ;
    public final String entryRulejoin_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulejoin_type = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5472:2: (iv_rulejoin_type= rulejoin_type EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5473:2: iv_rulejoin_type= rulejoin_type EOF
            {
             newCompositeNode(grammarAccess.getJoin_typeRule()); 
            pushFollow(FOLLOW_rulejoin_type_in_entryRulejoin_type14536);
            iv_rulejoin_type=rulejoin_type();

            state._fsp--;

             current =iv_rulejoin_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_type14547); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejoin_type"


    // $ANTLR start "rulejoin_type"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5480:1: rulejoin_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken rulejoin_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5483:28: (this_STRING_0= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5484:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulejoin_type14586); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getJoin_typeAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejoin_type"


    // $ANTLR start "entryRulejoin_sub_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5499:1: entryRulejoin_sub_clause returns [EObject current=null] : iv_rulejoin_sub_clause= rulejoin_sub_clause EOF ;
    public final EObject entryRulejoin_sub_clause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_sub_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5500:2: (iv_rulejoin_sub_clause= rulejoin_sub_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5501:2: iv_rulejoin_sub_clause= rulejoin_sub_clause EOF
            {
             newCompositeNode(grammarAccess.getJoin_sub_clauseRule()); 
            pushFollow(FOLLOW_rulejoin_sub_clause_in_entryRulejoin_sub_clause14630);
            iv_rulejoin_sub_clause=rulejoin_sub_clause();

            state._fsp--;

             current =iv_rulejoin_sub_clause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_sub_clause14640); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejoin_sub_clause"


    // $ANTLR start "rulejoin_sub_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5508:1: rulejoin_sub_clause returns [EObject current=null] : (this_join_item_0= rulejoin_item (otherlv_1= 'LEFT' | otherlv_2= 'RIGHT' | otherlv_3= 'FULL' )? (otherlv_4= 'OUTER' )? (otherlv_5= ',' ( (lv_others_6_0= rulejoin_item ) ) )+ ) ;
    public final EObject rulejoin_sub_clause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_join_item_0 = null;

        EObject lv_others_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5511:28: ( (this_join_item_0= rulejoin_item (otherlv_1= 'LEFT' | otherlv_2= 'RIGHT' | otherlv_3= 'FULL' )? (otherlv_4= 'OUTER' )? (otherlv_5= ',' ( (lv_others_6_0= rulejoin_item ) ) )+ ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5512:1: (this_join_item_0= rulejoin_item (otherlv_1= 'LEFT' | otherlv_2= 'RIGHT' | otherlv_3= 'FULL' )? (otherlv_4= 'OUTER' )? (otherlv_5= ',' ( (lv_others_6_0= rulejoin_item ) ) )+ )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5512:1: (this_join_item_0= rulejoin_item (otherlv_1= 'LEFT' | otherlv_2= 'RIGHT' | otherlv_3= 'FULL' )? (otherlv_4= 'OUTER' )? (otherlv_5= ',' ( (lv_others_6_0= rulejoin_item ) ) )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5513:5: this_join_item_0= rulejoin_item (otherlv_1= 'LEFT' | otherlv_2= 'RIGHT' | otherlv_3= 'FULL' )? (otherlv_4= 'OUTER' )? (otherlv_5= ',' ( (lv_others_6_0= rulejoin_item ) ) )+
            {
             
                    newCompositeNode(grammarAccess.getJoin_sub_clauseAccess().getJoin_itemParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulejoin_item_in_rulejoin_sub_clause14687);
            this_join_item_0=rulejoin_item();

            state._fsp--;

             
                    current = this_join_item_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5521:1: (otherlv_1= 'LEFT' | otherlv_2= 'RIGHT' | otherlv_3= 'FULL' )?
            int alt83=4;
            switch ( input.LA(1) ) {
                case 99:
                    {
                    alt83=1;
                    }
                    break;
                case 100:
                    {
                    alt83=2;
                    }
                    break;
                case 101:
                    {
                    alt83=3;
                    }
                    break;
            }

            switch (alt83) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5521:3: otherlv_1= 'LEFT'
                    {
                    otherlv_1=(Token)match(input,99,FOLLOW_99_in_rulejoin_sub_clause14699); 

                        	newLeafNode(otherlv_1, grammarAccess.getJoin_sub_clauseAccess().getLEFTKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5526:7: otherlv_2= 'RIGHT'
                    {
                    otherlv_2=(Token)match(input,100,FOLLOW_100_in_rulejoin_sub_clause14717); 

                        	newLeafNode(otherlv_2, grammarAccess.getJoin_sub_clauseAccess().getRIGHTKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5531:7: otherlv_3= 'FULL'
                    {
                    otherlv_3=(Token)match(input,101,FOLLOW_101_in_rulejoin_sub_clause14735); 

                        	newLeafNode(otherlv_3, grammarAccess.getJoin_sub_clauseAccess().getFULLKeyword_1_2());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5535:3: (otherlv_4= 'OUTER' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==102) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5535:5: otherlv_4= 'OUTER'
                    {
                    otherlv_4=(Token)match(input,102,FOLLOW_102_in_rulejoin_sub_clause14750); 

                        	newLeafNode(otherlv_4, grammarAccess.getJoin_sub_clauseAccess().getOUTERKeyword_2());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5539:3: (otherlv_5= ',' ( (lv_others_6_0= rulejoin_item ) ) )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==41) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5539:5: otherlv_5= ',' ( (lv_others_6_0= rulejoin_item ) )
            	    {
            	    otherlv_5=(Token)match(input,41,FOLLOW_41_in_rulejoin_sub_clause14765); 

            	        	newLeafNode(otherlv_5, grammarAccess.getJoin_sub_clauseAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5543:1: ( (lv_others_6_0= rulejoin_item ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5544:1: (lv_others_6_0= rulejoin_item )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5544:1: (lv_others_6_0= rulejoin_item )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5545:3: lv_others_6_0= rulejoin_item
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoin_sub_clauseAccess().getOthersJoin_itemParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulejoin_item_in_rulejoin_sub_clause14786);
            	    lv_others_6_0=rulejoin_item();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJoin_sub_clauseRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"others",
            	            		lv_others_6_0, 
            	            		"join_item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejoin_sub_clause"


    // $ANTLR start "entryRulejoin_item"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5569:1: entryRulejoin_item returns [EObject current=null] : iv_rulejoin_item= rulejoin_item EOF ;
    public final EObject entryRulejoin_item() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_item = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5570:2: (iv_rulejoin_item= rulejoin_item EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5571:2: iv_rulejoin_item= rulejoin_item EOF
            {
             newCompositeNode(grammarAccess.getJoin_itemRule()); 
            pushFollow(FOLLOW_rulejoin_item_in_entryRulejoin_item14824);
            iv_rulejoin_item=rulejoin_item();

            state._fsp--;

             current =iv_rulejoin_item; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_item14834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejoin_item"


    // $ANTLR start "rulejoin_item"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5578:1: rulejoin_item returns [EObject current=null] : ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) ) ;
    public final EObject rulejoin_item() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5581:28: ( ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5582:1: ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5582:1: ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5582:2: ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5582:2: ( (lv_type_0_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5583:1: (lv_type_0_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5583:1: (lv_type_0_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5584:3: lv_type_0_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getJoin_itemAccess().getTypeAliasTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_rulejoin_item14880);
            lv_type_0_0=ruleAliasType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoin_itemRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"AliasType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5600:2: ( (lv_expressions_1_0= rulejoin_group_by_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5601:1: (lv_expressions_1_0= rulejoin_group_by_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5601:1: (lv_expressions_1_0= rulejoin_group_by_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5602:3: lv_expressions_1_0= rulejoin_group_by_clause
            {
             
            	        newCompositeNode(grammarAccess.getJoin_itemAccess().getExpressionsJoin_group_by_clauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulejoin_group_by_clause_in_rulejoin_item14901);
            lv_expressions_1_0=rulejoin_group_by_clause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoin_itemRule());
            	        }
                   		set(
                   			current, 
                   			"expressions",
                    		lv_expressions_1_0, 
                    		"join_group_by_clause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejoin_item"


    // $ANTLR start "entryRulegroup_item"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5626:1: entryRulegroup_item returns [EObject current=null] : iv_rulegroup_item= rulegroup_item EOF ;
    public final EObject entryRulegroup_item() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup_item = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5627:2: (iv_rulegroup_item= rulegroup_item EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5628:2: iv_rulegroup_item= rulegroup_item EOF
            {
             newCompositeNode(grammarAccess.getGroup_itemRule()); 
            pushFollow(FOLLOW_rulegroup_item_in_entryRulegroup_item14937);
            iv_rulegroup_item=rulegroup_item();

            state._fsp--;

             current =iv_rulegroup_item; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_item14947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegroup_item"


    // $ANTLR start "rulegroup_item"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5635:1: rulegroup_item returns [EObject current=null] : ( ( (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= 'ALL' | otherlv_3= 'ANY' ) (otherlv_4= 'INNER' | otherlv_5= 'OUTER' )? ) ;
    public final EObject rulegroup_item() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_join_group_by_expr_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5638:28: ( ( ( (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= 'ALL' | otherlv_3= 'ANY' ) (otherlv_4= 'INNER' | otherlv_5= 'OUTER' )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5639:1: ( ( (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= 'ALL' | otherlv_3= 'ANY' ) (otherlv_4= 'INNER' | otherlv_5= 'OUTER' )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5639:1: ( ( (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= 'ALL' | otherlv_3= 'ANY' ) (otherlv_4= 'INNER' | otherlv_5= 'OUTER' )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5639:2: ( (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= 'ALL' | otherlv_3= 'ANY' ) (otherlv_4= 'INNER' | otherlv_5= 'OUTER' )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5639:2: ( (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= 'ALL' | otherlv_3= 'ANY' )
            int alt86=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt86=1;
                }
                break;
            case 68:
                {
                alt86=2;
                }
                break;
            case 103:
                {
                alt86=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5639:3: (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5639:3: (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5639:5: otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulegroup_item14986); 

                        	newLeafNode(otherlv_0, grammarAccess.getGroup_itemAccess().getBYKeyword_0_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getGroup_itemAccess().getJoin_group_by_expr_listParserRuleCall_0_0_1()); 
                        
                    pushFollow(FOLLOW_rulejoin_group_by_expr_list_in_rulegroup_item15008);
                    this_join_group_by_expr_list_1=rulejoin_group_by_expr_list();

                    state._fsp--;

                     
                            current = this_join_group_by_expr_list_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5653:7: otherlv_2= 'ALL'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_rulegroup_item15026); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroup_itemAccess().getALLKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5658:7: otherlv_3= 'ANY'
                    {
                    otherlv_3=(Token)match(input,103,FOLLOW_103_in_rulegroup_item15044); 

                        	newLeafNode(otherlv_3, grammarAccess.getGroup_itemAccess().getANYKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5662:2: (otherlv_4= 'INNER' | otherlv_5= 'OUTER' )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==104) ) {
                alt87=1;
            }
            else if ( (LA87_0==102) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5662:4: otherlv_4= 'INNER'
                    {
                    otherlv_4=(Token)match(input,104,FOLLOW_104_in_rulegroup_item15058); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroup_itemAccess().getINNERKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5667:7: otherlv_5= 'OUTER'
                    {
                    otherlv_5=(Token)match(input,102,FOLLOW_102_in_rulegroup_item15076); 

                        	newLeafNode(otherlv_5, grammarAccess.getGroup_itemAccess().getOUTERKeyword_1_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegroup_item"


    // $ANTLR start "entryRulejoin_group_by_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5679:1: entryRulejoin_group_by_clause returns [EObject current=null] : iv_rulejoin_group_by_clause= rulejoin_group_by_clause EOF ;
    public final EObject entryRulejoin_group_by_clause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_group_by_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5680:2: (iv_rulejoin_group_by_clause= rulejoin_group_by_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5681:2: iv_rulejoin_group_by_clause= rulejoin_group_by_clause EOF
            {
             newCompositeNode(grammarAccess.getJoin_group_by_clauseRule()); 
            pushFollow(FOLLOW_rulejoin_group_by_clause_in_entryRulejoin_group_by_clause15114);
            iv_rulejoin_group_by_clause=rulejoin_group_by_clause();

            state._fsp--;

             current =iv_rulejoin_group_by_clause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_group_by_clause15124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejoin_group_by_clause"


    // $ANTLR start "rulejoin_group_by_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5688:1: rulejoin_group_by_clause returns [EObject current=null] : (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) ;
    public final EObject rulejoin_group_by_clause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_join_group_by_expr_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5691:28: ( (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5692:1: (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5692:1: (otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5692:3: otherlv_0= 'BY' this_join_group_by_expr_list_1= rulejoin_group_by_expr_list
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_rulejoin_group_by_clause15161); 

                	newLeafNode(otherlv_0, grammarAccess.getJoin_group_by_clauseAccess().getBYKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getJoin_group_by_clauseAccess().getJoin_group_by_expr_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulejoin_group_by_expr_list_in_rulejoin_group_by_clause15183);
            this_join_group_by_expr_list_1=rulejoin_group_by_expr_list();

            state._fsp--;

             
                    current = this_join_group_by_expr_list_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejoin_group_by_clause"


    // $ANTLR start "entryRulejoin_group_by_expr_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5713:1: entryRulejoin_group_by_expr_list returns [EObject current=null] : iv_rulejoin_group_by_expr_list= rulejoin_group_by_expr_list EOF ;
    public final EObject entryRulejoin_group_by_expr_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_group_by_expr_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5714:2: (iv_rulejoin_group_by_expr_list= rulejoin_group_by_expr_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5715:2: iv_rulejoin_group_by_expr_list= rulejoin_group_by_expr_list EOF
            {
             newCompositeNode(grammarAccess.getJoin_group_by_expr_listRule()); 
            pushFollow(FOLLOW_rulejoin_group_by_expr_list_in_entryRulejoin_group_by_expr_list15218);
            iv_rulejoin_group_by_expr_list=rulejoin_group_by_expr_list();

            state._fsp--;

             current =iv_rulejoin_group_by_expr_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_group_by_expr_list15228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejoin_group_by_expr_list"


    // $ANTLR start "rulejoin_group_by_expr_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5722:1: rulejoin_group_by_expr_list returns [EObject current=null] : (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= '(' ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= ')' ) ) ;
    public final EObject rulejoin_group_by_expr_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_join_group_by_expr_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_expressions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5725:28: ( (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= '(' ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= ')' ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5726:1: (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= '(' ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= ')' ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5726:1: (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= '(' ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= ')' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_STRING||(LA89_0>=RULE_DIGIT && LA89_0<=RULE_ID)||(LA89_0>=RULE_LONGINTEGER && LA89_0<=RULE_FLOATINGPOINT)||LA89_0==25||(LA89_0>=54 && LA89_0<=56)||LA89_0==58||LA89_0==60||LA89_0==67||LA89_0==107) ) {
                alt89=1;
            }
            else if ( (LA89_0==46) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5727:5: this_join_group_by_expr_0= rulejoin_group_by_expr
                    {
                     
                            newCompositeNode(grammarAccess.getJoin_group_by_expr_listAccess().getJoin_group_by_exprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15275);
                    this_join_group_by_expr_0=rulejoin_group_by_expr();

                    state._fsp--;

                     
                            current = this_join_group_by_expr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5736:6: (otherlv_1= '(' ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= ')' )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5736:6: (otherlv_1= '(' ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= ')' )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5736:8: otherlv_1= '(' ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,46,FOLLOW_46_in_rulejoin_group_by_expr_list15293); 

                        	newLeafNode(otherlv_1, grammarAccess.getJoin_group_by_expr_listAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5740:1: ( (lv_left_2_0= rulejoin_group_by_expr ) )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5741:1: (lv_left_2_0= rulejoin_group_by_expr )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5741:1: (lv_left_2_0= rulejoin_group_by_expr )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5742:3: lv_left_2_0= rulejoin_group_by_expr
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoin_group_by_expr_listAccess().getLeftJoin_group_by_exprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15314);
                    lv_left_2_0=rulejoin_group_by_expr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJoin_group_by_expr_listRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_2_0, 
                            		"join_group_by_expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5758:2: (otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==41) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5758:4: otherlv_3= ',' ( (lv_expressions_4_0= rulejoin_group_by_expr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,41,FOLLOW_41_in_rulejoin_group_by_expr_list15327); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getJoin_group_by_expr_listAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5762:1: ( (lv_expressions_4_0= rulejoin_group_by_expr ) )
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5763:1: (lv_expressions_4_0= rulejoin_group_by_expr )
                    	    {
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5763:1: (lv_expressions_4_0= rulejoin_group_by_expr )
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5764:3: lv_expressions_4_0= rulejoin_group_by_expr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJoin_group_by_expr_listAccess().getExpressionsJoin_group_by_exprParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15348);
                    	    lv_expressions_4_0=rulejoin_group_by_expr();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJoin_group_by_expr_listRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"expressions",
                    	            		lv_expressions_4_0, 
                    	            		"join_group_by_expr");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_rulejoin_group_by_expr_list15362); 

                        	newLeafNode(otherlv_5, grammarAccess.getJoin_group_by_expr_listAccess().getRightParenthesisKeyword_1_3());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejoin_group_by_expr_list"


    // $ANTLR start "entryRulejoin_group_by_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5792:1: entryRulejoin_group_by_expr returns [EObject current=null] : iv_rulejoin_group_by_expr= rulejoin_group_by_expr EOF ;
    public final EObject entryRulejoin_group_by_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_group_by_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5793:2: (iv_rulejoin_group_by_expr= rulejoin_group_by_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5794:2: iv_rulejoin_group_by_expr= rulejoin_group_by_expr EOF
            {
             newCompositeNode(grammarAccess.getJoin_group_by_exprRule()); 
            pushFollow(FOLLOW_rulejoin_group_by_expr_in_entryRulejoin_group_by_expr15399);
            iv_rulejoin_group_by_expr=rulejoin_group_by_expr();

            state._fsp--;

             current =iv_rulejoin_group_by_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_group_by_expr15409); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulejoin_group_by_expr"


    // $ANTLR start "rulejoin_group_by_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5801:1: rulejoin_group_by_expr returns [EObject current=null] : (this_Expression_0= ruleExpression | ruleSTAR ) ;
    public final EObject rulejoin_group_by_expr() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5804:28: ( (this_Expression_0= ruleExpression | ruleSTAR ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5805:1: (this_Expression_0= ruleExpression | ruleSTAR )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5805:1: (this_Expression_0= ruleExpression | ruleSTAR )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_STRING||(LA90_0>=RULE_DIGIT && LA90_0<=RULE_ID)||(LA90_0>=RULE_LONGINTEGER && LA90_0<=RULE_FLOATINGPOINT)||LA90_0==25||(LA90_0>=54 && LA90_0<=56)||LA90_0==58||LA90_0==67||LA90_0==107) ) {
                alt90=1;
            }
            else if ( (LA90_0==60) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5806:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getJoin_group_by_exprAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulejoin_group_by_expr15456);
                    this_Expression_0=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5816:5: ruleSTAR
                    {
                     
                            newCompositeNode(grammarAccess.getJoin_group_by_exprAccess().getSTARParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSTAR_in_rulejoin_group_by_expr15477);
                    ruleSTAR();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulejoin_group_by_expr"


    // $ANTLR start "entryRulenested_blk"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5831:1: entryRulenested_blk returns [EObject current=null] : iv_rulenested_blk= rulenested_blk EOF ;
    public final EObject entryRulenested_blk() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_blk = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5832:2: (iv_rulenested_blk= rulenested_blk EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5833:2: iv_rulenested_blk= rulenested_blk EOF
            {
             newCompositeNode(grammarAccess.getNested_blkRule()); 
            pushFollow(FOLLOW_rulenested_blk_in_entryRulenested_blk15512);
            iv_rulenested_blk=rulenested_blk();

            state._fsp--;

             current =iv_rulenested_blk; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_blk15522); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenested_blk"


    // $ANTLR start "rulenested_blk"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5840:1: rulenested_blk returns [EObject current=null] : (otherlv_0= '{' this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= ';' otherlv_4= '}' ) ;
    public final EObject rulenested_blk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_nested_command_list_1 = null;

        EObject lv_clauses_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5843:28: ( (otherlv_0= '{' this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= ';' otherlv_4= '}' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5844:1: (otherlv_0= '{' this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= ';' otherlv_4= '}' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5844:1: (otherlv_0= '{' this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= ';' otherlv_4= '}' )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5844:3: otherlv_0= '{' this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= ';' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_rulenested_blk15559); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_blkAccess().getLeftCurlyBracketKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_blkAccess().getNested_command_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenested_command_list_in_rulenested_blk15581);
            this_nested_command_list_1=rulenested_command_list();

            state._fsp--;

             
                    current = this_nested_command_list_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5857:1: ( (lv_clauses_2_0= rulegenerate_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5858:1: (lv_clauses_2_0= rulegenerate_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5858:1: (lv_clauses_2_0= rulegenerate_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5859:3: lv_clauses_2_0= rulegenerate_clause
            {
             
            	        newCompositeNode(grammarAccess.getNested_blkAccess().getClausesGenerate_clauseParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulegenerate_clause_in_rulenested_blk15601);
            lv_clauses_2_0=rulegenerate_clause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNested_blkRule());
            	        }
                   		set(
                   			current, 
                   			"clauses",
                    		lv_clauses_2_0, 
                    		"generate_clause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_rulenested_blk15613); 

                	newLeafNode(otherlv_3, grammarAccess.getNested_blkAccess().getSemicolonKeyword_3());
                
            otherlv_4=(Token)match(input,80,FOLLOW_80_in_rulenested_blk15625); 

                	newLeafNode(otherlv_4, grammarAccess.getNested_blkAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenested_blk"


    // $ANTLR start "entryRulegenerate_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5891:1: entryRulegenerate_clause returns [EObject current=null] : iv_rulegenerate_clause= rulegenerate_clause EOF ;
    public final EObject entryRulegenerate_clause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenerate_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5892:2: (iv_rulegenerate_clause= rulegenerate_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5893:2: iv_rulegenerate_clause= rulegenerate_clause EOF
            {
             newCompositeNode(grammarAccess.getGenerate_clauseRule()); 
            pushFollow(FOLLOW_rulegenerate_clause_in_entryRulegenerate_clause15661);
            iv_rulegenerate_clause=rulegenerate_clause();

            state._fsp--;

             current =iv_rulegenerate_clause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_clause15671); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegenerate_clause"


    // $ANTLR start "rulegenerate_clause"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5900:1: rulegenerate_clause returns [EObject current=null] : (otherlv_0= 'GENERATE' ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* ) ;
    public final EObject rulegenerate_clause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5903:28: ( (otherlv_0= 'GENERATE' ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5904:1: (otherlv_0= 'GENERATE' ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5904:1: (otherlv_0= 'GENERATE' ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5904:3: otherlv_0= 'GENERATE' ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )*
            {
            otherlv_0=(Token)match(input,105,FOLLOW_105_in_rulegenerate_clause15708); 

                	newLeafNode(otherlv_0, grammarAccess.getGenerate_clauseAccess().getGENERATEKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5908:1: ( (lv_items_1_0= ruleFlattenGeneratedItem ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5909:1: (lv_items_1_0= ruleFlattenGeneratedItem )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5909:1: (lv_items_1_0= ruleFlattenGeneratedItem )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5910:3: lv_items_1_0= ruleFlattenGeneratedItem
            {
             
            	        newCompositeNode(grammarAccess.getGenerate_clauseAccess().getItemsFlattenGeneratedItemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15729);
            lv_items_1_0=ruleFlattenGeneratedItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGenerate_clauseRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"FlattenGeneratedItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5926:2: (otherlv_2= ',' ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==41) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5926:4: otherlv_2= ',' ( (lv_items_3_0= ruleFlattenGeneratedItem ) )
            	    {
            	    otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulegenerate_clause15742); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGenerate_clauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5930:1: ( (lv_items_3_0= ruleFlattenGeneratedItem ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5931:1: (lv_items_3_0= ruleFlattenGeneratedItem )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5931:1: (lv_items_3_0= ruleFlattenGeneratedItem )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5932:3: lv_items_3_0= ruleFlattenGeneratedItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGenerate_clauseAccess().getItemsFlattenGeneratedItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15763);
            	    lv_items_3_0=ruleFlattenGeneratedItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGenerate_clauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"FlattenGeneratedItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegenerate_clause"


    // $ANTLR start "entryRulenested_command_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5956:1: entryRulenested_command_list returns [EObject current=null] : iv_rulenested_command_list= rulenested_command_list EOF ;
    public final EObject entryRulenested_command_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_command_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5957:2: (iv_rulenested_command_list= rulenested_command_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5958:2: iv_rulenested_command_list= rulenested_command_list EOF
            {
             newCompositeNode(grammarAccess.getNested_command_listRule()); 
            pushFollow(FOLLOW_rulenested_command_list_in_entryRulenested_command_list15801);
            iv_rulenested_command_list=rulenested_command_list();

            state._fsp--;

             current =iv_rulenested_command_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_command_list15811); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenested_command_list"


    // $ANTLR start "rulenested_command_list"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5965:1: rulenested_command_list returns [EObject current=null] : ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* ) ;
    public final EObject rulenested_command_list() throws RecognitionException {
        EObject current = null;

        EObject lv_cmds_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5968:28: ( ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5969:1: ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5969:1: ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5969:2: () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5969:2: ()
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5970:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNested_command_listAccess().getNested_command_listAction_0(),
                        current);
                

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5975:2: ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_ID) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5975:3: ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5975:3: ( (lv_cmds_1_0= rulenested_command ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5976:1: (lv_cmds_1_0= rulenested_command )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5976:1: (lv_cmds_1_0= rulenested_command )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:5977:3: lv_cmds_1_0= rulenested_command
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNested_command_listAccess().getCmdsNested_commandParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulenested_command_in_rulenested_command_list15867);
            	    lv_cmds_1_0=rulenested_command();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNested_command_listRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cmds",
            	            		lv_cmds_1_0, 
            	            		"nested_command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	     
            	            newCompositeNode(grammarAccess.getNested_command_listAccess().getSEMI_COLONParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleSEMI_COLON_in_rulenested_command_list15883);
            	    ruleSEMI_COLON();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenested_command_list"


    // $ANTLR start "entryRulenested_command"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6009:1: entryRulenested_command returns [EObject current=null] : iv_rulenested_command= rulenested_command EOF ;
    public final EObject entryRulenested_command() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_command = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6010:2: (iv_rulenested_command= rulenested_command EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6011:2: iv_rulenested_command= rulenested_command EOF
            {
             newCompositeNode(grammarAccess.getNested_commandRule()); 
            pushFollow(FOLLOW_rulenested_command_in_entryRulenested_command15920);
            iv_rulenested_command=rulenested_command();

            state._fsp--;

             current =iv_rulenested_command; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_command15930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenested_command"


    // $ANTLR start "rulenested_command"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6018:1: rulenested_command returns [EObject current=null] : ( ruleAlias otherlv_1= '=' this_nested_op_2= rulenested_op ) ;
    public final EObject rulenested_command() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_nested_op_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6021:28: ( ( ruleAlias otherlv_1= '=' this_nested_op_2= rulenested_op ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6022:1: ( ruleAlias otherlv_1= '=' this_nested_op_2= rulenested_op )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6022:1: ( ruleAlias otherlv_1= '=' this_nested_op_2= rulenested_op )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6023:5: ruleAlias otherlv_1= '=' this_nested_op_2= rulenested_op
            {
             
                    newCompositeNode(grammarAccess.getNested_commandAccess().getAliasParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAlias_in_rulenested_command15971);
            ruleAlias();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulenested_command15982); 

                	newLeafNode(otherlv_1, grammarAccess.getNested_commandAccess().getEqualsSignKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getNested_commandAccess().getNested_opParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulenested_op_in_rulenested_command16004);
            this_nested_op_2=rulenested_op();

            state._fsp--;

             
                    current = this_nested_op_2; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenested_command"


    // $ANTLR start "entryRulenested_op"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6051:1: entryRulenested_op returns [EObject current=null] : iv_rulenested_op= rulenested_op EOF ;
    public final EObject entryRulenested_op() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_op = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6052:2: (iv_rulenested_op= rulenested_op EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6053:2: iv_rulenested_op= rulenested_op EOF
            {
             newCompositeNode(grammarAccess.getNested_opRule()); 
            pushFollow(FOLLOW_rulenested_op_in_entryRulenested_op16039);
            iv_rulenested_op=rulenested_op();

            state._fsp--;

             current =iv_rulenested_op; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_op16049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenested_op"


    // $ANTLR start "rulenested_op"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6060:1: rulenested_op returns [EObject current=null] : (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= '(' ruleType otherlv_6= ')' )? this_AddExpression_7= ruleAddExpression ) ) ;
    public final EObject rulenested_op() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_NestedFilter_0 = null;

        EObject this_nested_sort_1 = null;

        EObject this_nested_distinct_2 = null;

        EObject this_nested_limit_3 = null;

        EObject this_AddExpression_7 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6063:28: ( (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= '(' ruleType otherlv_6= ')' )? this_AddExpression_7= ruleAddExpression ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6064:1: (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= '(' ruleType otherlv_6= ')' )? this_AddExpression_7= ruleAddExpression ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6064:1: (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= '(' ruleType otherlv_6= ')' )? this_AddExpression_7= ruleAddExpression ) )
            int alt94=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt94=1;
                }
                break;
            case 28:
                {
                alt94=2;
                }
                break;
            case 35:
                {
                alt94=3;
                }
                break;
            case 33:
                {
                alt94=4;
                }
                break;
            case RULE_STRING:
            case RULE_DIGIT:
            case RULE_INT:
            case RULE_ID:
            case RULE_LONGINTEGER:
            case RULE_FLOATINGPOINT:
            case 25:
            case 46:
            case 55:
            case 56:
            case 58:
            case 67:
            case 107:
                {
                alt94=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6065:5: this_NestedFilter_0= ruleNestedFilter
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNestedFilterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNestedFilter_in_rulenested_op16096);
                    this_NestedFilter_0=ruleNestedFilter();

                    state._fsp--;

                     
                            current = this_NestedFilter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6075:5: this_nested_sort_1= rulenested_sort
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNested_sortParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenested_sort_in_rulenested_op16123);
                    this_nested_sort_1=rulenested_sort();

                    state._fsp--;

                     
                            current = this_nested_sort_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6085:5: this_nested_distinct_2= rulenested_distinct
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNested_distinctParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulenested_distinct_in_rulenested_op16150);
                    this_nested_distinct_2=rulenested_distinct();

                    state._fsp--;

                     
                            current = this_nested_distinct_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6095:5: this_nested_limit_3= rulenested_limit
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNested_limitParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulenested_limit_in_rulenested_op16177);
                    this_nested_limit_3=rulenested_limit();

                    state._fsp--;

                     
                            current = this_nested_limit_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6104:6: ( (otherlv_4= '(' ruleType otherlv_6= ')' )? this_AddExpression_7= ruleAddExpression )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6104:6: ( (otherlv_4= '(' ruleType otherlv_6= ')' )? this_AddExpression_7= ruleAddExpression )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6104:7: (otherlv_4= '(' ruleType otherlv_6= ')' )? this_AddExpression_7= ruleAddExpression
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6104:7: (otherlv_4= '(' ruleType otherlv_6= ')' )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==46) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6104:9: otherlv_4= '(' ruleType otherlv_6= ')'
                            {
                            otherlv_4=(Token)match(input,46,FOLLOW_46_in_rulenested_op16196); 

                                	newLeafNode(otherlv_4, grammarAccess.getNested_opAccess().getLeftParenthesisKeyword_4_0_0());
                                
                             
                                    newCompositeNode(grammarAccess.getNested_opAccess().getTypeParserRuleCall_4_0_1()); 
                                
                            pushFollow(FOLLOW_ruleType_in_rulenested_op16212);
                            ruleType();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                
                            otherlv_6=(Token)match(input,47,FOLLOW_47_in_rulenested_op16223); 

                                	newLeafNode(otherlv_6, grammarAccess.getNested_opAccess().getRightParenthesisKeyword_4_0_2());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getAddExpressionParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleAddExpression_in_rulenested_op16247);
                    this_AddExpression_7=ruleAddExpression();

                    state._fsp--;

                     
                            current = this_AddExpression_7; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenested_op"


    // $ANTLR start "entryRuleNestedFilter"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6137:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6138:2: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6139:2: iv_ruleNestedFilter= ruleNestedFilter EOF
            {
             newCompositeNode(grammarAccess.getNestedFilterRule()); 
            pushFollow(FOLLOW_ruleNestedFilter_in_entryRuleNestedFilter16283);
            iv_ruleNestedFilter=ruleNestedFilter();

            state._fsp--;

             current =iv_ruleNestedFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedFilter16293); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedFilter"


    // $ANTLR start "ruleNestedFilter"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6146:1: ruleNestedFilter returns [EObject current=null] : (otherlv_0= 'FILTER' ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= 'BY' ( (lv_cond_3_0= ruleCondition ) ) ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;

        EObject lv_cond_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6149:28: ( (otherlv_0= 'FILTER' ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= 'BY' ( (lv_cond_3_0= ruleCondition ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6150:1: (otherlv_0= 'FILTER' ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= 'BY' ( (lv_cond_3_0= ruleCondition ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6150:1: (otherlv_0= 'FILTER' ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= 'BY' ( (lv_cond_3_0= ruleCondition ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6150:3: otherlv_0= 'FILTER' ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= 'BY' ( (lv_cond_3_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleNestedFilter16330); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedFilterAccess().getFILTERKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6154:1: ( (lv_exp_1_0= rulevar_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6155:1: (lv_exp_1_0= rulevar_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6155:1: (lv_exp_1_0= rulevar_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6156:3: lv_exp_1_0= rulevar_expr
            {
             
            	        newCompositeNode(grammarAccess.getNestedFilterAccess().getExpVar_exprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevar_expr_in_ruleNestedFilter16351);
            lv_exp_1_0=rulevar_expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedFilterRule());
            	        }
                   		set(
                   			current, 
                   			"exp",
                    		lv_exp_1_0, 
                    		"var_expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleNestedFilter16363); 

                	newLeafNode(otherlv_2, grammarAccess.getNestedFilterAccess().getBYKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6176:1: ( (lv_cond_3_0= ruleCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6177:1: (lv_cond_3_0= ruleCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6177:1: (lv_cond_3_0= ruleCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6178:3: lv_cond_3_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getNestedFilterAccess().getCondConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleNestedFilter16384);
            lv_cond_3_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedFilterRule());
            	        }
                   		set(
                   			current, 
                   			"cond",
                    		lv_cond_3_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedFilter"


    // $ANTLR start "entryRulenested_sort"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6202:1: entryRulenested_sort returns [EObject current=null] : iv_rulenested_sort= rulenested_sort EOF ;
    public final EObject entryRulenested_sort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_sort = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6203:2: (iv_rulenested_sort= rulenested_sort EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6204:2: iv_rulenested_sort= rulenested_sort EOF
            {
             newCompositeNode(grammarAccess.getNested_sortRule()); 
            pushFollow(FOLLOW_rulenested_sort_in_entryRulenested_sort16420);
            iv_rulenested_sort=rulenested_sort();

            state._fsp--;

             current =iv_rulenested_sort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_sort16430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenested_sort"


    // $ANTLR start "rulenested_sort"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6211:1: rulenested_sort returns [EObject current=null] : (otherlv_0= 'ORDER' this_var_expr_1= rulevar_expr otherlv_2= 'BY' ruleorder_by_clause (otherlv_4= 'USING' ruleFuncClause )? ) ;
    public final EObject rulenested_sort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6214:28: ( (otherlv_0= 'ORDER' this_var_expr_1= rulevar_expr otherlv_2= 'BY' ruleorder_by_clause (otherlv_4= 'USING' ruleFuncClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6215:1: (otherlv_0= 'ORDER' this_var_expr_1= rulevar_expr otherlv_2= 'BY' ruleorder_by_clause (otherlv_4= 'USING' ruleFuncClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6215:1: (otherlv_0= 'ORDER' this_var_expr_1= rulevar_expr otherlv_2= 'BY' ruleorder_by_clause (otherlv_4= 'USING' ruleFuncClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6215:3: otherlv_0= 'ORDER' this_var_expr_1= rulevar_expr otherlv_2= 'BY' ruleorder_by_clause (otherlv_4= 'USING' ruleFuncClause )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_rulenested_sort16467); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_sortAccess().getORDERKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_sortAccess().getVar_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevar_expr_in_rulenested_sort16489);
            this_var_expr_1=rulevar_expr();

            state._fsp--;

             
                    current = this_var_expr_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulenested_sort16500); 

                	newLeafNode(otherlv_2, grammarAccess.getNested_sortAccess().getBYKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getNested_sortAccess().getOrder_by_clauseParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleorder_by_clause_in_rulenested_sort16516);
            ruleorder_by_clause();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6240:1: (otherlv_4= 'USING' ruleFuncClause )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==26) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6240:3: otherlv_4= 'USING' ruleFuncClause
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_rulenested_sort16528); 

                        	newLeafNode(otherlv_4, grammarAccess.getNested_sortAccess().getUSINGKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getNested_sortAccess().getFuncClauseParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleFuncClause_in_rulenested_sort16544);
                    ruleFuncClause();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenested_sort"


    // $ANTLR start "entryRulenested_distinct"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6260:1: entryRulenested_distinct returns [EObject current=null] : iv_rulenested_distinct= rulenested_distinct EOF ;
    public final EObject entryRulenested_distinct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_distinct = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6261:2: (iv_rulenested_distinct= rulenested_distinct EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6262:2: iv_rulenested_distinct= rulenested_distinct EOF
            {
             newCompositeNode(grammarAccess.getNested_distinctRule()); 
            pushFollow(FOLLOW_rulenested_distinct_in_entryRulenested_distinct16581);
            iv_rulenested_distinct=rulenested_distinct();

            state._fsp--;

             current =iv_rulenested_distinct; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_distinct16591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenested_distinct"


    // $ANTLR start "rulenested_distinct"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6269:1: rulenested_distinct returns [EObject current=null] : (otherlv_0= 'DISTINCT' this_var_expr_1= rulevar_expr ) ;
    public final EObject rulenested_distinct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6272:28: ( (otherlv_0= 'DISTINCT' this_var_expr_1= rulevar_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6273:1: (otherlv_0= 'DISTINCT' this_var_expr_1= rulevar_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6273:1: (otherlv_0= 'DISTINCT' this_var_expr_1= rulevar_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6273:3: otherlv_0= 'DISTINCT' this_var_expr_1= rulevar_expr
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_rulenested_distinct16628); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_distinctAccess().getDISTINCTKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_distinctAccess().getVar_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevar_expr_in_rulenested_distinct16650);
            this_var_expr_1=rulevar_expr();

            state._fsp--;

             
                    current = this_var_expr_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenested_distinct"


    // $ANTLR start "entryRulenested_limit"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6294:1: entryRulenested_limit returns [EObject current=null] : iv_rulenested_limit= rulenested_limit EOF ;
    public final EObject entryRulenested_limit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_limit = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6295:2: (iv_rulenested_limit= rulenested_limit EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6296:2: iv_rulenested_limit= rulenested_limit EOF
            {
             newCompositeNode(grammarAccess.getNested_limitRule()); 
            pushFollow(FOLLOW_rulenested_limit_in_entryRulenested_limit16685);
            iv_rulenested_limit=rulenested_limit();

            state._fsp--;

             current =iv_rulenested_limit; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_limit16695); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenested_limit"


    // $ANTLR start "rulenested_limit"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6303:1: rulenested_limit returns [EObject current=null] : (otherlv_0= 'LIMIT' this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) ) ;
    public final EObject rulenested_limit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_2=null;
        Token this_LONGINTEGER_3=null;
        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6306:28: ( (otherlv_0= 'LIMIT' this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6307:1: (otherlv_0= 'LIMIT' this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6307:1: (otherlv_0= 'LIMIT' this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6307:3: otherlv_0= 'LIMIT' this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_rulenested_limit16732); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_limitAccess().getLIMITKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_limitAccess().getVar_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevar_expr_in_rulenested_limit16754);
            this_var_expr_1=rulevar_expr();

            state._fsp--;

             
                    current = this_var_expr_1; 
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6320:1: (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==RULE_INT) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_LONGINTEGER) ) {
                alt96=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6320:2: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulenested_limit16765); 
                     
                        newLeafNode(this_INT_2, grammarAccess.getNested_limitAccess().getINTTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6325:6: this_LONGINTEGER_3= RULE_LONGINTEGER
                    {
                    this_LONGINTEGER_3=(Token)match(input,RULE_LONGINTEGER,FOLLOW_RULE_LONGINTEGER_in_rulenested_limit16781); 
                     
                        newLeafNode(this_LONGINTEGER_3, grammarAccess.getNested_limitAccess().getLONGINTEGERTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenested_limit"


    // $ANTLR start "entryRulesplit_branch"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6337:1: entryRulesplit_branch returns [EObject current=null] : iv_rulesplit_branch= rulesplit_branch EOF ;
    public final EObject entryRulesplit_branch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesplit_branch = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6338:2: (iv_rulesplit_branch= rulesplit_branch EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6339:2: iv_rulesplit_branch= rulesplit_branch EOF
            {
             newCompositeNode(grammarAccess.getSplit_branchRule()); 
            pushFollow(FOLLOW_rulesplit_branch_in_entryRulesplit_branch16817);
            iv_rulesplit_branch=rulesplit_branch();

            state._fsp--;

             current =iv_rulesplit_branch; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesplit_branch16827); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesplit_branch"


    // $ANTLR start "rulesplit_branch"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6346:1: rulesplit_branch returns [EObject current=null] : ( ruleIDENTIFIER otherlv_1= 'IF' this_Condition_2= ruleCondition ) ;
    public final EObject rulesplit_branch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Condition_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6349:28: ( ( ruleIDENTIFIER otherlv_1= 'IF' this_Condition_2= ruleCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6350:1: ( ruleIDENTIFIER otherlv_1= 'IF' this_Condition_2= ruleCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6350:1: ( ruleIDENTIFIER otherlv_1= 'IF' this_Condition_2= ruleCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6351:5: ruleIDENTIFIER otherlv_1= 'IF' this_Condition_2= ruleCondition
            {
             
                    newCompositeNode(grammarAccess.getSplit_branchAccess().getIDENTIFIERParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIDENTIFIER_in_rulesplit_branch16868);
            ruleIDENTIFIER();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,106,FOLLOW_106_in_rulesplit_branch16879); 

                	newLeafNode(otherlv_1, grammarAccess.getSplit_branchAccess().getIFKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getSplit_branchAccess().getConditionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleCondition_in_rulesplit_branch16901);
            this_Condition_2=ruleCondition();

            state._fsp--;

             
                    current = this_Condition_2; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesplit_branch"


    // $ANTLR start "entryRulecol_ref"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6379:1: entryRulecol_ref returns [String current=null] : iv_rulecol_ref= rulecol_ref EOF ;
    public final String entryRulecol_ref() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_ref = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6380:2: (iv_rulecol_ref= rulecol_ref EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6381:2: iv_rulecol_ref= rulecol_ref EOF
            {
             newCompositeNode(grammarAccess.getCol_refRule()); 
            pushFollow(FOLLOW_rulecol_ref_in_entryRulecol_ref16937);
            iv_rulecol_ref=rulecol_ref();

            state._fsp--;

             current =iv_rulecol_ref.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_ref16948); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecol_ref"


    // $ANTLR start "rulecol_ref"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6388:1: rulecol_ref returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref ) ;
    public final AntlrDatatypeRuleToken rulecol_ref() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_alias_col_ref_0 = null;

        AntlrDatatypeRuleToken this_dollar_col_ref_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6391:28: ( (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6392:1: (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6392:1: (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_ID||LA97_0==25) ) {
                alt97=1;
            }
            else if ( (LA97_0==67) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6393:5: this_alias_col_ref_0= rulealias_col_ref
                    {
                     
                            newCompositeNode(grammarAccess.getCol_refAccess().getAlias_col_refParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulealias_col_ref_in_rulecol_ref16995);
                    this_alias_col_ref_0=rulealias_col_ref();

                    state._fsp--;


                    		current.merge(this_alias_col_ref_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6405:5: this_dollar_col_ref_1= ruledollar_col_ref
                    {
                     
                            newCompositeNode(grammarAccess.getCol_refAccess().getDollar_col_refParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruledollar_col_ref_in_rulecol_ref17028);
                    this_dollar_col_ref_1=ruledollar_col_ref();

                    state._fsp--;


                    		current.merge(this_dollar_col_ref_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecol_ref"


    // $ANTLR start "entryRulealias_col_ref"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6423:1: entryRulealias_col_ref returns [String current=null] : iv_rulealias_col_ref= rulealias_col_ref EOF ;
    public final String entryRulealias_col_ref() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulealias_col_ref = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6424:2: (iv_rulealias_col_ref= rulealias_col_ref EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6425:2: iv_rulealias_col_ref= rulealias_col_ref EOF
            {
             newCompositeNode(grammarAccess.getAlias_col_refRule()); 
            pushFollow(FOLLOW_rulealias_col_ref_in_entryRulealias_col_ref17074);
            iv_rulealias_col_ref=rulealias_col_ref();

            state._fsp--;

             current =iv_rulealias_col_ref.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulealias_col_ref17085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulealias_col_ref"


    // $ANTLR start "rulealias_col_ref"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6432:1: rulealias_col_ref returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'GROUP' | this_IDENTIFIER_1= ruleIDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulealias_col_ref() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6435:28: ( (kw= 'GROUP' | this_IDENTIFIER_1= ruleIDENTIFIER ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6436:1: (kw= 'GROUP' | this_IDENTIFIER_1= ruleIDENTIFIER )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6436:1: (kw= 'GROUP' | this_IDENTIFIER_1= ruleIDENTIFIER )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==25) ) {
                alt98=1;
            }
            else if ( (LA98_0==RULE_ID) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6437:2: kw= 'GROUP'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_rulealias_col_ref17123); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlias_col_refAccess().getGROUPKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6444:5: this_IDENTIFIER_1= ruleIDENTIFIER
                    {
                     
                            newCompositeNode(grammarAccess.getAlias_col_refAccess().getIDENTIFIERParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIDENTIFIER_in_rulealias_col_ref17151);
                    this_IDENTIFIER_1=ruleIDENTIFIER();

                    state._fsp--;


                    		current.merge(this_IDENTIFIER_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulealias_col_ref"


    // $ANTLR start "entryRuledollar_col_ref"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6462:1: entryRuledollar_col_ref returns [String current=null] : iv_ruledollar_col_ref= ruledollar_col_ref EOF ;
    public final String entryRuledollar_col_ref() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledollar_col_ref = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6463:2: (iv_ruledollar_col_ref= ruledollar_col_ref EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6464:2: iv_ruledollar_col_ref= ruledollar_col_ref EOF
            {
             newCompositeNode(grammarAccess.getDollar_col_refRule()); 
            pushFollow(FOLLOW_ruledollar_col_ref_in_entryRuledollar_col_ref17197);
            iv_ruledollar_col_ref=ruledollar_col_ref();

            state._fsp--;

             current =iv_ruledollar_col_ref.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledollar_col_ref17208); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledollar_col_ref"


    // $ANTLR start "ruledollar_col_ref"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6471:1: ruledollar_col_ref returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruledollar_col_ref() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_DOLLAR_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6474:28: ( (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6475:1: (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6475:1: (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6476:5: this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT
            {
             
                    newCompositeNode(grammarAccess.getDollar_col_refAccess().getDOLLARParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDOLLAR_in_ruledollar_col_ref17255);
            this_DOLLAR_0=ruleDOLLAR();

            state._fsp--;


            		current.merge(this_DOLLAR_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruledollar_col_ref17275); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getDollar_col_refAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledollar_col_ref"


    // $ANTLR start "entryRuleconst_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6501:1: entryRuleconst_expr returns [String current=null] : iv_ruleconst_expr= ruleconst_expr EOF ;
    public final String entryRuleconst_expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconst_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6502:2: (iv_ruleconst_expr= ruleconst_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6503:2: iv_ruleconst_expr= ruleconst_expr EOF
            {
             newCompositeNode(grammarAccess.getConst_exprRule()); 
            pushFollow(FOLLOW_ruleconst_expr_in_entryRuleconst_expr17321);
            iv_ruleconst_expr=ruleconst_expr();

            state._fsp--;

             current =iv_ruleconst_expr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconst_expr17332); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconst_expr"


    // $ANTLR start "ruleconst_expr"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6510:1: ruleconst_expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_literal_0= ruleliteral ;
    public final AntlrDatatypeRuleToken ruleconst_expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_literal_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6513:28: (this_literal_0= ruleliteral )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6515:5: this_literal_0= ruleliteral
            {
             
                    newCompositeNode(grammarAccess.getConst_exprAccess().getLiteralParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleliteral_in_ruleconst_expr17378);
            this_literal_0=ruleliteral();

            state._fsp--;


            		current.merge(this_literal_0);
                
             
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconst_expr"


    // $ANTLR start "entryRuleliteral"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6533:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6534:2: (iv_ruleliteral= ruleliteral EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6535:2: iv_ruleliteral= ruleliteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleliteral_in_entryRuleliteral17423);
            iv_ruleliteral=ruleliteral();

            state._fsp--;

             current =iv_ruleliteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleliteral17434); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleliteral"


    // $ANTLR start "ruleliteral"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6542:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= '\\\\u' | kw= 'NULL' ) ;
    public final AntlrDatatypeRuleToken ruleliteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_scalar_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6545:28: ( (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= '\\\\u' | kw= 'NULL' ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6546:1: (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= '\\\\u' | kw= 'NULL' )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6546:1: (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= '\\\\u' | kw= 'NULL' )
            int alt99=4;
            switch ( input.LA(1) ) {
            case RULE_DIGIT:
            case RULE_INT:
            case RULE_LONGINTEGER:
            case RULE_FLOATINGPOINT:
            case 67:
                {
                alt99=1;
                }
                break;
            case RULE_STRING:
                {
                alt99=2;
                }
                break;
            case 107:
                {
                alt99=3;
                }
                break;
            case 55:
                {
                alt99=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6547:5: this_scalar_0= rulescalar
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getScalarParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulescalar_in_ruleliteral17481);
                    this_scalar_0=rulescalar();

                    state._fsp--;


                    		current.merge(this_scalar_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6558:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleliteral17507); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6567:2: kw= '\\\\u'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleliteral17531); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralAccess().getUKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6574:2: kw= 'NULL'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleliteral17550); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralAccess().getNULLKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleliteral"


    // $ANTLR start "entryRulescalar"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6587:1: entryRulescalar returns [String current=null] : iv_rulescalar= rulescalar EOF ;
    public final String entryRulescalar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulescalar = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6588:2: (iv_rulescalar= rulescalar EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6589:2: iv_rulescalar= rulescalar EOF
            {
             newCompositeNode(grammarAccess.getScalarRule()); 
            pushFollow(FOLLOW_rulescalar_in_entryRulescalar17591);
            iv_rulescalar=rulescalar();

            state._fsp--;

             current =iv_rulescalar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulescalar17602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulescalar"


    // $ANTLR start "rulescalar"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6596:1: rulescalar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt ) ;
    public final AntlrDatatypeRuleToken rulescalar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOATINGPOINT_0=null;
        AntlrDatatypeRuleToken this_scalarInt_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6599:28: ( (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6600:1: (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6600:1: (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_FLOATINGPOINT) ) {
                alt100=1;
            }
            else if ( ((LA100_0>=RULE_DIGIT && LA100_0<=RULE_INT)||LA100_0==RULE_LONGINTEGER||LA100_0==67) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6600:6: this_FLOATINGPOINT_0= RULE_FLOATINGPOINT
                    {
                    this_FLOATINGPOINT_0=(Token)match(input,RULE_FLOATINGPOINT,FOLLOW_RULE_FLOATINGPOINT_in_rulescalar17642); 

                    		current.merge(this_FLOATINGPOINT_0);
                        
                     
                        newLeafNode(this_FLOATINGPOINT_0, grammarAccess.getScalarAccess().getFLOATINGPOINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6609:5: this_scalarInt_1= rulescalarInt
                    {
                     
                            newCompositeNode(grammarAccess.getScalarAccess().getScalarIntParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulescalarInt_in_rulescalar17675);
                    this_scalarInt_1=rulescalarInt();

                    state._fsp--;


                    		current.merge(this_scalarInt_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulescalar"


    // $ANTLR start "entryRulescalarInt"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6627:1: entryRulescalarInt returns [String current=null] : iv_rulescalarInt= rulescalarInt EOF ;
    public final String entryRulescalarInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulescalarInt = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6628:2: (iv_rulescalarInt= rulescalarInt EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6629:2: iv_rulescalarInt= rulescalarInt EOF
            {
             newCompositeNode(grammarAccess.getScalarIntRule()); 
            pushFollow(FOLLOW_rulescalarInt_in_entryRulescalarInt17721);
            iv_rulescalarInt=rulescalarInt();

            state._fsp--;

             current =iv_rulescalarInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulescalarInt17732); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulescalarInt"


    // $ANTLR start "rulescalarInt"
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6636:1: rulescalarInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= '$' this_ID_4= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken rulescalarInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;
        Token this_INT_1=null;
        Token this_LONGINTEGER_2=null;
        Token kw=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6639:28: ( (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= '$' this_ID_4= RULE_ID ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6640:1: (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= '$' this_ID_4= RULE_ID ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6640:1: (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= '$' this_ID_4= RULE_ID ) )
            int alt101=4;
            switch ( input.LA(1) ) {
            case RULE_DIGIT:
                {
                alt101=1;
                }
                break;
            case RULE_INT:
                {
                alt101=2;
                }
                break;
            case RULE_LONGINTEGER:
                {
                alt101=3;
                }
                break;
            case 67:
                {
                alt101=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6640:6: this_DIGIT_0= RULE_DIGIT
                    {
                    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rulescalarInt17772); 

                    		current.merge(this_DIGIT_0);
                        
                     
                        newLeafNode(this_DIGIT_0, grammarAccess.getScalarIntAccess().getDIGITTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6648:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulescalarInt17798); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getScalarIntAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6656:10: this_LONGINTEGER_2= RULE_LONGINTEGER
                    {
                    this_LONGINTEGER_2=(Token)match(input,RULE_LONGINTEGER,FOLLOW_RULE_LONGINTEGER_in_rulescalarInt17824); 

                    		current.merge(this_LONGINTEGER_2);
                        
                     
                        newLeafNode(this_LONGINTEGER_2, grammarAccess.getScalarIntAccess().getLONGINTEGERTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6664:6: (kw= '$' this_ID_4= RULE_ID )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6664:6: (kw= '$' this_ID_4= RULE_ID )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPig.g:6665:2: kw= '$' this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_rulescalarInt17849); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScalarIntAccess().getDollarSignKeyword_3_0()); 
                        
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulescalarInt17864); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getScalarIntAccess().getIDTerminalRuleCall_3_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulescalarInt"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\16\uffff";
    static final String DFA4_minS =
        "\1\12\1\uffff\1\24\4\uffff\1\25\6\uffff";
    static final String DFA4_maxS =
        "\1\102\1\uffff\1\24\4\uffff\1\47\6\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\5\1\3\1\7\1\6"+
        "\1\4\1\2";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\37\uffff\1\3\1\5\1\6\1\4\21\uffff\4\1",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\15\2\11\1\uffff\1\11\1\uffff\3\11\1\13\1\uffff\2\11\1\12"+
            "\2\11\1\uffff\1\14\1\10",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "119:3: (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement )";
        }
    }
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\12\1\24\1\26\12\uffff";
    static final String DFA2_maxS =
        "\1\12\1\24\1\44\12\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\6\1\2\1\11\1\12\1\5\1\1\1\4\1\7\1\3\1\10";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\10\1\4\1\uffff\1\13\1\uffff\1\5\1\11\1\12\2\uffff\1\14\1"+
            "\7\1\uffff\1\3\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "139:7: (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement )";
        }
    }
    static final String DFA45_eotS =
        "\10\uffff";
    static final String DFA45_eofS =
        "\1\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String DFA45_minS =
        "\1\12\1\11\1\uffff\1\11\1\uffff\1\12\1\11\1\10";
    static final String DFA45_maxS =
        "\1\103\1\150\1\uffff\1\103\1\uffff\1\103\1\150\1\103";
    static final String DFA45_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String DFA45_specialS =
        "\10\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\1\16\uffff\1\4\36\uffff\1\2\12\uffff\1\3",
            "\1\4\1\2\1\uffff\1\4\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\16"+
            "\uffff\1\4\4\uffff\1\2\7\4\2\uffff\1\5\6\4\4\uffff\1\2\1\uffff"+
            "\1\4\14\uffff\16\4\2\uffff\5\4\1\uffff\1\4",
            "",
            "\1\4\1\2\43\uffff\1\2\11\uffff\1\2\12\uffff\1\2",
            "",
            "\1\6\43\uffff\1\2\11\uffff\1\2\12\uffff\1\7",
            "\1\4\1\2\1\uffff\1\4\6\uffff\1\4\4\uffff\1\4\1\uffff\1\4\16"+
            "\uffff\1\4\4\uffff\1\2\7\4\2\uffff\1\5\6\4\4\uffff\1\2\1\uffff"+
            "\1\4\14\uffff\16\4\2\uffff\5\4\1\uffff\1\4",
            "\2\4\1\2\43\uffff\1\2\11\uffff\1\2\12\uffff\1\2"
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "2713:1: (this_func_eval_0= rulefunc_eval | rulecol_ref )";
        }
    }
    static final String DFA63_eotS =
        "\14\uffff";
    static final String DFA63_eofS =
        "\1\1\3\uffff\1\13\7\uffff";
    static final String DFA63_minS =
        "\1\10\3\uffff\1\10\7\uffff";
    static final String DFA63_maxS =
        "\1\106\3\uffff\1\106\7\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\uffff\1\3\1\4\1\6\1\7\1\10\1\2\1\5";
    static final String DFA63_specialS =
        "\14\uffff}>";
    static final String[] DFA63_transitionS = {
            "\2\3\1\5\1\uffff\2\3\5\uffff\1\1\44\uffff\1\6\1\uffff\1\11\10"+
            "\uffff\1\4\1\2\1\7\1\10",
            "",
            "",
            "",
            "\2\13\1\12\1\uffff\2\13\5\uffff\1\13\44\uffff\1\13\1\uffff"+
            "\1\13\10\uffff\4\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "()+ loopback of 3876:1: (kw= 'ALL' | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= '.' | kw= '$' | kw= '/' | kw= '\\\\' | kw= '-' )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleQuery130 = new BitSet(new long[]{0x80003C0000000C02L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineStatement_in_ruleStatement225 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleLoadStatement_in_ruleStatement252 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleForeachStatement_in_ruleStatement281 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleFilterStatement_in_ruleStatement308 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleGroupByStatement_in_ruleStatement335 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleOrderStatement_in_ruleStatement362 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleLimitStatement_in_ruleStatement389 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleDistinctStatement_in_ruleStatement416 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleCrossStatement_in_ruleStatement443 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleStatement470 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleCoGroupByStatement_in_ruleStatement497 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_ruleStatement524 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_ruleParallelClause_in_ruleStatement541 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleMrStatement_in_ruleStatement571 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSplitStatement_in_ruleStatement598 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleUnionStatement_in_ruleStatement625 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSampleStatement_in_ruleStatement652 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleStoreStatement_in_ruleStatement679 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDumpStatement_in_ruleStatement706 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleDescribeStatement_in_ruleStatement733 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleExplainStatement_in_ruleStatement760 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStatement772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentStatement_in_ruleStatement795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineStatement_in_entryRuleDefineStatement830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineStatement840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterClause_in_ruleDefineStatement881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineClause_in_ruleDefineStatement908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultClause_in_ruleDefineStatement935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclareClause_in_ruleDefineStatement962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadStatement_in_entryRuleLoadStatement997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadStatement1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleLoadStatement1053 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLoadStatement1065 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLoadStatement1077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLoadStatement1088 = new BitSet(new long[]{0x2000000004000002L});
    public static final BitSet FOLLOW_ruleLoadUsing_in_ruleLoadStatement1104 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAsClause_in_ruleLoadStatement1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachStatement_in_entryRuleForeachStatement1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachStatement1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleForeachStatement1215 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleForeachStatement1227 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleForeachStatement1239 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleForeachStatement1260 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008000L});
    public static final BitSet FOLLOW_rulenested_blk_in_ruleForeachStatement1283 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleForeachStatement1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_clause_in_ruleForeachStatement1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterStatement_in_entryRuleFilterStatement1363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterStatement1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleFilterStatement1419 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFilterStatement1431 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFilterStatement1443 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleFilterStatement1464 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFilterStatement1476 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleFilterStatement1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByStatement_in_entryRuleGroupByStatement1533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByStatement1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleGroupByStatement1589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGroupByStatement1601 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGroupByStatement1613 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleGroupByStatement1634 = new BitSet(new long[]{0x0000000001000000L,0x0000008000000010L});
    public static final BitSet FOLLOW_rulegroup_item_list_in_ruleGroupByStatement1655 = new BitSet(new long[]{0x0000000004000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_26_in_ruleGroupByStatement1668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulegroup_type_in_ruleGroupByStatement1684 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleGroupByStatement1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoGroupByStatement_in_entryRuleCoGroupByStatement1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoGroupByStatement1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCoGroupByStatement1795 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCoGroupByStatement1807 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCoGroupByStatement1819 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulejoin_sub_clause_in_ruleCoGroupByStatement1840 = new BitSet(new long[]{0x0000000004000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_26_in_ruleCoGroupByStatement1853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_COGROUP_TYPE_in_ruleCoGroupByStatement1864 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleCoGroupByStatement1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderStatement_in_entryRuleOrderStatement1919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderStatement1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleOrderStatement1975 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOrderStatement1987 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOrderStatement1999 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleOrderStatement2020 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOrderStatement2032 = new BitSet(new long[]{0x1180400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleorder_by_clause_in_ruleOrderStatement2048 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleOrderStatement2060 = new BitSet(new long[]{0x0100000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleOrderStatement2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrossStatement_in_entryRuleCrossStatement2113 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrossStatement2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCrossStatement2169 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCrossStatement2181 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCrossStatement2193 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulerel_list_in_ruleCrossStatement2214 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleCrossStatement2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionStatement_in_entryRuleUnionStatement2268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionStatement2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleUnionStatement2324 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUnionStatement2336 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUnionStatement2348 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleUnionStatement2360 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulerel_list_in_ruleUnionStatement2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement2417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleJoinStatement2473 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleJoinStatement2485 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleJoinStatement2497 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulejoin_sub_clause_in_ruleJoinStatement2518 = new BitSet(new long[]{0x0000000004000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_26_in_ruleJoinStatement2531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulejoin_type_in_ruleJoinStatement2547 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleJoinStatement2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimitStatement_in_entryRuleLimitStatement2602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimitStatement2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleLimitStatement2658 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLimitStatement2670 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleLimitStatement2682 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleLimitStatement2703 = new BitSet(new long[]{0x0000000000003300L,0x0000000000000008L});
    public static final BitSet FOLLOW_rulescalarInt_in_ruleLimitStatement2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSampleStatement_in_entryRuleSampleStatement2754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSampleStatement2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleSampleStatement2810 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSampleStatement2822 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSampleStatement2834 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleSampleStatement2855 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_DOUBLENUMBER_in_ruleSampleStatement2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistinctStatement_in_entryRuleDistinctStatement2901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistinctStatement2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDistinctStatement2957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDistinctStatement2969 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDistinctStatement2981 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleDistinctStatement3002 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleDistinctStatement3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement3056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamStatement3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleStreamStatement3112 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStreamStatement3124 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleStreamStatement3136 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleStreamStatement3157 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleStreamStatement3169 = new BitSet(new long[]{0x0000000002000480L});
    public static final BitSet FOLLOW_RULE_EXECCOMMAND_in_ruleStreamStatement3181 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleStreamStatement3202 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleAsClause_in_ruleStreamStatement3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMrStatement_in_entryRuleMrStatement3256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMrStatement3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleMrStatement3312 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMrStatement3324 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMrStatement3336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMrStatement3347 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleStoreStatement_in_ruleMrStatement3368 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleLoadStatement_in_ruleMrStatement3388 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_EXECCOMMAND_in_ruleMrStatement3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitStatement_in_entryRuleSplitStatement3437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitStatement3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleSplitStatement3493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSplitStatement3505 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSplitStatement3517 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleSplitStatement3538 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSplitStatement3550 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_rulesplit_branch_in_ruleSplitStatement3571 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSplitStatement3584 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_rulesplit_branch_in_ruleSplitStatement3605 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleStoreStatement_in_entryRuleStoreStatement3643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStoreStatement3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleStoreStatement3690 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleStoreStatement3711 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleStoreStatement3723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStoreStatement3734 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleStoreStatement3746 = new BitSet(new long[]{0x0100000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleStoreStatement3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribeStatement_in_entryRuleDescribeStatement3799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescribeStatement3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDescribeStatement3846 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleDescribeStatement3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplainStatement_in_entryRuleExplainStatement3903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplainStatement3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleExplainStatement3950 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleExplainStatement3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDumpStatement_in_entryRuleDumpStatement4007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDumpStatement4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDumpStatement4054 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleDumpStatement4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition4111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleCondition4159 = new BitSet(new long[]{0x0000400000000000L,0x000000000002FF80L});
    public static final BitSet FOLLOW_ruleType_in_ruleCondition4175 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCondition4186 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleOrCondition_in_ruleCondition4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrCondition_in_entryRuleOrCondition4245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrCondition4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndCondition_in_ruleOrCondition4302 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOrCondition4323 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleAndCondition_in_ruleOrCondition4344 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleAndCondition_in_entryRuleAndCondition4382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndCondition4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_ruleAndCondition4439 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAndCondition4460 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_ruleAndCondition4481 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryCondition4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUnaryCondition4567 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4589 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_50_in_ruleUnaryCondition4601 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4622 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleUnaryCondition4634 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4655 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleUnaryCondition4669 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUnaryCondition4691 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTE_in_ruleUnaryCondition4744 = new BitSet(new long[]{0x0800000000000002L,0x000000003FFC0000L});
    public static final BitSet FOLLOW_rulerel_op_in_ruleUnaryCondition4769 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleTE_in_ruleUnaryCondition4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTE_in_entryRuleTE4828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTE4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTE4885 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTE4897 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_ruleTE4910 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleTE4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunc_eval_in_entryRulefunc_eval4962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunc_eval4972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncName_in_rulefunc_eval5013 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_rulefunc_eval5033 = new BitSet(new long[]{0x15C0C00002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulereal_arg_list_in_rulefunc_eval5054 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulefunc_eval5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_arg_list_in_entryRulereal_arg_list5103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal_arg_list5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_arg_in_rulereal_arg_list5159 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_rulereal_arg_list5172 = new BitSet(new long[]{0x15C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulereal_arg_in_rulereal_arg_list5193 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rulereal_arg_in_entryRulereal_arg5231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal_arg5241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rulereal_arg5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_rulereal_arg5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExpression5392 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleExpression5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulti_expr_in_ruleAddExpression5508 = new BitSet(new long[]{0x0410000000000002L});
    public static final BitSet FOLLOW_rulePLUS_in_ruleAddExpression5525 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleMINUS_in_ruleAddExpression5546 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulemulti_expr_in_ruleAddExpression5567 = new BitSet(new long[]{0x0410000000000002L});
    public static final BitSet FOLLOW_rulemulti_expr_in_entryRulemulti_expr5605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulti_expr5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecast_expr_in_rulemulti_expr5662 = new BitSet(new long[]{0x1000000000000002L,0x0000000080000020L});
    public static final BitSet FOLLOW_ruleSTAR_in_rulemulti_expr5679 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleDIV_in_rulemulti_expr5700 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulePERCENT_in_rulemulti_expr5721 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulecast_expr_in_rulemulti_expr5742 = new BitSet(new long[]{0x1000000000000002L,0x0000000080000020L});
    public static final BitSet FOLLOW_rulecast_expr_in_entryRulecast_expr5780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecast_expr5790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expr_in_rulecast_expr5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expr_in_entryRuleunary_expr5870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_expr5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_eval_in_ruleunary_expr5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleneg_expr_in_ruleunary_expr5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_eval_in_entryRuleexpr_eval5989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr_eval5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconst_expr_in_ruleexpr_eval6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevar_expr_in_ruleexpr_eval6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevar_expr_in_entryRulevar_expr6102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevar_expr6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprojectable_expr_in_rulevar_expr6159 = new BitSet(new long[]{0x0300000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruledot_proj_in_rulevar_expr6175 = new BitSet(new long[]{0x0300000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_rulepound_proj_in_rulevar_expr6196 = new BitSet(new long[]{0x0300000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleprojectable_expr_in_entryRuleprojectable_expr6233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprojectable_expr6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunc_eval_in_ruleprojectable_expr6290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_ref_in_ruleprojectable_expr6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledot_proj_in_entryRuledot_proj6347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledot_proj6358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruledot_proj6397 = new BitSet(new long[]{0x0180000002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_57_in_ruledot_proj6416 = new BitSet(new long[]{0x0180000002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulecol_alias_or_index_in_ruledot_proj6439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_alias_or_index_in_entryRulecol_alias_or_index6485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_alias_or_index6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_alias_in_rulecol_alias_or_index6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_index_in_rulecol_alias_or_index6576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_alias_in_entryRulecol_alias6622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_alias6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulecol_alias6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_index_in_entryRulecol_index6724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_index6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOLLAR_in_rulecol_index6782 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rulecol_index6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulecol_index6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepound_proj_in_entryRulepound_proj6876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepound_proj6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOUND_in_rulepound_proj6934 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulepound_proj6955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rulepound_proj6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleneg_expr_in_entryRuleneg_expr7022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleneg_expr7032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleneg_expr7069 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulecast_expr_in_ruleneg_expr7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_in_entryRulerel_op7127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_eq_in_rulerel_op7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_ne_in_rulerel_op7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gt_in_rulerel_op7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gte_in_rulerel_op7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lt_in_rulerel_op7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lte_in_rulerel_op7350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulerel_op7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_eq_in_entryRulerel_op_eq7415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_eq7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_EQ_in_rulerel_op_eq7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_EQ_in_rulerel_op_eq7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_ne_in_entryRulerel_op_ne7552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_ne7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_NE_in_rulerel_op_ne7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_NE_in_rulerel_op_ne7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gt_in_entryRulerel_op_gt7689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_gt7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GT_in_rulerel_op_gt7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GT_in_rulerel_op_gt7780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gte_in_entryRulerel_op_gte7826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_gte7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GTE_in_rulerel_op_gte7884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GTE_in_rulerel_op_gte7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lt_in_entryRulerel_op_lt7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_lt7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LT_in_rulerel_op_lt8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LT_in_rulerel_op_lt8054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lte_in_entryRulerel_op_lte8100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_lte8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LTE_in_rulerel_op_lte8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LTE_in_rulerel_op_lte8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasType_in_entryRuleAliasType8236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasType8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasType8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlattenGeneratedItem_in_entryRuleFlattenGeneratedItem8325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlattenGeneratedItem8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleFlattenGeneratedItem8383 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFlattenGeneratedItem8400 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFlattenGeneratedItem8414 = new BitSet(new long[]{0x0000400002000400L});
    public static final BitSet FOLLOW_ruleFieldDef_in_ruleFlattenGeneratedItem8431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldFefList_in_ruleFlattenGeneratedItem8452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentStatement_in_entryRuleCommentStatement8491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentStatement8502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleCommentStatement8541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias8586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlias8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelClause_in_entryRuleParallelClause8681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelClause8692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleParallelClause8730 = new BitSet(new long[]{0x0000000000003300L,0x0000000000000008L});
    public static final BitSet FOLLOW_rulescalarInt_in_ruleParallelClause8752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterClause_in_entryRuleRegisterClause8798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisterClause8809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRegisterClause8847 = new BitSet(new long[]{0x0500000000003700L,0x0000000000000078L});
    public static final BitSet FOLLOW_rulePathClause_in_ruleRegisterClause8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultClause_in_entryRuleDefaultClause8914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultClause8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDefaultClause8961 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDefaultClause8982 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefaultClause8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclareClause_in_entryRuleDeclareClause9028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclareClause9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDeclareClause9075 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDeclareClause9096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclareClause9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineClause_in_entryRuleDefineClause9142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineClause9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDefineClause9189 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDefineClause9210 = new BitSet(new long[]{0x0100000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleDefineClause9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadUsing_in_entryRuleLoadUsing9262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadUsing9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLoadUsing9311 = new BitSet(new long[]{0x0100000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleLoadUsing9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncClause_in_entryRuleFuncClause9379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncClause9390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncName_in_ruleFuncClause9437 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFuncClause9455 = new BitSet(new long[]{0x0000820000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFuncClause9471 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_41_in_ruleFuncClause9492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFuncClause9507 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_47_in_ruleFuncClause9527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncName_in_entryRuleFuncName9568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncName9579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuncName9619 = new BitSet(new long[]{0x0100000000000402L,0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_ruleFuncName9643 = new BitSet(new long[]{0x0100000000000402L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleFuncName9662 = new BitSet(new long[]{0x0100000000000402L,0x0000000000000008L});
    public static final BitSet FOLLOW_rulePathClause_in_entryRulePathClause9704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathClause9715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePathClause9753 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_rulescalar_in_rulePathClause9781 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathClause9807 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_56_in_rulePathClause9831 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_67_in_rulePathClause9850 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_69_in_rulePathClause9869 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_70_in_rulePathClause9888 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_58_in_rulePathClause9907 = new BitSet(new long[]{0x0500000000003702L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleAsClause_in_entryRuleAsClause9949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsClause9960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAsClause9998 = new BitSet(new long[]{0x0000400000000400L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAliasDef_in_ruleAsClause10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDefList_in_ruleAsClause10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDef_in_entryRuleAliasDef10101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDef10112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleAliasDef10159 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAliasDef10178 = new BitSet(new long[]{0x0000400000000000L,0x000000000002FF80L});
    public static final BitSet FOLLOW_ruleType_in_ruleAliasDef10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDefList_in_entryRuleAliasDefList10248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDefList10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAliasDefList10297 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasDef_in_ruleAliasDefList10319 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_41_in_ruleAliasDefList10338 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasDef_in_ruleAliasDefList10360 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_47_in_ruleAliasDefList10380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_entryRuleIDENTIFIER10421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDENTIFIER10432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDENTIFIER10471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldDef_in_entryRuleFieldDef10516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldDef10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFieldDef10574 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFieldDef10593 = new BitSet(new long[]{0x0000400000000000L,0x000000000002FF80L});
    public static final BitSet FOLLOW_ruleType_in_ruleFieldDef10615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldFefList_in_entryRuleFieldFefList10663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldFefList10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleFieldFefList10712 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_ruleFieldDef_in_ruleFieldFefList10734 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_41_in_ruleFieldFefList10753 = new BitSet(new long[]{0x0000000002000400L});
    public static final BitSet FOLLOW_ruleFieldDef_in_ruleFieldFefList10775 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_47_in_ruleFieldFefList10795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType10836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType10847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType10894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_ruleType10927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleType10960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebag_type_in_ruleType10993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType11039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType11050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSimpleType11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSimpleType11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSimpleType11126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleSimpleType11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleSimpleType11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSimpleType11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_entryRuleTupleType11224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleType11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleTupleType11274 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleAliasDefList_in_ruleTupleType11298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebag_type_in_entryRulebag_type11344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebag_type11355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulebag_type11394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulebag_type11409 = new BitSet(new long[]{0x0000400002000400L,0x0000000000012000L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulebag_type11433 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_rulebag_type11451 = new BitSet(new long[]{0x0000400000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleTupleType_in_rulebag_type11475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rulebag_type11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType11536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleMapType11584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_EQ_in_entryRuleSTR_OP_EQ11626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_EQ11637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSTR_OP_EQ11674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GT_in_entryRuleSTR_OP_GT11714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_GT11725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSTR_OP_GT11762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LT_in_entryRuleSTR_OP_LT11802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_LT11813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSTR_OP_LT11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GTE_in_entryRuleSTR_OP_GTE11890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_GTE11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleSTR_OP_GTE11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LTE_in_entryRuleSTR_OP_LTE11978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_LTE11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleSTR_OP_LTE12026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_NE_in_entryRuleSTR_OP_NE12066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_NE12077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleSTR_OP_NE12114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_EQ_in_entryRuleNUM_OP_EQ12156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_EQ12167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleNUM_OP_EQ12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LT_in_entryRuleNUM_OP_LT12244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_LT12255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleNUM_OP_LT12292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LTE_in_entryRuleNUM_OP_LTE12332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_LTE12343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleNUM_OP_LTE12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GT_in_entryRuleNUM_OP_GT12420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_GT12431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleNUM_OP_GT12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GTE_in_entryRuleNUM_OP_GTE12508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_GTE12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleNUM_OP_GTE12556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_NE_in_entryRuleNUM_OP_NE12596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_NE12607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleNUM_OP_NE12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEMI_COLON_in_entryRuleSEMI_COLON12684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEMI_COLON12695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSEMI_COLON12732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOUND_in_entryRulePOUND12784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOUND12795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rulePOUND12832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMMA_in_entryRuleCOMMA12874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMMA12885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCOMMA12922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIV_in_entryRuleDIV12964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIV12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDIV13012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENT_in_entryRulePERCENT13052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENT13063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rulePERCENT13100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLUS_in_entryRulePLUS13140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLUS13151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePLUS13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMINUS_in_entryRuleMINUS13228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMINUS13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleMINUS13276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_entryRuleSTAR13316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTAR13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleSTAR13364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOLLAR_in_entryRuleDOLLAR13406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOLLAR13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDOLLAR13454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_type_in_entryRulegroup_type13494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_type13505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulegroup_type13544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_item_list_in_entryRulegroup_item_list13588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_item_list13598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_item_in_rulegroup_item_list13645 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleCOMMA_in_rulegroup_item_list13661 = new BitSet(new long[]{0x0000000001000000L,0x0000008000000010L});
    public static final BitSet FOLLOW_rulegroup_item_in_rulegroup_item_list13681 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleorder_by_clause_in_entryRuleorder_by_clause13720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorder_by_clause13731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleorder_by_clause13779 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_96_in_ruleorder_by_clause13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleorder_by_clause13817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorder_col_list_in_ruleorder_by_clause13848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorder_col_list_in_entryRuleorder_col_list13894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorder_col_list13905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorder_col_in_ruleorder_col_list13952 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleorder_col_list13971 = new BitSet(new long[]{0x1180400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleorder_col_in_ruleorder_col_list13993 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleorder_col_in_entryRuleorder_col14041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorder_col14052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_ref_in_ruleorder_col14100 = new BitSet(new long[]{0x0000000000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_96_in_ruleorder_col14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleorder_col14138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleorder_col14161 = new BitSet(new long[]{0x0180000002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulecol_ref_in_ruleorder_col14183 = new BitSet(new long[]{0x0000800000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_96_in_ruleorder_col14202 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_97_in_ruleorder_col14221 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleorder_col14236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepartition_clause_in_entryRulepartition_clause14278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepartition_clause14289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rulepartition_clause14327 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulepartition_clause14340 = new BitSet(new long[]{0x0100000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleFuncName_in_rulepartition_clause14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_list_in_entryRulerel_list14407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_list14417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasType_in_rulerel_list14463 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_rulerel_list14476 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleAliasType_in_rulerel_list14497 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rulejoin_type_in_entryRulejoin_type14536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_type14547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulejoin_type14586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_sub_clause_in_entryRulejoin_sub_clause14630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_sub_clause14640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_item_in_rulejoin_sub_clause14687 = new BitSet(new long[]{0x0000020000000000L,0x0000007800000000L});
    public static final BitSet FOLLOW_99_in_rulejoin_sub_clause14699 = new BitSet(new long[]{0x0000020000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_100_in_rulejoin_sub_clause14717 = new BitSet(new long[]{0x0000020000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_101_in_rulejoin_sub_clause14735 = new BitSet(new long[]{0x0000020000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_rulejoin_sub_clause14750 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulejoin_sub_clause14765 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rulejoin_item_in_rulejoin_sub_clause14786 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rulejoin_item_in_entryRulejoin_item14824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_item14834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasType_in_rulejoin_item14880 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rulejoin_group_by_clause_in_rulejoin_item14901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_item_in_entryRulegroup_item14937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_item14947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulegroup_item14986 = new BitSet(new long[]{0x15C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_list_in_rulegroup_item15008 = new BitSet(new long[]{0x0000000000000002L,0x0000014000000000L});
    public static final BitSet FOLLOW_68_in_rulegroup_item15026 = new BitSet(new long[]{0x0000000000000002L,0x0000014000000000L});
    public static final BitSet FOLLOW_103_in_rulegroup_item15044 = new BitSet(new long[]{0x0000000000000002L,0x0000014000000000L});
    public static final BitSet FOLLOW_104_in_rulegroup_item15058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rulegroup_item15076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_clause_in_entryRulejoin_group_by_clause15114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_group_by_clause15124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulejoin_group_by_clause15161 = new BitSet(new long[]{0x15C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_list_in_rulejoin_group_by_clause15183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_list_in_entryRulejoin_group_by_expr_list15218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_group_by_expr_list15228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulejoin_group_by_expr_list15293 = new BitSet(new long[]{0x15C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15314 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_41_in_rulejoin_group_by_expr_list15327 = new BitSet(new long[]{0x15C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15348 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_47_in_rulejoin_group_by_expr_list15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_entryRulejoin_group_by_expr15399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_group_by_expr15409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulejoin_group_by_expr15456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_rulejoin_group_by_expr15477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_blk_in_entryRulenested_blk15512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_blk15522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rulenested_blk15559 = new BitSet(new long[]{0x0000000000000400L,0x0000020000008000L});
    public static final BitSet FOLLOW_rulenested_command_list_in_rulenested_blk15581 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008000L});
    public static final BitSet FOLLOW_rulegenerate_clause_in_rulenested_blk15601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulenested_blk15613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rulenested_blk15625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_clause_in_entryRulegenerate_clause15661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_clause15671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rulegenerate_clause15708 = new BitSet(new long[]{0x15C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15729 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_rulegenerate_clause15742 = new BitSet(new long[]{0x15C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15763 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rulenested_command_list_in_entryRulenested_command_list15801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_command_list15811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_command_in_rulenested_command_list15867 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSEMI_COLON_in_rulenested_command_list15883 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rulenested_command_in_entryRulenested_command15920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_command15930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_rulenested_command15971 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulenested_command15982 = new BitSet(new long[]{0x05C0400A12803710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulenested_op_in_rulenested_command16004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_op_in_entryRulenested_op16039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_op16049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedFilter_in_rulenested_op16096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_sort_in_rulenested_op16123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_distinct_in_rulenested_op16150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_limit_in_rulenested_op16177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulenested_op16196 = new BitSet(new long[]{0x0000400000000000L,0x000000000002FF80L});
    public static final BitSet FOLLOW_ruleType_in_rulenested_op16212 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulenested_op16223 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleAddExpression_in_rulenested_op16247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedFilter_in_entryRuleNestedFilter16283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedFilter16293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleNestedFilter16330 = new BitSet(new long[]{0x0180000002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulevar_expr_in_ruleNestedFilter16351 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNestedFilter16363 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleNestedFilter16384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_sort_in_entryRulenested_sort16420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_sort16430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulenested_sort16467 = new BitSet(new long[]{0x0180000002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulevar_expr_in_rulenested_sort16489 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulenested_sort16500 = new BitSet(new long[]{0x1180400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleorder_by_clause_in_rulenested_sort16516 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_rulenested_sort16528 = new BitSet(new long[]{0x0100000000000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleFuncClause_in_rulenested_sort16544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_distinct_in_entryRulenested_distinct16581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_distinct16591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulenested_distinct16628 = new BitSet(new long[]{0x0180000002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulevar_expr_in_rulenested_distinct16650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_limit_in_entryRulenested_limit16685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_limit16695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulenested_limit16732 = new BitSet(new long[]{0x0180000002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_rulevar_expr_in_rulenested_limit16754 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_RULE_INT_in_rulenested_limit16765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGINTEGER_in_rulenested_limit16781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesplit_branch_in_entryRulesplit_branch16817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesplit_branch16827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulesplit_branch16868 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_rulesplit_branch16879 = new BitSet(new long[]{0x05C0400002003710L,0x0000080000000008L});
    public static final BitSet FOLLOW_ruleCondition_in_rulesplit_branch16901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_ref_in_entryRulecol_ref16937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_ref16948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealias_col_ref_in_rulecol_ref16995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollar_col_ref_in_rulecol_ref17028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealias_col_ref_in_entryRulealias_col_ref17074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulealias_col_ref17085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulealias_col_ref17123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulealias_col_ref17151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollar_col_ref_in_entryRuledollar_col_ref17197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledollar_col_ref17208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOLLAR_in_ruledollar_col_ref17255 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruledollar_col_ref17275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconst_expr_in_entryRuleconst_expr17321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconst_expr17332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_in_ruleconst_expr17378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral17423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleliteral17434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalar_in_ruleliteral17481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral17507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleliteral17531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleliteral17550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalar_in_entryRulescalar17591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulescalar17602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATINGPOINT_in_rulescalar17642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalarInt_in_rulescalar17675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalarInt_in_entryRulescalarInt17721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulescalarInt17732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rulescalarInt17772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulescalarInt17798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGINTEGER_in_rulescalarInt17824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulescalarInt17849 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ID_in_rulescalarInt17864 = new BitSet(new long[]{0x0000000000000002L});

}