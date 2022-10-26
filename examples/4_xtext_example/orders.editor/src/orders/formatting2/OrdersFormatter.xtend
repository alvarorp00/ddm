/*
 * generated by Xtext 2.23.0
 */
package orders.formatting2

import com.google.inject.Inject
import orders.Ecommerce
import orders.PurchaseOrder
import orders.services.OrdersGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class OrdersFormatter extends AbstractFormatter2 {
	
	@Inject extension OrdersGrammarAccess

	def dispatch void format(Ecommerce ecommerce, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (item : ecommerce.stock) {
			item.format
		}
		for (purchaseOrder : ecommerce.orders) {
			purchaseOrder.format
		}
	}

	def dispatch void format(PurchaseOrder purchaseOrder, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (orderLine : purchaseOrder.lines) {
			orderLine.format
		}
	}
	
	// TODO: implement for 
}
