package Window;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TotalsPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel bankAccountsLabel;
	private JLabel stocksLabel;
	private JLabel bondsLabel;
	private JLabel totalLabel;
	
	
	public TotalsPanel() {
		this.setBackground(Color.white);
		this.setSize(400, 400);
		this.setLocation(401, 401);
		
		bankAccountsLabel = new JLabel();
		stocksLabel = new JLabel();
		bondsLabel = new JLabel();
		totalLabel = new JLabel();
		
		this.add(bankAccountsLabel);
		this.add(stocksLabel);
		this.add(bondsLabel);
		this.add(totalLabel);
		refreshGUI();
	}
	
	public void setFields(double bankAccounts, double stocks, double bonds, double total) {
		bankAccountsLabel.setText("Bank Accounts Total: " + String.valueOf(bankAccounts));
		stocksLabel.setText("Stocks Total: " + String.valueOf(stocks));
		bondsLabel.setText("Bonds Total: " + String.valueOf(bonds));
		totalLabel.setText("Total: " + String.valueOf(total));
	}
	
	public void refreshGUI() {
		this.setVisible(false);
		this.setVisible(true);
	}

}
