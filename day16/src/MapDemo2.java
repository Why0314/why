import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 
 * map集合的两种取出方式：
 * 1.keySet：将map中所有的键存到Set集合。因为set具有迭代器。
 * 		所以可以迭代方式取出所有的键，再根据get方法。获取每一个键对应的值
 * 		
 * 		Map集合的取出原理：将map集合转成set集合。在通过迭代器取出。
 * 
 * 		
 * 2.Set<Map.Entry<k,v>> entrySet:将map集合中的映射关系存入到了set集合中，
 * 									而这个关系的数据类型就是：Map.Entry
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("04", "jsd04");
		map.put("05", "jsd05");
		map.put("03", "jsd03");
		map.put("01", "jsd01");
		map.put("02", "jsd02");
		
		//将Map集合中的映射关系取出。存入Set集合中。
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> me = it.next();
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
		
		
		
		/*Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()){
			String key = it.next();
			//String value = map.get(key);	
			System.out.println("key:"+key+"value:"+map.get(key));
			*/
			
		}
	}
}
