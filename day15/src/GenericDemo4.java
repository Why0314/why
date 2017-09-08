class Demo<W>{
	public void show(W w){
		System.out.println("show:"+w);
	}
	public void print(W w){
		System.out.println("print:"+w);
	}
	public static <T> void method(T t){
		System.out.println("static method:"+t);
	}
}
/*泛型类定义的 泛型，在整个类中有效，如果被方法使用，
那么泛型类的对象明确要操作的具体类型后，所有要操作的类型就已经固定了。

为了让不同方法可以操作不同类型，而且类型还不确定。
那么可以将泛型定义在方法上*/
/*
 * 特殊之处：
 * 静态方法不可以访问类上定义的泛型。
 * 如果静态方法操作的应用数据类型不确定，可以将泛型定义在方法上。
 */
class Demo2{
	public <j> void show1(j j){
		System.out.println("aaa:"+j);
	}
	public <as> void show2(as g){
		System.out.println("bbb:"+g);
	}
	
}
public class GenericDemo4 {
	public static void main(String[] args) {
		Demo<String> d = new Demo<String>();
		d.show("asd");
		d.print("qwe");
		d.method(54);
		d.method("static");
		Demo2 dd = new Demo2();
		dd.show1(545);
		dd.show1("wwd");
		dd.show2(88);
	}
}
