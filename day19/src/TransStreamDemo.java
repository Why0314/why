import java.io.*;

/*
 * 通过刚才的键盘录入一行数据并打印其大写，发现其实就是读一行数据的原理。
 * 也就是readLine方法
 * 
 * 能不能直接使用readLine方法来完成键盘录入的一行数据读取呢?
 * 
 * readLine方法是BufferedReader类中的方法。
 * 
 * 而键盘录入的read方法是字节流 InputStream的方法
 */
public class TransStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
	/*	OutputStream out = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bufw = new BufferedWriter(osw);*/
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*//获取键盘录入对象
		InputStream in = System.in;
		//BufferedRead br = new BufferedReader(is)
		//将字节流对象转成字符流对象，使用转换流。InputStreamReader
		InputStreamReader isr = new InputStreamReader(in);
		
		//为了提高效率，将字符串进行缓冲区技术高效操作，使用BufferedReder
		BufferedReader br = new BufferedReader(isr);*/
		
		//键盘录入最常见写法
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		
		
		
		
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
