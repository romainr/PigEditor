/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>join group by expr list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.join_group_by_expr_list#getLeft <em>Left</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.join_group_by_expr_list#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getjoin_group_by_expr_list()
 * @model
 * @generated
 */
public interface join_group_by_expr_list extends group_item, join_group_by_clause
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
   * @see #setLeft(join_group_by_expr)
   * @see org.apache.pigeditor.pig.PigPackage#getjoin_group_by_expr_list_Left()
   * @model containment="true"
   * @generated
   */
  join_group_by_expr getLeft();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.join_group_by_expr_list#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(join_group_by_expr value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(join_group_by_expr)
   * @see org.apache.pigeditor.pig.PigPackage#getjoin_group_by_expr_list_Expressions()
   * @model containment="true"
   * @generated
   */
  join_group_by_expr getExpressions();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.join_group_by_expr_list#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(join_group_by_expr value);

} // join_group_by_expr_list
