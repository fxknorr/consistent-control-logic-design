/**
 */
package at.ac.tuwien.openbam.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import at.ac.tuwien.openbam.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Usecase_profileFactoryImpl extends EFactoryImpl implements Usecase_profileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Usecase_profileFactory init() {
		try {
			Usecase_profileFactory theUsecase_profileFactory = (Usecase_profileFactory)EPackage.Registry.INSTANCE.getEFactory(Usecase_profilePackage.eNS_URI);
			if (theUsecase_profileFactory != null) {
				return theUsecase_profileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Usecase_profileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usecase_profileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Usecase_profilePackage.READ_SIGNAL_CHANGE_EVENT: return createReadSignalChangeEvent();
			case Usecase_profilePackage.SIGNAL_ENUMERATION_LITERAL: return createSignalEnumerationLiteral();
			case Usecase_profilePackage.WRITE_SIGNAL_FUNCTION_BEHAVIOR: return createWriteSignalFunctionBehavior();
			case Usecase_profilePackage.SUB_FUNCTION_BEHAVIOR: return createSubFunctionBehavior();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSignalChangeEvent createReadSignalChangeEvent() {
		ReadSignalChangeEventImpl readSignalChangeEvent = new ReadSignalChangeEventImpl();
		return readSignalChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEnumerationLiteral createSignalEnumerationLiteral() {
		SignalEnumerationLiteralImpl signalEnumerationLiteral = new SignalEnumerationLiteralImpl();
		return signalEnumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteSignalFunctionBehavior createWriteSignalFunctionBehavior() {
		WriteSignalFunctionBehaviorImpl writeSignalFunctionBehavior = new WriteSignalFunctionBehaviorImpl();
		return writeSignalFunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubFunctionBehavior createSubFunctionBehavior() {
		SubFunctionBehaviorImpl subFunctionBehavior = new SubFunctionBehaviorImpl();
		return subFunctionBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usecase_profilePackage getUsecase_profilePackage() {
		return (Usecase_profilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Usecase_profilePackage getPackage() {
		return Usecase_profilePackage.eINSTANCE;
	}

} //Usecase_profileFactoryImpl
