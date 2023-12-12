/**
 */
package at.ac.tuwien.openbam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see usecase_profile.Usecase_profileFactory
 * @model kind="package"
 * @generated
 */
public interface Usecase_profilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usecase_profile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tuwien.ac.at/usecase.profile";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usecase_profile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Usecase_profilePackage eINSTANCE = at.ac.tuwien.openbam.impl.Usecase_profilePackageImpl.init();

	/**
	 * The meta object id for the '{@link usecase_profile.impl.ReadSignalChangeEventImpl <em>Read Signal Change Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usecase_profile.impl.ReadSignalChangeEventImpl
	 * @see usecase_profile.impl.Usecase_profilePackageImpl#getReadSignalChangeEvent()
	 * @generated
	 */
	int READ_SIGNAL_CHANGE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Base Change Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Signal id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID = 1;

	/**
	 * The feature id for the '<em><b>Compare value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Read Signal Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SIGNAL_CHANGE_EVENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Read Signal Change Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SIGNAL_CHANGE_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link usecase_profile.impl.SignalEnumerationLiteralImpl <em>Signal Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usecase_profile.impl.SignalEnumerationLiteralImpl
	 * @see usecase_profile.impl.Usecase_profilePackageImpl#getSignalEnumerationLiteral()
	 * @generated
	 */
	int SIGNAL_ENUMERATION_LITERAL = 1;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__ID = 1;

	/**
	 * The feature id for the '<em><b>Dp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__DP = 2;

	/**
	 * The feature id for the '<em><b>Dp type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__DP_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Dp function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Ntfcl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__NTFCL = 5;

	/**
	 * The feature id for the '<em><b>Obj desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__OBJ_DESC = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL__COMMENT = 7;

	/**
	 * The number of structural features of the '<em>Signal Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Signal Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_ENUMERATION_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link usecase_profile.impl.WriteSignalFunctionBehaviorImpl <em>Write Signal Function Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usecase_profile.impl.WriteSignalFunctionBehaviorImpl
	 * @see usecase_profile.impl.Usecase_profilePackageImpl#getWriteSignalFunctionBehavior()
	 * @generated
	 */
	int WRITE_SIGNAL_FUNCTION_BEHAVIOR = 2;

	/**
	 * The feature id for the '<em><b>Base Function Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Signal id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID = 1;

	/**
	 * The feature id for the '<em><b>Write value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Write Signal Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SIGNAL_FUNCTION_BEHAVIOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Write Signal Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SIGNAL_FUNCTION_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link usecase_profile.impl.SubFunctionBehaviorImpl <em>Sub Function Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see usecase_profile.impl.SubFunctionBehaviorImpl
	 * @see usecase_profile.impl.Usecase_profilePackageImpl#getSubFunctionBehavior()
	 * @generated
	 */
	int SUB_FUNCTION_BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Base Function Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Sub function behaviors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS = 1;

	/**
	 * The number of structural features of the '<em>Sub Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_BEHAVIOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sub Function Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_FUNCTION_BEHAVIOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link usecase_profile.ReadSignalChangeEvent <em>Read Signal Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Signal Change Event</em>'.
	 * @see usecase_profile.ReadSignalChangeEvent
	 * @generated
	 */
	EClass getReadSignalChangeEvent();

	/**
	 * Returns the meta object for the reference '{@link usecase_profile.ReadSignalChangeEvent#getBase_ChangeEvent <em>Base Change Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Change Event</em>'.
	 * @see usecase_profile.ReadSignalChangeEvent#getBase_ChangeEvent()
	 * @see #getReadSignalChangeEvent()
	 * @generated
	 */
	EReference getReadSignalChangeEvent_Base_ChangeEvent();

	/**
	 * Returns the meta object for the reference '{@link usecase_profile.ReadSignalChangeEvent#getSignal_id <em>Signal id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal id</em>'.
	 * @see usecase_profile.ReadSignalChangeEvent#getSignal_id()
	 * @see #getReadSignalChangeEvent()
	 * @generated
	 */
	EReference getReadSignalChangeEvent_Signal_id();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.ReadSignalChangeEvent#getCompare_value <em>Compare value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compare value</em>'.
	 * @see usecase_profile.ReadSignalChangeEvent#getCompare_value()
	 * @see #getReadSignalChangeEvent()
	 * @generated
	 */
	EAttribute getReadSignalChangeEvent_Compare_value();

	/**
	 * Returns the meta object for class '{@link usecase_profile.SignalEnumerationLiteral <em>Signal Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Enumeration Literal</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral
	 * @generated
	 */
	EClass getSignalEnumerationLiteral();

	/**
	 * Returns the meta object for the reference '{@link usecase_profile.SignalEnumerationLiteral#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration Literal</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getBase_EnumerationLiteral()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EReference getSignalEnumerationLiteral_Base_EnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.SignalEnumerationLiteral#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getId()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EAttribute getSignalEnumerationLiteral_Id();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.SignalEnumerationLiteral#getDp <em>Dp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dp</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getDp()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EAttribute getSignalEnumerationLiteral_Dp();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.SignalEnumerationLiteral#getDp_type <em>Dp type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dp type</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getDp_type()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EAttribute getSignalEnumerationLiteral_Dp_type();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.SignalEnumerationLiteral#getDp_function <em>Dp function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dp function</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getDp_function()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EAttribute getSignalEnumerationLiteral_Dp_function();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.SignalEnumerationLiteral#getNtfcl <em>Ntfcl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ntfcl</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getNtfcl()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EAttribute getSignalEnumerationLiteral_Ntfcl();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.SignalEnumerationLiteral#getObj_desc <em>Obj desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Obj desc</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getObj_desc()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EAttribute getSignalEnumerationLiteral_Obj_desc();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.SignalEnumerationLiteral#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see usecase_profile.SignalEnumerationLiteral#getComment()
	 * @see #getSignalEnumerationLiteral()
	 * @generated
	 */
	EAttribute getSignalEnumerationLiteral_Comment();

	/**
	 * Returns the meta object for class '{@link usecase_profile.WriteSignalFunctionBehavior <em>Write Signal Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Signal Function Behavior</em>'.
	 * @see usecase_profile.WriteSignalFunctionBehavior
	 * @generated
	 */
	EClass getWriteSignalFunctionBehavior();

	/**
	 * Returns the meta object for the reference '{@link usecase_profile.WriteSignalFunctionBehavior#getBase_FunctionBehavior <em>Base Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Function Behavior</em>'.
	 * @see usecase_profile.WriteSignalFunctionBehavior#getBase_FunctionBehavior()
	 * @see #getWriteSignalFunctionBehavior()
	 * @generated
	 */
	EReference getWriteSignalFunctionBehavior_Base_FunctionBehavior();

	/**
	 * Returns the meta object for the reference '{@link usecase_profile.WriteSignalFunctionBehavior#getSignal_id <em>Signal id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal id</em>'.
	 * @see usecase_profile.WriteSignalFunctionBehavior#getSignal_id()
	 * @see #getWriteSignalFunctionBehavior()
	 * @generated
	 */
	EReference getWriteSignalFunctionBehavior_Signal_id();

	/**
	 * Returns the meta object for the attribute '{@link usecase_profile.WriteSignalFunctionBehavior#getWrite_value <em>Write value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write value</em>'.
	 * @see usecase_profile.WriteSignalFunctionBehavior#getWrite_value()
	 * @see #getWriteSignalFunctionBehavior()
	 * @generated
	 */
	EAttribute getWriteSignalFunctionBehavior_Write_value();

	/**
	 * Returns the meta object for class '{@link usecase_profile.SubFunctionBehavior <em>Sub Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Function Behavior</em>'.
	 * @see usecase_profile.SubFunctionBehavior
	 * @generated
	 */
	EClass getSubFunctionBehavior();

	/**
	 * Returns the meta object for the reference '{@link usecase_profile.SubFunctionBehavior#getBase_FunctionBehavior <em>Base Function Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Function Behavior</em>'.
	 * @see usecase_profile.SubFunctionBehavior#getBase_FunctionBehavior()
	 * @see #getSubFunctionBehavior()
	 * @generated
	 */
	EReference getSubFunctionBehavior_Base_FunctionBehavior();

	/**
	 * Returns the meta object for the reference list '{@link usecase_profile.SubFunctionBehavior#getSub_function_behaviors <em>Sub function behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub function behaviors</em>'.
	 * @see usecase_profile.SubFunctionBehavior#getSub_function_behaviors()
	 * @see #getSubFunctionBehavior()
	 * @generated
	 */
	EReference getSubFunctionBehavior_Sub_function_behaviors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Usecase_profileFactory getUsecase_profileFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link usecase_profile.impl.ReadSignalChangeEventImpl <em>Read Signal Change Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usecase_profile.impl.ReadSignalChangeEventImpl
		 * @see usecase_profile.impl.Usecase_profilePackageImpl#getReadSignalChangeEvent()
		 * @generated
		 */
		EClass READ_SIGNAL_CHANGE_EVENT = eINSTANCE.getReadSignalChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Base Change Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT = eINSTANCE.getReadSignalChangeEvent_Base_ChangeEvent();

		/**
		 * The meta object literal for the '<em><b>Signal id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID = eINSTANCE.getReadSignalChangeEvent_Signal_id();

		/**
		 * The meta object literal for the '<em><b>Compare value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE = eINSTANCE.getReadSignalChangeEvent_Compare_value();

		/**
		 * The meta object literal for the '{@link usecase_profile.impl.SignalEnumerationLiteralImpl <em>Signal Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usecase_profile.impl.SignalEnumerationLiteralImpl
		 * @see usecase_profile.impl.Usecase_profilePackageImpl#getSignalEnumerationLiteral()
		 * @generated
		 */
		EClass SIGNAL_ENUMERATION_LITERAL = eINSTANCE.getSignalEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL = eINSTANCE.getSignalEnumerationLiteral_Base_EnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ENUMERATION_LITERAL__ID = eINSTANCE.getSignalEnumerationLiteral_Id();

		/**
		 * The meta object literal for the '<em><b>Dp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ENUMERATION_LITERAL__DP = eINSTANCE.getSignalEnumerationLiteral_Dp();

		/**
		 * The meta object literal for the '<em><b>Dp type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ENUMERATION_LITERAL__DP_TYPE = eINSTANCE.getSignalEnumerationLiteral_Dp_type();

		/**
		 * The meta object literal for the '<em><b>Dp function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION = eINSTANCE.getSignalEnumerationLiteral_Dp_function();

		/**
		 * The meta object literal for the '<em><b>Ntfcl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ENUMERATION_LITERAL__NTFCL = eINSTANCE.getSignalEnumerationLiteral_Ntfcl();

		/**
		 * The meta object literal for the '<em><b>Obj desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ENUMERATION_LITERAL__OBJ_DESC = eINSTANCE.getSignalEnumerationLiteral_Obj_desc();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_ENUMERATION_LITERAL__COMMENT = eINSTANCE.getSignalEnumerationLiteral_Comment();

		/**
		 * The meta object literal for the '{@link usecase_profile.impl.WriteSignalFunctionBehaviorImpl <em>Write Signal Function Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usecase_profile.impl.WriteSignalFunctionBehaviorImpl
		 * @see usecase_profile.impl.Usecase_profilePackageImpl#getWriteSignalFunctionBehavior()
		 * @generated
		 */
		EClass WRITE_SIGNAL_FUNCTION_BEHAVIOR = eINSTANCE.getWriteSignalFunctionBehavior();

		/**
		 * The meta object literal for the '<em><b>Base Function Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR = eINSTANCE.getWriteSignalFunctionBehavior_Base_FunctionBehavior();

		/**
		 * The meta object literal for the '<em><b>Signal id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID = eINSTANCE.getWriteSignalFunctionBehavior_Signal_id();

		/**
		 * The meta object literal for the '<em><b>Write value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE = eINSTANCE.getWriteSignalFunctionBehavior_Write_value();

		/**
		 * The meta object literal for the '{@link usecase_profile.impl.SubFunctionBehaviorImpl <em>Sub Function Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see usecase_profile.impl.SubFunctionBehaviorImpl
		 * @see usecase_profile.impl.Usecase_profilePackageImpl#getSubFunctionBehavior()
		 * @generated
		 */
		EClass SUB_FUNCTION_BEHAVIOR = eINSTANCE.getSubFunctionBehavior();

		/**
		 * The meta object literal for the '<em><b>Base Function Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR = eINSTANCE.getSubFunctionBehavior_Base_FunctionBehavior();

		/**
		 * The meta object literal for the '<em><b>Sub function behaviors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS = eINSTANCE.getSubFunctionBehavior_Sub_function_behaviors();

	}

} //Usecase_profilePackage
