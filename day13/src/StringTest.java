/*
 * 1.模拟trim方法，去除字符串两端的空格。
 * 	思路：
 * 		1.判断字符串第一个位置是否是空格，如果是继续向下判断，直到不是空格为止。
 * 			结尾处判断空格也是如此
 * 		2.当开始和结尾都判断到不是空格时，就是要获取的字符串。
 * 2.将一个字符串进行反转，将字符串中的指定部分进行反转，“abcdefg";"abfedcg"
 * 	思路
 *		1，曾经学习过对数组的元素进行反转。
 *		2，将字符串变成数组，对数组反转。
 *		3，将反转后的数组变成字符串。
 *		4，只要将或反转的部分的开始和结束位置作为参数传递即可。
 * 3.获取一个字符串在另一个字符串中出现的次数。
 * 	“abkkcdkkekkkskk”
 * 	思路：
 * 		1，定义个计数器
 * 		2，获取kk第一次出现的位置。
 * 		3，从第一次出现的位置后剩余的字符串中继续获取kk出现的位置
 * 			每获取一次就计数一次
 * 		4，当获取不到时，计数完成。
 * 4.获取两个字符串中最大相同的字串，第一个动作：将短的那个串进行长度依次递减的字串打印
 * 		“abcwerthelloyuidoef"
 * 		"cvhellobnm"
 * 		思路：
 *		1.将短的那个字串按照长度递减的方式获取到。
 *		2.将每获取到的字串去长串中判断是否包含
 *			如果包含，已经找到 。				
 * 
 *
 */

public class StringTest {
	// 练习一，去除字符串两端空格
	public static String myTrim(String str) {
		int start = 0;
		int end = str.length() - 1;
		while (start <= end && str.charAt(start) == ' ') {
			start++;
		}
		while (start <= end && str.charAt(end) == ' ') {
			end--;
		}
		return str.substring(start, end + 1);
	}

	// 练习二，字符串反转
	public static String reverseString(String s, int start, int end) {
		// 字符串变数组
		char[] chs = s.toCharArray();
		// 反转数组   a b c d e f g
		reverse(chs, start, end);
		// 将字符数组变成字符串
		return new String(chs);
	/*	String s1=s.substring(0,start);//ab 0-2
		String s2=s.substring(end+1,s.length());//fg 4-6
		String ss=s.substring(start, end+1);//cde 2-4
		StringBuffer sb = new StringBuffer(ss);
		sb.reverse();
		return s1+ss+s2;*/
	}

	public static String reverseString(String s) {
		return reverseString(s, 0, s.length   ());
	}

	private static void reverse(char[] arr, int x, int y) {
		for (int start = x, end = y - 1; start < end; start++, end--) {
			swap(arr, start, end);
		}
		
	}

	private static void swap(char[] arr, int x, int y) {
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	// 练习三.获取一个字符串在另一个字符串中出现的次数
	public static int getSubCount(String str, String key) {
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(key)) != -1) {
			str = str.substring(index + key.length());
			count++;
		}
		return count;
	}

	// 练习三.方法二 获取一个字符串在另一个字符串中出现的次数
	public static int getSubCount_2(String str, String key) {
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(key, index)) != -1) {
			index = index + key.length();
			count++;
		}
		return count;
	}

	// 练习四：
	public static String getMaxSubString(String s1, String s2) {
		String max = "";
		String min = "";
		max = s1.length() > s2.length() ? s1 : s2;
		min = max == s1 ? s2 : s1;
		sop("max:" + max + "---min:" + min);
		for (int x = 0; x < min.length(); x++) {
			for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, z++) {
				String temp = min.substring(y, z);
				if (max.contains(temp)) {// if(s1.indexOf(temp)!=-1)
					return temp;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// 练习一
		String s1 = "   why jsd       ";
		sop("myTrim:" + myTrim(s1));
		// 练习二
		String s2 = "abcdefg";
		sop("reverseString:" + reverseString(s2));
		sop("reverseString:" + reverseString(s2, 1, 4));
		// 练习三
		String s3 = "kkabkkcdkkekkks";
		sop("getSubCount:" + getSubCount(s3, "kk"));
		sop("getSubCount:" + getSubCount_2(s3, "kk"));
		sop("count===" + s3.split("kk").length);// 第一个kk会把字符串割成一个空字符串""和一个"abkkcdkkekkks"
		// 练习四
		String s4 = "abcwerthelloyuidoef";
		String s5 = "cvhellobnm";
		sop("getMaxSubString:" + getMaxSubString(s4, s5));
	}

	public static void sop(String str) {
		System.out.println(str);
	}
}
