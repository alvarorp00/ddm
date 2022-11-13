package components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import java.awt.Component;

public class CloseButton extends JButton {

	private static final long serialVersionUID = 1L;

	public CloseButton(String label) {

		super(label);

		this.addActionListener(e -> {
			Component component = (Component) e.getSource();
            JFrame frame = (JFrame)SwingUtilities.getRoot(component); // this is the wizard
			frame.setVisible(false);
			frame.dispose();
		});

	}

}