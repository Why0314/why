import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] week = { "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日" };
		String[] month = { "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月" };
		Calendar c = Calendar.getInstance(Locale.CHINA);
		sop(c);
		sop(c.getTimeZone());
		sop(c.get(Calendar.YEAR));
		sop(Calendar.MONTH);
		sop(c.get(Calendar.MONTH));
		int weekIndex = c.get(Calendar.DAY_OF_WEEK);
		int monthIndex = c.get(Calendar.MONTH);
		sop(week[weekIndex-2]);
		sop(month[monthIndex]);
		sop(c.get(Calendar.DAY_OF_MONTH)+"号");
		sop(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));
		//sop(c.get(Calendar.PM));
	}

	public static void sop(Object o) {

		System.out.println(o);

	}

}
