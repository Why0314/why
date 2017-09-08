import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/*
 * 字节流打印
 * PrintStream
 * 构造函数可以接受的参数类型
 * 1.File对象
 * 2.字符串路径。String 
 * 3.字节 输出流。OutputStream
 * 
 * 字符流打印
 * PrintWriter 
 * 构造函数可以接受的参数类型
 * 1.File对象
 * 2.字符串路径。String 
 * 3.字节 输出流。OutputStream
 * 4.字符输出流，Write
 * 
 */
public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out,true);//
		String line = null;
		while((line=br.readLine())!=null){
			out.println(line.toUpperCase());
			//out.flush();
			
		}
		out.close();
		br.close();
	}

}
