/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.apache.pigeditor.pig.PigFactory
 * @model kind="package"
 * @generated
 */
public interface PigPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pig";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.apache.org/pigeditor/Pig";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pig";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PigPackage eINSTANCE = org.apache.pigeditor.pig.impl.PigPackageImpl.init();

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.QueryImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.StatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.DefineStatementImpl <em>Define Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.DefineStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDefineStatement()
   * @generated
   */
  int DEFINE_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Define Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.LoadStatementImpl <em>Load Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.LoadStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getLoadStatement()
   * @generated
   */
  int LOAD_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Load Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.ForeachStatementImpl <em>Foreach Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.ForeachStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getForeachStatement()
   * @generated
   */
  int FOREACH_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT__ITEMS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Foreach Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.FilterStatementImpl <em>Filter Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.FilterStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getFilterStatement()
   * @generated
   */
  int FILTER_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_STATEMENT__COND = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Filter Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.GroupByStatementImpl <em>Group By Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.GroupByStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getGroupByStatement()
   * @generated
   */
  int GROUP_BY_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_STATEMENT__ITEMS = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Group By Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_BY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.CoGroupByStatementImpl <em>Co Group By Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.CoGroupByStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getCoGroupByStatement()
   * @generated
   */
  int CO_GROUP_BY_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CO_GROUP_BY_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CO_GROUP_BY_STATEMENT__ALIASES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Co Group By Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CO_GROUP_BY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.OrderStatementImpl <em>Order Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.OrderStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getOrderStatement()
   * @generated
   */
  int ORDER_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Order Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.CrossStatementImpl <em>Cross Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.CrossStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getCrossStatement()
   * @generated
   */
  int CROSS_STATEMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_STATEMENT__ALIASES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Cross Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CROSS_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.UnionStatementImpl <em>Union Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.UnionStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getUnionStatement()
   * @generated
   */
  int UNION_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_STATEMENT__ALIASES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Union Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.JoinStatementImpl <em>Join Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.JoinStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getJoinStatement()
   * @generated
   */
  int JOIN_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT__ALIASES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Join Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.LimitStatementImpl <em>Limit Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.LimitStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getLimitStatement()
   * @generated
   */
  int LIMIT_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Limit Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIMIT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.SampleStatementImpl <em>Sample Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.SampleStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getSampleStatement()
   * @generated
   */
  int SAMPLE_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAMPLE_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAMPLE_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sample Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAMPLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.DistinctStatementImpl <em>Distinct Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.DistinctStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDistinctStatement()
   * @generated
   */
  int DISTINCT_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTINCT_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTINCT_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Distinct Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTINCT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.StreamStatementImpl <em>Stream Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.StreamStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getStreamStatement()
   * @generated
   */
  int STREAM_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Stream Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STREAM_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.MrStatementImpl <em>Mr Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.MrStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getMrStatement()
   * @generated
   */
  int MR_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mr Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.SplitStatementImpl <em>Split Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.SplitStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getSplitStatement()
   * @generated
   */
  int SPLIT_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_STATEMENT__BRANCHES = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Split Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.StoreStatementImpl <em>Store Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.StoreStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getStoreStatement()
   * @generated
   */
  int STORE_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_STATEMENT__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Load</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_STATEMENT__LOAD = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Store Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.DescribeStatementImpl <em>Describe Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.DescribeStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDescribeStatement()
   * @generated
   */
  int DESCRIBE_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Describe Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.ExplainStatementImpl <em>Explain Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.ExplainStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getExplainStatement()
   * @generated
   */
  int EXPLAIN_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLAIN_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Explain Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPLAIN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.DumpStatementImpl <em>Dump Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.DumpStatementImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDumpStatement()
   * @generated
   */
  int DUMP_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMP_STATEMENT__TYPE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dump Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUMP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.real_argImpl <em>real arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.real_argImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getreal_arg()
   * @generated
   */
  int REAL_ARG = 25;

  /**
   * The number of structural features of the '<em>real arg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ARG_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.ConditionImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 22;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__LEFT_EXP = REAL_ARG_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__RIGHT_EXP = REAL_ARG_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = REAL_ARG_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.ExpressionImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT_EXP = CONDITION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT_EXP = CONDITION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__ITEMS = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSIONS = CONDITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mul exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__MUL_EXP = CONDITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Mul cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__MUL_CAST = CONDITION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.var_exprImpl <em>var expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.var_exprImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getvar_expr()
   * @generated
   */
  int VAR_EXPR = 27;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR__LEFT_EXP = EXPRESSION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR__RIGHT_EXP = EXPRESSION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR__ITEMS = EXPRESSION__ITEMS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR__LEFT = EXPRESSION__LEFT;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR__EXPRESSIONS = EXPRESSION__EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Mul exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR__MUL_EXP = EXPRESSION__MUL_EXP;

  /**
   * The feature id for the '<em><b>Mul cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR__MUL_CAST = EXPRESSION__MUL_CAST;

  /**
   * The number of structural features of the '<em>var expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_EXPR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.projectable_exprImpl <em>projectable expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.projectable_exprImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getprojectable_expr()
   * @generated
   */
  int PROJECTABLE_EXPR = 28;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR__LEFT_EXP = VAR_EXPR__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR__RIGHT_EXP = VAR_EXPR__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR__ITEMS = VAR_EXPR__ITEMS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR__LEFT = VAR_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR__EXPRESSIONS = VAR_EXPR__EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Mul exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR__MUL_EXP = VAR_EXPR__MUL_EXP;

  /**
   * The feature id for the '<em><b>Mul cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR__MUL_CAST = VAR_EXPR__MUL_CAST;

  /**
   * The number of structural features of the '<em>projectable expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTABLE_EXPR_FEATURE_COUNT = VAR_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.func_evalImpl <em>func eval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.func_evalImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getfunc_eval()
   * @generated
   */
  int FUNC_EVAL = 23;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__LEFT_EXP = PROJECTABLE_EXPR__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__RIGHT_EXP = PROJECTABLE_EXPR__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__ITEMS = PROJECTABLE_EXPR__ITEMS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__LEFT = PROJECTABLE_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__EXPRESSIONS = PROJECTABLE_EXPR__EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Mul exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__MUL_EXP = PROJECTABLE_EXPR__MUL_EXP;

  /**
   * The feature id for the '<em><b>Mul cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__MUL_CAST = PROJECTABLE_EXPR__MUL_CAST;

  /**
   * The feature id for the '<em><b>Arg list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL__ARG_LIST = PROJECTABLE_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>func eval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNC_EVAL_FEATURE_COUNT = PROJECTABLE_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.real_arg_listImpl <em>real arg list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.real_arg_listImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getreal_arg_list()
   * @generated
   */
  int REAL_ARG_LIST = 24;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ARG_LIST__ARGS = 0;

  /**
   * The number of structural features of the '<em>real arg list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_ARG_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.bin_exprImpl <em>bin expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.bin_exprImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getbin_expr()
   * @generated
   */
  int BIN_EXPR = 29;

  /**
   * The number of structural features of the '<em>bin expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIN_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.AliasTypeImpl <em>Alias Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.AliasTypeImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getAliasType()
   * @generated
   */
  int ALIAS_TYPE = 30;

  /**
   * The feature id for the '<em><b>Referenced</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_TYPE__REFERENCED = 0;

  /**
   * The number of structural features of the '<em>Alias Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.FlattenGeneratedItemImpl <em>Flatten Generated Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.FlattenGeneratedItemImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getFlattenGeneratedItem()
   * @generated
   */
  int FLATTEN_GENERATED_ITEM = 31;

  /**
   * The number of structural features of the '<em>Flatten Generated Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLATTEN_GENERATED_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.DefaultClauseImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDefaultClause()
   * @generated
   */
  int DEFAULT_CLAUSE = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CLAUSE__NAME = DEFINE_STATEMENT__NAME;

  /**
   * The number of structural features of the '<em>Default Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_CLAUSE_FEATURE_COUNT = DEFINE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.DeclareClauseImpl <em>Declare Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.DeclareClauseImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDeclareClause()
   * @generated
   */
  int DECLARE_CLAUSE = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARE_CLAUSE__NAME = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Declare Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARE_CLAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.DefineClauseImpl <em>Define Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.DefineClauseImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDefineClause()
   * @generated
   */
  int DEFINE_CLAUSE = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_CLAUSE__NAME = DEFINE_STATEMENT__NAME;

  /**
   * The number of structural features of the '<em>Define Clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_CLAUSE_FEATURE_COUNT = DEFINE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.group_item_listImpl <em>group item list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.group_item_listImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getgroup_item_list()
   * @generated
   */
  int GROUP_ITEM_LIST = 35;

  /**
   * The number of structural features of the '<em>group item list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ITEM_LIST_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.rel_listImpl <em>rel list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.rel_listImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getrel_list()
   * @generated
   */
  int REL_LIST = 36;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LIST__TYPE = 0;

  /**
   * The number of structural features of the '<em>rel list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.join_sub_clauseImpl <em>join sub clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.join_sub_clauseImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_sub_clause()
   * @generated
   */
  int JOIN_SUB_CLAUSE = 37;

  /**
   * The number of structural features of the '<em>join sub clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_SUB_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.join_itemImpl <em>join item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.join_itemImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_item()
   * @generated
   */
  int JOIN_ITEM = 38;

  /**
   * The feature id for the '<em><b>Others</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_ITEM__OTHERS = JOIN_SUB_CLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_ITEM__TYPE = JOIN_SUB_CLAUSE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_ITEM__EXPRESSIONS = JOIN_SUB_CLAUSE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>join item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_ITEM_FEATURE_COUNT = JOIN_SUB_CLAUSE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.group_itemImpl <em>group item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.group_itemImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getgroup_item()
   * @generated
   */
  int GROUP_ITEM = 39;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ITEM__ITEMS = GROUP_ITEM_LIST_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>group item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_ITEM_FEATURE_COUNT = GROUP_ITEM_LIST_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.join_group_by_clauseImpl <em>join group by clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.join_group_by_clauseImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_group_by_clause()
   * @generated
   */
  int JOIN_GROUP_BY_CLAUSE = 40;

  /**
   * The number of structural features of the '<em>join group by clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_CLAUSE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.join_group_by_expr_listImpl <em>join group by expr list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.join_group_by_expr_listImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_group_by_expr_list()
   * @generated
   */
  int JOIN_GROUP_BY_EXPR_LIST = 41;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR_LIST__ITEMS = GROUP_ITEM__ITEMS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR_LIST__LEFT = GROUP_ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS = GROUP_ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>join group by expr list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR_LIST_FEATURE_COUNT = GROUP_ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.join_group_by_exprImpl <em>join group by expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.join_group_by_exprImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_group_by_expr()
   * @generated
   */
  int JOIN_GROUP_BY_EXPR = 42;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR__ITEMS = JOIN_GROUP_BY_EXPR_LIST__ITEMS;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR__LEFT = JOIN_GROUP_BY_EXPR_LIST__LEFT;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR__EXPRESSIONS = JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS;

  /**
   * The number of structural features of the '<em>join group by expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_GROUP_BY_EXPR_FEATURE_COUNT = JOIN_GROUP_BY_EXPR_LIST_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.nested_blkImpl <em>nested blk</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.nested_blkImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_blk()
   * @generated
   */
  int NESTED_BLK = 43;

  /**
   * The number of structural features of the '<em>nested blk</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_BLK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.generate_clauseImpl <em>generate clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.generate_clauseImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getgenerate_clause()
   * @generated
   */
  int GENERATE_CLAUSE = 44;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_CLAUSE__ITEMS = 0;

  /**
   * The number of structural features of the '<em>generate clause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATE_CLAUSE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.nested_command_listImpl <em>nested command list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.nested_command_listImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_command_list()
   * @generated
   */
  int NESTED_COMMAND_LIST = 45;

  /**
   * The feature id for the '<em><b>Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_COMMAND_LIST__CLAUSES = NESTED_BLK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cmds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_COMMAND_LIST__CMDS = NESTED_BLK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>nested command list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_COMMAND_LIST_FEATURE_COUNT = NESTED_BLK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.nested_commandImpl <em>nested command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.nested_commandImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_command()
   * @generated
   */
  int NESTED_COMMAND = 46;

  /**
   * The number of structural features of the '<em>nested command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.nested_opImpl <em>nested op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.nested_opImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_op()
   * @generated
   */
  int NESTED_OP = 47;

  /**
   * The number of structural features of the '<em>nested op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_OP_FEATURE_COUNT = NESTED_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.NestedFilterImpl <em>Nested Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.NestedFilterImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getNestedFilter()
   * @generated
   */
  int NESTED_FILTER = 48;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER__EXP = NESTED_OP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER__COND = NESTED_OP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER_FEATURE_COUNT = NESTED_OP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.nested_sortImpl <em>nested sort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.nested_sortImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_sort()
   * @generated
   */
  int NESTED_SORT = 49;

  /**
   * The number of structural features of the '<em>nested sort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_SORT_FEATURE_COUNT = NESTED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.nested_distinctImpl <em>nested distinct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.nested_distinctImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_distinct()
   * @generated
   */
  int NESTED_DISTINCT = 50;

  /**
   * The number of structural features of the '<em>nested distinct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_DISTINCT_FEATURE_COUNT = NESTED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.nested_limitImpl <em>nested limit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.nested_limitImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_limit()
   * @generated
   */
  int NESTED_LIMIT = 51;

  /**
   * The number of structural features of the '<em>nested limit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_LIMIT_FEATURE_COUNT = NESTED_OP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.split_branchImpl <em>split branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.split_branchImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getsplit_branch()
   * @generated
   */
  int SPLIT_BRANCH = 52;

  /**
   * The number of structural features of the '<em>split branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPLIT_BRANCH_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.OrConditionImpl <em>Or Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.OrConditionImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getOrCondition()
   * @generated
   */
  int OR_CONDITION = 53;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION__LEFT_EXP = CONDITION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION__RIGHT_EXP = CONDITION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION__LEFT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION__RIGHT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.AndConditionImpl <em>And Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.AndConditionImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getAndCondition()
   * @generated
   */
  int AND_CONDITION = 54;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION__LEFT_EXP = CONDITION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION__RIGHT_EXP = CONDITION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION__LEFT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION__RIGHT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.apache.pigeditor.pig.impl.UnaryConditionImpl <em>Unary Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.apache.pigeditor.pig.impl.UnaryConditionImpl
   * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getUnaryCondition()
   * @generated
   */
  int UNARY_CONDITION = 55;

  /**
   * The feature id for the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION__LEFT_EXP = CONDITION__LEFT_EXP;

  /**
   * The feature id for the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION__RIGHT_EXP = CONDITION__RIGHT_EXP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION__LEFT = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION__RIGHT = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see org.apache.pigeditor.pig.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.apache.pigeditor.pig.Query#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.apache.pigeditor.pig.Query#getElements()
   * @see #getQuery()
   * @generated
   */
  EReference getQuery_Elements();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.apache.pigeditor.pig.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.DefineStatement <em>Define Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define Statement</em>'.
   * @see org.apache.pigeditor.pig.DefineStatement
   * @generated
   */
  EClass getDefineStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.DefineStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.DefineStatement#getName()
   * @see #getDefineStatement()
   * @generated
   */
  EAttribute getDefineStatement_Name();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.LoadStatement <em>Load Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Statement</em>'.
   * @see org.apache.pigeditor.pig.LoadStatement
   * @generated
   */
  EClass getLoadStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.LoadStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.LoadStatement#getName()
   * @see #getLoadStatement()
   * @generated
   */
  EAttribute getLoadStatement_Name();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.ForeachStatement <em>Foreach Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreach Statement</em>'.
   * @see org.apache.pigeditor.pig.ForeachStatement
   * @generated
   */
  EClass getForeachStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.ForeachStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.ForeachStatement#getName()
   * @see #getForeachStatement()
   * @generated
   */
  EAttribute getForeachStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.ForeachStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.ForeachStatement#getType()
   * @see #getForeachStatement()
   * @generated
   */
  EReference getForeachStatement_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.apache.pigeditor.pig.ForeachStatement#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.apache.pigeditor.pig.ForeachStatement#getItems()
   * @see #getForeachStatement()
   * @generated
   */
  EReference getForeachStatement_Items();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.FilterStatement <em>Filter Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Statement</em>'.
   * @see org.apache.pigeditor.pig.FilterStatement
   * @generated
   */
  EClass getFilterStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.FilterStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.FilterStatement#getName()
   * @see #getFilterStatement()
   * @generated
   */
  EAttribute getFilterStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.FilterStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.FilterStatement#getType()
   * @see #getFilterStatement()
   * @generated
   */
  EReference getFilterStatement_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.FilterStatement#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.apache.pigeditor.pig.FilterStatement#getCond()
   * @see #getFilterStatement()
   * @generated
   */
  EReference getFilterStatement_Cond();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.GroupByStatement <em>Group By Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group By Statement</em>'.
   * @see org.apache.pigeditor.pig.GroupByStatement
   * @generated
   */
  EClass getGroupByStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.GroupByStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.GroupByStatement#getName()
   * @see #getGroupByStatement()
   * @generated
   */
  EAttribute getGroupByStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.GroupByStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.GroupByStatement#getType()
   * @see #getGroupByStatement()
   * @generated
   */
  EReference getGroupByStatement_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.GroupByStatement#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Items</em>'.
   * @see org.apache.pigeditor.pig.GroupByStatement#getItems()
   * @see #getGroupByStatement()
   * @generated
   */
  EReference getGroupByStatement_Items();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.CoGroupByStatement <em>Co Group By Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Co Group By Statement</em>'.
   * @see org.apache.pigeditor.pig.CoGroupByStatement
   * @generated
   */
  EClass getCoGroupByStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.CoGroupByStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.CoGroupByStatement#getName()
   * @see #getCoGroupByStatement()
   * @generated
   */
  EAttribute getCoGroupByStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.CoGroupByStatement#getAliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aliases</em>'.
   * @see org.apache.pigeditor.pig.CoGroupByStatement#getAliases()
   * @see #getCoGroupByStatement()
   * @generated
   */
  EReference getCoGroupByStatement_Aliases();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.OrderStatement <em>Order Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Order Statement</em>'.
   * @see org.apache.pigeditor.pig.OrderStatement
   * @generated
   */
  EClass getOrderStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.OrderStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.OrderStatement#getName()
   * @see #getOrderStatement()
   * @generated
   */
  EAttribute getOrderStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.OrderStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.OrderStatement#getType()
   * @see #getOrderStatement()
   * @generated
   */
  EReference getOrderStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.CrossStatement <em>Cross Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cross Statement</em>'.
   * @see org.apache.pigeditor.pig.CrossStatement
   * @generated
   */
  EClass getCrossStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.CrossStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.CrossStatement#getName()
   * @see #getCrossStatement()
   * @generated
   */
  EAttribute getCrossStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.CrossStatement#getAliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aliases</em>'.
   * @see org.apache.pigeditor.pig.CrossStatement#getAliases()
   * @see #getCrossStatement()
   * @generated
   */
  EReference getCrossStatement_Aliases();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.UnionStatement <em>Union Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Statement</em>'.
   * @see org.apache.pigeditor.pig.UnionStatement
   * @generated
   */
  EClass getUnionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.UnionStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.UnionStatement#getName()
   * @see #getUnionStatement()
   * @generated
   */
  EAttribute getUnionStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.UnionStatement#getAliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aliases</em>'.
   * @see org.apache.pigeditor.pig.UnionStatement#getAliases()
   * @see #getUnionStatement()
   * @generated
   */
  EReference getUnionStatement_Aliases();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.JoinStatement <em>Join Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Statement</em>'.
   * @see org.apache.pigeditor.pig.JoinStatement
   * @generated
   */
  EClass getJoinStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.JoinStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.JoinStatement#getName()
   * @see #getJoinStatement()
   * @generated
   */
  EAttribute getJoinStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.JoinStatement#getAliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aliases</em>'.
   * @see org.apache.pigeditor.pig.JoinStatement#getAliases()
   * @see #getJoinStatement()
   * @generated
   */
  EReference getJoinStatement_Aliases();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.LimitStatement <em>Limit Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Limit Statement</em>'.
   * @see org.apache.pigeditor.pig.LimitStatement
   * @generated
   */
  EClass getLimitStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.LimitStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.LimitStatement#getName()
   * @see #getLimitStatement()
   * @generated
   */
  EAttribute getLimitStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.LimitStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.LimitStatement#getType()
   * @see #getLimitStatement()
   * @generated
   */
  EReference getLimitStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.SampleStatement <em>Sample Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sample Statement</em>'.
   * @see org.apache.pigeditor.pig.SampleStatement
   * @generated
   */
  EClass getSampleStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.SampleStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.SampleStatement#getName()
   * @see #getSampleStatement()
   * @generated
   */
  EAttribute getSampleStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.SampleStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.SampleStatement#getType()
   * @see #getSampleStatement()
   * @generated
   */
  EReference getSampleStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.DistinctStatement <em>Distinct Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distinct Statement</em>'.
   * @see org.apache.pigeditor.pig.DistinctStatement
   * @generated
   */
  EClass getDistinctStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.DistinctStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.DistinctStatement#getName()
   * @see #getDistinctStatement()
   * @generated
   */
  EAttribute getDistinctStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.DistinctStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.DistinctStatement#getType()
   * @see #getDistinctStatement()
   * @generated
   */
  EReference getDistinctStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.StreamStatement <em>Stream Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stream Statement</em>'.
   * @see org.apache.pigeditor.pig.StreamStatement
   * @generated
   */
  EClass getStreamStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.StreamStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.StreamStatement#getName()
   * @see #getStreamStatement()
   * @generated
   */
  EAttribute getStreamStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.StreamStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.StreamStatement#getType()
   * @see #getStreamStatement()
   * @generated
   */
  EReference getStreamStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.MrStatement <em>Mr Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mr Statement</em>'.
   * @see org.apache.pigeditor.pig.MrStatement
   * @generated
   */
  EClass getMrStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.MrStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.MrStatement#getName()
   * @see #getMrStatement()
   * @generated
   */
  EAttribute getMrStatement_Name();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.SplitStatement <em>Split Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Split Statement</em>'.
   * @see org.apache.pigeditor.pig.SplitStatement
   * @generated
   */
  EClass getSplitStatement();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.SplitStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.SplitStatement#getName()
   * @see #getSplitStatement()
   * @generated
   */
  EAttribute getSplitStatement_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.SplitStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.SplitStatement#getType()
   * @see #getSplitStatement()
   * @generated
   */
  EReference getSplitStatement_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.apache.pigeditor.pig.SplitStatement#getBranches <em>Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Branches</em>'.
   * @see org.apache.pigeditor.pig.SplitStatement#getBranches()
   * @see #getSplitStatement()
   * @generated
   */
  EReference getSplitStatement_Branches();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.StoreStatement <em>Store Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store Statement</em>'.
   * @see org.apache.pigeditor.pig.StoreStatement
   * @generated
   */
  EClass getStoreStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.StoreStatement#getLoad <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Load</em>'.
   * @see org.apache.pigeditor.pig.StoreStatement#getLoad()
   * @see #getStoreStatement()
   * @generated
   */
  EReference getStoreStatement_Load();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.StoreStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.StoreStatement#getType()
   * @see #getStoreStatement()
   * @generated
   */
  EReference getStoreStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.DescribeStatement <em>Describe Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Describe Statement</em>'.
   * @see org.apache.pigeditor.pig.DescribeStatement
   * @generated
   */
  EClass getDescribeStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.DescribeStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.DescribeStatement#getType()
   * @see #getDescribeStatement()
   * @generated
   */
  EReference getDescribeStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.ExplainStatement <em>Explain Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Explain Statement</em>'.
   * @see org.apache.pigeditor.pig.ExplainStatement
   * @generated
   */
  EClass getExplainStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.ExplainStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.ExplainStatement#getType()
   * @see #getExplainStatement()
   * @generated
   */
  EReference getExplainStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.DumpStatement <em>Dump Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dump Statement</em>'.
   * @see org.apache.pigeditor.pig.DumpStatement
   * @generated
   */
  EClass getDumpStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.DumpStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.DumpStatement#getType()
   * @see #getDumpStatement()
   * @generated
   */
  EReference getDumpStatement_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see org.apache.pigeditor.pig.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.Condition#getLeftExp <em>Left Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Exp</em>'.
   * @see org.apache.pigeditor.pig.Condition#getLeftExp()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_LeftExp();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.Condition#getRightExp <em>Right Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Exp</em>'.
   * @see org.apache.pigeditor.pig.Condition#getRightExp()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_RightExp();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.func_eval <em>func eval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>func eval</em>'.
   * @see org.apache.pigeditor.pig.func_eval
   * @generated
   */
  EClass getfunc_eval();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.func_eval#getArg_list <em>Arg list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg list</em>'.
   * @see org.apache.pigeditor.pig.func_eval#getArg_list()
   * @see #getfunc_eval()
   * @generated
   */
  EReference getfunc_eval_Arg_list();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.real_arg_list <em>real arg list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>real arg list</em>'.
   * @see org.apache.pigeditor.pig.real_arg_list
   * @generated
   */
  EClass getreal_arg_list();

  /**
   * Returns the meta object for the containment reference list '{@link org.apache.pigeditor.pig.real_arg_list#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.apache.pigeditor.pig.real_arg_list#getArgs()
   * @see #getreal_arg_list()
   * @generated
   */
  EReference getreal_arg_list_Args();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.real_arg <em>real arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>real arg</em>'.
   * @see org.apache.pigeditor.pig.real_arg
   * @generated
   */
  EClass getreal_arg();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.apache.pigeditor.pig.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.Expression#getMul_exp <em>Mul exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mul exp</em>'.
   * @see org.apache.pigeditor.pig.Expression#getMul_exp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Mul_exp();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.Expression#getMul_cast <em>Mul cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mul cast</em>'.
   * @see org.apache.pigeditor.pig.Expression#getMul_cast()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Mul_cast();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.var_expr <em>var expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>var expr</em>'.
   * @see org.apache.pigeditor.pig.var_expr
   * @generated
   */
  EClass getvar_expr();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.projectable_expr <em>projectable expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>projectable expr</em>'.
   * @see org.apache.pigeditor.pig.projectable_expr
   * @generated
   */
  EClass getprojectable_expr();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.bin_expr <em>bin expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>bin expr</em>'.
   * @see org.apache.pigeditor.pig.bin_expr
   * @generated
   */
  EClass getbin_expr();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.AliasType <em>Alias Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias Type</em>'.
   * @see org.apache.pigeditor.pig.AliasType
   * @generated
   */
  EClass getAliasType();

  /**
   * Returns the meta object for the reference '{@link org.apache.pigeditor.pig.AliasType#getReferenced <em>Referenced</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referenced</em>'.
   * @see org.apache.pigeditor.pig.AliasType#getReferenced()
   * @see #getAliasType()
   * @generated
   */
  EReference getAliasType_Referenced();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.FlattenGeneratedItem <em>Flatten Generated Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flatten Generated Item</em>'.
   * @see org.apache.pigeditor.pig.FlattenGeneratedItem
   * @generated
   */
  EClass getFlattenGeneratedItem();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.DefaultClause <em>Default Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Clause</em>'.
   * @see org.apache.pigeditor.pig.DefaultClause
   * @generated
   */
  EClass getDefaultClause();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.DeclareClause <em>Declare Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declare Clause</em>'.
   * @see org.apache.pigeditor.pig.DeclareClause
   * @generated
   */
  EClass getDeclareClause();

  /**
   * Returns the meta object for the attribute '{@link org.apache.pigeditor.pig.DeclareClause#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.apache.pigeditor.pig.DeclareClause#getName()
   * @see #getDeclareClause()
   * @generated
   */
  EAttribute getDeclareClause_Name();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.DefineClause <em>Define Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define Clause</em>'.
   * @see org.apache.pigeditor.pig.DefineClause
   * @generated
   */
  EClass getDefineClause();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.group_item_list <em>group item list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>group item list</em>'.
   * @see org.apache.pigeditor.pig.group_item_list
   * @generated
   */
  EClass getgroup_item_list();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.rel_list <em>rel list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rel list</em>'.
   * @see org.apache.pigeditor.pig.rel_list
   * @generated
   */
  EClass getrel_list();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.rel_list#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.rel_list#getType()
   * @see #getrel_list()
   * @generated
   */
  EReference getrel_list_Type();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.join_sub_clause <em>join sub clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>join sub clause</em>'.
   * @see org.apache.pigeditor.pig.join_sub_clause
   * @generated
   */
  EClass getjoin_sub_clause();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.join_item <em>join item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>join item</em>'.
   * @see org.apache.pigeditor.pig.join_item
   * @generated
   */
  EClass getjoin_item();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.join_item#getOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Others</em>'.
   * @see org.apache.pigeditor.pig.join_item#getOthers()
   * @see #getjoin_item()
   * @generated
   */
  EReference getjoin_item_Others();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.join_item#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.apache.pigeditor.pig.join_item#getType()
   * @see #getjoin_item()
   * @generated
   */
  EReference getjoin_item_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.join_item#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressions</em>'.
   * @see org.apache.pigeditor.pig.join_item#getExpressions()
   * @see #getjoin_item()
   * @generated
   */
  EReference getjoin_item_Expressions();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.group_item <em>group item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>group item</em>'.
   * @see org.apache.pigeditor.pig.group_item
   * @generated
   */
  EClass getgroup_item();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.group_item#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Items</em>'.
   * @see org.apache.pigeditor.pig.group_item#getItems()
   * @see #getgroup_item()
   * @generated
   */
  EReference getgroup_item_Items();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.join_group_by_clause <em>join group by clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>join group by clause</em>'.
   * @see org.apache.pigeditor.pig.join_group_by_clause
   * @generated
   */
  EClass getjoin_group_by_clause();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.join_group_by_expr_list <em>join group by expr list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>join group by expr list</em>'.
   * @see org.apache.pigeditor.pig.join_group_by_expr_list
   * @generated
   */
  EClass getjoin_group_by_expr_list();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.join_group_by_expr_list#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.apache.pigeditor.pig.join_group_by_expr_list#getLeft()
   * @see #getjoin_group_by_expr_list()
   * @generated
   */
  EReference getjoin_group_by_expr_list_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.join_group_by_expr_list#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expressions</em>'.
   * @see org.apache.pigeditor.pig.join_group_by_expr_list#getExpressions()
   * @see #getjoin_group_by_expr_list()
   * @generated
   */
  EReference getjoin_group_by_expr_list_Expressions();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.join_group_by_expr <em>join group by expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>join group by expr</em>'.
   * @see org.apache.pigeditor.pig.join_group_by_expr
   * @generated
   */
  EClass getjoin_group_by_expr();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.nested_blk <em>nested blk</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nested blk</em>'.
   * @see org.apache.pigeditor.pig.nested_blk
   * @generated
   */
  EClass getnested_blk();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.generate_clause <em>generate clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>generate clause</em>'.
   * @see org.apache.pigeditor.pig.generate_clause
   * @generated
   */
  EClass getgenerate_clause();

  /**
   * Returns the meta object for the containment reference list '{@link org.apache.pigeditor.pig.generate_clause#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.apache.pigeditor.pig.generate_clause#getItems()
   * @see #getgenerate_clause()
   * @generated
   */
  EReference getgenerate_clause_Items();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.nested_command_list <em>nested command list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nested command list</em>'.
   * @see org.apache.pigeditor.pig.nested_command_list
   * @generated
   */
  EClass getnested_command_list();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.nested_command_list#getClauses <em>Clauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clauses</em>'.
   * @see org.apache.pigeditor.pig.nested_command_list#getClauses()
   * @see #getnested_command_list()
   * @generated
   */
  EReference getnested_command_list_Clauses();

  /**
   * Returns the meta object for the containment reference list '{@link org.apache.pigeditor.pig.nested_command_list#getCmds <em>Cmds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cmds</em>'.
   * @see org.apache.pigeditor.pig.nested_command_list#getCmds()
   * @see #getnested_command_list()
   * @generated
   */
  EReference getnested_command_list_Cmds();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.nested_command <em>nested command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nested command</em>'.
   * @see org.apache.pigeditor.pig.nested_command
   * @generated
   */
  EClass getnested_command();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.nested_op <em>nested op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nested op</em>'.
   * @see org.apache.pigeditor.pig.nested_op
   * @generated
   */
  EClass getnested_op();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.NestedFilter <em>Nested Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Filter</em>'.
   * @see org.apache.pigeditor.pig.NestedFilter
   * @generated
   */
  EClass getNestedFilter();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.NestedFilter#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.apache.pigeditor.pig.NestedFilter#getExp()
   * @see #getNestedFilter()
   * @generated
   */
  EReference getNestedFilter_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.NestedFilter#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see org.apache.pigeditor.pig.NestedFilter#getCond()
   * @see #getNestedFilter()
   * @generated
   */
  EReference getNestedFilter_Cond();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.nested_sort <em>nested sort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nested sort</em>'.
   * @see org.apache.pigeditor.pig.nested_sort
   * @generated
   */
  EClass getnested_sort();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.nested_distinct <em>nested distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nested distinct</em>'.
   * @see org.apache.pigeditor.pig.nested_distinct
   * @generated
   */
  EClass getnested_distinct();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.nested_limit <em>nested limit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>nested limit</em>'.
   * @see org.apache.pigeditor.pig.nested_limit
   * @generated
   */
  EClass getnested_limit();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.split_branch <em>split branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>split branch</em>'.
   * @see org.apache.pigeditor.pig.split_branch
   * @generated
   */
  EClass getsplit_branch();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.OrCondition <em>Or Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Condition</em>'.
   * @see org.apache.pigeditor.pig.OrCondition
   * @generated
   */
  EClass getOrCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.OrCondition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.apache.pigeditor.pig.OrCondition#getLeft()
   * @see #getOrCondition()
   * @generated
   */
  EReference getOrCondition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.OrCondition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.apache.pigeditor.pig.OrCondition#getRight()
   * @see #getOrCondition()
   * @generated
   */
  EReference getOrCondition_Right();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.AndCondition <em>And Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Condition</em>'.
   * @see org.apache.pigeditor.pig.AndCondition
   * @generated
   */
  EClass getAndCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.AndCondition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.apache.pigeditor.pig.AndCondition#getLeft()
   * @see #getAndCondition()
   * @generated
   */
  EReference getAndCondition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.AndCondition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.apache.pigeditor.pig.AndCondition#getRight()
   * @see #getAndCondition()
   * @generated
   */
  EReference getAndCondition_Right();

  /**
   * Returns the meta object for class '{@link org.apache.pigeditor.pig.UnaryCondition <em>Unary Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Condition</em>'.
   * @see org.apache.pigeditor.pig.UnaryCondition
   * @generated
   */
  EClass getUnaryCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.UnaryCondition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.apache.pigeditor.pig.UnaryCondition#getLeft()
   * @see #getUnaryCondition()
   * @generated
   */
  EReference getUnaryCondition_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.apache.pigeditor.pig.UnaryCondition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.apache.pigeditor.pig.UnaryCondition#getRight()
   * @see #getUnaryCondition()
   * @generated
   */
  EReference getUnaryCondition_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PigFactory getPigFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.QueryImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUERY__ELEMENTS = eINSTANCE.getQuery_Elements();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.StatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.DefineStatementImpl <em>Define Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.DefineStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDefineStatement()
     * @generated
     */
    EClass DEFINE_STATEMENT = eINSTANCE.getDefineStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE_STATEMENT__NAME = eINSTANCE.getDefineStatement_Name();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.LoadStatementImpl <em>Load Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.LoadStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getLoadStatement()
     * @generated
     */
    EClass LOAD_STATEMENT = eINSTANCE.getLoadStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_STATEMENT__NAME = eINSTANCE.getLoadStatement_Name();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.ForeachStatementImpl <em>Foreach Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.ForeachStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getForeachStatement()
     * @generated
     */
    EClass FOREACH_STATEMENT = eINSTANCE.getForeachStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOREACH_STATEMENT__NAME = eINSTANCE.getForeachStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_STATEMENT__TYPE = eINSTANCE.getForeachStatement_Type();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOREACH_STATEMENT__ITEMS = eINSTANCE.getForeachStatement_Items();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.FilterStatementImpl <em>Filter Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.FilterStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getFilterStatement()
     * @generated
     */
    EClass FILTER_STATEMENT = eINSTANCE.getFilterStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILTER_STATEMENT__NAME = eINSTANCE.getFilterStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_STATEMENT__TYPE = eINSTANCE.getFilterStatement_Type();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILTER_STATEMENT__COND = eINSTANCE.getFilterStatement_Cond();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.GroupByStatementImpl <em>Group By Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.GroupByStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getGroupByStatement()
     * @generated
     */
    EClass GROUP_BY_STATEMENT = eINSTANCE.getGroupByStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP_BY_STATEMENT__NAME = eINSTANCE.getGroupByStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_STATEMENT__TYPE = eINSTANCE.getGroupByStatement_Type();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_BY_STATEMENT__ITEMS = eINSTANCE.getGroupByStatement_Items();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.CoGroupByStatementImpl <em>Co Group By Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.CoGroupByStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getCoGroupByStatement()
     * @generated
     */
    EClass CO_GROUP_BY_STATEMENT = eINSTANCE.getCoGroupByStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CO_GROUP_BY_STATEMENT__NAME = eINSTANCE.getCoGroupByStatement_Name();

    /**
     * The meta object literal for the '<em><b>Aliases</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CO_GROUP_BY_STATEMENT__ALIASES = eINSTANCE.getCoGroupByStatement_Aliases();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.OrderStatementImpl <em>Order Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.OrderStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getOrderStatement()
     * @generated
     */
    EClass ORDER_STATEMENT = eINSTANCE.getOrderStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORDER_STATEMENT__NAME = eINSTANCE.getOrderStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORDER_STATEMENT__TYPE = eINSTANCE.getOrderStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.CrossStatementImpl <em>Cross Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.CrossStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getCrossStatement()
     * @generated
     */
    EClass CROSS_STATEMENT = eINSTANCE.getCrossStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CROSS_STATEMENT__NAME = eINSTANCE.getCrossStatement_Name();

    /**
     * The meta object literal for the '<em><b>Aliases</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CROSS_STATEMENT__ALIASES = eINSTANCE.getCrossStatement_Aliases();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.UnionStatementImpl <em>Union Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.UnionStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getUnionStatement()
     * @generated
     */
    EClass UNION_STATEMENT = eINSTANCE.getUnionStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNION_STATEMENT__NAME = eINSTANCE.getUnionStatement_Name();

    /**
     * The meta object literal for the '<em><b>Aliases</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNION_STATEMENT__ALIASES = eINSTANCE.getUnionStatement_Aliases();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.JoinStatementImpl <em>Join Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.JoinStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getJoinStatement()
     * @generated
     */
    EClass JOIN_STATEMENT = eINSTANCE.getJoinStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOIN_STATEMENT__NAME = eINSTANCE.getJoinStatement_Name();

    /**
     * The meta object literal for the '<em><b>Aliases</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_STATEMENT__ALIASES = eINSTANCE.getJoinStatement_Aliases();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.LimitStatementImpl <em>Limit Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.LimitStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getLimitStatement()
     * @generated
     */
    EClass LIMIT_STATEMENT = eINSTANCE.getLimitStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIMIT_STATEMENT__NAME = eINSTANCE.getLimitStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIMIT_STATEMENT__TYPE = eINSTANCE.getLimitStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.SampleStatementImpl <em>Sample Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.SampleStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getSampleStatement()
     * @generated
     */
    EClass SAMPLE_STATEMENT = eINSTANCE.getSampleStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SAMPLE_STATEMENT__NAME = eINSTANCE.getSampleStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAMPLE_STATEMENT__TYPE = eINSTANCE.getSampleStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.DistinctStatementImpl <em>Distinct Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.DistinctStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDistinctStatement()
     * @generated
     */
    EClass DISTINCT_STATEMENT = eINSTANCE.getDistinctStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTINCT_STATEMENT__NAME = eINSTANCE.getDistinctStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISTINCT_STATEMENT__TYPE = eINSTANCE.getDistinctStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.StreamStatementImpl <em>Stream Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.StreamStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getStreamStatement()
     * @generated
     */
    EClass STREAM_STATEMENT = eINSTANCE.getStreamStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STREAM_STATEMENT__NAME = eINSTANCE.getStreamStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STREAM_STATEMENT__TYPE = eINSTANCE.getStreamStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.MrStatementImpl <em>Mr Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.MrStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getMrStatement()
     * @generated
     */
    EClass MR_STATEMENT = eINSTANCE.getMrStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MR_STATEMENT__NAME = eINSTANCE.getMrStatement_Name();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.SplitStatementImpl <em>Split Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.SplitStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getSplitStatement()
     * @generated
     */
    EClass SPLIT_STATEMENT = eINSTANCE.getSplitStatement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPLIT_STATEMENT__NAME = eINSTANCE.getSplitStatement_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_STATEMENT__TYPE = eINSTANCE.getSplitStatement_Type();

    /**
     * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPLIT_STATEMENT__BRANCHES = eINSTANCE.getSplitStatement_Branches();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.StoreStatementImpl <em>Store Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.StoreStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getStoreStatement()
     * @generated
     */
    EClass STORE_STATEMENT = eINSTANCE.getStoreStatement();

    /**
     * The meta object literal for the '<em><b>Load</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE_STATEMENT__LOAD = eINSTANCE.getStoreStatement_Load();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE_STATEMENT__TYPE = eINSTANCE.getStoreStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.DescribeStatementImpl <em>Describe Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.DescribeStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDescribeStatement()
     * @generated
     */
    EClass DESCRIBE_STATEMENT = eINSTANCE.getDescribeStatement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIBE_STATEMENT__TYPE = eINSTANCE.getDescribeStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.ExplainStatementImpl <em>Explain Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.ExplainStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getExplainStatement()
     * @generated
     */
    EClass EXPLAIN_STATEMENT = eINSTANCE.getExplainStatement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPLAIN_STATEMENT__TYPE = eINSTANCE.getExplainStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.DumpStatementImpl <em>Dump Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.DumpStatementImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDumpStatement()
     * @generated
     */
    EClass DUMP_STATEMENT = eINSTANCE.getDumpStatement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUMP_STATEMENT__TYPE = eINSTANCE.getDumpStatement_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.ConditionImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Left Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__LEFT_EXP = eINSTANCE.getCondition_LeftExp();

    /**
     * The meta object literal for the '<em><b>Right Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__RIGHT_EXP = eINSTANCE.getCondition_RightExp();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.func_evalImpl <em>func eval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.func_evalImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getfunc_eval()
     * @generated
     */
    EClass FUNC_EVAL = eINSTANCE.getfunc_eval();

    /**
     * The meta object literal for the '<em><b>Arg list</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNC_EVAL__ARG_LIST = eINSTANCE.getfunc_eval_Arg_list();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.real_arg_listImpl <em>real arg list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.real_arg_listImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getreal_arg_list()
     * @generated
     */
    EClass REAL_ARG_LIST = eINSTANCE.getreal_arg_list();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REAL_ARG_LIST__ARGS = eINSTANCE.getreal_arg_list_Args();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.real_argImpl <em>real arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.real_argImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getreal_arg()
     * @generated
     */
    EClass REAL_ARG = eINSTANCE.getreal_arg();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.ExpressionImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Mul exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__MUL_EXP = eINSTANCE.getExpression_Mul_exp();

    /**
     * The meta object literal for the '<em><b>Mul cast</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__MUL_CAST = eINSTANCE.getExpression_Mul_cast();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.var_exprImpl <em>var expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.var_exprImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getvar_expr()
     * @generated
     */
    EClass VAR_EXPR = eINSTANCE.getvar_expr();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.projectable_exprImpl <em>projectable expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.projectable_exprImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getprojectable_expr()
     * @generated
     */
    EClass PROJECTABLE_EXPR = eINSTANCE.getprojectable_expr();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.bin_exprImpl <em>bin expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.bin_exprImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getbin_expr()
     * @generated
     */
    EClass BIN_EXPR = eINSTANCE.getbin_expr();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.AliasTypeImpl <em>Alias Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.AliasTypeImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getAliasType()
     * @generated
     */
    EClass ALIAS_TYPE = eINSTANCE.getAliasType();

    /**
     * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS_TYPE__REFERENCED = eINSTANCE.getAliasType_Referenced();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.FlattenGeneratedItemImpl <em>Flatten Generated Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.FlattenGeneratedItemImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getFlattenGeneratedItem()
     * @generated
     */
    EClass FLATTEN_GENERATED_ITEM = eINSTANCE.getFlattenGeneratedItem();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.DefaultClauseImpl <em>Default Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.DefaultClauseImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDefaultClause()
     * @generated
     */
    EClass DEFAULT_CLAUSE = eINSTANCE.getDefaultClause();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.DeclareClauseImpl <em>Declare Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.DeclareClauseImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDeclareClause()
     * @generated
     */
    EClass DECLARE_CLAUSE = eINSTANCE.getDeclareClause();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARE_CLAUSE__NAME = eINSTANCE.getDeclareClause_Name();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.DefineClauseImpl <em>Define Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.DefineClauseImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getDefineClause()
     * @generated
     */
    EClass DEFINE_CLAUSE = eINSTANCE.getDefineClause();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.group_item_listImpl <em>group item list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.group_item_listImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getgroup_item_list()
     * @generated
     */
    EClass GROUP_ITEM_LIST = eINSTANCE.getgroup_item_list();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.rel_listImpl <em>rel list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.rel_listImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getrel_list()
     * @generated
     */
    EClass REL_LIST = eINSTANCE.getrel_list();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_LIST__TYPE = eINSTANCE.getrel_list_Type();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.join_sub_clauseImpl <em>join sub clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.join_sub_clauseImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_sub_clause()
     * @generated
     */
    EClass JOIN_SUB_CLAUSE = eINSTANCE.getjoin_sub_clause();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.join_itemImpl <em>join item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.join_itemImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_item()
     * @generated
     */
    EClass JOIN_ITEM = eINSTANCE.getjoin_item();

    /**
     * The meta object literal for the '<em><b>Others</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_ITEM__OTHERS = eINSTANCE.getjoin_item_Others();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_ITEM__TYPE = eINSTANCE.getjoin_item_Type();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_ITEM__EXPRESSIONS = eINSTANCE.getjoin_item_Expressions();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.group_itemImpl <em>group item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.group_itemImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getgroup_item()
     * @generated
     */
    EClass GROUP_ITEM = eINSTANCE.getgroup_item();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP_ITEM__ITEMS = eINSTANCE.getgroup_item_Items();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.join_group_by_clauseImpl <em>join group by clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.join_group_by_clauseImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_group_by_clause()
     * @generated
     */
    EClass JOIN_GROUP_BY_CLAUSE = eINSTANCE.getjoin_group_by_clause();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.join_group_by_expr_listImpl <em>join group by expr list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.join_group_by_expr_listImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_group_by_expr_list()
     * @generated
     */
    EClass JOIN_GROUP_BY_EXPR_LIST = eINSTANCE.getjoin_group_by_expr_list();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_GROUP_BY_EXPR_LIST__LEFT = eINSTANCE.getjoin_group_by_expr_list_Left();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS = eINSTANCE.getjoin_group_by_expr_list_Expressions();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.join_group_by_exprImpl <em>join group by expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.join_group_by_exprImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getjoin_group_by_expr()
     * @generated
     */
    EClass JOIN_GROUP_BY_EXPR = eINSTANCE.getjoin_group_by_expr();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.nested_blkImpl <em>nested blk</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.nested_blkImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_blk()
     * @generated
     */
    EClass NESTED_BLK = eINSTANCE.getnested_blk();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.generate_clauseImpl <em>generate clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.generate_clauseImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getgenerate_clause()
     * @generated
     */
    EClass GENERATE_CLAUSE = eINSTANCE.getgenerate_clause();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATE_CLAUSE__ITEMS = eINSTANCE.getgenerate_clause_Items();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.nested_command_listImpl <em>nested command list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.nested_command_listImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_command_list()
     * @generated
     */
    EClass NESTED_COMMAND_LIST = eINSTANCE.getnested_command_list();

    /**
     * The meta object literal for the '<em><b>Clauses</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_COMMAND_LIST__CLAUSES = eINSTANCE.getnested_command_list_Clauses();

    /**
     * The meta object literal for the '<em><b>Cmds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_COMMAND_LIST__CMDS = eINSTANCE.getnested_command_list_Cmds();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.nested_commandImpl <em>nested command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.nested_commandImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_command()
     * @generated
     */
    EClass NESTED_COMMAND = eINSTANCE.getnested_command();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.nested_opImpl <em>nested op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.nested_opImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_op()
     * @generated
     */
    EClass NESTED_OP = eINSTANCE.getnested_op();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.NestedFilterImpl <em>Nested Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.NestedFilterImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getNestedFilter()
     * @generated
     */
    EClass NESTED_FILTER = eINSTANCE.getNestedFilter();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_FILTER__EXP = eINSTANCE.getNestedFilter_Exp();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_FILTER__COND = eINSTANCE.getNestedFilter_Cond();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.nested_sortImpl <em>nested sort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.nested_sortImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_sort()
     * @generated
     */
    EClass NESTED_SORT = eINSTANCE.getnested_sort();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.nested_distinctImpl <em>nested distinct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.nested_distinctImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_distinct()
     * @generated
     */
    EClass NESTED_DISTINCT = eINSTANCE.getnested_distinct();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.nested_limitImpl <em>nested limit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.nested_limitImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getnested_limit()
     * @generated
     */
    EClass NESTED_LIMIT = eINSTANCE.getnested_limit();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.split_branchImpl <em>split branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.split_branchImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getsplit_branch()
     * @generated
     */
    EClass SPLIT_BRANCH = eINSTANCE.getsplit_branch();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.OrConditionImpl <em>Or Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.OrConditionImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getOrCondition()
     * @generated
     */
    EClass OR_CONDITION = eINSTANCE.getOrCondition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_CONDITION__LEFT = eINSTANCE.getOrCondition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_CONDITION__RIGHT = eINSTANCE.getOrCondition_Right();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.AndConditionImpl <em>And Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.AndConditionImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getAndCondition()
     * @generated
     */
    EClass AND_CONDITION = eINSTANCE.getAndCondition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_CONDITION__LEFT = eINSTANCE.getAndCondition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_CONDITION__RIGHT = eINSTANCE.getAndCondition_Right();

    /**
     * The meta object literal for the '{@link org.apache.pigeditor.pig.impl.UnaryConditionImpl <em>Unary Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.apache.pigeditor.pig.impl.UnaryConditionImpl
     * @see org.apache.pigeditor.pig.impl.PigPackageImpl#getUnaryCondition()
     * @generated
     */
    EClass UNARY_CONDITION = eINSTANCE.getUnaryCondition();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_CONDITION__LEFT = eINSTANCE.getUnaryCondition_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_CONDITION__RIGHT = eINSTANCE.getUnaryCondition_Right();

  }

} //PigPackage
