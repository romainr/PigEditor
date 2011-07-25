/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.AliasType#getReferenced <em>Referenced</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getAliasType()
 * @model
 * @generated
 */
public interface AliasType extends EObject
{
  /**
   * Returns the value of the '<em><b>Referenced</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced</em>' reference.
   * @see #setReferenced(Statement)
   * @see org.apache.pigeditor.pig.PigPackage#getAliasType_Referenced()
   * @model
   * @generated
   */
  Statement getReferenced();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.AliasType#getReferenced <em>Referenced</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referenced</em>' reference.
   * @see #getReferenced()
   * @generated
   */
  void setReferenced(Statement value);

} // AliasType
