/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>group item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.group_item#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getgroup_item()
 * @model
 * @generated
 */
public interface group_item extends group_item_list
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference.
   * @see #setItems(group_item)
   * @see org.apache.pigeditor.pig.PigPackage#getgroup_item_Items()
   * @model containment="true"
   * @generated
   */
  group_item getItems();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.group_item#getItems <em>Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Items</em>' containment reference.
   * @see #getItems()
   * @generated
   */
  void setItems(group_item value);

} // group_item
