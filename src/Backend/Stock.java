package Backend;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Stock extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private double shares;
	private double price;
	private double sellGoal;
	
	private JLabel nameLabel;
	private JTextField sharesField;
	private JTextField priceField;
	private JTextField sellGoalField;
	
	public Stock(String name, double shares, double price) {
		this(name, shares, price, price);
	}
	public Stock(String name, double shares, double price, double sellGoal) {
		this.name = name;
		this.shares = shares;
		this.price = price;
		this.sellGoal = sellGoal;
		
		this.nameLabel = new JLabel(name);
		this.sharesField = new JTextField(String.valueOf(shares));
		this.priceField = new JTextField(String.valueOf(price));
		this.sellGoalField = new JTextField(String.valueOf(sellGoal));
		
		this.add(nameLabel);
		this.add(sharesField);
		this.add(priceField);
		this.add(sellGoalField);
		refreshGUI();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setShares(double shares) {
		this.shares = shares;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSellGoal(double sellGoal) {
		this.sellGoal = sellGoal;
	}
	public String getName() {
		return name;
	}
	public double getShares() {
		return shares;
	}
	public double getPrice() {
		return price;
	}
	public double getCostWithoutFees() {
		return price * shares;
	}
	public double getCostWithFees() {
		return getCostWithoutFees() + 14;
	}
	public double getSellGoal() {
		return sellGoal;
	}
	public double getProfitWithSellGoal() {
		return sellGoal * shares - getCostWithFees();
	}
	public void refreshGUI() {
		this.setVisible(false);
		this.setVisible(true);
	}
}
