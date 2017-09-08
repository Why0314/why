/*
 * 基本数据类型对象包装类
 * byte    Byte
 * short   Short
 * int     Integer
 * boolean Boolean
 * float   Float
 * double  Double
 * char    Character
 * 
 * 基本数据类型对象包装类的最常见作用，
 * 就是用于基本数据类型和字符串类型之间转换
 * 
 * 基本数据类型转成字符串。
 * 		基本数据类型+""
 * 		基本数据类型.toString(基本数据类型);
 * 			如：integer.toString(34);将34整数变成"34"
 * 
 * 字符串转成基本数据类型。
 * 		xxx a = xxx.parseXxx(String);  xxx代表基本数据类型
 * 		int a = Integer.parseint("123");
 * 		boolean b = Boolean.parseBoolean("true");
 * 	 非静态的方法
 * 		Integer i = new Integer("2321");
 * 		int num = i.intValue();
 * 十进制转化成其他进制
 * 	toBinaryString();2
 *  toHexString();16
 *  toOctalString();8
 * 其他进制转换成十进制。
 * 	parseInt(String,resix);
 * 
 */
public class IntegerDemo {
	public static void sop(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		int num = Integer.parseInt("4");
		
		sop("num="+(num+4));
		int x = Integer.parseInt("110", 2);
		sop("x="+x);
		sop("x="+Integer.toBinaryString(x));
	}
	
}