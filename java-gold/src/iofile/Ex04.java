package iofile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("data.txt");
		BufferedReader reader = new BufferedReader(fr);
		
//		try(reader) {
//			String line = null;
//			while((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//		} 
		
		//strreamAPI版
		try(reader) {
			reader.lines().forEach(System.out::println);
		}

	}

}
