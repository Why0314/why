//泛型在接口上
interface Inter<T> {
	public void show(T t);
}

class InterImpl implements Inter<Integer> {

	@Override
	public void show(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("show:" + t * t);
	}
}

class InterImpl2<T> implements Inter<T> {
	public void show(T t) {
		System.out.println("实现接口时也不确定数据类型，继续使用泛型--" + t);
	}

}

public class GenericDemo5 {
	public static void main(String[] args) {
		InterImpl i = new InterImpl();
		i.show(5);
		InterImpl2<String> i2 = new InterImpl2<String>();
		i2.show("why");
	}
}
