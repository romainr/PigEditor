/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>generate clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.generate_clause#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getgenerate_clause()
 * @model
 * @generated
 */
public interface generate_clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.apache.pigeditor.pig.FlattenGeneratedItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.apache.pigeditor.pig.PigPackage#getgenerate_clause_Items()
   * @model containment="true"
   * @generated
   */
  EList<FlattenGeneratedItem> getItems();

} // generate_clause
