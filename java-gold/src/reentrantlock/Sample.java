package reentrantlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample {

	public static void main(String[] args) {
		Test t = new Test();
		
		ExecutorService exec = Executors.newFixedThreadPool(3);
		exec.submit(new Task(t));
		exec.submit(new Task(t));
		exec.submit(new Task(t));

	}

}
