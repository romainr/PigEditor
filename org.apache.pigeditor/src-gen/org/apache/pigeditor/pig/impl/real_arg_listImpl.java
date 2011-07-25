/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import java.util.Collection;

import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.real_arg;
import org.apache.pigeditor.pig.real_arg_list;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>real arg list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.real_arg_listImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class real_arg_listImpl extends MinimalEObjectImpl.Container implements real_arg_list
{
  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<real_arg> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected real_arg_listImpl()
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
    return PigPackage.Literals.REAL_ARG_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<real_arg> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<real_arg>(real_arg.class, this, PigPackage.REAL_ARG_LIST__ARGS);
    }
    return args;
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
      case PigPackage.REAL_ARG_LIST__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
      case PigPackage.REAL_ARG_LIST__ARGS:
        return getArgs();
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
      case PigPackage.REAL_ARG_LIST__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends real_arg>)newValue);
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
      case PigPackage.REAL_ARG_LIST__ARGS:
        getArgs().clear();
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
      case PigPackage.REAL_ARG_LIST__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //real_arg_listImpl
