/**
 */
package at.ac.tuwien.openbam.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.FunctionBehavior;

import at.ac.tuwien.openbam.SignalEnumerationLiteral;
import at.ac.tuwien.openbam.Usecase_profilePackage;
import at.ac.tuwien.openbam.WriteSignalFunctionBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Signal Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.impl.WriteSignalFunctionBehaviorImpl#getBase_FunctionBehavior <em>Base Function Behavior</em>}</li>
 *   <li>{@link usecase_profile.impl.WriteSignalFunctionBehaviorImpl#getSignal_id <em>Signal id</em>}</li>
 *   <li>{@link usecase_profile.impl.WriteSignalFunctionBehaviorImpl#getWrite_value <em>Write value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteSignalFunctionBehaviorImpl extends MinimalEObjectImpl.Container implements WriteSignalFunctionBehavior {
	/**
	 * The cached value of the '{@link #getBase_FunctionBehavior() <em>Base Function Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_FunctionBehavior()
	 * @generated
	 * @ordered
	 */
	protected FunctionBehavior base_FunctionBehavior;

	/**
	 * The cached value of the '{@link #getSignal_id() <em>Signal id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignal_id()
	 * @generated
	 * @ordered
	 */
	protected SignalEnumerationLiteral signal_id;

	/**
	 * The default value of the '{@link #getWrite_value() <em>Write value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite_value()
	 * @generated
	 * @ordered
	 */
	protected static final String WRITE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrite_value() <em>Write value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite_value()
	 * @generated
	 * @ordered
	 */
	protected String write_value = WRITE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteSignalFunctionBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Usecase_profilePackage.Literals.WRITE_SIGNAL_FUNCTION_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior getBase_FunctionBehavior() {
		if (base_FunctionBehavior != null && base_FunctionBehavior.eIsProxy()) {
			InternalEObject oldBase_FunctionBehavior = (InternalEObject)base_FunctionBehavior;
			base_FunctionBehavior = (FunctionBehavior)eResolveProxy(oldBase_FunctionBehavior);
			if (base_FunctionBehavior != oldBase_FunctionBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR, oldBase_FunctionBehavior, base_FunctionBehavior));
			}
		}
		return base_FunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior basicGetBase_FunctionBehavior() {
		return base_FunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_FunctionBehavior(FunctionBehavior newBase_FunctionBehavior) {
		FunctionBehavior oldBase_FunctionBehavior = base_FunctionBehavior;
		base_FunctionBehavior = newBase_FunctionBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR, oldBase_FunctionBehavior, base_FunctionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEnumerationLiteral getSignal_id() {
		if (signal_id != null && signal_id.eIsProxy()) {
			InternalEObject oldSignal_id = (InternalEObject)signal_id;
			signal_id = (SignalEnumerationLiteral)eResolveProxy(oldSignal_id);
			if (signal_id != oldSignal_id) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID, oldSignal_id, signal_id));
			}
		}
		return signal_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEnumerationLiteral basicGetSignal_id() {
		return signal_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignal_id(SignalEnumerationLiteral newSignal_id) {
		SignalEnumerationLiteral oldSignal_id = signal_id;
		signal_id = newSignal_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID, oldSignal_id, signal_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrite_value() {
		return write_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite_value(String newWrite_value) {
		String oldWrite_value = write_value;
		write_value = newWrite_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE, oldWrite_value, write_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				if (resolve) return getBase_FunctionBehavior();
				return basicGetBase_FunctionBehavior();
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID:
				if (resolve) return getSignal_id();
				return basicGetSignal_id();
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE:
				return getWrite_value();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				setBase_FunctionBehavior((FunctionBehavior)newValue);
				return;
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID:
				setSignal_id((SignalEnumerationLiteral)newValue);
				return;
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE:
				setWrite_value((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				setBase_FunctionBehavior((FunctionBehavior)null);
				return;
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID:
				setSignal_id((SignalEnumerationLiteral)null);
				return;
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE:
				setWrite_value(WRITE_VALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				return base_FunctionBehavior != null;
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID:
				return signal_id != null;
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE:
				return WRITE_VALUE_EDEFAULT == null ? write_value != null : !WRITE_VALUE_EDEFAULT.equals(write_value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (write_value: ");
		result.append(write_value);
		result.append(')');
		return result.toString();
	}

} //WriteSignalFunctionBehaviorImpl
