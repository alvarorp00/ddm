package components;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class PopUpButton extends JButton {

	private static final long serialVersionUID = 1L;

	public PopUpButton(String label, String msg) {

		super(label);

		this.addActionListener(e -> {
			this.alert(msg);
		});

	}

	private void alert(String str){
        JOptionPane.showMessageDialog(null, str);
    }

}