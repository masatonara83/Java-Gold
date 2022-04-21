
public interface EX14Sample {

	//privateはdefaultメソッドから呼び出しされるが前提で定義できる
	private void hello(String word) {
		System.out.println("hello" + word);
	}
	
	default void call(String name) {
		hello(name);
	}
}
