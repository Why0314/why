import java.io.*;

//字节流 写文件不用刷新
public class FileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readFile_3();
	}

	public static void readFile_1() throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		int ch = 0;

		while ((ch = fis.read()) != -1) {
			System.out.print((char) ch);

		}
		fis.close();
	}

	public static void readFile_2() throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		// char[] ch = new char[1204];
		byte[] buf = new byte[1024];
		int num = 0;

		while ((num = fis.read(buf)) != -1) {
			System.out.print(new String(buf, 0, num));

		}
		fis.close();
	}

	public static void readFile_3() throws IOException {
		FileInputStream fis = new FileInputStream("fos.txt");
		byte[] buf = new byte[fis.available()];// 定义一个刚刚好的缓冲区，不用再循环了
		fis.read(buf); // fis.available()获取文件内的字节个数
		System.out.print(new String(buf));
		fis.close();
	}

	public static void writeFile() throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		fos.write("asdsad".getBytes());
		fos.close();
	}

}
