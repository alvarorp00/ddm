/**
 */
package orders;

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
 * @see orders.OrdersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface OrdersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orders";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "orders";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orders";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OrdersPackage eINSTANCE = orders.impl.OrdersPackageImpl.init();

	/**
	 * The meta object id for the '{@link orders.impl.EcommerceImpl <em>Ecommerce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see orders.impl.EcommerceImpl
	 * @see orders.impl.OrdersPackageImpl#getEcommerce()
	 * @generated
	 */
	int ECOMMERCE = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE__ORDERS = 0;

	/**
	 * The feature id for the '<em><b>Stock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE__STOCK = 1;

	/**
	 * The number of structural features of the '<em>Ecommerce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ecommerce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECOMMERCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link orders.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see orders.impl.PurchaseOrderImpl
	 * @see orders.impl.OrdersPackageImpl#getPurchaseOrder()
	 * @generated
	 */
	int PURCHASE_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__LINES = 0;

	/**
	 * The feature id for the '<em><b>Ship To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__SHIP_TO = 1;

	/**
	 * The feature id for the '<em><b>Bill To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER__BILL_TO = 2;

	/**
	 * The number of structural features of the '<em>Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Purchase Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASE_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link orders.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see orders.impl.ItemImpl
	 * @see orders.impl.OrdersPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STOCK = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRICE = 2;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link orders.impl.OrderLineImpl <em>Order Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see orders.impl.OrderLineImpl
	 * @see orders.impl.OrdersPackageImpl#getOrderLine()
	 * @generated
	 */
	int ORDER_LINE = 3;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Order Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LINE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link orders.Ecommerce <em>Ecommerce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ecommerce</em>'.
	 * @see orders.Ecommerce
	 * @generated
	 */
	EClass getEcommerce();

	/**
	 * Returns the meta object for the containment reference list '{@link orders.Ecommerce#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see orders.Ecommerce#getOrders()
	 * @see #getEcommerce()
	 * @generated
	 */
	EReference getEcommerce_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link orders.Ecommerce#getStock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stock</em>'.
	 * @see orders.Ecommerce#getStock()
	 * @see #getEcommerce()
	 * @generated
	 */
	EReference getEcommerce_Stock();

	/**
	 * Returns the meta object for class '{@link orders.PurchaseOrder <em>Purchase Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchase Order</em>'.
	 * @see orders.PurchaseOrder
	 * @generated
	 */
	EClass getPurchaseOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link orders.PurchaseOrder#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see orders.PurchaseOrder#getLines()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EReference getPurchaseOrder_Lines();

	/**
	 * Returns the meta object for the attribute '{@link orders.PurchaseOrder#getShipTo <em>Ship To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ship To</em>'.
	 * @see orders.PurchaseOrder#getShipTo()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_ShipTo();

	/**
	 * Returns the meta object for the attribute '{@link orders.PurchaseOrder#getBillTo <em>Bill To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill To</em>'.
	 * @see orders.PurchaseOrder#getBillTo()
	 * @see #getPurchaseOrder()
	 * @generated
	 */
	EAttribute getPurchaseOrder_BillTo();

	/**
	 * Returns the meta object for class '{@link orders.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see orders.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link orders.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see orders.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link orders.Item#getStock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock</em>'.
	 * @see orders.Item#getStock()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Stock();

	/**
	 * Returns the meta object for the attribute '{@link orders.Item#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see orders.Item#getPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Price();

	/**
	 * Returns the meta object for class '{@link orders.OrderLine <em>Order Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Line</em>'.
	 * @see orders.OrderLine
	 * @generated
	 */
	EClass getOrderLine();

	/**
	 * Returns the meta object for the reference '{@link orders.OrderLine#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see orders.OrderLine#getItem()
	 * @see #getOrderLine()
	 * @generated
	 */
	EReference getOrderLine_Item();

	/**
	 * Returns the meta object for the attribute '{@link orders.OrderLine#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see orders.OrderLine#getQuantity()
	 * @see #getOrderLine()
	 * @generated
	 */
	EAttribute getOrderLine_Quantity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OrdersFactory getOrdersFactory();

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
		 * The meta object literal for the '{@link orders.impl.EcommerceImpl <em>Ecommerce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see orders.impl.EcommerceImpl
		 * @see orders.impl.OrdersPackageImpl#getEcommerce()
		 * @generated
		 */
		EClass ECOMMERCE = eINSTANCE.getEcommerce();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE__ORDERS = eINSTANCE.getEcommerce_Orders();

		/**
		 * The meta object literal for the '<em><b>Stock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECOMMERCE__STOCK = eINSTANCE.getEcommerce_Stock();

		/**
		 * The meta object literal for the '{@link orders.impl.PurchaseOrderImpl <em>Purchase Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see orders.impl.PurchaseOrderImpl
		 * @see orders.impl.OrdersPackageImpl#getPurchaseOrder()
		 * @generated
		 */
		EClass PURCHASE_ORDER = eINSTANCE.getPurchaseOrder();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PURCHASE_ORDER__LINES = eINSTANCE.getPurchaseOrder_Lines();

		/**
		 * The meta object literal for the '<em><b>Ship To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ORDER__SHIP_TO = eINSTANCE.getPurchaseOrder_ShipTo();

		/**
		 * The meta object literal for the '<em><b>Bill To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASE_ORDER__BILL_TO = eINSTANCE.getPurchaseOrder_BillTo();

		/**
		 * The meta object literal for the '{@link orders.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see orders.impl.ItemImpl
		 * @see orders.impl.OrdersPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STOCK = eINSTANCE.getItem_Stock();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

		/**
		 * The meta object literal for the '{@link orders.impl.OrderLineImpl <em>Order Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see orders.impl.OrderLineImpl
		 * @see orders.impl.OrdersPackageImpl#getOrderLine()
		 * @generated
		 */
		EClass ORDER_LINE = eINSTANCE.getOrderLine();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_LINE__ITEM = eINSTANCE.getOrderLine_Item();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_LINE__QUANTITY = eINSTANCE.getOrderLine_Quantity();

	}

} //OrdersPackage
