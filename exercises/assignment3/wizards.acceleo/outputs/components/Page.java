package components;

import java.awt.BorderLayout;
import javax.swing.*;

// import components.*;

public class Page extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private CheckBox checkBox = null;  // it's important to set it to null (even if it's explicitly done) for navigatorButtons checks
	

	public Page(String name) {
		super(new BorderLayout());
		this.setName(name);
	}
	
	public void addCheckBox(CheckBox checkBox) {
		this.checkBox = checkBox;  // we need this for checking the value of the return button
		this.add(checkBox, BorderLayout.NORTH);
	}
	
	public void addTextField(TextField textField) {
		this.add(textField, BorderLayout.CENTER);
	}
	
	public void addButtonGroup(JPanel buttons) {
		this.add(buttons, BorderLayout.SOUTH);
	}
	
	public CheckBox getCheckBox() { return this.checkBox; }

}