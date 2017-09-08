/*
 * JDK1.5版本出现的新特性。
 * 
 * 方法的可变参数。
 * 在使用时注意：可变参数一定要定义在参数列表最后面。
 * 
 * 
 */
public class ParamMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show("asd");
	}
	public static void show(String...is){//is 定义了一个数组
		System.out.println(is);			//数据类型随意
		System.out.println(is.length);
		System.out.println(is[0]);
	}

}
