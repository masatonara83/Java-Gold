package iofile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex15 {

	public static void main(String[] args) throws IOException {
		Path sample = Paths.get("data", "data.txt");
//		Path outFile = Paths.get("data", "data_copy.txt");
//		Files.copy(sample, outFile);
		
		
		Path dir = Paths.get("dir", "subdir");
		Path dest = dir.resolve(Paths.get("data.txt"));
		Files.move(sample, dest);
	}

}
