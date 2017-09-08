import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 练习 :按照字符串长度排序
 */
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new StrLenComparator());

		t.add("asd");
		t.add("sd");
		t.add("tssd");
		t.add("a");  
		t.add("dsvvd");
		t.add("tasd");
		t.add("nssd");

		Iterator it = t.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

class StrLenComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = (String) o1;
		String s2 = (String) o2;
		/*if(s1.length()>s2.length())
			return 1;
		if(s1.length()==s2.length())
			return s1.compareTo(s2);
		return -1;*/  //简化如下
		int num = (new Integer(s1.length())).compareTo(new Integer(s2.length()));
		if (num == 0) {
			return s1.compareTo(s2);
		}
		return num;		
	}

}
