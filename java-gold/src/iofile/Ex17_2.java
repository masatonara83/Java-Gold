package iofile;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex17_2 {

	public static void main(String[] args) throws Exception {
		Path base = Paths.get(".");
		DirectoryStream<Path> dirs = 
				Files.newDirectoryStream(base);
		for (Path path : dirs) {
			System.out.println(path.getFileName());
		}
	}
}
