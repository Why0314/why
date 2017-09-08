import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceDemo2 {

	public static void main(String[] args) throws IOException {
		// TOVector<E>o-generated method stub
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("2.txt"));
		v.add(new FileInputStream("3.txt"));
		
			
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		//	FileWriter fos = new FileWriter("4.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter("4.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(sis));
		/*byte[] buf = new byte[1024];		
		int len =0;	
		while((len=sis.read(buf))!=-1){
			fos.write(buf);					
		}*/
		String line = null;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		sis.close();
	}

}
