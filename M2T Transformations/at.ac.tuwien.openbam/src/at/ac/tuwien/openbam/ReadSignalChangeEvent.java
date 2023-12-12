/**
 */
package at.ac.tuwien.openbam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ChangeEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Signal Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.ReadSignalChangeEvent#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 *   <li>{@link usecase_profile.ReadSignalChangeEvent#getSignal_id <em>Signal id</em>}</li>
 *   <li>{@link usecase_profile.ReadSignalChangeEvent#getCompare_value <em>Compare value</em>}</li>
 * </ul>
 *
 * @see usecase_profile.Usecase_profilePackage#getReadSignalChangeEvent()
 * @model
 * @generated
 */
public interface ReadSignalChangeEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Change Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Change Event</em>' reference.
	 * @see #setBase_ChangeEvent(ChangeEvent)
	 * @see usecase_profile.Usecase_profilePackage#getReadSignalChangeEvent_Base_ChangeEvent()
	 * @model ordered="false"
	 * @generated
	 */
	ChangeEvent getBase_ChangeEvent();

	/**
	 * Sets the value of the '{@link usecase_profile.ReadSignalChangeEvent#getBase_ChangeEvent <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Change Event</em>' reference.
	 * @see #getBase_ChangeEvent()
	 * @generated
	 */
	void setBase_ChangeEvent(ChangeEvent value);

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
	 * @see usecase_profile.Usecase_profilePackage#getReadSignalChangeEvent_Signal_id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SignalEnumerationLiteral getSignal_id();

	/**
	 * Sets the value of the '{@link usecase_profile.ReadSignalChangeEvent#getSignal_id <em>Signal id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal id</em>' reference.
	 * @see #getSignal_id()
	 * @generated
	 */
	void setSignal_id(SignalEnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Compare value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compare value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare value</em>' attribute.
	 * @see #setCompare_value(String)
	 * @see usecase_profile.Usecase_profilePackage#getReadSignalChangeEvent_Compare_value()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCompare_value();

	/**
	 * Sets the value of the '{@link usecase_profile.ReadSignalChangeEvent#getCompare_value <em>Compare value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare value</em>' attribute.
	 * @see #getCompare_value()
	 * @generated
	 */
	void setCompare_value(String value);

} // ReadSignalChangeEvent
