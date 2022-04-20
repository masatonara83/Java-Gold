package iofile;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Ex18 {

	public static void main(String[] args) throws Exception {
		Path dir = Paths.get("dir", "data");
//		if(Files.exists(dir) == false) {
//			Files.createDirectories(dir);
//		}
//		
//		Files.createFile(dir.resolve(Paths.get("a.txt")));
//		Files.createFile(dir.resolve(Paths.get("b.txt")));
//		Files.createFile(dir.resolve(Paths.get("c.txt")));
//		
//		Files.list(dir).forEach(System.out::println);
		
		Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(
					Path file,
					BasicFileAttributes attrs
					) throws IOException{
				Files.delete(file);
				return FileVisitResult.CONTINUE;
			}
		});
		Files.delete(dir);
		System.out.println("delete");

	}

}
