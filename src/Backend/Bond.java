package Backend;

public class Bond {
	
	private double originalAmount;
	private double currentAmount;
	private double interestRate;
	
	public Bond(double originalAmount, double currentAmount, double interestRate) {
		this.originalAmount = originalAmount;
		this.currentAmount = currentAmount;
		this.interestRate = interestRate;
	}
	
	public void setOriginalAmount(double originalAmount) {
		this.originalAmount = originalAmount;
	}
	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getOriginalAmount() {
		return originalAmount;
	}
	public double getCurrentAmount() {
		return currentAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public double getInterestGained() {
		return currentAmount - originalAmount;
	}

}
