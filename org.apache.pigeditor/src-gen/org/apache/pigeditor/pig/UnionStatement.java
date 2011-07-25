/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.UnionStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.UnionStatement#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getUnionStatement()
 * @model
 * @generated
 */
public interface UnionStatement extends Statement
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
   * @see org.apache.pigeditor.pig.PigPackage#getUnionStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.UnionStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Aliases</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliases</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliases</em>' containment reference.
   * @see #setAliases(rel_list)
   * @see org.apache.pigeditor.pig.PigPackage#getUnionStatement_Aliases()
   * @model containment="true"
   * @generated
   */
  rel_list getAliases();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.UnionStatement#getAliases <em>Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliases</em>' containment reference.
   * @see #getAliases()
   * @generated
   */
  void setAliases(rel_list value);

} // UnionStatement
