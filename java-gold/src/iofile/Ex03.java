package iofile;

import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("data.txt");
		
		try(reader) {
			int i = 0;
			while((i = reader.read()) != -1) {
				char c = (char) i;
				System.out.print(c);
			}
		} 

	}

}
