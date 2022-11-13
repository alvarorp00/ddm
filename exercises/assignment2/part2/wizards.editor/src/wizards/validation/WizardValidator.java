/*
 * generated by Xtext 2.28.0
 */
package wizards.validation;

import org.eclipse.xtext.validation.Check;
import wizards.Component;
import wizards.Button;
import wizards.NavigatorButton;
import wizards.ReturnButton;
import wizards.WizardsPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class WizardValidator extends AbstractWizardValidator {
	
	public static final int MAX_BUTTON_LABEL_LENGTH = 10;
	
	public static final String EMPTY_LABEL_WRN = "emptyLabel";
	public static final String NO_ALTER_PAGE_ERR = "noAlterPage";
	public static final String SELF_LOOP_DST_ERR = "dstSelfLoop";
	public static final String SELF_LOOP_ALTER_DST_ERR = "alterDstSelfLoop";
	public static final String SELF_LOOP_SRC_PAGE = "srcReturnPageLoop";
	public static final String MAX_BUTTON_LABEL_LENGTH_ERR = "maxButtonLabelLength";
	
	@Check
	public void labelNotEmpty(Component component) {
		if (component.getLabel().isBlank())
		{
			warning("Empty label", WizardsPackage.Literals.COMPONENT__LABEL, EMPTY_LABEL_WRN);
		}
	}
	
	@Check
	public void checkBoxAlterPageConsistency(NavigatorButton navigatorButton)
	{
		if (navigatorButton.getCurrentPage().getCheckBox() != null & navigatorButton.getAlterDstPage() == null)
		{
			error("No alter dest page with CheckBox on page", WizardsPackage.Literals.NAVIGATOR_BUTTON__ALTER_DST_PAGE, NO_ALTER_PAGE_ERR);
		}
	}
	
	@Check
	public void selfLoopInsideNavigatorButton(NavigatorButton navigatorButton)
	{
		if (navigatorButton.getDstPage() == navigatorButton.getCurrentPage()) {
			error("Self loop inside navigator button", WizardsPackage.Literals.NAVIGATOR_BUTTON__DST_PAGE, SELF_LOOP_DST_ERR);
		}
		else if(navigatorButton.getAlterDstPage() == navigatorButton.getCurrentPage())
		{
			error("Self loop inside navigator button", WizardsPackage.Literals.NAVIGATOR_BUTTON__ALTER_DST_PAGE, SELF_LOOP_ALTER_DST_ERR);
		}
	}
	
	@Check
	public void selfLoopInsideReturnButton(ReturnButton returnButton)
	{
		if (returnButton.getSrcPage() == returnButton.getCurrentPage())
		{
			error("Self loop inside return button", WizardsPackage.Literals.RETURN_BUTTON__SRC_PAGE, SELF_LOOP_SRC_PAGE);
		}
	}
	
	@Check
	public void buttonMaxLength(Button button)
	{
		if (button.getLabel().length() > MAX_BUTTON_LABEL_LENGTH)
		{
			error("Maximum label length in button reached", WizardsPackage.Literals.COMPONENT__LABEL, MAX_BUTTON_LABEL_LENGTH_ERR);
		}
	}
}
