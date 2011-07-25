/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.Condition#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.Condition#getRightExp <em>Right Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends real_arg, bin_expr, FlattenGeneratedItem, split_branch
{
  /**
   * Returns the value of the '<em><b>Left Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Exp</em>' containment reference.
   * @see #setLeftExp(Condition)
   * @see org.apache.pigeditor.pig.PigPackage#getCondition_LeftExp()
   * @model containment="true"
   * @generated
   */
  Condition getLeftExp();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.Condition#getLeftExp <em>Left Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Exp</em>' containment reference.
   * @see #getLeftExp()
   * @generated
   */
  void setLeftExp(Condition value);

  /**
   * Returns the value of the '<em><b>Right Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Exp</em>' containment reference.
   * @see #setRightExp(Condition)
   * @see org.apache.pigeditor.pig.PigPackage#getCondition_RightExp()
   * @model containment="true"
   * @generated
   */
  Condition getRightExp();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.Condition#getRightExp <em>Right Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Exp</em>' containment reference.
   * @see #getRightExp()
   * @generated
   */
  void setRightExp(Condition value);

} // Condition
