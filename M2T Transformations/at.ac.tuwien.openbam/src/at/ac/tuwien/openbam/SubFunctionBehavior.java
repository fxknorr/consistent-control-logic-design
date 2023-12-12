/**
 */
package at.ac.tuwien.openbam;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.FunctionBehavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase_profile.SubFunctionBehavior#getBase_FunctionBehavior <em>Base Function Behavior</em>}</li>
 *   <li>{@link usecase_profile.SubFunctionBehavior#getSub_function_behaviors <em>Sub function behaviors</em>}</li>
 * </ul>
 *
 * @see usecase_profile.Usecase_profilePackage#getSubFunctionBehavior()
 * @model
 * @generated
 */
public interface SubFunctionBehavior extends EObject {
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
	 * @see usecase_profile.Usecase_profilePackage#getSubFunctionBehavior_Base_FunctionBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	FunctionBehavior getBase_FunctionBehavior();

	/**
	 * Sets the value of the '{@link usecase_profile.SubFunctionBehavior#getBase_FunctionBehavior <em>Base Function Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Function Behavior</em>' reference.
	 * @see #getBase_FunctionBehavior()
	 * @generated
	 */
	void setBase_FunctionBehavior(FunctionBehavior value);

	/**
	 * Returns the value of the '<em><b>Sub function behaviors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.FunctionBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub function behaviors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub function behaviors</em>' reference list.
	 * @see usecase_profile.Usecase_profilePackage#getSubFunctionBehavior_Sub_function_behaviors()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<FunctionBehavior> getSub_function_behaviors();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.FunctionBehavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Sub function behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.FunctionBehavior} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.FunctionBehavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSub_function_behaviors()
	 * @generated
	 */
	FunctionBehavior getSub_function_behaviors(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.FunctionBehavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Sub function behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.FunctionBehavior} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.FunctionBehavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSub_function_behaviors()
	 * @generated
	 */
	FunctionBehavior getSub_function_behaviors(String name, boolean ignoreCase);

} // SubFunctionBehavior
