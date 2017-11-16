package Backend;

public class Transaction {
	
	private String name;
	private double amount;
	private String description;
	
	public Transaction(String name, double amount) {
		this(name, amount, "Unavailable");
	}
	public Transaction(String name, double amount, String description) {
		this.name = name;
		this.amount = amount;
		this.description = description;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public double getAmount() {
		return amount;
	}
	public String getDescription() {
		return description;
	}
}
