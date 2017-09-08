import java.util.*;

/*
 * ��hashSet�����д����Զ������
 * ������������ͬΪͬһ���ˣ��ظ�Ԫ�ء�
 */
class Person2 {
	private String name;
	private int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int hashCode() {
		System.out.println(this.name + "---hashCode");
		return name.hashCode() + age;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Person2))
			return false;
		Person2 p = (Person2) obj;
		System.out.println(this.name + "-----" + p.getName());
		return this.name.equals(p.name) && this.age == p.age;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}
}

public class HashSetTest {
	public static void sop(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(new Person2("why1", 22));
		hs.add(new Person2("why2", 23));
		hs.add(new Person2("why3", 24));
		// hs.add(new Person2("why3", 24));
		// hs.add(new Person2("why4", 25));

		// sop("al:"+hs.contains(new Person2("why2",23)));

		hs.remove(new Person2("why2", 23));

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			Person2 p = (Person2) it.next();
			sop(p.getName() + "---" + p.getAge());
		}
	}
}
