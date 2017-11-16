package Backend;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccount extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private double checking;
	private double savings;
	private ArrayList<Transaction> checkingTransactions;
	private ArrayList<Transaction> savingsTransactions;
	
	private JLabel nameLabel;
	private JTextField checkingField;
	private JTextField savingsField;
	
	public BankAccount(String name, double checking, double savings) {
		this.name = name;
		this.checking = checking;
		this.savings = savings;
		this.checkingTransactions = new ArrayList<Transaction>();
		this.savingsTransactions = new ArrayList<Transaction>();
		
		this.nameLabel = new JLabel(name);
		this.checkingField = new JTextField(String.valueOf(checking));
		this.savingsField = new JTextField(String.valueOf(savings));
		
		this.add(nameLabel);
		this.add(checkingField);
		this.add(savingsField);
		refreshGUI();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setChecking(double checking) {
		this.checking = checking;
	}
	public void setSavings(double savings) {
		this.savings = savings;
	}
	public String getName() {
		return name;
	}
	public double getChecking() {
		return checking;
	}
	public double getSavings() {
		return savings;
	}
	
	public void addCheckingTransaction(Transaction transaction) {
		checkingTransactions.add(transaction);
	}
	public void addSavingsTransaction(Transaction transaction) {
		savingsTransactions.add(transaction);
	}
	
	public void refreshGUI() {
		this.setVisible(false);
		this.setVisible(true);
	}

}
