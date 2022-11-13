/**
 */
package wizards;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.Button#getCurrentPage <em>Current Page</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getButton()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxLabelLength'"
 * @generated
 */
public interface Button extends Component {
	/**
	 * Returns the value of the '<em><b>Current Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Page</em>' reference.
	 * @see #setCurrentPage(Page)
	 * @see wizards.WizardsPackage#getButton_CurrentPage()
	 * @model required="true"
	 * @generated
	 */
	Page getCurrentPage();

	/**
	 * Sets the value of the '{@link wizards.Button#getCurrentPage <em>Current Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Page</em>' reference.
	 * @see #getCurrentPage()
	 * @generated
	 */
	void setCurrentPage(Page value);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.label.size() &lt;= 10'"
	 * @generated
	 */
	boolean maxLabelLength(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Button
