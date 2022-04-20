package iofile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex11 {

	public static void main(String[] args) throws Exception{
		ObjectOutputStream out = 
				new ObjectOutputStream(
						new FileOutputStream("emp.ser"));
		
		try(out){
			Employee emp = new Employee("sample", "0312345678");
			out.writeObject(emp);
		}

	}

}
