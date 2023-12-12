/**
 */
package at.ac.tuwien.openbam.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.ChangeEvent;

import at.ac.tuwien.openbam.ReadSignalChangeEvent;
import at.ac.tuwien.openbam.SignalEnumerationLiteral;
import at.ac.tuwien.openbam.Usecase_profilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Signal Change Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.impl.ReadSignalChangeEventImpl#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 *   <li>{@link usecase_profile.impl.ReadSignalChangeEventImpl#getSignal_id <em>Signal id</em>}</li>
 *   <li>{@link usecase_profile.impl.ReadSignalChangeEventImpl#getCompare_value <em>Compare value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadSignalChangeEventImpl extends MinimalEObjectImpl.Container implements ReadSignalChangeEvent {
	/**
	 * The cached value of the '{@link #getBase_ChangeEvent() <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ChangeEvent()
	 * @generated
	 * @ordered
	 */
	protected ChangeEvent base_ChangeEvent;

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
	 * The default value of the '{@link #getCompare_value() <em>Compare value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare_value()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompare_value() <em>Compare value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare_value()
	 * @generated
	 * @ordered
	 */
	protected String compare_value = COMPARE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadSignalChangeEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Usecase_profilePackage.Literals.READ_SIGNAL_CHANGE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent getBase_ChangeEvent() {
		if (base_ChangeEvent != null && base_ChangeEvent.eIsProxy()) {
			InternalEObject oldBase_ChangeEvent = (InternalEObject)base_ChangeEvent;
			base_ChangeEvent = (ChangeEvent)eResolveProxy(oldBase_ChangeEvent);
			if (base_ChangeEvent != oldBase_ChangeEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
			}
		}
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent basicGetBase_ChangeEvent() {
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ChangeEvent(ChangeEvent newBase_ChangeEvent) {
		ChangeEvent oldBase_ChangeEvent = base_ChangeEvent;
		base_ChangeEvent = newBase_ChangeEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID, oldSignal_id, signal_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID, oldSignal_id, signal_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompare_value() {
		return compare_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompare_value(String newCompare_value) {
		String oldCompare_value = compare_value;
		compare_value = newCompare_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE, oldCompare_value, compare_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT:
				if (resolve) return getBase_ChangeEvent();
				return basicGetBase_ChangeEvent();
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID:
				if (resolve) return getSignal_id();
				return basicGetSignal_id();
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE:
				return getCompare_value();
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
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)newValue);
				return;
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID:
				setSignal_id((SignalEnumerationLiteral)newValue);
				return;
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE:
				setCompare_value((String)newValue);
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
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)null);
				return;
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID:
				setSignal_id((SignalEnumerationLiteral)null);
				return;
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE:
				setCompare_value(COMPARE_VALUE_EDEFAULT);
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
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT:
				return base_ChangeEvent != null;
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID:
				return signal_id != null;
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE:
				return COMPARE_VALUE_EDEFAULT == null ? compare_value != null : !COMPARE_VALUE_EDEFAULT.equals(compare_value);
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
		result.append(" (compare_value: ");
		result.append(compare_value);
		result.append(')');
		return result.toString();
	}

} //ReadSignalChangeEventImpl
