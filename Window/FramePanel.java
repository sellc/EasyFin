package Window;

import java.awt.Color;

import javax.swing.JPanel;

public class FramePanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FramePanel() {
		this.setBackground(Color.gray);
		this.setLayout(null);
	}
	public void refreshGUI() {
		this.setVisible(false);
		this.setVisible(true);
	}
}
