package reentrantlock;

public class Task implements Runnable {
	private Test test;
	
	public Task(Test test) {
		super();
		this.test = test;
	}

	@Override
	public void run() {
		try {
			test.lock();
			test.first();
			test.second();
			test.third();
		} finally {
			test.unlock();
		}
		
	}

}
