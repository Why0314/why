import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarDemo2 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2012, 3,23);//2012年  4月 23 日    月份 星期 角标从0开始
		//c.add(Calendar.HOUR, 3);//时间 +3
		//c.add(Calendar.MONTH, -1);//月份 -1
		datePrint(c);
	}

	public static void datePrint(Calendar c) {
		String[] week = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		String[] month = { "1月", "2月", "3月", "4月",
							"5月", "6月", "7月", "8月", 
							"9月","10月", "11月", "12月" };
		int weekI = c.get(Calendar.DAY_OF_WEEK);
		int monthI = c.get(Calendar.MONTH);
		// sop(weekI);
		sop(c.get(Calendar.YEAR) + "年" + month[monthI] + 
				c.get(Calendar.DAY_OF_MONTH) + "号  " + week[weekI]);
		sop(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		
		//SimpleDateFormat f = new SimpleDateFormat("kk:mm:ss");
		
		//sop(f.format(c));
	}

	public static void sop(Object o) {

		System.out.println(o);

	}
}
