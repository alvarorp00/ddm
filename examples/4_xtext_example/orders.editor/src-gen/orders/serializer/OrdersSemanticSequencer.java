/*
 * generated by Xtext 2.23.0
 */
package orders.serializer;

import com.google.inject.Inject;
import java.util.Set;
import orders.Ecommerce;
import orders.Item;
import orders.OrderLine;
import orders.OrdersPackage;
import orders.PurchaseOrder;
import orders.services.OrdersGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class OrdersSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private OrdersGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == OrdersPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case OrdersPackage.ECOMMERCE:
				sequence_ECommerce(context, (Ecommerce) semanticObject); 
				return; 
			case OrdersPackage.ITEM:
				sequence_Item(context, (Item) semanticObject); 
				return; 
			case OrdersPackage.ORDER_LINE:
				sequence_OrderLine(context, (OrderLine) semanticObject); 
				return; 
			case OrdersPackage.PURCHASE_ORDER:
				sequence_PurchaseOrder(context, (PurchaseOrder) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ECommerce returns Ecommerce
	 *
	 * Constraint:
	 *     (stock+=Item+ orders+=PurchaseOrder+)
	 */
	protected void sequence_ECommerce(ISerializationContext context, Ecommerce semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Item returns Item
	 *
	 * Constraint:
	 *     (stock=EInt name=EString price=EFloat)
	 */
	protected void sequence_Item(ISerializationContext context, Item semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OrdersPackage.Literals.ITEM__STOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OrdersPackage.Literals.ITEM__STOCK));
			if (transientValues.isValueTransient(semanticObject, OrdersPackage.Literals.ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OrdersPackage.Literals.ITEM__NAME));
			if (transientValues.isValueTransient(semanticObject, OrdersPackage.Literals.ITEM__PRICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OrdersPackage.Literals.ITEM__PRICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getItemAccess().getStockEIntParserRuleCall_0_0(), semanticObject.getStock());
		feeder.accept(grammarAccess.getItemAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getItemAccess().getPriceEFloatParserRuleCall_3_0(), semanticObject.getPrice());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OrderLine returns OrderLine
	 *
	 * Constraint:
	 *     (quantity=EInt item=[Item|EString])
	 */
	protected void sequence_OrderLine(ISerializationContext context, OrderLine semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, OrdersPackage.Literals.ORDER_LINE__QUANTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OrdersPackage.Literals.ORDER_LINE__QUANTITY));
			if (transientValues.isValueTransient(semanticObject, OrdersPackage.Literals.ORDER_LINE__ITEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OrdersPackage.Literals.ORDER_LINE__ITEM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrderLineAccess().getQuantityEIntParserRuleCall_0_0(), semanticObject.getQuantity());
		feeder.accept(grammarAccess.getOrderLineAccess().getItemItemEStringParserRuleCall_1_0_1(), semanticObject.eGet(OrdersPackage.Literals.ORDER_LINE__ITEM, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PurchaseOrder returns PurchaseOrder
	 *
	 * Constraint:
	 *     (lines+=OrderLine lines+=OrderLine* shipTo=EString billTo=EString)
	 */
	protected void sequence_PurchaseOrder(ISerializationContext context, PurchaseOrder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
