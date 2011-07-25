/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.OrCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.OrCondition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getOrCondition()
 * @model
 * @generated
 */
public interface OrCondition extends Condition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Condition)
   * @see org.apache.pigeditor.pig.PigPackage#getOrCondition_Left()
   * @model containment="true"
   * @generated
   */
  Condition getLeft();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.OrCondition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Condition value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Condition)
   * @see org.apache.pigeditor.pig.PigPackage#getOrCondition_Right()
   * @model containment="true"
   * @generated
   */
  Condition getRight();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.OrCondition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Condition value);

} // OrCondition
