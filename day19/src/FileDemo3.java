import java.io.*;
/*
 * 列出指定目录下文件或者文件夹，包含子目录中的内容。
 * 也就是列出了指定目录下所有内容。
 * 
 * 因为目录中还有目录，只要使用同一个列出目录功能的函数完成即可
 * 在列出过程中出现的还是目录的话，还可以再次调用本功能
 * 也就是函数自身调用自身
 * 这种表现形式，或者编程手法，称为递归
 */
public class FileDemo3 {
	public static void main(String[] args) {
		File dir = new File("D:\\WEXAM");
		showDir(dir);
	}

	public static void showDir(File dir) {
		System.out.println(dir);
		File[] files = dir.listFiles();
		for (int f = 0; f < files.length; f++) {
			if (files[f].isDirectory())
				showDir(files[f]);
			else
				System.out.println(files[f]);
		}
	}
}
