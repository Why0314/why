import java.io.*;
public class Person implements Serializable{
	public static final long serialVersionUID = 42L;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	private String name;
	int age;
	public String toString(){
		return name+":"+age;
	}
}
