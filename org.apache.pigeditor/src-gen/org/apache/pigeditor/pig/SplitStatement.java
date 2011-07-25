/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.SplitStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.SplitStatement#getType <em>Type</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.SplitStatement#getBranches <em>Branches</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getSplitStatement()
 * @model
 * @generated
 */
public interface SplitStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.apache.pigeditor.pig.PigPackage#getSplitStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.SplitStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AliasType)
   * @see org.apache.pigeditor.pig.PigPackage#getSplitStatement_Type()
   * @model containment="true"
   * @generated
   */
  AliasType getType();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.SplitStatement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AliasType value);

  /**
   * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
   * The list contents are of type {@link org.apache.pigeditor.pig.split_branch}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Branches</em>' containment reference list.
   * @see org.apache.pigeditor.pig.PigPackage#getSplitStatement_Branches()
   * @model containment="true"
   * @generated
   */
  EList<split_branch> getBranches();

} // SplitStatement
