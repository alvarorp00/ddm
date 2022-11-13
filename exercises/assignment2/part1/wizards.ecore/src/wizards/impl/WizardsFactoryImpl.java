/**
 */
package wizards.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wizards.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WizardsFactoryImpl extends EFactoryImpl implements WizardsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WizardsFactory init() {
		try {
			WizardsFactory theWizardsFactory = (WizardsFactory)EPackage.Registry.INSTANCE.getEFactory(WizardsPackage.eNS_URI);
			if (theWizardsFactory != null) {
				return theWizardsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WizardsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WizardsPackage.WIZARD: return createWizard();
			case WizardsPackage.PAGE: return createPage();
			case WizardsPackage.TEXT_FIELD: return createTextField();
			case WizardsPackage.CHECK_BOX: return createCheckBox();
			case WizardsPackage.RETURN_BUTTON: return createReturnButton();
			case WizardsPackage.NAVIGATOR_BUTTON: return createNavigatorButton();
			case WizardsPackage.POP_UP_BUTTON: return createPopUpButton();
			case WizardsPackage.CLOSE_BUTTON: return createCloseButton();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wizard createWizard() {
		WizardImpl wizard = new WizardImpl();
		return wizard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextField createTextField() {
		TextFieldImpl textField = new TextFieldImpl();
		return textField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnButton createReturnButton() {
		ReturnButtonImpl returnButton = new ReturnButtonImpl();
		return returnButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigatorButton createNavigatorButton() {
		NavigatorButtonImpl navigatorButton = new NavigatorButtonImpl();
		return navigatorButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopUpButton createPopUpButton() {
		PopUpButtonImpl popUpButton = new PopUpButtonImpl();
		return popUpButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseButton createCloseButton() {
		CloseButtonImpl closeButton = new CloseButtonImpl();
		return closeButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WizardsPackage getWizardsPackage() {
		return (WizardsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WizardsPackage getPackage() {
		return WizardsPackage.eINSTANCE;
	}

} //WizardsFactoryImpl
