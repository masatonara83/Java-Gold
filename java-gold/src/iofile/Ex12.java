package iofile;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex12 {

	public static void main(String[] args) {
		Path path = Paths.get("data", "data.txt");
		System.out.println(path.toAbsolutePath());
		
		File file = new File("output.txt");
		Path path2 = file.toPath();
		System.out.println(path2.toAbsolutePath());

	}

}
