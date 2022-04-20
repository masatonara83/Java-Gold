package iofile;

import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		//falseは上書き、trueは追記（デフォルトはfalse）
		FileWriter out = new FileWriter("output.txt",true);
		try(out) {
			out.write("\n");
			out.write("Hello Java!!");
		}
	}
}
