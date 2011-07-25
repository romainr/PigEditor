/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.AliasType;
import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.join_group_by_clause;
import org.apache.pigeditor.pig.join_item;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>join item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.join_itemImpl#getOthers <em>Others</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.join_itemImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.join_itemImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class join_itemImpl extends join_sub_clauseImpl implements join_item
{
  /**
   * The cached value of the '{@link #getOthers() <em>Others</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOthers()
   * @generated
   * @ordered
   */
  protected join_item others;

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
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected join_group_by_clause expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected join_itemImpl()
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
    return PigPackage.Literals.JOIN_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_item getOthers()
  {
    return others;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOthers(join_item newOthers, NotificationChain msgs)
  {
    join_item oldOthers = others;
    others = newOthers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_ITEM__OTHERS, oldOthers, newOthers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOthers(join_item newOthers)
  {
    if (newOthers != others)
    {
      NotificationChain msgs = null;
      if (others != null)
        msgs = ((InternalEObject)others).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_ITEM__OTHERS, null, msgs);
      if (newOthers != null)
        msgs = ((InternalEObject)newOthers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_ITEM__OTHERS, null, msgs);
      msgs = basicSetOthers(newOthers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_ITEM__OTHERS, newOthers, newOthers));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_ITEM__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_ITEM__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_ITEM__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_ITEM__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_group_by_clause getExpressions()
  {
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressions(join_group_by_clause newExpressions, NotificationChain msgs)
  {
    join_group_by_clause oldExpressions = expressions;
    expressions = newExpressions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_ITEM__EXPRESSIONS, oldExpressions, newExpressions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressions(join_group_by_clause newExpressions)
  {
    if (newExpressions != expressions)
    {
      NotificationChain msgs = null;
      if (expressions != null)
        msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_ITEM__EXPRESSIONS, null, msgs);
      if (newExpressions != null)
        msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_ITEM__EXPRESSIONS, null, msgs);
      msgs = basicSetExpressions(newExpressions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_ITEM__EXPRESSIONS, newExpressions, newExpressions));
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
      case PigPackage.JOIN_ITEM__OTHERS:
        return basicSetOthers(null, msgs);
      case PigPackage.JOIN_ITEM__TYPE:
        return basicSetType(null, msgs);
      case PigPackage.JOIN_ITEM__EXPRESSIONS:
        return basicSetExpressions(null, msgs);
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
      case PigPackage.JOIN_ITEM__OTHERS:
        return getOthers();
      case PigPackage.JOIN_ITEM__TYPE:
        return getType();
      case PigPackage.JOIN_ITEM__EXPRESSIONS:
        return getExpressions();
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
      case PigPackage.JOIN_ITEM__OTHERS:
        setOthers((join_item)newValue);
        return;
      case PigPackage.JOIN_ITEM__TYPE:
        setType((AliasType)newValue);
        return;
      case PigPackage.JOIN_ITEM__EXPRESSIONS:
        setExpressions((join_group_by_clause)newValue);
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
      case PigPackage.JOIN_ITEM__OTHERS:
        setOthers((join_item)null);
        return;
      case PigPackage.JOIN_ITEM__TYPE:
        setType((AliasType)null);
        return;
      case PigPackage.JOIN_ITEM__EXPRESSIONS:
        setExpressions((join_group_by_clause)null);
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
      case PigPackage.JOIN_ITEM__OTHERS:
        return others != null;
      case PigPackage.JOIN_ITEM__TYPE:
        return type != null;
      case PigPackage.JOIN_ITEM__EXPRESSIONS:
        return expressions != null;
    }
    return super.eIsSet(featureID);
  }

} //join_itemImpl
