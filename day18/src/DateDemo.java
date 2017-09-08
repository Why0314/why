import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d =new Date();
		System.out.println(d);//打印的时间看不懂
		
		//将模式封装到SimpleDateformat对象中。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日      kk:mm:ss-S");
		
		System.out.println(sdf.format(d));
	}

}
