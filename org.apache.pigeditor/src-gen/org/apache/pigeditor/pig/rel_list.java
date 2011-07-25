/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rel list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.rel_list#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getrel_list()
 * @model
 * @generated
 */
public interface rel_list extends EObject
{
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
   * @see org.apache.pigeditor.pig.PigPackage#getrel_list_Type()
   * @model containment="true"
   * @generated
   */
  AliasType getType();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.rel_list#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AliasType value);

} // rel_list
