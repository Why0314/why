import java.io.*;
/*
 * 1.
 * 源：键盘录入
 * 目的：控制台
 * 
 * 2.需求：想把键盘录入的数据存储到一个文件中
 * 源：键盘
 * 目的：文件
 * 
 * 3.需求：想要将一个文件的数据打印在控制台上。
 * 源：文件
 * 目的：控制台
 * 
 * 流操作的基本规律：
 * 最痛苦的就是流对象有很多，不知道该用哪一个
 * 
 * 通过3个明确来完成。
 * 1.明确源和目的。
 * 	源：输入流。InputStream Reader
 * 	目的：输入流。OutputStream Writer
 * 2.操作的数据是否是纯文本。
 * 	是：字符流
 * 	不是：字节流
 * 3.当体系明确后，再明确要使用哪个具体的对象。
 * 	通过设备来进行划分：
 * 	源设备：内存，硬盘，键盘
 * 	目的设备：内存，硬盘，控制台 
 * 
 * 1.
 */


public class TransStreamDemo2 {

	public static void main(String[] args) throws IOException {
		
		//BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("why.txt")));	//键盘录入最常见写法
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));	//键盘录入最常见写法
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("BufferedWriterDemo.java")));
	
		String line = null;
		while((line=br.readLine())!=null){
			if(line.equals("over"))
				break;
			//System.out.println(line);
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		br.close();
		
	}

}
