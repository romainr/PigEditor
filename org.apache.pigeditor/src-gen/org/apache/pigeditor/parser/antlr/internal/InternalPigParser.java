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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_88", "KEYWORD_89", "KEYWORD_90", "KEYWORD_91", "KEYWORD_81", "KEYWORD_82", "KEYWORD_83", "KEYWORD_84", "KEYWORD_85", "KEYWORD_86", "KEYWORD_87", "KEYWORD_76", "KEYWORD_77", "KEYWORD_78", "KEYWORD_79", "KEYWORD_80", "KEYWORD_71", "KEYWORD_72", "KEYWORD_73", "KEYWORD_74", "KEYWORD_75", "KEYWORD_57", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "RULE_COGROUP_TYPE", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_LETTER", "RULE_SPECIALCHAR", "RULE_FLOATINGPOINT", "RULE_INT", "RULE_LONGINTEGER", "RULE_DOUBLENUMBER", "RULE_EXECCOMMAND", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=105;
    public static final int RULE_ANY_OTHER=109;
    public static final int KEYWORD_56=47;
    public static final int KEYWORD_55=46;
    public static final int KEYWORD_54=45;
    public static final int KEYWORD_53=44;
    public static final int KEYWORD_52=43;
    public static final int KEYWORD_51=42;
    public static final int KEYWORD_50=41;
    public static final int EOF=-1;
    public static final int KEYWORD_59=27;
    public static final int KEYWORD_58=26;
    public static final int KEYWORD_57=25;
    public static final int KEYWORD_65=33;
    public static final int KEYWORD_64=32;
    public static final int KEYWORD_67=35;
    public static final int KEYWORD_66=34;
    public static final int KEYWORD_61=29;
    public static final int KEYWORD_60=28;
    public static final int KEYWORD_63=31;
    public static final int KEYWORD_62=30;
    public static final int KEYWORD_69=37;
    public static final int KEYWORD_68=36;
    public static final int KEYWORD_30=65;
    public static final int KEYWORD_34=69;
    public static final int KEYWORD_33=68;
    public static final int KEYWORD_32=67;
    public static final int KEYWORD_31=66;
    public static final int KEYWORD_38=48;
    public static final int KEYWORD_37=72;
    public static final int KEYWORD_36=71;
    public static final int KEYWORD_35=70;
    public static final int RULE_LETTER=98;
    public static final int RULE_COGROUP_TYPE=95;
    public static final int RULE_ML_COMMENT=107;
    public static final int KEYWORD_39=49;
    public static final int RULE_STRING=106;
    public static final int KEYWORD_41=51;
    public static final int KEYWORD_40=50;
    public static final int KEYWORD_43=53;
    public static final int KEYWORD_42=52;
    public static final int KEYWORD_45=55;
    public static final int KEYWORD_44=54;
    public static final int KEYWORD_47=57;
    public static final int RULE_DIGIT=97;
    public static final int KEYWORD_46=56;
    public static final int KEYWORD_49=40;
    public static final int KEYWORD_48=39;
    public static final int RULE_LONGINTEGER=102;
    public static final int KEYWORD_90=6;
    public static final int KEYWORD_19=91;
    public static final int KEYWORD_17=89;
    public static final int KEYWORD_91=7;
    public static final int KEYWORD_18=90;
    public static final int KEYWORD_15=87;
    public static final int KEYWORD_16=88;
    public static final int KEYWORD_13=85;
    public static final int KEYWORD_14=86;
    public static final int KEYWORD_11=83;
    public static final int KEYWORD_12=84;
    public static final int KEYWORD_10=82;
    public static final int KEYWORD_6=78;
    public static final int KEYWORD_7=79;
    public static final int KEYWORD_8=80;
    public static final int KEYWORD_9=81;
    public static final int KEYWORD_28=63;
    public static final int KEYWORD_29=64;
    public static final int RULE_INT=101;
    public static final int KEYWORD_24=59;
    public static final int KEYWORD_25=60;
    public static final int KEYWORD_26=61;
    public static final int KEYWORD_27=62;
    public static final int KEYWORD_20=92;
    public static final int KEYWORD_21=93;
    public static final int KEYWORD_22=94;
    public static final int KEYWORD_23=58;
    public static final int KEYWORD_79=18;
    public static final int KEYWORD_71=20;
    public static final int RULE_EXECCOMMAND=104;
    public static final int KEYWORD_72=21;
    public static final int KEYWORD_73=22;
    public static final int KEYWORD_74=23;
    public static final int KEYWORD_75=24;
    public static final int KEYWORD_76=15;
    public static final int KEYWORD_77=16;
    public static final int KEYWORD_78=17;
    public static final int KEYWORD_1=73;
    public static final int RULE_DOUBLENUMBER=103;
    public static final int KEYWORD_5=77;
    public static final int KEYWORD_4=76;
    public static final int KEYWORD_3=75;
    public static final int KEYWORD_70=38;
    public static final int KEYWORD_2=74;
    public static final int RULE_SL_COMMENT=96;
    public static final int RULE_FLOATINGPOINT=100;
    public static final int KEYWORD_84=11;
    public static final int KEYWORD_85=12;
    public static final int KEYWORD_82=9;
    public static final int KEYWORD_83=10;
    public static final int KEYWORD_88=4;
    public static final int KEYWORD_89=5;
    public static final int KEYWORD_86=13;
    public static final int KEYWORD_87=14;
    public static final int KEYWORD_81=8;
    public static final int KEYWORD_80=19;
    public static final int RULE_SPECIALCHAR=99;
    public static final int RULE_WS=108;

    // delegates
    // delegators


        public InternalPigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPigParser.tokenNames; }
    public String getGrammarFileName() { return "../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g"; }




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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:61:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:62:2: (iv_ruleQuery= ruleQuery EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:63:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery67);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery77); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:70:1: ruleQuery returns [EObject current=null] : ( (lv_elements_0_0= ruleStatement ) )* ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:73:28: ( ( (lv_elements_0_0= ruleStatement ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:74:1: ( (lv_elements_0_0= ruleStatement ) )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:74:1: ( (lv_elements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_81 && LA1_0<=KEYWORD_83)||LA1_0==KEYWORD_87||LA1_0==KEYWORD_77||LA1_0==KEYWORD_71||LA1_0==KEYWORD_67||LA1_0==KEYWORD_49||LA1_0==RULE_SL_COMMENT||LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:75:1: (lv_elements_0_0= ruleStatement )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:75:1: (lv_elements_0_0= ruleStatement )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:76:3: lv_elements_0_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQueryAccess().getElementsStatementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleQuery122);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:101:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement157);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement167); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:109:1: ruleStatement returns [EObject current=null] : ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= KEYWORD_13 ) | ruleCommentStatement ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:112:28: ( ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= KEYWORD_13 ) | ruleCommentStatement ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:113:1: ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= KEYWORD_13 ) | ruleCommentStatement )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:113:1: ( ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= KEYWORD_13 ) | ruleCommentStatement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=KEYWORD_81 && LA5_0<=KEYWORD_83)||LA5_0==KEYWORD_87||LA5_0==KEYWORD_77||LA5_0==KEYWORD_71||LA5_0==KEYWORD_67||LA5_0==KEYWORD_49||LA5_0==RULE_ID) ) {
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:113:2: ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= KEYWORD_13 )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:113:2: ( (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= KEYWORD_13 )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:113:3: (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement ) otherlv_21= KEYWORD_13
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:113:3: (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement )
                    int alt4=11;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:114:5: this_DefineStatement_0= ruleDefineStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getDefineStatementParserRuleCall_0_0_0()); 
                                
                            pushFollow(FOLLOW_ruleDefineStatement_in_ruleStatement216);
                            this_DefineStatement_0=ruleDefineStatement();

                            state._fsp--;


                                    current = this_DefineStatement_0;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:124:5: this_LoadStatement_1= ruleLoadStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getLoadStatementParserRuleCall_0_0_1()); 
                                
                            pushFollow(FOLLOW_ruleLoadStatement_in_ruleStatement243);
                            this_LoadStatement_1=ruleLoadStatement();

                            state._fsp--;


                                    current = this_LoadStatement_1;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 3 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:133:6: ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:133:6: ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:133:7: (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )?
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:133:7: (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement )
                            int alt2=10;
                            alt2 = dfa2.predict(input);
                            switch (alt2) {
                                case 1 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:134:5: this_ForeachStatement_2= ruleForeachStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getForeachStatementParserRuleCall_0_0_2_0_0()); 
                                        
                                    pushFollow(FOLLOW_ruleForeachStatement_in_ruleStatement272);
                                    this_ForeachStatement_2=ruleForeachStatement();

                                    state._fsp--;


                                            current = this_ForeachStatement_2;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:144:5: this_FilterStatement_3= ruleFilterStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getFilterStatementParserRuleCall_0_0_2_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleFilterStatement_in_ruleStatement299);
                                    this_FilterStatement_3=ruleFilterStatement();

                                    state._fsp--;


                                            current = this_FilterStatement_3;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 3 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:154:5: this_GroupByStatement_4= ruleGroupByStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getGroupByStatementParserRuleCall_0_0_2_0_2()); 
                                        
                                    pushFollow(FOLLOW_ruleGroupByStatement_in_ruleStatement326);
                                    this_GroupByStatement_4=ruleGroupByStatement();

                                    state._fsp--;


                                            current = this_GroupByStatement_4;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 4 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:164:5: this_OrderStatement_5= ruleOrderStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getOrderStatementParserRuleCall_0_0_2_0_3()); 
                                        
                                    pushFollow(FOLLOW_ruleOrderStatement_in_ruleStatement353);
                                    this_OrderStatement_5=ruleOrderStatement();

                                    state._fsp--;


                                            current = this_OrderStatement_5;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 5 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:174:5: this_LimitStatement_6= ruleLimitStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getLimitStatementParserRuleCall_0_0_2_0_4()); 
                                        
                                    pushFollow(FOLLOW_ruleLimitStatement_in_ruleStatement380);
                                    this_LimitStatement_6=ruleLimitStatement();

                                    state._fsp--;


                                            current = this_LimitStatement_6;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 6 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:184:5: this_DistinctStatement_7= ruleDistinctStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getDistinctStatementParserRuleCall_0_0_2_0_5()); 
                                        
                                    pushFollow(FOLLOW_ruleDistinctStatement_in_ruleStatement407);
                                    this_DistinctStatement_7=ruleDistinctStatement();

                                    state._fsp--;


                                            current = this_DistinctStatement_7;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 7 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:194:5: this_CrossStatement_8= ruleCrossStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getCrossStatementParserRuleCall_0_0_2_0_6()); 
                                        
                                    pushFollow(FOLLOW_ruleCrossStatement_in_ruleStatement434);
                                    this_CrossStatement_8=ruleCrossStatement();

                                    state._fsp--;


                                            current = this_CrossStatement_8;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 8 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:204:5: this_JoinStatement_9= ruleJoinStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getJoinStatementParserRuleCall_0_0_2_0_7()); 
                                        
                                    pushFollow(FOLLOW_ruleJoinStatement_in_ruleStatement461);
                                    this_JoinStatement_9=ruleJoinStatement();

                                    state._fsp--;


                                            current = this_JoinStatement_9;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 9 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:214:5: this_CoGroupByStatement_10= ruleCoGroupByStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getCoGroupByStatementParserRuleCall_0_0_2_0_8()); 
                                        
                                    pushFollow(FOLLOW_ruleCoGroupByStatement_in_ruleStatement488);
                                    this_CoGroupByStatement_10=ruleCoGroupByStatement();

                                    state._fsp--;


                                            current = this_CoGroupByStatement_10;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;
                                case 10 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:224:5: this_StreamStatement_11= ruleStreamStatement
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getStreamStatementParserRuleCall_0_0_2_0_9()); 
                                        
                                    pushFollow(FOLLOW_ruleStreamStatement_in_ruleStatement515);
                                    this_StreamStatement_11=ruleStreamStatement();

                                    state._fsp--;


                                            current = this_StreamStatement_11;
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:232:2: ( ruleParallelClause )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==KEYWORD_86) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:233:5: ruleParallelClause
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()); 
                                        
                                    pushFollow(FOLLOW_ruleParallelClause_in_ruleStatement532);
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
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:242:5: this_MrStatement_13= ruleMrStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getMrStatementParserRuleCall_0_0_3()); 
                                
                            pushFollow(FOLLOW_ruleMrStatement_in_ruleStatement562);
                            this_MrStatement_13=ruleMrStatement();

                            state._fsp--;


                                    current = this_MrStatement_13;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 5 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:252:5: this_SplitStatement_14= ruleSplitStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getSplitStatementParserRuleCall_0_0_4()); 
                                
                            pushFollow(FOLLOW_ruleSplitStatement_in_ruleStatement589);
                            this_SplitStatement_14=ruleSplitStatement();

                            state._fsp--;


                                    current = this_SplitStatement_14;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 6 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:262:5: this_UnionStatement_15= ruleUnionStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getUnionStatementParserRuleCall_0_0_5()); 
                                
                            pushFollow(FOLLOW_ruleUnionStatement_in_ruleStatement616);
                            this_UnionStatement_15=ruleUnionStatement();

                            state._fsp--;


                                    current = this_UnionStatement_15;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 7 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:272:5: this_SampleStatement_16= ruleSampleStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getSampleStatementParserRuleCall_0_0_6()); 
                                
                            pushFollow(FOLLOW_ruleSampleStatement_in_ruleStatement643);
                            this_SampleStatement_16=ruleSampleStatement();

                            state._fsp--;


                                    current = this_SampleStatement_16;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 8 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:282:5: this_StoreStatement_17= ruleStoreStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getStoreStatementParserRuleCall_0_0_7()); 
                                
                            pushFollow(FOLLOW_ruleStoreStatement_in_ruleStatement670);
                            this_StoreStatement_17=ruleStoreStatement();

                            state._fsp--;


                                    current = this_StoreStatement_17;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 9 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:292:5: this_DumpStatement_18= ruleDumpStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getDumpStatementParserRuleCall_0_0_8()); 
                                
                            pushFollow(FOLLOW_ruleDumpStatement_in_ruleStatement697);
                            this_DumpStatement_18=ruleDumpStatement();

                            state._fsp--;


                                    current = this_DumpStatement_18;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 10 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:302:5: this_DescribeStatement_19= ruleDescribeStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getDescribeStatementParserRuleCall_0_0_9()); 
                                
                            pushFollow(FOLLOW_ruleDescribeStatement_in_ruleStatement724);
                            this_DescribeStatement_19=ruleDescribeStatement();

                            state._fsp--;


                                    current = this_DescribeStatement_19;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 11 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:312:5: this_ExplainStatement_20= ruleExplainStatement
                            {
                             
                                    newCompositeNode(grammarAccess.getStatementAccess().getExplainStatementParserRuleCall_0_0_10()); 
                                
                            pushFollow(FOLLOW_ruleExplainStatement_in_ruleStatement751);
                            this_ExplainStatement_20=ruleExplainStatement();

                            state._fsp--;


                                    current = this_ExplainStatement_20;
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleStatement764); 

                        	newLeafNode(otherlv_21, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:327:5: ruleCommentStatement
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getCommentStatementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCommentStatement_in_ruleStatement786);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:342:1: entryRuleDefineStatement returns [EObject current=null] : iv_ruleDefineStatement= ruleDefineStatement EOF ;
    public final EObject entryRuleDefineStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:343:2: (iv_ruleDefineStatement= ruleDefineStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:344:2: iv_ruleDefineStatement= ruleDefineStatement EOF
            {
             newCompositeNode(grammarAccess.getDefineStatementRule()); 
            pushFollow(FOLLOW_ruleDefineStatement_in_entryRuleDefineStatement820);
            iv_ruleDefineStatement=ruleDefineStatement();

            state._fsp--;

             current =iv_ruleDefineStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineStatement830); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:351:1: ruleDefineStatement returns [EObject current=null] : ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause ) ;
    public final EObject ruleDefineStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DefineClause_1 = null;

        EObject this_DefaultClause_2 = null;

        EObject this_DeclareClause_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:354:28: ( ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:355:1: ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:355:1: ( ruleRegisterClause | this_DefineClause_1= ruleDefineClause | this_DefaultClause_2= ruleDefaultClause | this_DeclareClause_3= ruleDeclareClause )
            int alt6=4;
            switch ( input.LA(1) ) {
            case KEYWORD_87:
                {
                alt6=1;
                }
                break;
            case KEYWORD_71:
                {
                alt6=2;
                }
                break;
            case KEYWORD_82:
                {
                alt6=3;
                }
                break;
            case KEYWORD_81:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:356:5: ruleRegisterClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getRegisterClauseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRegisterClause_in_ruleDefineStatement871);
                    ruleRegisterClause();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:365:5: this_DefineClause_1= ruleDefineClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getDefineClauseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDefineClause_in_ruleDefineStatement898);
                    this_DefineClause_1=ruleDefineClause();

                    state._fsp--;


                            current = this_DefineClause_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:375:5: this_DefaultClause_2= ruleDefaultClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getDefaultClauseParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDefaultClause_in_ruleDefineStatement925);
                    this_DefaultClause_2=ruleDefaultClause();

                    state._fsp--;


                            current = this_DefaultClause_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:385:5: this_DeclareClause_3= ruleDeclareClause
                    {
                     
                            newCompositeNode(grammarAccess.getDefineStatementAccess().getDeclareClauseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDeclareClause_in_ruleDefineStatement952);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:401:1: entryRuleLoadStatement returns [EObject current=null] : iv_ruleLoadStatement= ruleLoadStatement EOF ;
    public final EObject entryRuleLoadStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:402:2: (iv_ruleLoadStatement= ruleLoadStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:403:2: iv_ruleLoadStatement= ruleLoadStatement EOF
            {
             newCompositeNode(grammarAccess.getLoadStatementRule()); 
            pushFollow(FOLLOW_ruleLoadStatement_in_entryRuleLoadStatement986);
            iv_ruleLoadStatement=ruleLoadStatement();

            state._fsp--;

             current =iv_ruleLoadStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadStatement996); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:410:1: ruleLoadStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_54 this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? ) ;
    public final EObject ruleLoadStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:413:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_54 this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:414:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_54 this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:414:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_54 this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:414:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_54 this_STRING_3= RULE_STRING ( ruleLoadUsing )? ( ruleAsClause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:414:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:415:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:415:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:416:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getLoadStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleLoadStatement1042);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleLoadStatement1055); 

                	newLeafNode(otherlv_1, grammarAccess.getLoadStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleLoadStatement1067); 

                	newLeafNode(otherlv_2, grammarAccess.getLoadStatementAccess().getLOADKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLoadStatement1077); 
             
                newLeafNode(this_STRING_3, grammarAccess.getLoadStatementAccess().getSTRINGTerminalRuleCall_3()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:446:1: ( ruleLoadUsing )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_70) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:447:5: ruleLoadUsing
                    {
                     
                            newCompositeNode(grammarAccess.getLoadStatementAccess().getLoadUsingParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLoadUsing_in_ruleLoadStatement1093);
                    ruleLoadUsing();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:454:3: ( ruleAsClause )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:455:5: ruleAsClause
                    {
                     
                            newCompositeNode(grammarAccess.getLoadStatementAccess().getAsClauseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAsClause_in_ruleLoadStatement1111);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:470:1: entryRuleForeachStatement returns [EObject current=null] : iv_ruleForeachStatement= ruleForeachStatement EOF ;
    public final EObject entryRuleForeachStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:471:2: (iv_ruleForeachStatement= ruleForeachStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:472:2: iv_ruleForeachStatement= ruleForeachStatement EOF
            {
             newCompositeNode(grammarAccess.getForeachStatementRule()); 
            pushFollow(FOLLOW_ruleForeachStatement_in_entryRuleForeachStatement1147);
            iv_ruleForeachStatement=ruleForeachStatement();

            state._fsp--;

             current =iv_ruleForeachStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachStatement1157); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:479:1: ruleForeachStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_78 ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:482:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_78 ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:483:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_78 ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:483:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_78 ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:483:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_78 ( (lv_type_3_0= ruleAliasType ) ) ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:483:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:484:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:484:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:485:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getForeachStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleForeachStatement1203);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleForeachStatement1216); 

                	newLeafNode(otherlv_1, grammarAccess.getForeachStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_ruleForeachStatement1228); 

                	newLeafNode(otherlv_2, grammarAccess.getForeachStatementAccess().getFOREACHKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:511:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:512:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:512:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:513:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getForeachStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleForeachStatement1248);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:529:2: ( ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? ) | ( (lv_items_6_0= rulegenerate_clause ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_21) ) {
                alt10=1;
            }
            else if ( (LA10_0==KEYWORD_85) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:529:3: ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:529:3: ( ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:529:4: ( (lv_items_4_0= rulenested_blk ) ) (otherlv_5= KEYWORD_13 )?
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:529:4: ( (lv_items_4_0= rulenested_blk ) )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:530:1: (lv_items_4_0= rulenested_blk )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:530:1: (lv_items_4_0= rulenested_blk )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:531:3: lv_items_4_0= rulenested_blk
                    {
                     
                    	        newCompositeNode(grammarAccess.getForeachStatementAccess().getItemsNested_blkParserRuleCall_4_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulenested_blk_in_ruleForeachStatement1271);
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

                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:547:2: (otherlv_5= KEYWORD_13 )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==KEYWORD_13) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==KEYWORD_86||LA9_1==KEYWORD_13) ) {
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
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:548:2: otherlv_5= KEYWORD_13
                            {
                            otherlv_5=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleForeachStatement1285); 

                                	newLeafNode(otherlv_5, grammarAccess.getForeachStatementAccess().getSemicolonKeyword_4_0_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:553:6: ( (lv_items_6_0= rulegenerate_clause ) )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:553:6: ( (lv_items_6_0= rulegenerate_clause ) )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:554:1: (lv_items_6_0= rulegenerate_clause )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:554:1: (lv_items_6_0= rulegenerate_clause )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:555:3: lv_items_6_0= rulegenerate_clause
                    {
                     
                    	        newCompositeNode(grammarAccess.getForeachStatementAccess().getItemsGenerate_clauseParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulegenerate_clause_in_ruleForeachStatement1314);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:579:1: entryRuleFilterStatement returns [EObject current=null] : iv_ruleFilterStatement= ruleFilterStatement EOF ;
    public final EObject entryRuleFilterStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:580:2: (iv_ruleFilterStatement= ruleFilterStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:581:2: iv_ruleFilterStatement= ruleFilterStatement EOF
            {
             newCompositeNode(grammarAccess.getFilterStatementRule()); 
            pushFollow(FOLLOW_ruleFilterStatement_in_entryRuleFilterStatement1350);
            iv_ruleFilterStatement=ruleFilterStatement();

            state._fsp--;

             current =iv_ruleFilterStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterStatement1360); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:588:1: ruleFilterStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_73 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ( (lv_cond_5_0= ruleCondition ) ) ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:591:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_73 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ( (lv_cond_5_0= ruleCondition ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:592:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_73 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ( (lv_cond_5_0= ruleCondition ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:592:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_73 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ( (lv_cond_5_0= ruleCondition ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:592:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_73 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ( (lv_cond_5_0= ruleCondition ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:592:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:593:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:593:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:594:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getFilterStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleFilterStatement1406);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleFilterStatement1419); 

                	newLeafNode(otherlv_1, grammarAccess.getFilterStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleFilterStatement1431); 

                	newLeafNode(otherlv_2, grammarAccess.getFilterStatementAccess().getFILTERKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:620:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:621:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:621:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:622:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getFilterStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleFilterStatement1451);
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

            otherlv_4=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleFilterStatement1464); 

                	newLeafNode(otherlv_4, grammarAccess.getFilterStatementAccess().getBYKeyword_4());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:643:1: ( (lv_cond_5_0= ruleCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:644:1: (lv_cond_5_0= ruleCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:644:1: (lv_cond_5_0= ruleCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:645:3: lv_cond_5_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getFilterStatementAccess().getCondConditionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleFilterStatement1484);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:669:1: entryRuleGroupByStatement returns [EObject current=null] : iv_ruleGroupByStatement= ruleGroupByStatement EOF ;
    public final EObject entryRuleGroupByStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupByStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:670:2: (iv_ruleGroupByStatement= ruleGroupByStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:671:2: iv_ruleGroupByStatement= ruleGroupByStatement EOF
            {
             newCompositeNode(grammarAccess.getGroupByStatementRule()); 
            pushFollow(FOLLOW_ruleGroupByStatement_in_entryRuleGroupByStatement1519);
            iv_ruleGroupByStatement=ruleGroupByStatement();

            state._fsp--;

             current =iv_ruleGroupByStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupByStatement1529); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:678:1: ruleGroupByStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_59 ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= KEYWORD_70 rulegroup_type )? ( rulepartition_clause )? ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:681:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_59 ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= KEYWORD_70 rulegroup_type )? ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:682:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_59 ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= KEYWORD_70 rulegroup_type )? ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:682:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_59 ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= KEYWORD_70 rulegroup_type )? ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:682:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_59 ( (lv_type_3_0= ruleAliasType ) ) ( (lv_items_4_0= rulegroup_item_list ) ) (otherlv_5= KEYWORD_70 rulegroup_type )? ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:682:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:683:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:683:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:684:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getGroupByStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleGroupByStatement1575);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleGroupByStatement1588); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupByStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleGroupByStatement1600); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupByStatementAccess().getGROUPKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:710:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:711:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:711:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:712:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getGroupByStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleGroupByStatement1620);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:728:2: ( (lv_items_4_0= rulegroup_item_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:729:1: (lv_items_4_0= rulegroup_item_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:729:1: (lv_items_4_0= rulegroup_item_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:730:3: lv_items_4_0= rulegroup_item_list
            {
             
            	        newCompositeNode(grammarAccess.getGroupByStatementAccess().getItemsGroup_item_listParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulegroup_item_list_in_ruleGroupByStatement1641);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:746:2: (otherlv_5= KEYWORD_70 rulegroup_type )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_70) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:747:2: otherlv_5= KEYWORD_70 rulegroup_type
                    {
                    otherlv_5=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleGroupByStatement1655); 

                        	newLeafNode(otherlv_5, grammarAccess.getGroupByStatementAccess().getUSINGKeyword_5_0());
                        
                     
                            newCompositeNode(grammarAccess.getGroupByStatementAccess().getGroup_typeParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_rulegroup_type_in_ruleGroupByStatement1670);
                    rulegroup_type();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:759:3: ( rulepartition_clause )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_91) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:760:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getGroupByStatementAccess().getPartition_clauseParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleGroupByStatement1688);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:775:1: entryRuleCoGroupByStatement returns [EObject current=null] : iv_ruleCoGroupByStatement= ruleCoGroupByStatement EOF ;
    public final EObject entryRuleCoGroupByStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCoGroupByStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:776:2: (iv_ruleCoGroupByStatement= ruleCoGroupByStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:777:2: iv_ruleCoGroupByStatement= ruleCoGroupByStatement EOF
            {
             newCompositeNode(grammarAccess.getCoGroupByStatementRule()); 
            pushFollow(FOLLOW_ruleCoGroupByStatement_in_entryRuleCoGroupByStatement1724);
            iv_ruleCoGroupByStatement=ruleCoGroupByStatement();

            state._fsp--;

             current =iv_ruleCoGroupByStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoGroupByStatement1734); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:784:1: ruleCoGroupByStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_76 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:787:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_76 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:788:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_76 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:788:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_76 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:788:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_76 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )? ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:788:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:789:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:789:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:790:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getCoGroupByStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleCoGroupByStatement1780);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleCoGroupByStatement1793); 

                	newLeafNode(otherlv_1, grammarAccess.getCoGroupByStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_ruleCoGroupByStatement1805); 

                	newLeafNode(otherlv_2, grammarAccess.getCoGroupByStatementAccess().getCOGROUPKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:816:1: ( (lv_aliases_3_0= rulejoin_sub_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:817:1: (lv_aliases_3_0= rulejoin_sub_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:817:1: (lv_aliases_3_0= rulejoin_sub_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:818:3: lv_aliases_3_0= rulejoin_sub_clause
            {
             
            	        newCompositeNode(grammarAccess.getCoGroupByStatementAccess().getAliasesJoin_sub_clauseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulejoin_sub_clause_in_ruleCoGroupByStatement1825);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:834:2: (otherlv_4= KEYWORD_70 this_COGROUP_TYPE_5= RULE_COGROUP_TYPE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_70) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:835:2: otherlv_4= KEYWORD_70 this_COGROUP_TYPE_5= RULE_COGROUP_TYPE
                    {
                    otherlv_4=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleCoGroupByStatement1839); 

                        	newLeafNode(otherlv_4, grammarAccess.getCoGroupByStatementAccess().getUSINGKeyword_4_0());
                        
                    this_COGROUP_TYPE_5=(Token)match(input,RULE_COGROUP_TYPE,FOLLOW_RULE_COGROUP_TYPE_in_ruleCoGroupByStatement1849); 
                     
                        newLeafNode(this_COGROUP_TYPE_5, grammarAccess.getCoGroupByStatementAccess().getCOGROUP_TYPETerminalRuleCall_4_1()); 
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:843:3: ( rulepartition_clause )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_91) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:844:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getCoGroupByStatementAccess().getPartition_clauseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleCoGroupByStatement1867);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:859:1: entryRuleOrderStatement returns [EObject current=null] : iv_ruleOrderStatement= ruleOrderStatement EOF ;
    public final EObject entryRuleOrderStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:860:2: (iv_ruleOrderStatement= ruleOrderStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:861:2: iv_ruleOrderStatement= ruleOrderStatement EOF
            {
             newCompositeNode(grammarAccess.getOrderStatementRule()); 
            pushFollow(FOLLOW_ruleOrderStatement_in_entryRuleOrderStatement1903);
            iv_ruleOrderStatement=ruleOrderStatement();

            state._fsp--;

             current =iv_ruleOrderStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderStatement1913); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:868:1: ruleOrderStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_63 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ruleorder_by_clause (otherlv_6= KEYWORD_70 ruleFuncClause )? ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:871:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_63 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ruleorder_by_clause (otherlv_6= KEYWORD_70 ruleFuncClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:872:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_63 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ruleorder_by_clause (otherlv_6= KEYWORD_70 ruleFuncClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:872:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_63 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ruleorder_by_clause (otherlv_6= KEYWORD_70 ruleFuncClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:872:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_63 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_29 ruleorder_by_clause (otherlv_6= KEYWORD_70 ruleFuncClause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:872:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:873:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:873:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:874:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getOrderStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleOrderStatement1959);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleOrderStatement1972); 

                	newLeafNode(otherlv_1, grammarAccess.getOrderStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_ruleOrderStatement1984); 

                	newLeafNode(otherlv_2, grammarAccess.getOrderStatementAccess().getORDERKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:900:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:901:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:901:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:902:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getOrderStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleOrderStatement2004);
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

            otherlv_4=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleOrderStatement2017); 

                	newLeafNode(otherlv_4, grammarAccess.getOrderStatementAccess().getBYKeyword_4());
                
             
                    newCompositeNode(grammarAccess.getOrderStatementAccess().getOrder_by_clauseParserRuleCall_5()); 
                
            pushFollow(FOLLOW_ruleorder_by_clause_in_ruleOrderStatement2032);
            ruleorder_by_clause();

            state._fsp--;


                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:931:1: (otherlv_6= KEYWORD_70 ruleFuncClause )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_70) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:932:2: otherlv_6= KEYWORD_70 ruleFuncClause
                    {
                    otherlv_6=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleOrderStatement2045); 

                        	newLeafNode(otherlv_6, grammarAccess.getOrderStatementAccess().getUSINGKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getOrderStatementAccess().getFuncClauseParserRuleCall_6_1()); 
                        
                    pushFollow(FOLLOW_ruleFuncClause_in_ruleOrderStatement2060);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:952:1: entryRuleCrossStatement returns [EObject current=null] : iv_ruleCrossStatement= ruleCrossStatement EOF ;
    public final EObject entryRuleCrossStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrossStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:953:2: (iv_ruleCrossStatement= ruleCrossStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:954:2: iv_ruleCrossStatement= ruleCrossStatement EOF
            {
             newCompositeNode(grammarAccess.getCrossStatementRule()); 
            pushFollow(FOLLOW_ruleCrossStatement_in_entryRuleCrossStatement2096);
            iv_ruleCrossStatement=ruleCrossStatement();

            state._fsp--;

             current =iv_ruleCrossStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCrossStatement2106); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:961:1: ruleCrossStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_57 ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? ) ;
    public final EObject ruleCrossStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_aliases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:964:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_57 ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:965:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_57 ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:965:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_57 ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:965:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_57 ( (lv_aliases_3_0= rulerel_list ) ) ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:965:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:966:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:966:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:967:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getCrossStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleCrossStatement2152);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleCrossStatement2165); 

                	newLeafNode(otherlv_1, grammarAccess.getCrossStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleCrossStatement2177); 

                	newLeafNode(otherlv_2, grammarAccess.getCrossStatementAccess().getCROSSKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:993:1: ( (lv_aliases_3_0= rulerel_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:994:1: (lv_aliases_3_0= rulerel_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:994:1: (lv_aliases_3_0= rulerel_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:995:3: lv_aliases_3_0= rulerel_list
            {
             
            	        newCompositeNode(grammarAccess.getCrossStatementAccess().getAliasesRel_listParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulerel_list_in_ruleCrossStatement2197);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1011:2: ( rulepartition_clause )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_91) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1012:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getCrossStatementAccess().getPartition_clauseParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleCrossStatement2214);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1027:1: entryRuleUnionStatement returns [EObject current=null] : iv_ruleUnionStatement= ruleUnionStatement EOF ;
    public final EObject entryRuleUnionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1028:2: (iv_ruleUnionStatement= ruleUnionStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1029:2: iv_ruleUnionStatement= ruleUnionStatement EOF
            {
             newCompositeNode(grammarAccess.getUnionStatementRule()); 
            pushFollow(FOLLOW_ruleUnionStatement_in_entryRuleUnionStatement2250);
            iv_ruleUnionStatement=ruleUnionStatement();

            state._fsp--;

             current =iv_ruleUnionStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionStatement2260); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1036:1: ruleUnionStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_69 otherlv_3= KEYWORD_35 ( (lv_aliases_4_0= rulerel_list ) ) ) ;
    public final EObject ruleUnionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_aliases_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1039:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_69 otherlv_3= KEYWORD_35 ( (lv_aliases_4_0= rulerel_list ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1040:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_69 otherlv_3= KEYWORD_35 ( (lv_aliases_4_0= rulerel_list ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1040:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_69 otherlv_3= KEYWORD_35 ( (lv_aliases_4_0= rulerel_list ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1040:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_69 otherlv_3= KEYWORD_35 ( (lv_aliases_4_0= rulerel_list ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1040:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1041:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1041:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1042:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getUnionStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleUnionStatement2306);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleUnionStatement2319); 

                	newLeafNode(otherlv_1, grammarAccess.getUnionStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_ruleUnionStatement2331); 

                	newLeafNode(otherlv_2, grammarAccess.getUnionStatementAccess().getUNIONKeyword_2());
                
            otherlv_3=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleUnionStatement2343); 

                	newLeafNode(otherlv_3, grammarAccess.getUnionStatementAccess().getONKeyword_3());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1073:1: ( (lv_aliases_4_0= rulerel_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1074:1: (lv_aliases_4_0= rulerel_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1074:1: (lv_aliases_4_0= rulerel_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1075:3: lv_aliases_4_0= rulerel_list
            {
             
            	        newCompositeNode(grammarAccess.getUnionStatementAccess().getAliasesRel_listParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulerel_list_in_ruleUnionStatement2363);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1099:1: entryRuleJoinStatement returns [EObject current=null] : iv_ruleJoinStatement= ruleJoinStatement EOF ;
    public final EObject entryRuleJoinStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1100:2: (iv_ruleJoinStatement= ruleJoinStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1101:2: iv_ruleJoinStatement= ruleJoinStatement EOF
            {
             newCompositeNode(grammarAccess.getJoinStatementRule()); 
            pushFollow(FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement2398);
            iv_ruleJoinStatement=ruleJoinStatement();

            state._fsp--;

             current =iv_ruleJoinStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinStatement2408); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1108:1: ruleJoinStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_52 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 rulejoin_type )? ( rulepartition_clause )? ) ;
    public final EObject ruleJoinStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_aliases_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1111:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_52 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 rulejoin_type )? ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1112:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_52 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 rulejoin_type )? ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1112:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_52 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 rulejoin_type )? ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1112:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_52 ( (lv_aliases_3_0= rulejoin_sub_clause ) ) (otherlv_4= KEYWORD_70 rulejoin_type )? ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1112:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1113:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1113:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1114:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleJoinStatement2454);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleJoinStatement2467); 

                	newLeafNode(otherlv_1, grammarAccess.getJoinStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleJoinStatement2479); 

                	newLeafNode(otherlv_2, grammarAccess.getJoinStatementAccess().getJOINKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1140:1: ( (lv_aliases_3_0= rulejoin_sub_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1141:1: (lv_aliases_3_0= rulejoin_sub_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1141:1: (lv_aliases_3_0= rulejoin_sub_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1142:3: lv_aliases_3_0= rulejoin_sub_clause
            {
             
            	        newCompositeNode(grammarAccess.getJoinStatementAccess().getAliasesJoin_sub_clauseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulejoin_sub_clause_in_ruleJoinStatement2499);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1158:2: (otherlv_4= KEYWORD_70 rulejoin_type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_70) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1159:2: otherlv_4= KEYWORD_70 rulejoin_type
                    {
                    otherlv_4=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleJoinStatement2513); 

                        	newLeafNode(otherlv_4, grammarAccess.getJoinStatementAccess().getUSINGKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getJoinStatementAccess().getJoin_typeParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_rulejoin_type_in_ruleJoinStatement2528);
                    rulejoin_type();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1171:3: ( rulepartition_clause )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_91) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1172:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getJoinStatementAccess().getPartition_clauseParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleJoinStatement2546);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1187:1: entryRuleLimitStatement returns [EObject current=null] : iv_ruleLimitStatement= ruleLimitStatement EOF ;
    public final EObject entryRuleLimitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLimitStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1188:2: (iv_ruleLimitStatement= ruleLimitStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1189:2: iv_ruleLimitStatement= ruleLimitStatement EOF
            {
             newCompositeNode(grammarAccess.getLimitStatementRule()); 
            pushFollow(FOLLOW_ruleLimitStatement_in_entryRuleLimitStatement2582);
            iv_ruleLimitStatement=ruleLimitStatement();

            state._fsp--;

             current =iv_ruleLimitStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLimitStatement2592); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1196:1: ruleLimitStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_61 ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt ) ;
    public final EObject ruleLimitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1199:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_61 ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1200:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_61 ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1200:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_61 ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1200:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_61 ( (lv_type_3_0= ruleAliasType ) ) rulescalarInt
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1200:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1201:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1201:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1202:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getLimitStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleLimitStatement2638);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleLimitStatement2651); 

                	newLeafNode(otherlv_1, grammarAccess.getLimitStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleLimitStatement2663); 

                	newLeafNode(otherlv_2, grammarAccess.getLimitStatementAccess().getLIMITKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1228:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1229:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1229:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1230:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getLimitStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleLimitStatement2683);
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
                
            pushFollow(FOLLOW_rulescalarInt_in_ruleLimitStatement2699);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1262:1: entryRuleSampleStatement returns [EObject current=null] : iv_ruleSampleStatement= ruleSampleStatement EOF ;
    public final EObject entryRuleSampleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1263:2: (iv_ruleSampleStatement= ruleSampleStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1264:2: iv_ruleSampleStatement= ruleSampleStatement EOF
            {
             newCompositeNode(grammarAccess.getSampleStatementRule()); 
            pushFollow(FOLLOW_ruleSampleStatement_in_entryRuleSampleStatement2733);
            iv_ruleSampleStatement=ruleSampleStatement();

            state._fsp--;

             current =iv_ruleSampleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSampleStatement2743); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1271:1: ruleSampleStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_74 ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER ) ;
    public final EObject ruleSampleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DOUBLENUMBER_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1274:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_74 ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1275:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_74 ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1275:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_74 ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1275:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_74 ( (lv_type_3_0= ruleAliasType ) ) this_DOUBLENUMBER_4= RULE_DOUBLENUMBER
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1275:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1276:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1276:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1277:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getSampleStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleSampleStatement2789);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleSampleStatement2802); 

                	newLeafNode(otherlv_1, grammarAccess.getSampleStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_ruleSampleStatement2814); 

                	newLeafNode(otherlv_2, grammarAccess.getSampleStatementAccess().getSAMPLEKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1303:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1304:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1304:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1305:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getSampleStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleSampleStatement2834);
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

            this_DOUBLENUMBER_4=(Token)match(input,RULE_DOUBLENUMBER,FOLLOW_RULE_DOUBLENUMBER_in_ruleSampleStatement2845); 
             
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1333:1: entryRuleDistinctStatement returns [EObject current=null] : iv_ruleDistinctStatement= ruleDistinctStatement EOF ;
    public final EObject entryRuleDistinctStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistinctStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1334:2: (iv_ruleDistinctStatement= ruleDistinctStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1335:2: iv_ruleDistinctStatement= ruleDistinctStatement EOF
            {
             newCompositeNode(grammarAccess.getDistinctStatementRule()); 
            pushFollow(FOLLOW_ruleDistinctStatement_in_entryRuleDistinctStatement2879);
            iv_ruleDistinctStatement=ruleDistinctStatement();

            state._fsp--;

             current =iv_ruleDistinctStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDistinctStatement2889); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1342:1: ruleDistinctStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_84 ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? ) ;
    public final EObject ruleDistinctStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1345:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_84 ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1346:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_84 ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1346:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_84 ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1346:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_84 ( (lv_type_3_0= ruleAliasType ) ) ( rulepartition_clause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1346:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1347:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1347:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1348:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDistinctStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDistinctStatement2935);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleDistinctStatement2948); 

                	newLeafNode(otherlv_1, grammarAccess.getDistinctStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_ruleDistinctStatement2960); 

                	newLeafNode(otherlv_2, grammarAccess.getDistinctStatementAccess().getDISTINCTKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1374:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1375:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1375:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1376:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getDistinctStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleDistinctStatement2980);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1392:2: ( rulepartition_clause )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_91) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1393:5: rulepartition_clause
                    {
                     
                            newCompositeNode(grammarAccess.getDistinctStatementAccess().getPartition_clauseParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulepartition_clause_in_ruleDistinctStatement2997);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1408:1: entryRuleStreamStatement returns [EObject current=null] : iv_ruleStreamStatement= ruleStreamStatement EOF ;
    public final EObject entryRuleStreamStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1409:2: (iv_ruleStreamStatement= ruleStreamStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1410:2: iv_ruleStreamStatement= ruleStreamStatement EOF
            {
             newCompositeNode(grammarAccess.getStreamStatementRule()); 
            pushFollow(FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement3033);
            iv_ruleStreamStatement=ruleStreamStatement();

            state._fsp--;

             current =iv_ruleStreamStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStreamStatement3043); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1417:1: ruleStreamStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_75 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_80 (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1420:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_75 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_80 (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1421:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_75 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_80 (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1421:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_75 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_80 (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1421:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_75 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_80 (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER ) ( ruleAsClause )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1421:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1422:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1422:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1423:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getStreamStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleStreamStatement3089);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleStreamStatement3102); 

                	newLeafNode(otherlv_1, grammarAccess.getStreamStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_ruleStreamStatement3114); 

                	newLeafNode(otherlv_2, grammarAccess.getStreamStatementAccess().getSTREAMKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1449:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1450:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1450:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1451:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getStreamStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleStreamStatement3134);
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

            otherlv_4=(Token)match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_ruleStreamStatement3147); 

                	newLeafNode(otherlv_4, grammarAccess.getStreamStatementAccess().getTHROUGHKeyword_4());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1472:1: (this_EXECCOMMAND_5= RULE_EXECCOMMAND | ruleIDENTIFIER )
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1472:2: this_EXECCOMMAND_5= RULE_EXECCOMMAND
                    {
                    this_EXECCOMMAND_5=(Token)match(input,RULE_EXECCOMMAND,FOLLOW_RULE_EXECCOMMAND_in_ruleStreamStatement3158); 
                     
                        newLeafNode(this_EXECCOMMAND_5, grammarAccess.getStreamStatementAccess().getEXECCOMMANDTerminalRuleCall_5_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1478:5: ruleIDENTIFIER
                    {
                     
                            newCompositeNode(grammarAccess.getStreamStatementAccess().getIDENTIFIERParserRuleCall_5_1()); 
                        
                    pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleStreamStatement3179);
                    ruleIDENTIFIER();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1485:2: ( ruleAsClause )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1486:5: ruleAsClause
                    {
                     
                            newCompositeNode(grammarAccess.getStreamStatementAccess().getAsClauseParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleAsClause_in_ruleStreamStatement3196);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1501:1: entryRuleMrStatement returns [EObject current=null] : iv_ruleMrStatement= ruleMrStatement EOF ;
    public final EObject entryRuleMrStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMrStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1502:2: (iv_ruleMrStatement= ruleMrStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1503:2: iv_ruleMrStatement= ruleMrStatement EOF
            {
             newCompositeNode(grammarAccess.getMrStatementRule()); 
            pushFollow(FOLLOW_ruleMrStatement_in_entryRuleMrStatement3232);
            iv_ruleMrStatement=ruleMrStatement();

            state._fsp--;

             current =iv_ruleMrStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMrStatement3242); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1510:1: ruleMrStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_90 this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1513:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_90 this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1514:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_90 this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1514:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_90 this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1514:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_90 this_STRING_3= RULE_STRING this_StoreStatement_4= ruleStoreStatement ( (lv_load_5_0= ruleLoadStatement ) ) (this_EXECCOMMAND_6= RULE_EXECCOMMAND )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1514:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1515:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1515:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1516:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getMrStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleMrStatement3288);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleMrStatement3301); 

                	newLeafNode(otherlv_1, grammarAccess.getMrStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_90,FOLLOW_KEYWORD_90_in_ruleMrStatement3313); 

                	newLeafNode(otherlv_2, grammarAccess.getMrStatementAccess().getMAPREDUCEKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMrStatement3323); 
             
                newLeafNode(this_STRING_3, grammarAccess.getMrStatementAccess().getSTRINGTerminalRuleCall_3()); 
                
             
                    newCompositeNode(grammarAccess.getMrStatementAccess().getStoreStatementParserRuleCall_4()); 
                
            pushFollow(FOLLOW_ruleStoreStatement_in_ruleMrStatement3344);
            this_StoreStatement_4=ruleStoreStatement();

            state._fsp--;


                    current = this_StoreStatement_4;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1555:1: ( (lv_load_5_0= ruleLoadStatement ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1556:1: (lv_load_5_0= ruleLoadStatement )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1556:1: (lv_load_5_0= ruleLoadStatement )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1557:3: lv_load_5_0= ruleLoadStatement
            {
             
            	        newCompositeNode(grammarAccess.getMrStatementAccess().getLoadLoadStatementParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleLoadStatement_in_ruleMrStatement3364);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1573:2: (this_EXECCOMMAND_6= RULE_EXECCOMMAND )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_EXECCOMMAND) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1573:3: this_EXECCOMMAND_6= RULE_EXECCOMMAND
                    {
                    this_EXECCOMMAND_6=(Token)match(input,RULE_EXECCOMMAND,FOLLOW_RULE_EXECCOMMAND_in_ruleMrStatement3376); 
                     
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1585:1: entryRuleSplitStatement returns [EObject current=null] : iv_ruleSplitStatement= ruleSplitStatement EOF ;
    public final EObject entryRuleSplitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSplitStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1586:2: (iv_ruleSplitStatement= ruleSplitStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1587:2: iv_ruleSplitStatement= ruleSplitStatement EOF
            {
             newCompositeNode(grammarAccess.getSplitStatementRule()); 
            pushFollow(FOLLOW_ruleSplitStatement_in_entryRuleSplitStatement3412);
            iv_ruleSplitStatement=ruleSplitStatement();

            state._fsp--;

             current =iv_ruleSplitStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitStatement3422); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1594:1: ruleSplitStatement returns [EObject current=null] : ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_66 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_51 ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= KEYWORD_8 ( (lv_branches_7_0= rulesplit_branch ) ) )+ ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1597:28: ( ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_66 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_51 ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= KEYWORD_8 ( (lv_branches_7_0= rulesplit_branch ) ) )+ ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1598:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_66 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_51 ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= KEYWORD_8 ( (lv_branches_7_0= rulesplit_branch ) ) )+ )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1598:1: ( ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_66 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_51 ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= KEYWORD_8 ( (lv_branches_7_0= rulesplit_branch ) ) )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1598:2: ( (lv_name_0_0= ruleAlias ) ) otherlv_1= KEYWORD_15 otherlv_2= KEYWORD_66 ( (lv_type_3_0= ruleAliasType ) ) otherlv_4= KEYWORD_51 ( (lv_branches_5_0= rulesplit_branch ) ) (otherlv_6= KEYWORD_8 ( (lv_branches_7_0= rulesplit_branch ) ) )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1598:2: ( (lv_name_0_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1599:1: (lv_name_0_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1599:1: (lv_name_0_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1600:3: lv_name_0_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getSplitStatementAccess().getNameAliasParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleSplitStatement3468);
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

            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleSplitStatement3481); 

                	newLeafNode(otherlv_1, grammarAccess.getSplitStatementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_ruleSplitStatement3493); 

                	newLeafNode(otherlv_2, grammarAccess.getSplitStatementAccess().getSPLITKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1626:1: ( (lv_type_3_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1627:1: (lv_type_3_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1627:1: (lv_type_3_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1628:3: lv_type_3_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getSplitStatementAccess().getTypeAliasTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleSplitStatement3513);
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

            otherlv_4=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleSplitStatement3526); 

                	newLeafNode(otherlv_4, grammarAccess.getSplitStatementAccess().getINTOKeyword_4());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1649:1: ( (lv_branches_5_0= rulesplit_branch ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1650:1: (lv_branches_5_0= rulesplit_branch )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1650:1: (lv_branches_5_0= rulesplit_branch )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1651:3: lv_branches_5_0= rulesplit_branch
            {
             
            	        newCompositeNode(grammarAccess.getSplitStatementAccess().getBranchesSplit_branchParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulesplit_branch_in_ruleSplitStatement3546);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1667:2: (otherlv_6= KEYWORD_8 ( (lv_branches_7_0= rulesplit_branch ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==KEYWORD_8) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1668:2: otherlv_6= KEYWORD_8 ( (lv_branches_7_0= rulesplit_branch ) )
            	    {
            	    otherlv_6=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleSplitStatement3560); 

            	        	newLeafNode(otherlv_6, grammarAccess.getSplitStatementAccess().getCommaKeyword_6_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1672:1: ( (lv_branches_7_0= rulesplit_branch ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1673:1: (lv_branches_7_0= rulesplit_branch )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1673:1: (lv_branches_7_0= rulesplit_branch )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1674:3: lv_branches_7_0= rulesplit_branch
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSplitStatementAccess().getBranchesSplit_branchParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulesplit_branch_in_ruleSplitStatement3580);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1698:1: entryRuleStoreStatement returns [EObject current=null] : iv_ruleStoreStatement= ruleStoreStatement EOF ;
    public final EObject entryRuleStoreStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1699:2: (iv_ruleStoreStatement= ruleStoreStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1700:2: iv_ruleStoreStatement= ruleStoreStatement EOF
            {
             newCompositeNode(grammarAccess.getStoreStatementRule()); 
            pushFollow(FOLLOW_ruleStoreStatement_in_entryRuleStoreStatement3617);
            iv_ruleStoreStatement=ruleStoreStatement();

            state._fsp--;

             current =iv_ruleStoreStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStoreStatement3627); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1707:1: ruleStoreStatement returns [EObject current=null] : (otherlv_0= KEYWORD_67 ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= KEYWORD_51 this_STRING_3= RULE_STRING (otherlv_4= KEYWORD_70 ruleFuncClause )? ) ;
    public final EObject ruleStoreStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1710:28: ( (otherlv_0= KEYWORD_67 ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= KEYWORD_51 this_STRING_3= RULE_STRING (otherlv_4= KEYWORD_70 ruleFuncClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1711:1: (otherlv_0= KEYWORD_67 ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= KEYWORD_51 this_STRING_3= RULE_STRING (otherlv_4= KEYWORD_70 ruleFuncClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1711:1: (otherlv_0= KEYWORD_67 ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= KEYWORD_51 this_STRING_3= RULE_STRING (otherlv_4= KEYWORD_70 ruleFuncClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1712:2: otherlv_0= KEYWORD_67 ( (lv_type_1_0= ruleAliasType ) ) otherlv_2= KEYWORD_51 this_STRING_3= RULE_STRING (otherlv_4= KEYWORD_70 ruleFuncClause )?
            {
            otherlv_0=(Token)match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_ruleStoreStatement3665); 

                	newLeafNode(otherlv_0, grammarAccess.getStoreStatementAccess().getSTOREKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1716:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1717:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1717:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1718:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getStoreStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleStoreStatement3685);
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

            otherlv_2=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleStoreStatement3698); 

                	newLeafNode(otherlv_2, grammarAccess.getStoreStatementAccess().getINTOKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStoreStatement3708); 
             
                newLeafNode(this_STRING_3, grammarAccess.getStoreStatementAccess().getSTRINGTerminalRuleCall_3()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1743:1: (otherlv_4= KEYWORD_70 ruleFuncClause )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_70) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1744:2: otherlv_4= KEYWORD_70 ruleFuncClause
                    {
                    otherlv_4=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleStoreStatement3721); 

                        	newLeafNode(otherlv_4, grammarAccess.getStoreStatementAccess().getUSINGKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getStoreStatementAccess().getFuncClauseParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleFuncClause_in_ruleStoreStatement3736);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1764:1: entryRuleDescribeStatement returns [EObject current=null] : iv_ruleDescribeStatement= ruleDescribeStatement EOF ;
    public final EObject entryRuleDescribeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescribeStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1765:2: (iv_ruleDescribeStatement= ruleDescribeStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1766:2: iv_ruleDescribeStatement= ruleDescribeStatement EOF
            {
             newCompositeNode(grammarAccess.getDescribeStatementRule()); 
            pushFollow(FOLLOW_ruleDescribeStatement_in_entryRuleDescribeStatement3772);
            iv_ruleDescribeStatement=ruleDescribeStatement();

            state._fsp--;

             current =iv_ruleDescribeStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescribeStatement3782); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1773:1: ruleDescribeStatement returns [EObject current=null] : (otherlv_0= KEYWORD_83 ( (lv_type_1_0= ruleAliasType ) ) ) ;
    public final EObject ruleDescribeStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1776:28: ( (otherlv_0= KEYWORD_83 ( (lv_type_1_0= ruleAliasType ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1777:1: (otherlv_0= KEYWORD_83 ( (lv_type_1_0= ruleAliasType ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1777:1: (otherlv_0= KEYWORD_83 ( (lv_type_1_0= ruleAliasType ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1778:2: otherlv_0= KEYWORD_83 ( (lv_type_1_0= ruleAliasType ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_ruleDescribeStatement3820); 

                	newLeafNode(otherlv_0, grammarAccess.getDescribeStatementAccess().getDESCRIBEKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1782:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1783:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1783:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1784:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getDescribeStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleDescribeStatement3840);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1808:1: entryRuleExplainStatement returns [EObject current=null] : iv_ruleExplainStatement= ruleExplainStatement EOF ;
    public final EObject entryRuleExplainStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplainStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1809:2: (iv_ruleExplainStatement= ruleExplainStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1810:2: iv_ruleExplainStatement= ruleExplainStatement EOF
            {
             newCompositeNode(grammarAccess.getExplainStatementRule()); 
            pushFollow(FOLLOW_ruleExplainStatement_in_entryRuleExplainStatement3875);
            iv_ruleExplainStatement=ruleExplainStatement();

            state._fsp--;

             current =iv_ruleExplainStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplainStatement3885); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1817:1: ruleExplainStatement returns [EObject current=null] : (otherlv_0= KEYWORD_77 ( (lv_type_1_0= ruleAliasType ) ) ) ;
    public final EObject ruleExplainStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1820:28: ( (otherlv_0= KEYWORD_77 ( (lv_type_1_0= ruleAliasType ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1821:1: (otherlv_0= KEYWORD_77 ( (lv_type_1_0= ruleAliasType ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1821:1: (otherlv_0= KEYWORD_77 ( (lv_type_1_0= ruleAliasType ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1822:2: otherlv_0= KEYWORD_77 ( (lv_type_1_0= ruleAliasType ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_ruleExplainStatement3923); 

                	newLeafNode(otherlv_0, grammarAccess.getExplainStatementAccess().getEXPLAINKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1826:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1827:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1827:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1828:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getExplainStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleExplainStatement3943);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1852:1: entryRuleDumpStatement returns [EObject current=null] : iv_ruleDumpStatement= ruleDumpStatement EOF ;
    public final EObject entryRuleDumpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDumpStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1853:2: (iv_ruleDumpStatement= ruleDumpStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1854:2: iv_ruleDumpStatement= ruleDumpStatement EOF
            {
             newCompositeNode(grammarAccess.getDumpStatementRule()); 
            pushFollow(FOLLOW_ruleDumpStatement_in_entryRuleDumpStatement3978);
            iv_ruleDumpStatement=ruleDumpStatement();

            state._fsp--;

             current =iv_ruleDumpStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDumpStatement3988); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1861:1: ruleDumpStatement returns [EObject current=null] : (otherlv_0= KEYWORD_49 ( (lv_type_1_0= ruleAliasType ) ) ) ;
    public final EObject ruleDumpStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1864:28: ( (otherlv_0= KEYWORD_49 ( (lv_type_1_0= ruleAliasType ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1865:1: (otherlv_0= KEYWORD_49 ( (lv_type_1_0= ruleAliasType ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1865:1: (otherlv_0= KEYWORD_49 ( (lv_type_1_0= ruleAliasType ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1866:2: otherlv_0= KEYWORD_49 ( (lv_type_1_0= ruleAliasType ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleDumpStatement4026); 

                	newLeafNode(otherlv_0, grammarAccess.getDumpStatementAccess().getDUMPKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1870:1: ( (lv_type_1_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1871:1: (lv_type_1_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1871:1: (lv_type_1_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1872:3: lv_type_1_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getDumpStatementAccess().getTypeAliasTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_ruleDumpStatement4046);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1896:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1897:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1898:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition4081);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition4091); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1905:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= KEYWORD_4 ruleType otherlv_2= KEYWORD_5 )? this_OrCondition_3= ruleOrCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_OrCondition_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1908:28: ( ( (otherlv_0= KEYWORD_4 ruleType otherlv_2= KEYWORD_5 )? this_OrCondition_3= ruleOrCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1909:1: ( (otherlv_0= KEYWORD_4 ruleType otherlv_2= KEYWORD_5 )? this_OrCondition_3= ruleOrCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1909:1: ( (otherlv_0= KEYWORD_4 ruleType otherlv_2= KEYWORD_5 )? this_OrCondition_3= ruleOrCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1909:2: (otherlv_0= KEYWORD_4 ruleType otherlv_2= KEYWORD_5 )? this_OrCondition_3= ruleOrCondition
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1909:2: (otherlv_0= KEYWORD_4 ruleType otherlv_2= KEYWORD_5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEYWORD_4) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=KEYWORD_88 && LA25_1<=KEYWORD_89)||LA25_1==KEYWORD_72||LA25_1==KEYWORD_58||LA25_1==KEYWORD_62||LA25_1==KEYWORD_68||LA25_1==KEYWORD_55||LA25_1==KEYWORD_42||LA25_1==KEYWORD_44||LA25_1==KEYWORD_21) ) {
                    alt25=1;
                }
                else if ( (LA25_1==KEYWORD_4) ) {
                    int LA25_4 = input.LA(3);

                    if ( (LA25_4==RULE_ID) ) {
                        int LA25_5 = input.LA(4);

                        if ( (LA25_5==KEYWORD_8||LA25_5==KEYWORD_12) ) {
                            alt25=1;
                        }
                        else if ( (LA25_5==KEYWORD_5) ) {
                            int LA25_6 = input.LA(5);

                            if ( (LA25_6==KEYWORD_5) ) {
                                int LA25_7 = input.LA(6);

                                if ( (LA25_7==KEYWORD_59||LA25_7==KEYWORD_56||LA25_7==KEYWORD_47||LA25_7==KEYWORD_37||LA25_7==KEYWORD_2||LA25_7==KEYWORD_4||(LA25_7>=KEYWORD_9 && LA25_7<=KEYWORD_10)||LA25_7==RULE_DIGIT||(LA25_7>=RULE_FLOATINGPOINT && LA25_7<=RULE_LONGINTEGER)||(LA25_7>=RULE_ID && LA25_7<=RULE_STRING)) ) {
                                    alt25=1;
                                }
                            }
                        }
                    }
                }
            }
            switch (alt25) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1910:2: otherlv_0= KEYWORD_4 ruleType otherlv_2= KEYWORD_5
                    {
                    otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleCondition4130); 

                        	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getTypeParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCondition4145);
                    ruleType();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleCondition4157); 

                        	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_2());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleOrCondition_in_ruleCondition4180);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1944:1: entryRuleOrCondition returns [EObject current=null] : iv_ruleOrCondition= ruleOrCondition EOF ;
    public final EObject entryRuleOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1945:2: (iv_ruleOrCondition= ruleOrCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1946:2: iv_ruleOrCondition= ruleOrCondition EOF
            {
             newCompositeNode(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_ruleOrCondition_in_entryRuleOrCondition4214);
            iv_ruleOrCondition=ruleOrCondition();

            state._fsp--;

             current =iv_ruleOrCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrCondition4224); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1953:1: ruleOrCondition returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition ( () otherlv_2= KEYWORD_36 ( (lv_right_3_0= ruleAndCondition ) ) )* ) ;
    public final EObject ruleOrCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndCondition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1956:28: ( (this_AndCondition_0= ruleAndCondition ( () otherlv_2= KEYWORD_36 ( (lv_right_3_0= ruleAndCondition ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1957:1: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= KEYWORD_36 ( (lv_right_3_0= ruleAndCondition ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1957:1: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= KEYWORD_36 ( (lv_right_3_0= ruleAndCondition ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1958:5: this_AndCondition_0= ruleAndCondition ( () otherlv_2= KEYWORD_36 ( (lv_right_3_0= ruleAndCondition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAndCondition_in_ruleOrCondition4271);
            this_AndCondition_0=ruleAndCondition();

            state._fsp--;


                    current = this_AndCondition_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1966:1: ( () otherlv_2= KEYWORD_36 ( (lv_right_3_0= ruleAndCondition ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KEYWORD_36) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1966:2: () otherlv_2= KEYWORD_36 ( (lv_right_3_0= ruleAndCondition ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1966:2: ()
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1967:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleOrCondition4293); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getORKeyword_1_1());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1977:1: ( (lv_right_3_0= ruleAndCondition ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1978:1: (lv_right_3_0= ruleAndCondition )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1978:1: (lv_right_3_0= ruleAndCondition )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:1979:3: lv_right_3_0= ruleAndCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndCondition_in_ruleOrCondition4313);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2003:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2004:2: (iv_ruleAndCondition= ruleAndCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2005:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
             newCompositeNode(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_ruleAndCondition_in_entryRuleAndCondition4350);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;

             current =iv_ruleAndCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndCondition4360); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2012:1: ruleAndCondition returns [EObject current=null] : (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleUnaryCondition ) ) )* ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryCondition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2015:28: ( (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleUnaryCondition ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2016:1: (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleUnaryCondition ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2016:1: (this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleUnaryCondition ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2017:5: this_UnaryCondition_0= ruleUnaryCondition ( () otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleUnaryCondition ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndConditionAccess().getUnaryConditionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnaryCondition_in_ruleAndCondition4407);
            this_UnaryCondition_0=ruleUnaryCondition();

            state._fsp--;


                    current = this_UnaryCondition_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2025:1: ( () otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleUnaryCondition ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KEYWORD_39) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2025:2: () otherlv_2= KEYWORD_39 ( (lv_right_3_0= ruleUnaryCondition ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2025:2: ()
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2026:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleAndCondition4429); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getANDKeyword_1_1());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2036:1: ( (lv_right_3_0= ruleUnaryCondition ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2037:1: (lv_right_3_0= ruleUnaryCondition )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2037:1: (lv_right_3_0= ruleUnaryCondition )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2038:3: lv_right_3_0= ruleUnaryCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndConditionAccess().getRightUnaryConditionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryCondition_in_ruleAndCondition4449);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2062:1: entryRuleUnaryCondition returns [EObject current=null] : iv_ruleUnaryCondition= ruleUnaryCondition EOF ;
    public final EObject entryRuleUnaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryCondition = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2063:2: (iv_ruleUnaryCondition= ruleUnaryCondition EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2064:2: iv_ruleUnaryCondition= ruleUnaryCondition EOF
            {
             newCompositeNode(grammarAccess.getUnaryConditionRule()); 
            pushFollow(FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition4486);
            iv_ruleUnaryCondition=ruleUnaryCondition();

            state._fsp--;

             current =iv_ruleUnaryCondition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryCondition4496); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2071:1: ruleUnaryCondition returns [EObject current=null] : ( (otherlv_0= KEYWORD_4 this_Condition_1= ruleCondition (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= KEYWORD_5 ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2074:28: ( ( (otherlv_0= KEYWORD_4 this_Condition_1= ruleCondition (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= KEYWORD_5 ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2075:1: ( (otherlv_0= KEYWORD_4 this_Condition_1= ruleCondition (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= KEYWORD_5 ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2075:1: ( (otherlv_0= KEYWORD_4 this_Condition_1= ruleCondition (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= KEYWORD_5 ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )? ) | (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KEYWORD_4) ) {
                alt31=1;
            }
            else if ( (LA31_0==KEYWORD_59||LA31_0==KEYWORD_56||LA31_0==KEYWORD_47||LA31_0==KEYWORD_37||LA31_0==KEYWORD_2||(LA31_0>=KEYWORD_9 && LA31_0<=KEYWORD_10)||LA31_0==RULE_DIGIT||(LA31_0>=RULE_FLOATINGPOINT && LA31_0<=RULE_LONGINTEGER)||(LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2075:2: (otherlv_0= KEYWORD_4 this_Condition_1= ruleCondition (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= KEYWORD_5 ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2075:2: (otherlv_0= KEYWORD_4 this_Condition_1= ruleCondition (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= KEYWORD_5 ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2076:2: otherlv_0= KEYWORD_4 this_Condition_1= ruleCondition (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )? otherlv_6= KEYWORD_5 ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )?
                    {
                    otherlv_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleUnaryCondition4535); 

                        	newLeafNode(otherlv_0, grammarAccess.getUnaryConditionAccess().getLeftParenthesisKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getUnaryConditionAccess().getConditionParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4556);
                    this_Condition_1=ruleCondition();

                    state._fsp--;


                            current = this_Condition_1;
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2089:1: (otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==KEYWORD_17) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2090:2: otherlv_2= KEYWORD_17 ( (lv_leftExp_3_0= ruleCondition ) ) otherlv_4= KEYWORD_12 ( (lv_rightExp_5_0= ruleCondition ) )
                            {
                            otherlv_2=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleUnaryCondition4569); 

                                	newLeafNode(otherlv_2, grammarAccess.getUnaryConditionAccess().getQuestionMarkKeyword_0_2_0());
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2094:1: ( (lv_leftExp_3_0= ruleCondition ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2095:1: (lv_leftExp_3_0= ruleCondition )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2095:1: (lv_leftExp_3_0= ruleCondition )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2096:3: lv_leftExp_3_0= ruleCondition
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getLeftExpConditionParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4589);
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

                            otherlv_4=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleUnaryCondition4602); 

                                	newLeafNode(otherlv_4, grammarAccess.getUnaryConditionAccess().getColonKeyword_0_2_2());
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2117:1: ( (lv_rightExp_5_0= ruleCondition ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2118:1: (lv_rightExp_5_0= ruleCondition )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2118:1: (lv_rightExp_5_0= ruleCondition )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2119:3: lv_rightExp_5_0= ruleCondition
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getRightExpConditionParserRuleCall_0_2_3_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4622);
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

                    otherlv_6=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleUnaryCondition4637); 

                        	newLeafNode(otherlv_6, grammarAccess.getUnaryConditionAccess().getRightParenthesisKeyword_0_3());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2140:1: ( () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==KEYWORD_7) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2140:2: () otherlv_8= KEYWORD_7 ( (lv_right_9_0= ruleCondition ) )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2140:2: ()
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2141:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_0_4_0(),
                                        current);
                                

                            }

                            otherlv_8=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleUnaryCondition4659); 

                                	newLeafNode(otherlv_8, grammarAccess.getUnaryConditionAccess().getPlusSignKeyword_0_4_1());
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2151:1: ( (lv_right_9_0= ruleCondition ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2152:1: (lv_right_9_0= ruleCondition )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2152:1: (lv_right_9_0= ruleCondition )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2153:3: lv_right_9_0= ruleCondition
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getRightConditionParserRuleCall_0_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleCondition_in_ruleUnaryCondition4679);
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2170:6: (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2170:6: (this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2171:5: this_TE_10= ruleTE ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )?
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryConditionAccess().getTEParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleTE_in_ruleUnaryCondition4711);
                    this_TE_10=ruleTE();

                    state._fsp--;


                            current = this_TE_10;
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2179:1: ( () rulerel_op ( (lv_right_13_0= ruleTE ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==KEYWORD_79||LA30_0==KEYWORD_43||(LA30_0>=KEYWORD_45 && LA30_0<=KEYWORD_46)||LA30_0==KEYWORD_23||(LA30_0>=KEYWORD_25 && LA30_0<=KEYWORD_27)||(LA30_0>=KEYWORD_30 && LA30_0<=KEYWORD_31)||LA30_0==KEYWORD_34||LA30_0==KEYWORD_14||LA30_0==KEYWORD_16) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2179:2: () rulerel_op ( (lv_right_13_0= ruleTE ) )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2179:2: ()
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2180:5: 
                            {

                                    current = forceCreateModelElementAndSet(
                                        grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_1_1_0(),
                                        current);
                                

                            }

                             
                                    newCompositeNode(grammarAccess.getUnaryConditionAccess().getRel_opParserRuleCall_1_1_1()); 
                                
                            pushFollow(FOLLOW_rulerel_op_in_ruleUnaryCondition4736);
                            rulerel_op();

                            state._fsp--;


                                    afterParserOrEnumRuleCall();
                                
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2193:1: ( (lv_right_13_0= ruleTE ) )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2194:1: (lv_right_13_0= ruleTE )
                            {
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2194:1: (lv_right_13_0= ruleTE )
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2195:3: lv_right_13_0= ruleTE
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryConditionAccess().getRightTEParserRuleCall_1_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTE_in_ruleUnaryCondition4756);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2219:1: entryRuleTE returns [EObject current=null] : iv_ruleTE= ruleTE EOF ;
    public final EObject entryRuleTE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2220:2: (iv_ruleTE= ruleTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2221:2: iv_ruleTE= ruleTE EOF
            {
             newCompositeNode(grammarAccess.getTERule()); 
            pushFollow(FOLLOW_ruleTE_in_entryRuleTE4794);
            iv_ruleTE=ruleTE();

            state._fsp--;

             current =iv_ruleTE; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTE4804); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2228:1: ruleTE returns [EObject current=null] : (this_Expression_0= ruleExpression (otherlv_1= KEYWORD_33 (otherlv_2= KEYWORD_47 )? otherlv_3= KEYWORD_56 )? ) ;
    public final EObject ruleTE() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2231:28: ( (this_Expression_0= ruleExpression (otherlv_1= KEYWORD_33 (otherlv_2= KEYWORD_47 )? otherlv_3= KEYWORD_56 )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2232:1: (this_Expression_0= ruleExpression (otherlv_1= KEYWORD_33 (otherlv_2= KEYWORD_47 )? otherlv_3= KEYWORD_56 )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2232:1: (this_Expression_0= ruleExpression (otherlv_1= KEYWORD_33 (otherlv_2= KEYWORD_47 )? otherlv_3= KEYWORD_56 )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2233:5: this_Expression_0= ruleExpression (otherlv_1= KEYWORD_33 (otherlv_2= KEYWORD_47 )? otherlv_3= KEYWORD_56 )?
            {
             
                    newCompositeNode(grammarAccess.getTEAccess().getExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleTE4851);
            this_Expression_0=ruleExpression();

            state._fsp--;


                    current = this_Expression_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2241:1: (otherlv_1= KEYWORD_33 (otherlv_2= KEYWORD_47 )? otherlv_3= KEYWORD_56 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KEYWORD_33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2242:2: otherlv_1= KEYWORD_33 (otherlv_2= KEYWORD_47 )? otherlv_3= KEYWORD_56
                    {
                    otherlv_1=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleTE4864); 

                        	newLeafNode(otherlv_1, grammarAccess.getTEAccess().getISKeyword_1_0());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2246:1: (otherlv_2= KEYWORD_47 )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==KEYWORD_47) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2247:2: otherlv_2= KEYWORD_47
                            {
                            otherlv_2=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleTE4877); 

                                	newLeafNode(otherlv_2, grammarAccess.getTEAccess().getNOTKeyword_1_1());
                                

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleTE4891); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2264:1: entryRulefunc_eval returns [EObject current=null] : iv_rulefunc_eval= rulefunc_eval EOF ;
    public final EObject entryRulefunc_eval() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunc_eval = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2265:2: (iv_rulefunc_eval= rulefunc_eval EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2266:2: iv_rulefunc_eval= rulefunc_eval EOF
            {
             newCompositeNode(grammarAccess.getFunc_evalRule()); 
            pushFollow(FOLLOW_rulefunc_eval_in_entryRulefunc_eval4927);
            iv_rulefunc_eval=rulefunc_eval();

            state._fsp--;

             current =iv_rulefunc_eval; 
            match(input,EOF,FOLLOW_EOF_in_entryRulefunc_eval4937); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2273:1: rulefunc_eval returns [EObject current=null] : ( ruleFuncName () otherlv_2= KEYWORD_4 ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= KEYWORD_5 ) ;
    public final EObject rulefunc_eval() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_arg_list_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2276:28: ( ( ruleFuncName () otherlv_2= KEYWORD_4 ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= KEYWORD_5 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2277:1: ( ruleFuncName () otherlv_2= KEYWORD_4 ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= KEYWORD_5 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2277:1: ( ruleFuncName () otherlv_2= KEYWORD_4 ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= KEYWORD_5 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2278:5: ruleFuncName () otherlv_2= KEYWORD_4 ( (lv_arg_list_3_0= rulereal_arg_list ) )? otherlv_4= KEYWORD_5
            {
             
                    newCompositeNode(grammarAccess.getFunc_evalAccess().getFuncNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFuncName_in_rulefunc_eval4978);
            ruleFuncName();

            state._fsp--;


                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2285:1: ()
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2286:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunc_evalAccess().getFunc_evalAction_1(),
                        current);
                

            }

            otherlv_2=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulefunc_eval4999); 

                	newLeafNode(otherlv_2, grammarAccess.getFunc_evalAccess().getLeftParenthesisKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2296:1: ( (lv_arg_list_3_0= rulereal_arg_list ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KEYWORD_59||LA34_0==KEYWORD_56||LA34_0==KEYWORD_47||LA34_0==KEYWORD_37||LA34_0==KEYWORD_2||LA34_0==KEYWORD_4||LA34_0==KEYWORD_6||(LA34_0>=KEYWORD_9 && LA34_0<=KEYWORD_10)||LA34_0==RULE_DIGIT||(LA34_0>=RULE_FLOATINGPOINT && LA34_0<=RULE_LONGINTEGER)||(LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2297:1: (lv_arg_list_3_0= rulereal_arg_list )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2297:1: (lv_arg_list_3_0= rulereal_arg_list )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2298:3: lv_arg_list_3_0= rulereal_arg_list
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunc_evalAccess().getArg_listReal_arg_listParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_rulereal_arg_list_in_rulefunc_eval5019);
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

            otherlv_4=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rulefunc_eval5033); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2327:1: entryRulereal_arg_list returns [EObject current=null] : iv_rulereal_arg_list= rulereal_arg_list EOF ;
    public final EObject entryRulereal_arg_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_arg_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2328:2: (iv_rulereal_arg_list= rulereal_arg_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2329:2: iv_rulereal_arg_list= rulereal_arg_list EOF
            {
             newCompositeNode(grammarAccess.getReal_arg_listRule()); 
            pushFollow(FOLLOW_rulereal_arg_list_in_entryRulereal_arg_list5067);
            iv_rulereal_arg_list=rulereal_arg_list();

            state._fsp--;

             current =iv_rulereal_arg_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereal_arg_list5077); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2336:1: rulereal_arg_list returns [EObject current=null] : ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= KEYWORD_8 ( (lv_args_2_0= rulereal_arg ) ) )* ) ;
    public final EObject rulereal_arg_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2339:28: ( ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= KEYWORD_8 ( (lv_args_2_0= rulereal_arg ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2340:1: ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= KEYWORD_8 ( (lv_args_2_0= rulereal_arg ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2340:1: ( ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= KEYWORD_8 ( (lv_args_2_0= rulereal_arg ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2340:2: ( (lv_args_0_0= rulereal_arg ) ) (otherlv_1= KEYWORD_8 ( (lv_args_2_0= rulereal_arg ) ) )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2340:2: ( (lv_args_0_0= rulereal_arg ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2341:1: (lv_args_0_0= rulereal_arg )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2341:1: (lv_args_0_0= rulereal_arg )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2342:3: lv_args_0_0= rulereal_arg
            {
             
            	        newCompositeNode(grammarAccess.getReal_arg_listAccess().getArgsReal_argParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulereal_arg_in_rulereal_arg_list5123);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2358:2: (otherlv_1= KEYWORD_8 ( (lv_args_2_0= rulereal_arg ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==KEYWORD_8) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2359:2: otherlv_1= KEYWORD_8 ( (lv_args_2_0= rulereal_arg ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulereal_arg_list5137); 

            	        	newLeafNode(otherlv_1, grammarAccess.getReal_arg_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2363:1: ( (lv_args_2_0= rulereal_arg ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2364:1: (lv_args_2_0= rulereal_arg )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2364:1: (lv_args_2_0= rulereal_arg )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2365:3: lv_args_2_0= rulereal_arg
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReal_arg_listAccess().getArgsReal_argParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulereal_arg_in_rulereal_arg_list5157);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2389:1: entryRulereal_arg returns [EObject current=null] : iv_rulereal_arg= rulereal_arg EOF ;
    public final EObject entryRulereal_arg() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal_arg = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2390:2: (iv_rulereal_arg= rulereal_arg EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2391:2: iv_rulereal_arg= rulereal_arg EOF
            {
             newCompositeNode(grammarAccess.getReal_argRule()); 
            pushFollow(FOLLOW_rulereal_arg_in_entryRulereal_arg5194);
            iv_rulereal_arg=rulereal_arg();

            state._fsp--;

             current =iv_rulereal_arg; 
            match(input,EOF,FOLLOW_EOF_in_entryRulereal_arg5204); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2398:1: rulereal_arg returns [EObject current=null] : (this_Condition_0= ruleCondition | ruleSTAR ) ;
    public final EObject rulereal_arg() throws RecognitionException {
        EObject current = null;

        EObject this_Condition_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2401:28: ( (this_Condition_0= ruleCondition | ruleSTAR ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2402:1: (this_Condition_0= ruleCondition | ruleSTAR )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2402:1: (this_Condition_0= ruleCondition | ruleSTAR )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_59||LA36_0==KEYWORD_56||LA36_0==KEYWORD_47||LA36_0==KEYWORD_37||LA36_0==KEYWORD_2||LA36_0==KEYWORD_4||(LA36_0>=KEYWORD_9 && LA36_0<=KEYWORD_10)||LA36_0==RULE_DIGIT||(LA36_0>=RULE_FLOATINGPOINT && LA36_0<=RULE_LONGINTEGER)||(LA36_0>=RULE_ID && LA36_0<=RULE_STRING)) ) {
                alt36=1;
            }
            else if ( (LA36_0==KEYWORD_6) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2403:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getReal_argAccess().getConditionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_rulereal_arg5251);
                    this_Condition_0=ruleCondition();

                    state._fsp--;


                            current = this_Condition_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2413:5: ruleSTAR
                    {
                     
                            newCompositeNode(grammarAccess.getReal_argAccess().getSTARParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSTAR_in_rulereal_arg5272);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2428:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2429:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2430:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression5306);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression5316); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2437:1: ruleExpression returns [EObject current=null] : ( (otherlv_0= KEYWORD_47 )? this_AddExpression_1= ruleAddExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_AddExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2440:28: ( ( (otherlv_0= KEYWORD_47 )? this_AddExpression_1= ruleAddExpression ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2441:1: ( (otherlv_0= KEYWORD_47 )? this_AddExpression_1= ruleAddExpression )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2441:1: ( (otherlv_0= KEYWORD_47 )? this_AddExpression_1= ruleAddExpression )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2441:2: (otherlv_0= KEYWORD_47 )? this_AddExpression_1= ruleAddExpression
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2441:2: (otherlv_0= KEYWORD_47 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==KEYWORD_47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2442:2: otherlv_0= KEYWORD_47
                    {
                    otherlv_0=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleExpression5355); 

                        	newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getNOTKeyword_0());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getExpressionAccess().getAddExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAddExpression_in_ruleExpression5378);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2463:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2464:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2465:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FOLLOW_ruleAddExpression_in_entryRuleAddExpression5412);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddExpression5422); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2472:1: ruleAddExpression returns [EObject current=null] : (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_multi_expr_0 = null;

        EObject lv_mul_exp_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2475:28: ( (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2476:1: (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2476:1: (this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2477:5: this_multi_expr_0= rulemulti_expr ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMulti_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulemulti_expr_in_ruleAddExpression5469);
            this_multi_expr_0=rulemulti_expr();

            state._fsp--;


                    current = this_multi_expr_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2485:1: ( ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==KEYWORD_7||LA39_0==KEYWORD_9) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2485:2: ( rulePLUS | ruleMINUS ) ( (lv_mul_exp_3_0= rulemulti_expr ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2485:2: ( rulePLUS | ruleMINUS )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==KEYWORD_7) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==KEYWORD_9) ) {
            	        alt38=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2486:5: rulePLUS
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getAddExpressionAccess().getPLUSParserRuleCall_1_0_0()); 
            	                
            	            pushFollow(FOLLOW_rulePLUS_in_ruleAddExpression5486);
            	            rulePLUS();

            	            state._fsp--;


            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2495:5: ruleMINUS
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getAddExpressionAccess().getMINUSParserRuleCall_1_0_1()); 
            	                
            	            pushFollow(FOLLOW_ruleMINUS_in_ruleAddExpression5507);
            	            ruleMINUS();

            	            state._fsp--;


            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2502:2: ( (lv_mul_exp_3_0= rulemulti_expr ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2503:1: (lv_mul_exp_3_0= rulemulti_expr )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2503:1: (lv_mul_exp_3_0= rulemulti_expr )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2504:3: lv_mul_exp_3_0= rulemulti_expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddExpressionAccess().getMul_expMulti_exprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulemulti_expr_in_ruleAddExpression5528);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2528:1: entryRulemulti_expr returns [EObject current=null] : iv_rulemulti_expr= rulemulti_expr EOF ;
    public final EObject entryRulemulti_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemulti_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2529:2: (iv_rulemulti_expr= rulemulti_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2530:2: iv_rulemulti_expr= rulemulti_expr EOF
            {
             newCompositeNode(grammarAccess.getMulti_exprRule()); 
            pushFollow(FOLLOW_rulemulti_expr_in_entryRulemulti_expr5565);
            iv_rulemulti_expr=rulemulti_expr();

            state._fsp--;

             current =iv_rulemulti_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemulti_expr5575); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2537:1: rulemulti_expr returns [EObject current=null] : (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* ) ;
    public final EObject rulemulti_expr() throws RecognitionException {
        EObject current = null;

        EObject this_cast_expr_0 = null;

        EObject lv_mul_cast_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2540:28: ( (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2541:1: (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2541:1: (this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2542:5: this_cast_expr_0= rulecast_expr ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMulti_exprAccess().getCast_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulecast_expr_in_rulemulti_expr5622);
            this_cast_expr_0=rulecast_expr();

            state._fsp--;


                    current = this_cast_expr_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2550:1: ( ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==KEYWORD_3||LA41_0==KEYWORD_6||LA41_0==KEYWORD_11) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2550:2: ( ruleSTAR | ruleDIV | rulePERCENT ) ( (lv_mul_cast_4_0= rulecast_expr ) )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2550:2: ( ruleSTAR | ruleDIV | rulePERCENT )
            	    int alt40=3;
            	    switch ( input.LA(1) ) {
            	    case KEYWORD_6:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case KEYWORD_11:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case KEYWORD_3:
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
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2551:5: ruleSTAR
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMulti_exprAccess().getSTARParserRuleCall_1_0_0()); 
            	                
            	            pushFollow(FOLLOW_ruleSTAR_in_rulemulti_expr5639);
            	            ruleSTAR();

            	            state._fsp--;


            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2560:5: ruleDIV
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMulti_exprAccess().getDIVParserRuleCall_1_0_1()); 
            	                
            	            pushFollow(FOLLOW_ruleDIV_in_rulemulti_expr5660);
            	            ruleDIV();

            	            state._fsp--;


            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2569:5: rulePERCENT
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getMulti_exprAccess().getPERCENTParserRuleCall_1_0_2()); 
            	                
            	            pushFollow(FOLLOW_rulePERCENT_in_rulemulti_expr5681);
            	            rulePERCENT();

            	            state._fsp--;


            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;

            	    }

            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2576:2: ( (lv_mul_cast_4_0= rulecast_expr ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2577:1: (lv_mul_cast_4_0= rulecast_expr )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2577:1: (lv_mul_cast_4_0= rulecast_expr )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2578:3: lv_mul_cast_4_0= rulecast_expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMulti_exprAccess().getMul_castCast_exprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulecast_expr_in_rulemulti_expr5702);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2602:1: entryRulecast_expr returns [EObject current=null] : iv_rulecast_expr= rulecast_expr EOF ;
    public final EObject entryRulecast_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecast_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2603:2: (iv_rulecast_expr= rulecast_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2604:2: iv_rulecast_expr= rulecast_expr EOF
            {
             newCompositeNode(grammarAccess.getCast_exprRule()); 
            pushFollow(FOLLOW_rulecast_expr_in_entryRulecast_expr5739);
            iv_rulecast_expr=rulecast_expr();

            state._fsp--;

             current =iv_rulecast_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecast_expr5749); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2611:1: rulecast_expr returns [EObject current=null] : this_unary_expr_0= ruleunary_expr ;
    public final EObject rulecast_expr() throws RecognitionException {
        EObject current = null;

        EObject this_unary_expr_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2614:28: (this_unary_expr_0= ruleunary_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2616:5: this_unary_expr_0= ruleunary_expr
            {
             
                    newCompositeNode(grammarAccess.getCast_exprAccess().getUnary_exprParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleunary_expr_in_rulecast_expr5795);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2632:1: entryRuleunary_expr returns [EObject current=null] : iv_ruleunary_expr= ruleunary_expr EOF ;
    public final EObject entryRuleunary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleunary_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2633:2: (iv_ruleunary_expr= ruleunary_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2634:2: iv_ruleunary_expr= ruleunary_expr EOF
            {
             newCompositeNode(grammarAccess.getUnary_exprRule()); 
            pushFollow(FOLLOW_ruleunary_expr_in_entryRuleunary_expr5828);
            iv_ruleunary_expr=ruleunary_expr();

            state._fsp--;

             current =iv_ruleunary_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleunary_expr5838); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2641:1: ruleunary_expr returns [EObject current=null] : (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr ) ;
    public final EObject ruleunary_expr() throws RecognitionException {
        EObject current = null;

        EObject this_expr_eval_0 = null;

        EObject this_neg_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2644:28: ( (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2645:1: (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2645:1: (this_expr_eval_0= ruleexpr_eval | this_neg_expr_1= ruleneg_expr )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KEYWORD_59||LA42_0==KEYWORD_56||LA42_0==KEYWORD_37||LA42_0==KEYWORD_2||LA42_0==KEYWORD_10||LA42_0==RULE_DIGIT||(LA42_0>=RULE_FLOATINGPOINT && LA42_0<=RULE_LONGINTEGER)||(LA42_0>=RULE_ID && LA42_0<=RULE_STRING)) ) {
                alt42=1;
            }
            else if ( (LA42_0==KEYWORD_9) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2646:5: this_expr_eval_0= ruleexpr_eval
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_exprAccess().getExpr_evalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleexpr_eval_in_ruleunary_expr5885);
                    this_expr_eval_0=ruleexpr_eval();

                    state._fsp--;


                            current = this_expr_eval_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2656:5: this_neg_expr_1= ruleneg_expr
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_exprAccess().getNeg_exprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleneg_expr_in_ruleunary_expr5912);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2672:1: entryRuleexpr_eval returns [EObject current=null] : iv_ruleexpr_eval= ruleexpr_eval EOF ;
    public final EObject entryRuleexpr_eval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr_eval = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2673:2: (iv_ruleexpr_eval= ruleexpr_eval EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2674:2: iv_ruleexpr_eval= ruleexpr_eval EOF
            {
             newCompositeNode(grammarAccess.getExpr_evalRule()); 
            pushFollow(FOLLOW_ruleexpr_eval_in_entryRuleexpr_eval5946);
            iv_ruleexpr_eval=ruleexpr_eval();

            state._fsp--;

             current =iv_ruleexpr_eval; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr_eval5956); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2681:1: ruleexpr_eval returns [EObject current=null] : ( ruleconst_expr | this_var_expr_1= rulevar_expr ) ;
    public final EObject ruleexpr_eval() throws RecognitionException {
        EObject current = null;

        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2684:28: ( ( ruleconst_expr | this_var_expr_1= rulevar_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2685:1: ( ruleconst_expr | this_var_expr_1= rulevar_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2685:1: ( ruleconst_expr | this_var_expr_1= rulevar_expr )
            int alt43=2;
            switch ( input.LA(1) ) {
            case KEYWORD_56:
            case KEYWORD_37:
            case RULE_DIGIT:
            case RULE_FLOATINGPOINT:
            case RULE_INT:
            case RULE_LONGINTEGER:
            case RULE_STRING:
                {
                alt43=1;
                }
                break;
            case KEYWORD_2:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==KEYWORD_2||LA43_2==KEYWORD_4||LA43_2==KEYWORD_10||LA43_2==RULE_INT) ) {
                    alt43=2;
                }
                else if ( (LA43_2==RULE_ID) ) {
                    int LA43_4 = input.LA(3);

                    if ( (LA43_4==EOF||LA43_4==KEYWORD_91||LA43_4==KEYWORD_86||LA43_4==KEYWORD_79||LA43_4==KEYWORD_60||(LA43_4>=KEYWORD_64 && LA43_4<=KEYWORD_65)||LA43_4==KEYWORD_70||LA43_4==KEYWORD_50||LA43_4==KEYWORD_53||LA43_4==KEYWORD_39||LA43_4==KEYWORD_43||(LA43_4>=KEYWORD_45 && LA43_4<=KEYWORD_46)||LA43_4==KEYWORD_23||(LA43_4>=KEYWORD_25 && LA43_4<=KEYWORD_28)||(LA43_4>=KEYWORD_30 && LA43_4<=KEYWORD_31)||(LA43_4>=KEYWORD_33 && LA43_4<=KEYWORD_34)||LA43_4==KEYWORD_36||LA43_4==KEYWORD_3||(LA43_4>=KEYWORD_5 && LA43_4<=KEYWORD_9)||(LA43_4>=KEYWORD_11 && LA43_4<=KEYWORD_14)||(LA43_4>=KEYWORD_16 && LA43_4<=KEYWORD_17)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_4==KEYWORD_2||LA43_4==KEYWORD_4||LA43_4==KEYWORD_10||LA43_4==RULE_ID) ) {
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
            case KEYWORD_59:
            case KEYWORD_10:
            case RULE_ID:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2686:5: ruleconst_expr
                    {
                     
                            newCompositeNode(grammarAccess.getExpr_evalAccess().getConst_exprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleconst_expr_in_ruleexpr_eval5997);
                    ruleconst_expr();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2695:5: this_var_expr_1= rulevar_expr
                    {
                     
                            newCompositeNode(grammarAccess.getExpr_evalAccess().getVar_exprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulevar_expr_in_ruleexpr_eval6024);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2711:1: entryRulevar_expr returns [EObject current=null] : iv_rulevar_expr= rulevar_expr EOF ;
    public final EObject entryRulevar_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevar_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2712:2: (iv_rulevar_expr= rulevar_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2713:2: iv_rulevar_expr= rulevar_expr EOF
            {
             newCompositeNode(grammarAccess.getVar_exprRule()); 
            pushFollow(FOLLOW_rulevar_expr_in_entryRulevar_expr6058);
            iv_rulevar_expr=rulevar_expr();

            state._fsp--;

             current =iv_rulevar_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevar_expr6068); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2720:1: rulevar_expr returns [EObject current=null] : (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* ) ;
    public final EObject rulevar_expr() throws RecognitionException {
        EObject current = null;

        EObject this_projectable_expr_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2723:28: ( (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2724:1: (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2724:1: (this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2725:5: this_projectable_expr_0= ruleprojectable_expr ( ruledot_proj | rulepound_proj )*
            {
             
                    newCompositeNode(grammarAccess.getVar_exprAccess().getProjectable_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleprojectable_expr_in_rulevar_expr6115);
            this_projectable_expr_0=ruleprojectable_expr();

            state._fsp--;


                    current = this_projectable_expr_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2733:1: ( ruledot_proj | rulepound_proj )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==KEYWORD_24||LA44_0==KEYWORD_10) ) {
                    alt44=1;
                }
                else if ( (LA44_0==KEYWORD_1) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2734:5: ruledot_proj
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVar_exprAccess().getDot_projParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruledot_proj_in_rulevar_expr6131);
            	    ruledot_proj();

            	    state._fsp--;


            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2743:5: rulepound_proj
            	    {
            	     
            	            newCompositeNode(grammarAccess.getVar_exprAccess().getPound_projParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_rulepound_proj_in_rulevar_expr6152);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2758:1: entryRuleprojectable_expr returns [EObject current=null] : iv_ruleprojectable_expr= ruleprojectable_expr EOF ;
    public final EObject entryRuleprojectable_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprojectable_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2759:2: (iv_ruleprojectable_expr= ruleprojectable_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2760:2: iv_ruleprojectable_expr= ruleprojectable_expr EOF
            {
             newCompositeNode(grammarAccess.getProjectable_exprRule()); 
            pushFollow(FOLLOW_ruleprojectable_expr_in_entryRuleprojectable_expr6188);
            iv_ruleprojectable_expr=ruleprojectable_expr();

            state._fsp--;

             current =iv_ruleprojectable_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprojectable_expr6198); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2767:1: ruleprojectable_expr returns [EObject current=null] : (this_func_eval_0= rulefunc_eval | rulecol_ref ) ;
    public final EObject ruleprojectable_expr() throws RecognitionException {
        EObject current = null;

        EObject this_func_eval_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2770:28: ( (this_func_eval_0= rulefunc_eval | rulecol_ref ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2771:1: (this_func_eval_0= rulefunc_eval | rulecol_ref )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2771:1: (this_func_eval_0= rulefunc_eval | rulecol_ref )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2772:5: this_func_eval_0= rulefunc_eval
                    {
                     
                            newCompositeNode(grammarAccess.getProjectable_exprAccess().getFunc_evalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulefunc_eval_in_ruleprojectable_expr6245);
                    this_func_eval_0=rulefunc_eval();

                    state._fsp--;


                            current = this_func_eval_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2782:5: rulecol_ref
                    {
                     
                            newCompositeNode(grammarAccess.getProjectable_exprAccess().getCol_refParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecol_ref_in_ruleprojectable_expr6266);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2797:1: entryRuledot_proj returns [String current=null] : iv_ruledot_proj= ruledot_proj EOF ;
    public final String entryRuledot_proj() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledot_proj = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2798:1: (iv_ruledot_proj= ruledot_proj EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2799:2: iv_ruledot_proj= ruledot_proj EOF
            {
             newCompositeNode(grammarAccess.getDot_projRule()); 
            pushFollow(FOLLOW_ruledot_proj_in_entryRuledot_proj6301);
            iv_ruledot_proj=ruledot_proj();

            state._fsp--;

             current =iv_ruledot_proj.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledot_proj6312); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2806:1: ruledot_proj returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_10 | kw= KEYWORD_24 ) this_col_alias_or_index_2= rulecol_alias_or_index ) ;
    public final AntlrDatatypeRuleToken ruledot_proj() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_col_alias_or_index_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2810:6: ( ( (kw= KEYWORD_10 | kw= KEYWORD_24 ) this_col_alias_or_index_2= rulecol_alias_or_index ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2811:1: ( (kw= KEYWORD_10 | kw= KEYWORD_24 ) this_col_alias_or_index_2= rulecol_alias_or_index )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2811:1: ( (kw= KEYWORD_10 | kw= KEYWORD_24 ) this_col_alias_or_index_2= rulecol_alias_or_index )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2811:2: (kw= KEYWORD_10 | kw= KEYWORD_24 ) this_col_alias_or_index_2= rulecol_alias_or_index
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2811:2: (kw= KEYWORD_10 | kw= KEYWORD_24 )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KEYWORD_10) ) {
                alt46=1;
            }
            else if ( (LA46_0==KEYWORD_24) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2812:2: kw= KEYWORD_10
                    {
                    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruledot_proj6351); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDot_projAccess().getFullStopKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2819:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruledot_proj6370); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDot_projAccess().getColonColonKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getDot_projAccess().getCol_alias_or_indexParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulecol_alias_or_index_in_ruledot_proj6393);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2843:1: entryRulecol_alias_or_index returns [String current=null] : iv_rulecol_alias_or_index= rulecol_alias_or_index EOF ;
    public final String entryRulecol_alias_or_index() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_alias_or_index = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2844:1: (iv_rulecol_alias_or_index= rulecol_alias_or_index EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2845:2: iv_rulecol_alias_or_index= rulecol_alias_or_index EOF
            {
             newCompositeNode(grammarAccess.getCol_alias_or_indexRule()); 
            pushFollow(FOLLOW_rulecol_alias_or_index_in_entryRulecol_alias_or_index6438);
            iv_rulecol_alias_or_index=rulecol_alias_or_index();

            state._fsp--;

             current =iv_rulecol_alias_or_index.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_alias_or_index6449); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2852:1: rulecol_alias_or_index returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index ) ;
    public final AntlrDatatypeRuleToken rulecol_alias_or_index() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_col_alias_0 = null;

        AntlrDatatypeRuleToken this_col_index_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2856:6: ( (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2857:1: (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2857:1: (this_col_alias_0= rulecol_alias | this_col_index_1= rulecol_index )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            else if ( (LA47_0==KEYWORD_2) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2858:5: this_col_alias_0= rulecol_alias
                    {
                     
                            newCompositeNode(grammarAccess.getCol_alias_or_indexAccess().getCol_aliasParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulecol_alias_in_rulecol_alias_or_index6496);
                    this_col_alias_0=rulecol_alias();

                    state._fsp--;


                    		current.merge(this_col_alias_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2870:5: this_col_index_1= rulecol_index
                    {
                     
                            newCompositeNode(grammarAccess.getCol_alias_or_indexAccess().getCol_indexParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulecol_index_in_rulecol_alias_or_index6529);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2888:1: entryRulecol_alias returns [String current=null] : iv_rulecol_alias= rulecol_alias EOF ;
    public final String entryRulecol_alias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_alias = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2889:1: (iv_rulecol_alias= rulecol_alias EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2890:2: iv_rulecol_alias= rulecol_alias EOF
            {
             newCompositeNode(grammarAccess.getCol_aliasRule()); 
            pushFollow(FOLLOW_rulecol_alias_in_entryRulecol_alias6574);
            iv_rulecol_alias=rulecol_alias();

            state._fsp--;

             current =iv_rulecol_alias.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_alias6585); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2897:1: rulecol_alias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_IDENTIFIER_0= ruleIDENTIFIER ;
    public final AntlrDatatypeRuleToken rulecol_alias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2901:6: (this_IDENTIFIER_0= ruleIDENTIFIER )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2903:5: this_IDENTIFIER_0= ruleIDENTIFIER
            {
             
                    newCompositeNode(grammarAccess.getCol_aliasAccess().getIDENTIFIERParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleIDENTIFIER_in_rulecol_alias6631);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2921:1: entryRulecol_index returns [String current=null] : iv_rulecol_index= rulecol_index EOF ;
    public final String entryRulecol_index() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_index = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2922:1: (iv_rulecol_index= rulecol_index EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2923:2: iv_rulecol_index= rulecol_index EOF
            {
             newCompositeNode(grammarAccess.getCol_indexRule()); 
            pushFollow(FOLLOW_rulecol_index_in_entryRulecol_index6675);
            iv_rulecol_index=rulecol_index();

            state._fsp--;

             current =iv_rulecol_index.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_index6686); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2930:1: rulecol_index returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken rulecol_index() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_DOLLAR_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2934:6: ( (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2935:1: (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2935:1: (this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2936:5: this_DOLLAR_0= ruleDOLLAR (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT )
            {
             
                    newCompositeNode(grammarAccess.getCol_indexAccess().getDOLLARParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDOLLAR_in_rulecol_index6733);
            this_DOLLAR_0=ruleDOLLAR();

            state._fsp--;


            		current.merge(this_DOLLAR_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2946:1: (this_DIGIT_1= RULE_DIGIT | this_INT_2= RULE_INT )
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2946:6: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rulecol_index6754); 

                    		current.merge(this_DIGIT_1);
                        
                     
                        newLeafNode(this_DIGIT_1, grammarAccess.getCol_indexAccess().getDIGITTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2954:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulecol_index6780); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2969:1: entryRulepound_proj returns [String current=null] : iv_rulepound_proj= rulepound_proj EOF ;
    public final String entryRulepound_proj() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepound_proj = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2970:1: (iv_rulepound_proj= rulepound_proj EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2971:2: iv_rulepound_proj= rulepound_proj EOF
            {
             newCompositeNode(grammarAccess.getPound_projRule()); 
            pushFollow(FOLLOW_rulepound_proj_in_entryRulepound_proj6826);
            iv_rulepound_proj=rulepound_proj();

            state._fsp--;

             current =iv_rulepound_proj.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepound_proj6837); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2978:1: rulepound_proj returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= KEYWORD_56 ) ) ;
    public final AntlrDatatypeRuleToken rulepound_proj() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_POUND_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2982:6: ( (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= KEYWORD_56 ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2983:1: (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= KEYWORD_56 ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2983:1: (this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= KEYWORD_56 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2984:5: this_POUND_0= rulePOUND (this_STRING_1= RULE_STRING | kw= KEYWORD_56 )
            {
             
                    newCompositeNode(grammarAccess.getPound_projAccess().getPOUNDParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePOUND_in_rulepound_proj6884);
            this_POUND_0=rulePOUND();

            state._fsp--;


            		current.merge(this_POUND_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2994:1: (this_STRING_1= RULE_STRING | kw= KEYWORD_56 )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_STRING) ) {
                alt49=1;
            }
            else if ( (LA49_0==KEYWORD_56) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:2994:6: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulepound_proj6905); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getPound_projAccess().getSTRINGTerminalRuleCall_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3003:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_rulepound_proj6929); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3018:1: entryRuleneg_expr returns [EObject current=null] : iv_ruleneg_expr= ruleneg_expr EOF ;
    public final EObject entryRuleneg_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleneg_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3019:2: (iv_ruleneg_expr= ruleneg_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3020:2: iv_ruleneg_expr= ruleneg_expr EOF
            {
             newCompositeNode(grammarAccess.getNeg_exprRule()); 
            pushFollow(FOLLOW_ruleneg_expr_in_entryRuleneg_expr6971);
            iv_ruleneg_expr=ruleneg_expr();

            state._fsp--;

             current =iv_ruleneg_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleneg_expr6981); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3027:1: ruleneg_expr returns [EObject current=null] : (otherlv_0= KEYWORD_9 this_cast_expr_1= rulecast_expr ) ;
    public final EObject ruleneg_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_cast_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3030:28: ( (otherlv_0= KEYWORD_9 this_cast_expr_1= rulecast_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3031:1: (otherlv_0= KEYWORD_9 this_cast_expr_1= rulecast_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3031:1: (otherlv_0= KEYWORD_9 this_cast_expr_1= rulecast_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3032:2: otherlv_0= KEYWORD_9 this_cast_expr_1= rulecast_expr
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleneg_expr7019); 

                	newLeafNode(otherlv_0, grammarAccess.getNeg_exprAccess().getHyphenMinusKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNeg_exprAccess().getCast_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulecast_expr_in_ruleneg_expr7040);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3053:1: entryRulerel_op returns [String current=null] : iv_rulerel_op= rulerel_op EOF ;
    public final String entryRulerel_op() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3054:1: (iv_rulerel_op= rulerel_op EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3055:2: iv_rulerel_op= rulerel_op EOF
            {
             newCompositeNode(grammarAccess.getRel_opRule()); 
            pushFollow(FOLLOW_rulerel_op_in_entryRulerel_op7075);
            iv_rulerel_op=rulerel_op();

            state._fsp--;

             current =iv_rulerel_op.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op7086); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3062:1: rulerel_op returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= KEYWORD_79 ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3066:6: ( (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= KEYWORD_79 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3067:1: (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= KEYWORD_79 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3067:1: (this_rel_op_eq_0= rulerel_op_eq | this_rel_op_ne_1= rulerel_op_ne | this_rel_op_gt_2= rulerel_op_gt | this_rel_op_gte_3= rulerel_op_gte | this_rel_op_lt_4= rulerel_op_lt | this_rel_op_lte_5= rulerel_op_lte | kw= KEYWORD_79 )
            int alt50=7;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
            case KEYWORD_30:
                {
                alt50=1;
                }
                break;
            case KEYWORD_46:
            case KEYWORD_23:
                {
                alt50=2;
                }
                break;
            case KEYWORD_31:
            case KEYWORD_16:
                {
                alt50=3;
                }
                break;
            case KEYWORD_43:
            case KEYWORD_27:
                {
                alt50=4;
                }
                break;
            case KEYWORD_34:
            case KEYWORD_14:
                {
                alt50=5;
                }
                break;
            case KEYWORD_45:
            case KEYWORD_25:
                {
                alt50=6;
                }
                break;
            case KEYWORD_79:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3068:5: this_rel_op_eq_0= rulerel_op_eq
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_eqParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulerel_op_eq_in_rulerel_op7133);
                    this_rel_op_eq_0=rulerel_op_eq();

                    state._fsp--;


                    		current.merge(this_rel_op_eq_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3080:5: this_rel_op_ne_1= rulerel_op_ne
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_neParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerel_op_ne_in_rulerel_op7166);
                    this_rel_op_ne_1=rulerel_op_ne();

                    state._fsp--;


                    		current.merge(this_rel_op_ne_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3092:5: this_rel_op_gt_2= rulerel_op_gt
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_gtParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulerel_op_gt_in_rulerel_op7199);
                    this_rel_op_gt_2=rulerel_op_gt();

                    state._fsp--;


                    		current.merge(this_rel_op_gt_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3104:5: this_rel_op_gte_3= rulerel_op_gte
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_gteParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulerel_op_gte_in_rulerel_op7232);
                    this_rel_op_gte_3=rulerel_op_gte();

                    state._fsp--;


                    		current.merge(this_rel_op_gte_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3116:5: this_rel_op_lt_4= rulerel_op_lt
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_ltParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulerel_op_lt_in_rulerel_op7265);
                    this_rel_op_lt_4=rulerel_op_lt();

                    state._fsp--;


                    		current.merge(this_rel_op_lt_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3128:5: this_rel_op_lte_5= rulerel_op_lte
                    {
                     
                            newCompositeNode(grammarAccess.getRel_opAccess().getRel_op_lteParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_rulerel_op_lte_in_rulerel_op7298);
                    this_rel_op_lte_5=rulerel_op_lte();

                    state._fsp--;


                    		current.merge(this_rel_op_lte_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3140:2: kw= KEYWORD_79
                    {
                    kw=(Token)match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_rulerel_op7322); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3153:1: entryRulerel_op_eq returns [String current=null] : iv_rulerel_op_eq= rulerel_op_eq EOF ;
    public final String entryRulerel_op_eq() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_eq = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3154:1: (iv_rulerel_op_eq= rulerel_op_eq EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3155:2: iv_rulerel_op_eq= rulerel_op_eq EOF
            {
             newCompositeNode(grammarAccess.getRel_op_eqRule()); 
            pushFollow(FOLLOW_rulerel_op_eq_in_entryRulerel_op_eq7362);
            iv_rulerel_op_eq=rulerel_op_eq();

            state._fsp--;

             current =iv_rulerel_op_eq.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_eq7373); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3162:1: rulerel_op_eq returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ ) ;
    public final AntlrDatatypeRuleToken rulerel_op_eq() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_EQ_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_EQ_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3166:6: ( (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3167:1: (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3167:1: (this_STR_OP_EQ_0= ruleSTR_OP_EQ | this_NUM_OP_EQ_1= ruleNUM_OP_EQ )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==KEYWORD_30) ) {
                alt51=1;
            }
            else if ( (LA51_0==KEYWORD_26) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3168:5: this_STR_OP_EQ_0= ruleSTR_OP_EQ
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_eqAccess().getSTR_OP_EQParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_EQ_in_rulerel_op_eq7420);
                    this_STR_OP_EQ_0=ruleSTR_OP_EQ();

                    state._fsp--;


                    		current.merge(this_STR_OP_EQ_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3180:5: this_NUM_OP_EQ_1= ruleNUM_OP_EQ
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_eqAccess().getNUM_OP_EQParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_EQ_in_rulerel_op_eq7453);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3198:1: entryRulerel_op_ne returns [String current=null] : iv_rulerel_op_ne= rulerel_op_ne EOF ;
    public final String entryRulerel_op_ne() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_ne = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3199:1: (iv_rulerel_op_ne= rulerel_op_ne EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3200:2: iv_rulerel_op_ne= rulerel_op_ne EOF
            {
             newCompositeNode(grammarAccess.getRel_op_neRule()); 
            pushFollow(FOLLOW_rulerel_op_ne_in_entryRulerel_op_ne7498);
            iv_rulerel_op_ne=rulerel_op_ne();

            state._fsp--;

             current =iv_rulerel_op_ne.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_ne7509); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3207:1: rulerel_op_ne returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE ) ;
    public final AntlrDatatypeRuleToken rulerel_op_ne() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_NE_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_NE_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3211:6: ( (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3212:1: (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3212:1: (this_STR_OP_NE_0= ruleSTR_OP_NE | this_NUM_OP_NE_1= ruleNUM_OP_NE )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==KEYWORD_46) ) {
                alt52=1;
            }
            else if ( (LA52_0==KEYWORD_23) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3213:5: this_STR_OP_NE_0= ruleSTR_OP_NE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_neAccess().getSTR_OP_NEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_NE_in_rulerel_op_ne7556);
                    this_STR_OP_NE_0=ruleSTR_OP_NE();

                    state._fsp--;


                    		current.merge(this_STR_OP_NE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3225:5: this_NUM_OP_NE_1= ruleNUM_OP_NE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_neAccess().getNUM_OP_NEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_NE_in_rulerel_op_ne7589);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3243:1: entryRulerel_op_gt returns [String current=null] : iv_rulerel_op_gt= rulerel_op_gt EOF ;
    public final String entryRulerel_op_gt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_gt = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3244:1: (iv_rulerel_op_gt= rulerel_op_gt EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3245:2: iv_rulerel_op_gt= rulerel_op_gt EOF
            {
             newCompositeNode(grammarAccess.getRel_op_gtRule()); 
            pushFollow(FOLLOW_rulerel_op_gt_in_entryRulerel_op_gt7634);
            iv_rulerel_op_gt=rulerel_op_gt();

            state._fsp--;

             current =iv_rulerel_op_gt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_gt7645); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3252:1: rulerel_op_gt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT ) ;
    public final AntlrDatatypeRuleToken rulerel_op_gt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_GT_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_GT_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3256:6: ( (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3257:1: (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3257:1: (this_STR_OP_GT_0= ruleSTR_OP_GT | this_NUM_OP_GT_1= ruleNUM_OP_GT )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==KEYWORD_31) ) {
                alt53=1;
            }
            else if ( (LA53_0==KEYWORD_16) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3258:5: this_STR_OP_GT_0= ruleSTR_OP_GT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gtAccess().getSTR_OP_GTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_GT_in_rulerel_op_gt7692);
                    this_STR_OP_GT_0=ruleSTR_OP_GT();

                    state._fsp--;


                    		current.merge(this_STR_OP_GT_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3270:5: this_NUM_OP_GT_1= ruleNUM_OP_GT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gtAccess().getNUM_OP_GTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_GT_in_rulerel_op_gt7725);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3288:1: entryRulerel_op_gte returns [String current=null] : iv_rulerel_op_gte= rulerel_op_gte EOF ;
    public final String entryRulerel_op_gte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_gte = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3289:1: (iv_rulerel_op_gte= rulerel_op_gte EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3290:2: iv_rulerel_op_gte= rulerel_op_gte EOF
            {
             newCompositeNode(grammarAccess.getRel_op_gteRule()); 
            pushFollow(FOLLOW_rulerel_op_gte_in_entryRulerel_op_gte7770);
            iv_rulerel_op_gte=rulerel_op_gte();

            state._fsp--;

             current =iv_rulerel_op_gte.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_gte7781); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3297:1: rulerel_op_gte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE ) ;
    public final AntlrDatatypeRuleToken rulerel_op_gte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_GTE_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_GTE_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3301:6: ( (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3302:1: (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3302:1: (this_STR_OP_GTE_0= ruleSTR_OP_GTE | this_NUM_OP_GTE_1= ruleNUM_OP_GTE )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KEYWORD_43) ) {
                alt54=1;
            }
            else if ( (LA54_0==KEYWORD_27) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3303:5: this_STR_OP_GTE_0= ruleSTR_OP_GTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gteAccess().getSTR_OP_GTEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_GTE_in_rulerel_op_gte7828);
                    this_STR_OP_GTE_0=ruleSTR_OP_GTE();

                    state._fsp--;


                    		current.merge(this_STR_OP_GTE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3315:5: this_NUM_OP_GTE_1= ruleNUM_OP_GTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_gteAccess().getNUM_OP_GTEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_GTE_in_rulerel_op_gte7861);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3333:1: entryRulerel_op_lt returns [String current=null] : iv_rulerel_op_lt= rulerel_op_lt EOF ;
    public final String entryRulerel_op_lt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_lt = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3334:1: (iv_rulerel_op_lt= rulerel_op_lt EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3335:2: iv_rulerel_op_lt= rulerel_op_lt EOF
            {
             newCompositeNode(grammarAccess.getRel_op_ltRule()); 
            pushFollow(FOLLOW_rulerel_op_lt_in_entryRulerel_op_lt7906);
            iv_rulerel_op_lt=rulerel_op_lt();

            state._fsp--;

             current =iv_rulerel_op_lt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_lt7917); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3342:1: rulerel_op_lt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT ) ;
    public final AntlrDatatypeRuleToken rulerel_op_lt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_LT_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_LT_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3346:6: ( (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3347:1: (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3347:1: (this_STR_OP_LT_0= ruleSTR_OP_LT | this_NUM_OP_LT_1= ruleNUM_OP_LT )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KEYWORD_34) ) {
                alt55=1;
            }
            else if ( (LA55_0==KEYWORD_14) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3348:5: this_STR_OP_LT_0= ruleSTR_OP_LT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_ltAccess().getSTR_OP_LTParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_LT_in_rulerel_op_lt7964);
                    this_STR_OP_LT_0=ruleSTR_OP_LT();

                    state._fsp--;


                    		current.merge(this_STR_OP_LT_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3360:5: this_NUM_OP_LT_1= ruleNUM_OP_LT
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_ltAccess().getNUM_OP_LTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_LT_in_rulerel_op_lt7997);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3378:1: entryRulerel_op_lte returns [String current=null] : iv_rulerel_op_lte= rulerel_op_lte EOF ;
    public final String entryRulerel_op_lte() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerel_op_lte = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3379:1: (iv_rulerel_op_lte= rulerel_op_lte EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3380:2: iv_rulerel_op_lte= rulerel_op_lte EOF
            {
             newCompositeNode(grammarAccess.getRel_op_lteRule()); 
            pushFollow(FOLLOW_rulerel_op_lte_in_entryRulerel_op_lte8042);
            iv_rulerel_op_lte=rulerel_op_lte();

            state._fsp--;

             current =iv_rulerel_op_lte.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_op_lte8053); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3387:1: rulerel_op_lte returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE ) ;
    public final AntlrDatatypeRuleToken rulerel_op_lte() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STR_OP_LTE_0 = null;

        AntlrDatatypeRuleToken this_NUM_OP_LTE_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3391:6: ( (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3392:1: (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3392:1: (this_STR_OP_LTE_0= ruleSTR_OP_LTE | this_NUM_OP_LTE_1= ruleNUM_OP_LTE )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KEYWORD_45) ) {
                alt56=1;
            }
            else if ( (LA56_0==KEYWORD_25) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3393:5: this_STR_OP_LTE_0= ruleSTR_OP_LTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_lteAccess().getSTR_OP_LTEParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSTR_OP_LTE_in_rulerel_op_lte8100);
                    this_STR_OP_LTE_0=ruleSTR_OP_LTE();

                    state._fsp--;


                    		current.merge(this_STR_OP_LTE_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3405:5: this_NUM_OP_LTE_1= ruleNUM_OP_LTE
                    {
                     
                            newCompositeNode(grammarAccess.getRel_op_lteAccess().getNUM_OP_LTEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNUM_OP_LTE_in_rulerel_op_lte8133);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3423:1: entryRuleAliasType returns [EObject current=null] : iv_ruleAliasType= ruleAliasType EOF ;
    public final EObject entryRuleAliasType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3424:2: (iv_ruleAliasType= ruleAliasType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3425:2: iv_ruleAliasType= ruleAliasType EOF
            {
             newCompositeNode(grammarAccess.getAliasTypeRule()); 
            pushFollow(FOLLOW_ruleAliasType_in_entryRuleAliasType8177);
            iv_ruleAliasType=ruleAliasType();

            state._fsp--;

             current =iv_ruleAliasType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasType8187); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3432:1: ruleAliasType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleAliasType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3435:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3436:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3436:1: ( (otherlv_0= RULE_ID ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3437:1: (otherlv_0= RULE_ID )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3437:1: (otherlv_0= RULE_ID )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3438:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAliasTypeRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAliasType8231); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3457:1: entryRuleFlattenGeneratedItem returns [EObject current=null] : iv_ruleFlattenGeneratedItem= ruleFlattenGeneratedItem EOF ;
    public final EObject entryRuleFlattenGeneratedItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlattenGeneratedItem = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3458:2: (iv_ruleFlattenGeneratedItem= ruleFlattenGeneratedItem EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3459:2: iv_ruleFlattenGeneratedItem= ruleFlattenGeneratedItem EOF
            {
             newCompositeNode(grammarAccess.getFlattenGeneratedItemRule()); 
            pushFollow(FOLLOW_ruleFlattenGeneratedItem_in_entryRuleFlattenGeneratedItem8265);
            iv_ruleFlattenGeneratedItem=ruleFlattenGeneratedItem();

            state._fsp--;

             current =iv_ruleFlattenGeneratedItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlattenGeneratedItem8275); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3466:1: ruleFlattenGeneratedItem returns [EObject current=null] : ( (this_Condition_0= ruleCondition | otherlv_1= KEYWORD_6 ) (otherlv_2= KEYWORD_28 ( ruleFieldDef | ruleFieldFefList ) )? ) ;
    public final EObject ruleFlattenGeneratedItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_Condition_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3469:28: ( ( (this_Condition_0= ruleCondition | otherlv_1= KEYWORD_6 ) (otherlv_2= KEYWORD_28 ( ruleFieldDef | ruleFieldFefList ) )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3470:1: ( (this_Condition_0= ruleCondition | otherlv_1= KEYWORD_6 ) (otherlv_2= KEYWORD_28 ( ruleFieldDef | ruleFieldFefList ) )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3470:1: ( (this_Condition_0= ruleCondition | otherlv_1= KEYWORD_6 ) (otherlv_2= KEYWORD_28 ( ruleFieldDef | ruleFieldFefList ) )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3470:2: (this_Condition_0= ruleCondition | otherlv_1= KEYWORD_6 ) (otherlv_2= KEYWORD_28 ( ruleFieldDef | ruleFieldFefList ) )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3470:2: (this_Condition_0= ruleCondition | otherlv_1= KEYWORD_6 )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KEYWORD_59||LA57_0==KEYWORD_56||LA57_0==KEYWORD_47||LA57_0==KEYWORD_37||LA57_0==KEYWORD_2||LA57_0==KEYWORD_4||(LA57_0>=KEYWORD_9 && LA57_0<=KEYWORD_10)||LA57_0==RULE_DIGIT||(LA57_0>=RULE_FLOATINGPOINT && LA57_0<=RULE_LONGINTEGER)||(LA57_0>=RULE_ID && LA57_0<=RULE_STRING)) ) {
                alt57=1;
            }
            else if ( (LA57_0==KEYWORD_6) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3471:5: this_Condition_0= ruleCondition
                    {
                     
                            newCompositeNode(grammarAccess.getFlattenGeneratedItemAccess().getConditionParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleCondition_in_ruleFlattenGeneratedItem8323);
                    this_Condition_0=ruleCondition();

                    state._fsp--;


                            current = this_Condition_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3481:2: otherlv_1= KEYWORD_6
                    {
                    otherlv_1=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleFlattenGeneratedItem8341); 

                        	newLeafNode(otherlv_1, grammarAccess.getFlattenGeneratedItemAccess().getAsteriskKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3485:2: (otherlv_2= KEYWORD_28 ( ruleFieldDef | ruleFieldFefList ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KEYWORD_28) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3486:2: otherlv_2= KEYWORD_28 ( ruleFieldDef | ruleFieldFefList )
                    {
                    otherlv_2=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleFlattenGeneratedItem8355); 

                        	newLeafNode(otherlv_2, grammarAccess.getFlattenGeneratedItemAccess().getASKeyword_1_0());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3490:1: ( ruleFieldDef | ruleFieldFefList )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_ID) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==KEYWORD_4) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3491:5: ruleFieldDef
                            {
                             
                                    newCompositeNode(grammarAccess.getFlattenGeneratedItemAccess().getFieldDefParserRuleCall_1_1_0()); 
                                
                            pushFollow(FOLLOW_ruleFieldDef_in_ruleFlattenGeneratedItem8371);
                            ruleFieldDef();

                            state._fsp--;


                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3500:5: ruleFieldFefList
                            {
                             
                                    newCompositeNode(grammarAccess.getFlattenGeneratedItemAccess().getFieldFefListParserRuleCall_1_1_1()); 
                                
                            pushFollow(FOLLOW_ruleFieldFefList_in_ruleFlattenGeneratedItem8392);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3515:1: entryRuleCommentStatement returns [String current=null] : iv_ruleCommentStatement= ruleCommentStatement EOF ;
    public final String entryRuleCommentStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentStatement = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3516:1: (iv_ruleCommentStatement= ruleCommentStatement EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3517:2: iv_ruleCommentStatement= ruleCommentStatement EOF
            {
             newCompositeNode(grammarAccess.getCommentStatementRule()); 
            pushFollow(FOLLOW_ruleCommentStatement_in_entryRuleCommentStatement8430);
            iv_ruleCommentStatement=ruleCommentStatement();

            state._fsp--;

             current =iv_ruleCommentStatement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentStatement8441); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3524:1: ruleCommentStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SL_COMMENT_0= RULE_SL_COMMENT ;
    public final AntlrDatatypeRuleToken ruleCommentStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SL_COMMENT_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3528:6: (this_SL_COMMENT_0= RULE_SL_COMMENT )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3529:5: this_SL_COMMENT_0= RULE_SL_COMMENT
            {
            this_SL_COMMENT_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleCommentStatement8480); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3544:1: entryRuleAlias returns [String current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final String entryRuleAlias() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlias = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3545:1: (iv_ruleAlias= ruleAlias EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3546:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias8524);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias8535); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3553:1: ruleAlias returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleAlias() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3557:6: (this_ID_0= RULE_ID )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3558:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlias8574); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3573:1: entryRuleParallelClause returns [String current=null] : iv_ruleParallelClause= ruleParallelClause EOF ;
    public final String entryRuleParallelClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParallelClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3574:1: (iv_ruleParallelClause= ruleParallelClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3575:2: iv_ruleParallelClause= ruleParallelClause EOF
            {
             newCompositeNode(grammarAccess.getParallelClauseRule()); 
            pushFollow(FOLLOW_ruleParallelClause_in_entryRuleParallelClause8618);
            iv_ruleParallelClause=ruleParallelClause();

            state._fsp--;

             current =iv_ruleParallelClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParallelClause8629); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3582:1: ruleParallelClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_86 this_scalarInt_1= rulescalarInt ) ;
    public final AntlrDatatypeRuleToken ruleParallelClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_scalarInt_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3586:6: ( (kw= KEYWORD_86 this_scalarInt_1= rulescalarInt ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3587:1: (kw= KEYWORD_86 this_scalarInt_1= rulescalarInt )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3587:1: (kw= KEYWORD_86 this_scalarInt_1= rulescalarInt )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3588:2: kw= KEYWORD_86 this_scalarInt_1= rulescalarInt
            {
            kw=(Token)match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_ruleParallelClause8667); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParallelClauseAccess().getPARALLELKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getParallelClauseAccess().getScalarIntParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulescalarInt_in_ruleParallelClause8689);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3612:1: entryRuleRegisterClause returns [String current=null] : iv_ruleRegisterClause= ruleRegisterClause EOF ;
    public final String entryRuleRegisterClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegisterClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3613:1: (iv_ruleRegisterClause= ruleRegisterClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3614:2: iv_ruleRegisterClause= ruleRegisterClause EOF
            {
             newCompositeNode(grammarAccess.getRegisterClauseRule()); 
            pushFollow(FOLLOW_ruleRegisterClause_in_entryRuleRegisterClause8734);
            iv_ruleRegisterClause=ruleRegisterClause();

            state._fsp--;

             current =iv_ruleRegisterClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegisterClause8745); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3621:1: ruleRegisterClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_87 this_PathClause_1= rulePathClause ) ;
    public final AntlrDatatypeRuleToken ruleRegisterClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PathClause_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3625:6: ( (kw= KEYWORD_87 this_PathClause_1= rulePathClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3626:1: (kw= KEYWORD_87 this_PathClause_1= rulePathClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3626:1: (kw= KEYWORD_87 this_PathClause_1= rulePathClause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3627:2: kw= KEYWORD_87 this_PathClause_1= rulePathClause
            {
            kw=(Token)match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_ruleRegisterClause8783); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRegisterClauseAccess().getREGISTERKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getRegisterClauseAccess().getPathClauseParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePathClause_in_ruleRegisterClause8805);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3651:1: entryRuleDefaultClause returns [EObject current=null] : iv_ruleDefaultClause= ruleDefaultClause EOF ;
    public final EObject entryRuleDefaultClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3652:2: (iv_ruleDefaultClause= ruleDefaultClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3653:2: iv_ruleDefaultClause= ruleDefaultClause EOF
            {
             newCompositeNode(grammarAccess.getDefaultClauseRule()); 
            pushFollow(FOLLOW_ruleDefaultClause_in_entryRuleDefaultClause8849);
            iv_ruleDefaultClause=ruleDefaultClause();

            state._fsp--;

             current =iv_ruleDefaultClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultClause8859); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3660:1: ruleDefaultClause returns [EObject current=null] : (otherlv_0= KEYWORD_82 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) ;
    public final EObject ruleDefaultClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3663:28: ( (otherlv_0= KEYWORD_82 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3664:1: (otherlv_0= KEYWORD_82 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3664:1: (otherlv_0= KEYWORD_82 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3665:2: otherlv_0= KEYWORD_82 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING
            {
            otherlv_0=(Token)match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_ruleDefaultClause8897); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultClauseAccess().getDEFAULTKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3669:1: ( (lv_name_1_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3670:1: (lv_name_1_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3670:1: (lv_name_1_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3671:3: lv_name_1_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDefaultClauseAccess().getNameAliasParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDefaultClause8917);
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

            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefaultClause8928); 
             
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3699:1: entryRuleDeclareClause returns [EObject current=null] : iv_ruleDeclareClause= ruleDeclareClause EOF ;
    public final EObject entryRuleDeclareClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3700:2: (iv_ruleDeclareClause= ruleDeclareClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3701:2: iv_ruleDeclareClause= ruleDeclareClause EOF
            {
             newCompositeNode(grammarAccess.getDeclareClauseRule()); 
            pushFollow(FOLLOW_ruleDeclareClause_in_entryRuleDeclareClause8962);
            iv_ruleDeclareClause=ruleDeclareClause();

            state._fsp--;

             current =iv_ruleDeclareClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclareClause8972); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3708:1: ruleDeclareClause returns [EObject current=null] : (otherlv_0= KEYWORD_81 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) ;
    public final EObject ruleDeclareClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3711:28: ( (otherlv_0= KEYWORD_81 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3712:1: (otherlv_0= KEYWORD_81 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3712:1: (otherlv_0= KEYWORD_81 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3713:2: otherlv_0= KEYWORD_81 ( (lv_name_1_0= ruleAlias ) ) this_STRING_2= RULE_STRING
            {
            otherlv_0=(Token)match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_ruleDeclareClause9010); 

                	newLeafNode(otherlv_0, grammarAccess.getDeclareClauseAccess().getDECLAREKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3717:1: ( (lv_name_1_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3718:1: (lv_name_1_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3718:1: (lv_name_1_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3719:3: lv_name_1_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDeclareClauseAccess().getNameAliasParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDeclareClause9030);
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

            this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDeclareClause9041); 
             
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3747:1: entryRuleDefineClause returns [EObject current=null] : iv_ruleDefineClause= ruleDefineClause EOF ;
    public final EObject entryRuleDefineClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3748:2: (iv_ruleDefineClause= ruleDefineClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3749:2: iv_ruleDefineClause= ruleDefineClause EOF
            {
             newCompositeNode(grammarAccess.getDefineClauseRule()); 
            pushFollow(FOLLOW_ruleDefineClause_in_entryRuleDefineClause9075);
            iv_ruleDefineClause=ruleDefineClause();

            state._fsp--;

             current =iv_ruleDefineClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefineClause9085); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3756:1: ruleDefineClause returns [EObject current=null] : (otherlv_0= KEYWORD_71 ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause ) ;
    public final EObject ruleDefineClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3759:28: ( (otherlv_0= KEYWORD_71 ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3760:1: (otherlv_0= KEYWORD_71 ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3760:1: (otherlv_0= KEYWORD_71 ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3761:2: otherlv_0= KEYWORD_71 ( (lv_name_1_0= ruleAlias ) ) ruleFuncClause
            {
            otherlv_0=(Token)match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_ruleDefineClause9123); 

                	newLeafNode(otherlv_0, grammarAccess.getDefineClauseAccess().getDEFINEKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3765:1: ( (lv_name_1_0= ruleAlias ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3766:1: (lv_name_1_0= ruleAlias )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3766:1: (lv_name_1_0= ruleAlias )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3767:3: lv_name_1_0= ruleAlias
            {
             
            	        newCompositeNode(grammarAccess.getDefineClauseAccess().getNameAliasParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAlias_in_ruleDefineClause9143);
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
                
            pushFollow(FOLLOW_ruleFuncClause_in_ruleDefineClause9159);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3799:1: entryRuleLoadUsing returns [String current=null] : iv_ruleLoadUsing= ruleLoadUsing EOF ;
    public final String entryRuleLoadUsing() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLoadUsing = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3800:1: (iv_ruleLoadUsing= ruleLoadUsing EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3801:2: iv_ruleLoadUsing= ruleLoadUsing EOF
            {
             newCompositeNode(grammarAccess.getLoadUsingRule()); 
            pushFollow(FOLLOW_ruleLoadUsing_in_entryRuleLoadUsing9194);
            iv_ruleLoadUsing=ruleLoadUsing();

            state._fsp--;

             current =iv_ruleLoadUsing.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoadUsing9205); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3808:1: ruleLoadUsing returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_70 this_FuncClause_1= ruleFuncClause ) ;
    public final AntlrDatatypeRuleToken ruleLoadUsing() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FuncClause_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3812:6: ( (kw= KEYWORD_70 this_FuncClause_1= ruleFuncClause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3813:1: (kw= KEYWORD_70 this_FuncClause_1= ruleFuncClause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3813:1: (kw= KEYWORD_70 this_FuncClause_1= ruleFuncClause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3814:2: kw= KEYWORD_70 this_FuncClause_1= ruleFuncClause
            {
            kw=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_ruleLoadUsing9243); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getLoadUsingAccess().getUSINGKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getLoadUsingAccess().getFuncClauseParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFuncClause_in_ruleLoadUsing9265);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3838:1: entryRuleFuncClause returns [String current=null] : iv_ruleFuncClause= ruleFuncClause EOF ;
    public final String entryRuleFuncClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFuncClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3839:1: (iv_ruleFuncClause= ruleFuncClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3840:2: iv_ruleFuncClause= ruleFuncClause EOF
            {
             newCompositeNode(grammarAccess.getFuncClauseRule()); 
            pushFollow(FOLLOW_ruleFuncClause_in_entryRuleFuncClause9310);
            iv_ruleFuncClause=ruleFuncClause();

            state._fsp--;

             current =iv_ruleFuncClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncClause9321); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3847:1: ruleFuncClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FuncName_0= ruleFuncName kw= KEYWORD_4 (this_STRING_2= RULE_STRING )? (kw= KEYWORD_8 this_STRING_4= RULE_STRING )* kw= KEYWORD_5 ) ;
    public final AntlrDatatypeRuleToken ruleFuncClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        Token this_STRING_4=null;
        AntlrDatatypeRuleToken this_FuncName_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3851:6: ( (this_FuncName_0= ruleFuncName kw= KEYWORD_4 (this_STRING_2= RULE_STRING )? (kw= KEYWORD_8 this_STRING_4= RULE_STRING )* kw= KEYWORD_5 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3852:1: (this_FuncName_0= ruleFuncName kw= KEYWORD_4 (this_STRING_2= RULE_STRING )? (kw= KEYWORD_8 this_STRING_4= RULE_STRING )* kw= KEYWORD_5 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3852:1: (this_FuncName_0= ruleFuncName kw= KEYWORD_4 (this_STRING_2= RULE_STRING )? (kw= KEYWORD_8 this_STRING_4= RULE_STRING )* kw= KEYWORD_5 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3853:5: this_FuncName_0= ruleFuncName kw= KEYWORD_4 (this_STRING_2= RULE_STRING )? (kw= KEYWORD_8 this_STRING_4= RULE_STRING )* kw= KEYWORD_5
            {
             
                    newCompositeNode(grammarAccess.getFuncClauseAccess().getFuncNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFuncName_in_ruleFuncClause9368);
            this_FuncName_0=ruleFuncName();

            state._fsp--;


            		current.merge(this_FuncName_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleFuncClause9386); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFuncClauseAccess().getLeftParenthesisKeyword_1()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3869:1: (this_STRING_2= RULE_STRING )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3869:6: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFuncClause9402); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getFuncClauseAccess().getSTRINGTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3876:3: (kw= KEYWORD_8 this_STRING_4= RULE_STRING )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==KEYWORD_8) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3877:2: kw= KEYWORD_8 this_STRING_4= RULE_STRING
            	    {
            	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleFuncClause9423); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFuncClauseAccess().getCommaKeyword_3_0()); 
            	        
            	    this_STRING_4=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFuncClause9438); 

            	    		current.merge(this_STRING_4);
            	        
            	     
            	        newLeafNode(this_STRING_4, grammarAccess.getFuncClauseAccess().getSTRINGTerminalRuleCall_3_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleFuncClause9458); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3903:1: entryRuleFuncName returns [String current=null] : iv_ruleFuncName= ruleFuncName EOF ;
    public final String entryRuleFuncName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFuncName = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3904:1: (iv_ruleFuncName= ruleFuncName EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3905:2: iv_ruleFuncName= ruleFuncName EOF
            {
             newCompositeNode(grammarAccess.getFuncNameRule()); 
            pushFollow(FOLLOW_ruleFuncName_in_entryRuleFuncName9498);
            iv_ruleFuncName=ruleFuncName();

            state._fsp--;

             current =iv_ruleFuncName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuncName9509); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3912:1: ruleFuncName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 )+ ;
    public final AntlrDatatypeRuleToken ruleFuncName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3916:6: ( (this_ID_0= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3917:1: (this_ID_0= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3917:1: (this_ID_0= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 )+
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
                case KEYWORD_10:
                    {
                    alt62=2;
                    }
                    break;
                case KEYWORD_2:
                    {
                    alt62=3;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3917:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFuncName9549); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getFuncNameAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3926:2: kw= KEYWORD_10
            	    {
            	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleFuncName9573); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFuncNameAccess().getFullStopKeyword_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3933:2: kw= KEYWORD_2
            	    {
            	    kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleFuncName9592); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3946:1: entryRulePathClause returns [String current=null] : iv_rulePathClause= rulePathClause EOF ;
    public final String entryRulePathClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3947:1: (iv_rulePathClause= rulePathClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3948:2: iv_rulePathClause= rulePathClause EOF
            {
             newCompositeNode(grammarAccess.getPathClauseRule()); 
            pushFollow(FOLLOW_rulePathClause_in_entryRulePathClause9633);
            iv_rulePathClause=rulePathClause();

            state._fsp--;

             current =iv_rulePathClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathClause9644); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3955:1: rulePathClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_38 | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 | kw= KEYWORD_11 | kw= KEYWORD_19 | kw= KEYWORD_9 )+ ;
    public final AntlrDatatypeRuleToken rulePathClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_scalar_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3959:6: ( (kw= KEYWORD_38 | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 | kw= KEYWORD_11 | kw= KEYWORD_19 | kw= KEYWORD_9 )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3960:1: (kw= KEYWORD_38 | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 | kw= KEYWORD_11 | kw= KEYWORD_19 | kw= KEYWORD_9 )+
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3960:1: (kw= KEYWORD_38 | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 | kw= KEYWORD_11 | kw= KEYWORD_19 | kw= KEYWORD_9 )+
            int cnt63=0;
            loop63:
            do {
                int alt63=9;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3961:2: kw= KEYWORD_38
            	    {
            	    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rulePathClause9682); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getALLKeyword_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3968:5: this_scalar_1= rulescalar
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPathClauseAccess().getScalarParserRuleCall_1()); 
            	        
            	    pushFollow(FOLLOW_rulescalar_in_rulePathClause9710);
            	    this_scalar_1=rulescalar();

            	    state._fsp--;


            	    		current.merge(this_scalar_1);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3979:10: this_ID_2= RULE_ID
            	    {
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathClause9736); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getPathClauseAccess().getIDTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3988:2: kw= KEYWORD_10
            	    {
            	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rulePathClause9760); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getFullStopKeyword_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:3995:2: kw= KEYWORD_2
            	    {
            	    kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePathClause9779); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getDollarSignKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4002:2: kw= KEYWORD_11
            	    {
            	    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rulePathClause9798); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getSolidusKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4009:2: kw= KEYWORD_19
            	    {
            	    kw=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rulePathClause9817); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getPathClauseAccess().getReverseSolidusKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4016:2: kw= KEYWORD_9
            	    {
            	    kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePathClause9836); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4029:1: entryRuleAsClause returns [String current=null] : iv_ruleAsClause= ruleAsClause EOF ;
    public final String entryRuleAsClause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAsClause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4030:1: (iv_ruleAsClause= ruleAsClause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4031:2: iv_ruleAsClause= ruleAsClause EOF
            {
             newCompositeNode(grammarAccess.getAsClauseRule()); 
            pushFollow(FOLLOW_ruleAsClause_in_entryRuleAsClause9877);
            iv_ruleAsClause=ruleAsClause();

            state._fsp--;

             current =iv_ruleAsClause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsClause9888); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4038:1: ruleAsClause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_28 (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) ) ;
    public final AntlrDatatypeRuleToken ruleAsClause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasDef_1 = null;

        AntlrDatatypeRuleToken this_AliasDefList_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4042:6: ( (kw= KEYWORD_28 (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4043:1: (kw= KEYWORD_28 (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4043:1: (kw= KEYWORD_28 (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4044:2: kw= KEYWORD_28 (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList )
            {
            kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleAsClause9926); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAsClauseAccess().getASKeyword_0()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4049:1: (this_AliasDef_1= ruleAliasDef | this_AliasDefList_2= ruleAliasDefList )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==KEYWORD_4) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4050:5: this_AliasDef_1= ruleAliasDef
                    {
                     
                            newCompositeNode(grammarAccess.getAsClauseAccess().getAliasDefParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleAliasDef_in_ruleAsClause9949);
                    this_AliasDef_1=ruleAliasDef();

                    state._fsp--;


                    		current.merge(this_AliasDef_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4062:5: this_AliasDefList_2= ruleAliasDefList
                    {
                     
                            newCompositeNode(grammarAccess.getAsClauseAccess().getAliasDefListParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAliasDefList_in_ruleAsClause9982);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4080:1: entryRuleAliasDef returns [String current=null] : iv_ruleAliasDef= ruleAliasDef EOF ;
    public final String entryRuleAliasDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDef = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4081:1: (iv_ruleAliasDef= ruleAliasDef EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4082:2: iv_ruleAliasDef= ruleAliasDef EOF
            {
             newCompositeNode(grammarAccess.getAliasDefRule()); 
            pushFollow(FOLLOW_ruleAliasDef_in_entryRuleAliasDef10028);
            iv_ruleAliasDef=ruleAliasDef();

            state._fsp--;

             current =iv_ruleAliasDef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDef10039); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4089:1: ruleAliasDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Alias_0= ruleAlias (kw= KEYWORD_12 this_Type_2= ruleType )? ) ;
    public final AntlrDatatypeRuleToken ruleAliasDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Alias_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4093:6: ( (this_Alias_0= ruleAlias (kw= KEYWORD_12 this_Type_2= ruleType )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4094:1: (this_Alias_0= ruleAlias (kw= KEYWORD_12 this_Type_2= ruleType )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4094:1: (this_Alias_0= ruleAlias (kw= KEYWORD_12 this_Type_2= ruleType )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4095:5: this_Alias_0= ruleAlias (kw= KEYWORD_12 this_Type_2= ruleType )?
            {
             
                    newCompositeNode(grammarAccess.getAliasDefAccess().getAliasParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAlias_in_ruleAliasDef10086);
            this_Alias_0=ruleAlias();

            state._fsp--;


            		current.merge(this_Alias_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4105:1: (kw= KEYWORD_12 this_Type_2= ruleType )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==KEYWORD_12) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4106:2: kw= KEYWORD_12 this_Type_2= ruleType
                    {
                    kw=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleAliasDef10105); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasDefAccess().getColonKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getAliasDefAccess().getTypeParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleAliasDef10127);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4130:1: entryRuleAliasDefList returns [String current=null] : iv_ruleAliasDefList= ruleAliasDefList EOF ;
    public final String entryRuleAliasDefList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasDefList = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4131:1: (iv_ruleAliasDefList= ruleAliasDefList EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4132:2: iv_ruleAliasDefList= ruleAliasDefList EOF
            {
             newCompositeNode(grammarAccess.getAliasDefListRule()); 
            pushFollow(FOLLOW_ruleAliasDefList_in_entryRuleAliasDefList10174);
            iv_ruleAliasDefList=ruleAliasDefList();

            state._fsp--;

             current =iv_ruleAliasDefList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDefList10185); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4139:1: ruleAliasDefList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_4 this_AliasDef_1= ruleAliasDef (kw= KEYWORD_8 this_AliasDef_3= ruleAliasDef )* kw= KEYWORD_5 ) ;
    public final AntlrDatatypeRuleToken ruleAliasDefList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasDef_1 = null;

        AntlrDatatypeRuleToken this_AliasDef_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4143:6: ( (kw= KEYWORD_4 this_AliasDef_1= ruleAliasDef (kw= KEYWORD_8 this_AliasDef_3= ruleAliasDef )* kw= KEYWORD_5 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4144:1: (kw= KEYWORD_4 this_AliasDef_1= ruleAliasDef (kw= KEYWORD_8 this_AliasDef_3= ruleAliasDef )* kw= KEYWORD_5 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4144:1: (kw= KEYWORD_4 this_AliasDef_1= ruleAliasDef (kw= KEYWORD_8 this_AliasDef_3= ruleAliasDef )* kw= KEYWORD_5 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4145:2: kw= KEYWORD_4 this_AliasDef_1= ruleAliasDef (kw= KEYWORD_8 this_AliasDef_3= ruleAliasDef )* kw= KEYWORD_5
            {
            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleAliasDefList10223); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAliasDefListAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getAliasDefListAccess().getAliasDefParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAliasDef_in_ruleAliasDefList10245);
            this_AliasDef_1=ruleAliasDef();

            state._fsp--;


            		current.merge(this_AliasDef_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4161:1: (kw= KEYWORD_8 this_AliasDef_3= ruleAliasDef )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==KEYWORD_8) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4162:2: kw= KEYWORD_8 this_AliasDef_3= ruleAliasDef
            	    {
            	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleAliasDefList10264); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getAliasDefListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getAliasDefListAccess().getAliasDefParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleAliasDef_in_ruleAliasDefList10286);
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

            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleAliasDefList10306); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4192:1: entryRuleIDENTIFIER returns [String current=null] : iv_ruleIDENTIFIER= ruleIDENTIFIER EOF ;
    public final String entryRuleIDENTIFIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIDENTIFIER = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4193:1: (iv_ruleIDENTIFIER= ruleIDENTIFIER EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4194:2: iv_ruleIDENTIFIER= ruleIDENTIFIER EOF
            {
             newCompositeNode(grammarAccess.getIDENTIFIERRule()); 
            pushFollow(FOLLOW_ruleIDENTIFIER_in_entryRuleIDENTIFIER10346);
            iv_ruleIDENTIFIER=ruleIDENTIFIER();

            state._fsp--;

             current =iv_ruleIDENTIFIER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDENTIFIER10357); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4201:1: ruleIDENTIFIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIDENTIFIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4205:6: (this_ID_0= RULE_ID )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4206:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDENTIFIER10396); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4221:1: entryRuleFieldDef returns [String current=null] : iv_ruleFieldDef= ruleFieldDef EOF ;
    public final String entryRuleFieldDef() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldDef = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4222:1: (iv_ruleFieldDef= ruleFieldDef EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4223:2: iv_ruleFieldDef= ruleFieldDef EOF
            {
             newCompositeNode(grammarAccess.getFieldDefRule()); 
            pushFollow(FOLLOW_ruleFieldDef_in_entryRuleFieldDef10440);
            iv_ruleFieldDef=ruleFieldDef();

            state._fsp--;

             current =iv_ruleFieldDef.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldDef10451); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4230:1: ruleFieldDef returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IDENTIFIER_0= ruleIDENTIFIER (kw= KEYWORD_12 this_Type_2= ruleType )? ) ;
    public final AntlrDatatypeRuleToken ruleFieldDef() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_0 = null;

        AntlrDatatypeRuleToken this_Type_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4234:6: ( (this_IDENTIFIER_0= ruleIDENTIFIER (kw= KEYWORD_12 this_Type_2= ruleType )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4235:1: (this_IDENTIFIER_0= ruleIDENTIFIER (kw= KEYWORD_12 this_Type_2= ruleType )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4235:1: (this_IDENTIFIER_0= ruleIDENTIFIER (kw= KEYWORD_12 this_Type_2= ruleType )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4236:5: this_IDENTIFIER_0= ruleIDENTIFIER (kw= KEYWORD_12 this_Type_2= ruleType )?
            {
             
                    newCompositeNode(grammarAccess.getFieldDefAccess().getIDENTIFIERParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIDENTIFIER_in_ruleFieldDef10498);
            this_IDENTIFIER_0=ruleIDENTIFIER();

            state._fsp--;


            		current.merge(this_IDENTIFIER_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4246:1: (kw= KEYWORD_12 this_Type_2= ruleType )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==KEYWORD_12) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4247:2: kw= KEYWORD_12 this_Type_2= ruleType
                    {
                    kw=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleFieldDef10517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFieldDefAccess().getColonKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getFieldDefAccess().getTypeParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleFieldDef10539);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4271:1: entryRuleFieldFefList returns [String current=null] : iv_ruleFieldFefList= ruleFieldFefList EOF ;
    public final String entryRuleFieldFefList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFieldFefList = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4272:1: (iv_ruleFieldFefList= ruleFieldFefList EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4273:2: iv_ruleFieldFefList= ruleFieldFefList EOF
            {
             newCompositeNode(grammarAccess.getFieldFefListRule()); 
            pushFollow(FOLLOW_ruleFieldFefList_in_entryRuleFieldFefList10586);
            iv_ruleFieldFefList=ruleFieldFefList();

            state._fsp--;

             current =iv_ruleFieldFefList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldFefList10597); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4280:1: ruleFieldFefList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_4 this_FieldDef_1= ruleFieldDef (kw= KEYWORD_8 this_FieldDef_3= ruleFieldDef )* kw= KEYWORD_5 ) ;
    public final AntlrDatatypeRuleToken ruleFieldFefList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FieldDef_1 = null;

        AntlrDatatypeRuleToken this_FieldDef_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4284:6: ( (kw= KEYWORD_4 this_FieldDef_1= ruleFieldDef (kw= KEYWORD_8 this_FieldDef_3= ruleFieldDef )* kw= KEYWORD_5 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4285:1: (kw= KEYWORD_4 this_FieldDef_1= ruleFieldDef (kw= KEYWORD_8 this_FieldDef_3= ruleFieldDef )* kw= KEYWORD_5 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4285:1: (kw= KEYWORD_4 this_FieldDef_1= ruleFieldDef (kw= KEYWORD_8 this_FieldDef_3= ruleFieldDef )* kw= KEYWORD_5 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4286:2: kw= KEYWORD_4 this_FieldDef_1= ruleFieldDef (kw= KEYWORD_8 this_FieldDef_3= ruleFieldDef )* kw= KEYWORD_5
            {
            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleFieldFefList10635); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getFieldFefListAccess().getLeftParenthesisKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getFieldFefListAccess().getFieldDefParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFieldDef_in_ruleFieldFefList10657);
            this_FieldDef_1=ruleFieldDef();

            state._fsp--;


            		current.merge(this_FieldDef_1);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4302:1: (kw= KEYWORD_8 this_FieldDef_3= ruleFieldDef )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==KEYWORD_8) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4303:2: kw= KEYWORD_8 this_FieldDef_3= ruleFieldDef
            	    {
            	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleFieldFefList10676); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFieldFefListAccess().getCommaKeyword_2_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getFieldFefListAccess().getFieldDefParserRuleCall_2_1()); 
            	        
            	    pushFollow(FOLLOW_ruleFieldDef_in_ruleFieldFefList10698);
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

            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleFieldFefList10718); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4333:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4334:1: (iv_ruleType= ruleType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4335:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType10758);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType10769); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4342:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SimpleType_0 = null;

        AntlrDatatypeRuleToken this_TupleType_1 = null;

        AntlrDatatypeRuleToken this_MapType_2 = null;

        AntlrDatatypeRuleToken this_bag_type_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4346:6: ( (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4347:1: (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4347:1: (this_SimpleType_0= ruleSimpleType | this_TupleType_1= ruleTupleType | this_MapType_2= ruleMapType | this_bag_type_3= rulebag_type )
            int alt69=4;
            switch ( input.LA(1) ) {
            case KEYWORD_88:
            case KEYWORD_89:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_55:
            case KEYWORD_44:
                {
                alt69=1;
                }
                break;
            case KEYWORD_68:
            case KEYWORD_4:
                {
                alt69=2;
                }
                break;
            case KEYWORD_62:
                {
                alt69=3;
                }
                break;
            case KEYWORD_42:
            case KEYWORD_21:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4348:5: this_SimpleType_0= ruleSimpleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleType_in_ruleType10816);
                    this_SimpleType_0=ruleSimpleType();

                    state._fsp--;


                    		current.merge(this_SimpleType_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4360:5: this_TupleType_1= ruleTupleType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getTupleTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleType_in_ruleType10849);
                    this_TupleType_1=ruleTupleType();

                    state._fsp--;


                    		current.merge(this_TupleType_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4372:5: this_MapType_2= ruleMapType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMapTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMapType_in_ruleType10882);
                    this_MapType_2=ruleMapType();

                    state._fsp--;


                    		current.merge(this_MapType_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4384:5: this_bag_type_3= rulebag_type
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBag_typeParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulebag_type_in_ruleType10915);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4402:1: entryRuleSimpleType returns [String current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final String entryRuleSimpleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSimpleType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4403:1: (iv_ruleSimpleType= ruleSimpleType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4404:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_ruleSimpleType_in_entryRuleSimpleType10960);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleType10971); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4411:1: ruleSimpleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_44 | kw= KEYWORD_55 | kw= KEYWORD_58 | kw= KEYWORD_72 | kw= KEYWORD_89 | kw= KEYWORD_88 ) ;
    public final AntlrDatatypeRuleToken ruleSimpleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4415:6: ( (kw= KEYWORD_44 | kw= KEYWORD_55 | kw= KEYWORD_58 | kw= KEYWORD_72 | kw= KEYWORD_89 | kw= KEYWORD_88 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4416:1: (kw= KEYWORD_44 | kw= KEYWORD_55 | kw= KEYWORD_58 | kw= KEYWORD_72 | kw= KEYWORD_89 | kw= KEYWORD_88 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4416:1: (kw= KEYWORD_44 | kw= KEYWORD_55 | kw= KEYWORD_58 | kw= KEYWORD_72 | kw= KEYWORD_89 | kw= KEYWORD_88 )
            int alt70=6;
            switch ( input.LA(1) ) {
            case KEYWORD_44:
                {
                alt70=1;
                }
                break;
            case KEYWORD_55:
                {
                alt70=2;
                }
                break;
            case KEYWORD_58:
                {
                alt70=3;
                }
                break;
            case KEYWORD_72:
                {
                alt70=4;
                }
                break;
            case KEYWORD_89:
                {
                alt70=5;
                }
                break;
            case KEYWORD_88:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4417:2: kw= KEYWORD_44
                    {
                    kw=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleSimpleType11009); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getINTKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4424:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleSimpleType11028); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getLONGKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4431:2: kw= KEYWORD_58
                    {
                    kw=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleSimpleType11047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getFLOATKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4438:2: kw= KEYWORD_72
                    {
                    kw=(Token)match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_ruleSimpleType11066); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getDOUBLEKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4445:2: kw= KEYWORD_89
                    {
                    kw=(Token)match(input,KEYWORD_89,FOLLOW_KEYWORD_89_in_ruleSimpleType11085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSimpleTypeAccess().getCHARARRAYKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4452:2: kw= KEYWORD_88
                    {
                    kw=(Token)match(input,KEYWORD_88,FOLLOW_KEYWORD_88_in_ruleSimpleType11104); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4465:1: entryRuleTupleType returns [String current=null] : iv_ruleTupleType= ruleTupleType EOF ;
    public final String entryRuleTupleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTupleType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4466:1: (iv_ruleTupleType= ruleTupleType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4467:2: iv_ruleTupleType= ruleTupleType EOF
            {
             newCompositeNode(grammarAccess.getTupleTypeRule()); 
            pushFollow(FOLLOW_ruleTupleType_in_entryRuleTupleType11144);
            iv_ruleTupleType=ruleTupleType();

            state._fsp--;

             current =iv_ruleTupleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleType11155); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4474:1: ruleTupleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_68 )? this_AliasDefList_1= ruleAliasDefList ) ;
    public final AntlrDatatypeRuleToken ruleTupleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasDefList_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4478:6: ( ( (kw= KEYWORD_68 )? this_AliasDefList_1= ruleAliasDefList ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4479:1: ( (kw= KEYWORD_68 )? this_AliasDefList_1= ruleAliasDefList )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4479:1: ( (kw= KEYWORD_68 )? this_AliasDefList_1= ruleAliasDefList )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4479:2: (kw= KEYWORD_68 )? this_AliasDefList_1= ruleAliasDefList
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4479:2: (kw= KEYWORD_68 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KEYWORD_68) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4480:2: kw= KEYWORD_68
                    {
                    kw=(Token)match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_ruleTupleType11194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTupleTypeAccess().getTUPLEKeyword_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getTupleTypeAccess().getAliasDefListParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAliasDefList_in_ruleTupleType11218);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4504:1: entryRulebag_type returns [String current=null] : iv_rulebag_type= rulebag_type EOF ;
    public final String entryRulebag_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebag_type = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4505:1: (iv_rulebag_type= rulebag_type EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4506:2: iv_rulebag_type= rulebag_type EOF
            {
             newCompositeNode(grammarAccess.getBag_typeRule()); 
            pushFollow(FOLLOW_rulebag_type_in_entryRulebag_type11263);
            iv_rulebag_type=rulebag_type();

            state._fsp--;

             current =iv_rulebag_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulebag_type11274); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4513:1: rulebag_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_42 )? kw= KEYWORD_21 ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )? this_TupleType_4= ruleTupleType )? kw= KEYWORD_22 ) ;
    public final AntlrDatatypeRuleToken rulebag_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_2 = null;

        AntlrDatatypeRuleToken this_TupleType_4 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4517:6: ( ( (kw= KEYWORD_42 )? kw= KEYWORD_21 ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )? this_TupleType_4= ruleTupleType )? kw= KEYWORD_22 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4518:1: ( (kw= KEYWORD_42 )? kw= KEYWORD_21 ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )? this_TupleType_4= ruleTupleType )? kw= KEYWORD_22 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4518:1: ( (kw= KEYWORD_42 )? kw= KEYWORD_21 ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )? this_TupleType_4= ruleTupleType )? kw= KEYWORD_22 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4518:2: (kw= KEYWORD_42 )? kw= KEYWORD_21 ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )? this_TupleType_4= ruleTupleType )? kw= KEYWORD_22
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4518:2: (kw= KEYWORD_42 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==KEYWORD_42) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4519:2: kw= KEYWORD_42
                    {
                    kw=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rulebag_type11313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBag_typeAccess().getBAGKeyword_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rulebag_type11328); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getBag_typeAccess().getLeftCurlyBracketKeyword_1()); 
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4530:1: ( (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )? this_TupleType_4= ruleTupleType )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==KEYWORD_68||LA74_0==KEYWORD_4||LA74_0==RULE_ID) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4530:2: (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )? this_TupleType_4= ruleTupleType
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4530:2: (this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12 )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==RULE_ID) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4531:5: this_IDENTIFIER_2= ruleIDENTIFIER kw= KEYWORD_12
                            {
                             
                                    newCompositeNode(grammarAccess.getBag_typeAccess().getIDENTIFIERParserRuleCall_2_0_0()); 
                                
                            pushFollow(FOLLOW_ruleIDENTIFIER_in_rulebag_type11352);
                            this_IDENTIFIER_2=ruleIDENTIFIER();

                            state._fsp--;


                            		current.merge(this_IDENTIFIER_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                
                            kw=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rulebag_type11370); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getBag_typeAccess().getColonKeyword_2_0_1()); 
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getBag_typeAccess().getTupleTypeParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleTupleType_in_rulebag_type11394);
                    this_TupleType_4=ruleTupleType();

                    state._fsp--;


                    		current.merge(this_TupleType_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rulebag_type11414); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4572:1: entryRuleMapType returns [String current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final String entryRuleMapType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapType = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4573:1: (iv_ruleMapType= ruleMapType EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4574:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType11454);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType11465); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4581:1: ruleMapType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_62 ;
    public final AntlrDatatypeRuleToken ruleMapType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4585:6: (kw= KEYWORD_62 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4587:2: kw= KEYWORD_62
            {
            kw=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_ruleMapType11502); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4602:1: entryRuleSTR_OP_EQ returns [String current=null] : iv_ruleSTR_OP_EQ= ruleSTR_OP_EQ EOF ;
    public final String entryRuleSTR_OP_EQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_EQ = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4603:1: (iv_ruleSTR_OP_EQ= ruleSTR_OP_EQ EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4604:2: iv_ruleSTR_OP_EQ= ruleSTR_OP_EQ EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_EQRule()); 
            pushFollow(FOLLOW_ruleSTR_OP_EQ_in_entryRuleSTR_OP_EQ11543);
            iv_ruleSTR_OP_EQ=ruleSTR_OP_EQ();

            state._fsp--;

             current =iv_ruleSTR_OP_EQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_EQ11554); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4611:1: ruleSTR_OP_EQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_30 ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_EQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4615:6: (kw= KEYWORD_30 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4617:2: kw= KEYWORD_30
            {
            kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleSTR_OP_EQ11591); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4630:1: entryRuleSTR_OP_GT returns [String current=null] : iv_ruleSTR_OP_GT= ruleSTR_OP_GT EOF ;
    public final String entryRuleSTR_OP_GT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_GT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4631:1: (iv_ruleSTR_OP_GT= ruleSTR_OP_GT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4632:2: iv_ruleSTR_OP_GT= ruleSTR_OP_GT EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_GTRule()); 
            pushFollow(FOLLOW_ruleSTR_OP_GT_in_entryRuleSTR_OP_GT11630);
            iv_ruleSTR_OP_GT=ruleSTR_OP_GT();

            state._fsp--;

             current =iv_ruleSTR_OP_GT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_GT11641); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4639:1: ruleSTR_OP_GT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_31 ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_GT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4643:6: (kw= KEYWORD_31 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4645:2: kw= KEYWORD_31
            {
            kw=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleSTR_OP_GT11678); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4658:1: entryRuleSTR_OP_LT returns [String current=null] : iv_ruleSTR_OP_LT= ruleSTR_OP_LT EOF ;
    public final String entryRuleSTR_OP_LT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_LT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4659:1: (iv_ruleSTR_OP_LT= ruleSTR_OP_LT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4660:2: iv_ruleSTR_OP_LT= ruleSTR_OP_LT EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_LTRule()); 
            pushFollow(FOLLOW_ruleSTR_OP_LT_in_entryRuleSTR_OP_LT11717);
            iv_ruleSTR_OP_LT=ruleSTR_OP_LT();

            state._fsp--;

             current =iv_ruleSTR_OP_LT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_LT11728); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4667:1: ruleSTR_OP_LT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_34 ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_LT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4671:6: (kw= KEYWORD_34 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4673:2: kw= KEYWORD_34
            {
            kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleSTR_OP_LT11765); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4686:1: entryRuleSTR_OP_GTE returns [String current=null] : iv_ruleSTR_OP_GTE= ruleSTR_OP_GTE EOF ;
    public final String entryRuleSTR_OP_GTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_GTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4687:1: (iv_ruleSTR_OP_GTE= ruleSTR_OP_GTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4688:2: iv_ruleSTR_OP_GTE= ruleSTR_OP_GTE EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_GTERule()); 
            pushFollow(FOLLOW_ruleSTR_OP_GTE_in_entryRuleSTR_OP_GTE11804);
            iv_ruleSTR_OP_GTE=ruleSTR_OP_GTE();

            state._fsp--;

             current =iv_ruleSTR_OP_GTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_GTE11815); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4695:1: ruleSTR_OP_GTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_43 ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_GTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4699:6: (kw= KEYWORD_43 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4701:2: kw= KEYWORD_43
            {
            kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleSTR_OP_GTE11852); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4714:1: entryRuleSTR_OP_LTE returns [String current=null] : iv_ruleSTR_OP_LTE= ruleSTR_OP_LTE EOF ;
    public final String entryRuleSTR_OP_LTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_LTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4715:1: (iv_ruleSTR_OP_LTE= ruleSTR_OP_LTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4716:2: iv_ruleSTR_OP_LTE= ruleSTR_OP_LTE EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_LTERule()); 
            pushFollow(FOLLOW_ruleSTR_OP_LTE_in_entryRuleSTR_OP_LTE11891);
            iv_ruleSTR_OP_LTE=ruleSTR_OP_LTE();

            state._fsp--;

             current =iv_ruleSTR_OP_LTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_LTE11902); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4723:1: ruleSTR_OP_LTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_45 ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_LTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4727:6: (kw= KEYWORD_45 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4729:2: kw= KEYWORD_45
            {
            kw=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleSTR_OP_LTE11939); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4742:1: entryRuleSTR_OP_NE returns [String current=null] : iv_ruleSTR_OP_NE= ruleSTR_OP_NE EOF ;
    public final String entryRuleSTR_OP_NE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTR_OP_NE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4743:1: (iv_ruleSTR_OP_NE= ruleSTR_OP_NE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4744:2: iv_ruleSTR_OP_NE= ruleSTR_OP_NE EOF
            {
             newCompositeNode(grammarAccess.getSTR_OP_NERule()); 
            pushFollow(FOLLOW_ruleSTR_OP_NE_in_entryRuleSTR_OP_NE11978);
            iv_ruleSTR_OP_NE=ruleSTR_OP_NE();

            state._fsp--;

             current =iv_ruleSTR_OP_NE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTR_OP_NE11989); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4751:1: ruleSTR_OP_NE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_46 ;
    public final AntlrDatatypeRuleToken ruleSTR_OP_NE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4755:6: (kw= KEYWORD_46 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4757:2: kw= KEYWORD_46
            {
            kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleSTR_OP_NE12026); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4772:1: entryRuleNUM_OP_EQ returns [String current=null] : iv_ruleNUM_OP_EQ= ruleNUM_OP_EQ EOF ;
    public final String entryRuleNUM_OP_EQ() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_EQ = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4773:1: (iv_ruleNUM_OP_EQ= ruleNUM_OP_EQ EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4774:2: iv_ruleNUM_OP_EQ= ruleNUM_OP_EQ EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_EQRule()); 
            pushFollow(FOLLOW_ruleNUM_OP_EQ_in_entryRuleNUM_OP_EQ12067);
            iv_ruleNUM_OP_EQ=ruleNUM_OP_EQ();

            state._fsp--;

             current =iv_ruleNUM_OP_EQ.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_EQ12078); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4781:1: ruleNUM_OP_EQ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_26 ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_EQ() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4785:6: (kw= KEYWORD_26 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4787:2: kw= KEYWORD_26
            {
            kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleNUM_OP_EQ12115); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4800:1: entryRuleNUM_OP_LT returns [String current=null] : iv_ruleNUM_OP_LT= ruleNUM_OP_LT EOF ;
    public final String entryRuleNUM_OP_LT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_LT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4801:1: (iv_ruleNUM_OP_LT= ruleNUM_OP_LT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4802:2: iv_ruleNUM_OP_LT= ruleNUM_OP_LT EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_LTRule()); 
            pushFollow(FOLLOW_ruleNUM_OP_LT_in_entryRuleNUM_OP_LT12154);
            iv_ruleNUM_OP_LT=ruleNUM_OP_LT();

            state._fsp--;

             current =iv_ruleNUM_OP_LT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_LT12165); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4809:1: ruleNUM_OP_LT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_14 ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_LT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4813:6: (kw= KEYWORD_14 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4815:2: kw= KEYWORD_14
            {
            kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleNUM_OP_LT12202); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4828:1: entryRuleNUM_OP_LTE returns [String current=null] : iv_ruleNUM_OP_LTE= ruleNUM_OP_LTE EOF ;
    public final String entryRuleNUM_OP_LTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_LTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4829:1: (iv_ruleNUM_OP_LTE= ruleNUM_OP_LTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4830:2: iv_ruleNUM_OP_LTE= ruleNUM_OP_LTE EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_LTERule()); 
            pushFollow(FOLLOW_ruleNUM_OP_LTE_in_entryRuleNUM_OP_LTE12241);
            iv_ruleNUM_OP_LTE=ruleNUM_OP_LTE();

            state._fsp--;

             current =iv_ruleNUM_OP_LTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_LTE12252); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4837:1: ruleNUM_OP_LTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_25 ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_LTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4841:6: (kw= KEYWORD_25 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4843:2: kw= KEYWORD_25
            {
            kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleNUM_OP_LTE12289); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4856:1: entryRuleNUM_OP_GT returns [String current=null] : iv_ruleNUM_OP_GT= ruleNUM_OP_GT EOF ;
    public final String entryRuleNUM_OP_GT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_GT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4857:1: (iv_ruleNUM_OP_GT= ruleNUM_OP_GT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4858:2: iv_ruleNUM_OP_GT= ruleNUM_OP_GT EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_GTRule()); 
            pushFollow(FOLLOW_ruleNUM_OP_GT_in_entryRuleNUM_OP_GT12328);
            iv_ruleNUM_OP_GT=ruleNUM_OP_GT();

            state._fsp--;

             current =iv_ruleNUM_OP_GT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_GT12339); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4865:1: ruleNUM_OP_GT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_16 ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_GT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4869:6: (kw= KEYWORD_16 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4871:2: kw= KEYWORD_16
            {
            kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleNUM_OP_GT12376); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4884:1: entryRuleNUM_OP_GTE returns [String current=null] : iv_ruleNUM_OP_GTE= ruleNUM_OP_GTE EOF ;
    public final String entryRuleNUM_OP_GTE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_GTE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4885:1: (iv_ruleNUM_OP_GTE= ruleNUM_OP_GTE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4886:2: iv_ruleNUM_OP_GTE= ruleNUM_OP_GTE EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_GTERule()); 
            pushFollow(FOLLOW_ruleNUM_OP_GTE_in_entryRuleNUM_OP_GTE12415);
            iv_ruleNUM_OP_GTE=ruleNUM_OP_GTE();

            state._fsp--;

             current =iv_ruleNUM_OP_GTE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_GTE12426); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4893:1: ruleNUM_OP_GTE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_27 ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_GTE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4897:6: (kw= KEYWORD_27 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4899:2: kw= KEYWORD_27
            {
            kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleNUM_OP_GTE12463); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4912:1: entryRuleNUM_OP_NE returns [String current=null] : iv_ruleNUM_OP_NE= ruleNUM_OP_NE EOF ;
    public final String entryRuleNUM_OP_NE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUM_OP_NE = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4913:1: (iv_ruleNUM_OP_NE= ruleNUM_OP_NE EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4914:2: iv_ruleNUM_OP_NE= ruleNUM_OP_NE EOF
            {
             newCompositeNode(grammarAccess.getNUM_OP_NERule()); 
            pushFollow(FOLLOW_ruleNUM_OP_NE_in_entryRuleNUM_OP_NE12502);
            iv_ruleNUM_OP_NE=ruleNUM_OP_NE();

            state._fsp--;

             current =iv_ruleNUM_OP_NE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUM_OP_NE12513); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4921:1: ruleNUM_OP_NE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_23 ;
    public final AntlrDatatypeRuleToken ruleNUM_OP_NE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4925:6: (kw= KEYWORD_23 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4927:2: kw= KEYWORD_23
            {
            kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleNUM_OP_NE12550); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4940:1: entryRuleSEMI_COLON returns [String current=null] : iv_ruleSEMI_COLON= ruleSEMI_COLON EOF ;
    public final String entryRuleSEMI_COLON() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMI_COLON = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4941:1: (iv_ruleSEMI_COLON= ruleSEMI_COLON EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4942:2: iv_ruleSEMI_COLON= ruleSEMI_COLON EOF
            {
             newCompositeNode(grammarAccess.getSEMI_COLONRule()); 
            pushFollow(FOLLOW_ruleSEMI_COLON_in_entryRuleSEMI_COLON12589);
            iv_ruleSEMI_COLON=ruleSEMI_COLON();

            state._fsp--;

             current =iv_ruleSEMI_COLON.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSEMI_COLON12600); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4949:1: ruleSEMI_COLON returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_13 ;
    public final AntlrDatatypeRuleToken ruleSEMI_COLON() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4953:6: (kw= KEYWORD_13 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4955:2: kw= KEYWORD_13
            {
            kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleSEMI_COLON12637); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4980:1: entryRulePOUND returns [String current=null] : iv_rulePOUND= rulePOUND EOF ;
    public final String entryRulePOUND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOUND = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4981:1: (iv_rulePOUND= rulePOUND EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4982:2: iv_rulePOUND= rulePOUND EOF
            {
             newCompositeNode(grammarAccess.getPOUNDRule()); 
            pushFollow(FOLLOW_rulePOUND_in_entryRulePOUND12688);
            iv_rulePOUND=rulePOUND();

            state._fsp--;

             current =iv_rulePOUND.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePOUND12699); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4989:1: rulePOUND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_1 ;
    public final AntlrDatatypeRuleToken rulePOUND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4993:6: (kw= KEYWORD_1 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:4995:2: kw= KEYWORD_1
            {
            kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePOUND12736); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5010:1: entryRuleCOMMA returns [String current=null] : iv_ruleCOMMA= ruleCOMMA EOF ;
    public final String entryRuleCOMMA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCOMMA = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5011:1: (iv_ruleCOMMA= ruleCOMMA EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5012:2: iv_ruleCOMMA= ruleCOMMA EOF
            {
             newCompositeNode(grammarAccess.getCOMMARule()); 
            pushFollow(FOLLOW_ruleCOMMA_in_entryRuleCOMMA12777);
            iv_ruleCOMMA=ruleCOMMA();

            state._fsp--;

             current =iv_ruleCOMMA.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMMA12788); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5019:1: ruleCOMMA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_8 ;
    public final AntlrDatatypeRuleToken ruleCOMMA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5023:6: (kw= KEYWORD_8 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5025:2: kw= KEYWORD_8
            {
            kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleCOMMA12825); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5040:1: entryRuleDIV returns [String current=null] : iv_ruleDIV= ruleDIV EOF ;
    public final String entryRuleDIV() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIV = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5041:1: (iv_ruleDIV= ruleDIV EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5042:2: iv_ruleDIV= ruleDIV EOF
            {
             newCompositeNode(grammarAccess.getDIVRule()); 
            pushFollow(FOLLOW_ruleDIV_in_entryRuleDIV12866);
            iv_ruleDIV=ruleDIV();

            state._fsp--;

             current =iv_ruleDIV.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDIV12877); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5049:1: ruleDIV returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_11 ;
    public final AntlrDatatypeRuleToken ruleDIV() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5053:6: (kw= KEYWORD_11 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5055:2: kw= KEYWORD_11
            {
            kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleDIV12914); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5068:1: entryRulePERCENT returns [String current=null] : iv_rulePERCENT= rulePERCENT EOF ;
    public final String entryRulePERCENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePERCENT = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5069:1: (iv_rulePERCENT= rulePERCENT EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5070:2: iv_rulePERCENT= rulePERCENT EOF
            {
             newCompositeNode(grammarAccess.getPERCENTRule()); 
            pushFollow(FOLLOW_rulePERCENT_in_entryRulePERCENT12953);
            iv_rulePERCENT=rulePERCENT();

            state._fsp--;

             current =iv_rulePERCENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePERCENT12964); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5077:1: rulePERCENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_3 ;
    public final AntlrDatatypeRuleToken rulePERCENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5081:6: (kw= KEYWORD_3 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5083:2: kw= KEYWORD_3
            {
            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulePERCENT13001); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5096:1: entryRulePLUS returns [String current=null] : iv_rulePLUS= rulePLUS EOF ;
    public final String entryRulePLUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePLUS = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5097:1: (iv_rulePLUS= rulePLUS EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5098:2: iv_rulePLUS= rulePLUS EOF
            {
             newCompositeNode(grammarAccess.getPLUSRule()); 
            pushFollow(FOLLOW_rulePLUS_in_entryRulePLUS13040);
            iv_rulePLUS=rulePLUS();

            state._fsp--;

             current =iv_rulePLUS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLUS13051); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5105:1: rulePLUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_7 ;
    public final AntlrDatatypeRuleToken rulePLUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5109:6: (kw= KEYWORD_7 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5111:2: kw= KEYWORD_7
            {
            kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rulePLUS13088); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5124:1: entryRuleMINUS returns [String current=null] : iv_ruleMINUS= ruleMINUS EOF ;
    public final String entryRuleMINUS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMINUS = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5125:1: (iv_ruleMINUS= ruleMINUS EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5126:2: iv_ruleMINUS= ruleMINUS EOF
            {
             newCompositeNode(grammarAccess.getMINUSRule()); 
            pushFollow(FOLLOW_ruleMINUS_in_entryRuleMINUS13127);
            iv_ruleMINUS=ruleMINUS();

            state._fsp--;

             current =iv_ruleMINUS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMINUS13138); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5133:1: ruleMINUS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_9 ;
    public final AntlrDatatypeRuleToken ruleMINUS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5137:6: (kw= KEYWORD_9 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5139:2: kw= KEYWORD_9
            {
            kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleMINUS13175); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5152:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5153:1: (iv_ruleSTAR= ruleSTAR EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5154:2: iv_ruleSTAR= ruleSTAR EOF
            {
             newCompositeNode(grammarAccess.getSTARRule()); 
            pushFollow(FOLLOW_ruleSTAR_in_entryRuleSTAR13214);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;

             current =iv_ruleSTAR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTAR13225); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5161:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_6 ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5165:6: (kw= KEYWORD_6 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5167:2: kw= KEYWORD_6
            {
            kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleSTAR13262); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5182:1: entryRuleDOLLAR returns [String current=null] : iv_ruleDOLLAR= ruleDOLLAR EOF ;
    public final String entryRuleDOLLAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOLLAR = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5183:1: (iv_ruleDOLLAR= ruleDOLLAR EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5184:2: iv_ruleDOLLAR= ruleDOLLAR EOF
            {
             newCompositeNode(grammarAccess.getDOLLARRule()); 
            pushFollow(FOLLOW_ruleDOLLAR_in_entryRuleDOLLAR13303);
            iv_ruleDOLLAR=ruleDOLLAR();

            state._fsp--;

             current =iv_ruleDOLLAR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOLLAR13314); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5191:1: ruleDOLLAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_2 ;
    public final AntlrDatatypeRuleToken ruleDOLLAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5195:6: (kw= KEYWORD_2 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5197:2: kw= KEYWORD_2
            {
            kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleDOLLAR13351); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5210:1: entryRulegroup_type returns [String current=null] : iv_rulegroup_type= rulegroup_type EOF ;
    public final String entryRulegroup_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulegroup_type = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5211:1: (iv_rulegroup_type= rulegroup_type EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5212:2: iv_rulegroup_type= rulegroup_type EOF
            {
             newCompositeNode(grammarAccess.getGroup_typeRule()); 
            pushFollow(FOLLOW_rulegroup_type_in_entryRulegroup_type13390);
            iv_rulegroup_type=rulegroup_type();

            state._fsp--;

             current =iv_rulegroup_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_type13401); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5219:1: rulegroup_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken rulegroup_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5223:6: (this_STRING_0= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5224:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulegroup_type13440); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5239:1: entryRulegroup_item_list returns [EObject current=null] : iv_rulegroup_item_list= rulegroup_item_list EOF ;
    public final EObject entryRulegroup_item_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup_item_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5240:2: (iv_rulegroup_item_list= rulegroup_item_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5241:2: iv_rulegroup_item_list= rulegroup_item_list EOF
            {
             newCompositeNode(grammarAccess.getGroup_item_listRule()); 
            pushFollow(FOLLOW_rulegroup_item_list_in_entryRulegroup_item_list13483);
            iv_rulegroup_item_list=rulegroup_item_list();

            state._fsp--;

             current =iv_rulegroup_item_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_item_list13493); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5248:1: rulegroup_item_list returns [EObject current=null] : (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* ) ;
    public final EObject rulegroup_item_list() throws RecognitionException {
        EObject current = null;

        EObject this_group_item_0 = null;

        EObject lv_items_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5251:28: ( (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5252:1: (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5252:1: (this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5253:5: this_group_item_0= rulegroup_item ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getGroup_item_listAccess().getGroup_itemParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulegroup_item_in_rulegroup_item_list13540);
            this_group_item_0=rulegroup_item();

            state._fsp--;


                    current = this_group_item_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5261:1: ( ruleCOMMA ( (lv_items_2_0= rulegroup_item ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==KEYWORD_8) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5262:5: ruleCOMMA ( (lv_items_2_0= rulegroup_item ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getGroup_item_listAccess().getCOMMAParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleCOMMA_in_rulegroup_item_list13556);
            	    ruleCOMMA();

            	    state._fsp--;


            	            afterParserOrEnumRuleCall();
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5269:1: ( (lv_items_2_0= rulegroup_item ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5270:1: (lv_items_2_0= rulegroup_item )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5270:1: (lv_items_2_0= rulegroup_item )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5271:3: lv_items_2_0= rulegroup_item
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroup_item_listAccess().getItemsGroup_itemParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulegroup_item_in_rulegroup_item_list13576);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5295:1: entryRuleorder_by_clause returns [String current=null] : iv_ruleorder_by_clause= ruleorder_by_clause EOF ;
    public final String entryRuleorder_by_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleorder_by_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5296:1: (iv_ruleorder_by_clause= ruleorder_by_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5297:2: iv_ruleorder_by_clause= ruleorder_by_clause EOF
            {
             newCompositeNode(grammarAccess.getOrder_by_clauseRule()); 
            pushFollow(FOLLOW_ruleorder_by_clause_in_entryRuleorder_by_clause13614);
            iv_ruleorder_by_clause=ruleorder_by_clause();

            state._fsp--;

             current =iv_ruleorder_by_clause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleorder_by_clause13625); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5304:1: ruleorder_by_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_STAR_0= ruleSTAR (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | this_order_col_list_3= ruleorder_col_list ) ;
    public final AntlrDatatypeRuleToken ruleorder_by_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_STAR_0 = null;

        AntlrDatatypeRuleToken this_order_col_list_3 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5308:6: ( ( (this_STAR_0= ruleSTAR (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | this_order_col_list_3= ruleorder_col_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5309:1: ( (this_STAR_0= ruleSTAR (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | this_order_col_list_3= ruleorder_col_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5309:1: ( (this_STAR_0= ruleSTAR (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | this_order_col_list_3= ruleorder_col_list )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==KEYWORD_6) ) {
                alt77=1;
            }
            else if ( (LA77_0==KEYWORD_59||LA77_0==KEYWORD_2||LA77_0==KEYWORD_4||LA77_0==RULE_ID) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5309:2: (this_STAR_0= ruleSTAR (kw= KEYWORD_41 | kw= KEYWORD_48 )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5309:2: (this_STAR_0= ruleSTAR (kw= KEYWORD_41 | kw= KEYWORD_48 )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5310:5: this_STAR_0= ruleSTAR (kw= KEYWORD_41 | kw= KEYWORD_48 )?
                    {
                     
                            newCompositeNode(grammarAccess.getOrder_by_clauseAccess().getSTARParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleSTAR_in_ruleorder_by_clause13673);
                    this_STAR_0=ruleSTAR();

                    state._fsp--;


                    		current.merge(this_STAR_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5320:1: (kw= KEYWORD_41 | kw= KEYWORD_48 )?
                    int alt76=3;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==KEYWORD_41) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==KEYWORD_48) ) {
                        alt76=2;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5321:2: kw= KEYWORD_41
                            {
                            kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleorder_by_clause13692); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_by_clauseAccess().getASCKeyword_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5328:2: kw= KEYWORD_48
                            {
                            kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleorder_by_clause13711); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_by_clauseAccess().getDESCKeyword_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5335:5: this_order_col_list_3= ruleorder_col_list
                    {
                     
                            newCompositeNode(grammarAccess.getOrder_by_clauseAccess().getOrder_col_listParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleorder_col_list_in_ruleorder_by_clause13742);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5353:1: entryRuleorder_col_list returns [String current=null] : iv_ruleorder_col_list= ruleorder_col_list EOF ;
    public final String entryRuleorder_col_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleorder_col_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5354:1: (iv_ruleorder_col_list= ruleorder_col_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5355:2: iv_ruleorder_col_list= ruleorder_col_list EOF
            {
             newCompositeNode(grammarAccess.getOrder_col_listRule()); 
            pushFollow(FOLLOW_ruleorder_col_list_in_entryRuleorder_col_list13787);
            iv_ruleorder_col_list=ruleorder_col_list();

            state._fsp--;

             current =iv_ruleorder_col_list.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleorder_col_list13798); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5362:1: ruleorder_col_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_order_col_0= ruleorder_col (kw= KEYWORD_8 this_order_col_2= ruleorder_col )* ) ;
    public final AntlrDatatypeRuleToken ruleorder_col_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_order_col_0 = null;

        AntlrDatatypeRuleToken this_order_col_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5366:6: ( (this_order_col_0= ruleorder_col (kw= KEYWORD_8 this_order_col_2= ruleorder_col )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5367:1: (this_order_col_0= ruleorder_col (kw= KEYWORD_8 this_order_col_2= ruleorder_col )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5367:1: (this_order_col_0= ruleorder_col (kw= KEYWORD_8 this_order_col_2= ruleorder_col )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5368:5: this_order_col_0= ruleorder_col (kw= KEYWORD_8 this_order_col_2= ruleorder_col )*
            {
             
                    newCompositeNode(grammarAccess.getOrder_col_listAccess().getOrder_colParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleorder_col_in_ruleorder_col_list13845);
            this_order_col_0=ruleorder_col();

            state._fsp--;


            		current.merge(this_order_col_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5378:1: (kw= KEYWORD_8 this_order_col_2= ruleorder_col )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==KEYWORD_8) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5379:2: kw= KEYWORD_8 this_order_col_2= ruleorder_col
            	    {
            	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleorder_col_list13864); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getOrder_col_listAccess().getCommaKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getOrder_col_listAccess().getOrder_colParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleorder_col_in_ruleorder_col_list13886);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5403:1: entryRuleorder_col returns [String current=null] : iv_ruleorder_col= ruleorder_col EOF ;
    public final String entryRuleorder_col() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleorder_col = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5404:1: (iv_ruleorder_col= ruleorder_col EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5405:2: iv_ruleorder_col= ruleorder_col EOF
            {
             newCompositeNode(grammarAccess.getOrder_colRule()); 
            pushFollow(FOLLOW_ruleorder_col_in_entryRuleorder_col13933);
            iv_ruleorder_col=ruleorder_col();

            state._fsp--;

             current =iv_ruleorder_col.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleorder_col13944); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5412:1: ruleorder_col returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_col_ref_0= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | (kw= KEYWORD_4 this_col_ref_4= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? kw= KEYWORD_5 ) ) ;
    public final AntlrDatatypeRuleToken ruleorder_col() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_col_ref_0 = null;

        AntlrDatatypeRuleToken this_col_ref_4 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5416:6: ( ( (this_col_ref_0= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | (kw= KEYWORD_4 this_col_ref_4= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? kw= KEYWORD_5 ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5417:1: ( (this_col_ref_0= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | (kw= KEYWORD_4 this_col_ref_4= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? kw= KEYWORD_5 ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5417:1: ( (this_col_ref_0= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? ) | (kw= KEYWORD_4 this_col_ref_4= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? kw= KEYWORD_5 ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==KEYWORD_59||LA81_0==KEYWORD_2||LA81_0==RULE_ID) ) {
                alt81=1;
            }
            else if ( (LA81_0==KEYWORD_4) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5417:2: (this_col_ref_0= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5417:2: (this_col_ref_0= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5418:5: this_col_ref_0= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )?
                    {
                     
                            newCompositeNode(grammarAccess.getOrder_colAccess().getCol_refParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulecol_ref_in_ruleorder_col13992);
                    this_col_ref_0=rulecol_ref();

                    state._fsp--;


                    		current.merge(this_col_ref_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5428:1: (kw= KEYWORD_41 | kw= KEYWORD_48 )?
                    int alt79=3;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==KEYWORD_41) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==KEYWORD_48) ) {
                        alt79=2;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5429:2: kw= KEYWORD_41
                            {
                            kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleorder_col14011); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getASCKeyword_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5436:2: kw= KEYWORD_48
                            {
                            kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleorder_col14030); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getDESCKeyword_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5442:6: (kw= KEYWORD_4 this_col_ref_4= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? kw= KEYWORD_5 )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5442:6: (kw= KEYWORD_4 this_col_ref_4= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? kw= KEYWORD_5 )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5443:2: kw= KEYWORD_4 this_col_ref_4= rulecol_ref (kw= KEYWORD_41 | kw= KEYWORD_48 )? kw= KEYWORD_5
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleorder_col14053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrder_colAccess().getLeftParenthesisKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getOrder_colAccess().getCol_refParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_rulecol_ref_in_ruleorder_col14075);
                    this_col_ref_4=rulecol_ref();

                    state._fsp--;


                    		current.merge(this_col_ref_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5459:1: (kw= KEYWORD_41 | kw= KEYWORD_48 )?
                    int alt80=3;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==KEYWORD_41) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==KEYWORD_48) ) {
                        alt80=2;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5460:2: kw= KEYWORD_41
                            {
                            kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleorder_col14094); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getASCKeyword_1_2_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5467:2: kw= KEYWORD_48
                            {
                            kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleorder_col14113); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getOrder_colAccess().getDESCKeyword_1_2_1()); 
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleorder_col14128); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5486:1: entryRulepartition_clause returns [String current=null] : iv_rulepartition_clause= rulepartition_clause EOF ;
    public final String entryRulepartition_clause() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepartition_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5487:1: (iv_rulepartition_clause= rulepartition_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5488:2: iv_rulepartition_clause= rulepartition_clause EOF
            {
             newCompositeNode(grammarAccess.getPartition_clauseRule()); 
            pushFollow(FOLLOW_rulepartition_clause_in_entryRulepartition_clause14169);
            iv_rulepartition_clause=rulepartition_clause();

            state._fsp--;

             current =iv_rulepartition_clause.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulepartition_clause14180); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5495:1: rulepartition_clause returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_91 kw= KEYWORD_29 this_FuncName_2= ruleFuncName ) ;
    public final AntlrDatatypeRuleToken rulepartition_clause() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FuncName_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5499:6: ( (kw= KEYWORD_91 kw= KEYWORD_29 this_FuncName_2= ruleFuncName ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5500:1: (kw= KEYWORD_91 kw= KEYWORD_29 this_FuncName_2= ruleFuncName )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5500:1: (kw= KEYWORD_91 kw= KEYWORD_29 this_FuncName_2= ruleFuncName )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5501:2: kw= KEYWORD_91 kw= KEYWORD_29 this_FuncName_2= ruleFuncName
            {
            kw=(Token)match(input,KEYWORD_91,FOLLOW_KEYWORD_91_in_rulepartition_clause14218); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPartition_clauseAccess().getPARTITIONKeyword_0()); 
                
            kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rulepartition_clause14231); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPartition_clauseAccess().getBYKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getPartition_clauseAccess().getFuncNameParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleFuncName_in_rulepartition_clause14253);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5531:1: entryRulerel_list returns [EObject current=null] : iv_rulerel_list= rulerel_list EOF ;
    public final EObject entryRulerel_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerel_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5532:2: (iv_rulerel_list= rulerel_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5533:2: iv_rulerel_list= rulerel_list EOF
            {
             newCompositeNode(grammarAccess.getRel_listRule()); 
            pushFollow(FOLLOW_rulerel_list_in_entryRulerel_list14297);
            iv_rulerel_list=rulerel_list();

            state._fsp--;

             current =iv_rulerel_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerel_list14307); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5540:1: rulerel_list returns [EObject current=null] : ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= KEYWORD_8 ( (lv_type_2_0= ruleAliasType ) ) )* ) ;
    public final EObject rulerel_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5543:28: ( ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= KEYWORD_8 ( (lv_type_2_0= ruleAliasType ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5544:1: ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= KEYWORD_8 ( (lv_type_2_0= ruleAliasType ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5544:1: ( ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= KEYWORD_8 ( (lv_type_2_0= ruleAliasType ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5544:2: ( (lv_type_0_0= ruleAliasType ) ) (otherlv_1= KEYWORD_8 ( (lv_type_2_0= ruleAliasType ) ) )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5544:2: ( (lv_type_0_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5545:1: (lv_type_0_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5545:1: (lv_type_0_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5546:3: lv_type_0_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getRel_listAccess().getTypeAliasTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_rulerel_list14353);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5562:2: (otherlv_1= KEYWORD_8 ( (lv_type_2_0= ruleAliasType ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==KEYWORD_8) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5563:2: otherlv_1= KEYWORD_8 ( (lv_type_2_0= ruleAliasType ) )
            	    {
            	    otherlv_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulerel_list14367); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRel_listAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5567:1: ( (lv_type_2_0= ruleAliasType ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5568:1: (lv_type_2_0= ruleAliasType )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5568:1: (lv_type_2_0= ruleAliasType )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5569:3: lv_type_2_0= ruleAliasType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRel_listAccess().getTypeAliasTypeParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAliasType_in_rulerel_list14387);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5593:1: entryRulejoin_type returns [String current=null] : iv_rulejoin_type= rulejoin_type EOF ;
    public final String entryRulejoin_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulejoin_type = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5594:1: (iv_rulejoin_type= rulejoin_type EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5595:2: iv_rulejoin_type= rulejoin_type EOF
            {
             newCompositeNode(grammarAccess.getJoin_typeRule()); 
            pushFollow(FOLLOW_rulejoin_type_in_entryRulejoin_type14425);
            iv_rulejoin_type=rulejoin_type();

            state._fsp--;

             current =iv_rulejoin_type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_type14436); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5602:1: rulejoin_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken rulejoin_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5606:6: (this_STRING_0= RULE_STRING )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5607:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulejoin_type14475); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5622:1: entryRulejoin_sub_clause returns [EObject current=null] : iv_rulejoin_sub_clause= rulejoin_sub_clause EOF ;
    public final EObject entryRulejoin_sub_clause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_sub_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5623:2: (iv_rulejoin_sub_clause= rulejoin_sub_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5624:2: iv_rulejoin_sub_clause= rulejoin_sub_clause EOF
            {
             newCompositeNode(grammarAccess.getJoin_sub_clauseRule()); 
            pushFollow(FOLLOW_rulejoin_sub_clause_in_entryRulejoin_sub_clause14518);
            iv_rulejoin_sub_clause=rulejoin_sub_clause();

            state._fsp--;

             current =iv_rulejoin_sub_clause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_sub_clause14528); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5631:1: rulejoin_sub_clause returns [EObject current=null] : (this_join_item_0= rulejoin_item (otherlv_1= KEYWORD_53 | otherlv_2= KEYWORD_65 | otherlv_3= KEYWORD_50 )? (otherlv_4= KEYWORD_64 )? (otherlv_5= KEYWORD_8 ( (lv_others_6_0= rulejoin_item ) ) )+ ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5634:28: ( (this_join_item_0= rulejoin_item (otherlv_1= KEYWORD_53 | otherlv_2= KEYWORD_65 | otherlv_3= KEYWORD_50 )? (otherlv_4= KEYWORD_64 )? (otherlv_5= KEYWORD_8 ( (lv_others_6_0= rulejoin_item ) ) )+ ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5635:1: (this_join_item_0= rulejoin_item (otherlv_1= KEYWORD_53 | otherlv_2= KEYWORD_65 | otherlv_3= KEYWORD_50 )? (otherlv_4= KEYWORD_64 )? (otherlv_5= KEYWORD_8 ( (lv_others_6_0= rulejoin_item ) ) )+ )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5635:1: (this_join_item_0= rulejoin_item (otherlv_1= KEYWORD_53 | otherlv_2= KEYWORD_65 | otherlv_3= KEYWORD_50 )? (otherlv_4= KEYWORD_64 )? (otherlv_5= KEYWORD_8 ( (lv_others_6_0= rulejoin_item ) ) )+ )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5636:5: this_join_item_0= rulejoin_item (otherlv_1= KEYWORD_53 | otherlv_2= KEYWORD_65 | otherlv_3= KEYWORD_50 )? (otherlv_4= KEYWORD_64 )? (otherlv_5= KEYWORD_8 ( (lv_others_6_0= rulejoin_item ) ) )+
            {
             
                    newCompositeNode(grammarAccess.getJoin_sub_clauseAccess().getJoin_itemParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulejoin_item_in_rulejoin_sub_clause14575);
            this_join_item_0=rulejoin_item();

            state._fsp--;


                    current = this_join_item_0;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5644:1: (otherlv_1= KEYWORD_53 | otherlv_2= KEYWORD_65 | otherlv_3= KEYWORD_50 )?
            int alt83=4;
            switch ( input.LA(1) ) {
                case KEYWORD_53:
                    {
                    alt83=1;
                    }
                    break;
                case KEYWORD_65:
                    {
                    alt83=2;
                    }
                    break;
                case KEYWORD_50:
                    {
                    alt83=3;
                    }
                    break;
            }

            switch (alt83) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5645:2: otherlv_1= KEYWORD_53
                    {
                    otherlv_1=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rulejoin_sub_clause14588); 

                        	newLeafNode(otherlv_1, grammarAccess.getJoin_sub_clauseAccess().getLEFTKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5651:2: otherlv_2= KEYWORD_65
                    {
                    otherlv_2=(Token)match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_rulejoin_sub_clause14606); 

                        	newLeafNode(otherlv_2, grammarAccess.getJoin_sub_clauseAccess().getRIGHTKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5657:2: otherlv_3= KEYWORD_50
                    {
                    otherlv_3=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rulejoin_sub_clause14624); 

                        	newLeafNode(otherlv_3, grammarAccess.getJoin_sub_clauseAccess().getFULLKeyword_1_2());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5661:3: (otherlv_4= KEYWORD_64 )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==KEYWORD_64) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5662:2: otherlv_4= KEYWORD_64
                    {
                    otherlv_4=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rulejoin_sub_clause14639); 

                        	newLeafNode(otherlv_4, grammarAccess.getJoin_sub_clauseAccess().getOUTERKeyword_2());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5666:3: (otherlv_5= KEYWORD_8 ( (lv_others_6_0= rulejoin_item ) ) )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==KEYWORD_8) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5667:2: otherlv_5= KEYWORD_8 ( (lv_others_6_0= rulejoin_item ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulejoin_sub_clause14654); 

            	        	newLeafNode(otherlv_5, grammarAccess.getJoin_sub_clauseAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5671:1: ( (lv_others_6_0= rulejoin_item ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5672:1: (lv_others_6_0= rulejoin_item )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5672:1: (lv_others_6_0= rulejoin_item )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5673:3: lv_others_6_0= rulejoin_item
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoin_sub_clauseAccess().getOthersJoin_itemParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulejoin_item_in_rulejoin_sub_clause14674);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5697:1: entryRulejoin_item returns [EObject current=null] : iv_rulejoin_item= rulejoin_item EOF ;
    public final EObject entryRulejoin_item() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_item = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5698:2: (iv_rulejoin_item= rulejoin_item EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5699:2: iv_rulejoin_item= rulejoin_item EOF
            {
             newCompositeNode(grammarAccess.getJoin_itemRule()); 
            pushFollow(FOLLOW_rulejoin_item_in_entryRulejoin_item14711);
            iv_rulejoin_item=rulejoin_item();

            state._fsp--;

             current =iv_rulejoin_item; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_item14721); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5706:1: rulejoin_item returns [EObject current=null] : ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) ) ;
    public final EObject rulejoin_item() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5709:28: ( ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5710:1: ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5710:1: ( ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5710:2: ( (lv_type_0_0= ruleAliasType ) ) ( (lv_expressions_1_0= rulejoin_group_by_clause ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5710:2: ( (lv_type_0_0= ruleAliasType ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5711:1: (lv_type_0_0= ruleAliasType )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5711:1: (lv_type_0_0= ruleAliasType )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5712:3: lv_type_0_0= ruleAliasType
            {
             
            	        newCompositeNode(grammarAccess.getJoin_itemAccess().getTypeAliasTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAliasType_in_rulejoin_item14767);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5728:2: ( (lv_expressions_1_0= rulejoin_group_by_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5729:1: (lv_expressions_1_0= rulejoin_group_by_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5729:1: (lv_expressions_1_0= rulejoin_group_by_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5730:3: lv_expressions_1_0= rulejoin_group_by_clause
            {
             
            	        newCompositeNode(grammarAccess.getJoin_itemAccess().getExpressionsJoin_group_by_clauseParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulejoin_group_by_clause_in_rulejoin_item14788);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5754:1: entryRulegroup_item returns [EObject current=null] : iv_rulegroup_item= rulegroup_item EOF ;
    public final EObject entryRulegroup_item() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegroup_item = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5755:2: (iv_rulegroup_item= rulegroup_item EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5756:2: iv_rulegroup_item= rulegroup_item EOF
            {
             newCompositeNode(grammarAccess.getGroup_itemRule()); 
            pushFollow(FOLLOW_rulegroup_item_in_entryRulegroup_item14823);
            iv_rulegroup_item=rulegroup_item();

            state._fsp--;

             current =iv_rulegroup_item; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegroup_item14833); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5763:1: rulegroup_item returns [EObject current=null] : ( ( (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= KEYWORD_38 | otherlv_3= KEYWORD_40 ) (otherlv_4= KEYWORD_60 | otherlv_5= KEYWORD_64 )? ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5766:28: ( ( ( (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= KEYWORD_38 | otherlv_3= KEYWORD_40 ) (otherlv_4= KEYWORD_60 | otherlv_5= KEYWORD_64 )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5767:1: ( ( (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= KEYWORD_38 | otherlv_3= KEYWORD_40 ) (otherlv_4= KEYWORD_60 | otherlv_5= KEYWORD_64 )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5767:1: ( ( (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= KEYWORD_38 | otherlv_3= KEYWORD_40 ) (otherlv_4= KEYWORD_60 | otherlv_5= KEYWORD_64 )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5767:2: ( (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= KEYWORD_38 | otherlv_3= KEYWORD_40 ) (otherlv_4= KEYWORD_60 | otherlv_5= KEYWORD_64 )?
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5767:2: ( (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) | otherlv_2= KEYWORD_38 | otherlv_3= KEYWORD_40 )
            int alt86=3;
            switch ( input.LA(1) ) {
            case KEYWORD_29:
                {
                alt86=1;
                }
                break;
            case KEYWORD_38:
                {
                alt86=2;
                }
                break;
            case KEYWORD_40:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5767:3: (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5767:3: (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5768:2: otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list
                    {
                    otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rulegroup_item14873); 

                        	newLeafNode(otherlv_0, grammarAccess.getGroup_itemAccess().getBYKeyword_0_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getGroup_itemAccess().getJoin_group_by_expr_listParserRuleCall_0_0_1()); 
                        
                    pushFollow(FOLLOW_rulejoin_group_by_expr_list_in_rulegroup_item14894);
                    this_join_group_by_expr_list_1=rulejoin_group_by_expr_list();

                    state._fsp--;


                            current = this_join_group_by_expr_list_1;
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5783:2: otherlv_2= KEYWORD_38
                    {
                    otherlv_2=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rulegroup_item14913); 

                        	newLeafNode(otherlv_2, grammarAccess.getGroup_itemAccess().getALLKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5789:2: otherlv_3= KEYWORD_40
                    {
                    otherlv_3=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rulegroup_item14931); 

                        	newLeafNode(otherlv_3, grammarAccess.getGroup_itemAccess().getANYKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5793:2: (otherlv_4= KEYWORD_60 | otherlv_5= KEYWORD_64 )?
            int alt87=3;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==KEYWORD_60) ) {
                alt87=1;
            }
            else if ( (LA87_0==KEYWORD_64) ) {
                alt87=2;
            }
            switch (alt87) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5794:2: otherlv_4= KEYWORD_60
                    {
                    otherlv_4=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rulegroup_item14945); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroup_itemAccess().getINNERKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5800:2: otherlv_5= KEYWORD_64
                    {
                    otherlv_5=(Token)match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rulegroup_item14963); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5812:1: entryRulejoin_group_by_clause returns [EObject current=null] : iv_rulejoin_group_by_clause= rulejoin_group_by_clause EOF ;
    public final EObject entryRulejoin_group_by_clause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_group_by_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5813:2: (iv_rulejoin_group_by_clause= rulejoin_group_by_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5814:2: iv_rulejoin_group_by_clause= rulejoin_group_by_clause EOF
            {
             newCompositeNode(grammarAccess.getJoin_group_by_clauseRule()); 
            pushFollow(FOLLOW_rulejoin_group_by_clause_in_entryRulejoin_group_by_clause14999);
            iv_rulejoin_group_by_clause=rulejoin_group_by_clause();

            state._fsp--;

             current =iv_rulejoin_group_by_clause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_group_by_clause15009); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5821:1: rulejoin_group_by_clause returns [EObject current=null] : (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) ;
    public final EObject rulejoin_group_by_clause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_join_group_by_expr_list_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5824:28: ( (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5825:1: (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5825:1: (otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5826:2: otherlv_0= KEYWORD_29 this_join_group_by_expr_list_1= rulejoin_group_by_expr_list
            {
            otherlv_0=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rulejoin_group_by_clause15047); 

                	newLeafNode(otherlv_0, grammarAccess.getJoin_group_by_clauseAccess().getBYKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getJoin_group_by_clauseAccess().getJoin_group_by_expr_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulejoin_group_by_expr_list_in_rulejoin_group_by_clause15068);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5847:1: entryRulejoin_group_by_expr_list returns [EObject current=null] : iv_rulejoin_group_by_expr_list= rulejoin_group_by_expr_list EOF ;
    public final EObject entryRulejoin_group_by_expr_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_group_by_expr_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5848:2: (iv_rulejoin_group_by_expr_list= rulejoin_group_by_expr_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5849:2: iv_rulejoin_group_by_expr_list= rulejoin_group_by_expr_list EOF
            {
             newCompositeNode(grammarAccess.getJoin_group_by_expr_listRule()); 
            pushFollow(FOLLOW_rulejoin_group_by_expr_list_in_entryRulejoin_group_by_expr_list15102);
            iv_rulejoin_group_by_expr_list=rulejoin_group_by_expr_list();

            state._fsp--;

             current =iv_rulejoin_group_by_expr_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_group_by_expr_list15112); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5856:1: rulejoin_group_by_expr_list returns [EObject current=null] : (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= KEYWORD_4 ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= KEYWORD_5 ) ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5859:28: ( (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= KEYWORD_4 ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= KEYWORD_5 ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5860:1: (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= KEYWORD_4 ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= KEYWORD_5 ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5860:1: (this_join_group_by_expr_0= rulejoin_group_by_expr | (otherlv_1= KEYWORD_4 ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= KEYWORD_5 ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==KEYWORD_59||LA89_0==KEYWORD_56||LA89_0==KEYWORD_47||LA89_0==KEYWORD_37||LA89_0==KEYWORD_2||LA89_0==KEYWORD_6||(LA89_0>=KEYWORD_9 && LA89_0<=KEYWORD_10)||LA89_0==RULE_DIGIT||(LA89_0>=RULE_FLOATINGPOINT && LA89_0<=RULE_LONGINTEGER)||(LA89_0>=RULE_ID && LA89_0<=RULE_STRING)) ) {
                alt89=1;
            }
            else if ( (LA89_0==KEYWORD_4) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5861:5: this_join_group_by_expr_0= rulejoin_group_by_expr
                    {
                     
                            newCompositeNode(grammarAccess.getJoin_group_by_expr_listAccess().getJoin_group_by_exprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15159);
                    this_join_group_by_expr_0=rulejoin_group_by_expr();

                    state._fsp--;


                            current = this_join_group_by_expr_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5870:6: (otherlv_1= KEYWORD_4 ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= KEYWORD_5 )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5870:6: (otherlv_1= KEYWORD_4 ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= KEYWORD_5 )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5871:2: otherlv_1= KEYWORD_4 ( (lv_left_2_0= rulejoin_group_by_expr ) ) (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )* otherlv_5= KEYWORD_5
                    {
                    otherlv_1=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulejoin_group_by_expr_list15178); 

                        	newLeafNode(otherlv_1, grammarAccess.getJoin_group_by_expr_listAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5875:1: ( (lv_left_2_0= rulejoin_group_by_expr ) )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5876:1: (lv_left_2_0= rulejoin_group_by_expr )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5876:1: (lv_left_2_0= rulejoin_group_by_expr )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5877:3: lv_left_2_0= rulejoin_group_by_expr
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoin_group_by_expr_listAccess().getLeftJoin_group_by_exprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15198);
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

                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5893:2: (otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==KEYWORD_8) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5894:2: otherlv_3= KEYWORD_8 ( (lv_expressions_4_0= rulejoin_group_by_expr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulejoin_group_by_expr_list15212); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getJoin_group_by_expr_listAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5898:1: ( (lv_expressions_4_0= rulejoin_group_by_expr ) )
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5899:1: (lv_expressions_4_0= rulejoin_group_by_expr )
                    	    {
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5899:1: (lv_expressions_4_0= rulejoin_group_by_expr )
                    	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5900:3: lv_expressions_4_0= rulejoin_group_by_expr
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJoin_group_by_expr_listAccess().getExpressionsJoin_group_by_exprParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15232);
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

                    otherlv_5=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rulejoin_group_by_expr_list15247); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5929:1: entryRulejoin_group_by_expr returns [EObject current=null] : iv_rulejoin_group_by_expr= rulejoin_group_by_expr EOF ;
    public final EObject entryRulejoin_group_by_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulejoin_group_by_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5930:2: (iv_rulejoin_group_by_expr= rulejoin_group_by_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5931:2: iv_rulejoin_group_by_expr= rulejoin_group_by_expr EOF
            {
             newCompositeNode(grammarAccess.getJoin_group_by_exprRule()); 
            pushFollow(FOLLOW_rulejoin_group_by_expr_in_entryRulejoin_group_by_expr15282);
            iv_rulejoin_group_by_expr=rulejoin_group_by_expr();

            state._fsp--;

             current =iv_rulejoin_group_by_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulejoin_group_by_expr15292); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5938:1: rulejoin_group_by_expr returns [EObject current=null] : (this_Expression_0= ruleExpression | ruleSTAR ) ;
    public final EObject rulejoin_group_by_expr() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5941:28: ( (this_Expression_0= ruleExpression | ruleSTAR ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5942:1: (this_Expression_0= ruleExpression | ruleSTAR )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5942:1: (this_Expression_0= ruleExpression | ruleSTAR )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==KEYWORD_59||LA90_0==KEYWORD_56||LA90_0==KEYWORD_47||LA90_0==KEYWORD_37||LA90_0==KEYWORD_2||(LA90_0>=KEYWORD_9 && LA90_0<=KEYWORD_10)||LA90_0==RULE_DIGIT||(LA90_0>=RULE_FLOATINGPOINT && LA90_0<=RULE_LONGINTEGER)||(LA90_0>=RULE_ID && LA90_0<=RULE_STRING)) ) {
                alt90=1;
            }
            else if ( (LA90_0==KEYWORD_6) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5943:5: this_Expression_0= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getJoin_group_by_exprAccess().getExpressionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulejoin_group_by_expr15339);
                    this_Expression_0=ruleExpression();

                    state._fsp--;


                            current = this_Expression_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5953:5: ruleSTAR
                    {
                     
                            newCompositeNode(grammarAccess.getJoin_group_by_exprAccess().getSTARParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSTAR_in_rulejoin_group_by_expr15360);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5968:1: entryRulenested_blk returns [EObject current=null] : iv_rulenested_blk= rulenested_blk EOF ;
    public final EObject entryRulenested_blk() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_blk = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5969:2: (iv_rulenested_blk= rulenested_blk EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5970:2: iv_rulenested_blk= rulenested_blk EOF
            {
             newCompositeNode(grammarAccess.getNested_blkRule()); 
            pushFollow(FOLLOW_rulenested_blk_in_entryRulenested_blk15394);
            iv_rulenested_blk=rulenested_blk();

            state._fsp--;

             current =iv_rulenested_blk; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_blk15404); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5977:1: rulenested_blk returns [EObject current=null] : (otherlv_0= KEYWORD_21 this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= KEYWORD_13 otherlv_4= KEYWORD_22 ) ;
    public final EObject rulenested_blk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_nested_command_list_1 = null;

        EObject lv_clauses_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5980:28: ( (otherlv_0= KEYWORD_21 this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= KEYWORD_13 otherlv_4= KEYWORD_22 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5981:1: (otherlv_0= KEYWORD_21 this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= KEYWORD_13 otherlv_4= KEYWORD_22 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5981:1: (otherlv_0= KEYWORD_21 this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= KEYWORD_13 otherlv_4= KEYWORD_22 )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5982:2: otherlv_0= KEYWORD_21 this_nested_command_list_1= rulenested_command_list ( (lv_clauses_2_0= rulegenerate_clause ) ) otherlv_3= KEYWORD_13 otherlv_4= KEYWORD_22
            {
            otherlv_0=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rulenested_blk15442); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_blkAccess().getLeftCurlyBracketKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_blkAccess().getNested_command_listParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulenested_command_list_in_rulenested_blk15463);
            this_nested_command_list_1=rulenested_command_list();

            state._fsp--;


                    current = this_nested_command_list_1;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5995:1: ( (lv_clauses_2_0= rulegenerate_clause ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5996:1: (lv_clauses_2_0= rulegenerate_clause )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5996:1: (lv_clauses_2_0= rulegenerate_clause )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:5997:3: lv_clauses_2_0= rulegenerate_clause
            {
             
            	        newCompositeNode(grammarAccess.getNested_blkAccess().getClausesGenerate_clauseParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulegenerate_clause_in_rulenested_blk15483);
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

            otherlv_3=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rulenested_blk15496); 

                	newLeafNode(otherlv_3, grammarAccess.getNested_blkAccess().getSemicolonKeyword_3());
                
            otherlv_4=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rulenested_blk15508); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6031:1: entryRulegenerate_clause returns [EObject current=null] : iv_rulegenerate_clause= rulegenerate_clause EOF ;
    public final EObject entryRulegenerate_clause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenerate_clause = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6032:2: (iv_rulegenerate_clause= rulegenerate_clause EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6033:2: iv_rulegenerate_clause= rulegenerate_clause EOF
            {
             newCompositeNode(grammarAccess.getGenerate_clauseRule()); 
            pushFollow(FOLLOW_rulegenerate_clause_in_entryRulegenerate_clause15542);
            iv_rulegenerate_clause=rulegenerate_clause();

            state._fsp--;

             current =iv_rulegenerate_clause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulegenerate_clause15552); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6040:1: rulegenerate_clause returns [EObject current=null] : (otherlv_0= KEYWORD_85 ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= KEYWORD_8 ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* ) ;
    public final EObject rulegenerate_clause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6043:28: ( (otherlv_0= KEYWORD_85 ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= KEYWORD_8 ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6044:1: (otherlv_0= KEYWORD_85 ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= KEYWORD_8 ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6044:1: (otherlv_0= KEYWORD_85 ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= KEYWORD_8 ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6045:2: otherlv_0= KEYWORD_85 ( (lv_items_1_0= ruleFlattenGeneratedItem ) ) (otherlv_2= KEYWORD_8 ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_rulegenerate_clause15590); 

                	newLeafNode(otherlv_0, grammarAccess.getGenerate_clauseAccess().getGENERATEKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6049:1: ( (lv_items_1_0= ruleFlattenGeneratedItem ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6050:1: (lv_items_1_0= ruleFlattenGeneratedItem )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6050:1: (lv_items_1_0= ruleFlattenGeneratedItem )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6051:3: lv_items_1_0= ruleFlattenGeneratedItem
            {
             
            	        newCompositeNode(grammarAccess.getGenerate_clauseAccess().getItemsFlattenGeneratedItemParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15610);
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

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6067:2: (otherlv_2= KEYWORD_8 ( (lv_items_3_0= ruleFlattenGeneratedItem ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==KEYWORD_8) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6068:2: otherlv_2= KEYWORD_8 ( (lv_items_3_0= ruleFlattenGeneratedItem ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulegenerate_clause15624); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGenerate_clauseAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6072:1: ( (lv_items_3_0= ruleFlattenGeneratedItem ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6073:1: (lv_items_3_0= ruleFlattenGeneratedItem )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6073:1: (lv_items_3_0= ruleFlattenGeneratedItem )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6074:3: lv_items_3_0= ruleFlattenGeneratedItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGenerate_clauseAccess().getItemsFlattenGeneratedItemParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15644);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6098:1: entryRulenested_command_list returns [EObject current=null] : iv_rulenested_command_list= rulenested_command_list EOF ;
    public final EObject entryRulenested_command_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_command_list = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6099:2: (iv_rulenested_command_list= rulenested_command_list EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6100:2: iv_rulenested_command_list= rulenested_command_list EOF
            {
             newCompositeNode(grammarAccess.getNested_command_listRule()); 
            pushFollow(FOLLOW_rulenested_command_list_in_entryRulenested_command_list15681);
            iv_rulenested_command_list=rulenested_command_list();

            state._fsp--;

             current =iv_rulenested_command_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_command_list15691); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6107:1: rulenested_command_list returns [EObject current=null] : ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* ) ;
    public final EObject rulenested_command_list() throws RecognitionException {
        EObject current = null;

        EObject lv_cmds_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6110:28: ( ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6111:1: ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6111:1: ( () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )* )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6111:2: () ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )*
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6111:2: ()
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6112:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNested_command_listAccess().getNested_command_listAction_0(),
                        current);
                

            }

            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6117:2: ( ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==RULE_ID) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6117:3: ( (lv_cmds_1_0= rulenested_command ) ) ruleSEMI_COLON
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6117:3: ( (lv_cmds_1_0= rulenested_command ) )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6118:1: (lv_cmds_1_0= rulenested_command )
            	    {
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6118:1: (lv_cmds_1_0= rulenested_command )
            	    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6119:3: lv_cmds_1_0= rulenested_command
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNested_command_listAccess().getCmdsNested_commandParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulenested_command_in_rulenested_command_list15747);
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
            	        
            	    pushFollow(FOLLOW_ruleSEMI_COLON_in_rulenested_command_list15763);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6151:1: entryRulenested_command returns [EObject current=null] : iv_rulenested_command= rulenested_command EOF ;
    public final EObject entryRulenested_command() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_command = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6152:2: (iv_rulenested_command= rulenested_command EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6153:2: iv_rulenested_command= rulenested_command EOF
            {
             newCompositeNode(grammarAccess.getNested_commandRule()); 
            pushFollow(FOLLOW_rulenested_command_in_entryRulenested_command15799);
            iv_rulenested_command=rulenested_command();

            state._fsp--;

             current =iv_rulenested_command; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_command15809); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6160:1: rulenested_command returns [EObject current=null] : ( ruleAlias otherlv_1= KEYWORD_15 this_nested_op_2= rulenested_op ) ;
    public final EObject rulenested_command() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_nested_op_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6163:28: ( ( ruleAlias otherlv_1= KEYWORD_15 this_nested_op_2= rulenested_op ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6164:1: ( ruleAlias otherlv_1= KEYWORD_15 this_nested_op_2= rulenested_op )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6164:1: ( ruleAlias otherlv_1= KEYWORD_15 this_nested_op_2= rulenested_op )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6165:5: ruleAlias otherlv_1= KEYWORD_15 this_nested_op_2= rulenested_op
            {
             
                    newCompositeNode(grammarAccess.getNested_commandAccess().getAliasParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAlias_in_rulenested_command15850);
            ruleAlias();

            state._fsp--;


                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rulenested_command15862); 

                	newLeafNode(otherlv_1, grammarAccess.getNested_commandAccess().getEqualsSignKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getNested_commandAccess().getNested_opParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulenested_op_in_rulenested_command15883);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6194:1: entryRulenested_op returns [EObject current=null] : iv_rulenested_op= rulenested_op EOF ;
    public final EObject entryRulenested_op() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_op = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6195:2: (iv_rulenested_op= rulenested_op EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6196:2: iv_rulenested_op= rulenested_op EOF
            {
             newCompositeNode(grammarAccess.getNested_opRule()); 
            pushFollow(FOLLOW_rulenested_op_in_entryRulenested_op15917);
            iv_rulenested_op=rulenested_op();

            state._fsp--;

             current =iv_rulenested_op; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_op15927); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6203:1: rulenested_op returns [EObject current=null] : (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )? this_AddExpression_7= ruleAddExpression ) ) ;
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
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6206:28: ( (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )? this_AddExpression_7= ruleAddExpression ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6207:1: (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )? this_AddExpression_7= ruleAddExpression ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6207:1: (this_NestedFilter_0= ruleNestedFilter | this_nested_sort_1= rulenested_sort | this_nested_distinct_2= rulenested_distinct | this_nested_limit_3= rulenested_limit | ( (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )? this_AddExpression_7= ruleAddExpression ) )
            int alt94=5;
            switch ( input.LA(1) ) {
            case KEYWORD_73:
                {
                alt94=1;
                }
                break;
            case KEYWORD_63:
                {
                alt94=2;
                }
                break;
            case KEYWORD_84:
                {
                alt94=3;
                }
                break;
            case KEYWORD_61:
                {
                alt94=4;
                }
                break;
            case KEYWORD_59:
            case KEYWORD_56:
            case KEYWORD_37:
            case KEYWORD_2:
            case KEYWORD_4:
            case KEYWORD_9:
            case KEYWORD_10:
            case RULE_DIGIT:
            case RULE_FLOATINGPOINT:
            case RULE_INT:
            case RULE_LONGINTEGER:
            case RULE_ID:
            case RULE_STRING:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6208:5: this_NestedFilter_0= ruleNestedFilter
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNestedFilterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNestedFilter_in_rulenested_op15974);
                    this_NestedFilter_0=ruleNestedFilter();

                    state._fsp--;


                            current = this_NestedFilter_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6218:5: this_nested_sort_1= rulenested_sort
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNested_sortParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulenested_sort_in_rulenested_op16001);
                    this_nested_sort_1=rulenested_sort();

                    state._fsp--;


                            current = this_nested_sort_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6228:5: this_nested_distinct_2= rulenested_distinct
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNested_distinctParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulenested_distinct_in_rulenested_op16028);
                    this_nested_distinct_2=rulenested_distinct();

                    state._fsp--;


                            current = this_nested_distinct_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6238:5: this_nested_limit_3= rulenested_limit
                    {
                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getNested_limitParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulenested_limit_in_rulenested_op16055);
                    this_nested_limit_3=rulenested_limit();

                    state._fsp--;


                            current = this_nested_limit_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6247:6: ( (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )? this_AddExpression_7= ruleAddExpression )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6247:6: ( (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )? this_AddExpression_7= ruleAddExpression )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6247:7: (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )? this_AddExpression_7= ruleAddExpression
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6247:7: (otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5 )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==KEYWORD_4) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6248:2: otherlv_4= KEYWORD_4 ruleType otherlv_6= KEYWORD_5
                            {
                            otherlv_4=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulenested_op16075); 

                                	newLeafNode(otherlv_4, grammarAccess.getNested_opAccess().getLeftParenthesisKeyword_4_0_0());
                                
                             
                                    newCompositeNode(grammarAccess.getNested_opAccess().getTypeParserRuleCall_4_0_1()); 
                                
                            pushFollow(FOLLOW_ruleType_in_rulenested_op16090);
                            ruleType();

                            state._fsp--;


                                    afterParserOrEnumRuleCall();
                                
                            otherlv_6=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rulenested_op16102); 

                                	newLeafNode(otherlv_6, grammarAccess.getNested_opAccess().getRightParenthesisKeyword_4_0_2());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getNested_opAccess().getAddExpressionParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleAddExpression_in_rulenested_op16125);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6282:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6283:2: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6284:2: iv_ruleNestedFilter= ruleNestedFilter EOF
            {
             newCompositeNode(grammarAccess.getNestedFilterRule()); 
            pushFollow(FOLLOW_ruleNestedFilter_in_entryRuleNestedFilter16160);
            iv_ruleNestedFilter=ruleNestedFilter();

            state._fsp--;

             current =iv_ruleNestedFilter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedFilter16170); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6291:1: ruleNestedFilter returns [EObject current=null] : (otherlv_0= KEYWORD_73 ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= KEYWORD_29 ( (lv_cond_3_0= ruleCondition ) ) ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;

        EObject lv_cond_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6294:28: ( (otherlv_0= KEYWORD_73 ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= KEYWORD_29 ( (lv_cond_3_0= ruleCondition ) ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6295:1: (otherlv_0= KEYWORD_73 ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= KEYWORD_29 ( (lv_cond_3_0= ruleCondition ) ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6295:1: (otherlv_0= KEYWORD_73 ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= KEYWORD_29 ( (lv_cond_3_0= ruleCondition ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6296:2: otherlv_0= KEYWORD_73 ( (lv_exp_1_0= rulevar_expr ) ) otherlv_2= KEYWORD_29 ( (lv_cond_3_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_ruleNestedFilter16208); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedFilterAccess().getFILTERKeyword_0());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6300:1: ( (lv_exp_1_0= rulevar_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6301:1: (lv_exp_1_0= rulevar_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6301:1: (lv_exp_1_0= rulevar_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6302:3: lv_exp_1_0= rulevar_expr
            {
             
            	        newCompositeNode(grammarAccess.getNestedFilterAccess().getExpVar_exprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulevar_expr_in_ruleNestedFilter16228);
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

            otherlv_2=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleNestedFilter16241); 

                	newLeafNode(otherlv_2, grammarAccess.getNestedFilterAccess().getBYKeyword_2());
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6323:1: ( (lv_cond_3_0= ruleCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6324:1: (lv_cond_3_0= ruleCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6324:1: (lv_cond_3_0= ruleCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6325:3: lv_cond_3_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getNestedFilterAccess().getCondConditionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCondition_in_ruleNestedFilter16261);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6349:1: entryRulenested_sort returns [EObject current=null] : iv_rulenested_sort= rulenested_sort EOF ;
    public final EObject entryRulenested_sort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_sort = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6350:2: (iv_rulenested_sort= rulenested_sort EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6351:2: iv_rulenested_sort= rulenested_sort EOF
            {
             newCompositeNode(grammarAccess.getNested_sortRule()); 
            pushFollow(FOLLOW_rulenested_sort_in_entryRulenested_sort16296);
            iv_rulenested_sort=rulenested_sort();

            state._fsp--;

             current =iv_rulenested_sort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_sort16306); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6358:1: rulenested_sort returns [EObject current=null] : (otherlv_0= KEYWORD_63 this_var_expr_1= rulevar_expr otherlv_2= KEYWORD_29 ruleorder_by_clause (otherlv_4= KEYWORD_70 ruleFuncClause )? ) ;
    public final EObject rulenested_sort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6361:28: ( (otherlv_0= KEYWORD_63 this_var_expr_1= rulevar_expr otherlv_2= KEYWORD_29 ruleorder_by_clause (otherlv_4= KEYWORD_70 ruleFuncClause )? ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6362:1: (otherlv_0= KEYWORD_63 this_var_expr_1= rulevar_expr otherlv_2= KEYWORD_29 ruleorder_by_clause (otherlv_4= KEYWORD_70 ruleFuncClause )? )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6362:1: (otherlv_0= KEYWORD_63 this_var_expr_1= rulevar_expr otherlv_2= KEYWORD_29 ruleorder_by_clause (otherlv_4= KEYWORD_70 ruleFuncClause )? )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6363:2: otherlv_0= KEYWORD_63 this_var_expr_1= rulevar_expr otherlv_2= KEYWORD_29 ruleorder_by_clause (otherlv_4= KEYWORD_70 ruleFuncClause )?
            {
            otherlv_0=(Token)match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_rulenested_sort16344); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_sortAccess().getORDERKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_sortAccess().getVar_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevar_expr_in_rulenested_sort16365);
            this_var_expr_1=rulevar_expr();

            state._fsp--;


                    current = this_var_expr_1;
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rulenested_sort16377); 

                	newLeafNode(otherlv_2, grammarAccess.getNested_sortAccess().getBYKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getNested_sortAccess().getOrder_by_clauseParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleorder_by_clause_in_rulenested_sort16392);
            ruleorder_by_clause();

            state._fsp--;


                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6389:1: (otherlv_4= KEYWORD_70 ruleFuncClause )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==KEYWORD_70) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6390:2: otherlv_4= KEYWORD_70 ruleFuncClause
                    {
                    otherlv_4=(Token)match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_rulenested_sort16405); 

                        	newLeafNode(otherlv_4, grammarAccess.getNested_sortAccess().getUSINGKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getNested_sortAccess().getFuncClauseParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleFuncClause_in_rulenested_sort16420);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6410:1: entryRulenested_distinct returns [EObject current=null] : iv_rulenested_distinct= rulenested_distinct EOF ;
    public final EObject entryRulenested_distinct() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_distinct = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6411:2: (iv_rulenested_distinct= rulenested_distinct EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6412:2: iv_rulenested_distinct= rulenested_distinct EOF
            {
             newCompositeNode(grammarAccess.getNested_distinctRule()); 
            pushFollow(FOLLOW_rulenested_distinct_in_entryRulenested_distinct16456);
            iv_rulenested_distinct=rulenested_distinct();

            state._fsp--;

             current =iv_rulenested_distinct; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_distinct16466); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6419:1: rulenested_distinct returns [EObject current=null] : (otherlv_0= KEYWORD_84 this_var_expr_1= rulevar_expr ) ;
    public final EObject rulenested_distinct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6422:28: ( (otherlv_0= KEYWORD_84 this_var_expr_1= rulevar_expr ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6423:1: (otherlv_0= KEYWORD_84 this_var_expr_1= rulevar_expr )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6423:1: (otherlv_0= KEYWORD_84 this_var_expr_1= rulevar_expr )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6424:2: otherlv_0= KEYWORD_84 this_var_expr_1= rulevar_expr
            {
            otherlv_0=(Token)match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_rulenested_distinct16504); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_distinctAccess().getDISTINCTKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_distinctAccess().getVar_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevar_expr_in_rulenested_distinct16525);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6445:1: entryRulenested_limit returns [EObject current=null] : iv_rulenested_limit= rulenested_limit EOF ;
    public final EObject entryRulenested_limit() throws RecognitionException {
        EObject current = null;

        EObject iv_rulenested_limit = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6446:2: (iv_rulenested_limit= rulenested_limit EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6447:2: iv_rulenested_limit= rulenested_limit EOF
            {
             newCompositeNode(grammarAccess.getNested_limitRule()); 
            pushFollow(FOLLOW_rulenested_limit_in_entryRulenested_limit16559);
            iv_rulenested_limit=rulenested_limit();

            state._fsp--;

             current =iv_rulenested_limit; 
            match(input,EOF,FOLLOW_EOF_in_entryRulenested_limit16569); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6454:1: rulenested_limit returns [EObject current=null] : (otherlv_0= KEYWORD_61 this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) ) ;
    public final EObject rulenested_limit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_2=null;
        Token this_LONGINTEGER_3=null;
        EObject this_var_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6457:28: ( (otherlv_0= KEYWORD_61 this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6458:1: (otherlv_0= KEYWORD_61 this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6458:1: (otherlv_0= KEYWORD_61 this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6459:2: otherlv_0= KEYWORD_61 this_var_expr_1= rulevar_expr (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER )
            {
            otherlv_0=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_rulenested_limit16607); 

                	newLeafNode(otherlv_0, grammarAccess.getNested_limitAccess().getLIMITKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNested_limitAccess().getVar_exprParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevar_expr_in_rulenested_limit16628);
            this_var_expr_1=rulevar_expr();

            state._fsp--;


                    current = this_var_expr_1;
                    afterParserOrEnumRuleCall();
                
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6472:1: (this_INT_2= RULE_INT | this_LONGINTEGER_3= RULE_LONGINTEGER )
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6472:2: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulenested_limit16639); 
                     
                        newLeafNode(this_INT_2, grammarAccess.getNested_limitAccess().getINTTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6477:6: this_LONGINTEGER_3= RULE_LONGINTEGER
                    {
                    this_LONGINTEGER_3=(Token)match(input,RULE_LONGINTEGER,FOLLOW_RULE_LONGINTEGER_in_rulenested_limit16655); 
                     
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6489:1: entryRulesplit_branch returns [EObject current=null] : iv_rulesplit_branch= rulesplit_branch EOF ;
    public final EObject entryRulesplit_branch() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesplit_branch = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6490:2: (iv_rulesplit_branch= rulesplit_branch EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6491:2: iv_rulesplit_branch= rulesplit_branch EOF
            {
             newCompositeNode(grammarAccess.getSplit_branchRule()); 
            pushFollow(FOLLOW_rulesplit_branch_in_entryRulesplit_branch16690);
            iv_rulesplit_branch=rulesplit_branch();

            state._fsp--;

             current =iv_rulesplit_branch; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesplit_branch16700); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6498:1: rulesplit_branch returns [EObject current=null] : ( ruleIDENTIFIER otherlv_1= KEYWORD_32 this_Condition_2= ruleCondition ) ;
    public final EObject rulesplit_branch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Condition_2 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6501:28: ( ( ruleIDENTIFIER otherlv_1= KEYWORD_32 this_Condition_2= ruleCondition ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6502:1: ( ruleIDENTIFIER otherlv_1= KEYWORD_32 this_Condition_2= ruleCondition )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6502:1: ( ruleIDENTIFIER otherlv_1= KEYWORD_32 this_Condition_2= ruleCondition )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6503:5: ruleIDENTIFIER otherlv_1= KEYWORD_32 this_Condition_2= ruleCondition
            {
             
                    newCompositeNode(grammarAccess.getSplit_branchAccess().getIDENTIFIERParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIDENTIFIER_in_rulesplit_branch16741);
            ruleIDENTIFIER();

            state._fsp--;


                    afterParserOrEnumRuleCall();
                
            otherlv_1=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rulesplit_branch16753); 

                	newLeafNode(otherlv_1, grammarAccess.getSplit_branchAccess().getIFKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getSplit_branchAccess().getConditionParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleCondition_in_rulesplit_branch16774);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6532:1: entryRulecol_ref returns [String current=null] : iv_rulecol_ref= rulecol_ref EOF ;
    public final String entryRulecol_ref() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecol_ref = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6533:1: (iv_rulecol_ref= rulecol_ref EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6534:2: iv_rulecol_ref= rulecol_ref EOF
            {
             newCompositeNode(grammarAccess.getCol_refRule()); 
            pushFollow(FOLLOW_rulecol_ref_in_entryRulecol_ref16809);
            iv_rulecol_ref=rulecol_ref();

            state._fsp--;

             current =iv_rulecol_ref.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecol_ref16820); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6541:1: rulecol_ref returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref ) ;
    public final AntlrDatatypeRuleToken rulecol_ref() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_alias_col_ref_0 = null;

        AntlrDatatypeRuleToken this_dollar_col_ref_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6545:6: ( (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6546:1: (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6546:1: (this_alias_col_ref_0= rulealias_col_ref | this_dollar_col_ref_1= ruledollar_col_ref )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==KEYWORD_59||LA97_0==RULE_ID) ) {
                alt97=1;
            }
            else if ( (LA97_0==KEYWORD_2) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6547:5: this_alias_col_ref_0= rulealias_col_ref
                    {
                     
                            newCompositeNode(grammarAccess.getCol_refAccess().getAlias_col_refParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulealias_col_ref_in_rulecol_ref16867);
                    this_alias_col_ref_0=rulealias_col_ref();

                    state._fsp--;


                    		current.merge(this_alias_col_ref_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6559:5: this_dollar_col_ref_1= ruledollar_col_ref
                    {
                     
                            newCompositeNode(grammarAccess.getCol_refAccess().getDollar_col_refParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruledollar_col_ref_in_rulecol_ref16900);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6577:1: entryRulealias_col_ref returns [String current=null] : iv_rulealias_col_ref= rulealias_col_ref EOF ;
    public final String entryRulealias_col_ref() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulealias_col_ref = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6578:1: (iv_rulealias_col_ref= rulealias_col_ref EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6579:2: iv_rulealias_col_ref= rulealias_col_ref EOF
            {
             newCompositeNode(grammarAccess.getAlias_col_refRule()); 
            pushFollow(FOLLOW_rulealias_col_ref_in_entryRulealias_col_ref16945);
            iv_rulealias_col_ref=rulealias_col_ref();

            state._fsp--;

             current =iv_rulealias_col_ref.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulealias_col_ref16956); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6586:1: rulealias_col_ref returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_59 | this_IDENTIFIER_1= ruleIDENTIFIER ) ;
    public final AntlrDatatypeRuleToken rulealias_col_ref() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_IDENTIFIER_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6590:6: ( (kw= KEYWORD_59 | this_IDENTIFIER_1= ruleIDENTIFIER ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6591:1: (kw= KEYWORD_59 | this_IDENTIFIER_1= ruleIDENTIFIER )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6591:1: (kw= KEYWORD_59 | this_IDENTIFIER_1= ruleIDENTIFIER )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==KEYWORD_59) ) {
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6592:2: kw= KEYWORD_59
                    {
                    kw=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rulealias_col_ref16994); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAlias_col_refAccess().getGROUPKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6599:5: this_IDENTIFIER_1= ruleIDENTIFIER
                    {
                     
                            newCompositeNode(grammarAccess.getAlias_col_refAccess().getIDENTIFIERParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIDENTIFIER_in_rulealias_col_ref17022);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6617:1: entryRuledollar_col_ref returns [String current=null] : iv_ruledollar_col_ref= ruledollar_col_ref EOF ;
    public final String entryRuledollar_col_ref() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledollar_col_ref = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6618:1: (iv_ruledollar_col_ref= ruledollar_col_ref EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6619:2: iv_ruledollar_col_ref= ruledollar_col_ref EOF
            {
             newCompositeNode(grammarAccess.getDollar_col_refRule()); 
            pushFollow(FOLLOW_ruledollar_col_ref_in_entryRuledollar_col_ref17067);
            iv_ruledollar_col_ref=ruledollar_col_ref();

            state._fsp--;

             current =iv_ruledollar_col_ref.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledollar_col_ref17078); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6626:1: ruledollar_col_ref returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruledollar_col_ref() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_DOLLAR_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6630:6: ( (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6631:1: (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6631:1: (this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6632:5: this_DOLLAR_0= ruleDOLLAR this_INT_1= RULE_INT
            {
             
                    newCompositeNode(grammarAccess.getDollar_col_refAccess().getDOLLARParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDOLLAR_in_ruledollar_col_ref17125);
            this_DOLLAR_0=ruleDOLLAR();

            state._fsp--;


            		current.merge(this_DOLLAR_0);
                
             
                    afterParserOrEnumRuleCall();
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruledollar_col_ref17145); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6657:1: entryRuleconst_expr returns [String current=null] : iv_ruleconst_expr= ruleconst_expr EOF ;
    public final String entryRuleconst_expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconst_expr = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6658:1: (iv_ruleconst_expr= ruleconst_expr EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6659:2: iv_ruleconst_expr= ruleconst_expr EOF
            {
             newCompositeNode(grammarAccess.getConst_exprRule()); 
            pushFollow(FOLLOW_ruleconst_expr_in_entryRuleconst_expr17190);
            iv_ruleconst_expr=ruleconst_expr();

            state._fsp--;

             current =iv_ruleconst_expr.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconst_expr17201); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6666:1: ruleconst_expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_literal_0= ruleliteral ;
    public final AntlrDatatypeRuleToken ruleconst_expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_literal_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6670:6: (this_literal_0= ruleliteral )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6672:5: this_literal_0= ruleliteral
            {
             
                    newCompositeNode(grammarAccess.getConst_exprAccess().getLiteralParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleliteral_in_ruleconst_expr17247);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6690:1: entryRuleliteral returns [String current=null] : iv_ruleliteral= ruleliteral EOF ;
    public final String entryRuleliteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleliteral = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6691:1: (iv_ruleliteral= ruleliteral EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6692:2: iv_ruleliteral= ruleliteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleliteral_in_entryRuleliteral17291);
            iv_ruleliteral=ruleliteral();

            state._fsp--;

             current =iv_ruleliteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleliteral17302); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6699:1: ruleliteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= KEYWORD_37 | kw= KEYWORD_56 ) ;
    public final AntlrDatatypeRuleToken ruleliteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_scalar_0 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6703:6: ( (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= KEYWORD_37 | kw= KEYWORD_56 ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6704:1: (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= KEYWORD_37 | kw= KEYWORD_56 )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6704:1: (this_scalar_0= rulescalar | this_STRING_1= RULE_STRING | kw= KEYWORD_37 | kw= KEYWORD_56 )
            int alt99=4;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
            case RULE_DIGIT:
            case RULE_FLOATINGPOINT:
            case RULE_INT:
            case RULE_LONGINTEGER:
                {
                alt99=1;
                }
                break;
            case RULE_STRING:
                {
                alt99=2;
                }
                break;
            case KEYWORD_37:
                {
                alt99=3;
                }
                break;
            case KEYWORD_56:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6705:5: this_scalar_0= rulescalar
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getScalarParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulescalar_in_ruleliteral17349);
                    this_scalar_0=rulescalar();

                    state._fsp--;


                    		current.merge(this_scalar_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6716:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleliteral17375); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6725:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleliteral17399); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLiteralAccess().getUKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6732:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleliteral17418); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6745:1: entryRulescalar returns [String current=null] : iv_rulescalar= rulescalar EOF ;
    public final String entryRulescalar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulescalar = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6746:1: (iv_rulescalar= rulescalar EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6747:2: iv_rulescalar= rulescalar EOF
            {
             newCompositeNode(grammarAccess.getScalarRule()); 
            pushFollow(FOLLOW_rulescalar_in_entryRulescalar17458);
            iv_rulescalar=rulescalar();

            state._fsp--;

             current =iv_rulescalar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulescalar17469); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6754:1: rulescalar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt ) ;
    public final AntlrDatatypeRuleToken rulescalar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOATINGPOINT_0=null;
        AntlrDatatypeRuleToken this_scalarInt_1 = null;


         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6758:6: ( (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6759:1: (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6759:1: (this_FLOATINGPOINT_0= RULE_FLOATINGPOINT | this_scalarInt_1= rulescalarInt )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_FLOATINGPOINT) ) {
                alt100=1;
            }
            else if ( (LA100_0==KEYWORD_2||LA100_0==RULE_DIGIT||(LA100_0>=RULE_INT && LA100_0<=RULE_LONGINTEGER)) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6759:6: this_FLOATINGPOINT_0= RULE_FLOATINGPOINT
                    {
                    this_FLOATINGPOINT_0=(Token)match(input,RULE_FLOATINGPOINT,FOLLOW_RULE_FLOATINGPOINT_in_rulescalar17509); 

                    		current.merge(this_FLOATINGPOINT_0);
                        
                     
                        newLeafNode(this_FLOATINGPOINT_0, grammarAccess.getScalarAccess().getFLOATINGPOINTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6768:5: this_scalarInt_1= rulescalarInt
                    {
                     
                            newCompositeNode(grammarAccess.getScalarAccess().getScalarIntParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulescalarInt_in_rulescalar17542);
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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6786:1: entryRulescalarInt returns [String current=null] : iv_rulescalarInt= rulescalarInt EOF ;
    public final String entryRulescalarInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulescalarInt = null;


        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6787:1: (iv_rulescalarInt= rulescalarInt EOF )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6788:2: iv_rulescalarInt= rulescalarInt EOF
            {
             newCompositeNode(grammarAccess.getScalarIntRule()); 
            pushFollow(FOLLOW_rulescalarInt_in_entryRulescalarInt17587);
            iv_rulescalarInt=rulescalarInt();

            state._fsp--;

             current =iv_rulescalarInt.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulescalarInt17598); 

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
    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6795:1: rulescalarInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= KEYWORD_2 this_ID_4= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken rulescalarInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;
        Token this_INT_1=null;
        Token this_LONGINTEGER_2=null;
        Token kw=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6799:6: ( (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= KEYWORD_2 this_ID_4= RULE_ID ) ) )
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6800:1: (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= KEYWORD_2 this_ID_4= RULE_ID ) )
            {
            // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6800:1: (this_DIGIT_0= RULE_DIGIT | this_INT_1= RULE_INT | this_LONGINTEGER_2= RULE_LONGINTEGER | (kw= KEYWORD_2 this_ID_4= RULE_ID ) )
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
            case KEYWORD_2:
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
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6800:6: this_DIGIT_0= RULE_DIGIT
                    {
                    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rulescalarInt17638); 

                    		current.merge(this_DIGIT_0);
                        
                     
                        newLeafNode(this_DIGIT_0, grammarAccess.getScalarIntAccess().getDIGITTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6808:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulescalarInt17664); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getScalarIntAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6816:10: this_LONGINTEGER_2= RULE_LONGINTEGER
                    {
                    this_LONGINTEGER_2=(Token)match(input,RULE_LONGINTEGER,FOLLOW_RULE_LONGINTEGER_in_rulescalarInt17690); 

                    		current.merge(this_LONGINTEGER_2);
                        
                     
                        newLeafNode(this_LONGINTEGER_2, grammarAccess.getScalarIntAccess().getLONGINTEGERTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6824:6: (kw= KEYWORD_2 this_ID_4= RULE_ID )
                    {
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6824:6: (kw= KEYWORD_2 this_ID_4= RULE_ID )
                    // ../org.apache.pigeditor/src-gen/org/apache/pigeditor/parser/antlr/internal/InternalPigParser.g:6825:2: kw= KEYWORD_2 this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulescalarInt17715); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getScalarIntAccess().getDollarSignKeyword_3_0()); 
                        
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulescalarInt17730); 

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
        "\1\10\1\uffff\1\127\4\uffff\1\6\6\uffff";
    static final String DFA4_maxS =
        "\1\151\1\uffff\1\127\4\uffff\1\55\6\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\5\1\3\1\7\1\6"+
        "\1\4\1\2";
    static final String DFA4_specialS =
        "\16\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\1\1\5\3\uffff\1\1\1\uffff\1\6\3\uffff\1\1\16\uffff\1\3\4"+
            "\uffff\1\4\100\uffff\1\2",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\14\4\uffff\1\11\3\uffff\1\11\1\uffff\1\11\4\uffff\1\11\1"+
            "\12\2\11\1\uffff\1\11\1\uffff\1\11\1\uffff\1\11\2\uffff\1\10"+
            "\2\uffff\1\13\5\uffff\1\11\1\uffff\1\15",
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
            return "113:3: (this_DefineStatement_0= ruleDefineStatement | this_LoadStatement_1= ruleLoadStatement | ( (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement ) ( ruleParallelClause )? ) | this_MrStatement_13= ruleMrStatement | this_SplitStatement_14= ruleSplitStatement | this_UnionStatement_15= ruleUnionStatement | this_SampleStatement_16= ruleSampleStatement | this_StoreStatement_17= ruleStoreStatement | this_DumpStatement_18= ruleDumpStatement | this_DescribeStatement_19= ruleDescribeStatement | this_ExplainStatement_20= ruleExplainStatement )";
        }
    }
    static final String DFA2_eotS =
        "\15\uffff";
    static final String DFA2_eofS =
        "\15\uffff";
    static final String DFA2_minS =
        "\1\151\1\127\1\13\12\uffff";
    static final String DFA2_maxS =
        "\1\151\1\127\1\53\12\uffff";
    static final String DFA2_acceptS =
        "\3\uffff\1\6\1\2\1\11\1\12\1\5\1\1\1\4\1\7\1\3\1\10";
    static final String DFA2_specialS =
        "\15\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\3\uffff\1\5\1\uffff\1\10\4\uffff\1\4\1\uffff\1\6\1\12"+
            "\1\uffff\1\13\1\uffff\1\7\1\uffff\1\11\13\uffff\1\14",
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
            return "133:7: (this_ForeachStatement_2= ruleForeachStatement | this_FilterStatement_3= ruleFilterStatement | this_GroupByStatement_4= ruleGroupByStatement | this_OrderStatement_5= ruleOrderStatement | this_LimitStatement_6= ruleLimitStatement | this_DistinctStatement_7= ruleDistinctStatement | this_CrossStatement_8= ruleCrossStatement | this_JoinStatement_9= ruleJoinStatement | this_CoGroupByStatement_10= ruleCoGroupByStatement | this_StreamStatement_11= ruleStreamStatement )";
        }
    }
    static final String DFA45_eotS =
        "\10\uffff";
    static final String DFA45_eofS =
        "\1\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String DFA45_minS =
        "\1\33\1\7\1\uffff\1\112\1\uffff\1\112\1\7\1\112";
    static final String DFA45_maxS =
        "\2\151\1\uffff\1\151\1\uffff\3\151";
    static final String DFA45_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\3\uffff";
    static final String DFA45_specialS =
        "\10\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\4\56\uffff\1\3\7\uffff\1\2\26\uffff\1\1",
            "\1\4\5\uffff\1\4\4\uffff\1\4\11\uffff\1\4\3\uffff\2\4\4\uffff"+
            "\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\11\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\4\1\2\1"+
            "\4\1\2\5\4\1\5\4\4\1\uffff\2\4\13\uffff\2\4\2\uffff\1\2",
            "",
            "\1\2\1\uffff\1\2\5\uffff\1\2\22\uffff\1\4\3\uffff\1\2",
            "",
            "\1\7\1\uffff\1\2\5\uffff\1\2\26\uffff\1\6",
            "\1\4\5\uffff\1\4\4\uffff\1\4\11\uffff\1\4\3\uffff\2\4\4\uffff"+
            "\1\4\2\uffff\1\4\2\uffff\1\4\4\uffff\1\4\3\uffff\1\4\1\uffff"+
            "\2\4\1\uffff\11\4\1\uffff\2\4\1\uffff\1\4\1\uffff\1\4\1\2\1"+
            "\4\1\2\5\4\1\5\4\4\1\uffff\2\4\13\uffff\2\4\2\uffff\1\2",
            "\1\2\1\uffff\1\2\5\uffff\1\2\16\uffff\1\4\3\uffff\1\4\3\uffff"+
            "\1\2"
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
            return "2771:1: (this_func_eval_0= rulefunc_eval | rulecol_ref )";
        }
    }
    static final String DFA63_eotS =
        "\14\uffff";
    static final String DFA63_eofS =
        "\1\1\3\uffff\1\13\7\uffff";
    static final String DFA63_minS =
        "\1\60\3\uffff\1\60\7\uffff";
    static final String DFA63_maxS =
        "\1\151\3\uffff\1\151\7\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\uffff\1\3\1\4\1\6\1\7\1\10\1\2\1\5";
    static final String DFA63_specialS =
        "\14\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\2\31\uffff\1\4\6\uffff\1\11\1\6\1\7\1\uffff\1\1\5\uffff\1"+
            "\10\5\uffff\1\3\2\uffff\3\3\2\uffff\1\5",
            "",
            "",
            "",
            "\1\13\31\uffff\1\13\6\uffff\3\13\1\uffff\1\13\5\uffff\1\13"+
            "\5\uffff\1\13\2\uffff\3\13\2\uffff\1\12",
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
            return "()+ loopback of 3960:1: (kw= KEYWORD_38 | this_scalar_1= rulescalar | this_ID_2= RULE_ID | kw= KEYWORD_10 | kw= KEYWORD_2 | kw= KEYWORD_11 | kw= KEYWORD_19 | kw= KEYWORD_9 )+";
        }
    }
 

    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleQuery122 = new BitSet(new long[]{0x0000010800114702L,0x0000020100000000L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineStatement_in_ruleStatement216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleLoadStatement_in_ruleStatement243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleForeachStatement_in_ruleStatement272 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleFilterStatement_in_ruleStatement299 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleGroupByStatement_in_ruleStatement326 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleOrderStatement_in_ruleStatement353 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleLimitStatement_in_ruleStatement380 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleDistinctStatement_in_ruleStatement407 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleCrossStatement_in_ruleStatement434 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_ruleStatement461 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleCoGroupByStatement_in_ruleStatement488 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_ruleStatement515 = new BitSet(new long[]{0x0000000000002000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleParallelClause_in_ruleStatement532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleMrStatement_in_ruleStatement562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleSplitStatement_in_ruleStatement589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleUnionStatement_in_ruleStatement616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleSampleStatement_in_ruleStatement643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleStoreStatement_in_ruleStatement670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleDumpStatement_in_ruleStatement697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleDescribeStatement_in_ruleStatement724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleExplainStatement_in_ruleStatement751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleStatement764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentStatement_in_ruleStatement786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineStatement_in_entryRuleDefineStatement820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineStatement830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterClause_in_ruleDefineStatement871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineClause_in_ruleDefineStatement898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultClause_in_ruleDefineStatement925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclareClause_in_ruleDefineStatement952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadStatement_in_entryRuleLoadStatement986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadStatement996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleLoadStatement1042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleLoadStatement1055 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleLoadStatement1067 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLoadStatement1077 = new BitSet(new long[]{0x8000004000000002L});
    public static final BitSet FOLLOW_ruleLoadUsing_in_ruleLoadStatement1093 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleAsClause_in_ruleLoadStatement1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachStatement_in_entryRuleForeachStatement1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachStatement1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleForeachStatement1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleForeachStatement1216 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEYWORD_78_in_ruleForeachStatement1228 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleForeachStatement1248 = new BitSet(new long[]{0x0000000000001000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rulenested_blk_in_ruleForeachStatement1271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleForeachStatement1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_clause_in_ruleForeachStatement1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterStatement_in_entryRuleFilterStatement1350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterStatement1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleFilterStatement1406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleFilterStatement1419 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleFilterStatement1431 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleFilterStatement1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleFilterStatement1464 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleFilterStatement1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupByStatement_in_entryRuleGroupByStatement1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupByStatement1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleGroupByStatement1575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleGroupByStatement1588 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleGroupByStatement1600 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleGroupByStatement1620 = new BitSet(new long[]{0x0005000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulegroup_item_list_in_ruleGroupByStatement1641 = new BitSet(new long[]{0x0000004000000082L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleGroupByStatement1655 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rulegroup_type_in_ruleGroupByStatement1670 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleGroupByStatement1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoGroupByStatement_in_entryRuleCoGroupByStatement1724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoGroupByStatement1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCoGroupByStatement1780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleCoGroupByStatement1793 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_76_in_ruleCoGroupByStatement1805 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulejoin_sub_clause_in_ruleCoGroupByStatement1825 = new BitSet(new long[]{0x0000004000000082L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleCoGroupByStatement1839 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_COGROUP_TYPE_in_ruleCoGroupByStatement1849 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleCoGroupByStatement1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderStatement_in_entryRuleOrderStatement1903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderStatement1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleOrderStatement1959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleOrderStatement1972 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_KEYWORD_63_in_ruleOrderStatement1984 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleOrderStatement2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleOrderStatement2017 = new BitSet(new long[]{0x0000800008000000L,0x0000067200045500L});
    public static final BitSet FOLLOW_ruleorder_by_clause_in_ruleOrderStatement2032 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleOrderStatement2045 = new BitSet(new long[]{0x0000000000000000L,0x0000020000040400L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleOrderStatement2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCrossStatement_in_entryRuleCrossStatement2096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCrossStatement2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleCrossStatement2152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleCrossStatement2165 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleCrossStatement2177 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulerel_list_in_ruleCrossStatement2197 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleCrossStatement2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionStatement_in_entryRuleUnionStatement2250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionStatement2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleUnionStatement2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleUnionStatement2319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_KEYWORD_69_in_ruleUnionStatement2331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleUnionStatement2343 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulerel_list_in_ruleUnionStatement2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinStatement_in_entryRuleJoinStatement2398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinStatement2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleJoinStatement2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleJoinStatement2467 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleJoinStatement2479 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulejoin_sub_clause_in_ruleJoinStatement2499 = new BitSet(new long[]{0x0000004000000082L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleJoinStatement2513 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rulejoin_type_in_ruleJoinStatement2528 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleJoinStatement2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLimitStatement_in_entryRuleLimitStatement2582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLimitStatement2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleLimitStatement2638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleLimitStatement2651 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleLimitStatement2663 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleLimitStatement2683 = new BitSet(new long[]{0x0000000000000000L,0x0000007200000400L});
    public static final BitSet FOLLOW_rulescalarInt_in_ruleLimitStatement2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSampleStatement_in_entryRuleSampleStatement2733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSampleStatement2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleSampleStatement2789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleSampleStatement2802 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_74_in_ruleSampleStatement2814 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleSampleStatement2834 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_RULE_DOUBLENUMBER_in_ruleSampleStatement2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDistinctStatement_in_entryRuleDistinctStatement2879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDistinctStatement2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDistinctStatement2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleDistinctStatement2948 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_KEYWORD_84_in_ruleDistinctStatement2960 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleDistinctStatement2980 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rulepartition_clause_in_ruleDistinctStatement2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStreamStatement_in_entryRuleStreamStatement3033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStreamStatement3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleStreamStatement3089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleStreamStatement3102 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_KEYWORD_75_in_ruleStreamStatement3114 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleStreamStatement3134 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KEYWORD_80_in_ruleStreamStatement3147 = new BitSet(new long[]{0x0000000008000000L,0x0000030000000000L});
    public static final BitSet FOLLOW_RULE_EXECCOMMAND_in_ruleStreamStatement3158 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleStreamStatement3179 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_ruleAsClause_in_ruleStreamStatement3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMrStatement_in_entryRuleMrStatement3232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMrStatement3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleMrStatement3288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleMrStatement3301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_KEYWORD_90_in_ruleMrStatement3313 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMrStatement3323 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleStoreStatement_in_ruleMrStatement3344 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleLoadStatement_in_ruleMrStatement3364 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_EXECCOMMAND_in_ruleMrStatement3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitStatement_in_entryRuleSplitStatement3412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitStatement3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleSplitStatement3468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleSplitStatement3481 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_KEYWORD_66_in_ruleSplitStatement3493 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleSplitStatement3513 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleSplitStatement3526 = new BitSet(new long[]{0x0000000008000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulesplit_branch_in_ruleSplitStatement3546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleSplitStatement3560 = new BitSet(new long[]{0x0000000008000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulesplit_branch_in_ruleSplitStatement3580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleStoreStatement_in_entryRuleStoreStatement3617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStoreStatement3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_ruleStoreStatement3665 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleStoreStatement3685 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleStoreStatement3698 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStoreStatement3708 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleStoreStatement3721 = new BitSet(new long[]{0x0000000000000000L,0x0000020000040400L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleStoreStatement3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescribeStatement_in_entryRuleDescribeStatement3772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescribeStatement3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_ruleDescribeStatement3820 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleDescribeStatement3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplainStatement_in_entryRuleExplainStatement3875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplainStatement3885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_ruleExplainStatement3923 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleExplainStatement3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDumpStatement_in_entryRuleDumpStatement3978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDumpStatement3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleDumpStatement4026 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_ruleDumpStatement4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition4081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleCondition4130 = new BitSet(new long[]{0x0050401044200030L,0x0000000020001000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCondition4145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleCondition4157 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleOrCondition_in_ruleCondition4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrCondition_in_entryRuleOrCondition4214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrCondition4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndCondition_in_ruleOrCondition4271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleOrCondition4293 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleAndCondition_in_ruleOrCondition4313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleAndCondition_in_entryRuleAndCondition4350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndCondition4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_ruleAndCondition4407 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleAndCondition4429 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_ruleAndCondition4449 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleUnaryCondition_in_entryRuleUnaryCondition4486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryCondition4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleUnaryCondition4535 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000002002000L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleUnaryCondition4569 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleUnaryCondition4602 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleUnaryCondition4637 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleUnaryCondition4659 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryCondition4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTE_in_ruleUnaryCondition4711 = new BitSet(new long[]{0x75A0000000040002L,0x0000000001400026L});
    public static final BitSet FOLLOW_rulerel_op_in_ruleUnaryCondition4736 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleTE_in_ruleUnaryCondition4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTE_in_entryRuleTE4794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTE4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTE4851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleTE4864 = new BitSet(new long[]{0x0200800000000000L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleTE4877 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleTE4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunc_eval_in_entryRulefunc_eval4927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunc_eval4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncName_in_rulefunc_eval4978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulefunc_eval4999 = new BitSet(new long[]{0x0200800008000000L,0x0000067200067500L});
    public static final BitSet FOLLOW_rulereal_arg_list_in_rulefunc_eval5019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rulefunc_eval5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_arg_list_in_entryRulereal_arg_list5067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal_arg_list5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_arg_in_rulereal_arg_list5123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulereal_arg_list5137 = new BitSet(new long[]{0x0200800008000000L,0x0000067200065500L});
    public static final BitSet FOLLOW_rulereal_arg_in_rulereal_arg_list5157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulereal_arg_in_entryRulereal_arg5194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal_arg5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_rulereal_arg5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_rulereal_arg5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleExpression5355 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleAddExpression_in_ruleExpression5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression5412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulti_expr_in_ruleAddExpression5469 = new BitSet(new long[]{0x0000000000000002L,0x0000000000028000L});
    public static final BitSet FOLLOW_rulePLUS_in_ruleAddExpression5486 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleMINUS_in_ruleAddExpression5507 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_rulemulti_expr_in_ruleAddExpression5528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000028000L});
    public static final BitSet FOLLOW_rulemulti_expr_in_entryRulemulti_expr5565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulti_expr5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecast_expr_in_rulemulti_expr5622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000084800L});
    public static final BitSet FOLLOW_ruleSTAR_in_rulemulti_expr5639 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleDIV_in_rulemulti_expr5660 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_rulePERCENT_in_rulemulti_expr5681 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_rulecast_expr_in_rulemulti_expr5702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000084800L});
    public static final BitSet FOLLOW_rulecast_expr_in_entryRulecast_expr5739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecast_expr5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expr_in_rulecast_expr5795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleunary_expr_in_entryRuleunary_expr5828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleunary_expr5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_eval_in_ruleunary_expr5885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleneg_expr_in_ruleunary_expr5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_eval_in_entryRuleexpr_eval5946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr_eval5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconst_expr_in_ruleexpr_eval5997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevar_expr_in_ruleexpr_eval6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevar_expr_in_entryRulevar_expr6058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevar_expr6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprojectable_expr_in_rulevar_expr6115 = new BitSet(new long[]{0x0800000000000002L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruledot_proj_in_rulevar_expr6131 = new BitSet(new long[]{0x0800000000000002L,0x0000000000040200L});
    public static final BitSet FOLLOW_rulepound_proj_in_rulevar_expr6152 = new BitSet(new long[]{0x0800000000000002L,0x0000000000040200L});
    public static final BitSet FOLLOW_ruleprojectable_expr_in_entryRuleprojectable_expr6188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprojectable_expr6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunc_eval_in_ruleprojectable_expr6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_ref_in_ruleprojectable_expr6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledot_proj_in_entryRuledot_proj6301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledot_proj6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruledot_proj6351 = new BitSet(new long[]{0x0000800008000000L,0x0000067200040500L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruledot_proj6370 = new BitSet(new long[]{0x0000800008000000L,0x0000067200040500L});
    public static final BitSet FOLLOW_rulecol_alias_or_index_in_ruledot_proj6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_alias_or_index_in_entryRulecol_alias_or_index6438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_alias_or_index6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_alias_in_rulecol_alias_or_index6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_index_in_rulecol_alias_or_index6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_alias_in_entryRulecol_alias6574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_alias6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulecol_alias6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_index_in_entryRulecol_index6675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_index6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOLLAR_in_rulecol_index6733 = new BitSet(new long[]{0x0000000000000000L,0x0000002200000000L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rulecol_index6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulecol_index6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepound_proj_in_entryRulepound_proj6826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepound_proj6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOUND_in_rulepound_proj6884 = new BitSet(new long[]{0x0000800000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulepound_proj6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_rulepound_proj6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleneg_expr_in_entryRuleneg_expr6971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleneg_expr6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleneg_expr7019 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_rulecast_expr_in_ruleneg_expr7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_in_entryRulerel_op7075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_eq_in_rulerel_op7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_ne_in_rulerel_op7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gt_in_rulerel_op7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gte_in_rulerel_op7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lt_in_rulerel_op7265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lte_in_rulerel_op7298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_rulerel_op7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_eq_in_entryRulerel_op_eq7362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_eq7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_EQ_in_rulerel_op_eq7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_EQ_in_rulerel_op_eq7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_ne_in_entryRulerel_op_ne7498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_ne7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_NE_in_rulerel_op_ne7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_NE_in_rulerel_op_ne7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gt_in_entryRulerel_op_gt7634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_gt7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GT_in_rulerel_op_gt7692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GT_in_rulerel_op_gt7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_gte_in_entryRulerel_op_gte7770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_gte7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GTE_in_rulerel_op_gte7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GTE_in_rulerel_op_gte7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lt_in_entryRulerel_op_lt7906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_lt7917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LT_in_rulerel_op_lt7964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LT_in_rulerel_op_lt7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_op_lte_in_entryRulerel_op_lte8042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_op_lte8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LTE_in_rulerel_op_lte8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LTE_in_rulerel_op_lte8133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasType_in_entryRuleAliasType8177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasType8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAliasType8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlattenGeneratedItem_in_entryRuleFlattenGeneratedItem8265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlattenGeneratedItem8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleFlattenGeneratedItem8323 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleFlattenGeneratedItem8341 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleFlattenGeneratedItem8355 = new BitSet(new long[]{0x0000000008000000L,0x0000020000001000L});
    public static final BitSet FOLLOW_ruleFieldDef_in_ruleFlattenGeneratedItem8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldFefList_in_ruleFlattenGeneratedItem8392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentStatement_in_entryRuleCommentStatement8430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentStatement8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleCommentStatement8480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias8524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlias8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParallelClause_in_entryRuleParallelClause8618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParallelClause8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_ruleParallelClause8667 = new BitSet(new long[]{0x0000000000000000L,0x0000007200000400L});
    public static final BitSet FOLLOW_rulescalarInt_in_ruleParallelClause8689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegisterClause_in_entryRuleRegisterClause8734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegisterClause8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_ruleRegisterClause8783 = new BitSet(new long[]{0x0001000000000000L,0x00000272080E0400L});
    public static final BitSet FOLLOW_rulePathClause_in_ruleRegisterClause8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultClause_in_entryRuleDefaultClause8849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultClause8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_ruleDefaultClause8897 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDefaultClause8917 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefaultClause8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclareClause_in_entryRuleDeclareClause8962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclareClause8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_ruleDeclareClause9010 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDeclareClause9030 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDeclareClause9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefineClause_in_entryRuleDefineClause9075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefineClause9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_ruleDefineClause9123 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleDefineClause9143 = new BitSet(new long[]{0x0000000000000000L,0x0000020000040400L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleDefineClause9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoadUsing_in_entryRuleLoadUsing9194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoadUsing9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_ruleLoadUsing9243 = new BitSet(new long[]{0x0000000000000000L,0x0000020000040400L});
    public static final BitSet FOLLOW_ruleFuncClause_in_ruleLoadUsing9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncClause_in_entryRuleFuncClause9310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncClause9321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncName_in_ruleFuncClause9368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleFuncClause9386 = new BitSet(new long[]{0x0000000000000000L,0x0000040000012000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFuncClause9402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleFuncClause9423 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFuncClause9438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleFuncClause9458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuncName_in_entryRuleFuncName9498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuncName9509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFuncName9549 = new BitSet(new long[]{0x0000000000000002L,0x0000020000040400L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleFuncName9573 = new BitSet(new long[]{0x0000000000000002L,0x0000020000040400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleFuncName9592 = new BitSet(new long[]{0x0000000000000002L,0x0000020000040400L});
    public static final BitSet FOLLOW_rulePathClause_in_entryRulePathClause9633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathClause9644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rulePathClause9682 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_rulescalar_in_rulePathClause9710 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathClause9736 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rulePathClause9760 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePathClause9779 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rulePathClause9798 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rulePathClause9817 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePathClause9836 = new BitSet(new long[]{0x0001000000000002L,0x00000272080E0400L});
    public static final BitSet FOLLOW_ruleAsClause_in_entryRuleAsClause9877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsClause9888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleAsClause9926 = new BitSet(new long[]{0x0000001000000000L,0x0000020000001000L});
    public static final BitSet FOLLOW_ruleAliasDef_in_ruleAsClause9949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDefList_in_ruleAsClause9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDef_in_entryRuleAliasDef10028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDef10039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleAliasDef10086 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleAliasDef10105 = new BitSet(new long[]{0x0050401044200030L,0x0000000020001000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAliasDef10127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDefList_in_entryRuleAliasDefList10174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDefList10185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleAliasDefList10223 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasDef_in_ruleAliasDefList10245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleAliasDefList10264 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasDef_in_ruleAliasDefList10286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleAliasDefList10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_entryRuleIDENTIFIER10346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDENTIFIER10357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDENTIFIER10396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldDef_in_entryRuleFieldDef10440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldDef10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_ruleFieldDef10498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleFieldDef10517 = new BitSet(new long[]{0x0050401044200030L,0x0000000020001000L});
    public static final BitSet FOLLOW_ruleType_in_ruleFieldDef10539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldFefList_in_entryRuleFieldFefList10586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldFefList10597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleFieldFefList10635 = new BitSet(new long[]{0x0000000008000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleFieldDef_in_ruleFieldFefList10657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleFieldFefList10676 = new BitSet(new long[]{0x0000000008000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleFieldDef_in_ruleFieldFefList10698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleFieldFefList10718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType10758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_ruleType10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_ruleType10849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleType10882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebag_type_in_ruleType10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleType_in_entryRuleSimpleType10960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleType10971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleSimpleType11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleSimpleType11028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleSimpleType11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_ruleSimpleType11066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_89_in_ruleSimpleType11085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_88_in_ruleSimpleType11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleType_in_entryRuleTupleType11144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleType11155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_ruleTupleType11194 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleAliasDefList_in_ruleTupleType11218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulebag_type_in_entryRulebag_type11263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulebag_type11274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rulebag_type11313 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rulebag_type11328 = new BitSet(new long[]{0x0000001008000000L,0x0000020040001000L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulebag_type11352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rulebag_type11370 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleTupleType_in_rulebag_type11394 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rulebag_type11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType11454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType11465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_ruleMapType11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_EQ_in_entryRuleSTR_OP_EQ11543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_EQ11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleSTR_OP_EQ11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GT_in_entryRuleSTR_OP_GT11630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_GT11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleSTR_OP_GT11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LT_in_entryRuleSTR_OP_LT11717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_LT11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleSTR_OP_LT11765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_GTE_in_entryRuleSTR_OP_GTE11804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_GTE11815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleSTR_OP_GTE11852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_LTE_in_entryRuleSTR_OP_LTE11891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_LTE11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleSTR_OP_LTE11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTR_OP_NE_in_entryRuleSTR_OP_NE11978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTR_OP_NE11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleSTR_OP_NE12026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_EQ_in_entryRuleNUM_OP_EQ12067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_EQ12078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleNUM_OP_EQ12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LT_in_entryRuleNUM_OP_LT12154 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_LT12165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleNUM_OP_LT12202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_LTE_in_entryRuleNUM_OP_LTE12241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_LTE12252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleNUM_OP_LTE12289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GT_in_entryRuleNUM_OP_GT12328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_GT12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleNUM_OP_GT12376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_GTE_in_entryRuleNUM_OP_GTE12415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_GTE12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleNUM_OP_GTE12463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUM_OP_NE_in_entryRuleNUM_OP_NE12502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUM_OP_NE12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleNUM_OP_NE12550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSEMI_COLON_in_entryRuleSEMI_COLON12589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSEMI_COLON12600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleSEMI_COLON12637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePOUND_in_entryRulePOUND12688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePOUND12699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePOUND12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMMA_in_entryRuleCOMMA12777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMMA12788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleCOMMA12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDIV_in_entryRuleDIV12866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDIV12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleDIV12914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePERCENT_in_entryRulePERCENT12953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePERCENT12964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulePERCENT13001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLUS_in_entryRulePLUS13040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLUS13051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rulePLUS13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMINUS_in_entryRuleMINUS13127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMINUS13138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleMINUS13175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_entryRuleSTAR13214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTAR13225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleSTAR13262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOLLAR_in_entryRuleDOLLAR13303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOLLAR13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleDOLLAR13351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_type_in_entryRulegroup_type13390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_type13401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulegroup_type13440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_item_list_in_entryRulegroup_item_list13483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_item_list13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_item_in_rulegroup_item_list13540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleCOMMA_in_rulegroup_item_list13556 = new BitSet(new long[]{0x0005000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulegroup_item_in_rulegroup_item_list13576 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleorder_by_clause_in_entryRuleorder_by_clause13614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorder_by_clause13625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_ruleorder_by_clause13673 = new BitSet(new long[]{0x0008008000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleorder_by_clause13692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleorder_by_clause13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorder_col_list_in_ruleorder_by_clause13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorder_col_list_in_entryRuleorder_col_list13787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorder_col_list13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleorder_col_in_ruleorder_col_list13845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleorder_col_list13864 = new BitSet(new long[]{0x0000800008000000L,0x0000067200045500L});
    public static final BitSet FOLLOW_ruleorder_col_in_ruleorder_col_list13886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleorder_col_in_entryRuleorder_col13933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleorder_col13944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_ref_in_ruleorder_col13992 = new BitSet(new long[]{0x0008008000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleorder_col14011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleorder_col14030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleorder_col14053 = new BitSet(new long[]{0x0000800008000000L,0x0000067200040500L});
    public static final BitSet FOLLOW_rulecol_ref_in_ruleorder_col14075 = new BitSet(new long[]{0x0008008000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleorder_col14094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleorder_col14113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleorder_col14128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepartition_clause_in_entryRulepartition_clause14169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepartition_clause14180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_91_in_rulepartition_clause14218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rulepartition_clause14231 = new BitSet(new long[]{0x0000000000000000L,0x0000020000040400L});
    public static final BitSet FOLLOW_ruleFuncName_in_rulepartition_clause14253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerel_list_in_entryRulerel_list14297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerel_list14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasType_in_rulerel_list14353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulerel_list14367 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_ruleAliasType_in_rulerel_list14387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulejoin_type_in_entryRulejoin_type14425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_type14436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulejoin_type14475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_sub_clause_in_entryRulejoin_sub_clause14518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_sub_clause14528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_item_in_rulejoin_sub_clause14575 = new BitSet(new long[]{0x0000120300000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rulejoin_sub_clause14588 = new BitSet(new long[]{0x0000000100000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_65_in_rulejoin_sub_clause14606 = new BitSet(new long[]{0x0000000100000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rulejoin_sub_clause14624 = new BitSet(new long[]{0x0000000100000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rulejoin_sub_clause14639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulejoin_sub_clause14654 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulejoin_item_in_rulejoin_sub_clause14674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulejoin_item_in_entryRulejoin_item14711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_item14721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasType_in_rulejoin_item14767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulejoin_group_by_clause_in_rulejoin_item14788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegroup_item_in_entryRulegroup_item14823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegroup_item14833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rulegroup_item14873 = new BitSet(new long[]{0x0200800008000000L,0x0000067200065500L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_list_in_rulegroup_item14894 = new BitSet(new long[]{0x0000000110000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rulegroup_item14913 = new BitSet(new long[]{0x0000000110000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rulegroup_item14931 = new BitSet(new long[]{0x0000000110000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_rulegroup_item14945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rulegroup_item14963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_clause_in_entryRulejoin_group_by_clause14999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_group_by_clause15009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rulejoin_group_by_clause15047 = new BitSet(new long[]{0x0200800008000000L,0x0000067200065500L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_list_in_rulejoin_group_by_clause15068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_list_in_entryRulejoin_group_by_expr_list15102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_group_by_expr_list15112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulejoin_group_by_expr_list15178 = new BitSet(new long[]{0x0200800008000000L,0x0000067200065500L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulejoin_group_by_expr_list15212 = new BitSet(new long[]{0x0200800008000000L,0x0000067200065500L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_rulejoin_group_by_expr_list15232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rulejoin_group_by_expr_list15247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulejoin_group_by_expr_in_entryRulejoin_group_by_expr15282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulejoin_group_by_expr15292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rulejoin_group_by_expr15339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTAR_in_rulejoin_group_by_expr15360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_blk_in_entryRulenested_blk15394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_blk15404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rulenested_blk15442 = new BitSet(new long[]{0x0000000000001000L,0x0000020020000000L});
    public static final BitSet FOLLOW_rulenested_command_list_in_rulenested_blk15463 = new BitSet(new long[]{0x0000000000001000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rulegenerate_clause_in_rulenested_blk15483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rulenested_blk15496 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rulenested_blk15508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulegenerate_clause_in_entryRulegenerate_clause15542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulegenerate_clause15552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_rulegenerate_clause15590 = new BitSet(new long[]{0x0200800008000000L,0x0000067200065500L});
    public static final BitSet FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulegenerate_clause15624 = new BitSet(new long[]{0x0200800008000000L,0x0000067200065500L});
    public static final BitSet FOLLOW_ruleFlattenGeneratedItem_in_rulegenerate_clause15644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rulenested_command_list_in_entryRulenested_command_list15681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_command_list15691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_command_in_rulenested_command_list15747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_ruleSEMI_COLON_in_rulenested_command_list15763 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_rulenested_command_in_entryRulenested_command15799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_command15809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_rulenested_command15850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rulenested_command15862 = new BitSet(new long[]{0x02008000A8400800L,0x0000067200061500L});
    public static final BitSet FOLLOW_rulenested_op_in_rulenested_command15883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_op_in_entryRulenested_op15917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_op15927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedFilter_in_rulenested_op15974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_sort_in_rulenested_op16001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_distinct_in_rulenested_op16028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_limit_in_rulenested_op16055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulenested_op16075 = new BitSet(new long[]{0x0050401044200030L,0x0000000020001000L});
    public static final BitSet FOLLOW_ruleType_in_rulenested_op16090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rulenested_op16102 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleAddExpression_in_rulenested_op16125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedFilter_in_entryRuleNestedFilter16160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedFilter16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_ruleNestedFilter16208 = new BitSet(new long[]{0x0000800008000000L,0x0000067200040500L});
    public static final BitSet FOLLOW_rulevar_expr_in_ruleNestedFilter16228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleNestedFilter16241 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleNestedFilter16261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_sort_in_entryRulenested_sort16296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_sort16306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_rulenested_sort16344 = new BitSet(new long[]{0x0000800008000000L,0x0000067200040500L});
    public static final BitSet FOLLOW_rulevar_expr_in_rulenested_sort16365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rulenested_sort16377 = new BitSet(new long[]{0x0000800008000000L,0x0000067200045500L});
    public static final BitSet FOLLOW_ruleorder_by_clause_in_rulenested_sort16392 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_rulenested_sort16405 = new BitSet(new long[]{0x0000000000000000L,0x0000020000040400L});
    public static final BitSet FOLLOW_ruleFuncClause_in_rulenested_sort16420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_distinct_in_entryRulenested_distinct16456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_distinct16466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_rulenested_distinct16504 = new BitSet(new long[]{0x0000800008000000L,0x0000067200040500L});
    public static final BitSet FOLLOW_rulevar_expr_in_rulenested_distinct16525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenested_limit_in_entryRulenested_limit16559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenested_limit16569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_rulenested_limit16607 = new BitSet(new long[]{0x0000800008000000L,0x0000067200040500L});
    public static final BitSet FOLLOW_rulevar_expr_in_rulenested_limit16628 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_rulenested_limit16639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGINTEGER_in_rulenested_limit16655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesplit_branch_in_entryRulesplit_branch16690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesplit_branch16700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulesplit_branch16741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rulesplit_branch16753 = new BitSet(new long[]{0x0200800008000000L,0x0000067200061500L});
    public static final BitSet FOLLOW_ruleCondition_in_rulesplit_branch16774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecol_ref_in_entryRulecol_ref16809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecol_ref16820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealias_col_ref_in_rulecol_ref16867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollar_col_ref_in_rulecol_ref16900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealias_col_ref_in_entryRulealias_col_ref16945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulealias_col_ref16956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rulealias_col_ref16994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDENTIFIER_in_rulealias_col_ref17022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledollar_col_ref_in_entryRuledollar_col_ref17067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledollar_col_ref17078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOLLAR_in_ruledollar_col_ref17125 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruledollar_col_ref17145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconst_expr_in_entryRuleconst_expr17190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconst_expr17201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_in_ruleconst_expr17247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleliteral_in_entryRuleliteral17291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleliteral17302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalar_in_ruleliteral17349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleliteral17375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleliteral17399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleliteral17418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalar_in_entryRulescalar17458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulescalar17469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATINGPOINT_in_rulescalar17509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalarInt_in_rulescalar17542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulescalarInt_in_entryRulescalarInt17587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulescalarInt17598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rulescalarInt17638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulescalarInt17664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGINTEGER_in_rulescalarInt17690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulescalarInt17715 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_rulescalarInt17730 = new BitSet(new long[]{0x0000000000000002L});

}