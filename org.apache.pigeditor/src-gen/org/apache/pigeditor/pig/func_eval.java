/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>func eval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.func_eval#getArg_list <em>Arg list</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getfunc_eval()
 * @model
 * @generated
 */
public interface func_eval extends projectable_expr
{
  /**
   * Returns the value of the '<em><b>Arg list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg list</em>' containment reference.
   * @see #setArg_list(real_arg_list)
   * @see org.apache.pigeditor.pig.PigPackage#getfunc_eval_Arg_list()
   * @model containment="true"
   * @generated
   */
  real_arg_list getArg_list();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.func_eval#getArg_list <em>Arg list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg list</em>' containment reference.
   * @see #getArg_list()
   * @generated
   */
  void setArg_list(real_arg_list value);

} // func_eval
