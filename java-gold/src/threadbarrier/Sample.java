package threadbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {
	public static void main(String... args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		
		CyclicBarrier barrier = new CyclicBarrier(5, () -> {
			System.out.println("it's all done.");
		});
		for(int i = 0; i < 5; i++) {
			exec.submit(new Task(barrier));
		}
	}
}
