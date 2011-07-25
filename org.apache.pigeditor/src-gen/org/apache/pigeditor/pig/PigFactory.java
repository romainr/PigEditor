/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.apache.pigeditor.pig.PigPackage
 * @generated
 */
public interface PigFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PigFactory eINSTANCE = org.apache.pigeditor.pig.impl.PigFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Define Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Define Statement</em>'.
   * @generated
   */
  DefineStatement createDefineStatement();

  /**
   * Returns a new object of class '<em>Load Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Statement</em>'.
   * @generated
   */
  LoadStatement createLoadStatement();

  /**
   * Returns a new object of class '<em>Foreach Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreach Statement</em>'.
   * @generated
   */
  ForeachStatement createForeachStatement();

  /**
   * Returns a new object of class '<em>Filter Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Statement</em>'.
   * @generated
   */
  FilterStatement createFilterStatement();

  /**
   * Returns a new object of class '<em>Group By Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group By Statement</em>'.
   * @generated
   */
  GroupByStatement createGroupByStatement();

  /**
   * Returns a new object of class '<em>Co Group By Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Co Group By Statement</em>'.
   * @generated
   */
  CoGroupByStatement createCoGroupByStatement();

  /**
   * Returns a new object of class '<em>Order Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order Statement</em>'.
   * @generated
   */
  OrderStatement createOrderStatement();

  /**
   * Returns a new object of class '<em>Cross Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cross Statement</em>'.
   * @generated
   */
  CrossStatement createCrossStatement();

  /**
   * Returns a new object of class '<em>Union Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union Statement</em>'.
   * @generated
   */
  UnionStatement createUnionStatement();

  /**
   * Returns a new object of class '<em>Join Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Statement</em>'.
   * @generated
   */
  JoinStatement createJoinStatement();

  /**
   * Returns a new object of class '<em>Limit Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit Statement</em>'.
   * @generated
   */
  LimitStatement createLimitStatement();

  /**
   * Returns a new object of class '<em>Sample Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sample Statement</em>'.
   * @generated
   */
  SampleStatement createSampleStatement();

  /**
   * Returns a new object of class '<em>Distinct Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distinct Statement</em>'.
   * @generated
   */
  DistinctStatement createDistinctStatement();

  /**
   * Returns a new object of class '<em>Stream Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stream Statement</em>'.
   * @generated
   */
  StreamStatement createStreamStatement();

  /**
   * Returns a new object of class '<em>Mr Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mr Statement</em>'.
   * @generated
   */
  MrStatement createMrStatement();

  /**
   * Returns a new object of class '<em>Split Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Split Statement</em>'.
   * @generated
   */
  SplitStatement createSplitStatement();

  /**
   * Returns a new object of class '<em>Store Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store Statement</em>'.
   * @generated
   */
  StoreStatement createStoreStatement();

  /**
   * Returns a new object of class '<em>Describe Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Describe Statement</em>'.
   * @generated
   */
  DescribeStatement createDescribeStatement();

  /**
   * Returns a new object of class '<em>Explain Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explain Statement</em>'.
   * @generated
   */
  ExplainStatement createExplainStatement();

  /**
   * Returns a new object of class '<em>Dump Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dump Statement</em>'.
   * @generated
   */
  DumpStatement createDumpStatement();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns a new object of class '<em>func eval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>func eval</em>'.
   * @generated
   */
  func_eval createfunc_eval();

  /**
   * Returns a new object of class '<em>real arg list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>real arg list</em>'.
   * @generated
   */
  real_arg_list createreal_arg_list();

  /**
   * Returns a new object of class '<em>real arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>real arg</em>'.
   * @generated
   */
  real_arg createreal_arg();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>var expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>var expr</em>'.
   * @generated
   */
  var_expr createvar_expr();

  /**
   * Returns a new object of class '<em>projectable expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>projectable expr</em>'.
   * @generated
   */
  projectable_expr createprojectable_expr();

  /**
   * Returns a new object of class '<em>bin expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>bin expr</em>'.
   * @generated
   */
  bin_expr createbin_expr();

  /**
   * Returns a new object of class '<em>Alias Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alias Type</em>'.
   * @generated
   */
  AliasType createAliasType();

  /**
   * Returns a new object of class '<em>Flatten Generated Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flatten Generated Item</em>'.
   * @generated
   */
  FlattenGeneratedItem createFlattenGeneratedItem();

  /**
   * Returns a new object of class '<em>Default Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Clause</em>'.
   * @generated
   */
  DefaultClause createDefaultClause();

  /**
   * Returns a new object of class '<em>Declare Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declare Clause</em>'.
   * @generated
   */
  DeclareClause createDeclareClause();

  /**
   * Returns a new object of class '<em>Define Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Define Clause</em>'.
   * @generated
   */
  DefineClause createDefineClause();

  /**
   * Returns a new object of class '<em>group item list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>group item list</em>'.
   * @generated
   */
  group_item_list creategroup_item_list();

  /**
   * Returns a new object of class '<em>rel list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rel list</em>'.
   * @generated
   */
  rel_list createrel_list();

  /**
   * Returns a new object of class '<em>join sub clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>join sub clause</em>'.
   * @generated
   */
  join_sub_clause createjoin_sub_clause();

  /**
   * Returns a new object of class '<em>join item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>join item</em>'.
   * @generated
   */
  join_item createjoin_item();

  /**
   * Returns a new object of class '<em>group item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>group item</em>'.
   * @generated
   */
  group_item creategroup_item();

  /**
   * Returns a new object of class '<em>join group by clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>join group by clause</em>'.
   * @generated
   */
  join_group_by_clause createjoin_group_by_clause();

  /**
   * Returns a new object of class '<em>join group by expr list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>join group by expr list</em>'.
   * @generated
   */
  join_group_by_expr_list createjoin_group_by_expr_list();

  /**
   * Returns a new object of class '<em>join group by expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>join group by expr</em>'.
   * @generated
   */
  join_group_by_expr createjoin_group_by_expr();

  /**
   * Returns a new object of class '<em>nested blk</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nested blk</em>'.
   * @generated
   */
  nested_blk createnested_blk();

  /**
   * Returns a new object of class '<em>generate clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>generate clause</em>'.
   * @generated
   */
  generate_clause creategenerate_clause();

  /**
   * Returns a new object of class '<em>nested command list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nested command list</em>'.
   * @generated
   */
  nested_command_list createnested_command_list();

  /**
   * Returns a new object of class '<em>nested command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nested command</em>'.
   * @generated
   */
  nested_command createnested_command();

  /**
   * Returns a new object of class '<em>nested op</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nested op</em>'.
   * @generated
   */
  nested_op createnested_op();

  /**
   * Returns a new object of class '<em>Nested Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Filter</em>'.
   * @generated
   */
  NestedFilter createNestedFilter();

  /**
   * Returns a new object of class '<em>nested sort</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nested sort</em>'.
   * @generated
   */
  nested_sort createnested_sort();

  /**
   * Returns a new object of class '<em>nested distinct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nested distinct</em>'.
   * @generated
   */
  nested_distinct createnested_distinct();

  /**
   * Returns a new object of class '<em>nested limit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>nested limit</em>'.
   * @generated
   */
  nested_limit createnested_limit();

  /**
   * Returns a new object of class '<em>split branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>split branch</em>'.
   * @generated
   */
  split_branch createsplit_branch();

  /**
   * Returns a new object of class '<em>Or Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Condition</em>'.
   * @generated
   */
  OrCondition createOrCondition();

  /**
   * Returns a new object of class '<em>And Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Condition</em>'.
   * @generated
   */
  AndCondition createAndCondition();

  /**
   * Returns a new object of class '<em>Unary Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Condition</em>'.
   * @generated
   */
  UnaryCondition createUnaryCondition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PigPackage getPigPackage();

} //PigFactory
