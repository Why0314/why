import java.util.*;

public class GenericDemo2 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>(new LenthComparator());

		t.add("asd");
		t.add("sd");
		t.add("tssd");
		t.add("a");
		t.add("dsvvd");
		t.add("tasd");
		t.add("nssd");
		
		Iterator<String> it = t.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
class LenthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
		if(num==0){
			return o1.compareTo(o2);
		}
		return num;
	}
	
}
