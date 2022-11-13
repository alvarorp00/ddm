package wizards.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import wizards.services.WizardGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWizardParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Pages:'", "','", "'{'", "'}'", "'TextField'", "'CheckBox'", "'ReturnButton'", "'NavigatorButton'", "'PopUpButton'", "'CloseButton'", "'-'", "'true'", "'false'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalWizardParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWizardParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWizardParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWizard.g"; }



     	private WizardGrammarAccess grammarAccess;

        public InternalWizardParser(TokenStream input, WizardGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Wizard";
       	}

       	@Override
       	protected WizardGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWizard"
    // InternalWizard.g:64:1: entryRuleWizard returns [EObject current=null] : iv_ruleWizard= ruleWizard EOF ;
    public final EObject entryRuleWizard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWizard = null;


        try {
            // InternalWizard.g:64:47: (iv_ruleWizard= ruleWizard EOF )
            // InternalWizard.g:65:2: iv_ruleWizard= ruleWizard EOF
            {
             newCompositeNode(grammarAccess.getWizardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWizard=ruleWizard();

            state._fsp--;

             current =iv_ruleWizard; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWizard"


    // $ANTLR start "ruleWizard"
    // InternalWizard.g:71:1: ruleWizard returns [EObject current=null] : ( () ( (lv_title_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'Pages:' ( ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* )? ) ;
    public final EObject ruleWizard() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_pages_4_0 = null;

        EObject lv_pages_6_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:77:2: ( ( () ( (lv_title_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'Pages:' ( ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* )? ) )
            // InternalWizard.g:78:2: ( () ( (lv_title_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'Pages:' ( ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* )? )
            {
            // InternalWizard.g:78:2: ( () ( (lv_title_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'Pages:' ( ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* )? )
            // InternalWizard.g:79:3: () ( (lv_title_1_0= ruleEString ) ) ( ( ruleEString ) ) otherlv_3= 'Pages:' ( ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* )?
            {
            // InternalWizard.g:79:3: ()
            // InternalWizard.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWizardAccess().getWizardAction_0(),
            					current);
            			

            }

            // InternalWizard.g:86:3: ( (lv_title_1_0= ruleEString ) )
            // InternalWizard.g:87:4: (lv_title_1_0= ruleEString )
            {
            // InternalWizard.g:87:4: (lv_title_1_0= ruleEString )
            // InternalWizard.g:88:5: lv_title_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWizardAccess().getTitleEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_title_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWizardRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:105:3: ( ( ruleEString ) )
            // InternalWizard.g:106:4: ( ruleEString )
            {
            // InternalWizard.g:106:4: ( ruleEString )
            // InternalWizard.g:107:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWizardRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWizardAccess().getInitial_pagePageCrossReference_2_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getWizardAccess().getPagesKeyword_3());
            		
            // InternalWizard.g:125:3: ( ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalWizard.g:126:4: ( (lv_pages_4_0= rulePage ) ) (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )*
                    {
                    // InternalWizard.g:126:4: ( (lv_pages_4_0= rulePage ) )
                    // InternalWizard.g:127:5: (lv_pages_4_0= rulePage )
                    {
                    // InternalWizard.g:127:5: (lv_pages_4_0= rulePage )
                    // InternalWizard.g:128:6: lv_pages_4_0= rulePage
                    {

                    						newCompositeNode(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_pages_4_0=rulePage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWizardRule());
                    						}
                    						add(
                    							current,
                    							"pages",
                    							lv_pages_4_0,
                    							"wizards.Wizard.Page");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:145:4: (otherlv_5= ',' ( (lv_pages_6_0= rulePage ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalWizard.g:146:5: otherlv_5= ',' ( (lv_pages_6_0= rulePage ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getWizardAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalWizard.g:150:5: ( (lv_pages_6_0= rulePage ) )
                    	    // InternalWizard.g:151:6: (lv_pages_6_0= rulePage )
                    	    {
                    	    // InternalWizard.g:151:6: (lv_pages_6_0= rulePage )
                    	    // InternalWizard.g:152:7: lv_pages_6_0= rulePage
                    	    {

                    	    							newCompositeNode(grammarAccess.getWizardAccess().getPagesPageParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_pages_6_0=rulePage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWizardRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pages",
                    	    								lv_pages_6_0,
                    	    								"wizards.Wizard.Page");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWizard"


    // $ANTLR start "entryRuleEString"
    // InternalWizard.g:175:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalWizard.g:175:47: (iv_ruleEString= ruleEString EOF )
            // InternalWizard.g:176:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalWizard.g:182:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalWizard.g:188:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalWizard.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalWizard.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWizard.g:190:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWizard.g:198:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePage"
    // InternalWizard.g:209:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalWizard.g:209:45: (iv_rulePage= rulePage EOF )
            // InternalWizard.g:210:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalWizard.g:216:1: rulePage returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_checkBox_2_0= ruleCheckBox ) )? (otherlv_3= '{' ( (lv_textFields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )* otherlv_7= '}' )? (otherlv_8= '{' ( (lv_returnButtons_9_0= ruleReturnButton ) ) (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )* otherlv_12= '}' )? (otherlv_13= '{' ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) ) (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )* otherlv_17= '}' )? (otherlv_18= '{' ( (lv_popUpButtons_19_0= rulePopUpButton ) ) (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )* otherlv_22= '}' )? (otherlv_23= '{' ( (lv_closeButtons_24_0= ruleCloseButton ) ) (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_checkBox_2_0 = null;

        EObject lv_textFields_4_0 = null;

        EObject lv_textFields_6_0 = null;

        EObject lv_returnButtons_9_0 = null;

        EObject lv_returnButtons_11_0 = null;

        EObject lv_navigatorButtons_14_0 = null;

        EObject lv_navigatorButtons_16_0 = null;

        EObject lv_popUpButtons_19_0 = null;

        EObject lv_popUpButtons_21_0 = null;

        EObject lv_closeButtons_24_0 = null;

        EObject lv_closeButtons_26_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:222:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_checkBox_2_0= ruleCheckBox ) )? (otherlv_3= '{' ( (lv_textFields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )* otherlv_7= '}' )? (otherlv_8= '{' ( (lv_returnButtons_9_0= ruleReturnButton ) ) (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )* otherlv_12= '}' )? (otherlv_13= '{' ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) ) (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )* otherlv_17= '}' )? (otherlv_18= '{' ( (lv_popUpButtons_19_0= rulePopUpButton ) ) (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )* otherlv_22= '}' )? (otherlv_23= '{' ( (lv_closeButtons_24_0= ruleCloseButton ) ) (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalWizard.g:223:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_checkBox_2_0= ruleCheckBox ) )? (otherlv_3= '{' ( (lv_textFields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )* otherlv_7= '}' )? (otherlv_8= '{' ( (lv_returnButtons_9_0= ruleReturnButton ) ) (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )* otherlv_12= '}' )? (otherlv_13= '{' ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) ) (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )* otherlv_17= '}' )? (otherlv_18= '{' ( (lv_popUpButtons_19_0= rulePopUpButton ) ) (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )* otherlv_22= '}' )? (otherlv_23= '{' ( (lv_closeButtons_24_0= ruleCloseButton ) ) (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalWizard.g:223:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_checkBox_2_0= ruleCheckBox ) )? (otherlv_3= '{' ( (lv_textFields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )* otherlv_7= '}' )? (otherlv_8= '{' ( (lv_returnButtons_9_0= ruleReturnButton ) ) (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )* otherlv_12= '}' )? (otherlv_13= '{' ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) ) (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )* otherlv_17= '}' )? (otherlv_18= '{' ( (lv_popUpButtons_19_0= rulePopUpButton ) ) (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )* otherlv_22= '}' )? (otherlv_23= '{' ( (lv_closeButtons_24_0= ruleCloseButton ) ) (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalWizard.g:224:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_checkBox_2_0= ruleCheckBox ) )? (otherlv_3= '{' ( (lv_textFields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )* otherlv_7= '}' )? (otherlv_8= '{' ( (lv_returnButtons_9_0= ruleReturnButton ) ) (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )* otherlv_12= '}' )? (otherlv_13= '{' ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) ) (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )* otherlv_17= '}' )? (otherlv_18= '{' ( (lv_popUpButtons_19_0= rulePopUpButton ) ) (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )* otherlv_22= '}' )? (otherlv_23= '{' ( (lv_closeButtons_24_0= ruleCloseButton ) ) (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalWizard.g:224:3: ( (lv_name_0_0= ruleEString ) )
            // InternalWizard.g:225:4: (lv_name_0_0= ruleEString )
            {
            // InternalWizard.g:225:4: (lv_name_0_0= ruleEString )
            // InternalWizard.g:226:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWizard.g:247:3: ( (lv_checkBox_2_0= ruleCheckBox ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWizard.g:248:4: (lv_checkBox_2_0= ruleCheckBox )
                    {
                    // InternalWizard.g:248:4: (lv_checkBox_2_0= ruleCheckBox )
                    // InternalWizard.g:249:5: lv_checkBox_2_0= ruleCheckBox
                    {

                    					newCompositeNode(grammarAccess.getPageAccess().getCheckBoxCheckBoxParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_checkBox_2_0=ruleCheckBox();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPageRule());
                    					}
                    					set(
                    						current,
                    						"checkBox",
                    						lv_checkBox_2_0,
                    						"wizards.Wizard.CheckBox");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWizard.g:266:3: (otherlv_3= '{' ( (lv_textFields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==15) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalWizard.g:267:4: otherlv_3= '{' ( (lv_textFields_4_0= ruleTextField ) ) (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )* otherlv_7= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalWizard.g:271:4: ( (lv_textFields_4_0= ruleTextField ) )
                    // InternalWizard.g:272:5: (lv_textFields_4_0= ruleTextField )
                    {
                    // InternalWizard.g:272:5: (lv_textFields_4_0= ruleTextField )
                    // InternalWizard.g:273:6: lv_textFields_4_0= ruleTextField
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getTextFieldsTextFieldParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_textFields_4_0=ruleTextField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						add(
                    							current,
                    							"textFields",
                    							lv_textFields_4_0,
                    							"wizards.Wizard.TextField");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:290:4: (otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalWizard.g:291:5: otherlv_5= ',' ( (lv_textFields_6_0= ruleTextField ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getPageAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalWizard.g:295:5: ( (lv_textFields_6_0= ruleTextField ) )
                    	    // InternalWizard.g:296:6: (lv_textFields_6_0= ruleTextField )
                    	    {
                    	    // InternalWizard.g:296:6: (lv_textFields_6_0= ruleTextField )
                    	    // InternalWizard.g:297:7: lv_textFields_6_0= ruleTextField
                    	    {

                    	    							newCompositeNode(grammarAccess.getPageAccess().getTextFieldsTextFieldParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_textFields_6_0=ruleTextField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"textFields",
                    	    								lv_textFields_6_0,
                    	    								"wizards.Wizard.TextField");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalWizard.g:320:3: (otherlv_8= '{' ( (lv_returnButtons_9_0= ruleReturnButton ) ) (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )* otherlv_12= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==17) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalWizard.g:321:4: otherlv_8= '{' ( (lv_returnButtons_9_0= ruleReturnButton ) ) (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalWizard.g:325:4: ( (lv_returnButtons_9_0= ruleReturnButton ) )
                    // InternalWizard.g:326:5: (lv_returnButtons_9_0= ruleReturnButton )
                    {
                    // InternalWizard.g:326:5: (lv_returnButtons_9_0= ruleReturnButton )
                    // InternalWizard.g:327:6: lv_returnButtons_9_0= ruleReturnButton
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getReturnButtonsReturnButtonParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_returnButtons_9_0=ruleReturnButton();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						add(
                    							current,
                    							"returnButtons",
                    							lv_returnButtons_9_0,
                    							"wizards.Wizard.ReturnButton");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:344:4: (otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==12) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalWizard.g:345:5: otherlv_10= ',' ( (lv_returnButtons_11_0= ruleReturnButton ) )
                    	    {
                    	    otherlv_10=(Token)match(input,12,FOLLOW_12); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getPageAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalWizard.g:349:5: ( (lv_returnButtons_11_0= ruleReturnButton ) )
                    	    // InternalWizard.g:350:6: (lv_returnButtons_11_0= ruleReturnButton )
                    	    {
                    	    // InternalWizard.g:350:6: (lv_returnButtons_11_0= ruleReturnButton )
                    	    // InternalWizard.g:351:7: lv_returnButtons_11_0= ruleReturnButton
                    	    {

                    	    							newCompositeNode(grammarAccess.getPageAccess().getReturnButtonsReturnButtonParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_returnButtons_11_0=ruleReturnButton();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"returnButtons",
                    	    								lv_returnButtons_11_0,
                    	    								"wizards.Wizard.ReturnButton");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalWizard.g:374:3: (otherlv_13= '{' ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) ) (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )* otherlv_17= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==18) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalWizard.g:375:4: otherlv_13= '{' ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) ) (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )* otherlv_17= '}'
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalWizard.g:379:4: ( (lv_navigatorButtons_14_0= ruleNavigatorButton ) )
                    // InternalWizard.g:380:5: (lv_navigatorButtons_14_0= ruleNavigatorButton )
                    {
                    // InternalWizard.g:380:5: (lv_navigatorButtons_14_0= ruleNavigatorButton )
                    // InternalWizard.g:381:6: lv_navigatorButtons_14_0= ruleNavigatorButton
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getNavigatorButtonsNavigatorButtonParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_navigatorButtons_14_0=ruleNavigatorButton();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						add(
                    							current,
                    							"navigatorButtons",
                    							lv_navigatorButtons_14_0,
                    							"wizards.Wizard.NavigatorButton");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:398:4: (otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalWizard.g:399:5: otherlv_15= ',' ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) )
                    	    {
                    	    otherlv_15=(Token)match(input,12,FOLLOW_13); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getPageAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalWizard.g:403:5: ( (lv_navigatorButtons_16_0= ruleNavigatorButton ) )
                    	    // InternalWizard.g:404:6: (lv_navigatorButtons_16_0= ruleNavigatorButton )
                    	    {
                    	    // InternalWizard.g:404:6: (lv_navigatorButtons_16_0= ruleNavigatorButton )
                    	    // InternalWizard.g:405:7: lv_navigatorButtons_16_0= ruleNavigatorButton
                    	    {

                    	    							newCompositeNode(grammarAccess.getPageAccess().getNavigatorButtonsNavigatorButtonParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_navigatorButtons_16_0=ruleNavigatorButton();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"navigatorButtons",
                    	    								lv_navigatorButtons_16_0,
                    	    								"wizards.Wizard.NavigatorButton");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_17, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalWizard.g:428:3: (otherlv_18= '{' ( (lv_popUpButtons_19_0= rulePopUpButton ) ) (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )* otherlv_22= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==19) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalWizard.g:429:4: otherlv_18= '{' ( (lv_popUpButtons_19_0= rulePopUpButton ) ) (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalWizard.g:433:4: ( (lv_popUpButtons_19_0= rulePopUpButton ) )
                    // InternalWizard.g:434:5: (lv_popUpButtons_19_0= rulePopUpButton )
                    {
                    // InternalWizard.g:434:5: (lv_popUpButtons_19_0= rulePopUpButton )
                    // InternalWizard.g:435:6: lv_popUpButtons_19_0= rulePopUpButton
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getPopUpButtonsPopUpButtonParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_popUpButtons_19_0=rulePopUpButton();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						add(
                    							current,
                    							"popUpButtons",
                    							lv_popUpButtons_19_0,
                    							"wizards.Wizard.PopUpButton");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:452:4: (otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==12) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalWizard.g:453:5: otherlv_20= ',' ( (lv_popUpButtons_21_0= rulePopUpButton ) )
                    	    {
                    	    otherlv_20=(Token)match(input,12,FOLLOW_14); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getPageAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalWizard.g:457:5: ( (lv_popUpButtons_21_0= rulePopUpButton ) )
                    	    // InternalWizard.g:458:6: (lv_popUpButtons_21_0= rulePopUpButton )
                    	    {
                    	    // InternalWizard.g:458:6: (lv_popUpButtons_21_0= rulePopUpButton )
                    	    // InternalWizard.g:459:7: lv_popUpButtons_21_0= rulePopUpButton
                    	    {

                    	    							newCompositeNode(grammarAccess.getPageAccess().getPopUpButtonsPopUpButtonParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_popUpButtons_21_0=rulePopUpButton();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"popUpButtons",
                    	    								lv_popUpButtons_21_0,
                    	    								"wizards.Wizard.PopUpButton");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            // InternalWizard.g:482:3: (otherlv_23= '{' ( (lv_closeButtons_24_0= ruleCloseButton ) ) (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )* otherlv_27= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalWizard.g:483:4: otherlv_23= '{' ( (lv_closeButtons_24_0= ruleCloseButton ) ) (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )* otherlv_27= '}'
                    {
                    otherlv_23=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalWizard.g:487:4: ( (lv_closeButtons_24_0= ruleCloseButton ) )
                    // InternalWizard.g:488:5: (lv_closeButtons_24_0= ruleCloseButton )
                    {
                    // InternalWizard.g:488:5: (lv_closeButtons_24_0= ruleCloseButton )
                    // InternalWizard.g:489:6: lv_closeButtons_24_0= ruleCloseButton
                    {

                    						newCompositeNode(grammarAccess.getPageAccess().getCloseButtonsCloseButtonParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_closeButtons_24_0=ruleCloseButton();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPageRule());
                    						}
                    						add(
                    							current,
                    							"closeButtons",
                    							lv_closeButtons_24_0,
                    							"wizards.Wizard.CloseButton");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalWizard.g:506:4: (otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==12) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalWizard.g:507:5: otherlv_25= ',' ( (lv_closeButtons_26_0= ruleCloseButton ) )
                    	    {
                    	    otherlv_25=(Token)match(input,12,FOLLOW_15); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getPageAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalWizard.g:511:5: ( (lv_closeButtons_26_0= ruleCloseButton ) )
                    	    // InternalWizard.g:512:6: (lv_closeButtons_26_0= ruleCloseButton )
                    	    {
                    	    // InternalWizard.g:512:6: (lv_closeButtons_26_0= ruleCloseButton )
                    	    // InternalWizard.g:513:7: lv_closeButtons_26_0= ruleCloseButton
                    	    {

                    	    							newCompositeNode(grammarAccess.getPageAccess().getCloseButtonsCloseButtonParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_closeButtons_26_0=ruleCloseButton();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"closeButtons",
                    	    								lv_closeButtons_26_0,
                    	    								"wizards.Wizard.CloseButton");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_27, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleTextField"
    // InternalWizard.g:544:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // InternalWizard.g:544:50: (iv_ruleTextField= ruleTextField EOF )
            // InternalWizard.g:545:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // InternalWizard.g:551:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'TextField' ( (lv_label_1_0= ruleEString ) ) ( (lv_min_length_2_0= ruleEInt ) )? ( (lv_max_length_3_0= ruleEInt ) )? ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        AntlrDatatypeRuleToken lv_min_length_2_0 = null;

        AntlrDatatypeRuleToken lv_max_length_3_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:557:2: ( (otherlv_0= 'TextField' ( (lv_label_1_0= ruleEString ) ) ( (lv_min_length_2_0= ruleEInt ) )? ( (lv_max_length_3_0= ruleEInt ) )? ) )
            // InternalWizard.g:558:2: (otherlv_0= 'TextField' ( (lv_label_1_0= ruleEString ) ) ( (lv_min_length_2_0= ruleEInt ) )? ( (lv_max_length_3_0= ruleEInt ) )? )
            {
            // InternalWizard.g:558:2: (otherlv_0= 'TextField' ( (lv_label_1_0= ruleEString ) ) ( (lv_min_length_2_0= ruleEInt ) )? ( (lv_max_length_3_0= ruleEInt ) )? )
            // InternalWizard.g:559:3: otherlv_0= 'TextField' ( (lv_label_1_0= ruleEString ) ) ( (lv_min_length_2_0= ruleEInt ) )? ( (lv_max_length_3_0= ruleEInt ) )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
            		
            // InternalWizard.g:563:3: ( (lv_label_1_0= ruleEString ) )
            // InternalWizard.g:564:4: (lv_label_1_0= ruleEString )
            {
            // InternalWizard.g:564:4: (lv_label_1_0= ruleEString )
            // InternalWizard.g:565:5: lv_label_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTextFieldAccess().getLabelEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_label_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextFieldRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:582:3: ( (lv_min_length_2_0= ruleEInt ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==RULE_INT) ) {
                    alt15=1;
                }
            }
            else if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalWizard.g:583:4: (lv_min_length_2_0= ruleEInt )
                    {
                    // InternalWizard.g:583:4: (lv_min_length_2_0= ruleEInt )
                    // InternalWizard.g:584:5: lv_min_length_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getTextFieldAccess().getMin_lengthEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_min_length_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    					}
                    					set(
                    						current,
                    						"min_length",
                    						lv_min_length_2_0,
                    						"wizards.Wizard.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWizard.g:601:3: ( (lv_max_length_3_0= ruleEInt ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT||LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalWizard.g:602:4: (lv_max_length_3_0= ruleEInt )
                    {
                    // InternalWizard.g:602:4: (lv_max_length_3_0= ruleEInt )
                    // InternalWizard.g:603:5: lv_max_length_3_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getTextFieldAccess().getMax_lengthEIntParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_max_length_3_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    					}
                    					set(
                    						current,
                    						"max_length",
                    						lv_max_length_3_0,
                    						"wizards.Wizard.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleCheckBox"
    // InternalWizard.g:624:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalWizard.g:624:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalWizard.g:625:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalWizard.g:631:1: ruleCheckBox returns [EObject current=null] : (otherlv_0= 'CheckBox' ( (lv_selected_1_0= ruleEBoolean ) ) ( (lv_label_2_0= ruleEString ) ) ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_selected_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:637:2: ( (otherlv_0= 'CheckBox' ( (lv_selected_1_0= ruleEBoolean ) ) ( (lv_label_2_0= ruleEString ) ) ) )
            // InternalWizard.g:638:2: (otherlv_0= 'CheckBox' ( (lv_selected_1_0= ruleEBoolean ) ) ( (lv_label_2_0= ruleEString ) ) )
            {
            // InternalWizard.g:638:2: (otherlv_0= 'CheckBox' ( (lv_selected_1_0= ruleEBoolean ) ) ( (lv_label_2_0= ruleEString ) ) )
            // InternalWizard.g:639:3: otherlv_0= 'CheckBox' ( (lv_selected_1_0= ruleEBoolean ) ) ( (lv_label_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckBoxAccess().getCheckBoxKeyword_0());
            		
            // InternalWizard.g:643:3: ( (lv_selected_1_0= ruleEBoolean ) )
            // InternalWizard.g:644:4: (lv_selected_1_0= ruleEBoolean )
            {
            // InternalWizard.g:644:4: (lv_selected_1_0= ruleEBoolean )
            // InternalWizard.g:645:5: lv_selected_1_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getCheckBoxAccess().getSelectedEBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_selected_1_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckBoxRule());
            					}
            					set(
            						current,
            						"selected",
            						lv_selected_1_0,
            						"wizards.Wizard.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:662:3: ( (lv_label_2_0= ruleEString ) )
            // InternalWizard.g:663:4: (lv_label_2_0= ruleEString )
            {
            // InternalWizard.g:663:4: (lv_label_2_0= ruleEString )
            // InternalWizard.g:664:5: lv_label_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCheckBoxAccess().getLabelEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_label_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckBoxRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_2_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleReturnButton"
    // InternalWizard.g:685:1: entryRuleReturnButton returns [EObject current=null] : iv_ruleReturnButton= ruleReturnButton EOF ;
    public final EObject entryRuleReturnButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnButton = null;


        try {
            // InternalWizard.g:685:53: (iv_ruleReturnButton= ruleReturnButton EOF )
            // InternalWizard.g:686:2: iv_ruleReturnButton= ruleReturnButton EOF
            {
             newCompositeNode(grammarAccess.getReturnButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnButton=ruleReturnButton();

            state._fsp--;

             current =iv_ruleReturnButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnButton"


    // $ANTLR start "ruleReturnButton"
    // InternalWizard.g:692:1: ruleReturnButton returns [EObject current=null] : (otherlv_0= 'ReturnButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleReturnButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:698:2: ( (otherlv_0= 'ReturnButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalWizard.g:699:2: (otherlv_0= 'ReturnButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalWizard.g:699:2: (otherlv_0= 'ReturnButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) )
            // InternalWizard.g:700:3: otherlv_0= 'ReturnButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnButtonAccess().getReturnButtonKeyword_0());
            		
            // InternalWizard.g:704:3: ( (lv_label_1_0= ruleEString ) )
            // InternalWizard.g:705:4: (lv_label_1_0= ruleEString )
            {
            // InternalWizard.g:705:4: (lv_label_1_0= ruleEString )
            // InternalWizard.g:706:5: lv_label_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReturnButtonAccess().getLabelEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_label_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnButtonRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:723:3: ( ( ruleEString ) )
            // InternalWizard.g:724:4: ( ruleEString )
            {
            // InternalWizard.g:724:4: ( ruleEString )
            // InternalWizard.g:725:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnButtonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReturnButtonAccess().getCurrentPagePageCrossReference_2_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:739:3: ( ( ruleEString ) )
            // InternalWizard.g:740:4: ( ruleEString )
            {
            // InternalWizard.g:740:4: ( ruleEString )
            // InternalWizard.g:741:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnButtonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReturnButtonAccess().getSrcPagePageCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnButton"


    // $ANTLR start "entryRuleNavigatorButton"
    // InternalWizard.g:759:1: entryRuleNavigatorButton returns [EObject current=null] : iv_ruleNavigatorButton= ruleNavigatorButton EOF ;
    public final EObject entryRuleNavigatorButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigatorButton = null;


        try {
            // InternalWizard.g:759:56: (iv_ruleNavigatorButton= ruleNavigatorButton EOF )
            // InternalWizard.g:760:2: iv_ruleNavigatorButton= ruleNavigatorButton EOF
            {
             newCompositeNode(grammarAccess.getNavigatorButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigatorButton=ruleNavigatorButton();

            state._fsp--;

             current =iv_ruleNavigatorButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavigatorButton"


    // $ANTLR start "ruleNavigatorButton"
    // InternalWizard.g:766:1: ruleNavigatorButton returns [EObject current=null] : (otherlv_0= 'NavigatorButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )? ) ;
    public final EObject ruleNavigatorButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:772:2: ( (otherlv_0= 'NavigatorButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )? ) )
            // InternalWizard.g:773:2: (otherlv_0= 'NavigatorButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )? )
            {
            // InternalWizard.g:773:2: (otherlv_0= 'NavigatorButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )? )
            // InternalWizard.g:774:3: otherlv_0= 'NavigatorButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) ) ( ( ruleEString ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigatorButtonAccess().getNavigatorButtonKeyword_0());
            		
            // InternalWizard.g:778:3: ( (lv_label_1_0= ruleEString ) )
            // InternalWizard.g:779:4: (lv_label_1_0= ruleEString )
            {
            // InternalWizard.g:779:4: (lv_label_1_0= ruleEString )
            // InternalWizard.g:780:5: lv_label_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNavigatorButtonAccess().getLabelEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_label_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavigatorButtonRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:797:3: ( ( ruleEString ) )
            // InternalWizard.g:798:4: ( ruleEString )
            {
            // InternalWizard.g:798:4: ( ruleEString )
            // InternalWizard.g:799:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatorButtonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNavigatorButtonAccess().getCurrentPagePageCrossReference_2_0());
            				
            pushFollow(FOLLOW_3);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:813:3: ( ( ruleEString ) )
            // InternalWizard.g:814:4: ( ruleEString )
            {
            // InternalWizard.g:814:4: ( ruleEString )
            // InternalWizard.g:815:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigatorButtonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getNavigatorButtonAccess().getDstPagePageCrossReference_3_0());
            				
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:829:3: ( ( ruleEString ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalWizard.g:830:4: ( ruleEString )
                    {
                    // InternalWizard.g:830:4: ( ruleEString )
                    // InternalWizard.g:831:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNavigatorButtonRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getNavigatorButtonAccess().getAlterDstPagePageCrossReference_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavigatorButton"


    // $ANTLR start "entryRulePopUpButton"
    // InternalWizard.g:849:1: entryRulePopUpButton returns [EObject current=null] : iv_rulePopUpButton= rulePopUpButton EOF ;
    public final EObject entryRulePopUpButton() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePopUpButton = null;


        try {
            // InternalWizard.g:849:52: (iv_rulePopUpButton= rulePopUpButton EOF )
            // InternalWizard.g:850:2: iv_rulePopUpButton= rulePopUpButton EOF
            {
             newCompositeNode(grammarAccess.getPopUpButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePopUpButton=rulePopUpButton();

            state._fsp--;

             current =iv_rulePopUpButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePopUpButton"


    // $ANTLR start "rulePopUpButton"
    // InternalWizard.g:856:1: rulePopUpButton returns [EObject current=null] : (otherlv_0= 'PopUpButton' ( (lv_label_1_0= ruleEString ) ) ( (lv_popUp_2_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject rulePopUpButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        AntlrDatatypeRuleToken lv_popUp_2_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:862:2: ( (otherlv_0= 'PopUpButton' ( (lv_label_1_0= ruleEString ) ) ( (lv_popUp_2_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalWizard.g:863:2: (otherlv_0= 'PopUpButton' ( (lv_label_1_0= ruleEString ) ) ( (lv_popUp_2_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalWizard.g:863:2: (otherlv_0= 'PopUpButton' ( (lv_label_1_0= ruleEString ) ) ( (lv_popUp_2_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalWizard.g:864:3: otherlv_0= 'PopUpButton' ( (lv_label_1_0= ruleEString ) ) ( (lv_popUp_2_0= ruleEString ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPopUpButtonAccess().getPopUpButtonKeyword_0());
            		
            // InternalWizard.g:868:3: ( (lv_label_1_0= ruleEString ) )
            // InternalWizard.g:869:4: (lv_label_1_0= ruleEString )
            {
            // InternalWizard.g:869:4: (lv_label_1_0= ruleEString )
            // InternalWizard.g:870:5: lv_label_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPopUpButtonAccess().getLabelEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_label_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPopUpButtonRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:887:3: ( (lv_popUp_2_0= ruleEString ) )
            // InternalWizard.g:888:4: (lv_popUp_2_0= ruleEString )
            {
            // InternalWizard.g:888:4: (lv_popUp_2_0= ruleEString )
            // InternalWizard.g:889:5: lv_popUp_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPopUpButtonAccess().getPopUpEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_popUp_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPopUpButtonRule());
            					}
            					set(
            						current,
            						"popUp",
            						lv_popUp_2_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:906:3: ( ( ruleEString ) )
            // InternalWizard.g:907:4: ( ruleEString )
            {
            // InternalWizard.g:907:4: ( ruleEString )
            // InternalWizard.g:908:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPopUpButtonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPopUpButtonAccess().getCurrentPagePageCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePopUpButton"


    // $ANTLR start "entryRuleCloseButton"
    // InternalWizard.g:926:1: entryRuleCloseButton returns [EObject current=null] : iv_ruleCloseButton= ruleCloseButton EOF ;
    public final EObject entryRuleCloseButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCloseButton = null;


        try {
            // InternalWizard.g:926:52: (iv_ruleCloseButton= ruleCloseButton EOF )
            // InternalWizard.g:927:2: iv_ruleCloseButton= ruleCloseButton EOF
            {
             newCompositeNode(grammarAccess.getCloseButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCloseButton=ruleCloseButton();

            state._fsp--;

             current =iv_ruleCloseButton; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCloseButton"


    // $ANTLR start "ruleCloseButton"
    // InternalWizard.g:933:1: ruleCloseButton returns [EObject current=null] : (otherlv_0= 'CloseButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleCloseButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;



        	enterRule();

        try {
            // InternalWizard.g:939:2: ( (otherlv_0= 'CloseButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) ) )
            // InternalWizard.g:940:2: (otherlv_0= 'CloseButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) )
            {
            // InternalWizard.g:940:2: (otherlv_0= 'CloseButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) ) )
            // InternalWizard.g:941:3: otherlv_0= 'CloseButton' ( (lv_label_1_0= ruleEString ) ) ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCloseButtonAccess().getCloseButtonKeyword_0());
            		
            // InternalWizard.g:945:3: ( (lv_label_1_0= ruleEString ) )
            // InternalWizard.g:946:4: (lv_label_1_0= ruleEString )
            {
            // InternalWizard.g:946:4: (lv_label_1_0= ruleEString )
            // InternalWizard.g:947:5: lv_label_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCloseButtonAccess().getLabelEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_label_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCloseButtonRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_1_0,
            						"wizards.Wizard.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWizard.g:964:3: ( ( ruleEString ) )
            // InternalWizard.g:965:4: ( ruleEString )
            {
            // InternalWizard.g:965:4: ( ruleEString )
            // InternalWizard.g:966:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCloseButtonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCloseButtonAccess().getCurrentPagePageCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCloseButton"


    // $ANTLR start "entryRuleEInt"
    // InternalWizard.g:984:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalWizard.g:984:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalWizard.g:985:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalWizard.g:991:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalWizard.g:997:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalWizard.g:998:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalWizard.g:998:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalWizard.g:999:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalWizard.g:999:3: (kw= '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalWizard.g:1000:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEBoolean"
    // InternalWizard.g:1017:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalWizard.g:1017:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalWizard.g:1018:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalWizard.g:1024:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWizard.g:1030:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalWizard.g:1031:2: (kw= 'true' | kw= 'false' )
            {
            // InternalWizard.g:1031:2: (kw= 'true' | kw= 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            else if ( (LA19_0==23) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalWizard.g:1032:3: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalWizard.g:1038:3: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});

}