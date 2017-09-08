import java.io.*;

/*
 * 
 */
public class CopyMp3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//long start = System.currentTimeMillis();
	    int a  = fun();
	    System.out.println(a);
	}

	public static void copy_1() throws IOException {
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("D:\\CloudMusic\\薛之谦 - 动物世界.mp3"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("动物世界.mp3"));
		int len = 0;
		while ((len = bufis.read()) != -1) {
			bufos.write(len);
		}
		bufis.close();
		bufos.close();
	}
	public static int fun(){
		int i = 0;
		try{
			return i+1;
		}catch(Exception e){
			e.toString();
		}
		finally{
			System.out.println("asd");
		}
		return i;
	}
	

}
