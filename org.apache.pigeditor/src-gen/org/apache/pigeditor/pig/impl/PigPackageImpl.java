/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.AliasType;
import org.apache.pigeditor.pig.AndCondition;
import org.apache.pigeditor.pig.CoGroupByStatement;
import org.apache.pigeditor.pig.Condition;
import org.apache.pigeditor.pig.CrossStatement;
import org.apache.pigeditor.pig.DeclareClause;
import org.apache.pigeditor.pig.DefaultClause;
import org.apache.pigeditor.pig.DefineClause;
import org.apache.pigeditor.pig.DefineStatement;
import org.apache.pigeditor.pig.DescribeStatement;
import org.apache.pigeditor.pig.DistinctStatement;
import org.apache.pigeditor.pig.DumpStatement;
import org.apache.pigeditor.pig.ExplainStatement;
import org.apache.pigeditor.pig.Expression;
import org.apache.pigeditor.pig.FilterStatement;
import org.apache.pigeditor.pig.FlattenGeneratedItem;
import org.apache.pigeditor.pig.ForeachStatement;
import org.apache.pigeditor.pig.GroupByStatement;
import org.apache.pigeditor.pig.JoinStatement;
import org.apache.pigeditor.pig.LimitStatement;
import org.apache.pigeditor.pig.LoadStatement;
import org.apache.pigeditor.pig.MrStatement;
import org.apache.pigeditor.pig.NestedFilter;
import org.apache.pigeditor.pig.OrCondition;
import org.apache.pigeditor.pig.OrderStatement;
import org.apache.pigeditor.pig.PigFactory;
import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.Query;
import org.apache.pigeditor.pig.SampleStatement;
import org.apache.pigeditor.pig.SplitStatement;
import org.apache.pigeditor.pig.Statement;
import org.apache.pigeditor.pig.StoreStatement;
import org.apache.pigeditor.pig.StreamStatement;
import org.apache.pigeditor.pig.UnaryCondition;
import org.apache.pigeditor.pig.UnionStatement;
import org.apache.pigeditor.pig.bin_expr;
import org.apache.pigeditor.pig.func_eval;
import org.apache.pigeditor.pig.generate_clause;
import org.apache.pigeditor.pig.group_item;
import org.apache.pigeditor.pig.group_item_list;
import org.apache.pigeditor.pig.join_group_by_clause;
import org.apache.pigeditor.pig.join_group_by_expr;
import org.apache.pigeditor.pig.join_group_by_expr_list;
import org.apache.pigeditor.pig.join_item;
import org.apache.pigeditor.pig.join_sub_clause;
import org.apache.pigeditor.pig.nested_blk;
import org.apache.pigeditor.pig.nested_command;
import org.apache.pigeditor.pig.nested_command_list;
import org.apache.pigeditor.pig.nested_distinct;
import org.apache.pigeditor.pig.nested_limit;
import org.apache.pigeditor.pig.nested_op;
import org.apache.pigeditor.pig.nested_sort;
import org.apache.pigeditor.pig.projectable_expr;
import org.apache.pigeditor.pig.real_arg;
import org.apache.pigeditor.pig.real_arg_list;
import org.apache.pigeditor.pig.rel_list;
import org.apache.pigeditor.pig.split_branch;
import org.apache.pigeditor.pig.var_expr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PigPackageImpl extends EPackageImpl implements PigPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass queryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defineStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreachStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupByStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass coGroupByStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crossStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass limitStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sampleStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distinctStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streamStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mrStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splitStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass describeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass explainStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dumpStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass func_evalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass real_arg_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass real_argEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass var_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectable_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bin_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flattenGeneratedItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declareClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defineClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass group_item_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rel_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass join_sub_clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass join_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass group_itemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass join_group_by_clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass join_group_by_expr_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass join_group_by_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nested_blkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generate_clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nested_command_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nested_commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nested_opEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nested_sortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nested_distinctEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nested_limitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass split_branchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andConditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryConditionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.apache.pigeditor.pig.PigPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PigPackageImpl()
  {
    super(eNS_URI, PigFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PigPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PigPackage init()
  {
    if (isInited) return (PigPackage)EPackage.Registry.INSTANCE.getEPackage(PigPackage.eNS_URI);

    // Obtain or create and register package
    PigPackageImpl thePigPackage = (PigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PigPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePigPackage.createPackageContents();

    // Initialize created meta-data
    thePigPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePigPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PigPackage.eNS_URI, thePigPackage);
    return thePigPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuery()
  {
    return queryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuery_Elements()
  {
    return (EReference)queryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefineStatement()
  {
    return defineStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefineStatement_Name()
  {
    return (EAttribute)defineStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoadStatement()
  {
    return loadStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoadStatement_Name()
  {
    return (EAttribute)loadStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeachStatement()
  {
    return foreachStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForeachStatement_Name()
  {
    return (EAttribute)foreachStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeachStatement_Type()
  {
    return (EReference)foreachStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForeachStatement_Items()
  {
    return (EReference)foreachStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFilterStatement()
  {
    return filterStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFilterStatement_Name()
  {
    return (EAttribute)filterStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterStatement_Type()
  {
    return (EReference)filterStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFilterStatement_Cond()
  {
    return (EReference)filterStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupByStatement()
  {
    return groupByStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupByStatement_Name()
  {
    return (EAttribute)groupByStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupByStatement_Type()
  {
    return (EReference)groupByStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupByStatement_Items()
  {
    return (EReference)groupByStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCoGroupByStatement()
  {
    return coGroupByStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCoGroupByStatement_Name()
  {
    return (EAttribute)coGroupByStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCoGroupByStatement_Aliases()
  {
    return (EReference)coGroupByStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderStatement()
  {
    return orderStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrderStatement_Name()
  {
    return (EAttribute)orderStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderStatement_Type()
  {
    return (EReference)orderStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCrossStatement()
  {
    return crossStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCrossStatement_Name()
  {
    return (EAttribute)crossStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCrossStatement_Aliases()
  {
    return (EReference)crossStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnionStatement()
  {
    return unionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnionStatement_Name()
  {
    return (EAttribute)unionStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnionStatement_Aliases()
  {
    return (EReference)unionStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinStatement()
  {
    return joinStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinStatement_Name()
  {
    return (EAttribute)joinStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinStatement_Aliases()
  {
    return (EReference)joinStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLimitStatement()
  {
    return limitStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLimitStatement_Name()
  {
    return (EAttribute)limitStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLimitStatement_Type()
  {
    return (EReference)limitStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSampleStatement()
  {
    return sampleStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSampleStatement_Name()
  {
    return (EAttribute)sampleStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSampleStatement_Type()
  {
    return (EReference)sampleStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistinctStatement()
  {
    return distinctStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDistinctStatement_Name()
  {
    return (EAttribute)distinctStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDistinctStatement_Type()
  {
    return (EReference)distinctStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStreamStatement()
  {
    return streamStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStreamStatement_Name()
  {
    return (EAttribute)streamStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStreamStatement_Type()
  {
    return (EReference)streamStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMrStatement()
  {
    return mrStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMrStatement_Name()
  {
    return (EAttribute)mrStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSplitStatement()
  {
    return splitStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSplitStatement_Name()
  {
    return (EAttribute)splitStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplitStatement_Type()
  {
    return (EReference)splitStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSplitStatement_Branches()
  {
    return (EReference)splitStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStoreStatement()
  {
    return storeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStoreStatement_Load()
  {
    return (EReference)storeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStoreStatement_Type()
  {
    return (EReference)storeStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescribeStatement()
  {
    return describeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescribeStatement_Type()
  {
    return (EReference)describeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExplainStatement()
  {
    return explainStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExplainStatement_Type()
  {
    return (EReference)explainStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDumpStatement()
  {
    return dumpStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDumpStatement_Type()
  {
    return (EReference)dumpStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondition()
  {
    return conditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_LeftExp()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCondition_RightExp()
  {
    return (EReference)conditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getfunc_eval()
  {
    return func_evalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getfunc_eval_Arg_list()
  {
    return (EReference)func_evalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getreal_arg_list()
  {
    return real_arg_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getreal_arg_list_Args()
  {
    return (EReference)real_arg_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getreal_arg()
  {
    return real_argEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Mul_exp()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Mul_cast()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvar_expr()
  {
    return var_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getprojectable_expr()
  {
    return projectable_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getbin_expr()
  {
    return bin_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAliasType()
  {
    return aliasTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAliasType_Referenced()
  {
    return (EReference)aliasTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlattenGeneratedItem()
  {
    return flattenGeneratedItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultClause()
  {
    return defaultClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclareClause()
  {
    return declareClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefineClause()
  {
    return defineClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgroup_item_list()
  {
    return group_item_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrel_list()
  {
    return rel_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrel_list_Type()
  {
    return (EReference)rel_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getjoin_sub_clause()
  {
    return join_sub_clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getjoin_item()
  {
    return join_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getjoin_item_Others()
  {
    return (EReference)join_itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getjoin_item_Type()
  {
    return (EReference)join_itemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getjoin_item_Expressions()
  {
    return (EReference)join_itemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgroup_item()
  {
    return group_itemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgroup_item_Items()
  {
    return (EReference)group_itemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getjoin_group_by_clause()
  {
    return join_group_by_clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getjoin_group_by_expr_list()
  {
    return join_group_by_expr_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getjoin_group_by_expr_list_Left()
  {
    return (EReference)join_group_by_expr_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getjoin_group_by_expr_list_Expressions()
  {
    return (EReference)join_group_by_expr_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getjoin_group_by_expr()
  {
    return join_group_by_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnested_blk()
  {
    return nested_blkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getgenerate_clause()
  {
    return generate_clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getgenerate_clause_Items()
  {
    return (EReference)generate_clauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnested_command_list()
  {
    return nested_command_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnested_command_list_Clauses()
  {
    return (EReference)nested_command_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getnested_command_list_Cmds()
  {
    return (EReference)nested_command_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnested_command()
  {
    return nested_commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnested_op()
  {
    return nested_opEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedFilter()
  {
    return nestedFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNestedFilter_Exp()
  {
    return (EReference)nestedFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNestedFilter_Cond()
  {
    return (EReference)nestedFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnested_sort()
  {
    return nested_sortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnested_distinct()
  {
    return nested_distinctEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getnested_limit()
  {
    return nested_limitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getsplit_branch()
  {
    return split_branchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrCondition()
  {
    return orConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrCondition_Left()
  {
    return (EReference)orConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrCondition_Right()
  {
    return (EReference)orConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndCondition()
  {
    return andConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndCondition_Left()
  {
    return (EReference)andConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndCondition_Right()
  {
    return (EReference)andConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryCondition()
  {
    return unaryConditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryCondition_Left()
  {
    return (EReference)unaryConditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryCondition_Right()
  {
    return (EReference)unaryConditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PigFactory getPigFactory()
  {
    return (PigFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    queryEClass = createEClass(QUERY);
    createEReference(queryEClass, QUERY__ELEMENTS);

    statementEClass = createEClass(STATEMENT);

    defineStatementEClass = createEClass(DEFINE_STATEMENT);
    createEAttribute(defineStatementEClass, DEFINE_STATEMENT__NAME);

    loadStatementEClass = createEClass(LOAD_STATEMENT);
    createEAttribute(loadStatementEClass, LOAD_STATEMENT__NAME);

    foreachStatementEClass = createEClass(FOREACH_STATEMENT);
    createEAttribute(foreachStatementEClass, FOREACH_STATEMENT__NAME);
    createEReference(foreachStatementEClass, FOREACH_STATEMENT__TYPE);
    createEReference(foreachStatementEClass, FOREACH_STATEMENT__ITEMS);

    filterStatementEClass = createEClass(FILTER_STATEMENT);
    createEAttribute(filterStatementEClass, FILTER_STATEMENT__NAME);
    createEReference(filterStatementEClass, FILTER_STATEMENT__TYPE);
    createEReference(filterStatementEClass, FILTER_STATEMENT__COND);

    groupByStatementEClass = createEClass(GROUP_BY_STATEMENT);
    createEAttribute(groupByStatementEClass, GROUP_BY_STATEMENT__NAME);
    createEReference(groupByStatementEClass, GROUP_BY_STATEMENT__TYPE);
    createEReference(groupByStatementEClass, GROUP_BY_STATEMENT__ITEMS);

    coGroupByStatementEClass = createEClass(CO_GROUP_BY_STATEMENT);
    createEAttribute(coGroupByStatementEClass, CO_GROUP_BY_STATEMENT__NAME);
    createEReference(coGroupByStatementEClass, CO_GROUP_BY_STATEMENT__ALIASES);

    orderStatementEClass = createEClass(ORDER_STATEMENT);
    createEAttribute(orderStatementEClass, ORDER_STATEMENT__NAME);
    createEReference(orderStatementEClass, ORDER_STATEMENT__TYPE);

    crossStatementEClass = createEClass(CROSS_STATEMENT);
    createEAttribute(crossStatementEClass, CROSS_STATEMENT__NAME);
    createEReference(crossStatementEClass, CROSS_STATEMENT__ALIASES);

    unionStatementEClass = createEClass(UNION_STATEMENT);
    createEAttribute(unionStatementEClass, UNION_STATEMENT__NAME);
    createEReference(unionStatementEClass, UNION_STATEMENT__ALIASES);

    joinStatementEClass = createEClass(JOIN_STATEMENT);
    createEAttribute(joinStatementEClass, JOIN_STATEMENT__NAME);
    createEReference(joinStatementEClass, JOIN_STATEMENT__ALIASES);

    limitStatementEClass = createEClass(LIMIT_STATEMENT);
    createEAttribute(limitStatementEClass, LIMIT_STATEMENT__NAME);
    createEReference(limitStatementEClass, LIMIT_STATEMENT__TYPE);

    sampleStatementEClass = createEClass(SAMPLE_STATEMENT);
    createEAttribute(sampleStatementEClass, SAMPLE_STATEMENT__NAME);
    createEReference(sampleStatementEClass, SAMPLE_STATEMENT__TYPE);

    distinctStatementEClass = createEClass(DISTINCT_STATEMENT);
    createEAttribute(distinctStatementEClass, DISTINCT_STATEMENT__NAME);
    createEReference(distinctStatementEClass, DISTINCT_STATEMENT__TYPE);

    streamStatementEClass = createEClass(STREAM_STATEMENT);
    createEAttribute(streamStatementEClass, STREAM_STATEMENT__NAME);
    createEReference(streamStatementEClass, STREAM_STATEMENT__TYPE);

    mrStatementEClass = createEClass(MR_STATEMENT);
    createEAttribute(mrStatementEClass, MR_STATEMENT__NAME);

    splitStatementEClass = createEClass(SPLIT_STATEMENT);
    createEAttribute(splitStatementEClass, SPLIT_STATEMENT__NAME);
    createEReference(splitStatementEClass, SPLIT_STATEMENT__TYPE);
    createEReference(splitStatementEClass, SPLIT_STATEMENT__BRANCHES);

    storeStatementEClass = createEClass(STORE_STATEMENT);
    createEReference(storeStatementEClass, STORE_STATEMENT__LOAD);
    createEReference(storeStatementEClass, STORE_STATEMENT__TYPE);

    describeStatementEClass = createEClass(DESCRIBE_STATEMENT);
    createEReference(describeStatementEClass, DESCRIBE_STATEMENT__TYPE);

    explainStatementEClass = createEClass(EXPLAIN_STATEMENT);
    createEReference(explainStatementEClass, EXPLAIN_STATEMENT__TYPE);

    dumpStatementEClass = createEClass(DUMP_STATEMENT);
    createEReference(dumpStatementEClass, DUMP_STATEMENT__TYPE);

    conditionEClass = createEClass(CONDITION);
    createEReference(conditionEClass, CONDITION__LEFT_EXP);
    createEReference(conditionEClass, CONDITION__RIGHT_EXP);

    func_evalEClass = createEClass(FUNC_EVAL);
    createEReference(func_evalEClass, FUNC_EVAL__ARG_LIST);

    real_arg_listEClass = createEClass(REAL_ARG_LIST);
    createEReference(real_arg_listEClass, REAL_ARG_LIST__ARGS);

    real_argEClass = createEClass(REAL_ARG);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__MUL_EXP);
    createEReference(expressionEClass, EXPRESSION__MUL_CAST);

    var_exprEClass = createEClass(VAR_EXPR);

    projectable_exprEClass = createEClass(PROJECTABLE_EXPR);

    bin_exprEClass = createEClass(BIN_EXPR);

    aliasTypeEClass = createEClass(ALIAS_TYPE);
    createEReference(aliasTypeEClass, ALIAS_TYPE__REFERENCED);

    flattenGeneratedItemEClass = createEClass(FLATTEN_GENERATED_ITEM);

    defaultClauseEClass = createEClass(DEFAULT_CLAUSE);

    declareClauseEClass = createEClass(DECLARE_CLAUSE);

    defineClauseEClass = createEClass(DEFINE_CLAUSE);

    group_item_listEClass = createEClass(GROUP_ITEM_LIST);

    rel_listEClass = createEClass(REL_LIST);
    createEReference(rel_listEClass, REL_LIST__TYPE);

    join_sub_clauseEClass = createEClass(JOIN_SUB_CLAUSE);

    join_itemEClass = createEClass(JOIN_ITEM);
    createEReference(join_itemEClass, JOIN_ITEM__OTHERS);
    createEReference(join_itemEClass, JOIN_ITEM__TYPE);
    createEReference(join_itemEClass, JOIN_ITEM__EXPRESSIONS);

    group_itemEClass = createEClass(GROUP_ITEM);
    createEReference(group_itemEClass, GROUP_ITEM__ITEMS);

    join_group_by_clauseEClass = createEClass(JOIN_GROUP_BY_CLAUSE);

    join_group_by_expr_listEClass = createEClass(JOIN_GROUP_BY_EXPR_LIST);
    createEReference(join_group_by_expr_listEClass, JOIN_GROUP_BY_EXPR_LIST__LEFT);
    createEReference(join_group_by_expr_listEClass, JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS);

    join_group_by_exprEClass = createEClass(JOIN_GROUP_BY_EXPR);

    nested_blkEClass = createEClass(NESTED_BLK);

    generate_clauseEClass = createEClass(GENERATE_CLAUSE);
    createEReference(generate_clauseEClass, GENERATE_CLAUSE__ITEMS);

    nested_command_listEClass = createEClass(NESTED_COMMAND_LIST);
    createEReference(nested_command_listEClass, NESTED_COMMAND_LIST__CLAUSES);
    createEReference(nested_command_listEClass, NESTED_COMMAND_LIST__CMDS);

    nested_commandEClass = createEClass(NESTED_COMMAND);

    nested_opEClass = createEClass(NESTED_OP);

    nestedFilterEClass = createEClass(NESTED_FILTER);
    createEReference(nestedFilterEClass, NESTED_FILTER__EXP);
    createEReference(nestedFilterEClass, NESTED_FILTER__COND);

    nested_sortEClass = createEClass(NESTED_SORT);

    nested_distinctEClass = createEClass(NESTED_DISTINCT);

    nested_limitEClass = createEClass(NESTED_LIMIT);

    split_branchEClass = createEClass(SPLIT_BRANCH);

    orConditionEClass = createEClass(OR_CONDITION);
    createEReference(orConditionEClass, OR_CONDITION__LEFT);
    createEReference(orConditionEClass, OR_CONDITION__RIGHT);

    andConditionEClass = createEClass(AND_CONDITION);
    createEReference(andConditionEClass, AND_CONDITION__LEFT);
    createEReference(andConditionEClass, AND_CONDITION__RIGHT);

    unaryConditionEClass = createEClass(UNARY_CONDITION);
    createEReference(unaryConditionEClass, UNARY_CONDITION__LEFT);
    createEReference(unaryConditionEClass, UNARY_CONDITION__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    defineStatementEClass.getESuperTypes().add(this.getStatement());
    loadStatementEClass.getESuperTypes().add(this.getStatement());
    foreachStatementEClass.getESuperTypes().add(this.getStatement());
    filterStatementEClass.getESuperTypes().add(this.getStatement());
    groupByStatementEClass.getESuperTypes().add(this.getStatement());
    coGroupByStatementEClass.getESuperTypes().add(this.getStatement());
    orderStatementEClass.getESuperTypes().add(this.getStatement());
    crossStatementEClass.getESuperTypes().add(this.getStatement());
    unionStatementEClass.getESuperTypes().add(this.getStatement());
    joinStatementEClass.getESuperTypes().add(this.getStatement());
    limitStatementEClass.getESuperTypes().add(this.getStatement());
    sampleStatementEClass.getESuperTypes().add(this.getStatement());
    distinctStatementEClass.getESuperTypes().add(this.getStatement());
    streamStatementEClass.getESuperTypes().add(this.getStatement());
    mrStatementEClass.getESuperTypes().add(this.getStatement());
    splitStatementEClass.getESuperTypes().add(this.getStatement());
    storeStatementEClass.getESuperTypes().add(this.getStatement());
    storeStatementEClass.getESuperTypes().add(this.getMrStatement());
    describeStatementEClass.getESuperTypes().add(this.getStatement());
    explainStatementEClass.getESuperTypes().add(this.getStatement());
    dumpStatementEClass.getESuperTypes().add(this.getStatement());
    conditionEClass.getESuperTypes().add(this.getreal_arg());
    conditionEClass.getESuperTypes().add(this.getbin_expr());
    conditionEClass.getESuperTypes().add(this.getFlattenGeneratedItem());
    conditionEClass.getESuperTypes().add(this.getsplit_branch());
    func_evalEClass.getESuperTypes().add(this.getprojectable_expr());
    expressionEClass.getESuperTypes().add(this.getCondition());
    expressionEClass.getESuperTypes().add(this.getjoin_group_by_expr());
    expressionEClass.getESuperTypes().add(this.getnested_op());
    var_exprEClass.getESuperTypes().add(this.getExpression());
    var_exprEClass.getESuperTypes().add(this.getnested_sort());
    var_exprEClass.getESuperTypes().add(this.getnested_distinct());
    var_exprEClass.getESuperTypes().add(this.getnested_limit());
    projectable_exprEClass.getESuperTypes().add(this.getvar_expr());
    defaultClauseEClass.getESuperTypes().add(this.getDefineStatement());
    declareClauseEClass.getESuperTypes().add(this.getDefineStatement());
    defineClauseEClass.getESuperTypes().add(this.getDefineStatement());
    join_itemEClass.getESuperTypes().add(this.getjoin_sub_clause());
    group_itemEClass.getESuperTypes().add(this.getgroup_item_list());
    join_group_by_expr_listEClass.getESuperTypes().add(this.getgroup_item());
    join_group_by_expr_listEClass.getESuperTypes().add(this.getjoin_group_by_clause());
    join_group_by_exprEClass.getESuperTypes().add(this.getjoin_group_by_expr_list());
    nested_command_listEClass.getESuperTypes().add(this.getnested_blk());
    nested_opEClass.getESuperTypes().add(this.getnested_command());
    nestedFilterEClass.getESuperTypes().add(this.getnested_op());
    nested_sortEClass.getESuperTypes().add(this.getnested_op());
    nested_distinctEClass.getESuperTypes().add(this.getnested_op());
    nested_limitEClass.getESuperTypes().add(this.getnested_op());
    orConditionEClass.getESuperTypes().add(this.getCondition());
    andConditionEClass.getESuperTypes().add(this.getCondition());
    unaryConditionEClass.getESuperTypes().add(this.getCondition());

    // Initialize classes and features; add operations and parameters
    initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuery_Elements(), this.getStatement(), null, "elements", null, 0, -1, Query.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defineStatementEClass, DefineStatement.class, "DefineStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefineStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DefineStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadStatementEClass, LoadStatement.class, "LoadStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLoadStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LoadStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreachStatementEClass, ForeachStatement.class, "ForeachStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForeachStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ForeachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeachStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, ForeachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeachStatement_Items(), ecorePackage.getEObject(), null, "items", null, 0, -1, ForeachStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterStatementEClass, FilterStatement.class, "FilterStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFilterStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FilterStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, FilterStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterStatement_Cond(), this.getCondition(), null, "cond", null, 0, 1, FilterStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupByStatementEClass, GroupByStatement.class, "GroupByStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroupByStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, GroupByStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupByStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, GroupByStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroupByStatement_Items(), this.getgroup_item_list(), null, "items", null, 0, 1, GroupByStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(coGroupByStatementEClass, CoGroupByStatement.class, "CoGroupByStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCoGroupByStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CoGroupByStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCoGroupByStatement_Aliases(), this.getjoin_sub_clause(), null, "aliases", null, 0, 1, CoGroupByStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orderStatementEClass, OrderStatement.class, "OrderStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrderStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, OrderStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrderStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, OrderStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(crossStatementEClass, CrossStatement.class, "CrossStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCrossStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, CrossStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCrossStatement_Aliases(), this.getrel_list(), null, "aliases", null, 0, 1, CrossStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unionStatementEClass, UnionStatement.class, "UnionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnionStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnionStatement_Aliases(), this.getrel_list(), null, "aliases", null, 0, 1, UnionStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinStatementEClass, JoinStatement.class, "JoinStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinStatement_Aliases(), this.getjoin_sub_clause(), null, "aliases", null, 0, 1, JoinStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(limitStatementEClass, LimitStatement.class, "LimitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLimitStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LimitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLimitStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, LimitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sampleStatementEClass, SampleStatement.class, "SampleStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSampleStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SampleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSampleStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, SampleStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(distinctStatementEClass, DistinctStatement.class, "DistinctStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDistinctStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DistinctStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDistinctStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, DistinctStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streamStatementEClass, StreamStatement.class, "StreamStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStreamStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, StreamStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStreamStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, StreamStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mrStatementEClass, MrStatement.class, "MrStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMrStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, MrStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(splitStatementEClass, SplitStatement.class, "SplitStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSplitStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, SplitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSplitStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, SplitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSplitStatement_Branches(), this.getsplit_branch(), null, "branches", null, 0, -1, SplitStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storeStatementEClass, StoreStatement.class, "StoreStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStoreStatement_Load(), this.getLoadStatement(), null, "load", null, 0, 1, StoreStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStoreStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, StoreStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(describeStatementEClass, DescribeStatement.class, "DescribeStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescribeStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, DescribeStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(explainStatementEClass, ExplainStatement.class, "ExplainStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExplainStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, ExplainStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dumpStatementEClass, DumpStatement.class, "DumpStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDumpStatement_Type(), this.getAliasType(), null, "type", null, 0, 1, DumpStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCondition_LeftExp(), this.getCondition(), null, "leftExp", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCondition_RightExp(), this.getCondition(), null, "rightExp", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(func_evalEClass, func_eval.class, "func_eval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getfunc_eval_Arg_list(), this.getreal_arg_list(), null, "arg_list", null, 0, 1, func_eval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(real_arg_listEClass, real_arg_list.class, "real_arg_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getreal_arg_list_Args(), this.getreal_arg(), null, "args", null, 0, -1, real_arg_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(real_argEClass, real_arg.class, "real_arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_Mul_exp(), this.getExpression(), null, "mul_exp", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Mul_cast(), this.getExpression(), null, "mul_cast", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(var_exprEClass, var_expr.class, "var_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(projectable_exprEClass, projectable_expr.class, "projectable_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bin_exprEClass, bin_expr.class, "bin_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(aliasTypeEClass, AliasType.class, "AliasType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAliasType_Referenced(), this.getStatement(), null, "referenced", null, 0, 1, AliasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flattenGeneratedItemEClass, FlattenGeneratedItem.class, "FlattenGeneratedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defaultClauseEClass, DefaultClause.class, "DefaultClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(declareClauseEClass, DeclareClause.class, "DeclareClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defineClauseEClass, DefineClause.class, "DefineClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(group_item_listEClass, group_item_list.class, "group_item_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rel_listEClass, rel_list.class, "rel_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrel_list_Type(), this.getAliasType(), null, "type", null, 0, 1, rel_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(join_sub_clauseEClass, join_sub_clause.class, "join_sub_clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(join_itemEClass, join_item.class, "join_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getjoin_item_Others(), this.getjoin_item(), null, "others", null, 0, 1, join_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getjoin_item_Type(), this.getAliasType(), null, "type", null, 0, 1, join_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getjoin_item_Expressions(), this.getjoin_group_by_clause(), null, "expressions", null, 0, 1, join_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(group_itemEClass, group_item.class, "group_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgroup_item_Items(), this.getgroup_item(), null, "items", null, 0, 1, group_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(join_group_by_clauseEClass, join_group_by_clause.class, "join_group_by_clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(join_group_by_expr_listEClass, join_group_by_expr_list.class, "join_group_by_expr_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getjoin_group_by_expr_list_Left(), this.getjoin_group_by_expr(), null, "left", null, 0, 1, join_group_by_expr_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getjoin_group_by_expr_list_Expressions(), this.getjoin_group_by_expr(), null, "expressions", null, 0, 1, join_group_by_expr_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(join_group_by_exprEClass, join_group_by_expr.class, "join_group_by_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nested_blkEClass, nested_blk.class, "nested_blk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(generate_clauseEClass, generate_clause.class, "generate_clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getgenerate_clause_Items(), this.getFlattenGeneratedItem(), null, "items", null, 0, -1, generate_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nested_command_listEClass, nested_command_list.class, "nested_command_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getnested_command_list_Clauses(), this.getgenerate_clause(), null, "clauses", null, 0, 1, nested_command_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getnested_command_list_Cmds(), this.getnested_command(), null, "cmds", null, 0, -1, nested_command_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nested_commandEClass, nested_command.class, "nested_command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nested_opEClass, nested_op.class, "nested_op", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nestedFilterEClass, NestedFilter.class, "NestedFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNestedFilter_Exp(), this.getvar_expr(), null, "exp", null, 0, 1, NestedFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNestedFilter_Cond(), this.getCondition(), null, "cond", null, 0, 1, NestedFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nested_sortEClass, nested_sort.class, "nested_sort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nested_distinctEClass, nested_distinct.class, "nested_distinct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nested_limitEClass, nested_limit.class, "nested_limit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(split_branchEClass, split_branch.class, "split_branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orConditionEClass, OrCondition.class, "OrCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrCondition_Left(), this.getCondition(), null, "left", null, 0, 1, OrCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrCondition_Right(), this.getCondition(), null, "right", null, 0, 1, OrCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andConditionEClass, AndCondition.class, "AndCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndCondition_Left(), this.getCondition(), null, "left", null, 0, 1, AndCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndCondition_Right(), this.getCondition(), null, "right", null, 0, 1, AndCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryConditionEClass, UnaryCondition.class, "UnaryCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnaryCondition_Left(), this.getCondition(), null, "left", null, 0, 1, UnaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryCondition_Right(), this.getCondition(), null, "right", null, 0, 1, UnaryCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PigPackageImpl
