package iofile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) throws Exception {
		System.out.print("> ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		Path p = Paths.get("data", name);
		if(Files.exists(p) == false) {
			Files.createFile(p);
		}
		
		System.out.println(Files.getLastModifiedTime(p));
		System.out.println(Files.getPosixFilePermissions(p));
		
		System.out.print("delete y/n? >");
		if("y".equals(scan.nextLine())) {
			Files.delete(p);
			System.out.println("deleteed");
		}
		scan.close();
	}

}
