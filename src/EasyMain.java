import Backend.BankAccount;
import Backend.InvestmentsManager;
import Window.CompManager;

public class EasyMain {

	public static void main(String[] args) {
		CompManager cm = new CompManager();
		InvestmentsManager im = new InvestmentsManager();
		BankAccount firstBank = new BankAccount("first bank", 100, 500);
		BankAccount secondBank = new BankAccount("second bank", 50, 75);
		
		cm.addBankAccountToBankPanel(firstBank);
		cm.addBankAccountToBankPanel(secondBank);
		im.addBankAccount(firstBank);
		im.addBankAccount(secondBank);
		cm.addCompsToFramePanel();
		cm.addCompsToWindowFrame();
		
		cm.addTotalsToTotalsPanel(im.getBankAccountsTotal(), im.getStocksTotal(), im.getBondsTotal(), im.getTotal());
		
		cm.refreshGUI();

	}

}
