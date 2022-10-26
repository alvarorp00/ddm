/**
 */
package orders.util;

import java.util.Map;

import orders.*;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see orders.OrdersPackage
 * @generated
 */
public class OrdersValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OrdersValidator INSTANCE = new OrdersValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "orders";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Non Duplicate Items' of 'Purchase Order'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURCHASE_ORDER__NON_DUPLICATE_ITEMS = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Positive Price' of 'Item'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM__POSITIVE_PRICE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

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
	public OrdersValidator() {
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
	  return OrdersPackage.eINSTANCE;
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
			case OrdersPackage.ECOMMERCE:
				return validateEcommerce((Ecommerce)value, diagnostics, context);
			case OrdersPackage.PURCHASE_ORDER:
				return validatePurchaseOrder((PurchaseOrder)value, diagnostics, context);
			case OrdersPackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case OrdersPackage.ORDER_LINE:
				return validateOrderLine((OrderLine)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEcommerce(Ecommerce ecommerce, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ecommerce, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurchaseOrder(PurchaseOrder purchaseOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purchaseOrder, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(purchaseOrder, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurchaseOrder_nonDuplicateItems(purchaseOrder, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nonDuplicateItems constraint of '<em>Purchase Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurchaseOrder_nonDuplicateItems(PurchaseOrder purchaseOrder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purchaseOrder.nonDuplicateItems(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validateItem_positivePrice(item, diagnostics, context);
		return result;
	}

	/**
	 * Validates the positivePrice constraint of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem_positivePrice(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return item.positivePrice(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderLine(OrderLine orderLine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orderLine, diagnostics, context);
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

} //OrdersValidator
