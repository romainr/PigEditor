/**
 * <copyright>
 * </copyright>
 *
 */
package org.apache.pigeditor.pig.impl;

import org.apache.pigeditor.pig.Condition;
import org.apache.pigeditor.pig.PigPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.apache.pigeditor.pig.impl.ConditionImpl#getLeftExp <em>Left Exp</em>}</li>
 *   <li>{@link org.apache.pigeditor.pig.impl.ConditionImpl#getRightExp <em>Right Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends real_argImpl implements Condition
{
  /**
   * The cached value of the '{@link #getLeftExp() <em>Left Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExp()
   * @generated
   * @ordered
   */
  protected Condition leftExp;

  /**
   * The cached value of the '{@link #getRightExp() <em>Right Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExp()
   * @generated
   * @ordered
   */
  protected Condition rightExp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return PigPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getLeftExp()
  {
    return leftExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExp(Condition newLeftExp, NotificationChain msgs)
  {
    Condition oldLeftExp = leftExp;
    leftExp = newLeftExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.CONDITION__LEFT_EXP, oldLeftExp, newLeftExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExp(Condition newLeftExp)
  {
    if (newLeftExp != leftExp)
    {
      NotificationChain msgs = null;
      if (leftExp != null)
        msgs = ((InternalEObject)leftExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.CONDITION__LEFT_EXP, null, msgs);
      if (newLeftExp != null)
        msgs = ((InternalEObject)newLeftExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.CONDITION__LEFT_EXP, null, msgs);
      msgs = basicSetLeftExp(newLeftExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.CONDITION__LEFT_EXP, newLeftExp, newLeftExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition getRightExp()
  {
    return rightExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExp(Condition newRightExp, NotificationChain msgs)
  {
    Condition oldRightExp = rightExp;
    rightExp = newRightExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PigPackage.CONDITION__RIGHT_EXP, oldRightExp, newRightExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExp(Condition newRightExp)
  {
    if (newRightExp != rightExp)
    {
      NotificationChain msgs = null;
      if (rightExp != null)
        msgs = ((InternalEObject)rightExp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PigPackage.CONDITION__RIGHT_EXP, null, msgs);
      if (newRightExp != null)
        msgs = ((InternalEObject)newRightExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PigPackage.CONDITION__RIGHT_EXP, null, msgs);
      msgs = basicSetRightExp(newRightExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PigPackage.CONDITION__RIGHT_EXP, newRightExp, newRightExp));
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
      case PigPackage.CONDITION__LEFT_EXP:
        return basicSetLeftExp(null, msgs);
      case PigPackage.CONDITION__RIGHT_EXP:
        return basicSetRightExp(null, msgs);
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
      case PigPackage.CONDITION__LEFT_EXP:
        return getLeftExp();
      case PigPackage.CONDITION__RIGHT_EXP:
        return getRightExp();
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
      case PigPackage.CONDITION__LEFT_EXP:
        setLeftExp((Condition)newValue);
        return;
      case PigPackage.CONDITION__RIGHT_EXP:
        setRightExp((Condition)newValue);
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
      case PigPackage.CONDITION__LEFT_EXP:
        setLeftExp((Condition)null);
        return;
      case PigPackage.CONDITION__RIGHT_EXP:
        setRightExp((Condition)null);
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
      case PigPackage.CONDITION__LEFT_EXP:
        return leftExp != null;
      case PigPackage.CONDITION__RIGHT_EXP:
        return rightExp != null;
    }
    return super.eIsSet(featureID);
  }

} //ConditionImpl
