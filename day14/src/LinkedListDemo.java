import java.util.LinkedList;

/*
 * LinkedList:特有方法：
 * addFirst();
 * addLast();
 * 
 * getFirst();
 * getLast();
 * 获取元素，但不删除元素。如果集合中没有元素，会出现NoSunchElementException
 * 
 * removeFirst();
 * removeLast();
 * 获取元素，但是元素被删除。如果集合中没有元素，会出现NoSunchElementException
 * 
 * 在JDK1.6出现了代替方法。
 * offerFirst();
 * offerLast();
 * 
 * peekFirst();
 * peeklast();
 * 获取元素，但不删除元素，如果集合中没有元素，会返回null
 * 
 * pollFirst();
 * pollLast();
 * 获取元素，但是元素被删除。如果集合中没有元素，会返回null
 * 
 */
public class LinkedListDemo {
	public static void sop(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		method_1();
	}

	public static void method_2() {
		LinkedList link = new LinkedList();
		link.offerFirst("java01");
		link.offerFirst("java02");
		link.offerFirst("java03");
		link.offerFirst("java04");
		link.offerLast("why");
		sop(link);
		sop(link.peekFirst());
		sop(link.peekLast());
		sop(link);
		sop(link.pollFirst());
		sop(link.pollLast());
		sop(link);

	}

	public static void method_1() {
		LinkedList link = new LinkedList();
		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");
		link.addLast("why");
		sop(link);
		// get 获取元素，但不删除
		sop(link.getFirst());
		sop(link.getLast());
		sop("size=" + link.size());
		sop("remove:" + link.remove());
		sop("removeFirst:" + link.removeFirst());
		sop("removeLast:" + link.removeLast());
	}
}
