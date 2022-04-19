package stream;

import java.util.List;
import java.util.Optional;

public class ParallelTest {

	public static void main(String[] args) {
//		
//		List<String> list = Arrays.asList("A","B","C","D","E");
//		Stream<String> stream = list.parallelStream();
////		stream.forEach(System.out::println);
//		stream.forEachOrdered(System.out::println);
		
		List<Integer> lists = List.of(1,2,3,4,5);
//		lists.parallelStream()
//			.findAny()
//			.ifPresent(System.out::println);
		
		Optional<Integer> result = lists.stream().reduce((a,b) -> a + b);
		result.ifPresent(x -> System.out.println(x));
		
		int re = lists.stream().reduce(100, (a, b) -> a + b);
		System.out.println(re);
	}

}
