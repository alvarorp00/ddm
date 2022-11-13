/**
 */
package wizards;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wizard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wizards.Wizard#getTitle <em>Title</em>}</li>
 *   <li>{@link wizards.Wizard#getInitial_page <em>Initial page</em>}</li>
 *   <li>{@link wizards.Wizard#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see wizards.WizardsPackage#getWizard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noDuplicatePages'"
 * @generated
 */
public interface Wizard extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see wizards.WizardsPackage#getWizard_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link wizards.Wizard#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Initial page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial page</em>' reference.
	 * @see #setInitial_page(Page)
	 * @see wizards.WizardsPackage#getWizard_Initial_page()
	 * @model required="true"
	 * @generated
	 */
	Page getInitial_page();

	/**
	 * Sets the value of the '{@link wizards.Wizard#getInitial_page <em>Initial page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial page</em>' reference.
	 * @see #getInitial_page()
	 * @generated
	 */
	void setInitial_page(Page value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link wizards.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see wizards.WizardsPackage#getWizard_Pages()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/OCL/Collection nullFree='false'"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.initial_page.returnButtons-&gt;size() = 0'"
	 * @generated
	 */
	boolean initialPageNoReturnButton(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.pages-&gt;forAll(p | self.initial_page.reachable(p))'"
	 * @generated
	 */
	boolean reachablePages(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.pages-&gt;forAll(p1, p2 | p1 &lt;&gt; p2 implies p1.name &lt;&gt; p2.name)'"
	 * @generated
	 */
	boolean noDuplicatePages(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Wizard
