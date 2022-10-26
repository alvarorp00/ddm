package orders.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import orders.services.OrdersGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOrdersParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Stock:'", "'Orders:'", "'{'", "','", "'}'", "'to'", "'paying'", "'('", "'each'", "')'", "'-'", "'.'", "'E'", "'e'"
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
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOrdersParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOrdersParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOrdersParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOrders.g"; }



     	private OrdersGrammarAccess grammarAccess;

        public InternalOrdersParser(TokenStream input, OrdersGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ECommerce";
       	}

       	@Override
       	protected OrdersGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleECommerce"
    // InternalOrders.g:64:1: entryRuleECommerce returns [EObject current=null] : iv_ruleECommerce= ruleECommerce EOF ;
    public final EObject entryRuleECommerce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECommerce = null;


        try {
            // InternalOrders.g:64:50: (iv_ruleECommerce= ruleECommerce EOF )
            // InternalOrders.g:65:2: iv_ruleECommerce= ruleECommerce EOF
            {
             newCompositeNode(grammarAccess.getECommerceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECommerce=ruleECommerce();

            state._fsp--;

             current =iv_ruleECommerce; 
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
    // $ANTLR end "entryRuleECommerce"


    // $ANTLR start "ruleECommerce"
    // InternalOrders.g:71:1: ruleECommerce returns [EObject current=null] : ( () otherlv_1= 'Stock:' ( (lv_stock_2_0= ruleItem ) )+ otherlv_3= 'Orders:' ( (lv_orders_4_0= rulePurchaseOrder ) )+ ) ;
    public final EObject ruleECommerce() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stock_2_0 = null;

        EObject lv_orders_4_0 = null;



        	enterRule();

        try {
            // InternalOrders.g:77:2: ( ( () otherlv_1= 'Stock:' ( (lv_stock_2_0= ruleItem ) )+ otherlv_3= 'Orders:' ( (lv_orders_4_0= rulePurchaseOrder ) )+ ) )
            // InternalOrders.g:78:2: ( () otherlv_1= 'Stock:' ( (lv_stock_2_0= ruleItem ) )+ otherlv_3= 'Orders:' ( (lv_orders_4_0= rulePurchaseOrder ) )+ )
            {
            // InternalOrders.g:78:2: ( () otherlv_1= 'Stock:' ( (lv_stock_2_0= ruleItem ) )+ otherlv_3= 'Orders:' ( (lv_orders_4_0= rulePurchaseOrder ) )+ )
            // InternalOrders.g:79:3: () otherlv_1= 'Stock:' ( (lv_stock_2_0= ruleItem ) )+ otherlv_3= 'Orders:' ( (lv_orders_4_0= rulePurchaseOrder ) )+
            {
            // InternalOrders.g:79:3: ()
            // InternalOrders.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECommerceAccess().getEcommerceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getECommerceAccess().getStockKeyword_1());
            		
            // InternalOrders.g:90:3: ( (lv_stock_2_0= ruleItem ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOrders.g:91:4: (lv_stock_2_0= ruleItem )
            	    {
            	    // InternalOrders.g:91:4: (lv_stock_2_0= ruleItem )
            	    // InternalOrders.g:92:5: lv_stock_2_0= ruleItem
            	    {

            	    					newCompositeNode(grammarAccess.getECommerceAccess().getStockItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_stock_2_0=ruleItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getECommerceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stock",
            	    						lv_stock_2_0,
            	    						"orders.Orders.Item");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getECommerceAccess().getOrdersKeyword_3());
            		
            // InternalOrders.g:113:3: ( (lv_orders_4_0= rulePurchaseOrder ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOrders.g:114:4: (lv_orders_4_0= rulePurchaseOrder )
            	    {
            	    // InternalOrders.g:114:4: (lv_orders_4_0= rulePurchaseOrder )
            	    // InternalOrders.g:115:5: lv_orders_4_0= rulePurchaseOrder
            	    {

            	    					newCompositeNode(grammarAccess.getECommerceAccess().getOrdersPurchaseOrderParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_orders_4_0=rulePurchaseOrder();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getECommerceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"orders",
            	    						lv_orders_4_0,
            	    						"orders.Orders.PurchaseOrder");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


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
    // $ANTLR end "ruleECommerce"


    // $ANTLR start "entryRulePurchaseOrder"
    // InternalOrders.g:136:1: entryRulePurchaseOrder returns [EObject current=null] : iv_rulePurchaseOrder= rulePurchaseOrder EOF ;
    public final EObject entryRulePurchaseOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePurchaseOrder = null;


        try {
            // InternalOrders.g:136:54: (iv_rulePurchaseOrder= rulePurchaseOrder EOF )
            // InternalOrders.g:137:2: iv_rulePurchaseOrder= rulePurchaseOrder EOF
            {
             newCompositeNode(grammarAccess.getPurchaseOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePurchaseOrder=rulePurchaseOrder();

            state._fsp--;

             current =iv_rulePurchaseOrder; 
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
    // $ANTLR end "entryRulePurchaseOrder"


    // $ANTLR start "rulePurchaseOrder"
    // InternalOrders.g:143:1: rulePurchaseOrder returns [EObject current=null] : (otherlv_0= '{' ( (lv_lines_1_0= ruleOrderLine ) ) (otherlv_2= ',' ( (lv_lines_3_0= ruleOrderLine ) ) )* otherlv_4= '}' otherlv_5= 'to' ( (lv_shipTo_6_0= ruleEString ) ) otherlv_7= 'paying' ( (lv_billTo_8_0= ruleEString ) ) ) ;
    public final EObject rulePurchaseOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_lines_1_0 = null;

        EObject lv_lines_3_0 = null;

        AntlrDatatypeRuleToken lv_shipTo_6_0 = null;

        AntlrDatatypeRuleToken lv_billTo_8_0 = null;



        	enterRule();

        try {
            // InternalOrders.g:149:2: ( (otherlv_0= '{' ( (lv_lines_1_0= ruleOrderLine ) ) (otherlv_2= ',' ( (lv_lines_3_0= ruleOrderLine ) ) )* otherlv_4= '}' otherlv_5= 'to' ( (lv_shipTo_6_0= ruleEString ) ) otherlv_7= 'paying' ( (lv_billTo_8_0= ruleEString ) ) ) )
            // InternalOrders.g:150:2: (otherlv_0= '{' ( (lv_lines_1_0= ruleOrderLine ) ) (otherlv_2= ',' ( (lv_lines_3_0= ruleOrderLine ) ) )* otherlv_4= '}' otherlv_5= 'to' ( (lv_shipTo_6_0= ruleEString ) ) otherlv_7= 'paying' ( (lv_billTo_8_0= ruleEString ) ) )
            {
            // InternalOrders.g:150:2: (otherlv_0= '{' ( (lv_lines_1_0= ruleOrderLine ) ) (otherlv_2= ',' ( (lv_lines_3_0= ruleOrderLine ) ) )* otherlv_4= '}' otherlv_5= 'to' ( (lv_shipTo_6_0= ruleEString ) ) otherlv_7= 'paying' ( (lv_billTo_8_0= ruleEString ) ) )
            // InternalOrders.g:151:3: otherlv_0= '{' ( (lv_lines_1_0= ruleOrderLine ) ) (otherlv_2= ',' ( (lv_lines_3_0= ruleOrderLine ) ) )* otherlv_4= '}' otherlv_5= 'to' ( (lv_shipTo_6_0= ruleEString ) ) otherlv_7= 'paying' ( (lv_billTo_8_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPurchaseOrderAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalOrders.g:155:3: ( (lv_lines_1_0= ruleOrderLine ) )
            // InternalOrders.g:156:4: (lv_lines_1_0= ruleOrderLine )
            {
            // InternalOrders.g:156:4: (lv_lines_1_0= ruleOrderLine )
            // InternalOrders.g:157:5: lv_lines_1_0= ruleOrderLine
            {

            					newCompositeNode(grammarAccess.getPurchaseOrderAccess().getLinesOrderLineParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_lines_1_0=ruleOrderLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPurchaseOrderRule());
            					}
            					add(
            						current,
            						"lines",
            						lv_lines_1_0,
            						"orders.Orders.OrderLine");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrders.g:174:3: (otherlv_2= ',' ( (lv_lines_3_0= ruleOrderLine ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOrders.g:175:4: otherlv_2= ',' ( (lv_lines_3_0= ruleOrderLine ) )
            	    {
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getPurchaseOrderAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOrders.g:179:4: ( (lv_lines_3_0= ruleOrderLine ) )
            	    // InternalOrders.g:180:5: (lv_lines_3_0= ruleOrderLine )
            	    {
            	    // InternalOrders.g:180:5: (lv_lines_3_0= ruleOrderLine )
            	    // InternalOrders.g:181:6: lv_lines_3_0= ruleOrderLine
            	    {

            	    						newCompositeNode(grammarAccess.getPurchaseOrderAccess().getLinesOrderLineParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_lines_3_0=ruleOrderLine();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPurchaseOrderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lines",
            	    							lv_lines_3_0,
            	    							"orders.Orders.OrderLine");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPurchaseOrderAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getPurchaseOrderAccess().getToKeyword_4());
            		
            // InternalOrders.g:207:3: ( (lv_shipTo_6_0= ruleEString ) )
            // InternalOrders.g:208:4: (lv_shipTo_6_0= ruleEString )
            {
            // InternalOrders.g:208:4: (lv_shipTo_6_0= ruleEString )
            // InternalOrders.g:209:5: lv_shipTo_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPurchaseOrderAccess().getShipToEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_shipTo_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPurchaseOrderRule());
            					}
            					set(
            						current,
            						"shipTo",
            						lv_shipTo_6_0,
            						"orders.Orders.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getPurchaseOrderAccess().getPayingKeyword_6());
            		
            // InternalOrders.g:230:3: ( (lv_billTo_8_0= ruleEString ) )
            // InternalOrders.g:231:4: (lv_billTo_8_0= ruleEString )
            {
            // InternalOrders.g:231:4: (lv_billTo_8_0= ruleEString )
            // InternalOrders.g:232:5: lv_billTo_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPurchaseOrderAccess().getBillToEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_billTo_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPurchaseOrderRule());
            					}
            					set(
            						current,
            						"billTo",
            						lv_billTo_8_0,
            						"orders.Orders.EString");
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
    // $ANTLR end "rulePurchaseOrder"


    // $ANTLR start "entryRuleItem"
    // InternalOrders.g:253:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // InternalOrders.g:253:45: (iv_ruleItem= ruleItem EOF )
            // InternalOrders.g:254:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalOrders.g:260:1: ruleItem returns [EObject current=null] : ( ( (lv_stock_0_0= ruleEInt ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'each' otherlv_5= ')' ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_stock_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_price_3_0 = null;



        	enterRule();

        try {
            // InternalOrders.g:266:2: ( ( ( (lv_stock_0_0= ruleEInt ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'each' otherlv_5= ')' ) )
            // InternalOrders.g:267:2: ( ( (lv_stock_0_0= ruleEInt ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'each' otherlv_5= ')' )
            {
            // InternalOrders.g:267:2: ( ( (lv_stock_0_0= ruleEInt ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'each' otherlv_5= ')' )
            // InternalOrders.g:268:3: ( (lv_stock_0_0= ruleEInt ) ) ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'each' otherlv_5= ')'
            {
            // InternalOrders.g:268:3: ( (lv_stock_0_0= ruleEInt ) )
            // InternalOrders.g:269:4: (lv_stock_0_0= ruleEInt )
            {
            // InternalOrders.g:269:4: (lv_stock_0_0= ruleEInt )
            // InternalOrders.g:270:5: lv_stock_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getItemAccess().getStockEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_stock_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"stock",
            						lv_stock_0_0,
            						"orders.Orders.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrders.g:287:3: ( (lv_name_1_0= ruleEString ) )
            // InternalOrders.g:288:4: (lv_name_1_0= ruleEString )
            {
            // InternalOrders.g:288:4: (lv_name_1_0= ruleEString )
            // InternalOrders.g:289:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getItemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"orders.Orders.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getItemAccess().getLeftParenthesisKeyword_2());
            		
            // InternalOrders.g:310:3: ( (lv_price_3_0= ruleEFloat ) )
            // InternalOrders.g:311:4: (lv_price_3_0= ruleEFloat )
            {
            // InternalOrders.g:311:4: (lv_price_3_0= ruleEFloat )
            // InternalOrders.g:312:5: lv_price_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getItemAccess().getPriceEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_price_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItemRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_3_0,
            						"orders.Orders.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getItemAccess().getEachKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getItemAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleOrderLine"
    // InternalOrders.g:341:1: entryRuleOrderLine returns [EObject current=null] : iv_ruleOrderLine= ruleOrderLine EOF ;
    public final EObject entryRuleOrderLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrderLine = null;


        try {
            // InternalOrders.g:341:50: (iv_ruleOrderLine= ruleOrderLine EOF )
            // InternalOrders.g:342:2: iv_ruleOrderLine= ruleOrderLine EOF
            {
             newCompositeNode(grammarAccess.getOrderLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrderLine=ruleOrderLine();

            state._fsp--;

             current =iv_ruleOrderLine; 
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
    // $ANTLR end "entryRuleOrderLine"


    // $ANTLR start "ruleOrderLine"
    // InternalOrders.g:348:1: ruleOrderLine returns [EObject current=null] : ( ( (lv_quantity_0_0= ruleEInt ) ) ( ( ruleEString ) ) ) ;
    public final EObject ruleOrderLine() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_quantity_0_0 = null;



        	enterRule();

        try {
            // InternalOrders.g:354:2: ( ( ( (lv_quantity_0_0= ruleEInt ) ) ( ( ruleEString ) ) ) )
            // InternalOrders.g:355:2: ( ( (lv_quantity_0_0= ruleEInt ) ) ( ( ruleEString ) ) )
            {
            // InternalOrders.g:355:2: ( ( (lv_quantity_0_0= ruleEInt ) ) ( ( ruleEString ) ) )
            // InternalOrders.g:356:3: ( (lv_quantity_0_0= ruleEInt ) ) ( ( ruleEString ) )
            {
            // InternalOrders.g:356:3: ( (lv_quantity_0_0= ruleEInt ) )
            // InternalOrders.g:357:4: (lv_quantity_0_0= ruleEInt )
            {
            // InternalOrders.g:357:4: (lv_quantity_0_0= ruleEInt )
            // InternalOrders.g:358:5: lv_quantity_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getOrderLineAccess().getQuantityEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_quantity_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderLineRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_0_0,
            						"orders.Orders.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOrders.g:375:3: ( ( ruleEString ) )
            // InternalOrders.g:376:4: ( ruleEString )
            {
            // InternalOrders.g:376:4: ( ruleEString )
            // InternalOrders.g:377:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderLineRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOrderLineAccess().getItemItemCrossReference_1_0());
            				
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
    // $ANTLR end "ruleOrderLine"


    // $ANTLR start "entryRuleEString"
    // InternalOrders.g:395:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOrders.g:395:47: (iv_ruleEString= ruleEString EOF )
            // InternalOrders.g:396:2: iv_ruleEString= ruleEString EOF
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
    // InternalOrders.g:402:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalOrders.g:408:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalOrders.g:409:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalOrders.g:409:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOrders.g:410:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOrders.g:418:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalOrders.g:429:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalOrders.g:429:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalOrders.g:430:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalOrders.g:436:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalOrders.g:442:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalOrders.g:443:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalOrders.g:443:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalOrders.g:444:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalOrders.g:444:3: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOrders.g:445:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_15); 

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


    // $ANTLR start "entryRuleEFloat"
    // InternalOrders.g:462:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalOrders.g:462:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalOrders.g:463:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalOrders.g:469:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalOrders.g:475:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalOrders.g:476:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalOrders.g:476:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalOrders.g:477:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalOrders.g:477:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOrders.g:478:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalOrders.g:484:3: (this_INT_1= RULE_INT )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOrders.g:485:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_17); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,22,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_18); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalOrders.g:505:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOrders.g:506:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalOrders.g:506:4: (kw= 'E' | kw= 'e' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==23) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==24) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalOrders.g:507:5: kw= 'E'
                            {
                            kw=(Token)match(input,23,FOLLOW_3); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalOrders.g:513:5: kw= 'e'
                            {
                            kw=(Token)match(input,24,FOLLOW_3); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalOrders.g:519:4: (kw= '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==21) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalOrders.g:520:5: kw= '-'
                            {
                            kw=(Token)match(input,21,FOLLOW_15); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEFloat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000201040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800002L});

}