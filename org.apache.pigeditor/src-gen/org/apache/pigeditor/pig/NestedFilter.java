/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.NestedFilter#getExp <em>Exp</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.NestedFilter#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getNestedFilter()
 * @model
 * @generated
 */
public interface NestedFilter extends nested_op
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(var_expr)
   * @see org.apache.pigeditor.pig.PigPackage#getNestedFilter_Exp()
   * @model containment="true"
   * @generated
   */
  var_expr getExp();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.NestedFilter#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(var_expr value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Condition)
   * @see org.apache.pigeditor.pig.PigPackage#getNestedFilter_Cond()
   * @model containment="true"
   * @generated
   */
  Condition getCond();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.NestedFilter#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Condition value);

} // NestedFilter
