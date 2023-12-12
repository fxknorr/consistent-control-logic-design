/**
 */
package at.ac.tuwien.openbam;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}</li>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getId <em>Id</em>}</li>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getDp <em>Dp</em>}</li>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getDp_type <em>Dp type</em>}</li>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getDp_function <em>Dp function</em>}</li>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getNtfcl <em>Ntfcl</em>}</li>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getObj_desc <em>Obj desc</em>}</li>
 *   <li>{@link usecase_profile.SignalEnumerationLiteral#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral()
 * @model
 * @generated
 */
public interface SignalEnumerationLiteral extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #setBase_EnumerationLiteral(EnumerationLiteral)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Base_EnumerationLiteral()
	 * @model ordered="false"
	 * @generated
	 */
	EnumerationLiteral getBase_EnumerationLiteral();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration Literal</em>' reference.
	 * @see #getBase_EnumerationLiteral()
	 * @generated
	 */
	void setBase_EnumerationLiteral(EnumerationLiteral value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Dp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp</em>' attribute.
	 * @see #setDp(String)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Dp()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDp();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getDp <em>Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dp</em>' attribute.
	 * @see #getDp()
	 * @generated
	 */
	void setDp(String value);

	/**
	 * Returns the value of the '<em><b>Dp type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dp type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp type</em>' attribute.
	 * @see #setDp_type(String)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Dp_type()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDp_type();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getDp_type <em>Dp type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dp type</em>' attribute.
	 * @see #getDp_type()
	 * @generated
	 */
	void setDp_type(String value);

	/**
	 * Returns the value of the '<em><b>Dp function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dp function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dp function</em>' attribute.
	 * @see #setDp_function(String)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Dp_function()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDp_function();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getDp_function <em>Dp function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dp function</em>' attribute.
	 * @see #getDp_function()
	 * @generated
	 */
	void setDp_function(String value);

	/**
	 * Returns the value of the '<em><b>Ntfcl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ntfcl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ntfcl</em>' attribute.
	 * @see #setNtfcl(String)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Ntfcl()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNtfcl();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getNtfcl <em>Ntfcl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ntfcl</em>' attribute.
	 * @see #getNtfcl()
	 * @generated
	 */
	void setNtfcl(String value);

	/**
	 * Returns the value of the '<em><b>Obj desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj desc</em>' attribute.
	 * @see #setObj_desc(String)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Obj_desc()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getObj_desc();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getObj_desc <em>Obj desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj desc</em>' attribute.
	 * @see #getObj_desc()
	 * @generated
	 */
	void setObj_desc(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see usecase_profile.Usecase_profilePackage#getSignalEnumerationLiteral_Comment()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link usecase_profile.SignalEnumerationLiteral#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // SignalEnumerationLiteral
