/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>join item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.join_item#getOthers <em>Others</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.join_item#getType <em>Type</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.join_item#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getjoin_item()
 * @model
 * @generated
 */
public interface join_item extends join_sub_clause
{
  /**
   * Returns the value of the '<em><b>Others</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others</em>' containment reference.
   * @see #setOthers(join_item)
   * @see org.apache.pigeditor.pig.PigPackage#getjoin_item_Others()
   * @model containment="true"
   * @generated
   */
  join_item getOthers();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.join_item#getOthers <em>Others</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Others</em>' containment reference.
   * @see #getOthers()
   * @generated
   */
  void setOthers(join_item value);

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
   * @see org.apache.pigeditor.pig.PigPackage#getjoin_item_Type()
   * @model containment="true"
   * @generated
   */
  AliasType getType();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.join_item#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AliasType value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(join_group_by_clause)
   * @see org.apache.pigeditor.pig.PigPackage#getjoin_item_Expressions()
   * @model containment="true"
   * @generated
   */
  join_group_by_clause getExpressions();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.join_item#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(join_group_by_clause value);

} // join_item
