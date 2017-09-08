import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo33 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("demo.txt",true);
			fw.write("\r\njsd74");
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
		finally{
			try{
				if(fw!=null)
					fw.close();
				
			}
			catch(IOException e){
				System.out.println(e.toString());
			}
			
		}
	}
}
