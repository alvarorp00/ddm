/**
 */
package wizards;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see wizards.WizardsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface WizardsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wizards";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "wizards";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wizards";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WizardsPackage eINSTANCE = wizards.impl.WizardsPackageImpl.init();

	/**
	 * The meta object id for the '{@link wizards.impl.WizardImpl <em>Wizard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.WizardImpl
	 * @see wizards.impl.WizardsPackageImpl#getWizard()
	 * @generated
	 */
	int WIZARD = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Initial page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__INITIAL_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD__PAGES = 2;

	/**
	 * The number of structural features of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Initial Page No Return Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD___INITIAL_PAGE_NO_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Reachable Pages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD___REACHABLE_PAGES__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>No Duplicate Pages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD___NO_DUPLICATE_PAGES__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Wizard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIZARD_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link wizards.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.PageImpl
	 * @see wizards.impl.WizardsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Text Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TEXT_FIELDS = 1;

	/**
	 * The feature id for the '<em><b>Check Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CHECK_BOX = 2;

	/**
	 * The feature id for the '<em><b>Return Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__RETURN_BUTTONS = 3;

	/**
	 * The feature id for the '<em><b>Navigator Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAVIGATOR_BUTTONS = 4;

	/**
	 * The feature id for the '<em><b>Pop Up Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__POP_UP_BUTTONS = 5;

	/**
	 * The feature id for the '<em><b>Close Buttons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CLOSE_BUTTONS = 6;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Buttons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___BUTTONS = 0;

	/**
	 * The operation id for the '<em>Reachable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___REACHABLE__PAGE = 1;

	/**
	 * The operation id for the '<em>Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___ACTION = 2;

	/**
	 * The operation id for the '<em>Show</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___SHOW = 3;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___CLOSE = 4;

	/**
	 * The operation id for the '<em>Max One Return Button</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___MAX_ONE_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP = 5;

	/**
	 * The operation id for the '<em>Non Duplicate Buttons Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NON_DUPLICATE_BUTTONS_LABEL__DIAGNOSTICCHAIN_MAP = 6;

	/**
	 * The operation id for the '<em>Not Only Pop Up Buttons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___NOT_ONLY_POP_UP_BUTTONS__DIAGNOSTICCHAIN_MAP = 7;

	/**
	 * The operation id for the '<em>Required Buttons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE___REQUIRED_BUTTONS__DIAGNOSTICCHAIN_MAP = 8;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link wizards.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.ComponentImpl
	 * @see wizards.impl.WizardsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wizards.impl.TextFieldImpl <em>Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.TextFieldImpl
	 * @see wizards.impl.WizardsPackageImpl#getTextField()
	 * @generated
	 */
	int TEXT_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__LABEL = COMPONENT__LABEL;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__INPUT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MIN_LENGTH = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD__MAX_LENGTH = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Valid Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD___VALID_BOUNDS__DIAGNOSTICCHAIN_MAP = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Min Input Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD___MIN_INPUT_LENGTH__DIAGNOSTICCHAIN_MAP = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Max Input Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD___MAX_INPUT_LENGTH__DIAGNOSTICCHAIN_MAP = COMPONENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FIELD_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link wizards.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.CheckBoxImpl
	 * @see wizards.impl.WizardsPackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__LABEL = COMPONENT__LABEL;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SELECTED = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wizards.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.ButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = COMPONENT__LABEL;

	/**
	 * The feature id for the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__CURRENT_PAGE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___ACTION = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link wizards.impl.ReturnButtonImpl <em>Return Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.ReturnButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getReturnButton()
	 * @generated
	 */
	int RETURN_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON__CURRENT_PAGE = BUTTON__CURRENT_PAGE;

	/**
	 * The feature id for the '<em><b>Src Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON__SRC_PAGE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON___ACTION = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Return Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizards.impl.NavigatorButtonImpl <em>Navigator Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.NavigatorButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getNavigatorButton()
	 * @generated
	 */
	int NAVIGATOR_BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON__CURRENT_PAGE = BUTTON__CURRENT_PAGE;

	/**
	 * The feature id for the '<em><b>Dst Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON__DST_PAGE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alter Dst Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON__ALTER_DST_PAGE = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Navigator Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Target Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON___TARGET_PAGE = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Reachable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON___REACHABLE__PAGE = BUTTON_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON___ACTION = BUTTON_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>No Self Loop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON___NO_SELF_LOOP__DIAGNOSTICCHAIN_MAP = BUTTON_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Navigator Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATOR_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link wizards.impl.PopUpButtonImpl <em>Pop Up Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.PopUpButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getPopUpButton()
	 * @generated
	 */
	int POP_UP_BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_UP_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_UP_BUTTON__CURRENT_PAGE = BUTTON__CURRENT_PAGE;

	/**
	 * The feature id for the '<em><b>Pop Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_UP_BUTTON__POP_UP = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pop Up Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_UP_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_UP_BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_UP_BUTTON___ACTION = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pop Up Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_UP_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link wizards.impl.CloseButtonImpl <em>Close Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wizards.impl.CloseButtonImpl
	 * @see wizards.impl.WizardsPackageImpl#getCloseButton()
	 * @generated
	 */
	int CLOSE_BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__LABEL = BUTTON__LABEL;

	/**
	 * The feature id for the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON__CURRENT_PAGE = BUTTON__CURRENT_PAGE;

	/**
	 * The number of structural features of the '<em>Close Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Max Label Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON___ACTION = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Close Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link wizards.Wizard <em>Wizard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wizard</em>'.
	 * @see wizards.Wizard
	 * @generated
	 */
	EClass getWizard();

	/**
	 * Returns the meta object for the attribute '{@link wizards.Wizard#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wizards.Wizard#getTitle()
	 * @see #getWizard()
	 * @generated
	 */
	EAttribute getWizard_Title();

	/**
	 * Returns the meta object for the reference '{@link wizards.Wizard#getInitial_page <em>Initial page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial page</em>'.
	 * @see wizards.Wizard#getInitial_page()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Initial_page();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Wizard#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see wizards.Wizard#getPages()
	 * @see #getWizard()
	 * @generated
	 */
	EReference getWizard_Pages();

	/**
	 * Returns the meta object for the '{@link wizards.Wizard#initialPageNoReturnButton(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Initial Page No Return Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initial Page No Return Button</em>' operation.
	 * @see wizards.Wizard#initialPageNoReturnButton(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWizard__InitialPageNoReturnButton__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Wizard#reachablePages(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Reachable Pages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reachable Pages</em>' operation.
	 * @see wizards.Wizard#reachablePages(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWizard__ReachablePages__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Wizard#noDuplicatePages(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Duplicate Pages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Duplicate Pages</em>' operation.
	 * @see wizards.Wizard#noDuplicatePages(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getWizard__NoDuplicatePages__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see wizards.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link wizards.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wizards.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Page#getTextFields <em>Text Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Fields</em>'.
	 * @see wizards.Page#getTextFields()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_TextFields();

	/**
	 * Returns the meta object for the containment reference '{@link wizards.Page#getCheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Check Box</em>'.
	 * @see wizards.Page#getCheckBox()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_CheckBox();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Page#getReturnButtons <em>Return Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Buttons</em>'.
	 * @see wizards.Page#getReturnButtons()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_ReturnButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Page#getNavigatorButtons <em>Navigator Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigator Buttons</em>'.
	 * @see wizards.Page#getNavigatorButtons()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_NavigatorButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Page#getPopUpButtons <em>Pop Up Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pop Up Buttons</em>'.
	 * @see wizards.Page#getPopUpButtons()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PopUpButtons();

	/**
	 * Returns the meta object for the containment reference list '{@link wizards.Page#getCloseButtons <em>Close Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Close Buttons</em>'.
	 * @see wizards.Page#getCloseButtons()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_CloseButtons();

	/**
	 * Returns the meta object for the '{@link wizards.Page#action() <em>Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action</em>' operation.
	 * @see wizards.Page#action()
	 * @generated
	 */
	EOperation getPage__Action();

	/**
	 * Returns the meta object for the '{@link wizards.Page#show() <em>Show</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show</em>' operation.
	 * @see wizards.Page#show()
	 * @generated
	 */
	EOperation getPage__Show();

	/**
	 * Returns the meta object for the '{@link wizards.Page#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see wizards.Page#close()
	 * @generated
	 */
	EOperation getPage__Close();

	/**
	 * Returns the meta object for the '{@link wizards.Page#buttons() <em>Buttons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Buttons</em>' operation.
	 * @see wizards.Page#buttons()
	 * @generated
	 */
	EOperation getPage__Buttons();

	/**
	 * Returns the meta object for the '{@link wizards.Page#reachable(wizards.Page) <em>Reachable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reachable</em>' operation.
	 * @see wizards.Page#reachable(wizards.Page)
	 * @generated
	 */
	EOperation getPage__Reachable__Page();

	/**
	 * Returns the meta object for the '{@link wizards.Page#maxOneReturnButton(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max One Return Button</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max One Return Button</em>' operation.
	 * @see wizards.Page#maxOneReturnButton(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__MaxOneReturnButton__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Page#nonDuplicateButtonsLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Non Duplicate Buttons Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Non Duplicate Buttons Label</em>' operation.
	 * @see wizards.Page#nonDuplicateButtonsLabel(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__NonDuplicateButtonsLabel__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Page#notOnlyPopUpButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Not Only Pop Up Buttons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Not Only Pop Up Buttons</em>' operation.
	 * @see wizards.Page#notOnlyPopUpButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__NotOnlyPopUpButtons__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.Page#requiredButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Required Buttons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Required Buttons</em>' operation.
	 * @see wizards.Page#requiredButtons(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPage__RequiredButtons__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see wizards.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link wizards.Component#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see wizards.Component#getLabel()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Label();

	/**
	 * Returns the meta object for class '{@link wizards.TextField <em>Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Field</em>'.
	 * @see wizards.TextField
	 * @generated
	 */
	EClass getTextField();

	/**
	 * Returns the meta object for the attribute '{@link wizards.TextField#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see wizards.TextField#getInput()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Input();

	/**
	 * Returns the meta object for the attribute '{@link wizards.TextField#getMin_length <em>Min length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min length</em>'.
	 * @see wizards.TextField#getMin_length()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Min_length();

	/**
	 * Returns the meta object for the attribute '{@link wizards.TextField#getMax_length <em>Max length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max length</em>'.
	 * @see wizards.TextField#getMax_length()
	 * @see #getTextField()
	 * @generated
	 */
	EAttribute getTextField_Max_length();

	/**
	 * Returns the meta object for the '{@link wizards.TextField#validBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Bounds</em>' operation.
	 * @see wizards.TextField#validBounds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTextField__ValidBounds__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.TextField#maxInputLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max Input Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Input Length</em>' operation.
	 * @see wizards.TextField#maxInputLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTextField__MaxInputLength__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link wizards.TextField#minInputLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Min Input Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Min Input Length</em>' operation.
	 * @see wizards.TextField#minInputLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTextField__MinInputLength__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see wizards.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link wizards.CheckBox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see wizards.CheckBox#isSelected()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Selected();

	/**
	 * Returns the meta object for class '{@link wizards.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see wizards.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the reference '{@link wizards.Button#getCurrentPage <em>Current Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Page</em>'.
	 * @see wizards.Button#getCurrentPage()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_CurrentPage();

	/**
	 * Returns the meta object for the '{@link wizards.Button#action() <em>Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action</em>' operation.
	 * @see wizards.Button#action()
	 * @generated
	 */
	EOperation getButton__Action();

	/**
	 * Returns the meta object for the '{@link wizards.Button#maxLabelLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Max Label Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Max Label Length</em>' operation.
	 * @see wizards.Button#maxLabelLength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getButton__MaxLabelLength__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.ReturnButton <em>Return Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Button</em>'.
	 * @see wizards.ReturnButton
	 * @generated
	 */
	EClass getReturnButton();

	/**
	 * Returns the meta object for the reference '{@link wizards.ReturnButton#getSrcPage <em>Src Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Page</em>'.
	 * @see wizards.ReturnButton#getSrcPage()
	 * @see #getReturnButton()
	 * @generated
	 */
	EReference getReturnButton_SrcPage();

	/**
	 * Returns the meta object for the '{@link wizards.ReturnButton#action() <em>Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action</em>' operation.
	 * @see wizards.ReturnButton#action()
	 * @generated
	 */
	EOperation getReturnButton__Action();

	/**
	 * Returns the meta object for class '{@link wizards.NavigatorButton <em>Navigator Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigator Button</em>'.
	 * @see wizards.NavigatorButton
	 * @generated
	 */
	EClass getNavigatorButton();

	/**
	 * Returns the meta object for the reference '{@link wizards.NavigatorButton#getDstPage <em>Dst Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst Page</em>'.
	 * @see wizards.NavigatorButton#getDstPage()
	 * @see #getNavigatorButton()
	 * @generated
	 */
	EReference getNavigatorButton_DstPage();

	/**
	 * Returns the meta object for the reference '{@link wizards.NavigatorButton#getAlterDstPage <em>Alter Dst Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Alter Dst Page</em>'.
	 * @see wizards.NavigatorButton#getAlterDstPage()
	 * @see #getNavigatorButton()
	 * @generated
	 */
	EReference getNavigatorButton_AlterDstPage();

	/**
	 * Returns the meta object for the '{@link wizards.NavigatorButton#targetPage() <em>Target Page</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Target Page</em>' operation.
	 * @see wizards.NavigatorButton#targetPage()
	 * @generated
	 */
	EOperation getNavigatorButton__TargetPage();

	/**
	 * Returns the meta object for the '{@link wizards.NavigatorButton#reachable(wizards.Page) <em>Reachable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reachable</em>' operation.
	 * @see wizards.NavigatorButton#reachable(wizards.Page)
	 * @generated
	 */
	EOperation getNavigatorButton__Reachable__Page();

	/**
	 * Returns the meta object for the '{@link wizards.NavigatorButton#action() <em>Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action</em>' operation.
	 * @see wizards.NavigatorButton#action()
	 * @generated
	 */
	EOperation getNavigatorButton__Action();

	/**
	 * Returns the meta object for the '{@link wizards.NavigatorButton#noSelfLoop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>No Self Loop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>No Self Loop</em>' operation.
	 * @see wizards.NavigatorButton#noSelfLoop(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getNavigatorButton__NoSelfLoop__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link wizards.PopUpButton <em>Pop Up Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pop Up Button</em>'.
	 * @see wizards.PopUpButton
	 * @generated
	 */
	EClass getPopUpButton();

	/**
	 * Returns the meta object for the attribute '{@link wizards.PopUpButton#getPopUp <em>Pop Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pop Up</em>'.
	 * @see wizards.PopUpButton#getPopUp()
	 * @see #getPopUpButton()
	 * @generated
	 */
	EAttribute getPopUpButton_PopUp();

	/**
	 * Returns the meta object for the '{@link wizards.PopUpButton#action() <em>Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action</em>' operation.
	 * @see wizards.PopUpButton#action()
	 * @generated
	 */
	EOperation getPopUpButton__Action();

	/**
	 * Returns the meta object for class '{@link wizards.CloseButton <em>Close Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Button</em>'.
	 * @see wizards.CloseButton
	 * @generated
	 */
	EClass getCloseButton();

	/**
	 * Returns the meta object for the '{@link wizards.CloseButton#action() <em>Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action</em>' operation.
	 * @see wizards.CloseButton#action()
	 * @generated
	 */
	EOperation getCloseButton__Action();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WizardsFactory getWizardsFactory();

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
		 * The meta object literal for the '{@link wizards.impl.WizardImpl <em>Wizard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.WizardImpl
		 * @see wizards.impl.WizardsPackageImpl#getWizard()
		 * @generated
		 */
		EClass WIZARD = eINSTANCE.getWizard();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIZARD__TITLE = eINSTANCE.getWizard_Title();

		/**
		 * The meta object literal for the '<em><b>Initial page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__INITIAL_PAGE = eINSTANCE.getWizard_Initial_page();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIZARD__PAGES = eINSTANCE.getWizard_Pages();

		/**
		 * The meta object literal for the '<em><b>Initial Page No Return Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD___INITIAL_PAGE_NO_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWizard__InitialPageNoReturnButton__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Reachable Pages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD___REACHABLE_PAGES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWizard__ReachablePages__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>No Duplicate Pages</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WIZARD___NO_DUPLICATE_PAGES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getWizard__NoDuplicatePages__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.PageImpl
		 * @see wizards.impl.WizardsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Text Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__TEXT_FIELDS = eINSTANCE.getPage_TextFields();

		/**
		 * The meta object literal for the '<em><b>Check Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CHECK_BOX = eINSTANCE.getPage_CheckBox();

		/**
		 * The meta object literal for the '<em><b>Return Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__RETURN_BUTTONS = eINSTANCE.getPage_ReturnButtons();

		/**
		 * The meta object literal for the '<em><b>Navigator Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__NAVIGATOR_BUTTONS = eINSTANCE.getPage_NavigatorButtons();

		/**
		 * The meta object literal for the '<em><b>Pop Up Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__POP_UP_BUTTONS = eINSTANCE.getPage_PopUpButtons();

		/**
		 * The meta object literal for the '<em><b>Close Buttons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CLOSE_BUTTONS = eINSTANCE.getPage_CloseButtons();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___ACTION = eINSTANCE.getPage__Action();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___SHOW = eINSTANCE.getPage__Show();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___CLOSE = eINSTANCE.getPage__Close();

		/**
		 * The meta object literal for the '<em><b>Buttons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___BUTTONS = eINSTANCE.getPage__Buttons();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___REACHABLE__PAGE = eINSTANCE.getPage__Reachable__Page();

		/**
		 * The meta object literal for the '<em><b>Max One Return Button</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___MAX_ONE_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__MaxOneReturnButton__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Non Duplicate Buttons Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___NON_DUPLICATE_BUTTONS_LABEL__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__NonDuplicateButtonsLabel__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Not Only Pop Up Buttons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___NOT_ONLY_POP_UP_BUTTONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__NotOnlyPopUpButtons__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Required Buttons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAGE___REQUIRED_BUTTONS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPage__RequiredButtons__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.ComponentImpl
		 * @see wizards.impl.WizardsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__LABEL = eINSTANCE.getComponent_Label();

		/**
		 * The meta object literal for the '{@link wizards.impl.TextFieldImpl <em>Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.TextFieldImpl
		 * @see wizards.impl.WizardsPackageImpl#getTextField()
		 * @generated
		 */
		EClass TEXT_FIELD = eINSTANCE.getTextField();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__INPUT = eINSTANCE.getTextField_Input();

		/**
		 * The meta object literal for the '<em><b>Min length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__MIN_LENGTH = eINSTANCE.getTextField_Min_length();

		/**
		 * The meta object literal for the '<em><b>Max length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FIELD__MAX_LENGTH = eINSTANCE.getTextField_Max_length();

		/**
		 * The meta object literal for the '<em><b>Valid Bounds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FIELD___VALID_BOUNDS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTextField__ValidBounds__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Max Input Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FIELD___MAX_INPUT_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTextField__MaxInputLength__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Min Input Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEXT_FIELD___MIN_INPUT_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTextField__MinInputLength__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.CheckBoxImpl
		 * @see wizards.impl.WizardsPackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__SELECTED = eINSTANCE.getCheckBox_Selected();

		/**
		 * The meta object literal for the '{@link wizards.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.ButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Current Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__CURRENT_PAGE = eINSTANCE.getButton_CurrentPage();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON___ACTION = eINSTANCE.getButton__Action();

		/**
		 * The meta object literal for the '<em><b>Max Label Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUTTON___MAX_LABEL_LENGTH__DIAGNOSTICCHAIN_MAP = eINSTANCE.getButton__MaxLabelLength__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.ReturnButtonImpl <em>Return Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.ReturnButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getReturnButton()
		 * @generated
		 */
		EClass RETURN_BUTTON = eINSTANCE.getReturnButton();

		/**
		 * The meta object literal for the '<em><b>Src Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_BUTTON__SRC_PAGE = eINSTANCE.getReturnButton_SrcPage();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETURN_BUTTON___ACTION = eINSTANCE.getReturnButton__Action();

		/**
		 * The meta object literal for the '{@link wizards.impl.NavigatorButtonImpl <em>Navigator Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.NavigatorButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getNavigatorButton()
		 * @generated
		 */
		EClass NAVIGATOR_BUTTON = eINSTANCE.getNavigatorButton();

		/**
		 * The meta object literal for the '<em><b>Dst Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATOR_BUTTON__DST_PAGE = eINSTANCE.getNavigatorButton_DstPage();

		/**
		 * The meta object literal for the '<em><b>Alter Dst Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATOR_BUTTON__ALTER_DST_PAGE = eINSTANCE.getNavigatorButton_AlterDstPage();

		/**
		 * The meta object literal for the '<em><b>Target Page</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATOR_BUTTON___TARGET_PAGE = eINSTANCE.getNavigatorButton__TargetPage();

		/**
		 * The meta object literal for the '<em><b>Reachable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATOR_BUTTON___REACHABLE__PAGE = eINSTANCE.getNavigatorButton__Reachable__Page();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATOR_BUTTON___ACTION = eINSTANCE.getNavigatorButton__Action();

		/**
		 * The meta object literal for the '<em><b>No Self Loop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATOR_BUTTON___NO_SELF_LOOP__DIAGNOSTICCHAIN_MAP = eINSTANCE.getNavigatorButton__NoSelfLoop__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link wizards.impl.PopUpButtonImpl <em>Pop Up Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.PopUpButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getPopUpButton()
		 * @generated
		 */
		EClass POP_UP_BUTTON = eINSTANCE.getPopUpButton();

		/**
		 * The meta object literal for the '<em><b>Pop Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POP_UP_BUTTON__POP_UP = eINSTANCE.getPopUpButton_PopUp();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POP_UP_BUTTON___ACTION = eINSTANCE.getPopUpButton__Action();

		/**
		 * The meta object literal for the '{@link wizards.impl.CloseButtonImpl <em>Close Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wizards.impl.CloseButtonImpl
		 * @see wizards.impl.WizardsPackageImpl#getCloseButton()
		 * @generated
		 */
		EClass CLOSE_BUTTON = eINSTANCE.getCloseButton();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOSE_BUTTON___ACTION = eINSTANCE.getCloseButton__Action();

	}

} //WizardsPackage
