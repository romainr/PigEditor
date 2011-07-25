/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PigFactoryImpl extends EFactoryImpl implements PigFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PigFactory init()
  {
    try
    {
      PigFactory thePigFactory = (PigFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.apache.org/pigeditor/Pig"); 
      if (thePigFactory != null)
      {
        return thePigFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PigFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PigFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PigPackage.QUERY: return createQuery();
      case PigPackage.STATEMENT: return createStatement();
      case PigPackage.DEFINE_STATEMENT: return createDefineStatement();
      case PigPackage.LOAD_STATEMENT: return createLoadStatement();
      case PigPackage.FOREACH_STATEMENT: return createForeachStatement();
      case PigPackage.FILTER_STATEMENT: return createFilterStatement();
      case PigPackage.GROUP_BY_STATEMENT: return createGroupByStatement();
      case PigPackage.CO_GROUP_BY_STATEMENT: return createCoGroupByStatement();
      case PigPackage.ORDER_STATEMENT: return createOrderStatement();
      case PigPackage.CROSS_STATEMENT: return createCrossStatement();
      case PigPackage.UNION_STATEMENT: return createUnionStatement();
      case PigPackage.JOIN_STATEMENT: return createJoinStatement();
      case PigPackage.LIMIT_STATEMENT: return createLimitStatement();
      case PigPackage.SAMPLE_STATEMENT: return createSampleStatement();
      case PigPackage.DISTINCT_STATEMENT: return createDistinctStatement();
      case PigPackage.STREAM_STATEMENT: return createStreamStatement();
      case PigPackage.MR_STATEMENT: return createMrStatement();
      case PigPackage.SPLIT_STATEMENT: return createSplitStatement();
      case PigPackage.STORE_STATEMENT: return createStoreStatement();
      case PigPackage.DESCRIBE_STATEMENT: return createDescribeStatement();
      case PigPackage.EXPLAIN_STATEMENT: return createExplainStatement();
      case PigPackage.DUMP_STATEMENT: return createDumpStatement();
      case PigPackage.CONDITION: return createCondition();
      case PigPackage.FUNC_EVAL: return createfunc_eval();
      case PigPackage.REAL_ARG_LIST: return createreal_arg_list();
      case PigPackage.REAL_ARG: return createreal_arg();
      case PigPackage.EXPRESSION: return createExpression();
      case PigPackage.VAR_EXPR: return createvar_expr();
      case PigPackage.PROJECTABLE_EXPR: return createprojectable_expr();
      case PigPackage.BIN_EXPR: return createbin_expr();
      case PigPackage.ALIAS_TYPE: return createAliasType();
      case PigPackage.FLATTEN_GENERATED_ITEM: return createFlattenGeneratedItem();
      case PigPackage.DEFAULT_CLAUSE: return createDefaultClause();
      case PigPackage.DECLARE_CLAUSE: return createDeclareClause();
      case PigPackage.DEFINE_CLAUSE: return createDefineClause();
      case PigPackage.GROUP_ITEM_LIST: return creategroup_item_list();
      case PigPackage.REL_LIST: return createrel_list();
      case PigPackage.JOIN_SUB_CLAUSE: return createjoin_sub_clause();
      case PigPackage.JOIN_ITEM: return createjoin_item();
      case PigPackage.GROUP_ITEM: return creategroup_item();
      case PigPackage.JOIN_GROUP_BY_CLAUSE: return createjoin_group_by_clause();
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST: return createjoin_group_by_expr_list();
      case PigPackage.JOIN_GROUP_BY_EXPR: return createjoin_group_by_expr();
      case PigPackage.NESTED_BLK: return createnested_blk();
      case PigPackage.GENERATE_CLAUSE: return creategenerate_clause();
      case PigPackage.NESTED_COMMAND_LIST: return createnested_command_list();
      case PigPackage.NESTED_COMMAND: return createnested_command();
      case PigPackage.NESTED_OP: return createnested_op();
      case PigPackage.NESTED_FILTER: return createNestedFilter();
      case PigPackage.NESTED_SORT: return createnested_sort();
      case PigPackage.NESTED_DISTINCT: return createnested_distinct();
      case PigPackage.NESTED_LIMIT: return createnested_limit();
      case PigPackage.SPLIT_BRANCH: return createsplit_branch();
      case PigPackage.OR_CONDITION: return createOrCondition();
      case PigPackage.AND_CONDITION: return createAndCondition();
      case PigPackage.UNARY_CONDITION: return createUnaryCondition();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefineStatement createDefineStatement()
  {
    DefineStatementImpl defineStatement = new DefineStatementImpl();
    return defineStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadStatement createLoadStatement()
  {
    LoadStatementImpl loadStatement = new LoadStatementImpl();
    return loadStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeachStatement createForeachStatement()
  {
    ForeachStatementImpl foreachStatement = new ForeachStatementImpl();
    return foreachStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterStatement createFilterStatement()
  {
    FilterStatementImpl filterStatement = new FilterStatementImpl();
    return filterStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupByStatement createGroupByStatement()
  {
    GroupByStatementImpl groupByStatement = new GroupByStatementImpl();
    return groupByStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoGroupByStatement createCoGroupByStatement()
  {
    CoGroupByStatementImpl coGroupByStatement = new CoGroupByStatementImpl();
    return coGroupByStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderStatement createOrderStatement()
  {
    OrderStatementImpl orderStatement = new OrderStatementImpl();
    return orderStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CrossStatement createCrossStatement()
  {
    CrossStatementImpl crossStatement = new CrossStatementImpl();
    return crossStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnionStatement createUnionStatement()
  {
    UnionStatementImpl unionStatement = new UnionStatementImpl();
    return unionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinStatement createJoinStatement()
  {
    JoinStatementImpl joinStatement = new JoinStatementImpl();
    return joinStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LimitStatement createLimitStatement()
  {
    LimitStatementImpl limitStatement = new LimitStatementImpl();
    return limitStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SampleStatement createSampleStatement()
  {
    SampleStatementImpl sampleStatement = new SampleStatementImpl();
    return sampleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistinctStatement createDistinctStatement()
  {
    DistinctStatementImpl distinctStatement = new DistinctStatementImpl();
    return distinctStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StreamStatement createStreamStatement()
  {
    StreamStatementImpl streamStatement = new StreamStatementImpl();
    return streamStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MrStatement createMrStatement()
  {
    MrStatementImpl mrStatement = new MrStatementImpl();
    return mrStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SplitStatement createSplitStatement()
  {
    SplitStatementImpl splitStatement = new SplitStatementImpl();
    return splitStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StoreStatement createStoreStatement()
  {
    StoreStatementImpl storeStatement = new StoreStatementImpl();
    return storeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescribeStatement createDescribeStatement()
  {
    DescribeStatementImpl describeStatement = new DescribeStatementImpl();
    return describeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplainStatement createExplainStatement()
  {
    ExplainStatementImpl explainStatement = new ExplainStatementImpl();
    return explainStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DumpStatement createDumpStatement()
  {
    DumpStatementImpl dumpStatement = new DumpStatementImpl();
    return dumpStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public func_eval createfunc_eval()
  {
    func_evalImpl func_eval = new func_evalImpl();
    return func_eval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public real_arg_list createreal_arg_list()
  {
    real_arg_listImpl real_arg_list = new real_arg_listImpl();
    return real_arg_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public real_arg createreal_arg()
  {
    real_argImpl real_arg = new real_argImpl();
    return real_arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public var_expr createvar_expr()
  {
    var_exprImpl var_expr = new var_exprImpl();
    return var_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public projectable_expr createprojectable_expr()
  {
    projectable_exprImpl projectable_expr = new projectable_exprImpl();
    return projectable_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public bin_expr createbin_expr()
  {
    bin_exprImpl bin_expr = new bin_exprImpl();
    return bin_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasType createAliasType()
  {
    AliasTypeImpl aliasType = new AliasTypeImpl();
    return aliasType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlattenGeneratedItem createFlattenGeneratedItem()
  {
    FlattenGeneratedItemImpl flattenGeneratedItem = new FlattenGeneratedItemImpl();
    return flattenGeneratedItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultClause createDefaultClause()
  {
    DefaultClauseImpl defaultClause = new DefaultClauseImpl();
    return defaultClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclareClause createDeclareClause()
  {
    DeclareClauseImpl declareClause = new DeclareClauseImpl();
    return declareClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefineClause createDefineClause()
  {
    DefineClauseImpl defineClause = new DefineClauseImpl();
    return defineClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public group_item_list creategroup_item_list()
  {
    group_item_listImpl group_item_list = new group_item_listImpl();
    return group_item_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rel_list createrel_list()
  {
    rel_listImpl rel_list = new rel_listImpl();
    return rel_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_sub_clause createjoin_sub_clause()
  {
    join_sub_clauseImpl join_sub_clause = new join_sub_clauseImpl();
    return join_sub_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_item createjoin_item()
  {
    join_itemImpl join_item = new join_itemImpl();
    return join_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public group_item creategroup_item()
  {
    group_itemImpl group_item = new group_itemImpl();
    return group_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_group_by_clause createjoin_group_by_clause()
  {
    join_group_by_clauseImpl join_group_by_clause = new join_group_by_clauseImpl();
    return join_group_by_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_group_by_expr_list createjoin_group_by_expr_list()
  {
    join_group_by_expr_listImpl join_group_by_expr_list = new join_group_by_expr_listImpl();
    return join_group_by_expr_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_group_by_expr createjoin_group_by_expr()
  {
    join_group_by_exprImpl join_group_by_expr = new join_group_by_exprImpl();
    return join_group_by_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nested_blk createnested_blk()
  {
    nested_blkImpl nested_blk = new nested_blkImpl();
    return nested_blk;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public generate_clause creategenerate_clause()
  {
    generate_clauseImpl generate_clause = new generate_clauseImpl();
    return generate_clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nested_command_list createnested_command_list()
  {
    nested_command_listImpl nested_command_list = new nested_command_listImpl();
    return nested_command_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nested_command createnested_command()
  {
    nested_commandImpl nested_command = new nested_commandImpl();
    return nested_command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nested_op createnested_op()
  {
    nested_opImpl nested_op = new nested_opImpl();
    return nested_op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedFilter createNestedFilter()
  {
    NestedFilterImpl nestedFilter = new NestedFilterImpl();
    return nestedFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nested_sort createnested_sort()
  {
    nested_sortImpl nested_sort = new nested_sortImpl();
    return nested_sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nested_distinct createnested_distinct()
  {
    nested_distinctImpl nested_distinct = new nested_distinctImpl();
    return nested_distinct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public nested_limit createnested_limit()
  {
    nested_limitImpl nested_limit = new nested_limitImpl();
    return nested_limit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public split_branch createsplit_branch()
  {
    split_branchImpl split_branch = new split_branchImpl();
    return split_branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrCondition createOrCondition()
  {
    OrConditionImpl orCondition = new OrConditionImpl();
    return orCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndCondition createAndCondition()
  {
    AndConditionImpl andCondition = new AndConditionImpl();
    return andCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryCondition createUnaryCondition()
  {
    UnaryConditionImpl unaryCondition = new UnaryConditionImpl();
    return unaryCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PigPackage getPigPackage()
  {
    return (PigPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PigPackage getPackage()
  {
    return PigPackage.eINSTANCE;
  }

} //PigFactoryImpl
