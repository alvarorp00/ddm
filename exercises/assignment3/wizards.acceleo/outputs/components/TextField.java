/**
 * TextField
 */

package components;

import java.awt.GridLayout;

import javax.swing.*;

// import components.*;

public class TextField extends JPanel {

	private static final long serialVersionUID = 1L;

	public TextField(String cLabel, String cDefaultInput) {
		super(new GridLayout(0, 2));

		JLabel label = new JLabel(cLabel);  // given label
		JTextField input = new JTextField(cDefaultInput, 10);  // given input + 10 columns

		this.add(label);
		this.add(input);
	}

}