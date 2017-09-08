import java.io.*;
/*
 * File 类常见方法：
 * 1，创建、
 * 		boolean createNewFile()：在指定位置创建文件，如果该文件已经存在，则不创建，返回false
 * 							和输出流不一样，输出流对象一建立创建文件，而且文件已经存在的话，会覆盖
 * 	    boolean mkdir()   创建此抽象路径名指定的目录。 
 		boolean mkdirs() 创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。 
 * 2.删除。
 * 		boolean delete(); 删除失败返回false
 * 		void deleOnExit();在程序退出时删除指定的文件
 * 3.判断
 * 		boolean exists():文件是否存在
 * 		isFile();是否是一个标准文件。
 * 		isDirectory();是否是一个目录。
 * 		isHidden();是否是一个隐藏文件。
 * 		isAbsolute();是否为绝对路径名。
 * 4.获取信息
 * 		 String getParent() 返回此抽象路径名父目录的路径名字符串；
 *  				如果此路径名没有指定父目录，则返回 null。 
 *   	 String getPath();将此抽象路径名转换为一个路径名字符串。 
 * 		 File getAbsoluteFile();返回此抽象路径名的绝对路径名形式。 
 * 		 String getAbsolutePath();返回此抽象路径名的绝对路径名字符串。 
 * 		long lastModified() 返回最后修改时间
 * 
 * 
 */
public class FileDemo {
	public static void main(String[] args) {
		/*File f = new File("动物世界.mp3");
		System.out.println(f.isFile());
		System.out.println(f.isAbsolute());
		System.out.println(f.lastModified());
		method_5();*/
		method_4();
	}
	public static void method_5(){
		File f1 = new File("动物世界.mp3");
		File f2 = new File("D:/动物世界.mp3");
		System.out.println(f2.renameTo(f1));
	}
	public static void method_4(){
		File f = new File("file.txt");
		System.out.println("抽象路径:"+f.getPath());//上面装啥，这返回啥
		System.out.println("绝对路径名-文件"+f.getAbsolutePath());//返回绝对路径名，如果文件不存在，就默认当前父目录路径
		System.out.println("父目录"+f.getParent());//该方法返回的是绝对路径中的父目录。如果获取的是相对路径，返回null
											//如果相对路径中有上一层目录那么该目录就是返回结果
		try {
			System.out.println("规范形式"+f.getCanonicalFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
