import java.io.*;
import java.util.Arrays;

public class EncodeDemo {

	public static void main(String args[]) throws Exception {
		// TODO Auto-generated method stub
		String s = "你好";
		
		byte b1[] = s.getBytes("GBK");
		System.out.println(Arrays.toString(b1));
		String s1 = new String(b1,"GBK");
		
		System.out.println("s1="+s1);
		
	}

}
