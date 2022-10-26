/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /orders.ecore/model/orders.ecore
 * using:
 *   /orders.ecore/model/orders.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package orders;

// import orders.OrdersPackage;
// import orders.OrdersTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
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
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * OrdersTables provides the dispatch tables for the orders for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class OrdersTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(OrdersPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_orders = IdManager.getNsURIPackageId("orders", null, OrdersPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ecommerce = OrdersTables.PACKid_orders.getClassId("Ecommerce", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Item = OrdersTables.PACKid_orders.getClassId("Item", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OrderLine = OrdersTables.PACKid_orders.getClassId("OrderLine", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_PurchaseOrder = OrdersTables.PACKid_orders.getClassId("PurchaseOrder", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = OrdersTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = OrdersTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_OrderLine = TypeId.BAG.getSpecializedId(OrdersTables.CLSSid_OrderLine);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Item = TypeId.SET.getSpecializedId(OrdersTables.CLSSid_Item);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_OrderLine = TypeId.SET.getSpecializedId(OrdersTables.CLSSid_OrderLine);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_PurchaseOrder = TypeId.SET.getSpecializedId(OrdersTables.CLSSid_PurchaseOrder);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			OrdersTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Ecommerce = new EcoreExecutorType(OrdersPackage.Literals.ECOMMERCE, PACKAGE, 0);
		public static final EcoreExecutorType _Item = new EcoreExecutorType(OrdersPackage.Literals.ITEM, PACKAGE, 0);
		public static final EcoreExecutorType _OrderLine = new EcoreExecutorType(OrdersPackage.Literals.ORDER_LINE, PACKAGE, 0);
		public static final EcoreExecutorType _PurchaseOrder = new EcoreExecutorType(OrdersPackage.Literals.PURCHASE_ORDER, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Ecommerce,
			_Item,
			_OrderLine,
			_PurchaseOrder
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Ecommerce__Ecommerce = new ExecutorFragment(Types._Ecommerce, OrdersTables.Types._Ecommerce);
		private static final ExecutorFragment _Ecommerce__OclAny = new ExecutorFragment(Types._Ecommerce, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ecommerce__OclElement = new ExecutorFragment(Types._Ecommerce, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Item__Item = new ExecutorFragment(Types._Item, OrdersTables.Types._Item);
		private static final ExecutorFragment _Item__OclAny = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Item__OclElement = new ExecutorFragment(Types._Item, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _OrderLine__OclAny = new ExecutorFragment(Types._OrderLine, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OrderLine__OclElement = new ExecutorFragment(Types._OrderLine, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OrderLine__OrderLine = new ExecutorFragment(Types._OrderLine, OrdersTables.Types._OrderLine);

		private static final ExecutorFragment _PurchaseOrder__OclAny = new ExecutorFragment(Types._PurchaseOrder, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PurchaseOrder__OclElement = new ExecutorFragment(Types._PurchaseOrder, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PurchaseOrder__PurchaseOrder = new ExecutorFragment(Types._PurchaseOrder, OrdersTables.Types._PurchaseOrder);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::Fragments and all preceding sub-packages.
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


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Ecommerce__orders = new EcoreExecutorProperty(OrdersPackage.Literals.ECOMMERCE__ORDERS, Types._Ecommerce, 0);
		public static final ExecutorProperty _Ecommerce__stock = new EcoreExecutorProperty(OrdersPackage.Literals.ECOMMERCE__STOCK, Types._Ecommerce, 1);

		public static final ExecutorProperty _Item__name = new EcoreExecutorProperty(OrdersPackage.Literals.ITEM__NAME, Types._Item, 0);
		public static final ExecutorProperty _Item__price = new EcoreExecutorProperty(OrdersPackage.Literals.ITEM__PRICE, Types._Item, 1);
		public static final ExecutorProperty _Item__stock = new EcoreExecutorProperty(OrdersPackage.Literals.ITEM__STOCK, Types._Item, 2);
		public static final ExecutorProperty _Item__Ecommerce__stock = new ExecutorPropertyWithImplementation("Ecommerce", Types._Item, 3, new EcoreLibraryOppositeProperty(OrdersPackage.Literals.ECOMMERCE__STOCK));
		public static final ExecutorProperty _Item__OrderLine__item = new ExecutorPropertyWithImplementation("OrderLine", Types._Item, 4, new EcoreLibraryOppositeProperty(OrdersPackage.Literals.ORDER_LINE__ITEM));

		public static final ExecutorProperty _OrderLine__item = new EcoreExecutorProperty(OrdersPackage.Literals.ORDER_LINE__ITEM, Types._OrderLine, 0);
		public static final ExecutorProperty _OrderLine__quantity = new EcoreExecutorProperty(OrdersPackage.Literals.ORDER_LINE__QUANTITY, Types._OrderLine, 1);
		public static final ExecutorProperty _OrderLine__PurchaseOrder__lines = new ExecutorPropertyWithImplementation("PurchaseOrder", Types._OrderLine, 2, new EcoreLibraryOppositeProperty(OrdersPackage.Literals.PURCHASE_ORDER__LINES));

		public static final ExecutorProperty _PurchaseOrder__billTo = new EcoreExecutorProperty(OrdersPackage.Literals.PURCHASE_ORDER__BILL_TO, Types._PurchaseOrder, 0);
		public static final ExecutorProperty _PurchaseOrder__lines = new EcoreExecutorProperty(OrdersPackage.Literals.PURCHASE_ORDER__LINES, Types._PurchaseOrder, 1);
		public static final ExecutorProperty _PurchaseOrder__shipTo = new EcoreExecutorProperty(OrdersPackage.Literals.PURCHASE_ORDER__SHIP_TO, Types._PurchaseOrder, 2);
		public static final ExecutorProperty _PurchaseOrder__Ecommerce__orders = new ExecutorPropertyWithImplementation("Ecommerce", Types._PurchaseOrder, 3, new EcoreLibraryOppositeProperty(OrdersPackage.Literals.ECOMMERCE__ORDERS));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Ecommerce =
			{
				Fragments._Ecommerce__OclAny /* 0 */,
				Fragments._Ecommerce__OclElement /* 1 */,
				Fragments._Ecommerce__Ecommerce /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ecommerce = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Item =
			{
				Fragments._Item__OclAny /* 0 */,
				Fragments._Item__OclElement /* 1 */,
				Fragments._Item__Item /* 2 */
			};
		private static final int /*@NonNull*/ [] __Item = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OrderLine =
			{
				Fragments._OrderLine__OclAny /* 0 */,
				Fragments._OrderLine__OclElement /* 1 */,
				Fragments._OrderLine__OrderLine /* 2 */
			};
		private static final int /*@NonNull*/ [] __OrderLine = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PurchaseOrder =
			{
				Fragments._PurchaseOrder__OclAny /* 0 */,
				Fragments._PurchaseOrder__OclElement /* 1 */,
				Fragments._PurchaseOrder__PurchaseOrder /* 2 */
			};
		private static final int /*@NonNull*/ [] __PurchaseOrder = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Ecommerce.initFragments(_Ecommerce, __Ecommerce);
			Types._Item.initFragments(_Item, __Item);
			Types._OrderLine.initFragments(_OrderLine, __OrderLine);
			Types._PurchaseOrder.initFragments(_PurchaseOrder, __PurchaseOrder);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Ecommerce__Ecommerce = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ecommerce__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Ecommerce__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Item__Item = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Item__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _OrderLine__OrderLine = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OrderLine__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _OrderLine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PurchaseOrder__PurchaseOrder = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PurchaseOrder__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _PurchaseOrder__OclElement = {
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
			Fragments._Ecommerce__Ecommerce.initOperations(_Ecommerce__Ecommerce);
			Fragments._Ecommerce__OclAny.initOperations(_Ecommerce__OclAny);
			Fragments._Ecommerce__OclElement.initOperations(_Ecommerce__OclElement);

			Fragments._Item__Item.initOperations(_Item__Item);
			Fragments._Item__OclAny.initOperations(_Item__OclAny);
			Fragments._Item__OclElement.initOperations(_Item__OclElement);

			Fragments._OrderLine__OclAny.initOperations(_OrderLine__OclAny);
			Fragments._OrderLine__OclElement.initOperations(_OrderLine__OclElement);
			Fragments._OrderLine__OrderLine.initOperations(_OrderLine__OrderLine);

			Fragments._PurchaseOrder__OclAny.initOperations(_PurchaseOrder__OclAny);
			Fragments._PurchaseOrder__OclElement.initOperations(_PurchaseOrder__OclElement);
			Fragments._PurchaseOrder__PurchaseOrder.initOperations(_PurchaseOrder__PurchaseOrder);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Ecommerce = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			OrdersTables.Properties._Ecommerce__orders,
			OrdersTables.Properties._Ecommerce__stock
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Item = {
			OrdersTables.Properties._Item__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			OrdersTables.Properties._Item__price,
			OrdersTables.Properties._Item__stock
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OrderLine = {
			OrdersTables.Properties._OrderLine__item,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			OrdersTables.Properties._OrderLine__quantity
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PurchaseOrder = {
			OrdersTables.Properties._PurchaseOrder__billTo,
			OrdersTables.Properties._PurchaseOrder__lines,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			OrdersTables.Properties._PurchaseOrder__shipTo
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Ecommerce__Ecommerce.initProperties(_Ecommerce);
			Fragments._Item__Item.initProperties(_Item);
			Fragments._OrderLine__OrderLine.initProperties(_OrderLine);
			Fragments._PurchaseOrder__PurchaseOrder.initProperties(_PurchaseOrder);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of OrdersTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of OrdersTables::EnumerationLiterals and all preceding sub-packages.
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
		new OrdersTables();
	}

	private OrdersTables() {
		super(OrdersPackage.eNS_URI);
	}
}
