import java.io.*;

/*
 * RandomAccessFile
 * 
 * 
 * 该类不算是IO体系中的子类。
 * 而是直接继承自Object
 * 
 * 但是它是IO包中的成员。因为它具备读和写功能。
 * 内部封装了一个数组，而且通过指针对数组元素进行操作。
 * 可以通过getFilePointer获取指针位置。
 * 同时可以通过seek改变指针位置
 * 
 * 其实完成读写的原理就是内部封装了字节输入流和输出流
 * 
 * 通过构造函数可以看出，该类只能操作文件。
 * 而且操作文件还有模式： 只读r  读写rw  等
 * 如果模式为只读 r。不会创建文件。会去读取一个已存在文件，如果该文件不存在，则会出现异常。
 * 如果模式rw。操作的文件不存在，会自动创建。如果存在则不会覆盖
 * 
 */
public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeFile();
		readFile();
	}
	
	public static void readFile()throws IOException{
	
		RandomAccessFile raf = new RandomAccessFile("ran.txt","r");
		raf.seek(8);
		byte[] len = new byte[4];
		raf.read(len);
		String name = new String(len);
		
		int age = raf.readInt();
		System.out.println(name);
		System.out.println(age);
		raf.close();
		
	}
	public static void writeFile()throws IOException{
		RandomAccessFile raf = new RandomAccessFile("ran.txt", "rw");
		
		raf.write("李四".getBytes());
		raf.writeInt(97);
		
		raf.write("王五".getBytes());
		raf.writeInt(71);
		
		raf.close();
		
	}

}
