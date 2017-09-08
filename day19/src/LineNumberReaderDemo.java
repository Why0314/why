import java.io.*;
/*
 * public class LineNumberReaderextends BufferedReader跟踪行号的缓冲字符输入流。
 * 此类定义了方法 setLineNumber(int) 和 getLineNumber()，
 * 它们可分别用于设置和获取当前行号。 

默认情况下，行编号从 0 开始。该行号随数据读取在每个行结束符处递增，
并且可以通过调用 setLineNumber(int) 更改行号。
但要注意的是，setLineNumber(int) 不会实际更改流中的当前位置；
它只更改将由 getLineNumber() 返回的值。 

可认为行在遇到以下符号之一时结束：换行符（'\n'）、回车符（'\r'）、回车后紧跟换行符。

 */
public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("BufferedWriterDemo.java");
		LineNumberReader lnr = new LineNumberReader(fr);
		String line = null;
		lnr.setLineNumber(100);
		while((line=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		lnr.close();
	}

}
