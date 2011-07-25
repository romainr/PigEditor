/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.Expression;
import org.apache.pigeditor.pig.PigPackage;
import org.apache.pigeditor.pig.group_item;
import org.apache.pigeditor.pig.group_item_list;
import org.apache.pigeditor.pig.join_group_by_clause;
import org.apache.pigeditor.pig.join_group_by_expr;
import org.apache.pigeditor.pig.join_group_by_expr_list;
import org.apache.pigeditor.pig.nested_command;
import org.apache.pigeditor.pig.nested_op;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.ExpressionImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.ExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.ExpressionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.ExpressionImpl#getMul_exp <em>Mul exp</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.ExpressionImpl#getMul_cast <em>Mul cast</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends ConditionImpl implements Expression
{
  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected group_item items;

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
   * The cached value of the '{@link #getMul_exp() <em>Mul exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMul_exp()
   * @generated
   * @ordered
   */
  protected Expression mul_exp;

  /**
   * The cached value of the '{@link #getMul_cast() <em>Mul cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMul_cast()
   * @generated
   * @ordered
   */
  protected Expression mul_cast;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return PigPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public group_item getItems()
  {
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetItems(group_item newItems, NotificationChain msgs)
  {
    group_item oldItems = items;
    items = newItems;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__ITEMS, oldItems, newItems);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItems(group_item newItems)
  {
    if (newItems != items)
    {
      NotificationChain msgs = null;
      if (items != null)
        msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__ITEMS, null, msgs);
      if (newItems != null)
        msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__ITEMS, null, msgs);
      msgs = basicSetItems(newItems, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__ITEMS, newItems, newItems));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__LEFT, newLeft, newLeft));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__EXPRESSIONS, oldExpressions, newExpressions);
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
        msgs = ((InternalEObject)expressions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__EXPRESSIONS, null, msgs);
      if (newExpressions != null)
        msgs = ((InternalEObject)newExpressions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__EXPRESSIONS, null, msgs);
      msgs = basicSetExpressions(newExpressions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__EXPRESSIONS, newExpressions, newExpressions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMul_exp()
  {
    return mul_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMul_exp(Expression newMul_exp, NotificationChain msgs)
  {
    Expression oldMul_exp = mul_exp;
    mul_exp = newMul_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__MUL_EXP, oldMul_exp, newMul_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMul_exp(Expression newMul_exp)
  {
    if (newMul_exp != mul_exp)
    {
      NotificationChain msgs = null;
      if (mul_exp != null)
        msgs = ((InternalEObject)mul_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__MUL_EXP, null, msgs);
      if (newMul_exp != null)
        msgs = ((InternalEObject)newMul_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__MUL_EXP, null, msgs);
      msgs = basicSetMul_exp(newMul_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__MUL_EXP, newMul_exp, newMul_exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getMul_cast()
  {
    return mul_cast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMul_cast(Expression newMul_cast, NotificationChain msgs)
  {
    Expression oldMul_cast = mul_cast;
    mul_cast = newMul_cast;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__MUL_CAST, oldMul_cast, newMul_cast);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMul_cast(Expression newMul_cast)
  {
    if (newMul_cast != mul_cast)
    {
      NotificationChain msgs = null;
      if (mul_cast != null)
        msgs = ((InternalEObject)mul_cast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__MUL_CAST, null, msgs);
      if (newMul_cast != null)
        msgs = ((InternalEObject)newMul_cast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.EXPRESSION__MUL_CAST, null, msgs);
      msgs = basicSetMul_cast(newMul_cast, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.EXPRESSION__MUL_CAST, newMul_cast, newMul_cast));
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
      case PigPackage.EXPRESSION__ITEMS:
        return basicSetItems(null, msgs);
      case PigPackage.EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case PigPackage.EXPRESSION__EXPRESSIONS:
        return basicSetExpressions(null, msgs);
      case PigPackage.EXPRESSION__MUL_EXP:
        return basicSetMul_exp(null, msgs);
      case PigPackage.EXPRESSION__MUL_CAST:
        return basicSetMul_cast(null, msgs);
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
      case PigPackage.EXPRESSION__ITEMS:
        return getItems();
      case PigPackage.EXPRESSION__LEFT:
        return getLeft();
      case PigPackage.EXPRESSION__EXPRESSIONS:
        return getExpressions();
      case PigPackage.EXPRESSION__MUL_EXP:
        return getMul_exp();
      case PigPackage.EXPRESSION__MUL_CAST:
        return getMul_cast();
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
      case PigPackage.EXPRESSION__ITEMS:
        setItems((group_item)newValue);
        return;
      case PigPackage.EXPRESSION__LEFT:
        setLeft((join_group_by_expr)newValue);
        return;
      case PigPackage.EXPRESSION__EXPRESSIONS:
        setExpressions((join_group_by_expr)newValue);
        return;
      case PigPackage.EXPRESSION__MUL_EXP:
        setMul_exp((Expression)newValue);
        return;
      case PigPackage.EXPRESSION__MUL_CAST:
        setMul_cast((Expression)newValue);
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
      case PigPackage.EXPRESSION__ITEMS:
        setItems((group_item)null);
        return;
      case PigPackage.EXPRESSION__LEFT:
        setLeft((join_group_by_expr)null);
        return;
      case PigPackage.EXPRESSION__EXPRESSIONS:
        setExpressions((join_group_by_expr)null);
        return;
      case PigPackage.EXPRESSION__MUL_EXP:
        setMul_exp((Expression)null);
        return;
      case PigPackage.EXPRESSION__MUL_CAST:
        setMul_cast((Expression)null);
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
      case PigPackage.EXPRESSION__ITEMS:
        return items != null;
      case PigPackage.EXPRESSION__LEFT:
        return left != null;
      case PigPackage.EXPRESSION__EXPRESSIONS:
        return expressions != null;
      case PigPackage.EXPRESSION__MUL_EXP:
        return mul_exp != null;
      case PigPackage.EXPRESSION__MUL_CAST:
        return mul_cast != null;
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
    if (baseClass == group_item_list.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == group_item.class)
    {
      switch (derivedFeatureID)
      {
        case PigPackage.EXPRESSION__ITEMS: return PigPackage.GROUP_ITEM__ITEMS;
        default: return -1;
      }
    }
    if (baseClass == join_group_by_clause.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == join_group_by_expr_list.class)
    {
      switch (derivedFeatureID)
      {
        case PigPackage.EXPRESSION__LEFT: return PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT;
        case PigPackage.EXPRESSION__EXPRESSIONS: return PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS;
        default: return -1;
      }
    }
    if (baseClass == join_group_by_expr.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nested_command.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nested_op.class)
    {
      switch (derivedFeatureID)
      {
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
    if (baseClass == group_item_list.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == group_item.class)
    {
      switch (baseFeatureID)
      {
        case PigPackage.GROUP_ITEM__ITEMS: return PigPackage.EXPRESSION__ITEMS;
        default: return -1;
      }
    }
    if (baseClass == join_group_by_clause.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == join_group_by_expr_list.class)
    {
      switch (baseFeatureID)
      {
        case PigPackage.JOIN_GROUP_BY_EXPR_LIST__LEFT: return PigPackage.EXPRESSION__LEFT;
        case PigPackage.JOIN_GROUP_BY_EXPR_LIST__EXPRESSIONS: return PigPackage.EXPRESSION__EXPRESSIONS;
        default: return -1;
      }
    }
    if (baseClass == join_group_by_expr.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nested_command.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == nested_op.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ExpressionImpl
