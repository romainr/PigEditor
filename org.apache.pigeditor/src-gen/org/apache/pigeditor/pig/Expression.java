/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.Expression#getMul_exp <em>Mul exp</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.Expression#getMul_cast <em>Mul cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends Condition, join_group_by_expr, nested_op
{
  /**
   * Returns the value of the '<em><b>Mul exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mul exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mul exp</em>' containment reference.
   * @see #setMul_exp(Expression)
   * @see org.apache.pigeditor.pig.PigPackage#getExpression_Mul_exp()
   * @model containment="true"
   * @generated
   */
  Expression getMul_exp();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.Expression#getMul_exp <em>Mul exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mul exp</em>' containment reference.
   * @see #getMul_exp()
   * @generated
   */
  void setMul_exp(Expression value);

  /**
   * Returns the value of the '<em><b>Mul cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mul cast</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mul cast</em>' containment reference.
   * @see #setMul_cast(Expression)
   * @see org.apache.pigeditor.pig.PigPackage#getExpression_Mul_cast()
   * @model containment="true"
   * @generated
   */
  Expression getMul_cast();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.Expression#getMul_cast <em>Mul cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mul cast</em>' containment reference.
   * @see #getMul_cast()
   * @generated
   */
  void setMul_cast(Expression value);

} // Expression
