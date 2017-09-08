import java.util.Iterator;
import java.util.TreeSet;

/*
 * Set:无序，不可以重复元素
 * 	|--HashCode：数据结构是哈希表。线程是非同步的。
 * 				保证元素唯一性原理：判断元素的hashCode值是否相同。
 * 				如果相同，还会继续判断元素的equals方法，是否为true。
 * 	|--TreeSet:可以对Set集合中的元素进行排序。
 * 				底层数据结构是二叉树。	
 * 				保证元素唯一性的依据是
 * 				compareTo方法return 0；
 * 
 * 				TreeSet排序的第一种方法：让元素自身具有比较性。
 * 				元素需要实现Comparable接口，覆盖compareTo方法。
 * 				这种方法也成为元素的自然顺序，或者叫做默认顺序。
 * 				
 * 				TreeSet的第二种排序方法。
 * 				当元素自身不具备比较性时，或者具有的比较性不是所需要的。
 * 				这时就需要让集合自身具备比较性。
 * 				在集合初始化时就有了比较方式。
 * 				
 * 
 * 需求：
 * 往TreeSet集合中存储自定义对象学生。
 * 想按照学生是年龄进行排序。
 * 
 * 记住，排序时,当主要条件相同时，一定判断一下次要条件。
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		ts.add(new Student("jsd02", 18));
		ts.add(new Student("jsd007", 15));

		ts.add(new Student("jsd006", 15));
		ts.add(new Student("jsd08", 20));
		ts.add(new Student("jsd09", 30));
		// ts.add(new Student("jsd02", 22));

		Iterator it = ts.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());
			Student st = (Student) it.next();
			System.out.println(st.getName() + "----" + st.getAge());
		}
	}
}

class Student implements Comparable {
	private String name;
	private int age;

	public int compareTo(Object o) {
		// TODO Auto-generated method stub

		if (!(o instanceof Student))
			throw new RuntimeException("不是学生对象");
		Student s = (Student) o;

		System.out.println(this.name + "------" + s.name);
		if (this.age > s.age)
			return 1;
		if (this.age == s.age) {
			return this.name.compareTo(s.name);
		}
		// return 0;
		return -1;

	}

	public Student(String name, int age) {
		// super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
