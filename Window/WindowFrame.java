package Window;

import java.awt.Color;

import javax.swing.JFrame;

public class WindowFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WindowFrame() {
		this.setBackground(Color.white);
		this.setBounds(0,0,1900,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void refreshGUI() {
		this.setVisible(false);
		this.setVisible(true);
	}
	
}
