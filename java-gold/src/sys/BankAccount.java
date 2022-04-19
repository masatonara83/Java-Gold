package sys;

public class BankAccount {

	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		this.balance += amount;
	}
	
	public void withdrawals(int amount) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
		this.balance -= amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
}
