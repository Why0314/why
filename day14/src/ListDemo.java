
/*
 * Collection
 * 	|--List:元素是有序的，元素可以重复。因为该集合体系有索引。
 * 		--ArrayList:底层的数据结构使用的是数据结构。特点：查询速度快，但增删稍慢。线程不同步。
 * 		--LinkedList:底层使用的是链表数据结构。特点：增删很快，查询稍慢。
 * 		--Vector:底层是数组结构，线程同步。被ArrayList替代了。
 * 	|--Set:元素是无序的，元素不可以重复
 * 
 *List:
 *	特有方法。凡是可以操作角标的方法都是该体系特有的方法。
 *增
 *	add(index,element);
 *	addAll(index,Collection);
 *删
 *	remove（index）；
 *改
 *	set(index,element);
 *查
 *	get(idex);
 *	subList(from,to);
 *	ListIterator();
 *
 *List集合特有的迭代器。ListIterator是Iterator的子接口
 *在迭代时，不可以通过集合对象操作中的元素
 *因为会发生ConcurrentModificationException异常。
 *
 *所以，在迭代器时，只能用迭代器的方法操作元素，可是Iterator方法是有限的
 *只能对元素进行判断，取出，删除的操作
 *如果想要其他的操作如添加，修改等，就需要使用其子接口，ListIterator。
 *
 *该接口只能通过List集合的ListIterator方法获取
 */
import java.util.*;

public class ListDemo {
	public static void sop(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		method_2();
	}

	public static void method_1() {
		ArrayList al = new ArrayList();
		// 1.添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		sop(al);
		al.add(1, "why");
		sop(al);
		al.remove(3);
		sop(al);
		al.set(0, "jsd");
		sop(al);
		sop(al.get(1));
		sop(al.subList(0, 2));
		Iterator it = al.iterator();
		while (it.hasNext()) {
			sop("next:" + it.next());
		}
		for (int i = 0; i < al.size(); i++) {
			sop("al[" + i + "]=" + al.get(i));

		}
	}

	public static void method_2() {
		ArrayList al = new ArrayList();
		// 1.添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		sop(al);
		ListIterator li = al.listIterator();
		sop("hasNext():" + li.hasNext());
		sop("hasPrevious():" + li.hasPrevious());
		while (li.hasNext()) {
			Object obj = li.next();
			if (obj.equals("java02")) {
				// li.add("why");
				li.set("jsd");
			}
		}
		sop(al);
		sop("hasNext():" + li.hasNext());
		sop("hasPrevious():" + li.hasPrevious());
		while (li.hasPrevious()) {
			sop("pre:" + li.previous());
		}
		sop(al);

	}

}
