package atmic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {

	public static void main(String[] args) {
		Value value = new AtomicValue();
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(new Task(value));
		exec.submit(new Task(value));
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println(value.get());
		exec.shutdown();
	}

}
