/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.util;

import org.apache.pigeditor.pig.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.apache.pigeditor.pig.PigPackage
 * @generated
 */
public class PigSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PigPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PigSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PigPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PigPackage.QUERY:
      {
        Query query = (Query)theEObject;
        T result = caseQuery(query);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.DEFINE_STATEMENT:
      {
        DefineStatement defineStatement = (DefineStatement)theEObject;
        T result = caseDefineStatement(defineStatement);
        if (result == null) result = caseStatement(defineStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.LOAD_STATEMENT:
      {
        LoadStatement loadStatement = (LoadStatement)theEObject;
        T result = caseLoadStatement(loadStatement);
        if (result == null) result = caseStatement(loadStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.FOREACH_STATEMENT:
      {
        ForeachStatement foreachStatement = (ForeachStatement)theEObject;
        T result = caseForeachStatement(foreachStatement);
        if (result == null) result = caseStatement(foreachStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.FILTER_STATEMENT:
      {
        FilterStatement filterStatement = (FilterStatement)theEObject;
        T result = caseFilterStatement(filterStatement);
        if (result == null) result = caseStatement(filterStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.GROUP_BY_STATEMENT:
      {
        GroupByStatement groupByStatement = (GroupByStatement)theEObject;
        T result = caseGroupByStatement(groupByStatement);
        if (result == null) result = caseStatement(groupByStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.CO_GROUP_BY_STATEMENT:
      {
        CoGroupByStatement coGroupByStatement = (CoGroupByStatement)theEObject;
        T result = caseCoGroupByStatement(coGroupByStatement);
        if (result == null) result = caseStatement(coGroupByStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.ORDER_STATEMENT:
      {
        OrderStatement orderStatement = (OrderStatement)theEObject;
        T result = caseOrderStatement(orderStatement);
        if (result == null) result = caseStatement(orderStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.CROSS_STATEMENT:
      {
        CrossStatement crossStatement = (CrossStatement)theEObject;
        T result = caseCrossStatement(crossStatement);
        if (result == null) result = caseStatement(crossStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.UNION_STATEMENT:
      {
        UnionStatement unionStatement = (UnionStatement)theEObject;
        T result = caseUnionStatement(unionStatement);
        if (result == null) result = caseStatement(unionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.JOIN_STATEMENT:
      {
        JoinStatement joinStatement = (JoinStatement)theEObject;
        T result = caseJoinStatement(joinStatement);
        if (result == null) result = caseStatement(joinStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.LIMIT_STATEMENT:
      {
        LimitStatement limitStatement = (LimitStatement)theEObject;
        T result = caseLimitStatement(limitStatement);
        if (result == null) result = caseStatement(limitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.SAMPLE_STATEMENT:
      {
        SampleStatement sampleStatement = (SampleStatement)theEObject;
        T result = caseSampleStatement(sampleStatement);
        if (result == null) result = caseStatement(sampleStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.DISTINCT_STATEMENT:
      {
        DistinctStatement distinctStatement = (DistinctStatement)theEObject;
        T result = caseDistinctStatement(distinctStatement);
        if (result == null) result = caseStatement(distinctStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.STREAM_STATEMENT:
      {
        StreamStatement streamStatement = (StreamStatement)theEObject;
        T result = caseStreamStatement(streamStatement);
        if (result == null) result = caseStatement(streamStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.MR_STATEMENT:
      {
        MrStatement mrStatement = (MrStatement)theEObject;
        T result = caseMrStatement(mrStatement);
        if (result == null) result = caseStatement(mrStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.SPLIT_STATEMENT:
      {
        SplitStatement splitStatement = (SplitStatement)theEObject;
        T result = caseSplitStatement(splitStatement);
        if (result == null) result = caseStatement(splitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.STORE_STATEMENT:
      {
        StoreStatement storeStatement = (StoreStatement)theEObject;
        T result = caseStoreStatement(storeStatement);
        if (result == null) result = caseMrStatement(storeStatement);
        if (result == null) result = caseStatement(storeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.DESCRIBE_STATEMENT:
      {
        DescribeStatement describeStatement = (DescribeStatement)theEObject;
        T result = caseDescribeStatement(describeStatement);
        if (result == null) result = caseStatement(describeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.EXPLAIN_STATEMENT:
      {
        ExplainStatement explainStatement = (ExplainStatement)theEObject;
        T result = caseExplainStatement(explainStatement);
        if (result == null) result = caseStatement(explainStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.DUMP_STATEMENT:
      {
        DumpStatement dumpStatement = (DumpStatement)theEObject;
        T result = caseDumpStatement(dumpStatement);
        if (result == null) result = caseStatement(dumpStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = casereal_arg(condition);
        if (result == null) result = casebin_expr(condition);
        if (result == null) result = caseFlattenGeneratedItem(condition);
        if (result == null) result = casesplit_branch(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.FUNC_EVAL:
      {
        func_eval func_eval = (func_eval)theEObject;
        T result = casefunc_eval(func_eval);
        if (result == null) result = caseprojectable_expr(func_eval);
        if (result == null) result = casevar_expr(func_eval);
        if (result == null) result = caseExpression(func_eval);
        if (result == null) result = casenested_sort(func_eval);
        if (result == null) result = casenested_distinct(func_eval);
        if (result == null) result = casenested_limit(func_eval);
        if (result == null) result = caseCondition(func_eval);
        if (result == null) result = casejoin_group_by_expr(func_eval);
        if (result == null) result = casenested_op(func_eval);
        if (result == null) result = casereal_arg(func_eval);
        if (result == null) result = casebin_expr(func_eval);
        if (result == null) result = caseFlattenGeneratedItem(func_eval);
        if (result == null) result = casesplit_branch(func_eval);
        if (result == null) result = casejoin_group_by_expr_list(func_eval);
        if (result == null) result = casenested_command(func_eval);
        if (result == null) result = casegroup_item(func_eval);
        if (result == null) result = casejoin_group_by_clause(func_eval);
        if (result == null) result = casegroup_item_list(func_eval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.REAL_ARG_LIST:
      {
        real_arg_list real_arg_list = (real_arg_list)theEObject;
        T result = casereal_arg_list(real_arg_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.REAL_ARG:
      {
        real_arg real_arg = (real_arg)theEObject;
        T result = casereal_arg(real_arg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseCondition(expression);
        if (result == null) result = casejoin_group_by_expr(expression);
        if (result == null) result = casenested_op(expression);
        if (result == null) result = casereal_arg(expression);
        if (result == null) result = casebin_expr(expression);
        if (result == null) result = caseFlattenGeneratedItem(expression);
        if (result == null) result = casesplit_branch(expression);
        if (result == null) result = casejoin_group_by_expr_list(expression);
        if (result == null) result = casenested_command(expression);
        if (result == null) result = casegroup_item(expression);
        if (result == null) result = casejoin_group_by_clause(expression);
        if (result == null) result = casegroup_item_list(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.VAR_EXPR:
      {
        var_expr var_expr = (var_expr)theEObject;
        T result = casevar_expr(var_expr);
        if (result == null) result = caseExpression(var_expr);
        if (result == null) result = casenested_sort(var_expr);
        if (result == null) result = casenested_distinct(var_expr);
        if (result == null) result = casenested_limit(var_expr);
        if (result == null) result = caseCondition(var_expr);
        if (result == null) result = casejoin_group_by_expr(var_expr);
        if (result == null) result = casenested_op(var_expr);
        if (result == null) result = casereal_arg(var_expr);
        if (result == null) result = casebin_expr(var_expr);
        if (result == null) result = caseFlattenGeneratedItem(var_expr);
        if (result == null) result = casesplit_branch(var_expr);
        if (result == null) result = casejoin_group_by_expr_list(var_expr);
        if (result == null) result = casenested_command(var_expr);
        if (result == null) result = casegroup_item(var_expr);
        if (result == null) result = casejoin_group_by_clause(var_expr);
        if (result == null) result = casegroup_item_list(var_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.PROJECTABLE_EXPR:
      {
        projectable_expr projectable_expr = (projectable_expr)theEObject;
        T result = caseprojectable_expr(projectable_expr);
        if (result == null) result = casevar_expr(projectable_expr);
        if (result == null) result = caseExpression(projectable_expr);
        if (result == null) result = casenested_sort(projectable_expr);
        if (result == null) result = casenested_distinct(projectable_expr);
        if (result == null) result = casenested_limit(projectable_expr);
        if (result == null) result = caseCondition(projectable_expr);
        if (result == null) result = casejoin_group_by_expr(projectable_expr);
        if (result == null) result = casenested_op(projectable_expr);
        if (result == null) result = casereal_arg(projectable_expr);
        if (result == null) result = casebin_expr(projectable_expr);
        if (result == null) result = caseFlattenGeneratedItem(projectable_expr);
        if (result == null) result = casesplit_branch(projectable_expr);
        if (result == null) result = casejoin_group_by_expr_list(projectable_expr);
        if (result == null) result = casenested_command(projectable_expr);
        if (result == null) result = casegroup_item(projectable_expr);
        if (result == null) result = casejoin_group_by_clause(projectable_expr);
        if (result == null) result = casegroup_item_list(projectable_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.BIN_EXPR:
      {
        bin_expr bin_expr = (bin_expr)theEObject;
        T result = casebin_expr(bin_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.ALIAS_TYPE:
      {
        AliasType aliasType = (AliasType)theEObject;
        T result = caseAliasType(aliasType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.FLATTEN_GENERATED_ITEM:
      {
        FlattenGeneratedItem flattenGeneratedItem = (FlattenGeneratedItem)theEObject;
        T result = caseFlattenGeneratedItem(flattenGeneratedItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.DEFAULT_CLAUSE:
      {
        DefaultClause defaultClause = (DefaultClause)theEObject;
        T result = caseDefaultClause(defaultClause);
        if (result == null) result = caseDefineStatement(defaultClause);
        if (result == null) result = caseStatement(defaultClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.DECLARE_CLAUSE:
      {
        DeclareClause declareClause = (DeclareClause)theEObject;
        T result = caseDeclareClause(declareClause);
        if (result == null) result = caseStatement(declareClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.DEFINE_CLAUSE:
      {
        DefineClause defineClause = (DefineClause)theEObject;
        T result = caseDefineClause(defineClause);
        if (result == null) result = caseDefineStatement(defineClause);
        if (result == null) result = caseStatement(defineClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.GROUP_ITEM_LIST:
      {
        group_item_list group_item_list = (group_item_list)theEObject;
        T result = casegroup_item_list(group_item_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.REL_LIST:
      {
        rel_list rel_list = (rel_list)theEObject;
        T result = caserel_list(rel_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.JOIN_SUB_CLAUSE:
      {
        join_sub_clause join_sub_clause = (join_sub_clause)theEObject;
        T result = casejoin_sub_clause(join_sub_clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.JOIN_ITEM:
      {
        join_item join_item = (join_item)theEObject;
        T result = casejoin_item(join_item);
        if (result == null) result = casejoin_sub_clause(join_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.GROUP_ITEM:
      {
        group_item group_item = (group_item)theEObject;
        T result = casegroup_item(group_item);
        if (result == null) result = casegroup_item_list(group_item);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.JOIN_GROUP_BY_CLAUSE:
      {
        join_group_by_clause join_group_by_clause = (join_group_by_clause)theEObject;
        T result = casejoin_group_by_clause(join_group_by_clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST:
      {
        join_group_by_expr_list join_group_by_expr_list = (join_group_by_expr_list)theEObject;
        T result = casejoin_group_by_expr_list(join_group_by_expr_list);
        if (result == null) result = casegroup_item(join_group_by_expr_list);
        if (result == null) result = casejoin_group_by_clause(join_group_by_expr_list);
        if (result == null) result = casegroup_item_list(join_group_by_expr_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.JOIN_GROUP_BY_EXPR:
      {
        join_group_by_expr join_group_by_expr = (join_group_by_expr)theEObject;
        T result = casejoin_group_by_expr(join_group_by_expr);
        if (result == null) result = casejoin_group_by_expr_list(join_group_by_expr);
        if (result == null) result = casegroup_item(join_group_by_expr);
        if (result == null) result = casejoin_group_by_clause(join_group_by_expr);
        if (result == null) result = casegroup_item_list(join_group_by_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_BLK:
      {
        nested_blk nested_blk = (nested_blk)theEObject;
        T result = casenested_blk(nested_blk);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.GENERATE_CLAUSE:
      {
        generate_clause generate_clause = (generate_clause)theEObject;
        T result = casegenerate_clause(generate_clause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_COMMAND_LIST:
      {
        nested_command_list nested_command_list = (nested_command_list)theEObject;
        T result = casenested_command_list(nested_command_list);
        if (result == null) result = casenested_blk(nested_command_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_COMMAND:
      {
        nested_command nested_command = (nested_command)theEObject;
        T result = casenested_command(nested_command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_OP:
      {
        nested_op nested_op = (nested_op)theEObject;
        T result = casenested_op(nested_op);
        if (result == null) result = casenested_command(nested_op);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_FILTER:
      {
        NestedFilter nestedFilter = (NestedFilter)theEObject;
        T result = caseNestedFilter(nestedFilter);
        if (result == null) result = casenested_op(nestedFilter);
        if (result == null) result = casenested_command(nestedFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_SORT:
      {
        nested_sort nested_sort = (nested_sort)theEObject;
        T result = casenested_sort(nested_sort);
        if (result == null) result = casenested_op(nested_sort);
        if (result == null) result = casenested_command(nested_sort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_DISTINCT:
      {
        nested_distinct nested_distinct = (nested_distinct)theEObject;
        T result = casenested_distinct(nested_distinct);
        if (result == null) result = casenested_op(nested_distinct);
        if (result == null) result = casenested_command(nested_distinct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.NESTED_LIMIT:
      {
        nested_limit nested_limit = (nested_limit)theEObject;
        T result = casenested_limit(nested_limit);
        if (result == null) result = casenested_op(nested_limit);
        if (result == null) result = casenested_command(nested_limit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.SPLIT_BRANCH:
      {
        split_branch split_branch = (split_branch)theEObject;
        T result = casesplit_branch(split_branch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.OR_CONDITION:
      {
        OrCondition orCondition = (OrCondition)theEObject;
        T result = caseOrCondition(orCondition);
        if (result == null) result = caseCondition(orCondition);
        if (result == null) result = casereal_arg(orCondition);
        if (result == null) result = casebin_expr(orCondition);
        if (result == null) result = caseFlattenGeneratedItem(orCondition);
        if (result == null) result = casesplit_branch(orCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.AND_CONDITION:
      {
        AndCondition andCondition = (AndCondition)theEObject;
        T result = caseAndCondition(andCondition);
        if (result == null) result = caseCondition(andCondition);
        if (result == null) result = casereal_arg(andCondition);
        if (result == null) result = casebin_expr(andCondition);
        if (result == null) result = caseFlattenGeneratedItem(andCondition);
        if (result == null) result = casesplit_branch(andCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PigPackage.UNARY_CONDITION:
      {
        UnaryCondition unaryCondition = (UnaryCondition)theEObject;
        T result = caseUnaryCondition(unaryCondition);
        if (result == null) result = caseCondition(unaryCondition);
        if (result == null) result = casereal_arg(unaryCondition);
        if (result == null) result = casebin_expr(unaryCondition);
        if (result == null) result = caseFlattenGeneratedItem(unaryCondition);
        if (result == null) result = casesplit_branch(unaryCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Query</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuery(Query object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Define Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Define Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefineStatement(DefineStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoadStatement(LoadStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreach Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreach Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeachStatement(ForeachStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterStatement(FilterStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group By Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group By Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupByStatement(GroupByStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Co Group By Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Co Group By Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoGroupByStatement(CoGroupByStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderStatement(OrderStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cross Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cross Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrossStatement(CrossStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnionStatement(UnionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Join Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Join Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJoinStatement(JoinStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Limit Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Limit Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLimitStatement(LimitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sample Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sample Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSampleStatement(SampleStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Distinct Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Distinct Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDistinctStatement(DistinctStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stream Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stream Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStreamStatement(StreamStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mr Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mr Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMrStatement(MrStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Split Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Split Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSplitStatement(SplitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Store Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Store Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStoreStatement(StoreStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Describe Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Describe Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescribeStatement(DescribeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Explain Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Explain Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExplainStatement(ExplainStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dump Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dump Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDumpStatement(DumpStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>func eval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>func eval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunc_eval(func_eval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>real arg list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>real arg list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casereal_arg_list(real_arg_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>real arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>real arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casereal_arg(real_arg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>var expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>var expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevar_expr(var_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>projectable expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>projectable expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseprojectable_expr(projectable_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>bin expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>bin expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casebin_expr(bin_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alias Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alias Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAliasType(AliasType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flatten Generated Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flatten Generated Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlattenGeneratedItem(FlattenGeneratedItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultClause(DefaultClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declare Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declare Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclareClause(DeclareClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Define Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Define Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefineClause(DefineClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>group item list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>group item list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegroup_item_list(group_item_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rel list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rel list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserel_list(rel_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>join sub clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>join sub clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casejoin_sub_clause(join_sub_clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>join item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>join item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casejoin_item(join_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>group item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>group item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegroup_item(group_item object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>join group by clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>join group by clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casejoin_group_by_clause(join_group_by_clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>join group by expr list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>join group by expr list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casejoin_group_by_expr_list(join_group_by_expr_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>join group by expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>join group by expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casejoin_group_by_expr(join_group_by_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nested blk</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nested blk</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenested_blk(nested_blk object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>generate clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>generate clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegenerate_clause(generate_clause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nested command list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nested command list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenested_command_list(nested_command_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nested command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nested command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenested_command(nested_command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nested op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nested op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenested_op(nested_op object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedFilter(NestedFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nested sort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nested sort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenested_sort(nested_sort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nested distinct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nested distinct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenested_distinct(nested_distinct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nested limit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nested limit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenested_limit(nested_limit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>split branch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>split branch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesplit_branch(split_branch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrCondition(OrCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndCondition(AndCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryCondition(UnaryCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PigSwitch
