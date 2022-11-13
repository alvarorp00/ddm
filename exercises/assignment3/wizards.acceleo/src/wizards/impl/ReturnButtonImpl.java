/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wizards.Button;
import wizards.Page;
import wizards.ReturnButton;
import wizards.WizardsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.ReturnButtonImpl#getSrcPage <em>Src Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnButtonImpl extends ButtonImpl implements ReturnButton {
	/**
	 * The cached value of the '{@link #getSrcPage() <em>Src Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcPage()
	 * @generated
	 * @ordered
	 */
	protected Page srcPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.RETURN_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSrcPage() {
		if (srcPage != null && srcPage.eIsProxy()) {
			InternalEObject oldSrcPage = (InternalEObject)srcPage;
			srcPage = (Page)eResolveProxy(oldSrcPage);
			if (srcPage != oldSrcPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardsPackage.RETURN_BUTTON__SRC_PAGE, oldSrcPage, srcPage));
			}
		}
		return srcPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetSrcPage() {
		return srcPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcPage(Page newSrcPage) {
		Page oldSrcPage = srcPage;
		srcPage = newSrcPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.RETURN_BUTTON__SRC_PAGE, oldSrcPage, srcPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void action() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented /ejemplo/metamodel/wizards.ecore!ReturnButton!action()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardsPackage.RETURN_BUTTON__SRC_PAGE:
				if (resolve) return getSrcPage();
				return basicGetSrcPage();
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
			case WizardsPackage.RETURN_BUTTON__SRC_PAGE:
				setSrcPage((Page)newValue);
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
			case WizardsPackage.RETURN_BUTTON__SRC_PAGE:
				setSrcPage((Page)null);
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
			case WizardsPackage.RETURN_BUTTON__SRC_PAGE:
				return srcPage != null;
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
				case WizardsPackage.BUTTON___ACTION: return WizardsPackage.RETURN_BUTTON___ACTION;
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
			case WizardsPackage.RETURN_BUTTON___ACTION:
				action();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReturnButtonImpl
