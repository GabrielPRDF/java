package antities;

public class Account {
	private String name;
	private int numberAccount;
	private double value;
	
	public Account(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
	}

	public Account(String name, int numberAccount, double value) {
		this.name = name;
		this.numberAccount = numberAccount;
		this.value = value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public int getNumberAccount() {
		return this.numberAccount;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void plunder(double valuePlunder) {
		if (valuePlunder <= value) {
			this.value -= (valuePlunder + 5.00);
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	public void deposit(double valueDeposit) {
		this.value += valueDeposit;
	}
	
	public String toString() {
		return "Account " + this.numberAccount + ", Holder " + this.name + ", Balance: " + String.format("%.2f", this.value); 
	}
}
