/*
 * System :类中的方法和属性都是静态的
 * out：标准输出，默认是控制台
 * int：标准输入，默认是键盘
 * 
 * 描述系统一些信息。
 * 
 * 获取系统属性信息：Propertise getPropertise();
 */
import java.util.*;
public class SystemDemo {
	public static void main(String[] args) {
		Properties prop = System.getProperties();
		//因为Properties是Hashtable的子类，也就是Map集合的一个子类对象。
		//那么可以通过map的方法取出该集合中的元素。
		//该集合中存储都是字符串。没有泛型定义。
		
		//如何在系统中自定义一些特有信息呢
		System.setProperty("myKey", "myValue");
		
		//可不可以在jvm启动时，动态加载一些属性信息呢？
		String v= System.getProperty("why");
		System.out.println("v="+v);//显示     v=null
		//需要在 运行时加入  比如  ：  java -Dwhy=jsd SystemDemo   注：(在cmd中运行)
		//显示                        v=jsd
		//获取指定属性的信息
		String value1 = System.getProperty("os.name");
		System.out.println("name"+value1);
		for(Object obj:prop.keySet()){
			String value = (String)prop.get(obj);
			System.out.println(obj+"-----"+value);
		}
	}
			
}
