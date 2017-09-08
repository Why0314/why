import java.util.*;

public class GenericDemo7 {
	public static void main(String[] args) {
		TreeSet<Student7> ts = new TreeSet<Student7>(new Comp());
		ts.add(new Student7("why01"));
		ts.add(new Student7("why21"));
		ts.add(new Student7("why41"));
		ts.add(new Student7("why08"));
		Iterator<Student7> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println("Student7--" + it.next().getName());
		}

		TreeSet<Worker7> ts1 = new TreeSet<Worker7>(new Comp());
		ts1.add(new Worker7("Wwhy01"));
		ts1.add(new Worker7("wWhy21"));
		ts1.add(new Worker7("whWy41"));
		ts1.add(new Worker7("whyW08"));
		Iterator<Worker7> it1 = ts1.iterator();
		while (it1.hasNext()) {
			System.out.println("Worker7--" + it1.next().getName());
		}
	}
}

class Comp implements Comparator<Person7> {

	@Override
	public int compare(Person7 o1, Person7 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}

class Person7 {
	private String name;

	Person7(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}
}

class Student7 extends Person7 {

	Student7(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}

class Worker7 extends Person7 {
	Worker7(String name) {
		super(name);
	}
}