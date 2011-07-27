package org.apache.pigeditor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.apache.pigeditor.pig.AliasType;
import org.apache.pigeditor.pig.AndCondition;
import org.apache.pigeditor.pig.CoGroupByStatement;
import org.apache.pigeditor.pig.CrossStatement;
import org.apache.pigeditor.pig.DeclareClause;
import org.apache.pigeditor.pig.DefaultClause;
import org.apache.pigeditor.pig.DefineClause;
import org.apache.pigeditor.pig.DescribeStatement;
import org.apache.pigeditor.pig.DistinctStatement;
import org.apache.pigeditor.pig.DumpStatement;
import org.apache.pigeditor.pig.ExplainStatement;
import org.apache.pigeditor.pig.Expression;
import org.apache.pigeditor.pig.FilterStatement;
import org.apache.pigeditor.pig.ForeachStatement;
import org.apache.pigeditor.pig.GroupByStatement;
import org.apache.pigeditor.pig.JoinStatement;
import org.apache.pigeditor.pig.LimitStatement;
import org.apache.pigeditor.pig.LoadStatement;
import org.apache.pigeditor.pig.NestedFilter;
import org.apache.pigeditor.pig.OrCondition;
import org.apache.pigeditor.pig.OrderStatement;
import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.Query;
import org.apache.pigeditor.pig.SampleStatement;
import org.apache.pigeditor.pig.SplitStatement;
import org.apache.pigeditor.pig.StoreStatement;
import org.apache.pigeditor.pig.StreamStatement;
import org.apache.pigeditor.pig.UnaryCondition;
import org.apache.pigeditor.pig.UnionStatement;
import org.apache.pigeditor.pig.func_eval;
import org.apache.pigeditor.pig.generate_clause;
import org.apache.pigeditor.pig.join_group_by_expr_list;
import org.apache.pigeditor.pig.join_item;
import org.apache.pigeditor.pig.nested_command_list;
import org.apache.pigeditor.pig.projectable_expr;
import org.apache.pigeditor.pig.real_arg_list;
import org.apache.pigeditor.pig.rel_list;
import org.apache.pigeditor.services.PigGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractPigSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected PigGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PigPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PigPackage.ALIAS_TYPE:
				if(context == grammarAccess.getAliasTypeRule()) {
					sequence_AliasType_AliasType(context, (AliasType) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.AND_CONDITION:
				if(context == grammarAccess.getUnaryConditionRule() ||
				   context == grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_0_4_0()) {
					sequence_AndCondition_AndCondition(context, (AndCondition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getOrConditionRule() ||
				   context == grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0() ||
				   context == grammarAccess.getAndConditionRule() ||
				   context == grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0() ||
				   context == grammarAccess.getReal_argRule() ||
				   context == grammarAccess.getFlattenGeneratedItemRule() ||
				   context == grammarAccess.getSplit_branchRule()) {
					sequence_AndCondition_AndCondition(context, (AndCondition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBin_exprRule()) {
					sequence_bin_expr_AndCondition(context, (AndCondition) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.CO_GROUP_BY_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getCoGroupByStatementRule()) {
					sequence_CoGroupByStatement_CoGroupByStatement(context, (CoGroupByStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.CROSS_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getCrossStatementRule()) {
					sequence_CrossStatement_CrossStatement(context, (CrossStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.DECLARE_CLAUSE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getDeclareClauseRule()) {
					sequence_DeclareClause_DeclareClause(context, (DeclareClause) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.DEFAULT_CLAUSE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getDefineStatementRule() ||
				   context == grammarAccess.getDefaultClauseRule()) {
					sequence_DefaultClause_DefaultClause(context, (DefaultClause) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.DEFINE_CLAUSE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getDefineStatementRule() ||
				   context == grammarAccess.getDefineClauseRule()) {
					sequence_DefineClause_DefineClause(context, (DefineClause) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.DESCRIBE_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getDescribeStatementRule()) {
					sequence_DescribeStatement_DescribeStatement(context, (DescribeStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.DISTINCT_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getDistinctStatementRule()) {
					sequence_DistinctStatement_DistinctStatement(context, (DistinctStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.DUMP_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getDumpStatementRule()) {
					sequence_DumpStatement_DumpStatement(context, (DumpStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.EXPLAIN_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getExplainStatementRule()) {
					sequence_ExplainStatement_ExplainStatement(context, (ExplainStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.EXPRESSION:
				if(context == grammarAccess.getJoin_group_by_expr_listRule()) {
					sequence_join_group_by_expr_list_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.FILTER_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getFilterStatementRule()) {
					sequence_FilterStatement_FilterStatement(context, (FilterStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.FOREACH_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getForeachStatementRule()) {
					sequence_ForeachStatement_ForeachStatement(context, (ForeachStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.GROUP_BY_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getGroupByStatementRule()) {
					sequence_GroupByStatement_GroupByStatement(context, (GroupByStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.JOIN_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getJoinStatementRule()) {
					sequence_JoinStatement_JoinStatement(context, (JoinStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.LIMIT_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getLimitStatementRule()) {
					sequence_LimitStatement_LimitStatement(context, (LimitStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.LOAD_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getLoadStatementRule()) {
					sequence_LoadStatement_LoadStatement(context, (LoadStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.NESTED_FILTER:
				if(context == grammarAccess.getNested_commandRule() ||
				   context == grammarAccess.getNested_opRule() ||
				   context == grammarAccess.getNestedFilterRule()) {
					sequence_NestedFilter_NestedFilter(context, (NestedFilter) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.OR_CONDITION:
				if(context == grammarAccess.getBin_exprRule()) {
					sequence_bin_expr_OrCondition(context, (OrCondition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAndConditionRule() ||
				   context == grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryConditionRule() ||
				   context == grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_0_4_0()) {
					sequence_OrCondition_OrCondition(context, (OrCondition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getOrConditionRule() ||
				   context == grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0() ||
				   context == grammarAccess.getReal_argRule() ||
				   context == grammarAccess.getFlattenGeneratedItemRule() ||
				   context == grammarAccess.getSplit_branchRule()) {
					sequence_OrCondition_OrCondition(context, (OrCondition) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.ORDER_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getOrderStatementRule()) {
					sequence_OrderStatement_OrderStatement(context, (OrderStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.QUERY:
				if(context == grammarAccess.getQueryRule()) {
					sequence_Query_Query(context, (Query) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.SAMPLE_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSampleStatementRule()) {
					sequence_SampleStatement_SampleStatement(context, (SampleStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.SPLIT_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getSplitStatementRule()) {
					sequence_SplitStatement_SplitStatement(context, (SplitStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.STORE_STATEMENT:
				if(context == grammarAccess.getStoreStatementRule()) {
					sequence_StoreStatement_StoreStatement(context, (StoreStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getMrStatementRule()) {
					sequence_MrStatement_StoreStatement(context, (StoreStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.STREAM_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStreamStatementRule()) {
					sequence_StreamStatement_StreamStatement(context, (StreamStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.UNARY_CONDITION:
				if(context == grammarAccess.getBin_exprRule()) {
					sequence_bin_expr_UnaryCondition(context, (UnaryCondition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_0_4_0()) {
					sequence_UnaryCondition_UnaryCondition_0_4_0_UnaryCondition(context, (UnaryCondition) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getOrConditionRule() ||
				   context == grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0() ||
				   context == grammarAccess.getAndConditionRule() ||
				   context == grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryConditionRule() ||
				   context == grammarAccess.getReal_argRule() ||
				   context == grammarAccess.getFlattenGeneratedItemRule() ||
				   context == grammarAccess.getSplit_branchRule()) {
					sequence_UnaryCondition_UnaryCondition(context, (UnaryCondition) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.UNION_STATEMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getUnionStatementRule()) {
					sequence_UnionStatement_UnionStatement(context, (UnionStatement) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.FUNC_EVAL:
				if(context == grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_0_4_0()) {
					sequence_AddExpression_func_eval(context, (func_eval) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConditionRule() ||
				   context == grammarAccess.getOrConditionRule() ||
				   context == grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0() ||
				   context == grammarAccess.getAndConditionRule() ||
				   context == grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryConditionRule() ||
				   context == grammarAccess.getUnaryConditionAccess().getUnaryConditionLeftAction_1_1_0() ||
				   context == grammarAccess.getTERule() ||
				   context == grammarAccess.getReal_argRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getFlattenGeneratedItemRule() ||
				   context == grammarAccess.getGroup_itemRule() ||
				   context == grammarAccess.getJoin_group_by_clauseRule() ||
				   context == grammarAccess.getJoin_group_by_expr_listRule() ||
				   context == grammarAccess.getJoin_group_by_exprRule() ||
				   context == grammarAccess.getSplit_branchRule()) {
					sequence_AddExpression_func_eval(context, (func_eval) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMulti_exprRule()) {
					sequence_multi_expr_func_eval(context, (func_eval) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBin_exprRule()) {
					sequence_bin_expr_func_eval(context, (func_eval) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGroup_item_listRule()) {
					sequence_group_item_list_func_eval(context, (func_eval) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunc_evalRule() ||
				   context == grammarAccess.getCast_exprRule() ||
				   context == grammarAccess.getUnary_exprRule() ||
				   context == grammarAccess.getExpr_evalRule() ||
				   context == grammarAccess.getVar_exprRule() ||
				   context == grammarAccess.getProjectable_exprRule() ||
				   context == grammarAccess.getNeg_exprRule() ||
				   context == grammarAccess.getNested_commandRule() ||
				   context == grammarAccess.getNested_opRule() ||
				   context == grammarAccess.getNested_sortRule() ||
				   context == grammarAccess.getNested_distinctRule() ||
				   context == grammarAccess.getNested_limitRule()) {
					sequence_func_eval_func_eval(context, (func_eval) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.GENERATE_CLAUSE:
				if(context == grammarAccess.getGenerate_clauseRule()) {
					sequence_generate_clause_generate_clause(context, (generate_clause) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.JOIN_GROUP_BY_EXPR_LIST:
				if(context == grammarAccess.getGroup_item_listRule()) {
					sequence_group_item_list_join_group_by_expr_list(context, (join_group_by_expr_list) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGroup_itemRule() ||
				   context == grammarAccess.getJoin_group_by_clauseRule() ||
				   context == grammarAccess.getJoin_group_by_expr_listRule()) {
					sequence_join_group_by_expr_list_join_group_by_expr_list(context, (join_group_by_expr_list) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.JOIN_ITEM:
				if(context == grammarAccess.getJoin_sub_clauseRule()) {
					sequence_join_sub_clause_join_item(context, (join_item) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJoin_itemRule()) {
					sequence_join_item_join_item(context, (join_item) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.NESTED_COMMAND_LIST:
				if(context == grammarAccess.getNested_blkRule()) {
					sequence_nested_blk_nested_command_list(context, (nested_command_list) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNested_command_listRule()) {
					sequence_nested_command_list_nested_command_list(context, (nested_command_list) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.PROJECTABLE_EXPR:
				if(context == grammarAccess.getJoin_group_by_expr_listRule()) {
					sequence_join_group_by_expr_list_projectable_expr(context, (projectable_expr) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.REAL_ARG_LIST:
				if(context == grammarAccess.getReal_arg_listRule()) {
					sequence_real_arg_list_real_arg_list(context, (real_arg_list) semanticObject); 
					return; 
				}
				else break;
			case PigPackage.REL_LIST:
				if(context == grammarAccess.getRel_listRule()) {
					sequence_rel_list_rel_list(context, (rel_list) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (arg_list=real_arg_list? mul_cast=cast_expr* mul_exp=multi_expr*)
	 *
	 * Features:
	 *    mul_exp[0, *]
	 *    mul_cast[0, *]
	 *    arg_list[0, 1]
	 */
	protected void sequence_AddExpression_func_eval(EObject context, func_eval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     referenced=[Statement|ID]
	 *
	 * Features:
	 *    referenced[1, 1]
	 */
	protected void sequence_AliasType_AliasType(EObject context, AliasType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.ALIAS_TYPE__REFERENCED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.ALIAS_TYPE__REFERENCED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasTypeAccess().getReferencedStatementIDTerminalRuleCall_0_1(), semanticObject.getReferenced());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndCondition_AndCondition_1_0 right=UnaryCondition)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_AndCondition_AndCondition(EObject context, AndCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias aliases=join_sub_clause)
	 *
	 * Features:
	 *    name[1, 1]
	 *    aliases[1, 1]
	 */
	protected void sequence_CoGroupByStatement_CoGroupByStatement(EObject context, CoGroupByStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CO_GROUP_BY_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CO_GROUP_BY_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CO_GROUP_BY_STATEMENT__ALIASES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CO_GROUP_BY_STATEMENT__ALIASES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCoGroupByStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCoGroupByStatementAccess().getAliasesJoin_sub_clauseParserRuleCall_3_0(), semanticObject.getAliases());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias aliases=rel_list)
	 *
	 * Features:
	 *    name[1, 1]
	 *    aliases[1, 1]
	 */
	protected void sequence_CrossStatement_CrossStatement(EObject context, CrossStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CROSS_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CROSS_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CROSS_STATEMENT__ALIASES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CROSS_STATEMENT__ALIASES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCrossStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getCrossStatementAccess().getAliasesRel_listParserRuleCall_3_0(), semanticObject.getAliases());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Alias
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_DeclareClause_DeclareClause(EObject context, DeclareClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.DECLARE_CLAUSE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.DECLARE_CLAUSE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDeclareClauseAccess().getNameAliasParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Alias
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_DefaultClause_DefaultClause(EObject context, DefaultClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.DEFINE_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.DEFINE_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultClauseAccess().getNameAliasParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Alias
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_DefineClause_DefineClause(EObject context, DefineClause semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.DEFINE_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.DEFINE_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefineClauseAccess().getNameAliasParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=AliasType
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_DescribeStatement_DescribeStatement(EObject context, DescribeStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.DESCRIBE_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.DESCRIBE_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDescribeStatementAccess().getTypeAliasTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_DistinctStatement_DistinctStatement(EObject context, DistinctStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.DISTINCT_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.DISTINCT_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.DISTINCT_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.DISTINCT_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDistinctStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDistinctStatementAccess().getTypeAliasTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=AliasType
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_DumpStatement_DumpStatement(EObject context, DumpStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.DUMP_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.DUMP_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDumpStatementAccess().getTypeAliasTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=AliasType
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_ExplainStatement_ExplainStatement(EObject context, ExplainStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.EXPLAIN_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.EXPLAIN_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExplainStatementAccess().getTypeAliasTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType cond=Condition)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    cond[1, 1]
	 */
	protected void sequence_FilterStatement_FilterStatement(EObject context, FilterStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.FILTER_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.FILTER_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.FILTER_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.FILTER_STATEMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.FILTER_STATEMENT__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.FILTER_STATEMENT__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFilterStatementAccess().getTypeAliasTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getFilterStatementAccess().getCondConditionParserRuleCall_5_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType (items+=nested_blk | items+=generate_clause))
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    items[0, 2]
	 */
	protected void sequence_ForeachStatement_ForeachStatement(EObject context, ForeachStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType items=group_item_list)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    items[1, 1]
	 */
	protected void sequence_GroupByStatement_GroupByStatement(EObject context, GroupByStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.GROUP_BY_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.GROUP_BY_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.GROUP_BY_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.GROUP_BY_STATEMENT__TYPE));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.GROUP_BY_STATEMENT__ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.GROUP_BY_STATEMENT__ITEMS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGroupByStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGroupByStatementAccess().getTypeAliasTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getGroupByStatementAccess().getItemsGroup_item_listParserRuleCall_4_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias aliases=join_sub_clause)
	 *
	 * Features:
	 *    name[1, 1]
	 *    aliases[1, 1]
	 */
	protected void sequence_JoinStatement_JoinStatement(EObject context, JoinStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.JOIN_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.JOIN_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.JOIN_STATEMENT__ALIASES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.JOIN_STATEMENT__ALIASES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJoinStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getJoinStatementAccess().getAliasesJoin_sub_clauseParserRuleCall_3_0(), semanticObject.getAliases());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_LimitStatement_LimitStatement(EObject context, LimitStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.LIMIT_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.LIMIT_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.LIMIT_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.LIMIT_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLimitStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLimitStatementAccess().getTypeAliasTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Alias
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_LoadStatement_LoadStatement(EObject context, LoadStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.LOAD_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.LOAD_STATEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoadStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType load=LoadStatement)
	 *
	 * Features:
	 *    name[1, 1]
	 *    load[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_MrStatement_StoreStatement(EObject context, StoreStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.MR_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.MR_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.STORE_STATEMENT__LOAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.STORE_STATEMENT__LOAD));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.STORE_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.STORE_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMrStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStoreStatementAccess().getTypeAliasTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getMrStatementAccess().getLoadLoadStatementParserRuleCall_5_0(), semanticObject.getLoad());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (exp=var_expr cond=Condition)
	 *
	 * Features:
	 *    exp[1, 1]
	 *    cond[1, 1]
	 */
	protected void sequence_NestedFilter_NestedFilter(EObject context, NestedFilter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.NESTED_FILTER__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.NESTED_FILTER__EXP));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.NESTED_FILTER__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.NESTED_FILTER__COND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNestedFilterAccess().getExpVar_exprParserRuleCall_1_0(), semanticObject.getExp());
		feeder.accept(grammarAccess.getNestedFilterAccess().getCondConditionParserRuleCall_3_0(), semanticObject.getCond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrCondition_OrCondition_1_0 right=AndCondition)
	 *
	 * Features:
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_OrCondition_OrCondition(EObject context, OrCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_OrderStatement_OrderStatement(EObject context, OrderStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.ORDER_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.ORDER_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.ORDER_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.ORDER_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrderStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOrderStatementAccess().getTypeAliasTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Statement*
	 *
	 * Features:
	 *    elements[0, *]
	 */
	protected void sequence_Query_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_SampleStatement_SampleStatement(EObject context, SampleStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.SAMPLE_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.SAMPLE_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.SAMPLE_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.SAMPLE_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSampleStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSampleStatementAccess().getTypeAliasTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType branches+=split_branch branches+=split_branch+)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    branches[2, *]
	 */
	protected void sequence_SplitStatement_SplitStatement(EObject context, SplitStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=AliasType
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_StoreStatement_StoreStatement(EObject context, StoreStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias type=AliasType)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_StreamStatement_StreamStatement(EObject context, StreamStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.STREAM_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.STREAM_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.STREAM_STATEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.STREAM_STATEMENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStreamStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStreamStatementAccess().getTypeAliasTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((left=UnaryCondition_UnaryCondition_0_4_0 right=Condition) | (left=UnaryCondition_UnaryCondition_1_1_0 right=TE))
	 *
	 * Features:
	 *    left[2, 2]
	 *    right[2, 2]
	 */
	protected void sequence_UnaryCondition_UnaryCondition(EObject context, UnaryCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((left=UnaryCondition_UnaryCondition_0_4_0 right=Condition) | (left=UnaryCondition_UnaryCondition_1_1_0 right=TE)) 
	 *         (leftExp=Condition rightExp=Condition)?
	 *     )
	 *
	 * Features:
	 *    leftExp[0, 1]
	 *         EXCLUDE_IF_UNSET rightExp
	 *         MANDATORY_IF_SET rightExp
	 *    rightExp[0, 1]
	 *         EXCLUDE_IF_UNSET leftExp
	 *         MANDATORY_IF_SET leftExp
	 *    left[2, 2]
	 *    right[2, 2]
	 */
	protected void sequence_UnaryCondition_UnaryCondition_0_4_0_UnaryCondition(EObject context, UnaryCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Alias aliases=rel_list)
	 *
	 * Features:
	 *    name[1, 1]
	 *    aliases[1, 1]
	 */
	protected void sequence_UnionStatement_UnionStatement(EObject context, UnionStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.UNION_STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.UNION_STATEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.UNION_STATEMENT__ALIASES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.UNION_STATEMENT__ALIASES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnionStatementAccess().getNameAliasParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUnionStatementAccess().getAliasesRel_listParserRuleCall_4_0(), semanticObject.getAliases());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AndCondition_AndCondition_1_0 right=UnaryCondition leftExp=Expression rightExp=Expression)
	 *
	 * Features:
	 *    leftExp[1, 1]
	 *    rightExp[1, 1]
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_bin_expr_AndCondition(EObject context, AndCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CONDITION__LEFT_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CONDITION__LEFT_EXP));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CONDITION__RIGHT_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CONDITION__RIGHT_EXP));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.AND_CONDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.AND_CONDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.AND_CONDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.AND_CONDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndConditionAccess().getRightUnaryConditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.accept(grammarAccess.getBin_exprAccess().getLeftExpExpressionParserRuleCall_3_0(), semanticObject.getLeftExp());
		feeder.accept(grammarAccess.getBin_exprAccess().getRightExpExpressionParserRuleCall_5_0(), semanticObject.getRightExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrCondition_OrCondition_1_0 right=AndCondition leftExp=Expression rightExp=Expression)
	 *
	 * Features:
	 *    leftExp[1, 1]
	 *    rightExp[1, 1]
	 *    left[1, 1]
	 *    right[1, 1]
	 */
	protected void sequence_bin_expr_OrCondition(EObject context, OrCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CONDITION__LEFT_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CONDITION__LEFT_EXP));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.CONDITION__RIGHT_EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.CONDITION__RIGHT_EXP));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.OR_CONDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.OR_CONDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, PigPackage.Literals.OR_CONDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PigPackage.Literals.OR_CONDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.accept(grammarAccess.getBin_exprAccess().getLeftExpExpressionParserRuleCall_3_0(), semanticObject.getLeftExp());
		feeder.accept(grammarAccess.getBin_exprAccess().getRightExpExpressionParserRuleCall_5_0(), semanticObject.getRightExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((left=UnaryCondition_UnaryCondition_0_4_0 right=Condition) | (left=UnaryCondition_UnaryCondition_1_1_0 right=TE)) 
	 *         leftExp=Expression 
	 *         rightExp=Expression
	 *     )
	 *
	 * Features:
	 *    leftExp[1, 1]
	 *    rightExp[1, 1]
	 *    left[2, 2]
	 *    right[2, 2]
	 */
	protected void sequence_bin_expr_UnaryCondition(EObject context, UnaryCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg_list=real_arg_list? mul_cast=cast_expr* mul_exp=multi_expr* leftExp=Expression rightExp=Expression)
	 *
	 * Features:
	 *    leftExp[1, 1]
	 *    rightExp[1, 1]
	 *    mul_exp[0, *]
	 *    mul_cast[0, *]
	 *    arg_list[0, 1]
	 */
	protected void sequence_bin_expr_func_eval(EObject context, func_eval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg_list=real_arg_list?)
	 *
	 * Features:
	 *    arg_list[0, 1]
	 */
	protected void sequence_func_eval_func_eval(EObject context, func_eval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=FlattenGeneratedItem items+=FlattenGeneratedItem*)
	 *
	 * Features:
	 *    items[1, *]
	 */
	protected void sequence_generate_clause_generate_clause(EObject context, generate_clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg_list=real_arg_list? mul_cast=cast_expr* mul_exp=multi_expr* items=group_item*)
	 *
	 * Features:
	 *    items[0, *]
	 *    mul_exp[0, *]
	 *    mul_cast[0, *]
	 *    arg_list[0, 1]
	 */
	protected void sequence_group_item_list_func_eval(EObject context, func_eval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=join_group_by_expr expressions=join_group_by_expr* items=group_item*)
	 *
	 * Features:
	 *    items[0, *]
	 *    left[1, 1]
	 *    expressions[0, *]
	 */
	protected void sequence_group_item_list_join_group_by_expr_list(EObject context, join_group_by_expr_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=join_group_by_expr expressions=join_group_by_expr*)
	 *
	 * Features:
	 *    left[1, 1]
	 *    expressions[0, *]
	 */
	protected void sequence_join_group_by_expr_list_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=join_group_by_expr expressions=join_group_by_expr*)
	 *
	 * Features:
	 *    left[1, 1]
	 *    expressions[0, *]
	 */
	protected void sequence_join_group_by_expr_list_join_group_by_expr_list(EObject context, join_group_by_expr_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=join_group_by_expr expressions=join_group_by_expr*)
	 *
	 * Features:
	 *    left[1, 1]
	 *    expressions[0, *]
	 */
	protected void sequence_join_group_by_expr_list_projectable_expr(EObject context, projectable_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AliasType expressions=join_group_by_clause)
	 *
	 * Features:
	 *    type[1, 1]
	 *    expressions[1, 1]
	 */
	protected void sequence_join_item_join_item(EObject context, join_item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AliasType expressions=join_group_by_clause others=join_item+)
	 *
	 * Features:
	 *    others[1, *]
	 *    type[1, 1]
	 *    expressions[1, 1]
	 */
	protected void sequence_join_sub_clause_join_item(EObject context, join_item semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg_list=real_arg_list? mul_cast=cast_expr*)
	 *
	 * Features:
	 *    mul_cast[0, *]
	 *    arg_list[0, 1]
	 */
	protected void sequence_multi_expr_func_eval(EObject context, func_eval semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cmds+=nested_command* clauses=generate_clause)
	 *
	 * Features:
	 *    clauses[1, 1]
	 *    cmds[0, *]
	 */
	protected void sequence_nested_blk_nested_command_list(EObject context, nested_command_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cmds+=nested_command*)
	 *
	 * Features:
	 *    cmds[0, *]
	 */
	protected void sequence_nested_command_list_nested_command_list(EObject context, nested_command_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (args+=real_arg args+=real_arg*)
	 *
	 * Features:
	 *    args[1, *]
	 */
	protected void sequence_real_arg_list_real_arg_list(EObject context, real_arg_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=AliasType type=AliasType*)
	 *
	 * Features:
	 *    type[1, *]
	 */
	protected void sequence_rel_list_rel_list(EObject context, rel_list semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
