/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.func_eval;
import org.apache.pigeditor.pig.real_arg_list;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>func eval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.func_evalImpl#getArg_list <em>Arg list</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class func_evalImpl extends projectable_exprImpl implements func_eval
{
  /**
   * The cached value of the '{@link #getArg_list() <em>Arg list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg_list()
   * @generated
   * @ordered
   */
  protected real_arg_list arg_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected func_evalImpl()
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
    return PigPackage.Literals.FUNC_EVAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public real_arg_list getArg_list()
  {
    return arg_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg_list(real_arg_list newArg_list, NotificationChain msgs)
  {
    real_arg_list oldArg_list = arg_list;
    arg_list = newArg_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.FUNC_EVAL__ARG_LIST, oldArg_list, newArg_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg_list(real_arg_list newArg_list)
  {
    if (newArg_list != arg_list)
    {
      NotificationChain msgs = null;
      if (arg_list != null)
        msgs = ((InternalEObject)arg_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.FUNC_EVAL__ARG_LIST, null, msgs);
      if (newArg_list != null)
        msgs = ((InternalEObject)newArg_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.FUNC_EVAL__ARG_LIST, null, msgs);
      msgs = basicSetArg_list(newArg_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.FUNC_EVAL__ARG_LIST, newArg_list, newArg_list));
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
      case PigPackage.FUNC_EVAL__ARG_LIST:
        return basicSetArg_list(null, msgs);
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
      case PigPackage.FUNC_EVAL__ARG_LIST:
        return getArg_list();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PigPackage.FUNC_EVAL__ARG_LIST:
        setArg_list((real_arg_list)newValue);
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
      case PigPackage.FUNC_EVAL__ARG_LIST:
        setArg_list((real_arg_list)null);
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
      case PigPackage.FUNC_EVAL__ARG_LIST:
        return arg_list != null;
    }
    return super.eIsSet(featureID);
  }

} //func_evalImpl
