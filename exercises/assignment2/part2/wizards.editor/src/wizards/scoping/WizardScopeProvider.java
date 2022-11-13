/*
 * generated by Xtext 2.28.0
 */
package wizards.scoping;

import java.util.HashSet;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import wizards.Wizard;
import wizards.WizardsPackage;
import wizards.Page;
import wizards.Button;
//import wizards.ReturnButton;
//import wizards.NavigatorButton;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class WizardScopeProvider extends AbstractWizardScopeProvider {
	@Override
	public IScope getScope (EObject context, EReference reference)
	{
		if (context instanceof Button &&
				(reference == WizardsPackage.Literals.NAVIGATOR_BUTTON__DST_PAGE ||
					reference == WizardsPackage.Literals.NAVIGATOR_BUTTON__ALTER_DST_PAGE ||
						reference == WizardsPackage.Literals.RETURN_BUTTON__SRC_PAGE)) {
			Wizard wizard = (Wizard)EcoreUtil2.getRootContainer(context);
			Button button = (Button)context;
			HashSet<Page> targetPages = new HashSet<>();

			for (Page page : wizard.getPages()) {
				if (page != button.getCurrentPage())
					targetPages.add(page);
			}
			
			if (wizard.getInitial_page() != button.getCurrentPage())
			{
				targetPages.add(wizard.getInitial_page());
			}
			
			return Scopes.scopeFor(targetPages);
		} else if (context instanceof Button && reference == WizardsPackage.Literals.BUTTON__CURRENT_PAGE) {
			Page currentPage = (Page)EcoreUtil2.getContainerOfType(context, Page.class);
			System.out.println(EcoreUtil2.getContainerOfType(context, Page.class));
			HashSet<Page> page = new HashSet<>();
			page.add(currentPage);
//			System.out.println(page);
			return Scopes.scopeFor(page);
		}
		else {
			return super.getScope(context, reference);
		}
	}
}
