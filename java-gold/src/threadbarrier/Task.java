package threadbarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Task implements Runnable {
	
	private CyclicBarrier barrier;
	
	

	public Task(CyclicBarrier barrier) {
		super();
		this.barrier = barrier;
	}



	@Override
	public void run() {
		long id = Thread.currentThread().getId();
		System.out.println("START:" + id);
		
		int r = new Random().nextInt(10);
		try {
			Thread.sleep(r * 100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("END:" + id);
		try {
			this.barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			throw new RuntimeException(e);
		}

	}

}
