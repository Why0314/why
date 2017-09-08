import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
public class ObjectStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p1 = new Person("lisi1",36);
		Person p2 = new Person("lisi2",36);
		Person p3 = new Person("lisi3",36);
		ArrayList<Person> l = new ArrayList<>();
		l.add(p1);
		l.add(p2);
		l.add(p3);
		 //writeObj(l);
		readObj(l);
	}
	public static void readObj(ArrayList<Person> a) throws Exception{	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));
		
			Person pp = (Person)ois.readObject();
			
			System.out.println(pp);
			
	
		ois.close();
	}
	public static void writeObj(ArrayList<Person> a) throws Exception{
		ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		
		for(Person p:a){
			oos.writeObject(p);
		}			
		oos.close();
	}
}
