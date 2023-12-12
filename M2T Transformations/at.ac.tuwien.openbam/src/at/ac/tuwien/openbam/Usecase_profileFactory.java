/**
 */
package at.ac.tuwien.openbam;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see usecase_profile.Usecase_profilePackage
 * @generated
 */
public interface Usecase_profileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Usecase_profileFactory eINSTANCE = at.ac.tuwien.openbam.impl.Usecase_profileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Read Signal Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Signal Change Event</em>'.
	 * @generated
	 */
	ReadSignalChangeEvent createReadSignalChangeEvent();

	/**
	 * Returns a new object of class '<em>Signal Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Enumeration Literal</em>'.
	 * @generated
	 */
	SignalEnumerationLiteral createSignalEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Write Signal Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Signal Function Behavior</em>'.
	 * @generated
	 */
	WriteSignalFunctionBehavior createWriteSignalFunctionBehavior();

	/**
	 * Returns a new object of class '<em>Sub Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Function Behavior</em>'.
	 * @generated
	 */
	SubFunctionBehavior createSubFunctionBehavior();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Usecase_profilePackage getUsecase_profilePackage();

} //Usecase_profileFactory
