import java.io.*;
//序列化
public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//writerObj();
		readerObj();
	}

	public static void readerObj() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		Person p = (Person) ois.readObject();
		System.out.println(p.getName()+"::"+p.getAge());
		ois.close();
	}

	public static void writerObj() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		oos.writeObject(new Person("why", 15));
		oos.close();
	}
}
