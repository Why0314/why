import java.io.*;

//将C盘一个文本文件复制到D盘
/*
 * 复制的原理
 * 其实就是将c盘下的文件数据存储到D盘的一个文件中
 * 
 * 步骤：
 * 1.在D盘创建一个文件，用于存储c盘文件的数据
 * 2.定义读取流和c盘文件关联
 * 3.通过不断的读写完成数据存储
 * 4.关闭资源
 */
public class CopyText {
	public static void main(String[] args) throws IOException {

		copy2();
	}

	public static void copy1() throws IOException {
		FileWriter fw = new FileWriter("java_copy.txt");
		FileReader fr = new FileReader("java.txt");
		int num = 0;
		while ((num = fr.read()) != -1) {
			fw.write(num);
		}
		fw.close();
		fr.close();
	}

	public static void copy2() {
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("java_copy2.txt");
			fr = new FileReader("java.txt");
			int len = 0;
			char[] ch = new char[1024];
			while ((len = fr.read(ch)) != -1) {
				// fw.write(ch);这样会写入1024 如果写入的数据较小会浪费内存
				fw.write(ch, 0, len);
			}
		} catch (IOException e) {
			throw new RuntimeException("读写失败");
		} finally {
			if (fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					System.out.println(e.toString());
				}
			}
				
		}

	}
}
