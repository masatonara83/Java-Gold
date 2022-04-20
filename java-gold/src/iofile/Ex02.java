package iofile;

import java.io.File;
import java.io.FileFilter;

public class Ex02 {

	public static void main(String[] args) {
		//ファイルの中身を確認
		File rootDir = new File(".");
		
		FileFilter filter = (path) -> {
			if(path.isDirectory()) {
				return true;
			}
			if(path.getName().endsWith(".java")) {
				return true;
			}
			return false;
		};
		
		showTree(rootDir, filter, " ");
	}
	
	private static void showTree(File dir, FileFilter filter, String indent) {
		File[] files = dir.listFiles(filter);
		for (File file : files) {
			System.out.println(indent + file.getName());
			if(file.isDirectory()) {
				showTree(file, filter, indent + "  ");
			}
		}
	}

}
