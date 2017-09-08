import java.io.*;
/*
 * 字符读取流缓冲区：
 * 该缓冲区提供了一个一次读一行的方法 readLine，方便于对文本数据的获取。
 * 当返回null时，表示读到文本末尾。
 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建一个读取流对象和文件相关联
		FileReader fr = new FileReader("buf.txt");
		//为了提高效率。加入缓冲技术。将字符读取流对象作为参数传递给缓冲对象的构造函数。
		BufferedReader bufr = new BufferedReader(fr);
		/*System.out.println((char)bufr.read());//读一个
		System.out.println(bufr.readLine());//读一行
*/		String line = null;
		while((line=bufr.readLine())!=null){
			System.out.println(line);
		}
		bufr.close();
	}

}
