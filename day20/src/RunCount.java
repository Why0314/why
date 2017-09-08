import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 用于记录应用程序运行次数。
 * 如果使用次数已到，那么给出注册提示
 * 
 * 很容易想到的是：计数器。
 * 可是该计数器定义在程序中，随着程序的运行而在内存中存在，并进行自增。
 * 可是随着该应用程序的退出，该计数器也在内存中消失了
 * 
 * 下一次在启动该程序，又重新开始从0计数。
 * 这样不是我们想要的
 * 
 * 程序即使结束了，该计数器的值也存在。
 * 下次程序启动会先加载计数器的值并加1后再重新存储起来
 * 
 * 所以要建立一个配置文件。用于记录该软件的使用次数
 * 
 * 该配置文件使用键值对的形式
 * 这样便于阅读数据，并操作数据
 * 
 * 键值对数据是map集合
 * 数据是以文件形式存储的，并使用io技术
 * 那么map+io-->properties
 * 
 * 配置文件可以实现应用程序数据的共享
 * 
 */
public class RunCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		File file = new File("count.ini");
		if(!file.exists())
			file.createNewFile();
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		int count = 0;
		String value = prop.getProperty("time");
		if(value!=null){
			count = Integer.parseInt(value);
			if(count>=5){
				System.out.println("给钱才给用");
				return ;
			}
		}
		count++;
		prop.setProperty("time", count+"");
		
		FileOutputStream fos = new FileOutputStream(file);
		prop.store(fos,"");
		
		fos.close();
		fis.close();
			
		
	}

}
