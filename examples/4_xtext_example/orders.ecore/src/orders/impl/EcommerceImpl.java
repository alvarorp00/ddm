/**
 */
package orders.impl;

import java.util.Collection;

import orders.Ecommerce;
import orders.Item;
import orders.OrdersPackage;
import orders.PurchaseOrder;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecommerce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link orders.impl.EcommerceImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link orders.impl.EcommerceImpl#getStock <em>Stock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EcommerceImpl extends MinimalEObjectImpl.Container implements Ecommerce {
	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<PurchaseOrder> orders;

	/**
	 * The cached value of the '{@link #getStock() <em>Stock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStock()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> stock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcommerceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrdersPackage.Literals.ECOMMERCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PurchaseOrder> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<PurchaseOrder>(PurchaseOrder.class, this, OrdersPackage.ECOMMERCE__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getStock() {
		if (stock == null) {
			stock = new EObjectContainmentEList<Item>(Item.class, this, OrdersPackage.ECOMMERCE__STOCK);
		}
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrdersPackage.ECOMMERCE__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case OrdersPackage.ECOMMERCE__STOCK:
				return ((InternalEList<?>)getStock()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrdersPackage.ECOMMERCE__ORDERS:
				return getOrders();
			case OrdersPackage.ECOMMERCE__STOCK:
				return getStock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrdersPackage.ECOMMERCE__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends PurchaseOrder>)newValue);
				return;
			case OrdersPackage.ECOMMERCE__STOCK:
				getStock().clear();
				getStock().addAll((Collection<? extends Item>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OrdersPackage.ECOMMERCE__ORDERS:
				getOrders().clear();
				return;
			case OrdersPackage.ECOMMERCE__STOCK:
				getStock().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrdersPackage.ECOMMERCE__ORDERS:
				return orders != null && !orders.isEmpty();
			case OrdersPackage.ECOMMERCE__STOCK:
				return stock != null && !stock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EcommerceImpl
