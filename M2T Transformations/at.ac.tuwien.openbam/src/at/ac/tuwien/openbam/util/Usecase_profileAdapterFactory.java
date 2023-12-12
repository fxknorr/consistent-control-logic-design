/**
 */
package at.ac.tuwien.openbam.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.openbam.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see usecase_profile.Usecase_profilePackage
 * @generated
 */
public class Usecase_profileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Usecase_profilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usecase_profileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Usecase_profilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Usecase_profileSwitch<Adapter> modelSwitch =
		new Usecase_profileSwitch<Adapter>() {
			@Override
			public Adapter caseReadSignalChangeEvent(ReadSignalChangeEvent object) {
				return createReadSignalChangeEventAdapter();
			}
			@Override
			public Adapter caseSignalEnumerationLiteral(SignalEnumerationLiteral object) {
				return createSignalEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseWriteSignalFunctionBehavior(WriteSignalFunctionBehavior object) {
				return createWriteSignalFunctionBehaviorAdapter();
			}
			@Override
			public Adapter caseSubFunctionBehavior(SubFunctionBehavior object) {
				return createSubFunctionBehaviorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link usecase_profile.ReadSignalChangeEvent <em>Read Signal Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see usecase_profile.ReadSignalChangeEvent
	 * @generated
	 */
	public Adapter createReadSignalChangeEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link usecase_profile.SignalEnumerationLiteral <em>Signal Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see usecase_profile.SignalEnumerationLiteral
	 * @generated
	 */
	public Adapter createSignalEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link usecase_profile.WriteSignalFunctionBehavior <em>Write Signal Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see usecase_profile.WriteSignalFunctionBehavior
	 * @generated
	 */
	public Adapter createWriteSignalFunctionBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link usecase_profile.SubFunctionBehavior <em>Sub Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see usecase_profile.SubFunctionBehavior
	 * @generated
	 */
	public Adapter createSubFunctionBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Usecase_profileAdapterFactory
