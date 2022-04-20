package iofile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Ex17 {

	public static void main(String[] args) throws Exception {
		Path base = Paths.get(".");
		Files.list(base).forEach(System.out::println);
		
		System.out.println("---");
		Files.walk(base.resolve("src")).forEach(System.out::println);
		
		System.out.println("---");
		BiPredicate<Path, BasicFileAttributes> bp = (p, attr) -> {
			return p.toFile().getName().endsWith(".jpg");
		};
		Files.find(base, 3, bp).forEach(System.out::println);
		
	}
}
