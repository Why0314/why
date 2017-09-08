import java.util.*;

/*
 * 将自定义对象作为元素存到ArrayList集合中，并去除重复元素
 * 
 * 比如：存人对象。同姓名同年龄，视为同一人。为重复元素。
 * 
 * 思路：
 * 1.对人描述，将数据封装进人对象。
 * 2.定义容器，将人存入
 * 3.取出
 * 
 * 
 * List集合判断元素是否相同
 */
class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Person))
			return false;
		Person p = (Person) obj;
		System.out.println(this.name + "----" + p.name);
		return this.name.equals(p.name) && this.age == p.age;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}
}

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Person("lisi01", 30));// al.add(Object obj);
		al.add(new Person("lisi02", 31));// Object obj = new Person("lisi",30);
		al.add(new Person("lisi03", 32));
		al.add(new Person("lisi04", 33));
		al.add(new Person("lisi05", 34));
		al.add(new Person("lisi06", 35));
		al = singleElement(al);
		sop("remove 03" + al.remove(new Person("lisi03", 32)));
		Iterator it = al.iterator();

		while (it.hasNext()) {
			/*
			 * Object obj = it.next(); Person p = (Person) obj; 简化如下
			 */
			Person p = (Person) it.next();
			sop(p.getName() + "--" + p.getAge());
		}

	}

	public static ArrayList singleElement(ArrayList al) {
		ArrayList newAl = new ArrayList();
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (!newAl.contains(obj))
				newAl.add(obj);
		}
		return newAl;
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
