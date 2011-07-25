/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nested command list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.nested_command_list#getClauses <em>Clauses</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.nested_command_list#getCmds <em>Cmds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getnested_command_list()
 * @model
 * @generated
 */
public interface nested_command_list extends nested_blk
{
  /**
   * Returns the value of the '<em><b>Clauses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clauses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clauses</em>' containment reference.
   * @see #setClauses(generate_clause)
   * @see org.apache.pigeditor.pig.PigPackage#getnested_command_list_Clauses()
   * @model containment="true"
   * @generated
   */
  generate_clause getClauses();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.nested_command_list#getClauses <em>Clauses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clauses</em>' containment reference.
   * @see #getClauses()
   * @generated
   */
  void setClauses(generate_clause value);

  /**
   * Returns the value of the '<em><b>Cmds</b></em>' containment reference list.
   * The list contents are of type {@link org.apache.pigeditor.pig.nested_command}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmds</em>' containment reference list.
   * @see org.apache.pigeditor.pig.PigPackage#getnested_command_list_Cmds()
   * @model containment="true"
   * @generated
   */
  EList<nested_command> getCmds();

} // nested_command_list
