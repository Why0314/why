import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try{
			fr = new FileReader("java.txt");
			int num = 0;
			char[] ch = new char[1024];
			while((num = fr.read(ch))!=-1){
				System.out.println(new String(ch,0,num));
			}
		}
			catch(IOException e){
				System.out.println("catch:"+e.toString());
			}
			
			finally{
				try{
					if(fr!=null)
						fr.close();
				}
				catch(IOException e){
					System.out.println(e.toString());
				}
			}
	}

}
