
/* Start of user code initialization
*/

package wizard;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.*;

import java.util.function.Predicate;

import components.*;
import listeners.*;

public class Wizard extends JFrame {

	private static final long serialVersionUID = 1L;

	public Wizard() {

		super("New Project");

/* End of user code */
	
/* Start of user code variables
*/
		JPanel wizard;
		
		Page page;
		
		CheckBox checkBox;
		TextField textField;
		
		ReturnButton returnButton;
		NavigatorButton navigatorButton;
		CloseButton closeButton;
		PopUpButton popUpButton;

		JPanel buttons;

		Predicate<Page> pred = (p) -> {
			CheckBox cb = p.getCheckBox();
			if (cb == null) return true;
			return !cb.isSelected();  // we want that if it's selected then move to alter destiny
		};
	
/* End of user code */
	
		wizard = new JPanel(new CardLayout());

		
		page = new Page("Page 1");
		
		
		
		
		
		
		textField = new TextField("Name", "");
		page.addTextField(textField);
		
		
		buttons = new JPanel();
		
		
		
		navigatorButton = new NavigatorButton("Next");
		navigatorButton.addActionListener(new AlternateChangePageListener(wizard,
			"Page 2", "invalid", page, pred));  // by page we access to the current button page!
		buttons.add(navigatorButton);
		
		
		
		closeButton = new CloseButton("Cancel");
		buttons.add(closeButton);
		
		
		
		page.addButtonGroup(buttons);
		

		wizard.add(page, page.getName());

		
		page = new Page("Page 1");
		
		
		
		
		
		
		textField = new TextField("Name", "");
		page.addTextField(textField);
		
		
		buttons = new JPanel();
		
		
		
		navigatorButton = new NavigatorButton("Next");
		navigatorButton.addActionListener(new AlternateChangePageListener(wizard,
			"Page 2", "invalid", page, pred));  // by page we access to the current button page!
		buttons.add(navigatorButton);
		
		
		
		closeButton = new CloseButton("Cancel");
		buttons.add(closeButton);
		
		
		
		page.addButtonGroup(buttons);
		
		wizard.add(page, page.getName());
		
		page = new Page("Page 3.1");
		
		
		
		
		
		
		textField = new TextField("Folder", "");
		page.addTextField(textField);
		
		
		buttons = new JPanel();
		
		
		returnButton = new ReturnButton("Back");
		returnButton.addActionListener(new ChangePageListener(wizard, "Page 2"));
		buttons.add(returnButton);
		
		
		
		
		closeButton = new CloseButton("Finish");
		buttons.add(closeButton);
		
		
		
		page.addButtonGroup(buttons);
		
		wizard.add(page, page.getName());
		
		page = new Page("Page 3.2");
		
		
		
		
		
		
		buttons = new JPanel();
		
		
		returnButton = new ReturnButton("Back");
		returnButton.addActionListener(new ChangePageListener(wizard, "Page 2"));
		buttons.add(returnButton);
		
		
		
		
		closeButton = new CloseButton("Finish");
		buttons.add(closeButton);
		
		
		
		popUpButton = new PopUpButton("Info", "Some info text");
		buttons.add(popUpButton);
		
		
		page.addButtonGroup(buttons);
		
		wizard.add(page, page.getName());
		
		page = new Page("Page 2");
		
		
		checkBox = new CheckBox(true, "create src folder");
		page.addCheckBox(checkBox);
		
		
		
		
		buttons = new JPanel();
		
		
		returnButton = new ReturnButton("Back");
		returnButton.addActionListener(new ChangePageListener(wizard, "Page 1"));
		buttons.add(returnButton);
		
		
		
		navigatorButton = new NavigatorButton("Next");
		navigatorButton.addActionListener(new AlternateChangePageListener(wizard,
			"Page 3.2", "Page 3.1", page, pred));  // by page we access to the current button page!
		buttons.add(navigatorButton);
		
		
		
		closeButton = new CloseButton("Cancel");
		buttons.add(closeButton);
		
		
		
		page.addButtonGroup(buttons);
		
		wizard.add(page, page.getName());

		getContentPane().add(wizard);
	}

/* Start of user code showWizard
*/

	public void showWizard() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

/* End of user code */

/* Start of user code finish
*/

}

/* End of user code */

