import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class SplitFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// splitFile();//切割
		merge();//合成 
	}

	public static void merge() throws IOException {
		ArrayList<FileInputStream> al = new ArrayList<>();

		for (int x = 1; x <= 4; x++) {
			al.add(new FileInputStream(x + ".avi"));
		}

		final Iterator<FileInputStream> it = al.iterator();

		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
			public boolean hasMoreElements() {
				return it.hasNext();
			}

			public FileInputStream nextElement() {
				return it.next();
			}

		};
		SequenceInputStream sis = new SequenceInputStream(en);

		FileOutputStream fos = new FileOutputStream("why.avi");

		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = sis.read(buf)) != -1) {
			fos.write(buf);

		}
		fos.close();
		sis.close();

	}

	public static void splitFile() throws IOException {
		FileInputStream fis = new FileInputStream("java.avi");
		FileOutputStream fos = null;
		int len = 0;
		int count = 1;
		byte[] buf = new byte[1024 * 1024 * 10];
		while ((len = fis.read(buf)) != -1) {
			fos = new FileOutputStream(count++ + ".avi");
			fos.write(buf, 0, len);
			fos.close();
		}
		fis.close();
	}

}
