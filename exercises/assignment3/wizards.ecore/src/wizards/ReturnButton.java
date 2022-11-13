/**
 */
package wizards;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.ReturnButton#getSrcPage <em>Src Page</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getReturnButton()
 * @model
 * @generated
 */
public interface ReturnButton extends Button {
	/**
	 * Returns the value of the '<em><b>Src Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Page</em>' reference.
	 * @see #setSrcPage(Page)
	 * @see wizards.WizardsPackage#getReturnButton_SrcPage()
	 * @model required="true"
	 * @generated
	 */
	Page getSrcPage();

	/**
	 * Sets the value of the '{@link wizards.ReturnButton#getSrcPage <em>Src Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Page</em>' reference.
	 * @see #getSrcPage()
	 * @generated
	 */
	void setSrcPage(Page value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void action();

} // ReturnButton
