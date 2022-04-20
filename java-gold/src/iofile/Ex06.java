package iofile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("output.txt", true);
		BufferedWriter writer = new BufferedWriter(out);
		try(writer){
			writer.newLine(); //改行
			writer.write("buffering output");
			writer.flush(); //バッファとファイルを同期させる
		}
	}

}
