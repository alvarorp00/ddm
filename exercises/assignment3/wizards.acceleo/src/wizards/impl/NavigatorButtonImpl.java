/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;
import wizards.Button;
import wizards.CheckBox;
import wizards.NavigatorButton;
import wizards.Page;
import wizards.WizardsPackage;
import wizards.WizardsTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigator Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.NavigatorButtonImpl#getDstPage <em>Dst Page</em>}</li>
 *   <li>{@link wizards.impl.NavigatorButtonImpl#getAlterDstPage <em>Alter Dst Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigatorButtonImpl extends ButtonImpl implements NavigatorButton {
	/**
	 * The cached value of the '{@link #getDstPage() <em>Dst Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstPage()
	 * @generated
	 * @ordered
	 */
	protected Page dstPage;

	/**
	 * The cached value of the '{@link #getAlterDstPage() <em>Alter Dst Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlterDstPage()
	 * @generated
	 * @ordered
	 */
	protected Page alterDstPage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigatorButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.NAVIGATOR_BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getDstPage() {
		if (dstPage != null && dstPage.eIsProxy()) {
			InternalEObject oldDstPage = (InternalEObject)dstPage;
			dstPage = (Page)eResolveProxy(oldDstPage);
			if (dstPage != oldDstPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardsPackage.NAVIGATOR_BUTTON__DST_PAGE, oldDstPage, dstPage));
			}
		}
		return dstPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetDstPage() {
		return dstPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDstPage(Page newDstPage) {
		Page oldDstPage = dstPage;
		dstPage = newDstPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.NAVIGATOR_BUTTON__DST_PAGE, oldDstPage, dstPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getAlterDstPage() {
		if (alterDstPage != null && alterDstPage.eIsProxy()) {
			InternalEObject oldAlterDstPage = (InternalEObject)alterDstPage;
			alterDstPage = (Page)eResolveProxy(oldAlterDstPage);
			if (alterDstPage != oldAlterDstPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WizardsPackage.NAVIGATOR_BUTTON__ALTER_DST_PAGE, oldAlterDstPage, alterDstPage));
			}
		}
		return alterDstPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetAlterDstPage() {
		return alterDstPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlterDstPage(Page newAlterDstPage) {
		Page oldAlterDstPage = alterDstPage;
		alterDstPage = newAlterDstPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.NAVIGATOR_BUTTON__ALTER_DST_PAGE, oldAlterDstPage, alterDstPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page targetPage() {
		/**
		 *
		 * if
		 *   not self.currentPage.checkBox->oclIsUndefined() and self.currentPage.checkBox.selected
		 * then self.alterDstPage
		 * else self.dstPage
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		/*@Caught*/ Object CAUGHT_oclAsSet;
		try {
			final /*@NonInvalid*/ Page currentPage = this.getCurrentPage();
			final /*@NonInvalid*/ CheckBox checkBox = currentPage.getCheckBox();
			final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, WizardsTables.SET_CLSSid_CheckBox, checkBox);
			CAUGHT_oclAsSet = oclAsSet;
		}
		catch (Exception e) {
			CAUGHT_oclAsSet = ValueUtil.createInvalidValue(e);
		}
		final /*@NonInvalid*/ boolean oclIsUndefined = CAUGHT_oclAsSet instanceof InvalidValueException;
		final /*@NonInvalid*/ Boolean not;
		if (!oclIsUndefined) {
			not = ValueUtil.TRUE_VALUE;
		}
		else {
			if (oclIsUndefined) {
				not = ValueUtil.FALSE_VALUE;
			}
			else {
				not = null;
			}
		}
		final /*@Thrown*/ Boolean and;
		if (not == ValueUtil.FALSE_VALUE) {
			and = ValueUtil.FALSE_VALUE;
		}
		else {
			/*@Caught*/ Object CAUGHT_selected;
			try {
				final /*@NonInvalid*/ Page currentPage_0 = this.getCurrentPage();
				final /*@NonInvalid*/ CheckBox checkBox_0 = currentPage_0.getCheckBox();
				if (checkBox_0 == null) {
					throw new InvalidValueException("Null source for \'\'/ejemplo/metamodel/wizards.ecore\'::CheckBox::selected\'");
				}
				final /*@Thrown*/ boolean selected = checkBox_0.isSelected();
				CAUGHT_selected = selected;
			}
			catch (Exception e) {
				CAUGHT_selected = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_selected == ValueUtil.FALSE_VALUE) {
				and = ValueUtil.FALSE_VALUE;
			}
			else {
				if (CAUGHT_selected instanceof InvalidValueException) {
					throw (InvalidValueException)CAUGHT_selected;
				}
				if (not == null) {
					and = null;
				}
				else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (and == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@NonInvalid*/ Page local_0;
		if (and) {
			final /*@NonInvalid*/ Page alterDstPage = this.getAlterDstPage();
			local_0 = alterDstPage;
		}
		else {
			final /*@NonInvalid*/ Page dstPage = this.getDstPage();
			local_0 = dstPage;
		}
		if (local_0 == null) {
			throw new InvalidValueException("Null body for \'wizards::NavigatorButton::targetPage() : wizards::Page[1]\'");
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reachable(final Page page) {
		/**
		 *
		 * if
		 *   not self.alterDstPage->oclIsUndefined() and
		 *   not self.currentPage.checkBox->oclIsUndefined()
		 * then self.dstPage.reachable(page) or self.alterDstPage.reachable(page)
		 * else self.dstPage.reachable(page)
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ Page dstPage_0 = this.getDstPage();
		final /*@NonInvalid*/ boolean reachable_1 = dstPage_0.reachable(page);
		/*@Caught*/ Object CAUGHT_oclAsSet;
		try {
			final /*@NonInvalid*/ Page alterDstPage = this.getAlterDstPage();
			final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, WizardsTables.SET_CLSSid_Page, alterDstPage);
			CAUGHT_oclAsSet = oclAsSet;
		}
		catch (Exception e) {
			CAUGHT_oclAsSet = ValueUtil.createInvalidValue(e);
		}
		final /*@NonInvalid*/ boolean oclIsUndefined = CAUGHT_oclAsSet instanceof InvalidValueException;
		final /*@NonInvalid*/ Boolean not;
		if (!oclIsUndefined) {
			not = ValueUtil.TRUE_VALUE;
		}
		else {
			if (oclIsUndefined) {
				not = ValueUtil.FALSE_VALUE;
			}
			else {
				not = null;
			}
		}
		final /*@Thrown*/ Boolean and;
		if (not == ValueUtil.FALSE_VALUE) {
			and = ValueUtil.FALSE_VALUE;
		}
		else {
			/*@Caught*/ Object CAUGHT_oclAsSet_0;
			try {
				final /*@NonInvalid*/ Page currentPage = this.getCurrentPage();
				final /*@NonInvalid*/ CheckBox checkBox = currentPage.getCheckBox();
				final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, WizardsTables.SET_CLSSid_CheckBox, checkBox);
				CAUGHT_oclAsSet_0 = oclAsSet_0;
			}
			catch (Exception e) {
				CAUGHT_oclAsSet_0 = ValueUtil.createInvalidValue(e);
			}
			final /*@NonInvalid*/ boolean oclIsUndefined_0 = CAUGHT_oclAsSet_0 instanceof InvalidValueException;
			final /*@NonInvalid*/ Boolean not_0;
			if (!oclIsUndefined_0) {
				not_0 = ValueUtil.TRUE_VALUE;
			}
			else {
				if (oclIsUndefined_0) {
					not_0 = ValueUtil.FALSE_VALUE;
				}
				else {
					not_0 = null;
				}
			}
			if (not_0 == ValueUtil.FALSE_VALUE) {
				and = ValueUtil.FALSE_VALUE;
			}
			else {
				if ((not == null) || (not_0 == null)) {
					and = null;
				}
				else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (and == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@Thrown*/ Boolean local_0;
		if (and) {
			final /*@Thrown*/ Boolean or;
			if (reachable_1) {
				or = ValueUtil.TRUE_VALUE;
			}
			else {
				/*@Caught*/ Object CAUGHT_reachable_0;
				try {
					final /*@NonInvalid*/ Page alterDstPage_0 = this.getAlterDstPage();
					if (alterDstPage_0 == null) {
						throw new InvalidValueException("Null source for \'wizards::Page::reachable(wizards::Page[1]) : Boolean[1]\'");
					}
					final /*@Thrown*/ boolean reachable_0 = alterDstPage_0.reachable(page);
					CAUGHT_reachable_0 = reachable_0;
				}
				catch (Exception e) {
					CAUGHT_reachable_0 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_reachable_0 == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				}
				else {
					if (CAUGHT_reachable_0 instanceof InvalidValueException) {
						throw (InvalidValueException)CAUGHT_reachable_0;
					}
					or = ValueUtil.FALSE_VALUE;
				}
			}
			local_0 = or;
		}
		else {
			local_0 = reachable_1;
		}
		if (local_0 == null) {
			throw new InvalidValueException("Null body for \'wizards::NavigatorButton::reachable(wizards::Page[1]) : Boolean[1]\'");
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void action() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented /ejemplo/metamodel/wizards.ecore!NavigatorButton!action()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noSelfLoop(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "NavigatorButton::noSelfLoop";
		try {
			/**
			 *
			 * inv noSelfLoop:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.dstPage <> self.currentPage and
			 *         (
			 *           not self.alterDstPage->oclIsUndefined() implies self.alterDstPage <> self.currentPage
			 *         )
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.NAVIGATOR_BUTTON___NO_SELF_LOOP__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Page currentPage = this.getCurrentPage();
					final /*@NonInvalid*/ Page dstPage = this.getDstPage();
					final /*@NonInvalid*/ boolean ne = !dstPage.equals(currentPage);
					final /*@Thrown*/ Boolean result;
					if (!ne) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_implies;
						try {
							final /*@NonInvalid*/ Page alterDstPage_0 = this.getAlterDstPage();
							/*@Caught*/ Object CAUGHT_oclAsSet;
							try {
								final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, WizardsTables.SET_CLSSid_Page, alterDstPage_0);
								CAUGHT_oclAsSet = oclAsSet;
							}
							catch (Exception e) {
								CAUGHT_oclAsSet = ValueUtil.createInvalidValue(e);
							}
							final /*@NonInvalid*/ boolean oclIsUndefined = CAUGHT_oclAsSet instanceof InvalidValueException;
							final /*@NonInvalid*/ Boolean not;
							if (!oclIsUndefined) {
								not = ValueUtil.TRUE_VALUE;
							}
							else {
								if (oclIsUndefined) {
									not = ValueUtil.FALSE_VALUE;
								}
								else {
									not = null;
								}
							}
							final /*@Thrown*/ Boolean implies;
							if (not == ValueUtil.FALSE_VALUE) {
								implies = ValueUtil.TRUE_VALUE;
							}
							else {
								final /*@NonInvalid*/ boolean ne_0 = !currentPage.equals(alterDstPage_0);
								if (ne_0) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									if (not == null) {
										implies = null;
									}
									else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies = implies;
						}
						catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_implies instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_implies;
							}
							if (CAUGHT_implies == null) {
								result = null;
							}
							else {
								result = ValueUtil.TRUE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WizardsTables.INT_0).booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WizardsPackage.NAVIGATOR_BUTTON__DST_PAGE:
				if (resolve) return getDstPage();
				return basicGetDstPage();
			case WizardsPackage.NAVIGATOR_BUTTON__ALTER_DST_PAGE:
				if (resolve) return getAlterDstPage();
				return basicGetAlterDstPage();
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
			case WizardsPackage.NAVIGATOR_BUTTON__DST_PAGE:
				setDstPage((Page)newValue);
				return;
			case WizardsPackage.NAVIGATOR_BUTTON__ALTER_DST_PAGE:
				setAlterDstPage((Page)newValue);
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
			case WizardsPackage.NAVIGATOR_BUTTON__DST_PAGE:
				setDstPage((Page)null);
				return;
			case WizardsPackage.NAVIGATOR_BUTTON__ALTER_DST_PAGE:
				setAlterDstPage((Page)null);
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
			case WizardsPackage.NAVIGATOR_BUTTON__DST_PAGE:
				return dstPage != null;
			case WizardsPackage.NAVIGATOR_BUTTON__ALTER_DST_PAGE:
				return alterDstPage != null;
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
				case WizardsPackage.BUTTON___ACTION: return WizardsPackage.NAVIGATOR_BUTTON___ACTION;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WizardsPackage.NAVIGATOR_BUTTON___TARGET_PAGE:
				return targetPage();
			case WizardsPackage.NAVIGATOR_BUTTON___REACHABLE__PAGE:
				return reachable((Page)arguments.get(0));
			case WizardsPackage.NAVIGATOR_BUTTON___ACTION:
				action();
				return null;
			case WizardsPackage.NAVIGATOR_BUTTON___NO_SELF_LOOP__DIAGNOSTICCHAIN_MAP:
				return noSelfLoop((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NavigatorButtonImpl
