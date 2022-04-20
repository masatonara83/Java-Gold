package iofile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex10 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("sample.ser");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		try(out){
			ItemEx10 item = new ItemEx10("apple", 100);
			out.writeObject(item);
		}

	}

}
