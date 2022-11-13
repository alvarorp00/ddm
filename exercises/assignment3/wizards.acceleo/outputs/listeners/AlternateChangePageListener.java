/**
 * ChangePage
 */

package listeners;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Predicate;

import javax.swing.JPanel;

import components.Page;

/**
 * This listener receives two target pages 
 * together with a predicate and
 * selects the first one if holds, the second if it doesn't
 * @author alvarorp00
 *
 */
public class AlternateChangePageListener implements ActionListener {
	private JPanel pages;
	private CardLayout fromLayout;
	
	private String target1;
	private String target2;
	
	private Page srcPage;
	private Predicate<Page> predicate;
	
	/**
	 * 
	 * @param pages [jpanel with all pages]
	 * @param target1 [default target page (condition satisfies]
	 * @param target2 [alternate target page (condition doesn't satisfy]
	 */
	public AlternateChangePageListener(JPanel pages, String target1, String target2,
			Page srcPage, Predicate<Page> predicate) {
		this.pages = pages;
		this.fromLayout = (CardLayout)pages.getLayout();
		
		this.target1 = target1;
		this.target2 = target2;
		
		this.srcPage = srcPage;
		this.predicate = predicate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String target = this.predicate.test(this.srcPage) ? this.target1 : this.target2;
		this.fromLayout.show(pages, target);
	}
}



