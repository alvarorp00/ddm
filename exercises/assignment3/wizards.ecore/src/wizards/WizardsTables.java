/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /wizards.ecore/model/wizards.ecore
 * using:
 *   /wizards.ecore/model/wizards.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package wizards;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
// import wizards.WizardsPackage;
// import wizards.WizardsTables;

/**
 * WizardsTables provides the dispatch tables for the wizards for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class WizardsTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(WizardsPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid__s_ejemplo_s_metamodel_s_wizards_ecore = IdManager.getNsURIPackageId("/ejemplo/metamodel/wizards.ecore", null, WizardsPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Button = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("Button", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CheckBox = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("CheckBox", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = WizardsTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CloseButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("CloseButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_NavigatorButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("NavigatorButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PopUpButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("PopUpButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ReturnButton = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("ReturnButton", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TextField = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("TextField", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Wizard = WizardsTables.PACKid__s_ejemplo_s_metamodel_s_wizards_ecore.getClassId("Wizard", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = WizardsTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_10 = ValueUtil.integerValueOf("10");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Button = TypeId.BAG.getSpecializedId(WizardsTables.CLSSid_Button);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_NavigatorButton = TypeId.BAG.getSpecializedId(WizardsTables.CLSSid_NavigatorButton);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ReturnButton = TypeId.BAG.getSpecializedId(WizardsTables.CLSSid_ReturnButton);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Wizard = TypeId.BAG.getSpecializedId(WizardsTables.CLSSid_Wizard);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Button = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_Button);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_CheckBox = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_CheckBox);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_CloseButton = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_CloseButton);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_NavigatorButton = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_NavigatorButton);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Page = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_Page);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PopUpButton = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_PopUpButton);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ReturnButton = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_ReturnButton);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_TextField = TypeId.SET.getSpecializedId(WizardsTables.CLSSid_TextField);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			WizardsTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Button = new EcoreExecutorType(WizardsPackage.Literals.BUTTON, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _CheckBox = new EcoreExecutorType(WizardsPackage.Literals.CHECK_BOX, PACKAGE, 0);
		public static final EcoreExecutorType _CloseButton = new EcoreExecutorType(WizardsPackage.Literals.CLOSE_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _Component = new EcoreExecutorType(WizardsPackage.Literals.COMPONENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _NavigatorButton = new EcoreExecutorType(WizardsPackage.Literals.NAVIGATOR_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(WizardsPackage.Literals.PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _PopUpButton = new EcoreExecutorType(WizardsPackage.Literals.POP_UP_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _ReturnButton = new EcoreExecutorType(WizardsPackage.Literals.RETURN_BUTTON, PACKAGE, 0);
		public static final EcoreExecutorType _TextField = new EcoreExecutorType(WizardsPackage.Literals.TEXT_FIELD, PACKAGE, 0);
		public static final EcoreExecutorType _Wizard = new EcoreExecutorType(WizardsPackage.Literals.WIZARD, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Button,
			_CheckBox,
			_CloseButton,
			_Component,
			_NavigatorButton,
			_Page,
			_PopUpButton,
			_ReturnButton,
			_TextField,
			_Wizard
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Button__Button = new ExecutorFragment(Types._Button, WizardsTables.Types._Button);
		private static final ExecutorFragment _Button__Component = new ExecutorFragment(Types._Button, WizardsTables.Types._Component);
		private static final ExecutorFragment _Button__OclAny = new ExecutorFragment(Types._Button, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Button__OclElement = new ExecutorFragment(Types._Button, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CheckBox__CheckBox = new ExecutorFragment(Types._CheckBox, WizardsTables.Types._CheckBox);
		private static final ExecutorFragment _CheckBox__Component = new ExecutorFragment(Types._CheckBox, WizardsTables.Types._Component);
		private static final ExecutorFragment _CheckBox__OclAny = new ExecutorFragment(Types._CheckBox, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CheckBox__OclElement = new ExecutorFragment(Types._CheckBox, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CloseButton__Button = new ExecutorFragment(Types._CloseButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _CloseButton__CloseButton = new ExecutorFragment(Types._CloseButton, WizardsTables.Types._CloseButton);
		private static final ExecutorFragment _CloseButton__Component = new ExecutorFragment(Types._CloseButton, WizardsTables.Types._Component);
		private static final ExecutorFragment _CloseButton__OclAny = new ExecutorFragment(Types._CloseButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CloseButton__OclElement = new ExecutorFragment(Types._CloseButton, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Component__Component = new ExecutorFragment(Types._Component, WizardsTables.Types._Component);
		private static final ExecutorFragment _Component__OclAny = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Component__OclElement = new ExecutorFragment(Types._Component, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NavigatorButton__Button = new ExecutorFragment(Types._NavigatorButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _NavigatorButton__Component = new ExecutorFragment(Types._NavigatorButton, WizardsTables.Types._Component);
		private static final ExecutorFragment _NavigatorButton__NavigatorButton = new ExecutorFragment(Types._NavigatorButton, WizardsTables.Types._NavigatorButton);
		private static final ExecutorFragment _NavigatorButton__OclAny = new ExecutorFragment(Types._NavigatorButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NavigatorButton__OclElement = new ExecutorFragment(Types._NavigatorButton, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, WizardsTables.Types._Page);

		private static final ExecutorFragment _PopUpButton__Button = new ExecutorFragment(Types._PopUpButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _PopUpButton__Component = new ExecutorFragment(Types._PopUpButton, WizardsTables.Types._Component);
		private static final ExecutorFragment _PopUpButton__OclAny = new ExecutorFragment(Types._PopUpButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PopUpButton__OclElement = new ExecutorFragment(Types._PopUpButton, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PopUpButton__PopUpButton = new ExecutorFragment(Types._PopUpButton, WizardsTables.Types._PopUpButton);

		private static final ExecutorFragment _ReturnButton__Button = new ExecutorFragment(Types._ReturnButton, WizardsTables.Types._Button);
		private static final ExecutorFragment _ReturnButton__Component = new ExecutorFragment(Types._ReturnButton, WizardsTables.Types._Component);
		private static final ExecutorFragment _ReturnButton__OclAny = new ExecutorFragment(Types._ReturnButton, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ReturnButton__OclElement = new ExecutorFragment(Types._ReturnButton, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ReturnButton__ReturnButton = new ExecutorFragment(Types._ReturnButton, WizardsTables.Types._ReturnButton);

		private static final ExecutorFragment _TextField__Component = new ExecutorFragment(Types._TextField, WizardsTables.Types._Component);
		private static final ExecutorFragment _TextField__OclAny = new ExecutorFragment(Types._TextField, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TextField__OclElement = new ExecutorFragment(Types._TextField, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TextField__TextField = new ExecutorFragment(Types._TextField, WizardsTables.Types._TextField);

		private static final ExecutorFragment _Wizard__OclAny = new ExecutorFragment(Types._Wizard, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Wizard__OclElement = new ExecutorFragment(Types._Wizard, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Wizard__Wizard = new ExecutorFragment(Types._Wizard, WizardsTables.Types._Wizard);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _Page = TypeUtil.createParameterTypes(WizardsTables.Types._Page);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Button__action = new ExecutorOperation("action", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Button,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _CloseButton__action = new ExecutorOperation("action", TypeUtil.EMPTY_PARAMETER_TYPES, Types._CloseButton,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _NavigatorButton__action = new ExecutorOperation("action", TypeUtil.EMPTY_PARAMETER_TYPES, Types._NavigatorButton,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _NavigatorButton__reachable = new ExecutorOperation("reachable", Parameters._Page, Types._NavigatorButton,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _NavigatorButton__targetPage = new ExecutorOperation("targetPage", TypeUtil.EMPTY_PARAMETER_TYPES, Types._NavigatorButton,
			2, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Page__action = new ExecutorOperation("action", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Page,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Page__buttons = new ExecutorOperation("buttons", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Page,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Page__close = new ExecutorOperation("close", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Page,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Page__reachable = new ExecutorOperation("reachable", Parameters._Page, Types._Page,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Page__show = new ExecutorOperation("show", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Page,
			4, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _PopUpButton__action = new ExecutorOperation("action", TypeUtil.EMPTY_PARAMETER_TYPES, Types._PopUpButton,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _ReturnButton__action = new ExecutorOperation("action", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ReturnButton,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Button__currentPage = new EcoreExecutorProperty(WizardsPackage.Literals.BUTTON__CURRENT_PAGE, Types._Button, 0);

		public static final ExecutorProperty _CheckBox__selected = new EcoreExecutorProperty(WizardsPackage.Literals.CHECK_BOX__SELECTED, Types._CheckBox, 0);
		public static final ExecutorProperty _CheckBox__Page__checkBox = new ExecutorPropertyWithImplementation("Page", Types._CheckBox, 1, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__CHECK_BOX));

		public static final ExecutorProperty _CloseButton__Page__closeButtons = new ExecutorPropertyWithImplementation("Page", Types._CloseButton, 0, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__CLOSE_BUTTONS));

		public static final ExecutorProperty _Component__label = new EcoreExecutorProperty(WizardsPackage.Literals.COMPONENT__LABEL, Types._Component, 0);

		public static final ExecutorProperty _NavigatorButton__alterDstPage = new EcoreExecutorProperty(WizardsPackage.Literals.NAVIGATOR_BUTTON__ALTER_DST_PAGE, Types._NavigatorButton, 0);
		public static final ExecutorProperty _NavigatorButton__dstPage = new EcoreExecutorProperty(WizardsPackage.Literals.NAVIGATOR_BUTTON__DST_PAGE, Types._NavigatorButton, 1);
		public static final ExecutorProperty _NavigatorButton__Page__navigatorButtons = new ExecutorPropertyWithImplementation("Page", Types._NavigatorButton, 2, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__NAVIGATOR_BUTTONS));

		public static final ExecutorProperty _Page__checkBox = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__CHECK_BOX, Types._Page, 0);
		public static final ExecutorProperty _Page__closeButtons = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__CLOSE_BUTTONS, Types._Page, 1);
		public static final ExecutorProperty _Page__name = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__NAME, Types._Page, 2);
		public static final ExecutorProperty _Page__navigatorButtons = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__NAVIGATOR_BUTTONS, Types._Page, 3);
		public static final ExecutorProperty _Page__popUpButtons = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__POP_UP_BUTTONS, Types._Page, 4);
		public static final ExecutorProperty _Page__returnButtons = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__RETURN_BUTTONS, Types._Page, 5);
		public static final ExecutorProperty _Page__textFields = new EcoreExecutorProperty(WizardsPackage.Literals.PAGE__TEXT_FIELDS, Types._Page, 6);
		public static final ExecutorProperty _Page__Button__currentPage = new ExecutorPropertyWithImplementation("Button", Types._Page, 7, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.BUTTON__CURRENT_PAGE));
		public static final ExecutorProperty _Page__NavigatorButton__alterDstPage = new ExecutorPropertyWithImplementation("NavigatorButton", Types._Page, 8, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.NAVIGATOR_BUTTON__ALTER_DST_PAGE));
		public static final ExecutorProperty _Page__NavigatorButton__dstPage = new ExecutorPropertyWithImplementation("NavigatorButton", Types._Page, 9, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.NAVIGATOR_BUTTON__DST_PAGE));
		public static final ExecutorProperty _Page__ReturnButton__srcPage = new ExecutorPropertyWithImplementation("ReturnButton", Types._Page, 10, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.RETURN_BUTTON__SRC_PAGE));
		public static final ExecutorProperty _Page__Wizard__initial_page = new ExecutorPropertyWithImplementation("Wizard", Types._Page, 11, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.WIZARD__INITIAL_PAGE));
		public static final ExecutorProperty _Page__Wizard__pages = new ExecutorPropertyWithImplementation("Wizard", Types._Page, 12, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.WIZARD__PAGES));

		public static final ExecutorProperty _PopUpButton__popUp = new EcoreExecutorProperty(WizardsPackage.Literals.POP_UP_BUTTON__POP_UP, Types._PopUpButton, 0);
		public static final ExecutorProperty _PopUpButton__Page__popUpButtons = new ExecutorPropertyWithImplementation("Page", Types._PopUpButton, 1, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__POP_UP_BUTTONS));

		public static final ExecutorProperty _ReturnButton__srcPage = new EcoreExecutorProperty(WizardsPackage.Literals.RETURN_BUTTON__SRC_PAGE, Types._ReturnButton, 0);
		public static final ExecutorProperty _ReturnButton__Page__returnButtons = new ExecutorPropertyWithImplementation("Page", Types._ReturnButton, 1, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__RETURN_BUTTONS));

		public static final ExecutorProperty _TextField__input = new EcoreExecutorProperty(WizardsPackage.Literals.TEXT_FIELD__INPUT, Types._TextField, 0);
		public static final ExecutorProperty _TextField__max_length = new EcoreExecutorProperty(WizardsPackage.Literals.TEXT_FIELD__MAX_LENGTH, Types._TextField, 1);
		public static final ExecutorProperty _TextField__min_length = new EcoreExecutorProperty(WizardsPackage.Literals.TEXT_FIELD__MIN_LENGTH, Types._TextField, 2);
		public static final ExecutorProperty _TextField__Page__textFields = new ExecutorPropertyWithImplementation("Page", Types._TextField, 3, new EcoreLibraryOppositeProperty(WizardsPackage.Literals.PAGE__TEXT_FIELDS));

		public static final ExecutorProperty _Wizard__initial_page = new EcoreExecutorProperty(WizardsPackage.Literals.WIZARD__INITIAL_PAGE, Types._Wizard, 0);
		public static final ExecutorProperty _Wizard__pages = new EcoreExecutorProperty(WizardsPackage.Literals.WIZARD__PAGES, Types._Wizard, 1);
		public static final ExecutorProperty _Wizard__title = new EcoreExecutorProperty(WizardsPackage.Literals.WIZARD__TITLE, Types._Wizard, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Button =
			{
				Fragments._Button__OclAny /* 0 */,
				Fragments._Button__OclElement /* 1 */,
				Fragments._Button__Component /* 2 */,
				Fragments._Button__Button /* 3 */
			};
		private static final int /*@NonNull*/ [] __Button = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CheckBox =
			{
				Fragments._CheckBox__OclAny /* 0 */,
				Fragments._CheckBox__OclElement /* 1 */,
				Fragments._CheckBox__Component /* 2 */,
				Fragments._CheckBox__CheckBox /* 3 */
			};
		private static final int /*@NonNull*/ [] __CheckBox = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CloseButton =
			{
				Fragments._CloseButton__OclAny /* 0 */,
				Fragments._CloseButton__OclElement /* 1 */,
				Fragments._CloseButton__Component /* 2 */,
				Fragments._CloseButton__Button /* 3 */,
				Fragments._CloseButton__CloseButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __CloseButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Component =
			{
				Fragments._Component__OclAny /* 0 */,
				Fragments._Component__OclElement /* 1 */,
				Fragments._Component__Component /* 2 */
			};
		private static final int /*@NonNull*/ [] __Component = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NavigatorButton =
			{
				Fragments._NavigatorButton__OclAny /* 0 */,
				Fragments._NavigatorButton__OclElement /* 1 */,
				Fragments._NavigatorButton__Component /* 2 */,
				Fragments._NavigatorButton__Button /* 3 */,
				Fragments._NavigatorButton__NavigatorButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __NavigatorButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__Page /* 2 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PopUpButton =
			{
				Fragments._PopUpButton__OclAny /* 0 */,
				Fragments._PopUpButton__OclElement /* 1 */,
				Fragments._PopUpButton__Component /* 2 */,
				Fragments._PopUpButton__Button /* 3 */,
				Fragments._PopUpButton__PopUpButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __PopUpButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ReturnButton =
			{
				Fragments._ReturnButton__OclAny /* 0 */,
				Fragments._ReturnButton__OclElement /* 1 */,
				Fragments._ReturnButton__Component /* 2 */,
				Fragments._ReturnButton__Button /* 3 */,
				Fragments._ReturnButton__ReturnButton /* 4 */
			};
		private static final int /*@NonNull*/ [] __ReturnButton = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TextField =
			{
				Fragments._TextField__OclAny /* 0 */,
				Fragments._TextField__OclElement /* 1 */,
				Fragments._TextField__Component /* 2 */,
				Fragments._TextField__TextField /* 3 */
			};
		private static final int /*@NonNull*/ [] __TextField = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Wizard =
			{
				Fragments._Wizard__OclAny /* 0 */,
				Fragments._Wizard__OclElement /* 1 */,
				Fragments._Wizard__Wizard /* 2 */
			};
		private static final int /*@NonNull*/ [] __Wizard = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Button.initFragments(_Button, __Button);
			Types._CheckBox.initFragments(_CheckBox, __CheckBox);
			Types._CloseButton.initFragments(_CloseButton, __CloseButton);
			Types._Component.initFragments(_Component, __Component);
			Types._NavigatorButton.initFragments(_NavigatorButton, __NavigatorButton);
			Types._Page.initFragments(_Page, __Page);
			Types._PopUpButton.initFragments(_PopUpButton, __PopUpButton);
			Types._ReturnButton.initFragments(_ReturnButton, __ReturnButton);
			Types._TextField.initFragments(_TextField, __TextField);
			Types._Wizard.initFragments(_Wizard, __Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Button__Button = {
			WizardsTables.Operations._Button__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Button__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Button__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Button__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__CheckBox = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CheckBox__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__CloseButton = {
			WizardsTables.Operations._CloseButton__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__Button = {
			WizardsTables.Operations._CloseButton__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloseButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Component__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Component__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NavigatorButton__NavigatorButton = {
			WizardsTables.Operations._NavigatorButton__action /* action() */,
			WizardsTables.Operations._NavigatorButton__reachable /* reachable(Page[1]) */,
			WizardsTables.Operations._NavigatorButton__targetPage /* targetPage() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NavigatorButton__Button = {
			WizardsTables.Operations._NavigatorButton__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NavigatorButton__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NavigatorButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NavigatorButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {
			WizardsTables.Operations._Page__action /* action() */,
			WizardsTables.Operations._Page__buttons /* buttons() */,
			WizardsTables.Operations._Page__close /* close() */,
			WizardsTables.Operations._Page__reachable /* reachable(Page[1]) */,
			WizardsTables.Operations._Page__show /* show() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PopUpButton__PopUpButton = {
			WizardsTables.Operations._PopUpButton__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PopUpButton__Button = {
			WizardsTables.Operations._PopUpButton__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PopUpButton__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PopUpButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PopUpButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__ReturnButton = {
			WizardsTables.Operations._ReturnButton__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__Button = {
			WizardsTables.Operations._ReturnButton__action /* action() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ReturnButton__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TextField__TextField = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TextField__Component = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TextField__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TextField__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Wizard__Wizard = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Wizard__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Wizard__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Button__Button.initOperations(_Button__Button);
			Fragments._Button__Component.initOperations(_Button__Component);
			Fragments._Button__OclAny.initOperations(_Button__OclAny);
			Fragments._Button__OclElement.initOperations(_Button__OclElement);

			Fragments._CheckBox__CheckBox.initOperations(_CheckBox__CheckBox);
			Fragments._CheckBox__Component.initOperations(_CheckBox__Component);
			Fragments._CheckBox__OclAny.initOperations(_CheckBox__OclAny);
			Fragments._CheckBox__OclElement.initOperations(_CheckBox__OclElement);

			Fragments._CloseButton__Button.initOperations(_CloseButton__Button);
			Fragments._CloseButton__CloseButton.initOperations(_CloseButton__CloseButton);
			Fragments._CloseButton__Component.initOperations(_CloseButton__Component);
			Fragments._CloseButton__OclAny.initOperations(_CloseButton__OclAny);
			Fragments._CloseButton__OclElement.initOperations(_CloseButton__OclElement);

			Fragments._Component__Component.initOperations(_Component__Component);
			Fragments._Component__OclAny.initOperations(_Component__OclAny);
			Fragments._Component__OclElement.initOperations(_Component__OclElement);

			Fragments._NavigatorButton__Button.initOperations(_NavigatorButton__Button);
			Fragments._NavigatorButton__Component.initOperations(_NavigatorButton__Component);
			Fragments._NavigatorButton__NavigatorButton.initOperations(_NavigatorButton__NavigatorButton);
			Fragments._NavigatorButton__OclAny.initOperations(_NavigatorButton__OclAny);
			Fragments._NavigatorButton__OclElement.initOperations(_NavigatorButton__OclElement);

			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._PopUpButton__Button.initOperations(_PopUpButton__Button);
			Fragments._PopUpButton__Component.initOperations(_PopUpButton__Component);
			Fragments._PopUpButton__OclAny.initOperations(_PopUpButton__OclAny);
			Fragments._PopUpButton__OclElement.initOperations(_PopUpButton__OclElement);
			Fragments._PopUpButton__PopUpButton.initOperations(_PopUpButton__PopUpButton);

			Fragments._ReturnButton__Button.initOperations(_ReturnButton__Button);
			Fragments._ReturnButton__Component.initOperations(_ReturnButton__Component);
			Fragments._ReturnButton__OclAny.initOperations(_ReturnButton__OclAny);
			Fragments._ReturnButton__OclElement.initOperations(_ReturnButton__OclElement);
			Fragments._ReturnButton__ReturnButton.initOperations(_ReturnButton__ReturnButton);

			Fragments._TextField__Component.initOperations(_TextField__Component);
			Fragments._TextField__OclAny.initOperations(_TextField__OclAny);
			Fragments._TextField__OclElement.initOperations(_TextField__OclElement);
			Fragments._TextField__TextField.initOperations(_TextField__TextField);

			Fragments._Wizard__OclAny.initOperations(_Wizard__OclAny);
			Fragments._Wizard__OclElement.initOperations(_Wizard__OclElement);
			Fragments._Wizard__Wizard.initOperations(_Wizard__Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Button = {
			WizardsTables.Properties._Button__currentPage,
			WizardsTables.Properties._Component__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CheckBox = {
			WizardsTables.Properties._Component__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._CheckBox__selected
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CloseButton = {
			WizardsTables.Properties._Button__currentPage,
			WizardsTables.Properties._Component__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Component = {
			WizardsTables.Properties._Component__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NavigatorButton = {
			WizardsTables.Properties._NavigatorButton__alterDstPage,
			WizardsTables.Properties._Button__currentPage,
			WizardsTables.Properties._NavigatorButton__dstPage,
			WizardsTables.Properties._Component__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			WizardsTables.Properties._Page__checkBox,
			WizardsTables.Properties._Page__closeButtons,
			WizardsTables.Properties._Page__name,
			WizardsTables.Properties._Page__navigatorButtons,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Page__popUpButtons,
			WizardsTables.Properties._Page__returnButtons,
			WizardsTables.Properties._Page__textFields
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PopUpButton = {
			WizardsTables.Properties._Button__currentPage,
			WizardsTables.Properties._Component__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._PopUpButton__popUp
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ReturnButton = {
			WizardsTables.Properties._Button__currentPage,
			WizardsTables.Properties._Component__label,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._ReturnButton__srcPage
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TextField = {
			WizardsTables.Properties._TextField__input,
			WizardsTables.Properties._Component__label,
			WizardsTables.Properties._TextField__max_length,
			WizardsTables.Properties._TextField__min_length,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Wizard = {
			WizardsTables.Properties._Wizard__initial_page,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WizardsTables.Properties._Wizard__pages,
			WizardsTables.Properties._Wizard__title
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Button__Button.initProperties(_Button);
			Fragments._CheckBox__CheckBox.initProperties(_CheckBox);
			Fragments._CloseButton__CloseButton.initProperties(_CloseButton);
			Fragments._Component__Component.initProperties(_Component);
			Fragments._NavigatorButton__NavigatorButton.initProperties(_NavigatorButton);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._PopUpButton__PopUpButton.initProperties(_PopUpButton);
			Fragments._ReturnButton__ReturnButton.initProperties(_ReturnButton);
			Fragments._TextField__TextField.initProperties(_TextField);
			Fragments._Wizard__Wizard.initProperties(_Wizard);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WizardsTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new WizardsTables();
	}

	private WizardsTables() {
		super(WizardsPackage.eNS_URI);
	}
}
