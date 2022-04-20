package iofile;

import java.io.File;
import java.io.IOException;

public class Sample {

	public static void main(String[] args) throws IOException {
		File file = new File("data.txt");
		if(file.exists() == false) {
			file.createNewFile();
		}
		System.out.println(file.getAbsolutePath());
		
		File dir = new File("data");
		if(dir.exists() == false) {
			dir.mkdir();
		}
		System.out.println(dir.getAbsolutePath());
	}

}
