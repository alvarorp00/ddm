/*
 * generated by Xtext 2.28.0
 */
package wizards.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import wizards.Page
import wizards.Wizard
import wizards.services.WizardGrammarAccess

class WizardFormatter extends AbstractFormatter2 {
	
	@Inject extension WizardGrammarAccess

	def dispatch void format(Wizard wizard, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (page : wizard.pages) {
			page.format
		}
	}

	def dispatch void format(Page page, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		page.checkBox.format
		for (textField : page.textFields) {
			textField.format
		}
		for (returnButton : page.returnButtons) {
			returnButton.format
		}
		for (navigatorButton : page.navigatorButtons) {
			navigatorButton.format
		}
		for (popUpButton : page.popUpButtons) {
			popUpButton.format
		}
		for (closeButton : page.closeButtons) {
			closeButton.format
		}
	}
	
}
