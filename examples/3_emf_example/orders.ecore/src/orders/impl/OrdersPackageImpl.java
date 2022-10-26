/**
 */
package orders.impl;

import orders.Ecommerce;
import orders.Item;
import orders.OrderLine;
import orders.OrdersFactory;
import orders.OrdersPackage;
import orders.PurchaseOrder;

import orders.util.OrdersValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrdersPackageImpl extends EPackageImpl implements OrdersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecommerceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaseOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderLineEClass = null;

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
	 * @see orders.OrdersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OrdersPackageImpl() {
		super(eNS_URI, OrdersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OrdersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OrdersPackage init() {
		if (isInited) return (OrdersPackage)EPackage.Registry.INSTANCE.getEPackage(OrdersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOrdersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OrdersPackageImpl theOrdersPackage = registeredOrdersPackage instanceof OrdersPackageImpl ? (OrdersPackageImpl)registeredOrdersPackage : new OrdersPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOrdersPackage.createPackageContents();

		// Initialize created meta-data
		theOrdersPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theOrdersPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return OrdersValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theOrdersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OrdersPackage.eNS_URI, theOrdersPackage);
		return theOrdersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEcommerce() {
		return ecommerceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcommerce_Orders() {
		return (EReference)ecommerceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEcommerce_Stock() {
		return (EReference)ecommerceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchaseOrder() {
		return purchaseOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPurchaseOrder_Lines() {
		return (EReference)purchaseOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchaseOrder_ShipTo() {
		return (EAttribute)purchaseOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchaseOrder_BillTo() {
		return (EAttribute)purchaseOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPurchaseOrder__NonDuplicateItems__DiagnosticChain_Map() {
		return purchaseOrderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Name() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Stock() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Price() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__PositivePrice__DiagnosticChain_Map() {
		return itemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderLine() {
		return orderLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderLine_Item() {
		return (EReference)orderLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderLine_Quantity() {
		return (EAttribute)orderLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdersFactory getOrdersFactory() {
		return (OrdersFactory)getEFactoryInstance();
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
		ecommerceEClass = createEClass(ECOMMERCE);
		createEReference(ecommerceEClass, ECOMMERCE__ORDERS);
		createEReference(ecommerceEClass, ECOMMERCE__STOCK);

		purchaseOrderEClass = createEClass(PURCHASE_ORDER);
		createEReference(purchaseOrderEClass, PURCHASE_ORDER__LINES);
		createEAttribute(purchaseOrderEClass, PURCHASE_ORDER__SHIP_TO);
		createEAttribute(purchaseOrderEClass, PURCHASE_ORDER__BILL_TO);
		createEOperation(purchaseOrderEClass, PURCHASE_ORDER___NON_DUPLICATE_ITEMS__DIAGNOSTICCHAIN_MAP);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__NAME);
		createEAttribute(itemEClass, ITEM__STOCK);
		createEAttribute(itemEClass, ITEM__PRICE);
		createEOperation(itemEClass, ITEM___POSITIVE_PRICE__DIAGNOSTICCHAIN_MAP);

		orderLineEClass = createEClass(ORDER_LINE);
		createEReference(orderLineEClass, ORDER_LINE__ITEM);
		createEAttribute(orderLineEClass, ORDER_LINE__QUANTITY);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(ecommerceEClass, Ecommerce.class, "Ecommerce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEcommerce_Orders(), this.getPurchaseOrder(), null, "orders", null, 0, -1, Ecommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEcommerce_Stock(), this.getItem(), null, "stock", null, 0, -1, Ecommerce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(purchaseOrderEClass, PurchaseOrder.class, "PurchaseOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPurchaseOrder_Lines(), this.getOrderLine(), null, "lines", null, 1, -1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPurchaseOrder_ShipTo(), ecorePackage.getEString(), "shipTo", null, 1, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurchaseOrder_BillTo(), ecorePackage.getEString(), "billTo", null, 1, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPurchaseOrder__NonDuplicateItems__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonDuplicateItems", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Stock(), ecorePackage.getEInt(), "stock", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Price(), ecorePackage.getEFloat(), "price", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getItem__PositivePrice__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "positivePrice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(orderLineEClass, OrderLine.class, "OrderLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderLine_Item(), this.getItem(), null, "item", null, 1, 1, OrderLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderLine_Quantity(), ecorePackage.getEInt(), "quantity", null, 1, 1, OrderLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Collection
		createCollectionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
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
		  (purchaseOrderEClass,
		   source,
		   new String[] {
			   "constraints", "nonDuplicateItems"
		   });
		addAnnotation
		  (itemEClass,
		   source,
		   new String[] {
			   "constraints", "positivePrice"
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
		  (getEcommerce_Orders(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getEcommerce_Stock(),
		   source,
		   new String[] {
			   "nullFree", "false"
		   });
		addAnnotation
		  (getPurchaseOrder_Lines(),
		   source,
		   new String[] {
			   "nullFree", "false"
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
		  (getPurchaseOrder__NonDuplicateItems__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "\n\t\t\tlines->forAll(line1, line2 | \n\t\t\t\tline1 <> line2 implies line1.item <> line2.item\n\t\t\t)"
		   });
		addAnnotation
		  (getItem__PositivePrice__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "price > 0"
		   });
	}

} //OrdersPackageImpl
