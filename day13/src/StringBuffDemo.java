/*
 * StringBuffer  是字符串缓冲区
 * 是一个容器
 * 特点：
 * 1.长度是可变化的。
 * 2.可以字节操作多个数据类型。
 * 3.最终会通过toString方法变成字符串
 * C create U update R read D delete
 * 
 * 1.储存。
 * 		StringBuffer append():将指定数据作为参数添加到已有数据结尾处
 * 		StringBuffer insert(index, 数据):可以将数据插入到指定index位置
 * 2.删除。
 * 		StringBuffer delete(start,end):删除缓冲区的数据，包含start不包含end
 * 		StringBuffer deleteCharAt(index):删除指定位置的字符。
 * 3.获取
 * 		char charAt(int index)
 * 		int indexOf(String str)
 * 		int lastIndexOf(String str)
 * 		String substring(int start,int end)
 * 4.修改
 * 		StringBuffer replace(start,end,string);
 * 		void setCharAt(int index,char ch);
 * 5.反转
 * 		StringBuffer reverse();
 * 6.public void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)
 * 						        起始位置		 结束位置		目标数组		复制到目标数组的位置
 * 				将字符从此字符串复制到目标字符数组。
 * 
 * 在JDk1.5 版本之后出现了StringBuilder
 * 
 * StringBuffer是线程同步的
 * StringBuilder是线程不同步
 * 
 * 以后开发，建议使用StringBuilder
 * 
 * 升级三个因素：
 * 1.提高效率
 * 2.简化书写
 * 3.提高安全性
 */
public class StringBuffDemo {
	public static void main(String[] args) {
		//method_reverse();
		StringBuffer sb = new StringBuffer("abcdefgh");
		char[] chs = new char[7];
		sb.getChars(2, 8, chs, 1);
		
		for(int i = 0;i<chs.length;i++){
			sop("chs["+i+"]="+chs[i]+";");
			
		}
		method_add();
		method_del();
		method_update();
		method_reverse();
	}

	public static void method_add() {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(false).append(33);
		sb.insert(1, "qq");
		sop(sb.toString());
	}

	public static void method_del() {
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.delete(0, 3);
		sb.delete(0, sb.length());//清空
		//sb.deleteCharAt(3);
		sop(sb.toString());// defh
	}

	public static void method_update() {
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.replace(0, 3, "java");
		sb.setCharAt(2, 'q');
		sop(sb.toString());
	}

	public static void method_reverse() {
		StringBuffer sb = new StringBuffer("abcdefgh");
		sb.reverse();
		sop(sb.toString());
	}

	public static void sop(String str) {
		System.out.println(str);
	}
}
