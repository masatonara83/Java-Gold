package sys;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceConditionSample implements Runnable {
	private int num = 100;
	
	public static void main(String[] args) {
		RaceConditionSample s = new RaceConditionSample();
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(s);
		exec.submit(s);
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}
		
		System.out.println(s.num);
		exec.shutdown();
	}
	
	public synchronized void add(int amount) {
		this.num = this.num + amount;
	}
	
	@Override
	public void run() {
		add(100);
		System.out.println(new Random().nextInt(10));
	}

}
