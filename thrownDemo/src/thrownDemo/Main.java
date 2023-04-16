package thrownDemo;

public class Main {

	public static void main(String[] args) {
		AccountManager manager = new AccountManager();
		System.out.println("Hesap: "+manager.getBalance());
		
		manager.deposit(100);
		System.out.println("Hesap: "+manager.getBalance());
		
		try{
			manager.withdraw(25);
		}catch(BalanceInsufficentException exception) {
			exception.getMessage();
		}
		System.out.println("Hesap: "+manager.getBalance());
		
		try{
			manager.withdraw(150);
		}catch(BalanceInsufficentException exception) {
			exception.getMessage();
		}
		System.out.println("Hesap: "+manager.getBalance());
	}

}
