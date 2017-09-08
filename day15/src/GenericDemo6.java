import java.util.ArrayList;
import java.util.Iterator;

/*
 *  ? 通配符。也可以理解为占位符。
 *  泛型的限定；
 *  ? extends E :可以接收E类型或者E的子类型。上限
 *  ? super E :可以接收E类型或者E的父类型。下限
 */
public class GenericDemo6 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(5);
		al2.add(6);
		al2.add(4);
		al2.add(0);
		printColl(al);
		printColl(al2);

		ArrayList<Person> al3 = new ArrayList<Person>();
		al3.add(new Person("Person1"));
		al3.add(new Person("Person2"));
		al3.add(new Person("Person3"));

		printColl2(al3);
		ArrayList<Student2> al4 = new ArrayList<Student2>();
		al4.add(new Student2("Student1"));
		al4.add(new Student2("Student2"));
		al4.add(new Student2("Student3"));
		printColl2(al4);
	}

	public static void printColl(ArrayList<?> al) {
		Iterator<?> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void printColl2(ArrayList<? extends Person> al) {
		Iterator<? extends Person> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}
}

class Person {
	private String name;

	Person(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}
}

class Student2 extends Person {

	Student2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
