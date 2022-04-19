package sys;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BankSample {

	public static void main(String[] args) throws Exception {
		BankAccount A = new BankAccount(100);
		BankAccount B = new BankAccount(100);
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(() -> {
			synchronized (A) {
				A.withdrawals(20);
				synchronized (B) {
					B.deposit(20);
				}
			}
		});

		//デットロックが起こり動きが止まる
//		exec.submit(() -> {
//			synchronized (B) {
//				B.withdrawals(30);
//				synchronized (A) {
//					A.deposit(30);
//				}
//			}
//		});
		
		exec.submit(() -> {
			synchronized (A) {
				A.deposit(30);
				synchronized (B) {
					B.withdrawals(30);
				}
			}
		});
		
		Thread.sleep(3000);
		exec.shutdown();
		if(exec.isShutdown()) {
			System.out.println(A.getBalance());
			System.out.println(B.getBalance());
		}
		
	}

}
