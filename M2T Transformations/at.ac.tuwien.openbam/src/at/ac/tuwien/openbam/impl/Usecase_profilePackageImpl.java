/**
 */
package at.ac.tuwien.openbam.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import at.ac.tuwien.openbam.ReadSignalChangeEvent;
import at.ac.tuwien.openbam.SignalEnumerationLiteral;
import at.ac.tuwien.openbam.SubFunctionBehavior;
import at.ac.tuwien.openbam.Usecase_profileFactory;
import at.ac.tuwien.openbam.Usecase_profilePackage;
import at.ac.tuwien.openbam.WriteSignalFunctionBehavior;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Usecase_profilePackageImpl extends EPackageImpl implements Usecase_profilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSignalChangeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeSignalFunctionBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subFunctionBehaviorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see usecase_profile.Usecase_profilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Usecase_profilePackageImpl() {
		super(eNS_URI, Usecase_profileFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Usecase_profilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Usecase_profilePackage init() {
		if (isInited) return (Usecase_profilePackage)EPackage.Registry.INSTANCE.getEPackage(Usecase_profilePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUsecase_profilePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Usecase_profilePackageImpl theUsecase_profilePackage = registeredUsecase_profilePackage instanceof Usecase_profilePackageImpl ? (Usecase_profilePackageImpl)registeredUsecase_profilePackage : new Usecase_profilePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUsecase_profilePackage.createPackageContents();

		// Initialize created meta-data
		theUsecase_profilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsecase_profilePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Usecase_profilePackage.eNS_URI, theUsecase_profilePackage);
		return theUsecase_profilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSignalChangeEvent() {
		return readSignalChangeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSignalChangeEvent_Base_ChangeEvent() {
		return (EReference)readSignalChangeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSignalChangeEvent_Signal_id() {
		return (EReference)readSignalChangeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadSignalChangeEvent_Compare_value() {
		return (EAttribute)readSignalChangeEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEnumerationLiteral() {
		return signalEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalEnumerationLiteral_Base_EnumerationLiteral() {
		return (EReference)signalEnumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEnumerationLiteral_Id() {
		return (EAttribute)signalEnumerationLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEnumerationLiteral_Dp() {
		return (EAttribute)signalEnumerationLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEnumerationLiteral_Dp_type() {
		return (EAttribute)signalEnumerationLiteralEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEnumerationLiteral_Dp_function() {
		return (EAttribute)signalEnumerationLiteralEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEnumerationLiteral_Ntfcl() {
		return (EAttribute)signalEnumerationLiteralEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEnumerationLiteral_Obj_desc() {
		return (EAttribute)signalEnumerationLiteralEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalEnumerationLiteral_Comment() {
		return (EAttribute)signalEnumerationLiteralEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteSignalFunctionBehavior() {
		return writeSignalFunctionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteSignalFunctionBehavior_Base_FunctionBehavior() {
		return (EReference)writeSignalFunctionBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteSignalFunctionBehavior_Signal_id() {
		return (EReference)writeSignalFunctionBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWriteSignalFunctionBehavior_Write_value() {
		return (EAttribute)writeSignalFunctionBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubFunctionBehavior() {
		return subFunctionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubFunctionBehavior_Base_FunctionBehavior() {
		return (EReference)subFunctionBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubFunctionBehavior_Sub_function_behaviors() {
		return (EReference)subFunctionBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usecase_profileFactory getUsecase_profileFactory() {
		return (Usecase_profileFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		readSignalChangeEventEClass = createEClass(READ_SIGNAL_CHANGE_EVENT);
		createEReference(readSignalChangeEventEClass, READ_SIGNAL_CHANGE_EVENT__BASE_CHANGE_EVENT);
		createEReference(readSignalChangeEventEClass, READ_SIGNAL_CHANGE_EVENT__SIGNAL_ID);
		createEAttribute(readSignalChangeEventEClass, READ_SIGNAL_CHANGE_EVENT__COMPARE_VALUE);

		signalEnumerationLiteralEClass = createEClass(SIGNAL_ENUMERATION_LITERAL);
		createEReference(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__BASE_ENUMERATION_LITERAL);
		createEAttribute(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__ID);
		createEAttribute(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__DP);
		createEAttribute(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__DP_TYPE);
		createEAttribute(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__DP_FUNCTION);
		createEAttribute(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__NTFCL);
		createEAttribute(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__OBJ_DESC);
		createEAttribute(signalEnumerationLiteralEClass, SIGNAL_ENUMERATION_LITERAL__COMMENT);

		writeSignalFunctionBehaviorEClass = createEClass(WRITE_SIGNAL_FUNCTION_BEHAVIOR);
		createEReference(writeSignalFunctionBehaviorEClass, WRITE_SIGNAL_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR);
		createEReference(writeSignalFunctionBehaviorEClass, WRITE_SIGNAL_FUNCTION_BEHAVIOR__SIGNAL_ID);
		createEAttribute(writeSignalFunctionBehaviorEClass, WRITE_SIGNAL_FUNCTION_BEHAVIOR__WRITE_VALUE);

		subFunctionBehaviorEClass = createEClass(SUB_FUNCTION_BEHAVIOR);
		createEReference(subFunctionBehaviorEClass, SUB_FUNCTION_BEHAVIOR__BASE_FUNCTION_BEHAVIOR);
		createEReference(subFunctionBehaviorEClass, SUB_FUNCTION_BEHAVIOR__SUB_FUNCTION_BEHAVIORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(readSignalChangeEventEClass, ReadSignalChangeEvent.class, "ReadSignalChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadSignalChangeEvent_Base_ChangeEvent(), theUMLPackage.getChangeEvent(), null, "base_ChangeEvent", null, 0, 1, ReadSignalChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadSignalChangeEvent_Signal_id(), this.getSignalEnumerationLiteral(), null, "signal_id", null, 1, 1, ReadSignalChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReadSignalChangeEvent_Compare_value(), theTypesPackage.getString(), "compare_value", null, 1, 1, ReadSignalChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(signalEnumerationLiteralEClass, SignalEnumerationLiteral.class, "SignalEnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalEnumerationLiteral_Base_EnumerationLiteral(), theUMLPackage.getEnumerationLiteral(), null, "base_EnumerationLiteral", null, 0, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSignalEnumerationLiteral_Id(), theTypesPackage.getString(), "id", null, 1, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSignalEnumerationLiteral_Dp(), theTypesPackage.getString(), "dp", null, 1, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSignalEnumerationLiteral_Dp_type(), theTypesPackage.getString(), "dp_type", null, 1, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSignalEnumerationLiteral_Dp_function(), theTypesPackage.getString(), "dp_function", null, 1, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSignalEnumerationLiteral_Ntfcl(), theTypesPackage.getString(), "ntfcl", null, 1, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSignalEnumerationLiteral_Obj_desc(), theTypesPackage.getString(), "obj_desc", null, 1, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSignalEnumerationLiteral_Comment(), theTypesPackage.getString(), "comment", null, 1, 1, SignalEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(writeSignalFunctionBehaviorEClass, WriteSignalFunctionBehavior.class, "WriteSignalFunctionBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteSignalFunctionBehavior_Base_FunctionBehavior(), theUMLPackage.getFunctionBehavior(), null, "base_FunctionBehavior", null, 0, 1, WriteSignalFunctionBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWriteSignalFunctionBehavior_Signal_id(), this.getSignalEnumerationLiteral(), null, "signal_id", null, 1, 1, WriteSignalFunctionBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWriteSignalFunctionBehavior_Write_value(), theTypesPackage.getString(), "write_value", null, 1, 1, WriteSignalFunctionBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subFunctionBehaviorEClass, SubFunctionBehavior.class, "SubFunctionBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubFunctionBehavior_Base_FunctionBehavior(), theUMLPackage.getFunctionBehavior(), null, "base_FunctionBehavior", null, 0, 1, SubFunctionBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubFunctionBehavior_Sub_function_behaviors(), theUMLPackage.getFunctionBehavior(), null, "sub_function_behaviors", null, 1, -1, SubFunctionBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Usecase_profilePackageImpl
