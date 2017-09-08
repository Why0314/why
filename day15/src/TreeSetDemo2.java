import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/*
 * 当元素自身不具备比较性，或者具备的比较性不是所需要的。
 * 这时需要让容器自身具有比较性。
 * 定义了比较器，将比较对象作为参数传递给TreeSet集合的构造函数。
 * 
 * 当两种排序都存在时，以比较器为主。
 * 
 * 定义一个类，实现Comparator接口，覆盖compare方法。
 */
public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new myComparator());
		ts.add(new Teacher("why05", 15));
		ts.add(new Teacher("why08", 75));
		ts.add(new Teacher("why15", 25));
		ts.add(new Teacher("why02", 5));
		ts.add(new Teacher("why04", 5));
		ts.add(new Teacher("why04", 9));
		
		Iterator it = ts.iterator();
		while(it.hasNext()){
			Teacher t = (Teacher)it.next();
			System.out.println(t.getName()+"----"+t.getAge());
			
		}
	}
}

class Teacher implements Comparable {
	private String name;

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (!(o instanceof Teacher))
			throw new RuntimeException("不是学生对象");
		Teacher t = (Teacher) o;
		if (this.age == t.age){
			return this.name.compareTo(t.name);
		}
			
		if (this.age > t.age)
			return 1;
		return -1;
	}

}
class myComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Teacher t1 = (Teacher)o1;
		Teacher t2 = (Teacher)o2;
		int num = t1.getName().compareTo(t2.getName());
		if(num==0){
			//错误！！！return (Integer)t1.getAge().compareTo((Integer)t2.getAge());
			return new Integer(t1.getAge()).compareTo(new Integer(t2.getAge()));
		}
		return num;
		
	}
	
}
