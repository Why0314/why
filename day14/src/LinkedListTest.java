import java.util.LinkedList;
/*
 * 用LinkedList写堆栈 队列
 */

public class LinkedListTest {
	public static void sop(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		DuiZhan dl = new DuiZhan();
		dl.myAdd("java01");
		dl.myAdd("java02");
		dl.myAdd("java03");
		dl.myAdd("java04");
		dl.myAdd("java05");
		while (!dl.isNull()) {
			sop(dl.myGet());
		}
		
	}
}

class DuiZhan {
	private LinkedList<String> link;

	DuiZhan() {
		link = new LinkedList<>();
	}

	
	public void myAdd(String st) {
		link.addFirst(st);
	}

	public Object myGet() {
		return link.pollFirst();
	}

	public boolean isNull() {
		return link.isEmpty();
	}

}
