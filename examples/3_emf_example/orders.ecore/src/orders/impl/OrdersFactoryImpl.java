/**
 */
package orders.impl;

import orders.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrdersFactoryImpl extends EFactoryImpl implements OrdersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrdersFactory init() {
		try {
			OrdersFactory theOrdersFactory = (OrdersFactory)EPackage.Registry.INSTANCE.getEFactory(OrdersPackage.eNS_URI);
			if (theOrdersFactory != null) {
				return theOrdersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OrdersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdersFactoryImpl() {
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
			case OrdersPackage.ECOMMERCE: return createEcommerce();
			case OrdersPackage.PURCHASE_ORDER: return createPurchaseOrder();
			case OrdersPackage.ITEM: return createItem();
			case OrdersPackage.ORDER_LINE: return createOrderLine();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecommerce createEcommerce() {
		EcommerceImpl ecommerce = new EcommerceImpl();
		return ecommerce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaseOrder createPurchaseOrder() {
		PurchaseOrderImpl purchaseOrder = new PurchaseOrderImpl();
		return purchaseOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderLine createOrderLine() {
		OrderLineImpl orderLine = new OrderLineImpl();
		return orderLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrdersPackage getOrdersPackage() {
		return (OrdersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OrdersPackage getPackage() {
		return OrdersPackage.eINSTANCE;
	}

} //OrdersFactoryImpl
