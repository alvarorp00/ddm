/**
 */
package wizards.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import wizards.Button;
import wizards.CheckBox;
import wizards.CloseButton;
import wizards.Component;
import wizards.NavigatorButton;
import wizards.Page;
import wizards.PopUpButton;
import wizards.ReturnButton;
import wizards.TextField;
import wizards.Wizard;
import wizards.WizardsFactory;
import wizards.WizardsPackage;

import wizards.util.WizardsValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardsPackageImpl extends EPackageImpl implements WizardsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wizardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigatorButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popUpButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeButtonEClass = null;

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
	 * @see wizards.WizardsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WizardsPackageImpl() {
		super(eNS_URI, WizardsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WizardsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WizardsPackage init() {
		if (isInited) return (WizardsPackage)EPackage.Registry.INSTANCE.getEPackage(WizardsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWizardsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WizardsPackageImpl theWizardsPackage = registeredWizardsPackage instanceof WizardsPackageImpl ? (WizardsPackageImpl)registeredWizardsPackage : new WizardsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWizardsPackage.createPackageContents();

		// Initialize created meta-data
		theWizardsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theWizardsPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return WizardsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theWizardsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WizardsPackage.eNS_URI, theWizardsPackage);
		return theWizardsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWizard() {
		return wizardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWizard_Title() {
		return (EAttribute)wizardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_Initial_page() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWizard_Pages() {
		return (EReference)wizardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWizard__InitialPageNoReturnButton__DiagnosticChain_Map() {
		return wizardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWizard__ReachablePages__DiagnosticChain_Map() {
		return wizardEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWizard__NoDuplicatePages__DiagnosticChain_Map() {
		return wizardEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Name() {
		return (EAttribute)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_TextFields() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_CheckBox() {
		return (EReference)pageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_ReturnButtons() {
		return (EReference)pageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_NavigatorButtons() {
		return (EReference)pageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PopUpButtons() {
		return (EReference)pageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_CloseButtons() {
		return (EReference)pageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__Action() {
		return pageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__Show() {
		return pageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__Close() {
		return pageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__Buttons() {
		return pageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__Reachable__Page() {
		return pageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__MaxOneReturnButton__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__NonDuplicateButtonsLabel__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__NotOnlyPopUpButtons__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPage__RequiredButtons__DiagnosticChain_Map() {
		return pageEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_Label() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextField() {
		return textFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_Input() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_Min_length() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextField_Max_length() {
		return (EAttribute)textFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextField__ValidBounds__DiagnosticChain_Map() {
		return textFieldEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextField__MaxInputLength__DiagnosticChain_Map() {
		return textFieldEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTextField__MinInputLength__DiagnosticChain_Map() {
		return textFieldEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckBox() {
		return checkBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheckBox_Selected() {
		return (EAttribute)checkBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_CurrentPage() {
		return (EReference)buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getButton__Action() {
		return buttonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getButton__MaxLabelLength__DiagnosticChain_Map() {
		return buttonEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnButton() {
		return returnButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnButton_SrcPage() {
		return (EReference)returnButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReturnButton__Action() {
		return returnButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigatorButton() {
		return navigatorButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigatorButton_DstPage() {
		return (EReference)navigatorButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigatorButton_AlterDstPage() {
		return (EReference)navigatorButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNavigatorButton__TargetPage() {
		return navigatorButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNavigatorButton__Reachable__Page() {
		return navigatorButtonEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNavigatorButton__Action() {
		return navigatorButtonEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNavigatorButton__NoSelfLoop__DiagnosticChain_Map() {
		return navigatorButtonEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopUpButton() {
		return popUpButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPopUpButton_PopUp() {
		return (EAttribute)popUpButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPopUpButton__Action() {
		return popUpButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloseButton() {
		return closeButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloseButton__Action() {
		return closeButtonEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardsFactory getWizardsFactory() {
		return (WizardsFactory)getEFactoryInstance();
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
		wizardEClass = createEClass(WIZARD);
		createEAttribute(wizardEClass, WIZARD__TITLE);
		createEReference(wizardEClass, WIZARD__INITIAL_PAGE);
		createEReference(wizardEClass, WIZARD__PAGES);
		createEOperation(wizardEClass, WIZARD___INITIAL_PAGE_NO_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP);
		createEOperation(wizardEClass, WIZARD___REACHABLE_PAGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(wizardEClass, WIZARD___NO_DUPLICATE_PAGES__DIAGNOSTICCHAIN_MAP);

		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__NAME);
		createEReference(pageEClass, PAGE__TEXT_FIELDS);
		createEReference(pageEClass, PAGE__CHECK_BOX);
		createEReference(pageEClass, PAGE__RETURN_BUTTONS);
		createEReference(pageEClass, PAGE__NAVIGATOR_BUTTONS);
		createEReference(pageEClass, PAGE__POP_UP_BUTTONS);
		createEReference(pageEClass, PAGE__CLOSE_BUTTONS);
		createEOperation(pageEClass, PAGE___BUTTONS);
		createEOperation(pageEClass, PAGE___REACHABLE__PAGE);
		createEOperation(pageEClass, PAGE___ACTION);
		createEOperation(pageEClass, PAGE___SHOW);
		createEOperation(pageEClass, PAGE___CLOSE);
		createEOperation(pageEClass, PAGE___MAX_ONE_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___NON_DUPLICATE_BUTTONS_LABEL__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___NOT_ONLY_POP_UP_BUTTONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(pageEClass, PAGE___REQUIRED_BUTTONS__DIAGNOSTICCHAIN_MAP);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__LABEL);

		textFieldEClass = createEClass(TEXT_FIELD);
		createEAttribute(textFieldEClass, TEXT_FIELD__INPUT);
		createEAttribute(textFieldEClass, TEXT_FIELD__MIN_LENGTH);
		createEAttribute(textFieldEClass, TEXT_FIELD__MAX_LENGTH);
		createEOperation(textFieldEClass, TEXT_FIELD___VALID_BOUNDS__DIAGNOSTICCHAIN_MAP);
		createEOperation(textFieldEClass, TEXT_FIELD___MIN_INPUT_LENGTH__DIAGNOSTICCHAIN_MAP);
		createEOperation(textFieldEClass, TEXT_FIELD___MAX_INPUT_LENGTH__DIAGNOSTICCHAIN_MAP);

		checkBoxEClass = createEClass(CHECK_BOX);
		createEAttribute(checkBoxEClass, CHECK_BOX__SELECTED);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__CURRENT_PAGE);
		createEOperation(buttonEClass, BUTTON___ACTION);
		createEOperation(buttonEClass, BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP);

		returnButtonEClass = createEClass(RETURN_BUTTON);
		createEReference(returnButtonEClass, RETURN_BUTTON__SRC_PAGE);
		createEOperation(returnButtonEClass, RETURN_BUTTON___ACTION);

		navigatorButtonEClass = createEClass(NAVIGATOR_BUTTON);
		createEReference(navigatorButtonEClass, NAVIGATOR_BUTTON__DST_PAGE);
		createEReference(navigatorButtonEClass, NAVIGATOR_BUTTON__ALTER_DST_PAGE);
		createEOperation(navigatorButtonEClass, NAVIGATOR_BUTTON___TARGET_PAGE);
		createEOperation(navigatorButtonEClass, NAVIGATOR_BUTTON___REACHABLE__PAGE);
		createEOperation(navigatorButtonEClass, NAVIGATOR_BUTTON___ACTION);
		createEOperation(navigatorButtonEClass, NAVIGATOR_BUTTON___NO_SELF_LOOP__DIAGNOSTICCHAIN_MAP);

		popUpButtonEClass = createEClass(POP_UP_BUTTON);
		createEAttribute(popUpButtonEClass, POP_UP_BUTTON__POP_UP);
		createEOperation(popUpButtonEClass, POP_UP_BUTTON___ACTION);

		closeButtonEClass = createEClass(CLOSE_BUTTON);
		createEOperation(closeButtonEClass, CLOSE_BUTTON___ACTION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textFieldEClass.getESuperTypes().add(this.getComponent());
		checkBoxEClass.getESuperTypes().add(this.getComponent());
		buttonEClass.getESuperTypes().add(this.getComponent());
		returnButtonEClass.getESuperTypes().add(this.getButton());
		navigatorButtonEClass.getESuperTypes().add(this.getButton());
		popUpButtonEClass.getESuperTypes().add(this.getButton());
		closeButtonEClass.getESuperTypes().add(this.getButton());

		// Initialize classes, features, and operations; add parameters
		initEClass(wizardEClass, Wizard.class, "Wizard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWizard_Title(), ecorePackage.getEString(), "title", null, 1, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_Initial_page(), this.getPage(), null, "initial_page", null, 1, 1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWizard_Pages(), this.getPage(), null, "pages", null, 0, -1, Wizard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getWizard__InitialPageNoReturnButton__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "initialPageNoReturnButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWizard__ReachablePages__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "reachablePages", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWizard__NoDuplicatePages__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noDuplicatePages", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 1, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_TextFields(), this.getTextField(), null, "textFields", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_CheckBox(), this.getCheckBox(), null, "checkBox", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_ReturnButtons(), this.getReturnButton(), null, "returnButtons", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_NavigatorButtons(), this.getNavigatorButton(), null, "navigatorButtons", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_PopUpButtons(), this.getPopUpButton(), null, "popUpButtons", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPage_CloseButtons(), this.getCloseButton(), null, "closeButtons", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPage__Buttons(), this.getButton(), "buttons", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPage__Reachable__Page(), ecorePackage.getEBoolean(), "reachable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPage(), "page", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPage__Action(), null, "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPage__Show(), null, "show", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPage__Close(), null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__MaxOneReturnButton__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxOneReturnButton", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__NonDuplicateButtonsLabel__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateButtonsLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__NotOnlyPopUpButtons__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notOnlyPopUpButtons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPage__RequiredButtons__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "requiredButtons", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Label(), ecorePackage.getEString(), "label", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textFieldEClass, TextField.class, "TextField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextField_Input(), ecorePackage.getEString(), "input", null, 0, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextField_Min_length(), ecorePackage.getEInt(), "min_length", null, 1, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextField_Max_length(), ecorePackage.getEInt(), "max_length", null, 1, 1, TextField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTextField__ValidBounds__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validBounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTextField__MinInputLength__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "minInputLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTextField__MaxInputLength__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxInputLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(checkBoxEClass, CheckBox.class, "CheckBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheckBox_Selected(), ecorePackage.getEBoolean(), "selected", null, 1, 1, CheckBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_CurrentPage(), this.getPage(), null, "currentPage", null, 1, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getButton__Action(), null, "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getButton__MaxLabelLength__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxLabelLength", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(returnButtonEClass, ReturnButton.class, "ReturnButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnButton_SrcPage(), this.getPage(), null, "srcPage", null, 1, 1, ReturnButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReturnButton__Action(), null, "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(navigatorButtonEClass, NavigatorButton.class, "NavigatorButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigatorButton_DstPage(), this.getPage(), null, "dstPage", null, 1, 1, NavigatorButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNavigatorButton_AlterDstPage(), this.getPage(), null, "alterDstPage", null, 0, 1, NavigatorButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNavigatorButton__TargetPage(), this.getPage(), "targetPage", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNavigatorButton__Reachable__Page(), ecorePackage.getEBoolean(), "reachable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPage(), "page", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNavigatorButton__Action(), null, "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNavigatorButton__NoSelfLoop__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noSelfLoop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(popUpButtonEClass, PopUpButton.class, "PopUpButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPopUpButton_PopUp(), ecorePackage.getEString(), "popUp", null, 1, 1, PopUpButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPopUpButton__Action(), null, "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(closeButtonEClass, CloseButton.class, "CloseButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCloseButton__Action(), null, "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (wizardEClass,
		   source,
		   new String[] {
			   "constraints", "noDuplicatePages"
		   });
		addAnnotation
		  (pageEClass,
		   source,
		   new String[] {
			   "constraints", "requiredButtons"
		   });
		addAnnotation
		  (textFieldEClass,
		   source,
		   new String[] {
			   "constraints", "maxInputLength"
		   });
		addAnnotation
		  (buttonEClass,
		   source,
		   new String[] {
			   "constraints", "maxLabelLength"
		   });
		addAnnotation
		  (navigatorButtonEClass,
		   source,
		   new String[] {
			   "constraints", "noSelfLoop"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getWizard__InitialPageNoReturnButton__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.initial_page.returnButtons->size() = 0"
		   });
		addAnnotation
		  (getWizard__ReachablePages__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.pages->forAll(p | self.initial_page.reachable(p))"
		   });
		addAnnotation
		  (getWizard__NoDuplicatePages__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.pages->forAll(p1, p2 | p1 <> p2 implies p1.name <> p2.name)"
		   });
		addAnnotation
		  (getPage__Buttons(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tself.returnButtons->collect(oclAsType(Button))->union(\n\t\t\t\t\tself.navigatorButtons->collect(oclAsType(Button))\n\t\t\t\t)->union(\n\t\t\t\t\tself.popUpButtons->collect(oclAsType(Button))\n\t\t\t\t)->union(\n\t\t\t\t\tself.closeButtons->collect(oclAsType(Button))\n\t\t\t\t)->asSet()"
		   });
		addAnnotation
		  (getPage__Reachable__Page(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif self = page then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\t\tif self.navigatorButtons->isEmpty() then\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tself.navigatorButtons->exists(nb | nb.reachable(page))\n\t\t\t\t\t\tendif\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getPage__MaxOneReturnButton__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "-- max one return button per page\n\t\t\tself.returnButtons->size() <= 1"
		   });
		addAnnotation
		  (getPage__NonDuplicateButtonsLabel__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.buttons()->forAll(b1, b2 |\n\t\t\t\tb1 <> b2 implies b1.label <> b2.label\n\t\t\t)"
		   });
		addAnnotation
		  (getPage__NotOnlyPopUpButtons__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", " -- no page can contain only buttons that show messages\n\t\t\t(self.returnButtons->size() + self.navigatorButtons->size() + self.closeButtons->size()) > 0"
		   });
		addAnnotation
		  (getPage__RequiredButtons__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", " -- if no navigation buttons or return buttons then must contain at least one close button\n\t\t\t(self.navigatorButtons->size() = 0 or self.returnButtons->size() = 0) implies self.closeButtons->size() > 0"
		   });
		addAnnotation
		  (getTextField__ValidBounds__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t((not self.min_length->oclIsUndefined()) and (not self.max_length->oclIsUndefined()))\n\t\t\t\timplies (self.min_length <= self.max_length)"
		   });
		addAnnotation
		  (getTextField__MinInputLength__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t( not self.min_length->oclIsUndefined() ) implies self.input->size() >= self.min_length"
		   });
		addAnnotation
		  (getTextField__MaxInputLength__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t( not self.max_length->oclIsUndefined() ) implies self.input->size() <= self.max_length"
		   });
		addAnnotation
		  (getButton__MaxLabelLength__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.label.size() <= 10"
		   });
		addAnnotation
		  (getNavigatorButton__TargetPage(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif (not self.currentPage.checkBox->oclIsUndefined() and\n\t\t\t\t\tself.currentPage.checkBox.selected\n\t\t\t\t) then\n\t\t\t\t\tself.alterDstPage\n\t\t\t\telse\n\t\t\t\t\tself.dstPage\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getNavigatorButton__Reachable__Page(),
		   source,
		   new String[] {
			   "body", "\n\t\t\t\tif (not self.alterDstPage->oclIsUndefined() and\n\t\t\t\t\tnot self.currentPage.checkBox->oclIsUndefined()\n\t\t\t\t) then\n\t\t\t\t\tself.dstPage.reachable(page) or self.alterDstPage.reachable(page)\n\t\t\t\telse\n\t\t\t\t\tself.dstPage.reachable(page)\n\t\t\t\tendif"
		   });
		addAnnotation
		  (getNavigatorButton__NoSelfLoop__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tself.dstPage <> self.currentPage and\n\t\t\t\t(not self.alterDstPage->oclIsUndefined() implies self.alterDstPage <> self.currentPage)"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Collection</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCollectionAnnotations() {
		String source = "http://www.eclipse.org/OCL/Collection";
		addAnnotation
		  (getWizard_Pages(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPage__Buttons(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPage_TextFields(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPage_ReturnButtons(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPage_NavigatorButtons(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPage_PopUpButtons(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPage_CloseButtons(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
	}

} //WizardsPackageImpl
