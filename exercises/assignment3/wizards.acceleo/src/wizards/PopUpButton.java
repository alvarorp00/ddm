/**
 */
package wizards;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pop Up Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.PopUpButton#getPopUp <em>Pop Up</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getPopUpButton()
 * @model
 * @generated
 */
public interface PopUpButton extends Button {
	/**
	 * Returns the value of the '<em><b>Pop Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pop Up</em>' attribute.
	 * @see #setPopUp(String)
	 * @see wizards.WizardsPackage#getPopUpButton_PopUp()
	 * @model required="true"
	 * @generated
	 */
	String getPopUp();

	/**
	 * Sets the value of the '{@link wizards.PopUpButton#getPopUp <em>Pop Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pop Up</em>' attribute.
	 * @see #getPopUp()
	 * @generated
	 */
	void setPopUp(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void action();

} // PopUpButton
