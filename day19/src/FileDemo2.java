import java.io.File;
import java.io.FilenameFilter;



public class FileDemo2 {
	public static void main(String[] args) {
		listDemo();
	}

	public static void listDemo(){
		File f = new File("D:/CloudMusic");
		//调用list方法的File对象必须是封装了一个目录，该目录还必须存在。
		String[] name = f.list(new FilterByMp3());//打印目录下所有文件和文件夹，包括隐藏的（传入了个 过滤器，只过滤出MP3文件）
		for(String names:name){
			System.out.println(names);
		}
	}
	public static void listRootDemo() {
		File[] files = File.listRoots();//获取有效根目录
		for (File f : files) {
			System.out.println(f);
		}
	}
	public static class FilterByMp3 implements FilenameFilter {
		 
	    @Override
	    public boolean accept(File dir, String name) {
	        return name.endsWith(".mp3");
	    }
	 
	}
}
