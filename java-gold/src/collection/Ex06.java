package collection;

import java.util.Collection;
import java.util.List;

public class Ex06 {

	public static void main(String[] args) {
		List<Integer> a = List.of(1,2,3);
		List<String> b = List.of("A","B","C");
		
		printAll(a);
		printAll(b);
		
	}
	
	private static void printAll(Collection<?> collection) {
		collection.stream().forEach(x -> System.out.println(x));
	}
}
