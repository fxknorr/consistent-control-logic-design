/**
 */
package at.ac.tuwien.openbam.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.FunctionBehavior;

import at.ac.tuwien.openbam.SubFunctionBehavior;
import at.ac.tuwien.openbam.Usecase_profilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.impl.SubFunctionBehaviorImpl#getBase_FunctionBehavior <em>Base Function Behavior</em>}</li>
 *   <li>{@link usecase_profile.impl.SubFunctionBehaviorImpl#getSub_function_behaviors <em>Sub function behaviors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubFunctionBehaviorImpl extends MinimalEObjectImpl.Container implements SubFunctionBehavior {
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
	 * The cached value of the '{@link #getSub_function_behaviors() <em>Sub function behaviors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub_function_behaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBehavior> sub_function_behaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubFunctionBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Usecase_profilePackage.Literals.SUB_FUNCTION_BEHAVIOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR, oldBase_FunctionBehavior, base_FunctionBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR, oldBase_FunctionBehavior, base_FunctionBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBehavior> getSub_function_behaviors() {
		if (sub_function_behaviors == null) {
			sub_function_behaviors = new EObjectResolvingEList<FunctionBehavior>(FunctionBehavior.class, this, Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS);
		}
		return sub_function_behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior getSub_function_behaviors(String name) {
		return getSub_function_behaviors(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBehavior getSub_function_behaviors(String name, boolean ignoreCase) {
		sub_function_behaviorsLoop: for (FunctionBehavior sub_function_behaviors : getSub_function_behaviors()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(sub_function_behaviors.getName()) : name.equals(sub_function_behaviors.getName())))
				continue sub_function_behaviorsLoop;
			return sub_function_behaviors;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				if (resolve) return getBase_FunctionBehavior();
				return basicGetBase_FunctionBehavior();
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS:
				return getSub_function_behaviors();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				setBase_FunctionBehavior((FunctionBehavior)newValue);
				return;
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS:
				getSub_function_behaviors().clear();
				getSub_function_behaviors().addAll((Collection<? extends FunctionBehavior>)newValue);
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
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				setBase_FunctionBehavior((FunctionBehavior)null);
				return;
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS:
				getSub_function_behaviors().clear();
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
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR:
				return base_FunctionBehavior != null;
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS:
				return sub_function_behaviors != null && !sub_function_behaviors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubFunctionBehaviorImpl
