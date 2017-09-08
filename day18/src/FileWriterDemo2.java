import java.io.FileWriter;
import java.io.IOException;

/*
 * IO异常的处理方法
 */
public class FileWriterDemo2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("demo.txt");
			fw.write("why");
		}
		catch(IOException e){
			System.out.println("catch:"+e.toString());
		}
		
		finally{
			try{
				if(fw!=null);//如果多个IO流要分别判断分别关闭
					fw.close();
			}
			catch(IOException e){
				System.out.println(e.toString());
			}
		}
	}

}
