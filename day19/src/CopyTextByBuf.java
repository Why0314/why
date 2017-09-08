import java.io.*;

public class CopyTextByBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		try{
			bufr = new BufferedReader(new FileReader("BufferedWriterDemo.java"));
			bufw = new BufferedWriter(new FileWriter("BufferedWriterDemo_copy.java"));
			String line = null;
			while((line=bufr.readLine())!=null){
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e){
			throw new RuntimeException("读写失败");
		}
		finally{
			try{
				if(bufr!=null)
					bufr.close();			
			}
			catch(IOException e){
				throw new RuntimeException("写失败");
			}
			try{
				if(bufw!=null)
					bufw.close();			
			}
			catch(IOException e){
				throw new RuntimeException("读失败");
			}
		}
	}

}
