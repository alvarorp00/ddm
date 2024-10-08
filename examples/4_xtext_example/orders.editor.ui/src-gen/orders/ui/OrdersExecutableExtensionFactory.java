/*
 * generated by Xtext 2.23.0
 */
package orders.ui;

import com.google.inject.Injector;
import orders.editor.ui.internal.EditorActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OrdersExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(EditorActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		EditorActivator activator = EditorActivator.getInstance();
		return activator != null ? activator.getInjector(EditorActivator.ORDERS_ORDERS) : null;
	}

}
