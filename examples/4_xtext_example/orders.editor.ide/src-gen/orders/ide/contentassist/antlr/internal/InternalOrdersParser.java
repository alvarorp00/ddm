package orders.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import orders.services.OrdersGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOrdersParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Stock:'", "'Orders:'", "'{'", "'}'", "'to'", "'paying'", "','", "'('", "'each'", "')'", "'-'", "'.'"
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

    	public void setGrammarAccess(OrdersGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleECommerce"
    // InternalOrders.g:53:1: entryRuleECommerce : ruleECommerce EOF ;
    public final void entryRuleECommerce() throws RecognitionException {
        try {
            // InternalOrders.g:54:1: ( ruleECommerce EOF )
            // InternalOrders.g:55:1: ruleECommerce EOF
            {
             before(grammarAccess.getECommerceRule()); 
            pushFollow(FOLLOW_1);
            ruleECommerce();

            state._fsp--;

             after(grammarAccess.getECommerceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleECommerce"


    // $ANTLR start "ruleECommerce"
    // InternalOrders.g:62:1: ruleECommerce : ( ( rule__ECommerce__Group__0 ) ) ;
    public final void ruleECommerce() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:66:2: ( ( ( rule__ECommerce__Group__0 ) ) )
            // InternalOrders.g:67:2: ( ( rule__ECommerce__Group__0 ) )
            {
            // InternalOrders.g:67:2: ( ( rule__ECommerce__Group__0 ) )
            // InternalOrders.g:68:3: ( rule__ECommerce__Group__0 )
            {
             before(grammarAccess.getECommerceAccess().getGroup()); 
            // InternalOrders.g:69:3: ( rule__ECommerce__Group__0 )
            // InternalOrders.g:69:4: rule__ECommerce__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ECommerce__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getECommerceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleECommerce"


    // $ANTLR start "entryRulePurchaseOrder"
    // InternalOrders.g:78:1: entryRulePurchaseOrder : rulePurchaseOrder EOF ;
    public final void entryRulePurchaseOrder() throws RecognitionException {
        try {
            // InternalOrders.g:79:1: ( rulePurchaseOrder EOF )
            // InternalOrders.g:80:1: rulePurchaseOrder EOF
            {
             before(grammarAccess.getPurchaseOrderRule()); 
            pushFollow(FOLLOW_1);
            rulePurchaseOrder();

            state._fsp--;

             after(grammarAccess.getPurchaseOrderRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePurchaseOrder"


    // $ANTLR start "rulePurchaseOrder"
    // InternalOrders.g:87:1: rulePurchaseOrder : ( ( rule__PurchaseOrder__Group__0 ) ) ;
    public final void rulePurchaseOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:91:2: ( ( ( rule__PurchaseOrder__Group__0 ) ) )
            // InternalOrders.g:92:2: ( ( rule__PurchaseOrder__Group__0 ) )
            {
            // InternalOrders.g:92:2: ( ( rule__PurchaseOrder__Group__0 ) )
            // InternalOrders.g:93:3: ( rule__PurchaseOrder__Group__0 )
            {
             before(grammarAccess.getPurchaseOrderAccess().getGroup()); 
            // InternalOrders.g:94:3: ( rule__PurchaseOrder__Group__0 )
            // InternalOrders.g:94:4: rule__PurchaseOrder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPurchaseOrderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePurchaseOrder"


    // $ANTLR start "entryRuleItem"
    // InternalOrders.g:103:1: entryRuleItem : ruleItem EOF ;
    public final void entryRuleItem() throws RecognitionException {
        try {
            // InternalOrders.g:104:1: ( ruleItem EOF )
            // InternalOrders.g:105:1: ruleItem EOF
            {
             before(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_1);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // InternalOrders.g:112:1: ruleItem : ( ( rule__Item__Group__0 ) ) ;
    public final void ruleItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:116:2: ( ( ( rule__Item__Group__0 ) ) )
            // InternalOrders.g:117:2: ( ( rule__Item__Group__0 ) )
            {
            // InternalOrders.g:117:2: ( ( rule__Item__Group__0 ) )
            // InternalOrders.g:118:3: ( rule__Item__Group__0 )
            {
             before(grammarAccess.getItemAccess().getGroup()); 
            // InternalOrders.g:119:3: ( rule__Item__Group__0 )
            // InternalOrders.g:119:4: rule__Item__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleOrderLine"
    // InternalOrders.g:128:1: entryRuleOrderLine : ruleOrderLine EOF ;
    public final void entryRuleOrderLine() throws RecognitionException {
        try {
            // InternalOrders.g:129:1: ( ruleOrderLine EOF )
            // InternalOrders.g:130:1: ruleOrderLine EOF
            {
             before(grammarAccess.getOrderLineRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderLine();

            state._fsp--;

             after(grammarAccess.getOrderLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderLine"


    // $ANTLR start "ruleOrderLine"
    // InternalOrders.g:137:1: ruleOrderLine : ( ( rule__OrderLine__Group__0 ) ) ;
    public final void ruleOrderLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:141:2: ( ( ( rule__OrderLine__Group__0 ) ) )
            // InternalOrders.g:142:2: ( ( rule__OrderLine__Group__0 ) )
            {
            // InternalOrders.g:142:2: ( ( rule__OrderLine__Group__0 ) )
            // InternalOrders.g:143:3: ( rule__OrderLine__Group__0 )
            {
             before(grammarAccess.getOrderLineAccess().getGroup()); 
            // InternalOrders.g:144:3: ( rule__OrderLine__Group__0 )
            // InternalOrders.g:144:4: rule__OrderLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderLine"


    // $ANTLR start "entryRuleEString"
    // InternalOrders.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOrders.g:154:1: ( ruleEString EOF )
            // InternalOrders.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOrders.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOrders.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalOrders.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalOrders.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOrders.g:169:3: ( rule__EString__Alternatives )
            // InternalOrders.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalOrders.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalOrders.g:179:1: ( ruleEInt EOF )
            // InternalOrders.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalOrders.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalOrders.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalOrders.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalOrders.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalOrders.g:194:3: ( rule__EInt__Group__0 )
            // InternalOrders.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalOrders.g:203:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalOrders.g:204:1: ( ruleEFloat EOF )
            // InternalOrders.g:205:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalOrders.g:212:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:216:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalOrders.g:217:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalOrders.g:217:2: ( ( rule__EFloat__Group__0 ) )
            // InternalOrders.g:218:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalOrders.g:219:3: ( rule__EFloat__Group__0 )
            // InternalOrders.g:219:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalOrders.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOrders.g:232:2: ( RULE_STRING )
                    {
                    // InternalOrders.g:232:2: ( RULE_STRING )
                    // InternalOrders.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrders.g:238:2: ( RULE_ID )
                    {
                    // InternalOrders.g:238:2: ( RULE_ID )
                    // InternalOrders.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalOrders.g:248:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:252:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOrders.g:253:2: ( 'E' )
                    {
                    // InternalOrders.g:253:2: ( 'E' )
                    // InternalOrders.g:254:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOrders.g:259:2: ( 'e' )
                    {
                    // InternalOrders.g:259:2: ( 'e' )
                    // InternalOrders.g:260:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__ECommerce__Group__0"
    // InternalOrders.g:269:1: rule__ECommerce__Group__0 : rule__ECommerce__Group__0__Impl rule__ECommerce__Group__1 ;
    public final void rule__ECommerce__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:273:1: ( rule__ECommerce__Group__0__Impl rule__ECommerce__Group__1 )
            // InternalOrders.g:274:2: rule__ECommerce__Group__0__Impl rule__ECommerce__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ECommerce__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ECommerce__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__0"


    // $ANTLR start "rule__ECommerce__Group__0__Impl"
    // InternalOrders.g:281:1: rule__ECommerce__Group__0__Impl : ( () ) ;
    public final void rule__ECommerce__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:285:1: ( ( () ) )
            // InternalOrders.g:286:1: ( () )
            {
            // InternalOrders.g:286:1: ( () )
            // InternalOrders.g:287:2: ()
            {
             before(grammarAccess.getECommerceAccess().getEcommerceAction_0()); 
            // InternalOrders.g:288:2: ()
            // InternalOrders.g:288:3: 
            {
            }

             after(grammarAccess.getECommerceAccess().getEcommerceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__0__Impl"


    // $ANTLR start "rule__ECommerce__Group__1"
    // InternalOrders.g:296:1: rule__ECommerce__Group__1 : rule__ECommerce__Group__1__Impl rule__ECommerce__Group__2 ;
    public final void rule__ECommerce__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:300:1: ( rule__ECommerce__Group__1__Impl rule__ECommerce__Group__2 )
            // InternalOrders.g:301:2: rule__ECommerce__Group__1__Impl rule__ECommerce__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ECommerce__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ECommerce__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__1"


    // $ANTLR start "rule__ECommerce__Group__1__Impl"
    // InternalOrders.g:308:1: rule__ECommerce__Group__1__Impl : ( 'Stock:' ) ;
    public final void rule__ECommerce__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:312:1: ( ( 'Stock:' ) )
            // InternalOrders.g:313:1: ( 'Stock:' )
            {
            // InternalOrders.g:313:1: ( 'Stock:' )
            // InternalOrders.g:314:2: 'Stock:'
            {
             before(grammarAccess.getECommerceAccess().getStockKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getECommerceAccess().getStockKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__1__Impl"


    // $ANTLR start "rule__ECommerce__Group__2"
    // InternalOrders.g:323:1: rule__ECommerce__Group__2 : rule__ECommerce__Group__2__Impl rule__ECommerce__Group__3 ;
    public final void rule__ECommerce__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:327:1: ( rule__ECommerce__Group__2__Impl rule__ECommerce__Group__3 )
            // InternalOrders.g:328:2: rule__ECommerce__Group__2__Impl rule__ECommerce__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ECommerce__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ECommerce__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__2"


    // $ANTLR start "rule__ECommerce__Group__2__Impl"
    // InternalOrders.g:335:1: rule__ECommerce__Group__2__Impl : ( ( ( rule__ECommerce__StockAssignment_2 ) ) ( ( rule__ECommerce__StockAssignment_2 )* ) ) ;
    public final void rule__ECommerce__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:339:1: ( ( ( ( rule__ECommerce__StockAssignment_2 ) ) ( ( rule__ECommerce__StockAssignment_2 )* ) ) )
            // InternalOrders.g:340:1: ( ( ( rule__ECommerce__StockAssignment_2 ) ) ( ( rule__ECommerce__StockAssignment_2 )* ) )
            {
            // InternalOrders.g:340:1: ( ( ( rule__ECommerce__StockAssignment_2 ) ) ( ( rule__ECommerce__StockAssignment_2 )* ) )
            // InternalOrders.g:341:2: ( ( rule__ECommerce__StockAssignment_2 ) ) ( ( rule__ECommerce__StockAssignment_2 )* )
            {
            // InternalOrders.g:341:2: ( ( rule__ECommerce__StockAssignment_2 ) )
            // InternalOrders.g:342:3: ( rule__ECommerce__StockAssignment_2 )
            {
             before(grammarAccess.getECommerceAccess().getStockAssignment_2()); 
            // InternalOrders.g:343:3: ( rule__ECommerce__StockAssignment_2 )
            // InternalOrders.g:343:4: rule__ECommerce__StockAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__ECommerce__StockAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getECommerceAccess().getStockAssignment_2()); 

            }

            // InternalOrders.g:346:2: ( ( rule__ECommerce__StockAssignment_2 )* )
            // InternalOrders.g:347:3: ( rule__ECommerce__StockAssignment_2 )*
            {
             before(grammarAccess.getECommerceAccess().getStockAssignment_2()); 
            // InternalOrders.g:348:3: ( rule__ECommerce__StockAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOrders.g:348:4: rule__ECommerce__StockAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ECommerce__StockAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getECommerceAccess().getStockAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__2__Impl"


    // $ANTLR start "rule__ECommerce__Group__3"
    // InternalOrders.g:357:1: rule__ECommerce__Group__3 : rule__ECommerce__Group__3__Impl rule__ECommerce__Group__4 ;
    public final void rule__ECommerce__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:361:1: ( rule__ECommerce__Group__3__Impl rule__ECommerce__Group__4 )
            // InternalOrders.g:362:2: rule__ECommerce__Group__3__Impl rule__ECommerce__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ECommerce__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ECommerce__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__3"


    // $ANTLR start "rule__ECommerce__Group__3__Impl"
    // InternalOrders.g:369:1: rule__ECommerce__Group__3__Impl : ( 'Orders:' ) ;
    public final void rule__ECommerce__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:373:1: ( ( 'Orders:' ) )
            // InternalOrders.g:374:1: ( 'Orders:' )
            {
            // InternalOrders.g:374:1: ( 'Orders:' )
            // InternalOrders.g:375:2: 'Orders:'
            {
             before(grammarAccess.getECommerceAccess().getOrdersKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getECommerceAccess().getOrdersKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__3__Impl"


    // $ANTLR start "rule__ECommerce__Group__4"
    // InternalOrders.g:384:1: rule__ECommerce__Group__4 : rule__ECommerce__Group__4__Impl ;
    public final void rule__ECommerce__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:388:1: ( rule__ECommerce__Group__4__Impl )
            // InternalOrders.g:389:2: rule__ECommerce__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ECommerce__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__4"


    // $ANTLR start "rule__ECommerce__Group__4__Impl"
    // InternalOrders.g:395:1: rule__ECommerce__Group__4__Impl : ( ( ( rule__ECommerce__OrdersAssignment_4 ) ) ( ( rule__ECommerce__OrdersAssignment_4 )* ) ) ;
    public final void rule__ECommerce__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:399:1: ( ( ( ( rule__ECommerce__OrdersAssignment_4 ) ) ( ( rule__ECommerce__OrdersAssignment_4 )* ) ) )
            // InternalOrders.g:400:1: ( ( ( rule__ECommerce__OrdersAssignment_4 ) ) ( ( rule__ECommerce__OrdersAssignment_4 )* ) )
            {
            // InternalOrders.g:400:1: ( ( ( rule__ECommerce__OrdersAssignment_4 ) ) ( ( rule__ECommerce__OrdersAssignment_4 )* ) )
            // InternalOrders.g:401:2: ( ( rule__ECommerce__OrdersAssignment_4 ) ) ( ( rule__ECommerce__OrdersAssignment_4 )* )
            {
            // InternalOrders.g:401:2: ( ( rule__ECommerce__OrdersAssignment_4 ) )
            // InternalOrders.g:402:3: ( rule__ECommerce__OrdersAssignment_4 )
            {
             before(grammarAccess.getECommerceAccess().getOrdersAssignment_4()); 
            // InternalOrders.g:403:3: ( rule__ECommerce__OrdersAssignment_4 )
            // InternalOrders.g:403:4: rule__ECommerce__OrdersAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__ECommerce__OrdersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getECommerceAccess().getOrdersAssignment_4()); 

            }

            // InternalOrders.g:406:2: ( ( rule__ECommerce__OrdersAssignment_4 )* )
            // InternalOrders.g:407:3: ( rule__ECommerce__OrdersAssignment_4 )*
            {
             before(grammarAccess.getECommerceAccess().getOrdersAssignment_4()); 
            // InternalOrders.g:408:3: ( rule__ECommerce__OrdersAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOrders.g:408:4: rule__ECommerce__OrdersAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ECommerce__OrdersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getECommerceAccess().getOrdersAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__Group__4__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__0"
    // InternalOrders.g:418:1: rule__PurchaseOrder__Group__0 : rule__PurchaseOrder__Group__0__Impl rule__PurchaseOrder__Group__1 ;
    public final void rule__PurchaseOrder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:422:1: ( rule__PurchaseOrder__Group__0__Impl rule__PurchaseOrder__Group__1 )
            // InternalOrders.g:423:2: rule__PurchaseOrder__Group__0__Impl rule__PurchaseOrder__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PurchaseOrder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__0"


    // $ANTLR start "rule__PurchaseOrder__Group__0__Impl"
    // InternalOrders.g:430:1: rule__PurchaseOrder__Group__0__Impl : ( '{' ) ;
    public final void rule__PurchaseOrder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:434:1: ( ( '{' ) )
            // InternalOrders.g:435:1: ( '{' )
            {
            // InternalOrders.g:435:1: ( '{' )
            // InternalOrders.g:436:2: '{'
            {
             before(grammarAccess.getPurchaseOrderAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPurchaseOrderAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__0__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__1"
    // InternalOrders.g:445:1: rule__PurchaseOrder__Group__1 : rule__PurchaseOrder__Group__1__Impl rule__PurchaseOrder__Group__2 ;
    public final void rule__PurchaseOrder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:449:1: ( rule__PurchaseOrder__Group__1__Impl rule__PurchaseOrder__Group__2 )
            // InternalOrders.g:450:2: rule__PurchaseOrder__Group__1__Impl rule__PurchaseOrder__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PurchaseOrder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__1"


    // $ANTLR start "rule__PurchaseOrder__Group__1__Impl"
    // InternalOrders.g:457:1: rule__PurchaseOrder__Group__1__Impl : ( ( rule__PurchaseOrder__LinesAssignment_1 ) ) ;
    public final void rule__PurchaseOrder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:461:1: ( ( ( rule__PurchaseOrder__LinesAssignment_1 ) ) )
            // InternalOrders.g:462:1: ( ( rule__PurchaseOrder__LinesAssignment_1 ) )
            {
            // InternalOrders.g:462:1: ( ( rule__PurchaseOrder__LinesAssignment_1 ) )
            // InternalOrders.g:463:2: ( rule__PurchaseOrder__LinesAssignment_1 )
            {
             before(grammarAccess.getPurchaseOrderAccess().getLinesAssignment_1()); 
            // InternalOrders.g:464:2: ( rule__PurchaseOrder__LinesAssignment_1 )
            // InternalOrders.g:464:3: rule__PurchaseOrder__LinesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__LinesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPurchaseOrderAccess().getLinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__1__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__2"
    // InternalOrders.g:472:1: rule__PurchaseOrder__Group__2 : rule__PurchaseOrder__Group__2__Impl rule__PurchaseOrder__Group__3 ;
    public final void rule__PurchaseOrder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:476:1: ( rule__PurchaseOrder__Group__2__Impl rule__PurchaseOrder__Group__3 )
            // InternalOrders.g:477:2: rule__PurchaseOrder__Group__2__Impl rule__PurchaseOrder__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__PurchaseOrder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__2"


    // $ANTLR start "rule__PurchaseOrder__Group__2__Impl"
    // InternalOrders.g:484:1: rule__PurchaseOrder__Group__2__Impl : ( ( rule__PurchaseOrder__Group_2__0 )* ) ;
    public final void rule__PurchaseOrder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:488:1: ( ( ( rule__PurchaseOrder__Group_2__0 )* ) )
            // InternalOrders.g:489:1: ( ( rule__PurchaseOrder__Group_2__0 )* )
            {
            // InternalOrders.g:489:1: ( ( rule__PurchaseOrder__Group_2__0 )* )
            // InternalOrders.g:490:2: ( rule__PurchaseOrder__Group_2__0 )*
            {
             before(grammarAccess.getPurchaseOrderAccess().getGroup_2()); 
            // InternalOrders.g:491:2: ( rule__PurchaseOrder__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOrders.g:491:3: rule__PurchaseOrder__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PurchaseOrder__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPurchaseOrderAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__2__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__3"
    // InternalOrders.g:499:1: rule__PurchaseOrder__Group__3 : rule__PurchaseOrder__Group__3__Impl rule__PurchaseOrder__Group__4 ;
    public final void rule__PurchaseOrder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:503:1: ( rule__PurchaseOrder__Group__3__Impl rule__PurchaseOrder__Group__4 )
            // InternalOrders.g:504:2: rule__PurchaseOrder__Group__3__Impl rule__PurchaseOrder__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__PurchaseOrder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__3"


    // $ANTLR start "rule__PurchaseOrder__Group__3__Impl"
    // InternalOrders.g:511:1: rule__PurchaseOrder__Group__3__Impl : ( '}' ) ;
    public final void rule__PurchaseOrder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:515:1: ( ( '}' ) )
            // InternalOrders.g:516:1: ( '}' )
            {
            // InternalOrders.g:516:1: ( '}' )
            // InternalOrders.g:517:2: '}'
            {
             before(grammarAccess.getPurchaseOrderAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPurchaseOrderAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__3__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__4"
    // InternalOrders.g:526:1: rule__PurchaseOrder__Group__4 : rule__PurchaseOrder__Group__4__Impl rule__PurchaseOrder__Group__5 ;
    public final void rule__PurchaseOrder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:530:1: ( rule__PurchaseOrder__Group__4__Impl rule__PurchaseOrder__Group__5 )
            // InternalOrders.g:531:2: rule__PurchaseOrder__Group__4__Impl rule__PurchaseOrder__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__PurchaseOrder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__4"


    // $ANTLR start "rule__PurchaseOrder__Group__4__Impl"
    // InternalOrders.g:538:1: rule__PurchaseOrder__Group__4__Impl : ( 'to' ) ;
    public final void rule__PurchaseOrder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:542:1: ( ( 'to' ) )
            // InternalOrders.g:543:1: ( 'to' )
            {
            // InternalOrders.g:543:1: ( 'to' )
            // InternalOrders.g:544:2: 'to'
            {
             before(grammarAccess.getPurchaseOrderAccess().getToKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPurchaseOrderAccess().getToKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__4__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__5"
    // InternalOrders.g:553:1: rule__PurchaseOrder__Group__5 : rule__PurchaseOrder__Group__5__Impl rule__PurchaseOrder__Group__6 ;
    public final void rule__PurchaseOrder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:557:1: ( rule__PurchaseOrder__Group__5__Impl rule__PurchaseOrder__Group__6 )
            // InternalOrders.g:558:2: rule__PurchaseOrder__Group__5__Impl rule__PurchaseOrder__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__PurchaseOrder__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__5"


    // $ANTLR start "rule__PurchaseOrder__Group__5__Impl"
    // InternalOrders.g:565:1: rule__PurchaseOrder__Group__5__Impl : ( ( rule__PurchaseOrder__ShipToAssignment_5 ) ) ;
    public final void rule__PurchaseOrder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:569:1: ( ( ( rule__PurchaseOrder__ShipToAssignment_5 ) ) )
            // InternalOrders.g:570:1: ( ( rule__PurchaseOrder__ShipToAssignment_5 ) )
            {
            // InternalOrders.g:570:1: ( ( rule__PurchaseOrder__ShipToAssignment_5 ) )
            // InternalOrders.g:571:2: ( rule__PurchaseOrder__ShipToAssignment_5 )
            {
             before(grammarAccess.getPurchaseOrderAccess().getShipToAssignment_5()); 
            // InternalOrders.g:572:2: ( rule__PurchaseOrder__ShipToAssignment_5 )
            // InternalOrders.g:572:3: rule__PurchaseOrder__ShipToAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__ShipToAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPurchaseOrderAccess().getShipToAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__5__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__6"
    // InternalOrders.g:580:1: rule__PurchaseOrder__Group__6 : rule__PurchaseOrder__Group__6__Impl rule__PurchaseOrder__Group__7 ;
    public final void rule__PurchaseOrder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:584:1: ( rule__PurchaseOrder__Group__6__Impl rule__PurchaseOrder__Group__7 )
            // InternalOrders.g:585:2: rule__PurchaseOrder__Group__6__Impl rule__PurchaseOrder__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__PurchaseOrder__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__6"


    // $ANTLR start "rule__PurchaseOrder__Group__6__Impl"
    // InternalOrders.g:592:1: rule__PurchaseOrder__Group__6__Impl : ( 'paying' ) ;
    public final void rule__PurchaseOrder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:596:1: ( ( 'paying' ) )
            // InternalOrders.g:597:1: ( 'paying' )
            {
            // InternalOrders.g:597:1: ( 'paying' )
            // InternalOrders.g:598:2: 'paying'
            {
             before(grammarAccess.getPurchaseOrderAccess().getPayingKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPurchaseOrderAccess().getPayingKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__6__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group__7"
    // InternalOrders.g:607:1: rule__PurchaseOrder__Group__7 : rule__PurchaseOrder__Group__7__Impl ;
    public final void rule__PurchaseOrder__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:611:1: ( rule__PurchaseOrder__Group__7__Impl )
            // InternalOrders.g:612:2: rule__PurchaseOrder__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__7"


    // $ANTLR start "rule__PurchaseOrder__Group__7__Impl"
    // InternalOrders.g:618:1: rule__PurchaseOrder__Group__7__Impl : ( ( rule__PurchaseOrder__BillToAssignment_7 ) ) ;
    public final void rule__PurchaseOrder__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:622:1: ( ( ( rule__PurchaseOrder__BillToAssignment_7 ) ) )
            // InternalOrders.g:623:1: ( ( rule__PurchaseOrder__BillToAssignment_7 ) )
            {
            // InternalOrders.g:623:1: ( ( rule__PurchaseOrder__BillToAssignment_7 ) )
            // InternalOrders.g:624:2: ( rule__PurchaseOrder__BillToAssignment_7 )
            {
             before(grammarAccess.getPurchaseOrderAccess().getBillToAssignment_7()); 
            // InternalOrders.g:625:2: ( rule__PurchaseOrder__BillToAssignment_7 )
            // InternalOrders.g:625:3: rule__PurchaseOrder__BillToAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__BillToAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPurchaseOrderAccess().getBillToAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group__7__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group_2__0"
    // InternalOrders.g:634:1: rule__PurchaseOrder__Group_2__0 : rule__PurchaseOrder__Group_2__0__Impl rule__PurchaseOrder__Group_2__1 ;
    public final void rule__PurchaseOrder__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:638:1: ( rule__PurchaseOrder__Group_2__0__Impl rule__PurchaseOrder__Group_2__1 )
            // InternalOrders.g:639:2: rule__PurchaseOrder__Group_2__0__Impl rule__PurchaseOrder__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__PurchaseOrder__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group_2__0"


    // $ANTLR start "rule__PurchaseOrder__Group_2__0__Impl"
    // InternalOrders.g:646:1: rule__PurchaseOrder__Group_2__0__Impl : ( ',' ) ;
    public final void rule__PurchaseOrder__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:650:1: ( ( ',' ) )
            // InternalOrders.g:651:1: ( ',' )
            {
            // InternalOrders.g:651:1: ( ',' )
            // InternalOrders.g:652:2: ','
            {
             before(grammarAccess.getPurchaseOrderAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPurchaseOrderAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group_2__0__Impl"


    // $ANTLR start "rule__PurchaseOrder__Group_2__1"
    // InternalOrders.g:661:1: rule__PurchaseOrder__Group_2__1 : rule__PurchaseOrder__Group_2__1__Impl ;
    public final void rule__PurchaseOrder__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:665:1: ( rule__PurchaseOrder__Group_2__1__Impl )
            // InternalOrders.g:666:2: rule__PurchaseOrder__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group_2__1"


    // $ANTLR start "rule__PurchaseOrder__Group_2__1__Impl"
    // InternalOrders.g:672:1: rule__PurchaseOrder__Group_2__1__Impl : ( ( rule__PurchaseOrder__LinesAssignment_2_1 ) ) ;
    public final void rule__PurchaseOrder__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:676:1: ( ( ( rule__PurchaseOrder__LinesAssignment_2_1 ) ) )
            // InternalOrders.g:677:1: ( ( rule__PurchaseOrder__LinesAssignment_2_1 ) )
            {
            // InternalOrders.g:677:1: ( ( rule__PurchaseOrder__LinesAssignment_2_1 ) )
            // InternalOrders.g:678:2: ( rule__PurchaseOrder__LinesAssignment_2_1 )
            {
             before(grammarAccess.getPurchaseOrderAccess().getLinesAssignment_2_1()); 
            // InternalOrders.g:679:2: ( rule__PurchaseOrder__LinesAssignment_2_1 )
            // InternalOrders.g:679:3: rule__PurchaseOrder__LinesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PurchaseOrder__LinesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPurchaseOrderAccess().getLinesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__Group_2__1__Impl"


    // $ANTLR start "rule__Item__Group__0"
    // InternalOrders.g:688:1: rule__Item__Group__0 : rule__Item__Group__0__Impl rule__Item__Group__1 ;
    public final void rule__Item__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:692:1: ( rule__Item__Group__0__Impl rule__Item__Group__1 )
            // InternalOrders.g:693:2: rule__Item__Group__0__Impl rule__Item__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Item__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0"


    // $ANTLR start "rule__Item__Group__0__Impl"
    // InternalOrders.g:700:1: rule__Item__Group__0__Impl : ( ( rule__Item__StockAssignment_0 ) ) ;
    public final void rule__Item__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:704:1: ( ( ( rule__Item__StockAssignment_0 ) ) )
            // InternalOrders.g:705:1: ( ( rule__Item__StockAssignment_0 ) )
            {
            // InternalOrders.g:705:1: ( ( rule__Item__StockAssignment_0 ) )
            // InternalOrders.g:706:2: ( rule__Item__StockAssignment_0 )
            {
             before(grammarAccess.getItemAccess().getStockAssignment_0()); 
            // InternalOrders.g:707:2: ( rule__Item__StockAssignment_0 )
            // InternalOrders.g:707:3: rule__Item__StockAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Item__StockAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getStockAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__0__Impl"


    // $ANTLR start "rule__Item__Group__1"
    // InternalOrders.g:715:1: rule__Item__Group__1 : rule__Item__Group__1__Impl rule__Item__Group__2 ;
    public final void rule__Item__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:719:1: ( rule__Item__Group__1__Impl rule__Item__Group__2 )
            // InternalOrders.g:720:2: rule__Item__Group__1__Impl rule__Item__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Item__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1"


    // $ANTLR start "rule__Item__Group__1__Impl"
    // InternalOrders.g:727:1: rule__Item__Group__1__Impl : ( ( rule__Item__NameAssignment_1 ) ) ;
    public final void rule__Item__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:731:1: ( ( ( rule__Item__NameAssignment_1 ) ) )
            // InternalOrders.g:732:1: ( ( rule__Item__NameAssignment_1 ) )
            {
            // InternalOrders.g:732:1: ( ( rule__Item__NameAssignment_1 ) )
            // InternalOrders.g:733:2: ( rule__Item__NameAssignment_1 )
            {
             before(grammarAccess.getItemAccess().getNameAssignment_1()); 
            // InternalOrders.g:734:2: ( rule__Item__NameAssignment_1 )
            // InternalOrders.g:734:3: rule__Item__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Item__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__1__Impl"


    // $ANTLR start "rule__Item__Group__2"
    // InternalOrders.g:742:1: rule__Item__Group__2 : rule__Item__Group__2__Impl rule__Item__Group__3 ;
    public final void rule__Item__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:746:1: ( rule__Item__Group__2__Impl rule__Item__Group__3 )
            // InternalOrders.g:747:2: rule__Item__Group__2__Impl rule__Item__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Item__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2"


    // $ANTLR start "rule__Item__Group__2__Impl"
    // InternalOrders.g:754:1: rule__Item__Group__2__Impl : ( '(' ) ;
    public final void rule__Item__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:758:1: ( ( '(' ) )
            // InternalOrders.g:759:1: ( '(' )
            {
            // InternalOrders.g:759:1: ( '(' )
            // InternalOrders.g:760:2: '('
            {
             before(grammarAccess.getItemAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__2__Impl"


    // $ANTLR start "rule__Item__Group__3"
    // InternalOrders.g:769:1: rule__Item__Group__3 : rule__Item__Group__3__Impl rule__Item__Group__4 ;
    public final void rule__Item__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:773:1: ( rule__Item__Group__3__Impl rule__Item__Group__4 )
            // InternalOrders.g:774:2: rule__Item__Group__3__Impl rule__Item__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Item__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3"


    // $ANTLR start "rule__Item__Group__3__Impl"
    // InternalOrders.g:781:1: rule__Item__Group__3__Impl : ( ( rule__Item__PriceAssignment_3 ) ) ;
    public final void rule__Item__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:785:1: ( ( ( rule__Item__PriceAssignment_3 ) ) )
            // InternalOrders.g:786:1: ( ( rule__Item__PriceAssignment_3 ) )
            {
            // InternalOrders.g:786:1: ( ( rule__Item__PriceAssignment_3 ) )
            // InternalOrders.g:787:2: ( rule__Item__PriceAssignment_3 )
            {
             before(grammarAccess.getItemAccess().getPriceAssignment_3()); 
            // InternalOrders.g:788:2: ( rule__Item__PriceAssignment_3 )
            // InternalOrders.g:788:3: rule__Item__PriceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Item__PriceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItemAccess().getPriceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__3__Impl"


    // $ANTLR start "rule__Item__Group__4"
    // InternalOrders.g:796:1: rule__Item__Group__4 : rule__Item__Group__4__Impl rule__Item__Group__5 ;
    public final void rule__Item__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:800:1: ( rule__Item__Group__4__Impl rule__Item__Group__5 )
            // InternalOrders.g:801:2: rule__Item__Group__4__Impl rule__Item__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Item__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Item__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4"


    // $ANTLR start "rule__Item__Group__4__Impl"
    // InternalOrders.g:808:1: rule__Item__Group__4__Impl : ( 'each' ) ;
    public final void rule__Item__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:812:1: ( ( 'each' ) )
            // InternalOrders.g:813:1: ( 'each' )
            {
            // InternalOrders.g:813:1: ( 'each' )
            // InternalOrders.g:814:2: 'each'
            {
             before(grammarAccess.getItemAccess().getEachKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getEachKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__4__Impl"


    // $ANTLR start "rule__Item__Group__5"
    // InternalOrders.g:823:1: rule__Item__Group__5 : rule__Item__Group__5__Impl ;
    public final void rule__Item__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:827:1: ( rule__Item__Group__5__Impl )
            // InternalOrders.g:828:2: rule__Item__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Item__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5"


    // $ANTLR start "rule__Item__Group__5__Impl"
    // InternalOrders.g:834:1: rule__Item__Group__5__Impl : ( ')' ) ;
    public final void rule__Item__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:838:1: ( ( ')' ) )
            // InternalOrders.g:839:1: ( ')' )
            {
            // InternalOrders.g:839:1: ( ')' )
            // InternalOrders.g:840:2: ')'
            {
             before(grammarAccess.getItemAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getItemAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__Group__5__Impl"


    // $ANTLR start "rule__OrderLine__Group__0"
    // InternalOrders.g:850:1: rule__OrderLine__Group__0 : rule__OrderLine__Group__0__Impl rule__OrderLine__Group__1 ;
    public final void rule__OrderLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:854:1: ( rule__OrderLine__Group__0__Impl rule__OrderLine__Group__1 )
            // InternalOrders.g:855:2: rule__OrderLine__Group__0__Impl rule__OrderLine__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OrderLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderLine__Group__0"


    // $ANTLR start "rule__OrderLine__Group__0__Impl"
    // InternalOrders.g:862:1: rule__OrderLine__Group__0__Impl : ( ( rule__OrderLine__QuantityAssignment_0 ) ) ;
    public final void rule__OrderLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:866:1: ( ( ( rule__OrderLine__QuantityAssignment_0 ) ) )
            // InternalOrders.g:867:1: ( ( rule__OrderLine__QuantityAssignment_0 ) )
            {
            // InternalOrders.g:867:1: ( ( rule__OrderLine__QuantityAssignment_0 ) )
            // InternalOrders.g:868:2: ( rule__OrderLine__QuantityAssignment_0 )
            {
             before(grammarAccess.getOrderLineAccess().getQuantityAssignment_0()); 
            // InternalOrders.g:869:2: ( rule__OrderLine__QuantityAssignment_0 )
            // InternalOrders.g:869:3: rule__OrderLine__QuantityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderLine__QuantityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderLineAccess().getQuantityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderLine__Group__0__Impl"


    // $ANTLR start "rule__OrderLine__Group__1"
    // InternalOrders.g:877:1: rule__OrderLine__Group__1 : rule__OrderLine__Group__1__Impl ;
    public final void rule__OrderLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:881:1: ( rule__OrderLine__Group__1__Impl )
            // InternalOrders.g:882:2: rule__OrderLine__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderLine__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderLine__Group__1"


    // $ANTLR start "rule__OrderLine__Group__1__Impl"
    // InternalOrders.g:888:1: rule__OrderLine__Group__1__Impl : ( ( rule__OrderLine__ItemAssignment_1 ) ) ;
    public final void rule__OrderLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:892:1: ( ( ( rule__OrderLine__ItemAssignment_1 ) ) )
            // InternalOrders.g:893:1: ( ( rule__OrderLine__ItemAssignment_1 ) )
            {
            // InternalOrders.g:893:1: ( ( rule__OrderLine__ItemAssignment_1 ) )
            // InternalOrders.g:894:2: ( rule__OrderLine__ItemAssignment_1 )
            {
             before(grammarAccess.getOrderLineAccess().getItemAssignment_1()); 
            // InternalOrders.g:895:2: ( rule__OrderLine__ItemAssignment_1 )
            // InternalOrders.g:895:3: rule__OrderLine__ItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderLine__ItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderLineAccess().getItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderLine__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalOrders.g:904:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:908:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalOrders.g:909:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalOrders.g:916:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:920:1: ( ( ( '-' )? ) )
            // InternalOrders.g:921:1: ( ( '-' )? )
            {
            // InternalOrders.g:921:1: ( ( '-' )? )
            // InternalOrders.g:922:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalOrders.g:923:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOrders.g:923:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalOrders.g:931:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:935:1: ( rule__EInt__Group__1__Impl )
            // InternalOrders.g:936:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalOrders.g:942:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:946:1: ( ( RULE_INT ) )
            // InternalOrders.g:947:1: ( RULE_INT )
            {
            // InternalOrders.g:947:1: ( RULE_INT )
            // InternalOrders.g:948:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalOrders.g:958:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:962:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalOrders.g:963:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalOrders.g:970:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:974:1: ( ( ( '-' )? ) )
            // InternalOrders.g:975:1: ( ( '-' )? )
            {
            // InternalOrders.g:975:1: ( ( '-' )? )
            // InternalOrders.g:976:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalOrders.g:977:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOrders.g:977:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalOrders.g:985:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:989:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalOrders.g:990:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalOrders.g:997:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1001:1: ( ( ( RULE_INT )? ) )
            // InternalOrders.g:1002:1: ( ( RULE_INT )? )
            {
            // InternalOrders.g:1002:1: ( ( RULE_INT )? )
            // InternalOrders.g:1003:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalOrders.g:1004:2: ( RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOrders.g:1004:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalOrders.g:1012:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1016:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalOrders.g:1017:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalOrders.g:1024:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1028:1: ( ( '.' ) )
            // InternalOrders.g:1029:1: ( '.' )
            {
            // InternalOrders.g:1029:1: ( '.' )
            // InternalOrders.g:1030:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalOrders.g:1039:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1043:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalOrders.g:1044:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalOrders.g:1051:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1055:1: ( ( RULE_INT ) )
            // InternalOrders.g:1056:1: ( RULE_INT )
            {
            // InternalOrders.g:1056:1: ( RULE_INT )
            // InternalOrders.g:1057:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalOrders.g:1066:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1070:1: ( rule__EFloat__Group__4__Impl )
            // InternalOrders.g:1071:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalOrders.g:1077:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1081:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalOrders.g:1082:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalOrders.g:1082:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalOrders.g:1083:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalOrders.g:1084:2: ( rule__EFloat__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=11 && LA9_0<=12)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOrders.g:1084:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalOrders.g:1093:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1097:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalOrders.g:1098:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalOrders.g:1105:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1109:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalOrders.g:1110:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalOrders.g:1110:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalOrders.g:1111:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalOrders.g:1112:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalOrders.g:1112:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalOrders.g:1120:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1124:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalOrders.g:1125:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalOrders.g:1132:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1136:1: ( ( ( '-' )? ) )
            // InternalOrders.g:1137:1: ( ( '-' )? )
            {
            // InternalOrders.g:1137:1: ( ( '-' )? )
            // InternalOrders.g:1138:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalOrders.g:1139:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOrders.g:1139:3: '-'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalOrders.g:1147:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1151:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalOrders.g:1152:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalOrders.g:1158:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1162:1: ( ( RULE_INT ) )
            // InternalOrders.g:1163:1: ( RULE_INT )
            {
            // InternalOrders.g:1163:1: ( RULE_INT )
            // InternalOrders.g:1164:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__ECommerce__StockAssignment_2"
    // InternalOrders.g:1174:1: rule__ECommerce__StockAssignment_2 : ( ruleItem ) ;
    public final void rule__ECommerce__StockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1178:1: ( ( ruleItem ) )
            // InternalOrders.g:1179:2: ( ruleItem )
            {
            // InternalOrders.g:1179:2: ( ruleItem )
            // InternalOrders.g:1180:3: ruleItem
            {
             before(grammarAccess.getECommerceAccess().getStockItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleItem();

            state._fsp--;

             after(grammarAccess.getECommerceAccess().getStockItemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__StockAssignment_2"


    // $ANTLR start "rule__ECommerce__OrdersAssignment_4"
    // InternalOrders.g:1189:1: rule__ECommerce__OrdersAssignment_4 : ( rulePurchaseOrder ) ;
    public final void rule__ECommerce__OrdersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1193:1: ( ( rulePurchaseOrder ) )
            // InternalOrders.g:1194:2: ( rulePurchaseOrder )
            {
            // InternalOrders.g:1194:2: ( rulePurchaseOrder )
            // InternalOrders.g:1195:3: rulePurchaseOrder
            {
             before(grammarAccess.getECommerceAccess().getOrdersPurchaseOrderParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePurchaseOrder();

            state._fsp--;

             after(grammarAccess.getECommerceAccess().getOrdersPurchaseOrderParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ECommerce__OrdersAssignment_4"


    // $ANTLR start "rule__PurchaseOrder__LinesAssignment_1"
    // InternalOrders.g:1204:1: rule__PurchaseOrder__LinesAssignment_1 : ( ruleOrderLine ) ;
    public final void rule__PurchaseOrder__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1208:1: ( ( ruleOrderLine ) )
            // InternalOrders.g:1209:2: ( ruleOrderLine )
            {
            // InternalOrders.g:1209:2: ( ruleOrderLine )
            // InternalOrders.g:1210:3: ruleOrderLine
            {
             before(grammarAccess.getPurchaseOrderAccess().getLinesOrderLineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderLine();

            state._fsp--;

             after(grammarAccess.getPurchaseOrderAccess().getLinesOrderLineParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__LinesAssignment_1"


    // $ANTLR start "rule__PurchaseOrder__LinesAssignment_2_1"
    // InternalOrders.g:1219:1: rule__PurchaseOrder__LinesAssignment_2_1 : ( ruleOrderLine ) ;
    public final void rule__PurchaseOrder__LinesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1223:1: ( ( ruleOrderLine ) )
            // InternalOrders.g:1224:2: ( ruleOrderLine )
            {
            // InternalOrders.g:1224:2: ( ruleOrderLine )
            // InternalOrders.g:1225:3: ruleOrderLine
            {
             before(grammarAccess.getPurchaseOrderAccess().getLinesOrderLineParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderLine();

            state._fsp--;

             after(grammarAccess.getPurchaseOrderAccess().getLinesOrderLineParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__LinesAssignment_2_1"


    // $ANTLR start "rule__PurchaseOrder__ShipToAssignment_5"
    // InternalOrders.g:1234:1: rule__PurchaseOrder__ShipToAssignment_5 : ( ruleEString ) ;
    public final void rule__PurchaseOrder__ShipToAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1238:1: ( ( ruleEString ) )
            // InternalOrders.g:1239:2: ( ruleEString )
            {
            // InternalOrders.g:1239:2: ( ruleEString )
            // InternalOrders.g:1240:3: ruleEString
            {
             before(grammarAccess.getPurchaseOrderAccess().getShipToEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPurchaseOrderAccess().getShipToEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__ShipToAssignment_5"


    // $ANTLR start "rule__PurchaseOrder__BillToAssignment_7"
    // InternalOrders.g:1249:1: rule__PurchaseOrder__BillToAssignment_7 : ( ruleEString ) ;
    public final void rule__PurchaseOrder__BillToAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1253:1: ( ( ruleEString ) )
            // InternalOrders.g:1254:2: ( ruleEString )
            {
            // InternalOrders.g:1254:2: ( ruleEString )
            // InternalOrders.g:1255:3: ruleEString
            {
             before(grammarAccess.getPurchaseOrderAccess().getBillToEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPurchaseOrderAccess().getBillToEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PurchaseOrder__BillToAssignment_7"


    // $ANTLR start "rule__Item__StockAssignment_0"
    // InternalOrders.g:1264:1: rule__Item__StockAssignment_0 : ( ruleEInt ) ;
    public final void rule__Item__StockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1268:1: ( ( ruleEInt ) )
            // InternalOrders.g:1269:2: ( ruleEInt )
            {
            // InternalOrders.g:1269:2: ( ruleEInt )
            // InternalOrders.g:1270:3: ruleEInt
            {
             before(grammarAccess.getItemAccess().getStockEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getItemAccess().getStockEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__StockAssignment_0"


    // $ANTLR start "rule__Item__NameAssignment_1"
    // InternalOrders.g:1279:1: rule__Item__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Item__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1283:1: ( ( ruleEString ) )
            // InternalOrders.g:1284:2: ( ruleEString )
            {
            // InternalOrders.g:1284:2: ( ruleEString )
            // InternalOrders.g:1285:3: ruleEString
            {
             before(grammarAccess.getItemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__NameAssignment_1"


    // $ANTLR start "rule__Item__PriceAssignment_3"
    // InternalOrders.g:1294:1: rule__Item__PriceAssignment_3 : ( ruleEFloat ) ;
    public final void rule__Item__PriceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1298:1: ( ( ruleEFloat ) )
            // InternalOrders.g:1299:2: ( ruleEFloat )
            {
            // InternalOrders.g:1299:2: ( ruleEFloat )
            // InternalOrders.g:1300:3: ruleEFloat
            {
             before(grammarAccess.getItemAccess().getPriceEFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getItemAccess().getPriceEFloatParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Item__PriceAssignment_3"


    // $ANTLR start "rule__OrderLine__QuantityAssignment_0"
    // InternalOrders.g:1309:1: rule__OrderLine__QuantityAssignment_0 : ( ruleEInt ) ;
    public final void rule__OrderLine__QuantityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1313:1: ( ( ruleEInt ) )
            // InternalOrders.g:1314:2: ( ruleEInt )
            {
            // InternalOrders.g:1314:2: ( ruleEInt )
            // InternalOrders.g:1315:3: ruleEInt
            {
             before(grammarAccess.getOrderLineAccess().getQuantityEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOrderLineAccess().getQuantityEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderLine__QuantityAssignment_0"


    // $ANTLR start "rule__OrderLine__ItemAssignment_1"
    // InternalOrders.g:1324:1: rule__OrderLine__ItemAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__OrderLine__ItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalOrders.g:1328:1: ( ( ( ruleEString ) ) )
            // InternalOrders.g:1329:2: ( ( ruleEString ) )
            {
            // InternalOrders.g:1329:2: ( ( ruleEString ) )
            // InternalOrders.g:1330:3: ( ruleEString )
            {
             before(grammarAccess.getOrderLineAccess().getItemItemCrossReference_1_0()); 
            // InternalOrders.g:1331:3: ( ruleEString )
            // InternalOrders.g:1332:4: ruleEString
            {
             before(grammarAccess.getOrderLineAccess().getItemItemEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrderLineAccess().getItemItemEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOrderLineAccess().getItemItemCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderLine__ItemAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});

}