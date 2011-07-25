/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group By Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.GroupByStatement#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.GroupByStatement#getType <em>Type</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.GroupByStatement#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getGroupByStatement()
 * @model
 * @generated
 */
public interface GroupByStatement extends Statement
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
   * @see org.apache.pigeditor.pig.PigPackage#getGroupByStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.GroupByStatement#getName <em>Name</em>}' attribute.
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
   * @see org.apache.pigeditor.pig.PigPackage#getGroupByStatement_Type()
   * @model containment="true"
   * @generated
   */
  AliasType getType();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.GroupByStatement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AliasType value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference.
   * @see #setItems(group_item_list)
   * @see org.apache.pigeditor.pig.PigPackage#getGroupByStatement_Items()
   * @model containment="true"
   * @generated
   */
  group_item_list getItems();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.GroupByStatement#getItems <em>Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Items</em>' containment reference.
   * @see #getItems()
   * @generated
   */
  void setItems(group_item_list value);

} // GroupByStatement
