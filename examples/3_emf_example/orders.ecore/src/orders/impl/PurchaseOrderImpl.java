/**
 */
package orders.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import java.util.Map;
import orders.Item;
import orders.OrderLine;
import orders.OrdersPackage;
import orders.OrdersTables;
import orders.PurchaseOrder;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purchase Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link orders.impl.PurchaseOrderImpl#getLines <em>Lines</em>}</li>
 *   <li>{@link orders.impl.PurchaseOrderImpl#getShipTo <em>Ship To</em>}</li>
 *   <li>{@link orders.impl.PurchaseOrderImpl#getBillTo <em>Bill To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PurchaseOrderImpl extends MinimalEObjectImpl.Container implements PurchaseOrder {
	/**
	 * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderLine> lines;

	/**
	 * The default value of the '{@link #getShipTo() <em>Ship To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipTo()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIP_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShipTo() <em>Ship To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipTo()
	 * @generated
	 * @ordered
	 */
	protected String shipTo = SHIP_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getBillTo() <em>Bill To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillTo()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBillTo() <em>Bill To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillTo()
	 * @generated
	 * @ordered
	 */
	protected String billTo = BILL_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurchaseOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrdersPackage.Literals.PURCHASE_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderLine> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<OrderLine>(OrderLine.class, this, OrdersPackage.PURCHASE_ORDER__LINES);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShipTo() {
		return shipTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipTo(String newShipTo) {
		String oldShipTo = shipTo;
		shipTo = newShipTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrdersPackage.PURCHASE_ORDER__SHIP_TO, oldShipTo, shipTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillTo() {
		return billTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillTo(String newBillTo) {
		String oldBillTo = billTo;
		billTo = newBillTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrdersPackage.PURCHASE_ORDER__BILL_TO, oldBillTo, billTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonDuplicateItems(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PurchaseOrder::nonDuplicateItems";
		try {
			/**
			 *
			 * inv nonDuplicateItems:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = lines->forAll(line1, line2 | line1 <> line2 implies line1.item <> line2.item)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, OrdersPackage.Literals.PURCHASE_ORDER___NON_DUPLICATE_ITEMS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, OrdersTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<OrderLine> lines = this.getLines();
					final /*@NonInvalid*/ SetValue BOXED_lines = idResolver.createSetOfAll(OrdersTables.SET_CLSSid_OrderLine, lines);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_lines);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * line1 <> line2 implies line1.item <> line2.item
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue BOXED_lines = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object line1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object line2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ OrderLine local_0 = (OrderLine)line1;
								final /*@NonInvalid*/ OrderLine local_1 = (OrderLine)line2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'orders\'::OrderLine::item\'");
										}
										final /*@Thrown*/ Item item = local_0.getItem();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'orders\'::OrderLine::item\'");
										}
										final /*@Thrown*/ Item item_0 = local_1.getItem();
										final /*@Thrown*/ boolean ne_0 = !item.equals(item_0);
										CAUGHT_ne_0 = ne_0;
									}
									catch (Exception e) {
										CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_ne_0 == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									}
									else {
										if (CAUGHT_ne_0 instanceof InvalidValueException) {
											throw (InvalidValueException)CAUGHT_ne_0;
										}
										implies = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_implies = implies;
							}
							catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_lines, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, OrdersTables.INT_0).booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrdersPackage.PURCHASE_ORDER__LINES:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
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
			case OrdersPackage.PURCHASE_ORDER__LINES:
				return getLines();
			case OrdersPackage.PURCHASE_ORDER__SHIP_TO:
				return getShipTo();
			case OrdersPackage.PURCHASE_ORDER__BILL_TO:
				return getBillTo();
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
			case OrdersPackage.PURCHASE_ORDER__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends OrderLine>)newValue);
				return;
			case OrdersPackage.PURCHASE_ORDER__SHIP_TO:
				setShipTo((String)newValue);
				return;
			case OrdersPackage.PURCHASE_ORDER__BILL_TO:
				setBillTo((String)newValue);
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
			case OrdersPackage.PURCHASE_ORDER__LINES:
				getLines().clear();
				return;
			case OrdersPackage.PURCHASE_ORDER__SHIP_TO:
				setShipTo(SHIP_TO_EDEFAULT);
				return;
			case OrdersPackage.PURCHASE_ORDER__BILL_TO:
				setBillTo(BILL_TO_EDEFAULT);
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
			case OrdersPackage.PURCHASE_ORDER__LINES:
				return lines != null && !lines.isEmpty();
			case OrdersPackage.PURCHASE_ORDER__SHIP_TO:
				return SHIP_TO_EDEFAULT == null ? shipTo != null : !SHIP_TO_EDEFAULT.equals(shipTo);
			case OrdersPackage.PURCHASE_ORDER__BILL_TO:
				return BILL_TO_EDEFAULT == null ? billTo != null : !BILL_TO_EDEFAULT.equals(billTo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OrdersPackage.PURCHASE_ORDER___NON_DUPLICATE_ITEMS__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateItems((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (shipTo: ");
		result.append(shipTo);
		result.append(", billTo: ");
		result.append(billTo);
		result.append(')');
		return result.toString();
	}

} //PurchaseOrderImpl
