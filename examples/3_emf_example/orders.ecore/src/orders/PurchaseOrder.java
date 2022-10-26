/**
 */
package orders;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link orders.PurchaseOrder#getLines <em>Lines</em>}</li>
 *   <li>{@link orders.PurchaseOrder#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link orders.PurchaseOrder#getBillTo <em>Bill To</em>}</li>
 * </ul>
 *
 * @see orders.OrdersPackage#getPurchaseOrder()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonDuplicateItems'"
 * @generated
 */
public interface PurchaseOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link orders.OrderLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see orders.OrdersPackage#getPurchaseOrder_Lines()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<OrderLine> getLines();

	/**
	 * Returns the value of the '<em><b>Ship To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ship To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ship To</em>' attribute.
	 * @see #setShipTo(String)
	 * @see orders.OrdersPackage#getPurchaseOrder_ShipTo()
	 * @model required="true"
	 * @generated
	 */
	String getShipTo();

	/**
	 * Sets the value of the '{@link orders.PurchaseOrder#getShipTo <em>Ship To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ship To</em>' attribute.
	 * @see #getShipTo()
	 * @generated
	 */
	void setShipTo(String value);

	/**
	 * Returns the value of the '<em><b>Bill To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill To</em>' attribute.
	 * @see #setBillTo(String)
	 * @see orders.OrdersPackage#getPurchaseOrder_BillTo()
	 * @model required="true"
	 * @generated
	 */
	String getBillTo();

	/**
	 * Sets the value of the '{@link orders.PurchaseOrder#getBillTo <em>Bill To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill To</em>' attribute.
	 * @see #getBillTo()
	 * @generated
	 */
	void setBillTo(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tlines-&gt;forAll(line1, line2 | \n\t\t\t\tline1 &lt;&gt; line2 implies line1.item &lt;&gt; line2.item\n\t\t\t)'"
	 * @generated
	 */
	boolean nonDuplicateItems(DiagnosticChain diagnostics, Map<Object, Object> context);

} // PurchaseOrder
