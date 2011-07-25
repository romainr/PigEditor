/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.util;

import org.apache.pigeditor.pig.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.apache.pigeditor.pig.PigPackage
 * @generated
 */
public class PigAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PigPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PigAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PigPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PigSwitch<Adapter> modelSwitch =
    new PigSwitch<Adapter>()
    {
      @Override
      public Adapter caseQuery(Query object)
      {
        return createQueryAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseDefineStatement(DefineStatement object)
      {
        return createDefineStatementAdapter();
      }
      @Override
      public Adapter caseLoadStatement(LoadStatement object)
      {
        return createLoadStatementAdapter();
      }
      @Override
      public Adapter caseForeachStatement(ForeachStatement object)
      {
        return createForeachStatementAdapter();
      }
      @Override
      public Adapter caseFilterStatement(FilterStatement object)
      {
        return createFilterStatementAdapter();
      }
      @Override
      public Adapter caseGroupByStatement(GroupByStatement object)
      {
        return createGroupByStatementAdapter();
      }
      @Override
      public Adapter caseCoGroupByStatement(CoGroupByStatement object)
      {
        return createCoGroupByStatementAdapter();
      }
      @Override
      public Adapter caseOrderStatement(OrderStatement object)
      {
        return createOrderStatementAdapter();
      }
      @Override
      public Adapter caseCrossStatement(CrossStatement object)
      {
        return createCrossStatementAdapter();
      }
      @Override
      public Adapter caseUnionStatement(UnionStatement object)
      {
        return createUnionStatementAdapter();
      }
      @Override
      public Adapter caseJoinStatement(JoinStatement object)
      {
        return createJoinStatementAdapter();
      }
      @Override
      public Adapter caseLimitStatement(LimitStatement object)
      {
        return createLimitStatementAdapter();
      }
      @Override
      public Adapter caseSampleStatement(SampleStatement object)
      {
        return createSampleStatementAdapter();
      }
      @Override
      public Adapter caseDistinctStatement(DistinctStatement object)
      {
        return createDistinctStatementAdapter();
      }
      @Override
      public Adapter caseStreamStatement(StreamStatement object)
      {
        return createStreamStatementAdapter();
      }
      @Override
      public Adapter caseMrStatement(MrStatement object)
      {
        return createMrStatementAdapter();
      }
      @Override
      public Adapter caseSplitStatement(SplitStatement object)
      {
        return createSplitStatementAdapter();
      }
      @Override
      public Adapter caseStoreStatement(StoreStatement object)
      {
        return createStoreStatementAdapter();
      }
      @Override
      public Adapter caseDescribeStatement(DescribeStatement object)
      {
        return createDescribeStatementAdapter();
      }
      @Override
      public Adapter caseExplainStatement(ExplainStatement object)
      {
        return createExplainStatementAdapter();
      }
      @Override
      public Adapter caseDumpStatement(DumpStatement object)
      {
        return createDumpStatementAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter casefunc_eval(func_eval object)
      {
        return createfunc_evalAdapter();
      }
      @Override
      public Adapter casereal_arg_list(real_arg_list object)
      {
        return createreal_arg_listAdapter();
      }
      @Override
      public Adapter casereal_arg(real_arg object)
      {
        return createreal_argAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter casevar_expr(var_expr object)
      {
        return createvar_exprAdapter();
      }
      @Override
      public Adapter caseprojectable_expr(projectable_expr object)
      {
        return createprojectable_exprAdapter();
      }
      @Override
      public Adapter casebin_expr(bin_expr object)
      {
        return createbin_exprAdapter();
      }
      @Override
      public Adapter caseAliasType(AliasType object)
      {
        return createAliasTypeAdapter();
      }
      @Override
      public Adapter caseFlattenGeneratedItem(FlattenGeneratedItem object)
      {
        return createFlattenGeneratedItemAdapter();
      }
      @Override
      public Adapter caseDefaultClause(DefaultClause object)
      {
        return createDefaultClauseAdapter();
      }
      @Override
      public Adapter caseDeclareClause(DeclareClause object)
      {
        return createDeclareClauseAdapter();
      }
      @Override
      public Adapter caseDefineClause(DefineClause object)
      {
        return createDefineClauseAdapter();
      }
      @Override
      public Adapter casegroup_item_list(group_item_list object)
      {
        return creategroup_item_listAdapter();
      }
      @Override
      public Adapter caserel_list(rel_list object)
      {
        return createrel_listAdapter();
      }
      @Override
      public Adapter casejoin_sub_clause(join_sub_clause object)
      {
        return createjoin_sub_clauseAdapter();
      }
      @Override
      public Adapter casejoin_item(join_item object)
      {
        return createjoin_itemAdapter();
      }
      @Override
      public Adapter casegroup_item(group_item object)
      {
        return creategroup_itemAdapter();
      }
      @Override
      public Adapter casejoin_group_by_clause(join_group_by_clause object)
      {
        return createjoin_group_by_clauseAdapter();
      }
      @Override
      public Adapter casejoin_group_by_expr_list(join_group_by_expr_list object)
      {
        return createjoin_group_by_expr_listAdapter();
      }
      @Override
      public Adapter casejoin_group_by_expr(join_group_by_expr object)
      {
        return createjoin_group_by_exprAdapter();
      }
      @Override
      public Adapter casenested_blk(nested_blk object)
      {
        return createnested_blkAdapter();
      }
      @Override
      public Adapter casegenerate_clause(generate_clause object)
      {
        return creategenerate_clauseAdapter();
      }
      @Override
      public Adapter casenested_command_list(nested_command_list object)
      {
        return createnested_command_listAdapter();
      }
      @Override
      public Adapter casenested_command(nested_command object)
      {
        return createnested_commandAdapter();
      }
      @Override
      public Adapter casenested_op(nested_op object)
      {
        return createnested_opAdapter();
      }
      @Override
      public Adapter caseNestedFilter(NestedFilter object)
      {
        return createNestedFilterAdapter();
      }
      @Override
      public Adapter casenested_sort(nested_sort object)
      {
        return createnested_sortAdapter();
      }
      @Override
      public Adapter casenested_distinct(nested_distinct object)
      {
        return createnested_distinctAdapter();
      }
      @Override
      public Adapter casenested_limit(nested_limit object)
      {
        return createnested_limitAdapter();
      }
      @Override
      public Adapter casesplit_branch(split_branch object)
      {
        return createsplit_branchAdapter();
      }
      @Override
      public Adapter caseOrCondition(OrCondition object)
      {
        return createOrConditionAdapter();
      }
      @Override
      public Adapter caseAndCondition(AndCondition object)
      {
        return createAndConditionAdapter();
      }
      @Override
      public Adapter caseUnaryCondition(UnaryCondition object)
      {
        return createUnaryConditionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.Query
   * @generated
   */
  public Adapter createQueryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.DefineStatement <em>Define Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.DefineStatement
   * @generated
   */
  public Adapter createDefineStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.LoadStatement <em>Load Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.LoadStatement
   * @generated
   */
  public Adapter createLoadStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.ForeachStatement <em>Foreach Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.ForeachStatement
   * @generated
   */
  public Adapter createForeachStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.FilterStatement <em>Filter Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.FilterStatement
   * @generated
   */
  public Adapter createFilterStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.GroupByStatement <em>Group By Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.GroupByStatement
   * @generated
   */
  public Adapter createGroupByStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.CoGroupByStatement <em>Co Group By Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.CoGroupByStatement
   * @generated
   */
  public Adapter createCoGroupByStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.OrderStatement <em>Order Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.OrderStatement
   * @generated
   */
  public Adapter createOrderStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.CrossStatement <em>Cross Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.CrossStatement
   * @generated
   */
  public Adapter createCrossStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.UnionStatement <em>Union Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.UnionStatement
   * @generated
   */
  public Adapter createUnionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.JoinStatement <em>Join Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.JoinStatement
   * @generated
   */
  public Adapter createJoinStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.LimitStatement <em>Limit Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.LimitStatement
   * @generated
   */
  public Adapter createLimitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.SampleStatement <em>Sample Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.SampleStatement
   * @generated
   */
  public Adapter createSampleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.DistinctStatement <em>Distinct Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.DistinctStatement
   * @generated
   */
  public Adapter createDistinctStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.StreamStatement <em>Stream Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.StreamStatement
   * @generated
   */
  public Adapter createStreamStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.MrStatement <em>Mr Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.MrStatement
   * @generated
   */
  public Adapter createMrStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.SplitStatement <em>Split Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.SplitStatement
   * @generated
   */
  public Adapter createSplitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.StoreStatement <em>Store Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.StoreStatement
   * @generated
   */
  public Adapter createStoreStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.DescribeStatement <em>Describe Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.DescribeStatement
   * @generated
   */
  public Adapter createDescribeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.ExplainStatement <em>Explain Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.ExplainStatement
   * @generated
   */
  public Adapter createExplainStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.DumpStatement <em>Dump Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.DumpStatement
   * @generated
   */
  public Adapter createDumpStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.func_eval <em>func eval</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.func_eval
   * @generated
   */
  public Adapter createfunc_evalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.real_arg_list <em>real arg list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.real_arg_list
   * @generated
   */
  public Adapter createreal_arg_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.real_arg <em>real arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.real_arg
   * @generated
   */
  public Adapter createreal_argAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.var_expr <em>var expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.var_expr
   * @generated
   */
  public Adapter createvar_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.projectable_expr <em>projectable expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.projectable_expr
   * @generated
   */
  public Adapter createprojectable_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.bin_expr <em>bin expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.bin_expr
   * @generated
   */
  public Adapter createbin_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.AliasType <em>Alias Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.AliasType
   * @generated
   */
  public Adapter createAliasTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.FlattenGeneratedItem <em>Flatten Generated Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.FlattenGeneratedItem
   * @generated
   */
  public Adapter createFlattenGeneratedItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.DefaultClause <em>Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.DefaultClause
   * @generated
   */
  public Adapter createDefaultClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.DeclareClause <em>Declare Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.DeclareClause
   * @generated
   */
  public Adapter createDeclareClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.DefineClause <em>Define Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.DefineClause
   * @generated
   */
  public Adapter createDefineClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.group_item_list <em>group item list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.group_item_list
   * @generated
   */
  public Adapter creategroup_item_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.rel_list <em>rel list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.rel_list
   * @generated
   */
  public Adapter createrel_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.join_sub_clause <em>join sub clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.join_sub_clause
   * @generated
   */
  public Adapter createjoin_sub_clauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.join_item <em>join item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.join_item
   * @generated
   */
  public Adapter createjoin_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.group_item <em>group item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.group_item
   * @generated
   */
  public Adapter creategroup_itemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.join_group_by_clause <em>join group by clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.join_group_by_clause
   * @generated
   */
  public Adapter createjoin_group_by_clauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.join_group_by_expr_list <em>join group by expr list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.join_group_by_expr_list
   * @generated
   */
  public Adapter createjoin_group_by_expr_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.join_group_by_expr <em>join group by expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.join_group_by_expr
   * @generated
   */
  public Adapter createjoin_group_by_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.nested_blk <em>nested blk</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.nested_blk
   * @generated
   */
  public Adapter createnested_blkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.generate_clause <em>generate clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.generate_clause
   * @generated
   */
  public Adapter creategenerate_clauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.nested_command_list <em>nested command list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.nested_command_list
   * @generated
   */
  public Adapter createnested_command_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.nested_command <em>nested command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.nested_command
   * @generated
   */
  public Adapter createnested_commandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.nested_op <em>nested op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.nested_op
   * @generated
   */
  public Adapter createnested_opAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.NestedFilter <em>Nested Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.NestedFilter
   * @generated
   */
  public Adapter createNestedFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.nested_sort <em>nested sort</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.nested_sort
   * @generated
   */
  public Adapter createnested_sortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.nested_distinct <em>nested distinct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.nested_distinct
   * @generated
   */
  public Adapter createnested_distinctAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.nested_limit <em>nested limit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.nested_limit
   * @generated
   */
  public Adapter createnested_limitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.split_branch <em>split branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.split_branch
   * @generated
   */
  public Adapter createsplit_branchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.OrCondition <em>Or Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.OrCondition
   * @generated
   */
  public Adapter createOrConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.AndCondition <em>And Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.AndCondition
   * @generated
   */
  public Adapter createAndConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.apache.pigeditor.pig.UnaryCondition <em>Unary Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.apache.pigeditor.pig.UnaryCondition
   * @generated
   */
  public Adapter createUnaryConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PigAdapterFactory
