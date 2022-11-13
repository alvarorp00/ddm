/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizards.Button;
import wizards.PopUpButton;
import wizards.WizardsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pop Up Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.PopUpButtonImpl#getPopUp <em>Pop Up</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopUpButtonImpl extends ButtonImpl implements PopUpButton {
	/**
	 * The default value of the '{@link #getPopUp() <em>Pop Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopUp()
	 * @generated
	 * @ordered
	 */
	protected static final String POP_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPopUp() <em>Pop Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopUp()
	 * @generated
	 * @ordered
	 */
	protected String popUp = POP_UP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopUpButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.POP_UP_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPopUp() {
		return popUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopUp(String newPopUp) {
		String oldPopUp = popUp;
		popUp = newPopUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.POP_UP_BUTTON__POP_UP, oldPopUp, popUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void action() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented wizards!PopUpButton!action()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardsPackage.POP_UP_BUTTON__POP_UP:
				return getPopUp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WizardsPackage.POP_UP_BUTTON__POP_UP:
				setPopUp((String)newValue);
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
			case WizardsPackage.POP_UP_BUTTON__POP_UP:
				setPopUp(POP_UP_EDEFAULT);
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
			case WizardsPackage.POP_UP_BUTTON__POP_UP:
				return POP_UP_EDEFAULT == null ? popUp != null : !POP_UP_EDEFAULT.equals(popUp);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Button.class) {
			switch (baseOperationID) {
				case WizardsPackage.BUTTON___ACTION: return WizardsPackage.POP_UP_BUTTON___ACTION;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WizardsPackage.POP_UP_BUTTON___ACTION:
				action();
				return null;
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
		result.append(" (popUp: ");
		result.append(popUp);
		result.append(')');
		return result.toString();
	}

} //PopUpButtonImpl
