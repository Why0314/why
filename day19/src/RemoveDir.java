import java.io.*;

public class RemoveDir {
	public static void main(String[] args) {
		File dir = new File("D:\\jisupdf");
		removeDir(dir);
	}

	public static void removeDir(File dir) {
		File[] files = dir.listFiles();
		for (int x = 0; x < files.length; x++) {
			if (files[x].isDirectory())
				removeDir(files[x]);
			else
				System.out.println(files[x].toString() + ":——File——:" + files[x].delete());

		}
		System.out.println(dir+"::dir::"+dir.delete());

	}
}
