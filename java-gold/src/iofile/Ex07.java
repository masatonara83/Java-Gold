package iofile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex07 {

	public static void main(String[] args) throws Exception {
		//画像ファイルの読み込みバッファ
		FileInputStream fis = new FileInputStream("spices.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//画像ファイルの書き出しバッファ
		FileOutputStream fos = new FileOutputStream("spices_copy.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		try(bis; bos){
			byte[] data = null;
			while((data = bis.readAllBytes()).length != 0) {
				bos.write(data);
			}
			bos.flush();
		}
	}

}
