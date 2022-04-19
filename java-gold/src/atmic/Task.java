package atmic;

public class Task implements Runnable {

	private Value value;
	
	
	public Task(Value value) {
		this.value = value;
	}

	@Override
	public void run() {
		this.add(100);
	}
	
	public void add(int num) {
		this.value.add(num);
	}

}
