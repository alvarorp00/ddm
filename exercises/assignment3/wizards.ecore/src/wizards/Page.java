/**
 */
package wizards;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.Page#getName <em>Name</em>}</li>
 *   <li>{@link wizards.Page#getTextFields <em>Text Fields</em>}</li>
 *   <li>{@link wizards.Page#getCheckBox <em>Check Box</em>}</li>
 *   <li>{@link wizards.Page#getReturnButtons <em>Return Buttons</em>}</li>
 *   <li>{@link wizards.Page#getNavigatorButtons <em>Navigator Buttons</em>}</li>
 *   <li>{@link wizards.Page#getPopUpButtons <em>Pop Up Buttons</em>}</li>
 *   <li>{@link wizards.Page#getCloseButtons <em>Close Buttons</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getPage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredButtons'"
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wizards.WizardsPackage#getPage_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wizards.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text Fields</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.TextField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Fields</em>' containment reference list.
	 * @see wizards.WizardsPackage#getPage_TextFields()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<TextField> getTextFields();

	/**
	 * Returns the value of the '<em><b>Check Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Box</em>' containment reference.
	 * @see #setCheckBox(CheckBox)
	 * @see wizards.WizardsPackage#getPage_CheckBox()
	 * @model containment="true"
	 * @generated
	 */
	CheckBox getCheckBox();

	/**
	 * Sets the value of the '{@link wizards.Page#getCheckBox <em>Check Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Box</em>' containment reference.
	 * @see #getCheckBox()
	 * @generated
	 */
	void setCheckBox(CheckBox value);

	/**
	 * Returns the value of the '<em><b>Return Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.ReturnButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Buttons</em>' containment reference list.
	 * @see wizards.WizardsPackage#getPage_ReturnButtons()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<ReturnButton> getReturnButtons();

	/**
	 * Returns the value of the '<em><b>Navigator Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.NavigatorButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigator Buttons</em>' containment reference list.
	 * @see wizards.WizardsPackage#getPage_NavigatorButtons()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<NavigatorButton> getNavigatorButtons();

	/**
	 * Returns the value of the '<em><b>Pop Up Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.PopUpButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pop Up Buttons</em>' containment reference list.
	 * @see wizards.WizardsPackage#getPage_PopUpButtons()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<PopUpButton> getPopUpButtons();

	/**
	 * Returns the value of the '<em><b>Close Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.CloseButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Close Buttons</em>' containment reference list.
	 * @see wizards.WizardsPackage#getPage_CloseButtons()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<CloseButton> getCloseButtons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void action();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void show();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void close();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tself.returnButtons-&gt;collect(oclAsType(Button))-&gt;union(\n\t\t\t\t\tself.navigatorButtons-&gt;collect(oclAsType(Button))\n\t\t\t\t)-&gt;union(\n\t\t\t\t\tself.popUpButtons-&gt;collect(oclAsType(Button))\n\t\t\t\t)-&gt;union(\n\t\t\t\t\tself.closeButtons-&gt;collect(oclAsType(Button))\n\t\t\t\t)-&gt;asSet()'"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Button> buttons();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pageRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif self = page then\n\t\t\t\t\ttrue\n\t\t\t\telse\n\t\t\t\t\t\tif self.navigatorButtons-&gt;isEmpty() then\n\t\t\t\t\t\t\tfalse\n\t\t\t\t\t\telse\n\t\t\t\t\t\t\tself.navigatorButtons-&gt;exists(nb | nb.reachable(page))\n\t\t\t\t\t\tendif\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean reachable(Page page);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='-- max one return button per page\n\t\t\tself.returnButtons-&gt;size() &lt;= 1'"
	 * @generated
	 */
	boolean maxOneReturnButton(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.buttons()-&gt;forAll(b1, b2 |\n\t\t\t\tb1 &lt;&gt; b2 implies b1.label &lt;&gt; b2.label\n\t\t\t)'"
	 * @generated
	 */
	boolean nonDuplicateButtonsLabel(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body=' -- no page can contain only buttons that show messages\n\t\t\t(self.returnButtons-&gt;size() + self.navigatorButtons-&gt;size() + self.closeButtons-&gt;size()) &gt; 0'"
	 * @generated
	 */
	boolean notOnlyPopUpButtons(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body=' -- if no navigation buttons or return buttons then must contain at least one close button\n\t\t\t(self.navigatorButtons-&gt;size() = 0 or self.returnButtons-&gt;size() = 0) implies self.closeButtons-&gt;size() &gt; 0'"
	 * @generated
	 */
	boolean requiredButtons(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Page
