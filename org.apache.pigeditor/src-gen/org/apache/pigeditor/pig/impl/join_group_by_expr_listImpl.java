/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.join_group_by_expr;
import org.apache.pigeditor.pig.join_group_by_expr_list;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>join group by expr list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.join_group_by_expr_listImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.join_group_by_expr_listImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class join_group_by_expr_listImpl extends group_itemImpl implements join_group_by_expr_list
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected join_group_by_expr left;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected join_group_by_expr expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected join_group_by_expr_listImpl()
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
    return PigPackage.Literals.JOIN_GROUP_BY_EXPR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_group_by_expr getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(join_group_by_expr newLeft, NotificationChain msgs)
  {
    join_group_by_expr oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(join_group_by_expr newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public join_group_by_expr getExpressions()
  {
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressions(join_group_by_expr newExpressions, NotificationChain msgs)
  {
    join_group_by_expr oldExpressions = expressions;
    expressions = newExpressions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS, oldExpressions, newExpressions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressions(join_group_by_expr newExpressions)
  {
    if (newExpressions != expressions)
    {
      NotificationChain msgs = null;
      if (expressions != null)
        msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS, null, msgs);
      if (newExpressions != null)
        msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS, null, msgs);
      msgs = basicSetExpressions(newExpressions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS, newExpressions, newExpressions));
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
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT:
        return basicSetLeft(null, msgs);
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS:
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
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT:
        return getLeft();
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS:
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
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT:
        setLeft((join_group_by_expr)newValue);
        return;
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS:
        setExpressions((join_group_by_expr)newValue);
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
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT:
        setLeft((join_group_by_expr)null);
        return;
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS:
        setExpressions((join_group_by_expr)null);
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
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT:
        return left != null;
      case PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS:
        return expressions != null;
    }
    return super.eIsSet(featureID);
  }

} //join_group_by_expr_listImpl
