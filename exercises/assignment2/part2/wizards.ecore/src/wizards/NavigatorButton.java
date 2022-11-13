/**
 */
package wizards;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigator Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.NavigatorButton#getDstPage <em>Dst Page</em>}</li>
 *   <li>{@link wizards.NavigatorButton#getAlterDstPage <em>Alter Dst Page</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getNavigatorButton()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noSelfLoop'"
 * @generated
 */
public interface NavigatorButton extends Button {
	/**
	 * Returns the value of the '<em><b>Dst Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Page</em>' reference.
	 * @see #setDstPage(Page)
	 * @see wizards.WizardsPackage#getNavigatorButton_DstPage()
	 * @model required="true"
	 * @generated
	 */
	Page getDstPage();

	/**
	 * Sets the value of the '{@link wizards.NavigatorButton#getDstPage <em>Dst Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst Page</em>' reference.
	 * @see #getDstPage()
	 * @generated
	 */
	void setDstPage(Page value);

	/**
	 * Returns the value of the '<em><b>Alter Dst Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter Dst Page</em>' reference.
	 * @see #setAlterDstPage(Page)
	 * @see wizards.WizardsPackage#getNavigatorButton_AlterDstPage()
	 * @model
	 * @generated
	 */
	Page getAlterDstPage();

	/**
	 * Sets the value of the '{@link wizards.NavigatorButton#getAlterDstPage <em>Alter Dst Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alter Dst Page</em>' reference.
	 * @see #getAlterDstPage()
	 * @generated
	 */
	void setAlterDstPage(Page value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif (not self.currentPage.checkBox-&gt;oclIsUndefined() and\n\t\t\t\t\tself.currentPage.checkBox.selected\n\t\t\t\t) then\n\t\t\t\t\tself.alterDstPage\n\t\t\t\telse\n\t\t\t\t\tself.dstPage\n\t\t\t\tendif'"
	 * @generated
	 */
	Page targetPage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" pageRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif (not self.alterDstPage-&gt;oclIsUndefined() and\n\t\t\t\t\tnot self.currentPage.checkBox-&gt;oclIsUndefined()\n\t\t\t\t) then\n\t\t\t\t\tself.dstPage.reachable(page) or self.alterDstPage.reachable(page)\n\t\t\t\telse\n\t\t\t\t\tself.dstPage.reachable(page)\n\t\t\t\tendif'"
	 * @generated
	 */
	boolean reachable(Page page);

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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.dstPage &lt;&gt; self.currentPage and\n\t\t\t\t(not self.alterDstPage-&gt;oclIsUndefined() implies self.alterDstPage &lt;&gt; self.currentPage)'"
	 * @generated
	 */
	boolean noSelfLoop(DiagnosticChain diagnostics, Map<Object, Object> context);

} // NavigatorButton
