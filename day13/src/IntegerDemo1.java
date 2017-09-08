/*
 * JDK1.5版本后新特性
 */
public class IntegerDemo1 {
	public static void sop(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Integer x = 3;// 自动装箱。//new Integer(3);3是对象
		x = x + 2;
		sop("x=" + x);

		Integer n = 127;
		Integer m = 127;
		sop("m==n:" + (m == n));
		sop("m.equals(n):" + m.equals(n));// 比较此对象与指定对象
		Integer a = 128;
		Integer b = 128;
		sop("a==b:" + (a == b));// 结果为true。因为a和b指向同一个Integer对象
								// 因为当数值在byte范围内容，对于JDK新特性，如果该数值已经存在，则不会再开辟新空间
								//
		System.out.println(a.intValue()==b.intValue());//
	}
}
