/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.AliasType;
import org.apache.pigeditor.pig.LoadStatement;
import org.apache.pigeditor.pig.MrStatement;
import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.StoreStatement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.StoreStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.StoreStatementImpl#getLoad <em>Load</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.StoreStatementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreStatementImpl extends StatementImpl implements StoreStatement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLoad() <em>Load</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLoad()
   * @generated
   * @ordered
   */
  protected LoadStatement load;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected AliasType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StoreStatementImpl()
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
    return PigPackage.Literals.STORE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.STORE_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoadStatement getLoad()
  {
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLoad(LoadStatement newLoad, NotificationChain msgs)
  {
    LoadStatement oldLoad = load;
    load = newLoad;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.STORE_STATEMENT__LOAD, oldLoad, newLoad);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLoad(LoadStatement newLoad)
  {
    if (newLoad != load)
    {
      NotificationChain msgs = null;
      if (load != null)
        msgs = ((InternalEObject)load).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.STORE_STATEMENT__LOAD, null, msgs);
      if (newLoad != null)
        msgs = ((InternalEObject)newLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.STORE_STATEMENT__LOAD, null, msgs);
      msgs = basicSetLoad(newLoad, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.STORE_STATEMENT__LOAD, newLoad, newLoad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(AliasType newType, NotificationChain msgs)
  {
    AliasType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.STORE_STATEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(AliasType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.STORE_STATEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.STORE_STATEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.STORE_STATEMENT__TYPE, newType, newType));
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
      case PigPackage.STORE_STATEMENT__LOAD:
        return basicSetLoad(null, msgs);
      case PigPackage.STORE_STATEMENT__TYPE:
        return basicSetType(null, msgs);
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
      case PigPackage.STORE_STATEMENT__NAME:
        return getName();
      case PigPackage.STORE_STATEMENT__LOAD:
        return getLoad();
      case PigPackage.STORE_STATEMENT__TYPE:
        return getType();
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
      case PigPackage.STORE_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case PigPackage.STORE_STATEMENT__LOAD:
        setLoad((LoadStatement)newValue);
        return;
      case PigPackage.STORE_STATEMENT__TYPE:
        setType((AliasType)newValue);
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
      case PigPackage.STORE_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PigPackage.STORE_STATEMENT__LOAD:
        setLoad((LoadStatement)null);
        return;
      case PigPackage.STORE_STATEMENT__TYPE:
        setType((AliasType)null);
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
      case PigPackage.STORE_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PigPackage.STORE_STATEMENT__LOAD:
        return load != null;
      case PigPackage.STORE_STATEMENT__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == MrStatement.class)
    {
      switch (derivedFeatureID)
      {
        case PigPackage.STORE_STATEMENT__NAME: return PigPackage.MR_STATEMENT__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == MrStatement.class)
    {
      switch (baseFeatureID)
      {
        case PigPackage.MR_STATEMENT__NAME: return PigPackage.STORE_STATEMENT__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StoreStatementImpl
