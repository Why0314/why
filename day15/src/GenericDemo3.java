class Worker{
	
}
class Students{
	
}
/*
 * 有泛型前使用的   用时需强制转换
 * class Tool{
	private Object obj;
	public void setObject(Object obj){
		this.obj = obj;
		
	}
	public Object getObject(){
		return obj;
	}
}*/
//泛型类
/*当早期要操作的引用数据类型不确定的时候，
早期定义Object来完成扩展。
现在定义泛型来完成扩展。*/
class Utils<WHY>{
	private WHY JSD;
	public void setLlalala(WHY JSD){
		this.JSD = JSD;
	}
	public WHY getLalala(){
		return JSD;
	}
}
public class GenericDemo3 {
	public static void main(String[] args) {
		/* 有泛型前使用的   用时需强制转换
		 * Tool t = new Tool();
		t.setObject(new Worker());
		Worker w = (Worker)t.getObject();*/
		Utils<Worker> u = new Utils<Worker>();
		u.setLlalala(new Worker());
		Worker w = u.getLalala();
		
	}
}
