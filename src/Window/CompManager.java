package Window;

import Backend.BankAccount;

public class CompManager {
	
	WindowFrame wf;
	FramePanel fp;
	BankAccountsPanel bap;
	StocksPanel sp;
	BondsPanel bp;
	TotalsPanel tp;
	
	public CompManager() {
		wf = new WindowFrame();
		fp = new FramePanel();
		bap = new BankAccountsPanel();
		sp = new StocksPanel();
		bp = new BondsPanel();
		tp = new TotalsPanel();
	}

	public void addCompsToWindowFrame() {
		wf.add(fp);
	}
	public void addCompsToFramePanel() {
		fp.add(bap);
		fp.add(sp);
		fp.add(bp);
		fp.add(tp);
	}
	public void addBankAccountToBankPanel(BankAccount bankAccount) {
		bap.add(bankAccount);
	}
	public void addTotalsToTotalsPanel(double bankAccounts, double stocks, double bonds, double total) {
		tp.setFields(bankAccounts, stocks, bonds, total);
	}
	
	public void refreshGUI() {
		wf.refreshGUI();
		fp.refreshGUI();
	}
	
}
