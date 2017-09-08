import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class javaFileList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Program Files (x86)\\ME\\Workspace");
		List<File> list = new ArrayList<File>();
		fileToList(file,list);
		writeToFile(list);
		
	}
	public static void fileToList(File dir,List<File> list){
		File[] files = dir.listFiles();
		for(File f:files){
			if(f.isDirectory())
				fileToList(f,list);
			else 
			{
				if(f.getName().endsWith(".java"))
					list.add(f);
			}
		}
	}
	public static void writeToFile(List<File> list) throws IOException{
		BufferedWriter bufw  = new BufferedWriter(new FileWriter("why.txt"));
		for(File f:list){
			bufw.write(f.toString());
			bufw.newLine();
			
		}
	}

}
