
public class 练习 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short x = 1;
		x = (short) (x + 1);
		System.out.println(x);
		x += 1;
		System.out.println(x);
		short y = 2;
		short c = (short)( x + y);
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1=="abc");
		double d1 = Math.round(5.45);
		System.out.println(d1);
		double d2 = Math.floor(5.45);
		System.out.println(d2);
		double d3 = Math.ceil(5.45);
		System.out.println(d3);
		int[] sz = {1,2,3,5};
		System.out.println(sz.length);
		System.out.println(s2.length());
	}

}
