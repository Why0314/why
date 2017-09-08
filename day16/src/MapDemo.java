import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * Map集合：该集合存储键值对。一对一对往里存。而且要保证键的唯一性。
 * 	1，添加。
 * 		put( K key,V value)
 * 		putAll(Map<? extends K,? extends V> m)
 * 	2.删除。
 * 		clear()
 * 		remove(Object key)
 * 	3.判断
 * 		containsValue(Object value)
 * 		containsKey(Object key)
 * 		isEmpty()
 * 	4.获取。
 * 		get(Object key)
 * 		size()
 * 		values()
 * 
 * 		entrySet()
 * 		keySet()
 * 
 * Map
 * 		|--Hashtale :底层是哈希表数据结构，不可以存入null键null值。该集合是线程同步的。JDK1.0 效率低
 * 		|--HashMap：底层是哈希表数据结构，允许使用null值和null键，该集合是不同步的。将hashtable替代JDK1.2.效率高
 * 		|--TreeMap: 底层是二叉树数据结构。线程不同步。可以用于给map集合中的键进行排序。
 * 
 * 和Set很像
 * 其实大家，Set底层就是使用了Map集合
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		// 添加元素....添加元素，如果添加时，相同的键，那么后添加的值会原有键对应的值。
		// 并put方法会返回被覆盖得值
		System.out.println("put:" + map.put("01", "why01"));
		System.out.println("put:" + map.put("01", "why001"));
		//map.put("01", "why01");
		map.put("06", "why02");
		map.put("03", "why03");
		map.put("04", null);
		System.out.println("containsKey:" + map.containsKey("02"));
		System.out.println("containValue:" + map.containsValue("why01"));
		System.out.println("get:" + map.get("03"));
		// System.out.println("remove:"+map.remove("02"));

		System.out.println("get:" + map.get("04"));
		// 可以通过get方法的返回值来判断一个键是否存在。通过返回null来判断

		// 获取map集合所有的值。
		Collection<String> coll = map.values();
		System.out.println(coll);

		System.out.println(map);
	}
}
