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
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.Query#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.apache.pigeditor.pig.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.apache.pigeditor.pig.PigPackage#getQuery_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElements();

} // Query
