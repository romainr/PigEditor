/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.StoreStatement#getLoad <em>Load</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.StoreStatement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.apache.pigeditor.pig.PigPackage#getStoreStatement()
 * @model
 * @generated
 */
public interface StoreStatement extends Statement, MrStatement
{
  /**
   * Returns the value of the '<em><b>Load</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Load</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Load</em>' containment reference.
   * @see #setLoad(LoadStatement)
   * @see org.apache.pigeditor.pig.PigPackage#getStoreStatement_Load()
   * @model containment="true"
   * @generated
   */
  LoadStatement getLoad();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.StoreStatement#getLoad <em>Load</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Load</em>' containment reference.
   * @see #getLoad()
   * @generated
   */
  void setLoad(LoadStatement value);

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
   * @see org.apache.pigeditor.pig.PigPackage#getStoreStatement_Type()
   * @model containment="true"
   * @generated
   */
  AliasType getType();

  /**
   * Sets the value of the '{@link org.apache.pigeditor.pig.StoreStatement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AliasType value);

} // StoreStatement
