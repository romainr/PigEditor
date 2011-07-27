package org.apache.pigeditor.serializer;

import com.google.inject.Inject;
import org.apache.pigeditor.services.PigGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractPigSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PigGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CoGroupByStatement_Statement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_CoGroupByStatement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q;
	protected AbstractElementAlias match_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0;
	protected AbstractElementAlias match_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_____LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2___LeftParenthesisKeyword_0_0_p__a;
	protected AbstractElementAlias match_Condition_UnaryCondition___LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2__p;
	protected AbstractElementAlias match_CrossStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_DistinctStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_Expression_NOTKeyword_0_q;
	protected AbstractElementAlias match_Expression_neg_expr_NOTKeyword_0_q_HyphenMinusKeyword_0_a;
	protected AbstractElementAlias match_ForeachStatement_Statement_SemicolonKeyword_4_0_1_q_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_GroupByStatement_Statement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q_Partition_clauseParserRuleCall_6_q_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_GroupByStatement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q;
	protected AbstractElementAlias match_JoinStatement_Statement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_JoinStatement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q;
	protected AbstractElementAlias match_LoadStatement_LoadUsingParserRuleCall_4_q;
	protected AbstractElementAlias match_LoadStatement_LoadUsingParserRuleCall_4_q_AsClauseParserRuleCall_5_q;
	protected AbstractElementAlias match_MrStatement_EXECCOMMANDTerminalRuleCall_6_q;
	protected AbstractElementAlias match_OrderStatement_Statement___USINGKeyword_6_0_FuncClauseParserRuleCall_6_1__q_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_Statement_ParallelClauseParserRuleCall_0_0_2_1_q;
	protected AbstractElementAlias match_StoreStatement___USINGKeyword_4_0_FuncClauseParserRuleCall_4_1__q;
	protected AbstractElementAlias match_TE_NOTKeyword_1_1_q;
	protected AbstractElementAlias match_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_a;
	protected AbstractElementAlias match_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_p;
	protected AbstractElementAlias match_TE___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q;
	protected AbstractElementAlias match_UnaryCondition_RightParenthesisKeyword_0_3_a;
	protected AbstractElementAlias match_UnaryCondition_RightParenthesisKeyword_0_3_p;
	protected AbstractElementAlias match_group_item___INNERKeyword_1_0_or_OUTERKeyword_1_1__q;
	protected AbstractElementAlias match_neg_expr_HyphenMinusKeyword_0_a;
	protected AbstractElementAlias match_neg_expr_HyphenMinusKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PigGrammarAccess) access;
		match_CoGroupByStatement_Statement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q = new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getCoGroupByStatementAccess().getUSINGKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getCoGroupByStatementAccess().getCOGROUP_TYPETerminalRuleCall_4_1())), new TokenAlias(true, false, grammarAccess.getCoGroupByStatementAccess().getPartition_clauseParserRuleCall_5()), new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()));
		match_CoGroupByStatement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getCoGroupByStatementAccess().getUSINGKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getCoGroupByStatementAccess().getCOGROUP_TYPETerminalRuleCall_4_1()));
		match_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0 = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getUnaryConditionAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_0()));
		match_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_____LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2___LeftParenthesisKeyword_0_0_p__a = new GroupAlias(false, false, new TokenAlias(false, true, grammarAccess.getUnaryConditionAccess().getLeftParenthesisKeyword_0_0()), new GroupAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getTypeParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_2())), new TokenAlias(false, true, grammarAccess.getUnaryConditionAccess().getLeftParenthesisKeyword_0_0())));
		match_Condition_UnaryCondition___LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2__p = new GroupAlias(false, true, new TokenAlias(false, true, grammarAccess.getUnaryConditionAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getTypeParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_2()));
		match_CrossStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q = new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getCrossStatementAccess().getPartition_clauseParserRuleCall_4()), new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()));
		match_DistinctStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q = new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getDistinctStatementAccess().getPartition_clauseParserRuleCall_4()), new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()));
		match_Expression_NOTKeyword_0_q = new TokenAlias(true, false, grammarAccess.getExpressionAccess().getNOTKeyword_0());
		match_Expression_neg_expr_NOTKeyword_0_q_HyphenMinusKeyword_0_a = new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getExpressionAccess().getNOTKeyword_0()), new TokenAlias(true, true, grammarAccess.getNeg_exprAccess().getHyphenMinusKeyword_0()));
		match_ForeachStatement_Statement_SemicolonKeyword_4_0_1_q_ParallelClauseParserRuleCall_0_0_2_1_q = new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getForeachStatementAccess().getSemicolonKeyword_4_0_1()), new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()));
		match_GroupByStatement_Statement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q_Partition_clauseParserRuleCall_6_q_ParallelClauseParserRuleCall_0_0_2_1_q = new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getGroupByStatementAccess().getUSINGKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getGroupByStatementAccess().getGroup_typeParserRuleCall_5_1())), new TokenAlias(true, false, grammarAccess.getGroupByStatementAccess().getPartition_clauseParserRuleCall_6()), new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()));
		match_GroupByStatement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getGroupByStatementAccess().getUSINGKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getGroupByStatementAccess().getGroup_typeParserRuleCall_5_1()));
		match_JoinStatement_Statement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q = new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getJoinStatementAccess().getUSINGKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getJoinStatementAccess().getJoin_typeParserRuleCall_4_1())), new TokenAlias(true, false, grammarAccess.getJoinStatementAccess().getPartition_clauseParserRuleCall_5()), new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()));
		match_JoinStatement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getJoinStatementAccess().getUSINGKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getJoinStatementAccess().getJoin_typeParserRuleCall_4_1()));
		match_LoadStatement_LoadUsingParserRuleCall_4_q = new TokenAlias(true, false, grammarAccess.getLoadStatementAccess().getLoadUsingParserRuleCall_4());
		match_LoadStatement_LoadUsingParserRuleCall_4_q_AsClauseParserRuleCall_5_q = new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getLoadStatementAccess().getLoadUsingParserRuleCall_4()), new TokenAlias(true, false, grammarAccess.getLoadStatementAccess().getAsClauseParserRuleCall_5()));
		match_MrStatement_EXECCOMMANDTerminalRuleCall_6_q = new TokenAlias(true, false, grammarAccess.getMrStatementAccess().getEXECCOMMANDTerminalRuleCall_6());
		match_OrderStatement_Statement___USINGKeyword_6_0_FuncClauseParserRuleCall_6_1__q_ParallelClauseParserRuleCall_0_0_2_1_q = new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getOrderStatementAccess().getUSINGKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getOrderStatementAccess().getFuncClauseParserRuleCall_6_1())), new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1()));
		match_Statement_ParallelClauseParserRuleCall_0_0_2_1_q = new TokenAlias(true, false, grammarAccess.getStatementAccess().getParallelClauseParserRuleCall_0_0_2_1());
		match_StoreStatement___USINGKeyword_4_0_FuncClauseParserRuleCall_4_1__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStoreStatementAccess().getUSINGKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getStoreStatementAccess().getFuncClauseParserRuleCall_4_1()));
		match_TE_NOTKeyword_1_1_q = new TokenAlias(true, false, grammarAccess.getTEAccess().getNOTKeyword_1_1());
		match_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_a = new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTEAccess().getISKeyword_1_0()), new TokenAlias(true, false, grammarAccess.getTEAccess().getNOTKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getTEAccess().getNULLKeyword_1_2())), new TokenAlias(true, true, grammarAccess.getUnaryConditionAccess().getRightParenthesisKeyword_0_3()));
		match_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_p = new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTEAccess().getISKeyword_1_0()), new TokenAlias(true, false, grammarAccess.getTEAccess().getNOTKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getTEAccess().getNULLKeyword_1_2())), new TokenAlias(false, true, grammarAccess.getUnaryConditionAccess().getRightParenthesisKeyword_0_3()));
		match_TE___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getTEAccess().getISKeyword_1_0()), new TokenAlias(true, false, grammarAccess.getTEAccess().getNOTKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getTEAccess().getNULLKeyword_1_2()));
		match_UnaryCondition_RightParenthesisKeyword_0_3_a = new TokenAlias(true, true, grammarAccess.getUnaryConditionAccess().getRightParenthesisKeyword_0_3());
		match_UnaryCondition_RightParenthesisKeyword_0_3_p = new TokenAlias(false, true, grammarAccess.getUnaryConditionAccess().getRightParenthesisKeyword_0_3());
		match_group_item___INNERKeyword_1_0_or_OUTERKeyword_1_1__q = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getGroup_itemAccess().getINNERKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getGroup_itemAccess().getOUTERKeyword_1_1()));
		match_neg_expr_HyphenMinusKeyword_0_a = new TokenAlias(true, true, grammarAccess.getNeg_exprAccess().getHyphenMinusKeyword_0());
		match_neg_expr_HyphenMinusKeyword_0_p = new TokenAlias(false, true, grammarAccess.getNeg_exprAccess().getHyphenMinusKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAliasRule())
			return getAliasToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getAsClauseRule())
			return getAsClauseToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOGROUP_TYPERule())
			return getCOGROUP_TYPEToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCommentStatementRule())
			return getCommentStatementToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDIVRule())
			return getDIVToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDOUBLENUMBERRule())
			return getDOUBLENUMBERToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEXECCOMMANDRule())
			return getEXECCOMMANDToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFieldDefRule())
			return getFieldDefToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFieldFefListRule())
			return getFieldFefListToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFuncClauseRule())
			return getFuncClauseToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFuncNameRule())
			return getFuncNameToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIDENTIFIERRule())
			return getIDENTIFIERToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLONGINTEGERRule())
			return getLONGINTEGERToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLoadUsingRule())
			return getLoadUsingToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMINUSRule())
			return getMINUSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPERCENTRule())
			return getPERCENTToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPLUSRule())
			return getPLUSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getParallelClauseRule())
			return getParallelClauseToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRegisterClauseRule())
			return getRegisterClauseToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSEMI_COLONRule())
			return getSEMI_COLONToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTARRule())
			return getSTARToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTypeRule())
			return getTypeToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCol_refRule())
			return getcol_refToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getConst_exprRule())
			return getconst_exprToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDot_projRule())
			return getdot_projToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getGroup_typeRule())
			return getgroup_typeToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJoin_typeRule())
			return getjoin_typeToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOrder_by_clauseRule())
			return getorder_by_clauseToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPartition_clauseRule())
			return getpartition_clauseToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPound_projRule())
			return getpound_projToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRel_opRule())
			return getrel_opToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getScalarIntRule())
			return getscalarIntToken(ruleCall, node);
		return "";
	}
	
	protected String getAliasToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getAsClauseToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AS";
	}
	protected String getCOGROUP_TYPEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'merge\'";
	}
	protected String getCOMMAToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getCommentStatementToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "--";
	}
	protected String getDIVToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	protected String getDOUBLENUMBERToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	protected String getEXECCOMMANDToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "``";
	}
	protected String getFieldDefToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getFieldFefListToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "()";
	}
	protected String getFuncClauseToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "()";
	}
	protected String getFuncNameToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getIDENTIFIERToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getINTToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	protected String getLONGINTEGERToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "L";
	}
	protected String getLoadUsingToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "USING()";
	}
	protected String getMINUSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	protected String getPERCENTToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	protected String getPLUSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	protected String getParallelClauseToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PARALLEL";
	}
	protected String getRegisterClauseToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "REGISTERALL";
	}
	protected String getSEMI_COLONToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	protected String getSTARToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	protected String getSTRINGToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	protected String getTypeToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "INT";
	}
	protected String getcol_refToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "GROUP";
	}
	protected String getconst_exprToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	protected String getdot_projToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	protected String getgroup_typeToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	protected String getjoin_typeToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	protected String getorder_by_clauseToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	protected String getpartition_clauseToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PARTITIONBY";
	}
	protected String getpound_projToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#\"\"";
	}
	protected String getrel_opToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "EQ";
	}
	protected String getscalarIntToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_CoGroupByStatement_Statement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_CoGroupByStatement_Statement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_CoGroupByStatement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q.equals(transition.getAmbiguousSyntax()))
			emit_CoGroupByStatement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q(semanticObject, transition, fromNode, toNode);
		else if(match_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0.equals(transition.getAmbiguousSyntax()))
			emit_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0(semanticObject, transition, fromNode, toNode);
		else if(match_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_____LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2___LeftParenthesisKeyword_0_0_p__a.equals(transition.getAmbiguousSyntax()))
			emit_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_____LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2___LeftParenthesisKeyword_0_0_p__a(semanticObject, transition, fromNode, toNode);
		else if(match_Condition_UnaryCondition___LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2__p.equals(transition.getAmbiguousSyntax()))
			emit_Condition_UnaryCondition___LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2__p(semanticObject, transition, fromNode, toNode);
		else if(match_CrossStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_CrossStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_DistinctStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_DistinctStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_Expression_NOTKeyword_0_q.equals(transition.getAmbiguousSyntax()))
			emit_Expression_NOTKeyword_0_q(semanticObject, transition, fromNode, toNode);
		else if(match_Expression_neg_expr_NOTKeyword_0_q_HyphenMinusKeyword_0_a.equals(transition.getAmbiguousSyntax()))
			emit_Expression_neg_expr_NOTKeyword_0_q_HyphenMinusKeyword_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_ForeachStatement_Statement_SemicolonKeyword_4_0_1_q_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_ForeachStatement_Statement_SemicolonKeyword_4_0_1_q_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_GroupByStatement_Statement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q_Partition_clauseParserRuleCall_6_q_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_GroupByStatement_Statement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q_Partition_clauseParserRuleCall_6_q_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_GroupByStatement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q.equals(transition.getAmbiguousSyntax()))
			emit_GroupByStatement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q(semanticObject, transition, fromNode, toNode);
		else if(match_JoinStatement_Statement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_JoinStatement_Statement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_JoinStatement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q.equals(transition.getAmbiguousSyntax()))
			emit_JoinStatement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q(semanticObject, transition, fromNode, toNode);
		else if(match_LoadStatement_LoadUsingParserRuleCall_4_q.equals(transition.getAmbiguousSyntax()))
			emit_LoadStatement_LoadUsingParserRuleCall_4_q(semanticObject, transition, fromNode, toNode);
		else if(match_LoadStatement_LoadUsingParserRuleCall_4_q_AsClauseParserRuleCall_5_q.equals(transition.getAmbiguousSyntax()))
			emit_LoadStatement_LoadUsingParserRuleCall_4_q_AsClauseParserRuleCall_5_q(semanticObject, transition, fromNode, toNode);
		else if(match_MrStatement_EXECCOMMANDTerminalRuleCall_6_q.equals(transition.getAmbiguousSyntax()))
			emit_MrStatement_EXECCOMMANDTerminalRuleCall_6_q(semanticObject, transition, fromNode, toNode);
		else if(match_OrderStatement_Statement___USINGKeyword_6_0_FuncClauseParserRuleCall_6_1__q_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_OrderStatement_Statement___USINGKeyword_6_0_FuncClauseParserRuleCall_6_1__q_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_Statement_ParallelClauseParserRuleCall_0_0_2_1_q.equals(transition.getAmbiguousSyntax()))
			emit_Statement_ParallelClauseParserRuleCall_0_0_2_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_StoreStatement___USINGKeyword_4_0_FuncClauseParserRuleCall_4_1__q.equals(transition.getAmbiguousSyntax()))
			emit_StoreStatement___USINGKeyword_4_0_FuncClauseParserRuleCall_4_1__q(semanticObject, transition, fromNode, toNode);
		else if(match_TE_NOTKeyword_1_1_q.equals(transition.getAmbiguousSyntax()))
			emit_TE_NOTKeyword_1_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_a.equals(transition.getAmbiguousSyntax()))
			emit_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_p.equals(transition.getAmbiguousSyntax()))
			emit_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_TE___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q.equals(transition.getAmbiguousSyntax()))
			emit_TE___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q(semanticObject, transition, fromNode, toNode);
		else if(match_UnaryCondition_RightParenthesisKeyword_0_3_a.equals(transition.getAmbiguousSyntax()))
			emit_UnaryCondition_RightParenthesisKeyword_0_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_UnaryCondition_RightParenthesisKeyword_0_3_p.equals(transition.getAmbiguousSyntax()))
			emit_UnaryCondition_RightParenthesisKeyword_0_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_group_item___INNERKeyword_1_0_or_OUTERKeyword_1_1__q.equals(transition.getAmbiguousSyntax()))
			emit_group_item___INNERKeyword_1_0_or_OUTERKeyword_1_1__q(semanticObject, transition, fromNode, toNode);
		else if(match_neg_expr_HyphenMinusKeyword_0_a.equals(transition.getAmbiguousSyntax()))
			emit_neg_expr_HyphenMinusKeyword_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_neg_expr_HyphenMinusKeyword_0_p.equals(transition.getAmbiguousSyntax()))
			emit_neg_expr_HyphenMinusKeyword_0_p(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     ('USING' COGROUP_TYPE)? partition_clause? ParallelClause?
	 */
	protected void emit_CoGroupByStatement_Statement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('USING' COGROUP_TYPE)?
	 */
	protected void emit_CoGroupByStatement___USINGKeyword_4_0_COGROUP_TYPETerminalRuleCall_4_1__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+ '('
	 */
	protected void emit_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '('+ (('(' Type ')') '('+)*
	 */
	protected void emit_Condition_UnaryCondition_LeftParenthesisKeyword_0_0_p_____LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2___LeftParenthesisKeyword_0_0_p__a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('('+ '(' Type ')')+
	 */
	protected void emit_Condition_UnaryCondition___LeftParenthesisKeyword_0_0_p_LeftParenthesisKeyword_0_0_TypeParserRuleCall_0_1_RightParenthesisKeyword_0_2__p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     partition_clause? ParallelClause?
	 */
	protected void emit_CrossStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     partition_clause? ParallelClause?
	 */
	protected void emit_DistinctStatement_Statement_Partition_clauseParserRuleCall_4_q_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     'NOT'?
	 */
	protected void emit_Expression_NOTKeyword_0_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     'NOT'? '-'*
	 */
	protected void emit_Expression_neg_expr_NOTKeyword_0_q_HyphenMinusKeyword_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ';'? ParallelClause?
	 */
	protected void emit_ForeachStatement_Statement_SemicolonKeyword_4_0_1_q_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('USING' group_type)? partition_clause? ParallelClause?
	 */
	protected void emit_GroupByStatement_Statement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q_Partition_clauseParserRuleCall_6_q_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('USING' group_type)?
	 */
	protected void emit_GroupByStatement___USINGKeyword_5_0_Group_typeParserRuleCall_5_1__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('USING' join_type)? partition_clause? ParallelClause?
	 */
	protected void emit_JoinStatement_Statement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q_Partition_clauseParserRuleCall_5_q_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('USING' join_type)?
	 */
	protected void emit_JoinStatement___USINGKeyword_4_0_Join_typeParserRuleCall_4_1__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     LoadUsing?
	 */
	protected void emit_LoadStatement_LoadUsingParserRuleCall_4_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     LoadUsing? AsClause?
	 */
	protected void emit_LoadStatement_LoadUsingParserRuleCall_4_q_AsClauseParserRuleCall_5_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     EXECCOMMAND?
	 */
	protected void emit_MrStatement_EXECCOMMANDTerminalRuleCall_6_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('USING' FuncClause)? ParallelClause?
	 */
	protected void emit_OrderStatement_Statement___USINGKeyword_6_0_FuncClauseParserRuleCall_6_1__q_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ParallelClause?
	 */
	protected void emit_Statement_ParallelClauseParserRuleCall_0_0_2_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('USING' FuncClause)?
	 */
	protected void emit_StoreStatement___USINGKeyword_4_0_FuncClauseParserRuleCall_4_1__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     'NOT'?
	 */
	protected void emit_TE_NOTKeyword_1_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('IS' 'NOT'? 'NULL')? ')'*
	 */
	protected void emit_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('IS' 'NOT'? 'NULL')? ')'+
	 */
	protected void emit_TE_UnaryCondition___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q_RightParenthesisKeyword_0_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('IS' 'NOT'? 'NULL')?
	 */
	protected void emit_TE___ISKeyword_1_0_NOTKeyword_1_1_q_NULLKeyword_1_2__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ')'*
	 */
	protected void emit_UnaryCondition_RightParenthesisKeyword_0_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ')'+
	 */
	protected void emit_UnaryCondition_RightParenthesisKeyword_0_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ('INNER' | 'OUTER')?
	 */
	protected void emit_group_item___INNERKeyword_1_0_or_OUTERKeyword_1_1__q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '-'*
	 */
	protected void emit_neg_expr_HyphenMinusKeyword_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     '-'+
	 */
	protected void emit_neg_expr_HyphenMinusKeyword_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
