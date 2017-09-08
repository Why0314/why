import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
/*
 * Properties是hashtable的子类。
 * 也就是说它具备map集合的特点。而且它里面存储的键值对都是字符串。
 * 
 * 是集合中和IO技术相结合的集合容器。
 * 
 * 该对象的特点：可以用于键值对形式的配置文件。
 * 
 * 那么在加载数据时，需要数据有固定格式：键=值。
 */
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	setAndGet();
		//method_1();
		loadDemo();
		
	}
	public static void loadDemo()throws IOException{
		Properties prop = new Properties();
		FileReader fis = new FileReader("info.txt");
		//将流中的数据加载进集合。
		prop.load(fis);   
		prop.setProperty("whhy", "12");
		FileWriter fos = new FileWriter("info.txt");
		prop.store(fos, "haha");
		prop.list(System.out);
	
		//fos.close();
		fis.close();
		
	}
	//演示，如何将流中的数据存储到集合中
	//想要将info.txt中的键值数据存到集合中进行操作
	/*
	 * 1.用一个流和info.txt文件关联
	 * 2.读取一行数据，将该行数据用"="进行切割。
	 * 3.等号左边作为键，右边作为值。存入到Properties集合即可
	 * 
	 */
	public static void method_1() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("info.txt"));
		String line = null;
		Properties prop = new Properties();
		
		while((line=br.readLine())!=null){
			//System.out.println(line);
			String[] arr = line.split("=");
			prop.setProperty(arr[0], arr[1]);
					
		}
		br.close();
		System.out.println(prop);
	}
	
	public static void setAndGet() {
		Properties prop = new Properties();
		prop.setProperty("why", "22");
		prop.setProperty("jsd", "18");
		
		prop.put(123, 456);
		
		System.out.println(prop);
		String value = prop.getProperty("why");
		System.out.println(value);
		Set<String> names = prop.stringPropertyNames();
		for(String s:names){
			System.out.println(s+":"+prop.getProperty(s));
		}
		
	}

}
