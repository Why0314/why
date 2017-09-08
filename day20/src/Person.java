import java.io.Serializable;

/*
 * 一个类要想序列化，必须implements Serializable
 * 类在编译的时候都会产生自己的序列号，序列化之后，如果更改了内容，反序列化就无法识别
 * 所以要自己设置那个序号，无论类怎么改，序列号都不变
 * public static final long serialVersionUID = 42L;
 * 其值可以自己设置
 * 还有 静态成员不会被序列化，因为静态成员在方法区，序列化是对堆中的实例对象记性序列化
 */
public class Person implements Serializable {
	public static final long serialVersionUID = 42L;
	private String name;
	private Integer age;

	 static String country = "cn";
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	 public static String getCountry() { return country; } public static void
	 setCountry(String country) { Person.country = country; }
	 

}
