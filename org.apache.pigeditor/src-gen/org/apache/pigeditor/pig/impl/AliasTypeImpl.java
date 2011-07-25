/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.AliasType;
import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.Statement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.AliasTypeImpl#getReferenced <em>Referenced</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasTypeImpl extends MinimalEObjectImpl.Container implements AliasType
{
  /**
   * The cached value of the '{@link #getReferenced() <em>Referenced</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenced()
   * @generated
   * @ordered
   */
  protected Statement referenced;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasTypeImpl()
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
    return PigPackage.Literals.ALIAS_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement getReferenced()
  {
    if (referenced != null && referenced.eIsProxy())
    {
      InternalEObject oldReferenced = (InternalEObject)referenced;
      referenced = (Statement)eResolveProxy(oldReferenced);
      if (referenced != oldReferenced)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PigPackage.ALIAS_TYPE__REFERENCED, oldReferenced, referenced));
      }
    }
    return referenced;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement basicGetReferenced()
  {
    return referenced;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenced(Statement newReferenced)
  {
    Statement oldReferenced = referenced;
    referenced = newReferenced;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.ALIAS_TYPE__REFERENCED, oldReferenced, referenced));
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
      case PigPackage.ALIAS_TYPE__REFERENCED:
        if (resolve) return getReferenced();
        return basicGetReferenced();
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
      case PigPackage.ALIAS_TYPE__REFERENCED:
        setReferenced((Statement)newValue);
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
      case PigPackage.ALIAS_TYPE__REFERENCED:
        setReferenced((Statement)null);
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
      case PigPackage.ALIAS_TYPE__REFERENCED:
        return referenced != null;
    }
    return super.eIsSet(featureID);
  }

} //AliasTypeImpl
