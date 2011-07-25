/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Co Group By Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.CoGroupByStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.CoGroupByStatement#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getCoGroupByStatement()
 * @model
 * @generated
 */
public interface CoGroupByStatement extends Statement
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
   * @see org.apache.pigeditor.pig.PigPackage#getCoGroupByStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.CoGroupByStatement#getName <em>Name</em>}' attribute.
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
   * @see #setAliases(join_sub_clause)
   * @see org.apache.pigeditor.pig.PigPackage#getCoGroupByStatement_Aliases()
   * @model containment="true"
   * @generated
   */
  join_sub_clause getAliases();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.CoGroupByStatement#getAliases <em>Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliases</em>' containment reference.
   * @see #getAliases()
   * @generated
   */
  void setAliases(join_sub_clause value);

} // CoGroupByStatement
