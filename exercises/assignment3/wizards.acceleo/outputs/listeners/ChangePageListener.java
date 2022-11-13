/**
 * ChangePage
 */

package listeners;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ChangePageListener implements ActionListener {
	private JPanel pages;
	private CardLayout fromLayout;
	private String target;
	
	public ChangePageListener(JPanel pages, String target) {
		this.pages = pages;
		this.fromLayout = (CardLayout)pages.getLayout();
		this.target = target;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.fromLayout.show(pages, target);
	}
}



