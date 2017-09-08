/*
 * String 类适用于描述字符串事物。
 * 那么它就提供了多个方法对字符串进行操作。
 * 
 * 常见的操作有哪些？
 * "abcd"
 * 
 * 1.获取。
 * 	1.1字符串中的包含的字符数，也就是字符串的长度。
 * 		int length():获取长度
 * 	1.2根据位置获取位置上的某个字符。
 * 		char charAt(int index)
 * 	1.3根据字符获取该字符获取该字符在字符串中位置
 * 		int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
 * 		int indexOf(int ch,int fromIndex):返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
 * 		
 * 		int indexOf(String str):返回的是ch在字符串中第一次出现的位置
 * 		int indexOf(String str,int fromIndex):从fromIndex指定的位置开始，获取ch在字符串中出现的位置。
 * 2.判断
 * 	2.1字符串中是否包含某一个字符串。
 * 		boolean contains(str):
 * 		特殊之处：indexOf(str):可以索引str第一次出现的位置，如果返回-1，表示str不在字符串中存在
 * 			所以，也可以用于对指定判断是否包含。
 * 			if(str.indexOf("aa")!=-1)
 * 
 * 			而且该方法既可以判断，又可以获取出现的位置。
 * 
 * 	2.2字符中是否有内容。
 * 		boolean isEmpty():原理就是判断长度是否为0
 * 	2.3字符串是否以指定内容开头。
 * 		boolean startsWith(str);
 * 	2.4字符串是否是指定内容结尾。
 * 		boolean endsWith(str);
 * 	2.5判断字符串内容是否相同，复写了Object类中的equals方法
 * 		boolean equals(str);
 * 	2.6判断内容是否相同，并忽略大小写。
 * 		boolean equalsIgnoreCase();
 *  3.转换
 *  	3.1 将字符数组转化成字符串
 *  		构造函数：String(char[])
 *  			 	String(char[],offset,ccount):将字符数组中的一部分转成字符串
 *  		静态方法：
 *  			static String copyValueOf(char[]);
 *  			static String copyValueOf(char[] data,int offset,int count)
 *  	3.2 将字符串转成字符数组
 *  		char[] toCharArrray():
 *  	3.3 将字符数组转化成字符串
 *  		String(byte[])
 *  		String(byte[],offset,count):将字节数组中的一部分转成字符串
 *  	3.4 将字符串转化成字节数组
 *  		byte[] getBytes():
 *  	3.5 将基本数据类型转成字符串
 *  		static String valueOf(int);
 *  		static String valueOf(double);
 *  
 *  		3+"";相当于String.valueOf(3);
 *  		
 *  		特殊：字符串和字节数组在转换过程中，是可以指定编码表的。
 * 4.替换
 * 		String replace(oldchar,newchar);
 * 5.切割
 * 		String[] split(regex);
 * 6.字串。获取字符串中的一部分。
 * 		String substring(begin);
 * 		String substring(begin,end);// 包含头，不包含尾。
 * 7. 转换，去除空格，比较。
 * 		7.1 将字符串转成大写或者小写。
 * 			String toUpperCase();
 * 			String toLowerCase();
 * 		7.2 将字符串两端的多个空格去除
 * 			String trim();
 * 		7.3 对两个字符串进行自然排序比较。
 * 			int compareTo(String);
 */
public class StringMethodDemo {
	public static void method_7() {
		String s = "   Hello JaVa";
		sop(s.toUpperCase());//变大写
		sop(s.toLowerCase());//变小写
		sop(s.trim());//将字符串两端的多个空格去除
		
		//对两个字符串进行自然排序比较。
		String s1 = "asd";
		String s2 = "asf";
		sop(s1.compareTo(s2));
	}

	public static void method_subString() {
		String s = "abcdefg";
		sop(s.substring(1));// 从指定位置开始到结尾。如果角标不存在，会出现字符串角标越界异常。
		sop(s.substring(2, 5));// 包含头，不包含尾。s.subString(0,s.length);
		sop(s.substring(0, s.length()));// 包含头，不包含尾。s.subString(0,s.length);

	}

	public static void method_split() {
		String s = "张三,李四 ,王五,赵流";
		sop(s);
		String[] arr = s.split(",");//切割
		for (int i = 0; i < arr.length; i++) {
			sop(arr[i]);
		}
	}

	public static void method_replace() {
		String s = "hello java";
		String s1 = s.replace("a", "n");//把a替换成n
		String s2 = s.replace("c", "n");// 如果要替换的字符不存在，返回的还是原串。
		String s3 = s.replace("java", "word");//java换成word
		sop("s=" + s);
		sop("s1=" + s1);
		sop("s2=" + s2);
		sop("s3=" + s3);

	}

	public static void method_trans() {
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
		/*
		 * 转换
		 */
		String s = new String(arr, 1, 3);//构造函数
		sop("s=" + s);
		// String s2 = String.copyValueOf(arr,2,4);
		sop("s=" + String.copyValueOf(arr, 2, 4));//静态方法

		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			sop("ch=" + chs[i]);
		}
	}

	public static void method_is() {
		String str = "Array.java";
		// 判断文件名称是否是Array单词开头。
		sop(str.startsWith("Array"));
		// 判断文件名称是否是.java的文件。
		sop(str.endsWith(".java"));
		// 将指定字符串连接到此字符串的结尾。
		sop(str.concat("Demo"));
		//str=str.concat("Demo");
		sop(str);
		// 判断文件中是否包含Demo
		sop(str.contains("Demo"));
	}

	public static void method_get() {
		String str = "adbcdefd";
		// 长度
		sop(str.length());
		// 根据索引获取字符。
		sop(str.charAt(4));// 当访问到字符串中不存在的角标时会发生StringIndexOutOfBoundsException。
		// 根据字符获取索引。
		sop(str.indexOf("c"));// 如果没有找到，返回-1
		sop(str.indexOf("b",2));
		// 反向索引一个字符出现的位置。
		sop(str.lastIndexOf("d"));// 打印7  d出现的最后一个位置的索引
	}

	public static void main(String[] args) {
		//method_get();
		//method_is();
		//method_trans();
		method_replace();
	//	method_split();
		method_subString();
		method_7();
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
