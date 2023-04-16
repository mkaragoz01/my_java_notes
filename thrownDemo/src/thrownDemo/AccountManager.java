package thrownDemo;

public class AccountManager {
	private double balance;
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws BalanceInsufficentException {
		if (balance >= amount) {
			balance -= amount;
		}else {
			throw new BalanceInsufficentException("Bakiye Yetersiz");
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
}
