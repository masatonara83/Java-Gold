package iofile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex14 {

	public static void main(String[] args) throws Exception {
		//getメソッドの第2引数は可変長引数になっている
		Path dir = Paths.get("dir", "subdir");
		if(Files.exists(dir) == false) {
			Files.createDirectories(dir);
		}
		
		Path a = Paths.get("data.txt");
		Files.createFile(dir.resolve(a));

	}

}
