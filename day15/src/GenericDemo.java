import java.util.*;
/*
 * 泛型：JDk1.5 版本以后出现新特性。用于解决安全问题，是一个安全机制。
 * 
 * 好处
 * 1.将运行时期出现问题ClassCastException，转移到了编译时期。
 * 	方便于程序员解决问题。让运行时期问题减少，
 * 2. 避免强制转换
 * 
 * 泛型格式：通过<>来定义操作的引用数据类型
 *  
 * 在使用java提供的对象时，什么时候写泛型？
 * 
 * 通常在集合框架中很常见，
 * 只要见到<>就要定义泛型
 * 
 * 其实<> 就是用来接受类型的。
 * 
 * 当使用集合时，将集合中要储存的数据类型作为参数传递到<>中即可。
 * 
 * 
 * 
 */
public class GenericDemo {
	public static void sop(Object obj){
		System.out.println("obj");
	}
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc01");
		al.add("abc001");
		al.add("abc011");
		al.add("abc021");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
