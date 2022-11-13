/**
 */
package wizards;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.TextField#getInput <em>Input</em>}</li>
 *   <li>{@link wizards.TextField#getMin_length <em>Min length</em>}</li>
 *   <li>{@link wizards.TextField#getMax_length <em>Max length</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getTextField()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxInputLength'"
 * @generated
 */
public interface TextField extends Component {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see wizards.WizardsPackage#getTextField_Input()
	 * @model
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link wizards.TextField#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Min length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min length</em>' attribute.
	 * @see #setMin_length(int)
	 * @see wizards.WizardsPackage#getTextField_Min_length()
	 * @model required="true"
	 * @generated
	 */
	int getMin_length();

	/**
	 * Sets the value of the '{@link wizards.TextField#getMin_length <em>Min length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min length</em>' attribute.
	 * @see #getMin_length()
	 * @generated
	 */
	void setMin_length(int value);

	/**
	 * Returns the value of the '<em><b>Max length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max length</em>' attribute.
	 * @see #setMax_length(int)
	 * @see wizards.WizardsPackage#getTextField_Max_length()
	 * @model required="true"
	 * @generated
	 */
	int getMax_length();

	/**
	 * Sets the value of the '{@link wizards.TextField#getMax_length <em>Max length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max length</em>' attribute.
	 * @see #getMax_length()
	 * @generated
	 */
	void setMax_length(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t((not self.min_length-&gt;oclIsUndefined()) and (not self.max_length-&gt;oclIsUndefined()))\n\t\t\t\timplies (self.min_length &lt;= self.max_length)'"
	 * @generated
	 */
	boolean validBounds(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t( not self.max_length-&gt;oclIsUndefined() ) implies self.input-&gt;size() &lt;= self.max_length'"
	 * @generated
	 */
	boolean maxInputLength(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t( not self.min_length-&gt;oclIsUndefined() ) implies self.input-&gt;size() &gt;= self.min_length'"
	 * @generated
	 */
	boolean minInputLength(DiagnosticChain diagnostics, Map<Object, Object> context);

} // TextField
