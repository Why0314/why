
public class MathDemo {
	public static void main(String[] args) {
		double d = Math.ceil(16.32);// ceil 返回 大于指定数据的最小整数
		double d1 = Math.floor(16.32);// floor返回 小于于指定数据的最小整数
		long l = Math.round(12.54); //四舍五入
		double d2 = Math.pow(2, 3);//2的3次方
		sop(d);
		sop(d1);
		sop(l);
		sop(d2);
	}

	public static void sop(Object o) {

		System.out.println(o);

	}
}
