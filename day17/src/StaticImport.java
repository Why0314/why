/*
 * StaticImport 静态导入。
 * 
 * 当类名重名时，需要指定具体的包名。
 * 当方法重名时，指定具备所属的对象还或者类。
 */

import java.util.*;
import static java.util.Arrays.*;//导入的是Arrays这个类中的所有静态成员。
import static java.lang.System.*;//导入了System类中所有静态成员
public class StaticImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println(321);
		int[] arr = {3,5,7,9};
		sort(arr);
		int index = binarySearch(arr, 5);
		System.out.println(arr);
		out.print(Arrays.toString(arr));
		System.out.println("index="+index);
	}

}
