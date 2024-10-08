/*
 * generated by Xtext 2.23.0
 */
package orders.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import orders.ide.contentassist.antlr.internal.InternalOrdersParser;
import orders.services.OrdersGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class OrdersParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(OrdersGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, OrdersGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEFloatAccess().getAlternatives_4_0(), "rule__EFloat__Alternatives_4_0");
			builder.put(grammarAccess.getECommerceAccess().getGroup(), "rule__ECommerce__Group__0");
			builder.put(grammarAccess.getPurchaseOrderAccess().getGroup(), "rule__PurchaseOrder__Group__0");
			builder.put(grammarAccess.getPurchaseOrderAccess().getGroup_2(), "rule__PurchaseOrder__Group_2__0");
			builder.put(grammarAccess.getItemAccess().getGroup(), "rule__Item__Group__0");
			builder.put(grammarAccess.getOrderLineAccess().getGroup(), "rule__OrderLine__Group__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup(), "rule__EFloat__Group__0");
			builder.put(grammarAccess.getEFloatAccess().getGroup_4(), "rule__EFloat__Group_4__0");
			builder.put(grammarAccess.getECommerceAccess().getStockAssignment_2(), "rule__ECommerce__StockAssignment_2");
			builder.put(grammarAccess.getECommerceAccess().getOrdersAssignment_4(), "rule__ECommerce__OrdersAssignment_4");
			builder.put(grammarAccess.getPurchaseOrderAccess().getLinesAssignment_1(), "rule__PurchaseOrder__LinesAssignment_1");
			builder.put(grammarAccess.getPurchaseOrderAccess().getLinesAssignment_2_1(), "rule__PurchaseOrder__LinesAssignment_2_1");
			builder.put(grammarAccess.getPurchaseOrderAccess().getShipToAssignment_5(), "rule__PurchaseOrder__ShipToAssignment_5");
			builder.put(grammarAccess.getPurchaseOrderAccess().getBillToAssignment_7(), "rule__PurchaseOrder__BillToAssignment_7");
			builder.put(grammarAccess.getItemAccess().getStockAssignment_0(), "rule__Item__StockAssignment_0");
			builder.put(grammarAccess.getItemAccess().getNameAssignment_1(), "rule__Item__NameAssignment_1");
			builder.put(grammarAccess.getItemAccess().getPriceAssignment_3(), "rule__Item__PriceAssignment_3");
			builder.put(grammarAccess.getOrderLineAccess().getQuantityAssignment_0(), "rule__OrderLine__QuantityAssignment_0");
			builder.put(grammarAccess.getOrderLineAccess().getItemAssignment_1(), "rule__OrderLine__ItemAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private OrdersGrammarAccess grammarAccess;

	@Override
	protected InternalOrdersParser createParser() {
		InternalOrdersParser result = new InternalOrdersParser(null);
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

	public OrdersGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OrdersGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
