/**
 */
package at.ac.tuwien.openbam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.FunctionBehavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Signal Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.WriteSignalFunctionBehavior#getBase_FunctionBehavior <em>Base Function Behavior</em>}</li>
 *   <li>{@link usecase_profile.WriteSignalFunctionBehavior#getSignal_id <em>Signal id</em>}</li>
 *   <li>{@link usecase_profile.WriteSignalFunctionBehavior#getWrite_value <em>Write value</em>}</li>
 * </ul>
 *
 * @see usecase_profile.Usecase_profilePackage#getWriteSignalFunctionBehavior()
 * @model
 * @generated
 */
public interface WriteSignalFunctionBehavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Function Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Function Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Function Behavior</em>' reference.
	 * @see #setBase_FunctionBehavior(FunctionBehavior)
	 * @see usecase_profile.Usecase_profilePackage#getWriteSignalFunctionBehavior_Base_FunctionBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	FunctionBehavior getBase_FunctionBehavior();

	/**
	 * Sets the value of the '{@link usecase_profile.WriteSignalFunctionBehavior#getBase_FunctionBehavior <em>Base Function Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Function Behavior</em>' reference.
	 * @see #getBase_FunctionBehavior()
	 * @generated
	 */
	void setBase_FunctionBehavior(FunctionBehavior value);

	/**
	 * Returns the value of the '<em><b>Signal id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal id</em>' reference.
	 * @see #setSignal_id(SignalEnumerationLiteral)
	 * @see usecase_profile.Usecase_profilePackage#getWriteSignalFunctionBehavior_Signal_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SignalEnumerationLiteral getSignal_id();

	/**
	 * Sets the value of the '{@link usecase_profile.WriteSignalFunctionBehavior#getSignal_id <em>Signal id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal id</em>' reference.
	 * @see #getSignal_id()
	 * @generated
	 */
	void setSignal_id(SignalEnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Write value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write value</em>' attribute.
	 * @see #setWrite_value(String)
	 * @see usecase_profile.Usecase_profilePackage#getWriteSignalFunctionBehavior_Write_value()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getWrite_value();

	/**
	 * Sets the value of the '{@link usecase_profile.WriteSignalFunctionBehavior#getWrite_value <em>Write value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write value</em>' attribute.
	 * @see #getWrite_value()
	 * @generated
	 */
	void setWrite_value(String value);

} // WriteSignalFunctionBehavior
