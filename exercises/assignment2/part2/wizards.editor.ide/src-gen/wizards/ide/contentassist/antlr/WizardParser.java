/*
 * generated by Xtext 2.28.0
 */
package wizards.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import wizards.ide.contentassist.antlr.internal.InternalWizardParser;
import wizards.services.WizardGrammarAccess;

public class WizardParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WizardGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WizardGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getWizardAccess().getGroup(), "rule__Wizard__Group__0");
			builder.put(grammarAccess.getWizardAccess().getGroup_4(), "rule__Wizard__Group_4__0");
			builder.put(grammarAccess.getWizardAccess().getGroup_4_1(), "rule__Wizard__Group_4_1__0");
			builder.put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
			builder.put(grammarAccess.getPageAccess().getGroup_3(), "rule__Page__Group_3__0");
			builder.put(grammarAccess.getPageAccess().getGroup_3_2(), "rule__Page__Group_3_2__0");
			builder.put(grammarAccess.getPageAccess().getGroup_4(), "rule__Page__Group_4__0");
			builder.put(grammarAccess.getPageAccess().getGroup_4_2(), "rule__Page__Group_4_2__0");
			builder.put(grammarAccess.getPageAccess().getGroup_5(), "rule__Page__Group_5__0");
			builder.put(grammarAccess.getPageAccess().getGroup_5_2(), "rule__Page__Group_5_2__0");
			builder.put(grammarAccess.getPageAccess().getGroup_6(), "rule__Page__Group_6__0");
			builder.put(grammarAccess.getPageAccess().getGroup_6_2(), "rule__Page__Group_6_2__0");
			builder.put(grammarAccess.getPageAccess().getGroup_7(), "rule__Page__Group_7__0");
			builder.put(grammarAccess.getPageAccess().getGroup_7_2(), "rule__Page__Group_7_2__0");
			builder.put(grammarAccess.getTextFieldAccess().getGroup(), "rule__TextField__Group__0");
			builder.put(grammarAccess.getCheckBoxAccess().getGroup(), "rule__CheckBox__Group__0");
			builder.put(grammarAccess.getReturnButtonAccess().getGroup(), "rule__ReturnButton__Group__0");
			builder.put(grammarAccess.getNavigatorButtonAccess().getGroup(), "rule__NavigatorButton__Group__0");
			builder.put(grammarAccess.getPopUpButtonAccess().getGroup(), "rule__PopUpButton__Group__0");
			builder.put(grammarAccess.getCloseButtonAccess().getGroup(), "rule__CloseButton__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getWizardAccess().getTitleAssignment_1(), "rule__Wizard__TitleAssignment_1");
			builder.put(grammarAccess.getWizardAccess().getInitial_pageAssignment_2(), "rule__Wizard__Initial_pageAssignment_2");
			builder.put(grammarAccess.getWizardAccess().getPagesAssignment_4_0(), "rule__Wizard__PagesAssignment_4_0");
			builder.put(grammarAccess.getWizardAccess().getPagesAssignment_4_1_1(), "rule__Wizard__PagesAssignment_4_1_1");
			builder.put(grammarAccess.getPageAccess().getNameAssignment_0(), "rule__Page__NameAssignment_0");
			builder.put(grammarAccess.getPageAccess().getCheckBoxAssignment_2(), "rule__Page__CheckBoxAssignment_2");
			builder.put(grammarAccess.getPageAccess().getTextFieldsAssignment_3_1(), "rule__Page__TextFieldsAssignment_3_1");
			builder.put(grammarAccess.getPageAccess().getTextFieldsAssignment_3_2_1(), "rule__Page__TextFieldsAssignment_3_2_1");
			builder.put(grammarAccess.getPageAccess().getReturnButtonsAssignment_4_1(), "rule__Page__ReturnButtonsAssignment_4_1");
			builder.put(grammarAccess.getPageAccess().getReturnButtonsAssignment_4_2_1(), "rule__Page__ReturnButtonsAssignment_4_2_1");
			builder.put(grammarAccess.getPageAccess().getNavigatorButtonsAssignment_5_1(), "rule__Page__NavigatorButtonsAssignment_5_1");
			builder.put(grammarAccess.getPageAccess().getNavigatorButtonsAssignment_5_2_1(), "rule__Page__NavigatorButtonsAssignment_5_2_1");
			builder.put(grammarAccess.getPageAccess().getPopUpButtonsAssignment_6_1(), "rule__Page__PopUpButtonsAssignment_6_1");
			builder.put(grammarAccess.getPageAccess().getPopUpButtonsAssignment_6_2_1(), "rule__Page__PopUpButtonsAssignment_6_2_1");
			builder.put(grammarAccess.getPageAccess().getCloseButtonsAssignment_7_1(), "rule__Page__CloseButtonsAssignment_7_1");
			builder.put(grammarAccess.getPageAccess().getCloseButtonsAssignment_7_2_1(), "rule__Page__CloseButtonsAssignment_7_2_1");
			builder.put(grammarAccess.getTextFieldAccess().getLabelAssignment_1(), "rule__TextField__LabelAssignment_1");
			builder.put(grammarAccess.getTextFieldAccess().getMin_lengthAssignment_2(), "rule__TextField__Min_lengthAssignment_2");
			builder.put(grammarAccess.getTextFieldAccess().getMax_lengthAssignment_3(), "rule__TextField__Max_lengthAssignment_3");
			builder.put(grammarAccess.getCheckBoxAccess().getSelectedAssignment_1(), "rule__CheckBox__SelectedAssignment_1");
			builder.put(grammarAccess.getCheckBoxAccess().getLabelAssignment_2(), "rule__CheckBox__LabelAssignment_2");
			builder.put(grammarAccess.getReturnButtonAccess().getLabelAssignment_1(), "rule__ReturnButton__LabelAssignment_1");
			builder.put(grammarAccess.getReturnButtonAccess().getCurrentPageAssignment_2(), "rule__ReturnButton__CurrentPageAssignment_2");
			builder.put(grammarAccess.getReturnButtonAccess().getSrcPageAssignment_3(), "rule__ReturnButton__SrcPageAssignment_3");
			builder.put(grammarAccess.getNavigatorButtonAccess().getLabelAssignment_1(), "rule__NavigatorButton__LabelAssignment_1");
			builder.put(grammarAccess.getNavigatorButtonAccess().getCurrentPageAssignment_2(), "rule__NavigatorButton__CurrentPageAssignment_2");
			builder.put(grammarAccess.getNavigatorButtonAccess().getDstPageAssignment_3(), "rule__NavigatorButton__DstPageAssignment_3");
			builder.put(grammarAccess.getNavigatorButtonAccess().getAlterDstPageAssignment_4(), "rule__NavigatorButton__AlterDstPageAssignment_4");
			builder.put(grammarAccess.getPopUpButtonAccess().getLabelAssignment_1(), "rule__PopUpButton__LabelAssignment_1");
			builder.put(grammarAccess.getPopUpButtonAccess().getPopUpAssignment_2(), "rule__PopUpButton__PopUpAssignment_2");
			builder.put(grammarAccess.getPopUpButtonAccess().getCurrentPageAssignment_3(), "rule__PopUpButton__CurrentPageAssignment_3");
			builder.put(grammarAccess.getCloseButtonAccess().getLabelAssignment_1(), "rule__CloseButton__LabelAssignment_1");
			builder.put(grammarAccess.getCloseButtonAccess().getCurrentPageAssignment_2(), "rule__CloseButton__CurrentPageAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WizardGrammarAccess grammarAccess;

	@Override
	protected InternalWizardParser createParser() {
		InternalWizardParser result = new InternalWizardParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WizardGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WizardGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
