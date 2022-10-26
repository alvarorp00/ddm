/**
 */
package orders;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link orders.Item#getName <em>Name</em>}</li>
 *   <li>{@link orders.Item#getStock <em>Stock</em>}</li>
 *   <li>{@link orders.Item#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see orders.OrdersPackage#getItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positivePrice'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see orders.OrdersPackage#getItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link orders.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stock</em>' attribute.
	 * @see #setStock(int)
	 * @see orders.OrdersPackage#getItem_Stock()
	 * @model required="true"
	 * @generated
	 */
	int getStock();

	/**
	 * Sets the value of the '{@link orders.Item#getStock <em>Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stock</em>' attribute.
	 * @see #getStock()
	 * @generated
	 */
	void setStock(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see orders.OrdersPackage#getItem_Price()
	 * @model required="true"
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link orders.Item#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='price &gt; 0'"
	 * @generated
	 */
	boolean positivePrice(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Item
