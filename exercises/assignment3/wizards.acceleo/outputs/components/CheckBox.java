package components;

import javax.swing.*;

// (import components.*;

public class CheckBox extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JCheckBox checkBox;

	public CheckBox(Boolean selected, String cLabel) {
		super();

		JCheckBox checkBox = new JCheckBox();
		JLabel label = new JLabel(cLabel);

		checkBox.setSelected(selected);

		this.add(label);
		this.add(checkBox);
		
		this.checkBox = checkBox;
	}
	
	public Boolean isSelected() { return this.checkBox.isSelected(); }

}