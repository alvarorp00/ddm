/**
 */
package orders;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecommerce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link orders.Ecommerce#getOrders <em>Orders</em>}</li>
 *   <li>{@link orders.Ecommerce#getStock <em>Stock</em>}</li>
 * </ul>
 *
 * @see orders.OrdersPackage#getEcommerce()
 * @model
 * @generated
 */
public interface Ecommerce extends EObject {
	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link orders.PurchaseOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see orders.OrdersPackage#getEcommerce_Orders()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<PurchaseOrder> getOrders();

	/**
	 * Returns the value of the '<em><b>Stock</b></em>' containment reference list.
	 * The list contents are of type {@link orders.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock</em>' containment reference list.
	 * @see orders.OrdersPackage#getEcommerce_Stock()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Item> getStock();

} // Ecommerce
