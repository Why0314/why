import java.io.*;

/*
 * 复制一个图片
 * 思路：
 * 1.用字节 读取流对象和图片关联。
 * 2.用字节写入流对象创建一个图片文件。用于存储获取到的图片数据。
 * 3.通过循环读写，完成数据的存储。
 * 4.关闭资源
 * 
 */
public class CopyPic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("why.jpg");
			fos = new FileOutputStream("why_copy.jpg");
			byte[] ch = new byte[1024];
			int len = 0;
			while((len=fis.read(ch))!=-1){
				fos.write(ch);
			}
		}
		catch(IOException e){
			//System.out.println(e.toString());
			throw new RuntimeException("复制文件失败");
		}
		finally{
			try{
				if(fis!=null)
					fis.close();
					
			}catch(IOException e){
				//System.out.println(e.toString());
				throw new RuntimeException("读取关闭失败");
			}
			try{
				if(fos!=null)
					fos.close();
					
			}catch(IOException e){
				//System.out.println(e.toString());
				throw new RuntimeException("写入关闭失败");
			}
		}
	}

}
