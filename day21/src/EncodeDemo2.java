import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
 * 记事本输入联通二字，再次打开时出现乱码
 * 原因是系统默认GBK编码输入
 *	因为“联通”二字用GBK编码成的二进制数，与UTF-8格式一样
 *  再次打开的时候进行解码读取，记事本用了UTF-8进行解码读取
 */
public class EncodeDemo2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "联通";

		byte[] g = s.getBytes("GBK");
		byte[] u = s.getBytes("UTF-8");
		
		for(byte b:g){
			System.out.println(Integer.toBinaryString(b&255));
		}
		System.out.println("GBK:" + Arrays.toString(g));
		System.out.println("UTF-8:" + Arrays.toString(u));
		String ss = new String(g,"GBK");
		System.out.println(ss);
	}

}
