/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import java.util.Collection;

import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.generate_clause;
import org.apache.pigeditor.pig.nested_command;
import org.apache.pigeditor.pig.nested_command_list;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>nested command list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.nested_command_listImpl#getClauses <em>Clauses</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.nested_command_listImpl#getCmds <em>Cmds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class nested_command_listImpl extends nested_blkImpl implements nested_command_list
{
  /**
   * The cached value of the '{@link #getClauses() <em>Clauses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClauses()
   * @generated
   * @ordered
   */
  protected generate_clause clauses;

  /**
   * The cached value of the '{@link #getCmds() <em>Cmds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmds()
   * @generated
   * @ordered
   */
  protected EList<nested_command> cmds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected nested_command_listImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PigPackage.Literals.NESTED_COMMAND_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public generate_clause getClauses()
  {
    return clauses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClauses(generate_clause newClauses, NotificationChain msgs)
  {
    generate_clause oldClauses = clauses;
    clauses = newClauses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.NESTED_COMMAND_LIST__CLAUSES, oldClauses, newClauses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClauses(generate_clause newClauses)
  {
    if (newClauses != clauses)
    {
      NotificationChain msgs = null;
      if (clauses != null)
        msgs = ((InternalEObject)clauses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.NESTED_COMMAND_LIST__CLAUSES, null, msgs);
      if (newClauses != null)
        msgs = ((InternalEObject)newClauses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.NESTED_COMMAND_LIST__CLAUSES, null, msgs);
      msgs = basicSetClauses(newClauses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.NESTED_COMMAND_LIST__CLAUSES, newClauses, newClauses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<nested_command> getCmds()
  {
    if (cmds == null)
    {
      cmds = new EObjectContainmentEList<nested_command>(nested_command.class, this, PigPackage.NESTED_COMMAND_LIST__CMDS);
    }
    return cmds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PigPackage.NESTED_COMMAND_LIST__CLAUSES:
        return basicSetClauses(null, msgs);
      case PigPackage.NESTED_COMMAND_LIST__CMDS:
        return ((InternalEList<?>)getCmds()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PigPackage.NESTED_COMMAND_LIST__CLAUSES:
        return getClauses();
      case PigPackage.NESTED_COMMAND_LIST__CMDS:
        return getCmds();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PigPackage.NESTED_COMMAND_LIST__CLAUSES:
        setClauses((generate_clause)newValue);
        return;
      case PigPackage.NESTED_COMMAND_LIST__CMDS:
        getCmds().clear();
        getCmds().addAll((Collection<? extends nested_command>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PigPackage.NESTED_COMMAND_LIST__CLAUSES:
        setClauses((generate_clause)null);
        return;
      case PigPackage.NESTED_COMMAND_LIST__CMDS:
        getCmds().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PigPackage.NESTED_COMMAND_LIST__CLAUSES:
        return clauses != null;
      case PigPackage.NESTED_COMMAND_LIST__CMDS:
        return cmds != null && !cmds.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //nested_command_listImpl
