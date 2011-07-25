/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.CoGroupByStatement;
import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.join_sub_clause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Co Group By Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.CoGroupByStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.CoGroupByStatementImpl#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoGroupByStatementImpl extends StatementImpl implements CoGroupByStatement
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
   * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliases()
   * @generated
   * @ordered
   */
  protected join_sub_clause aliases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoGroupByStatementImpl()
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
    return PigPackage.Literals.CO_GROUP_BY_STATEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.CO_GROUP_BY_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_sub_clause getAliases()
  {
    return aliases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAliases(join_sub_clause newAliases, NotificationChain msgs)
  {
    join_sub_clause oldAliases = aliases;
    aliases = newAliases;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.CO_GROUP_BY_STATEMENT__ALIASES, oldAliases, newAliases);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliases(join_sub_clause newAliases)
  {
    if (newAliases != aliases)
    {
      NotificationChain msgs = null;
      if (aliases != null)
        msgs = ((InternalEObject)aliases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.CO_GROUP_BY_STATEMENT__ALIASES, null, msgs);
      if (newAliases != null)
        msgs = ((InternalEObject)newAliases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.CO_GROUP_BY_STATEMENT__ALIASES, null, msgs);
      msgs = basicSetAliases(newAliases, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.CO_GROUP_BY_STATEMENT__ALIASES, newAliases, newAliases));
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
      case PigPackage.CO_GROUP_BY_STATEMENT__ALIASES:
        return basicSetAliases(null, msgs);
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
      case PigPackage.CO_GROUP_BY_STATEMENT__NAME:
        return getName();
      case PigPackage.CO_GROUP_BY_STATEMENT__ALIASES:
        return getAliases();
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
      case PigPackage.CO_GROUP_BY_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case PigPackage.CO_GROUP_BY_STATEMENT__ALIASES:
        setAliases((join_sub_clause)newValue);
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
      case PigPackage.CO_GROUP_BY_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PigPackage.CO_GROUP_BY_STATEMENT__ALIASES:
        setAliases((join_sub_clause)null);
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
      case PigPackage.CO_GROUP_BY_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PigPackage.CO_GROUP_BY_STATEMENT__ALIASES:
        return aliases != null;
    }
    return super.eIsSet(featureID);
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

} //CoGroupByStatementImpl
