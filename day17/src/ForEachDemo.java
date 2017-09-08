import java.util.ArrayList;

/*
 * 格式：
 * for(数据类型 变量名 ： 被遍历的集合(Collection)或者数组)
 * {
 * 
 * }
 * 对集合进行遍历，
 * 只能获取集合元素，但是不能对集合进行操作。底层还是Iterator，只是 为了简化书写
 * 
 * 迭代器除了遍历，还可以进行remove集合中元素的动作
 * 如果是用ListIterator,还可以在遍历过程中对集合进行增删改差的动作。
 * 
 * 
 * 传统for和增强for有什么区别
 * 
 * 高级for有一个局限性，必须有遍历的目标。
 * 
 * 
 */
public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		for(String s:al){
			System.out.println(s);
		}
	}

}
