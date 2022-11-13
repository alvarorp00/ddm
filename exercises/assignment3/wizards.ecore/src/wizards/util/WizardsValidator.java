/**
 */
package wizards.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import wizards.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wizards.WizardsPackage
 * @generated
 */
public class WizardsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WizardsValidator INSTANCE = new WizardsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wizards";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Initial Page No Return Button' of 'Wizard'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIZARD__INITIAL_PAGE_NO_RETURN_BUTTON = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reachable Pages' of 'Wizard'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIZARD__REACHABLE_PAGES = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Duplicate Pages' of 'Wizard'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int WIZARD__NO_DUPLICATE_PAGES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max One Return Button' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__MAX_ONE_RETURN_BUTTON = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Buttons Label' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__NON_DUPLICATE_BUTTONS_LABEL = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Not Only Pop Up Buttons' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__NOT_ONLY_POP_UP_BUTTONS = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Required Buttons' of 'Page'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE__REQUIRED_BUTTONS = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Bounds' of 'Text Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_FIELD__VALID_BOUNDS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Input Length' of 'Text Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_FIELD__MAX_INPUT_LENGTH = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Min Input Length' of 'Text Field'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TEXT_FIELD__MIN_INPUT_LENGTH = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Max Label Length' of 'Button'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BUTTON__MAX_LABEL_LENGTH = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'No Self Loop' of 'Navigator Button'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NAVIGATOR_BUTTON__NO_SELF_LOOP = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 12;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardsValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WizardsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WizardsPackage.WIZARD:
				return validateWizard((Wizard)value, diagnostics, context);
			case WizardsPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case WizardsPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case WizardsPackage.TEXT_FIELD:
				return validateTextField((TextField)value, diagnostics, context);
			case WizardsPackage.CHECK_BOX:
				return validateCheckBox((CheckBox)value, diagnostics, context);
			case WizardsPackage.BUTTON:
				return validateButton((Button)value, diagnostics, context);
			case WizardsPackage.RETURN_BUTTON:
				return validateReturnButton((ReturnButton)value, diagnostics, context);
			case WizardsPackage.NAVIGATOR_BUTTON:
				return validateNavigatorButton((NavigatorButton)value, diagnostics, context);
			case WizardsPackage.POP_UP_BUTTON:
				return validatePopUpButton((PopUpButton)value, diagnostics, context);
			case WizardsPackage.CLOSE_BUTTON:
				return validateCloseButton((CloseButton)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wizard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateWizard_noDuplicatePages(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateWizard_initialPageNoReturnButton(wizard, diagnostics, context);
		if (result || diagnostics != null) result &= validateWizard_reachablePages(wizard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noDuplicatePages constraint of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard_noDuplicatePages(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wizard.noDuplicatePages(diagnostics, context);
	}

	/**
	 * Validates the reachablePages constraint of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard_reachablePages(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wizard.reachablePages(diagnostics, context);
	}

	/**
	 * Validates the initialPageNoReturnButton constraint of '<em>Wizard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWizard_initialPageNoReturnButton(Wizard wizard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return wizard.initialPageNoReturnButton(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_requiredButtons(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_maxOneReturnButton(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_nonDuplicateButtonsLabel(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_notOnlyPopUpButtons(page, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredButtons constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_requiredButtons(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.requiredButtons(diagnostics, context);
	}

	/**
	 * Validates the maxOneReturnButton constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_maxOneReturnButton(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.maxOneReturnButton(diagnostics, context);
	}

	/**
	 * Validates the nonDuplicateButtonsLabel constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_nonDuplicateButtonsLabel(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.nonDuplicateButtonsLabel(diagnostics, context);
	}

	/**
	 * Validates the notOnlyPopUpButtons constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_notOnlyPopUpButtons(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return page.notOnlyPopUpButtons(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextField_maxInputLength(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextField_validBounds(textField, diagnostics, context);
		if (result || diagnostics != null) result &= validateTextField_minInputLength(textField, diagnostics, context);
		return result;
	}

	/**
	 * Validates the minInputLength constraint of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField_minInputLength(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return textField.minInputLength(diagnostics, context);
	}

	/**
	 * Validates the maxInputLength constraint of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField_maxInputLength(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return textField.maxInputLength(diagnostics, context);
	}

	/**
	 * Validates the validBounds constraint of '<em>Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextField_validBounds(TextField textField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return textField.validBounds(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckBox(CheckBox checkBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(button, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(button, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(button, diagnostics, context);
		return result;
	}

	/**
	 * Validates the maxLabelLength constraint of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButton_maxLabelLength(Button button, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return button.maxLabelLength(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnButton(ReturnButton returnButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(returnButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(returnButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(returnButton, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigatorButton(NavigatorButton navigatorButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigatorButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(navigatorButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateNavigatorButton_noSelfLoop(navigatorButton, diagnostics, context);
		return result;
	}

	/**
	 * Validates the noSelfLoop constraint of '<em>Navigator Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigatorButton_noSelfLoop(NavigatorButton navigatorButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return navigatorButton.noSelfLoop(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePopUpButton(PopUpButton popUpButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(popUpButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(popUpButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(popUpButton, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloseButton(CloseButton closeButton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(closeButton, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(closeButton, diagnostics, context);
		if (result || diagnostics != null) result &= validateButton_maxLabelLength(closeButton, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WizardsValidator
