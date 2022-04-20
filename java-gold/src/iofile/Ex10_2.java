package iofile;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex10_2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("sample.ser");
		ObjectInputStream in = new ObjectInputStream(fis);
		try(in){
			Object obj = in.readObject();
			ItemEx10 item = (ItemEx10) obj;
			System.out.println(item);
		}
	}
}
