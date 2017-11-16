package Backend;

import java.util.ArrayList;

public class InvestmentsManager {
	
	private ArrayList<BankAccount> bankAccounts;
	private ArrayList<Stock> stocks;
	private ArrayList<Bond> bonds;
	private double total;
	private int index;
	
	public InvestmentsManager() {
		bankAccounts = new ArrayList<BankAccount>();
		stocks = new ArrayList<Stock>();
		bonds = new ArrayList<Bond>();
	}
	
	public void addBankAccount(BankAccount bankAccount) {
		bankAccounts.add(bankAccount);
	}
	public void addStock(Stock stock) {
		stocks.add(stock);
	}
	public void addBond(Bond bond) {
		bonds.add(bond);
	}
	public double getBankAccountsTotal() {
		index = 0;
		total = 0;
		while(index < bankAccounts.size()) {
			total += bankAccounts.get(index).getChecking();
			total += bankAccounts.get(index).getSavings();
			index++;
		}
		return total;
	}
	public double getStocksTotal() {
		index = 0;
		total = 0;
		while(index < stocks.size()) {
			total += stocks.get(index).getPrice() * stocks.get(index).getShares();
			index++;
		}
		return total;
	}
	public double getBondsTotal() {
		index = 0;
		total = 0;
		while(index < bonds.size()) {
			total += bonds.get(index).getCurrentAmount();
			index++;
		}
		return total;
	}
	public double getTotal() {
		return getBankAccountsTotal() + getStocksTotal() + getBondsTotal();
	}
	
}
