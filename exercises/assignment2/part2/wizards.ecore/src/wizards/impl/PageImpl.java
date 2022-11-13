/**
 */
package wizards.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionUnionOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.BagValue.Accumulator;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import wizards.Button;
import wizards.CheckBox;
import wizards.CloseButton;
import wizards.NavigatorButton;
import wizards.Page;
import wizards.PopUpButton;
import wizards.ReturnButton;
import wizards.TextField;
import wizards.WizardsPackage;
import wizards.WizardsTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wizards.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getTextFields <em>Text Fields</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getCheckBox <em>Check Box</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getReturnButtons <em>Return Buttons</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getNavigatorButtons <em>Navigator Buttons</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getPopUpButtons <em>Pop Up Buttons</em>}</li>
 *   <li>{@link wizards.impl.PageImpl#getCloseButtons <em>Close Buttons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends MinimalEObjectImpl.Container implements Page {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTextFields() <em>Text Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFields()
	 * @generated
	 * @ordered
	 */
	protected EList<TextField> textFields;

	/**
	 * The cached value of the '{@link #getCheckBox() <em>Check Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckBox()
	 * @generated
	 * @ordered
	 */
	protected CheckBox checkBox;

	/**
	 * The cached value of the '{@link #getReturnButtons() <em>Return Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<ReturnButton> returnButtons;

	/**
	 * The cached value of the '{@link #getNavigatorButtons() <em>Navigator Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigatorButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigatorButton> navigatorButtons;

	/**
	 * The cached value of the '{@link #getPopUpButtons() <em>Pop Up Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopUpButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<PopUpButton> popUpButtons;

	/**
	 * The cached value of the '{@link #getCloseButtons() <em>Close Buttons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseButtons()
	 * @generated
	 * @ordered
	 */
	protected EList<CloseButton> closeButtons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WizardsPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextField> getTextFields() {
		if (textFields == null) {
			textFields = new EObjectContainmentEList<TextField>(TextField.class, this, WizardsPackage.PAGE__TEXT_FIELDS);
		}
		return textFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox getCheckBox() {
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCheckBox(CheckBox newCheckBox, NotificationChain msgs) {
		CheckBox oldCheckBox = checkBox;
		checkBox = newCheckBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WizardsPackage.PAGE__CHECK_BOX, oldCheckBox, newCheckBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckBox(CheckBox newCheckBox) {
		if (newCheckBox != checkBox) {
			NotificationChain msgs = null;
			if (checkBox != null)
				msgs = ((InternalEObject)checkBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WizardsPackage.PAGE__CHECK_BOX, null, msgs);
			if (newCheckBox != null)
				msgs = ((InternalEObject)newCheckBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WizardsPackage.PAGE__CHECK_BOX, null, msgs);
			msgs = basicSetCheckBox(newCheckBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WizardsPackage.PAGE__CHECK_BOX, newCheckBox, newCheckBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReturnButton> getReturnButtons() {
		if (returnButtons == null) {
			returnButtons = new EObjectContainmentEList<ReturnButton>(ReturnButton.class, this, WizardsPackage.PAGE__RETURN_BUTTONS);
		}
		return returnButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigatorButton> getNavigatorButtons() {
		if (navigatorButtons == null) {
			navigatorButtons = new EObjectContainmentEList<NavigatorButton>(NavigatorButton.class, this, WizardsPackage.PAGE__NAVIGATOR_BUTTONS);
		}
		return navigatorButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PopUpButton> getPopUpButtons() {
		if (popUpButtons == null) {
			popUpButtons = new EObjectContainmentEList<PopUpButton>(PopUpButton.class, this, WizardsPackage.PAGE__POP_UP_BUTTONS);
		}
		return popUpButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloseButton> getCloseButtons() {
		if (closeButtons == null) {
			closeButtons = new EObjectContainmentEList<CloseButton>(CloseButton.class, this, WizardsPackage.PAGE__CLOSE_BUTTONS);
		}
		return closeButtons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void action() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented wizards!Page!action()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void show() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented wizards!Page!show()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void close() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented wizards!Page!close()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> buttons() {
		/**
		 *
		 * self.returnButtons->collect(oclAsType(Button))
		 * ->union(
		 *   self.navigatorButtons->collect(oclAsType(Button)))
		 * ->union(
		 *   self.popUpButtons->collect(oclAsType(Button)))
		 * ->union(
		 *   self.closeButtons->collect(oclAsType(Button)))
		 * ->asSet()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<ReturnButton> returnButtons = this.getReturnButtons();
		final /*@NonInvalid*/ SetValue BOXED_returnButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_ReturnButton, returnButtons);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createBagAccumulatorValue(WizardsTables.BAG_CLSSid_Button);
		Iterator<Object> ITERATOR__1 = BOXED_returnButtons.iterator();
		/*@Thrown*/ BagValue collect;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				collect = accumulator;
				break;
			}
			/*@NonInvalid*/ ReturnButton _1 = (ReturnButton)ITERATOR__1.next();
			/**
			 * oclAsType(Button)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_Button_0 = idResolver.getClass(WizardsTables.CLSSid_Button, null);
			final /*@Thrown*/ Button oclAsType = (Button)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1, TYP_wizards_c_c_Button_0);
			//
			accumulator.add(oclAsType);
		}
		final /*@NonInvalid*/ List<NavigatorButton> navigatorButtons = this.getNavigatorButtons();
		final /*@NonInvalid*/ SetValue BOXED_navigatorButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_NavigatorButton, navigatorButtons);
		/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createBagAccumulatorValue(WizardsTables.BAG_CLSSid_Button);
		Iterator<Object> ITERATOR__1_0 = BOXED_navigatorButtons.iterator();
		/*@Thrown*/ BagValue collect_0;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				collect_0 = accumulator_0;
				break;
			}
			/*@NonInvalid*/ NavigatorButton _1_0 = (NavigatorButton)ITERATOR__1_0.next();
			/**
			 * oclAsType(Button)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_Button_1 = idResolver.getClass(WizardsTables.CLSSid_Button, null);
			final /*@Thrown*/ Button oclAsType_0 = (Button)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_0, TYP_wizards_c_c_Button_1);
			//
			accumulator_0.add(oclAsType_0);
		}
		if (collect_0 instanceof InvalidValueException) {
			throw (InvalidValueException)collect_0;
		}
		final /*@Thrown*/ BagValue union = (BagValue)CollectionUnionOperation.INSTANCE.evaluate(collect, collect_0);
		final /*@NonInvalid*/ List<PopUpButton> popUpButtons = this.getPopUpButtons();
		final /*@NonInvalid*/ SetValue BOXED_popUpButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_PopUpButton, popUpButtons);
		/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createBagAccumulatorValue(WizardsTables.BAG_CLSSid_Button);
		Iterator<Object> ITERATOR__1_1 = BOXED_popUpButtons.iterator();
		/*@Thrown*/ BagValue collect_1;
		while (true) {
			if (!ITERATOR__1_1.hasNext()) {
				collect_1 = accumulator_1;
				break;
			}
			/*@NonInvalid*/ PopUpButton _1_1 = (PopUpButton)ITERATOR__1_1.next();
			/**
			 * oclAsType(Button)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_Button_2 = idResolver.getClass(WizardsTables.CLSSid_Button, null);
			final /*@Thrown*/ Button oclAsType_1 = (Button)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_1, TYP_wizards_c_c_Button_2);
			//
			accumulator_1.add(oclAsType_1);
		}
		if (collect_1 instanceof InvalidValueException) {
			throw (InvalidValueException)collect_1;
		}
		final /*@Thrown*/ BagValue union_0 = (BagValue)CollectionUnionOperation.INSTANCE.evaluate(union, collect_1);
		final /*@NonInvalid*/ List<CloseButton> closeButtons = this.getCloseButtons();
		final /*@NonInvalid*/ SetValue BOXED_closeButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_CloseButton, closeButtons);
		/*@Thrown*/ Accumulator accumulator_2 = ValueUtil.createBagAccumulatorValue(WizardsTables.BAG_CLSSid_Button);
		Iterator<Object> ITERATOR__1_2 = BOXED_closeButtons.iterator();
		/*@Thrown*/ BagValue collect_2;
		while (true) {
			if (!ITERATOR__1_2.hasNext()) {
				collect_2 = accumulator_2;
				break;
			}
			/*@NonInvalid*/ CloseButton _1_2 = (CloseButton)ITERATOR__1_2.next();
			/**
			 * oclAsType(Button)
			 */
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_wizards_c_c_Button_3 = idResolver.getClass(WizardsTables.CLSSid_Button, null);
			final /*@Thrown*/ Button oclAsType_2 = (Button)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, _1_2, TYP_wizards_c_c_Button_3);
			//
			accumulator_2.add(oclAsType_2);
		}
		if (collect_2 instanceof InvalidValueException) {
			throw (InvalidValueException)collect_2;
		}
		final /*@Thrown*/ BagValue union_1 = (BagValue)CollectionUnionOperation.INSTANCE.evaluate(union_0, collect_2);
		final /*@Thrown*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(union_1);
		final /*@Thrown*/ List<Button> ECORE_asSet = ((IdResolverExtension)idResolver).ecoreValueOfAll(Button.class, asSet);
		return (EList<Button>)ECORE_asSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reachable(final Page page) {
		/**
		 *
		 * if self = page
		 * then true
		 * else
		 *   if self.navigatorButtons->isEmpty()
		 *   then false
		 *   else
		 *     self.navigatorButtons->exists(nb | nb.reachable(page))
		 *   endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ boolean eq = this.equals(page);
		/*@Thrown*/ Boolean local_1;
		if (eq) {
			local_1 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ List<NavigatorButton> navigatorButtons_0 = this.getNavigatorButtons();
			final /*@NonInvalid*/ SetValue BOXED_navigatorButtons_0 = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_NavigatorButton, navigatorButtons_0);
			final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(BOXED_navigatorButtons_0).booleanValue();
			/*@Thrown*/ Boolean local_0;
			if (isEmpty) {
				local_0 = ValueUtil.FALSE_VALUE;
			}
			else {
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_nb = BOXED_navigatorButtons_0.iterator();
				/*@Thrown*/ Boolean exists;
				while (true) {
					if (!ITERATOR_nb.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							exists = ValueUtil.FALSE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ NavigatorButton nb = (NavigatorButton)ITERATOR_nb.next();
					/**
					 * nb.reachable(page)
					 */
					/*@Caught*/ Object CAUGHT_reachable;
					try {
						if (nb == null) {
							throw new InvalidValueException("Null source for \'wizards::NavigatorButton::reachable(wizards::Page[1]) : Boolean[1]\'");
						}
						final /*@Thrown*/ boolean reachable = nb.reachable(page);
						CAUGHT_reachable = reachable;
					}
					catch (Exception e) {
						CAUGHT_reachable = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_reachable == ValueUtil.TRUE_VALUE) {					// Normal successful body evaluation result
						exists = ValueUtil.TRUE_VALUE;
						break;														// Stop immediately
					}
					else if (CAUGHT_reachable == ValueUtil.FALSE_VALUE) {				// Normal unsuccessful body evaluation result
						;															// Carry on
					}
					else if (CAUGHT_reachable instanceof InvalidValueException) {		// Abnormal exception evaluation result
						accumulator = CAUGHT_reachable;									// Cache an exception failure
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				local_0 = exists;
			}
			local_1 = local_0;
		}
		if (local_1 == null) {
			throw new InvalidValueException("Null body for \'wizards::Page::reachable(wizards::Page[1]) : Boolean[1]\'");
		}
		return local_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maxOneReturnButton(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::maxOneReturnButton";
		try {
			/**
			 *
			 * inv maxOneReturnButton:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.returnButtons->size() <= 1
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.PAGE___MAX_ONE_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<ReturnButton> returnButtons = this.getReturnButtons();
				final /*@NonInvalid*/ SetValue BOXED_returnButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_ReturnButton, returnButtons);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_returnButtons);
				final /*@NonInvalid*/ boolean result = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, WizardsTables.INT_1).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WizardsTables.INT_0).booleanValue();
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
	public boolean nonDuplicateButtonsLabel(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::nonDuplicateButtonsLabel";
		try {
			/**
			 *
			 * inv nonDuplicateButtonsLabel:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.buttons()
			 *         ->forAll(b1, b2 | b1 <> b2 implies b1.label <> b2.label)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.PAGE___NON_DUPLICATE_BUTTONS_LABEL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Button> buttons = this.buttons();
					final /*@NonInvalid*/ SetValue BOXED_buttons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_Button, buttons);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null, BOXED_buttons);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension)TYPE_result_0.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor, TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * b1 <> b2 implies b1.label <> b2.label
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId, final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ SetValue BOXED_buttons = (SetValue)sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object b1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object b2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Button local_0 = (Button)b1;
								final /*@NonInvalid*/ Button local_1 = (Button)b2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1) : (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								}
								else {
									/*@Caught*/ Object CAUGHT_ne_0;
									try {
										if (local_0 == null) {
											throw new InvalidValueException("Null source for \'\'wizards\'::Component::label\'");
										}
										final /*@Thrown*/ String label = local_0.getLabel();
										if (local_1 == null) {
											throw new InvalidValueException("Null source for \'\'wizards\'::Component::label\'");
										}
										final /*@Thrown*/ String label_0 = local_1.getLabel();
										final /*@Thrown*/ boolean ne_0 = !label.equals(label_0);
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
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor, 2, TypeId.BOOLEAN, BODY_result_0, BOXED_buttons, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean)IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, WizardsTables.INT_0).booleanValue();
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
	public boolean notOnlyPopUpButtons(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::notOnlyPopUpButtons";
		try {
			/**
			 *
			 * inv notOnlyPopUpButtons:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self.returnButtons->size() +
			 *         self.navigatorButtons->size() +
			 *         self.closeButtons->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.PAGE___NOT_ONLY_POP_UP_BUTTONS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				final /*@NonInvalid*/ List<ReturnButton> returnButtons = this.getReturnButtons();
				final /*@NonInvalid*/ SetValue BOXED_returnButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_ReturnButton, returnButtons);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_returnButtons);
				final /*@NonInvalid*/ List<NavigatorButton> navigatorButtons = this.getNavigatorButtons();
				final /*@NonInvalid*/ SetValue BOXED_navigatorButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_NavigatorButton, navigatorButtons);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_navigatorButtons);
				final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(size, size_0);
				final /*@NonInvalid*/ List<CloseButton> closeButtons = this.getCloseButtons();
				final /*@NonInvalid*/ SetValue BOXED_closeButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_CloseButton, closeButtons);
				final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_closeButtons);
				final /*@NonInvalid*/ IntegerValue sum_0 = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(sum, size_1);
				final /*@NonInvalid*/ boolean result = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, sum_0, WizardsTables.INT_0).booleanValue();
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, WizardsTables.INT_0).booleanValue();
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
	public boolean requiredButtons(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Page::requiredButtons";
		try {
			/**
			 *
			 * inv requiredButtons:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.navigatorButtons->size() = 0 or
			 *         self.returnButtons->size() = 0 implies
			 *         self.closeButtons->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, WizardsPackage.Literals.PAGE___REQUIRED_BUTTONS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, WizardsTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<NavigatorButton> navigatorButtons = this.getNavigatorButtons();
					final /*@NonInvalid*/ SetValue BOXED_navigatorButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_NavigatorButton, navigatorButtons);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_navigatorButtons);
					final /*@NonInvalid*/ boolean eq = size.equals(WizardsTables.INT_0);
					final /*@NonInvalid*/ Boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<ReturnButton> returnButtons = this.getReturnButtons();
						final /*@NonInvalid*/ SetValue BOXED_returnButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_ReturnButton, returnButtons);
						final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_returnButtons);
						final /*@NonInvalid*/ boolean eq_0 = size_0.equals(WizardsTables.INT_0);
						if (eq_0) {
							or = ValueUtil.TRUE_VALUE;
						}
						else {
							or = ValueUtil.FALSE_VALUE;
						}
					}
					final /*@Thrown*/ Boolean result;
					if (or == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						final /*@NonInvalid*/ List<CloseButton> closeButtons = this.getCloseButtons();
						final /*@NonInvalid*/ SetValue BOXED_closeButtons = idResolver.createSetOfAll(WizardsTables.SET_CLSSid_CloseButton, closeButtons);
						final /*@NonInvalid*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_closeButtons);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size_1, WizardsTables.INT_0).booleanValue();
						if (gt) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (or == null) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WizardsPackage.PAGE__TEXT_FIELDS:
				return ((InternalEList<?>)getTextFields()).basicRemove(otherEnd, msgs);
			case WizardsPackage.PAGE__CHECK_BOX:
				return basicSetCheckBox(null, msgs);
			case WizardsPackage.PAGE__RETURN_BUTTONS:
				return ((InternalEList<?>)getReturnButtons()).basicRemove(otherEnd, msgs);
			case WizardsPackage.PAGE__NAVIGATOR_BUTTONS:
				return ((InternalEList<?>)getNavigatorButtons()).basicRemove(otherEnd, msgs);
			case WizardsPackage.PAGE__POP_UP_BUTTONS:
				return ((InternalEList<?>)getPopUpButtons()).basicRemove(otherEnd, msgs);
			case WizardsPackage.PAGE__CLOSE_BUTTONS:
				return ((InternalEList<?>)getCloseButtons()).basicRemove(otherEnd, msgs);
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
			case WizardsPackage.PAGE__NAME:
				return getName();
			case WizardsPackage.PAGE__TEXT_FIELDS:
				return getTextFields();
			case WizardsPackage.PAGE__CHECK_BOX:
				return getCheckBox();
			case WizardsPackage.PAGE__RETURN_BUTTONS:
				return getReturnButtons();
			case WizardsPackage.PAGE__NAVIGATOR_BUTTONS:
				return getNavigatorButtons();
			case WizardsPackage.PAGE__POP_UP_BUTTONS:
				return getPopUpButtons();
			case WizardsPackage.PAGE__CLOSE_BUTTONS:
				return getCloseButtons();
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
			case WizardsPackage.PAGE__NAME:
				setName((String)newValue);
				return;
			case WizardsPackage.PAGE__TEXT_FIELDS:
				getTextFields().clear();
				getTextFields().addAll((Collection<? extends TextField>)newValue);
				return;
			case WizardsPackage.PAGE__CHECK_BOX:
				setCheckBox((CheckBox)newValue);
				return;
			case WizardsPackage.PAGE__RETURN_BUTTONS:
				getReturnButtons().clear();
				getReturnButtons().addAll((Collection<? extends ReturnButton>)newValue);
				return;
			case WizardsPackage.PAGE__NAVIGATOR_BUTTONS:
				getNavigatorButtons().clear();
				getNavigatorButtons().addAll((Collection<? extends NavigatorButton>)newValue);
				return;
			case WizardsPackage.PAGE__POP_UP_BUTTONS:
				getPopUpButtons().clear();
				getPopUpButtons().addAll((Collection<? extends PopUpButton>)newValue);
				return;
			case WizardsPackage.PAGE__CLOSE_BUTTONS:
				getCloseButtons().clear();
				getCloseButtons().addAll((Collection<? extends CloseButton>)newValue);
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
			case WizardsPackage.PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WizardsPackage.PAGE__TEXT_FIELDS:
				getTextFields().clear();
				return;
			case WizardsPackage.PAGE__CHECK_BOX:
				setCheckBox((CheckBox)null);
				return;
			case WizardsPackage.PAGE__RETURN_BUTTONS:
				getReturnButtons().clear();
				return;
			case WizardsPackage.PAGE__NAVIGATOR_BUTTONS:
				getNavigatorButtons().clear();
				return;
			case WizardsPackage.PAGE__POP_UP_BUTTONS:
				getPopUpButtons().clear();
				return;
			case WizardsPackage.PAGE__CLOSE_BUTTONS:
				getCloseButtons().clear();
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
			case WizardsPackage.PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WizardsPackage.PAGE__TEXT_FIELDS:
				return textFields != null && !textFields.isEmpty();
			case WizardsPackage.PAGE__CHECK_BOX:
				return checkBox != null;
			case WizardsPackage.PAGE__RETURN_BUTTONS:
				return returnButtons != null && !returnButtons.isEmpty();
			case WizardsPackage.PAGE__NAVIGATOR_BUTTONS:
				return navigatorButtons != null && !navigatorButtons.isEmpty();
			case WizardsPackage.PAGE__POP_UP_BUTTONS:
				return popUpButtons != null && !popUpButtons.isEmpty();
			case WizardsPackage.PAGE__CLOSE_BUTTONS:
				return closeButtons != null && !closeButtons.isEmpty();
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
			case WizardsPackage.PAGE___BUTTONS:
				return buttons();
			case WizardsPackage.PAGE___REACHABLE__PAGE:
				return reachable((Page)arguments.get(0));
			case WizardsPackage.PAGE___ACTION:
				action();
				return null;
			case WizardsPackage.PAGE___SHOW:
				show();
				return null;
			case WizardsPackage.PAGE___CLOSE:
				close();
				return null;
			case WizardsPackage.PAGE___MAX_ONE_RETURN_BUTTON__DIAGNOSTICCHAIN_MAP:
				return maxOneReturnButton((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardsPackage.PAGE___NON_DUPLICATE_BUTTONS_LABEL__DIAGNOSTICCHAIN_MAP:
				return nonDuplicateButtonsLabel((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardsPackage.PAGE___NOT_ONLY_POP_UP_BUTTONS__DIAGNOSTICCHAIN_MAP:
				return notOnlyPopUpButtons((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case WizardsPackage.PAGE___REQUIRED_BUTTONS__DIAGNOSTICCHAIN_MAP:
				return requiredButtons((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PageImpl
