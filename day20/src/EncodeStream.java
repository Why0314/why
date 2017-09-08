import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EncodeStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeText();
		readText();
	}

	public static void readText() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"),"gbk");
		char[] b = new char[10];
		int len = isr.read(b);
		
		String s = new String(b,0,len);
		System.out.println(s);
		isr.close();
	}

	public static void writeText() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf.txt"), "UTF-8");
		osw.write("你好");
		osw.close();

	}

}
