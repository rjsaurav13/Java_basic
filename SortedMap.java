package javab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap {
	 public static void testMap(Map<Integer,String> map) {
		 map.put(9,"dog");
		 map.put(45,"fox");
		 map.put(55,"zebra");
		 map.put(3,"bird");
		 map.put(10,"cat");
		 
		 for(Integer key : map.keySet()) {
			 String value = map.get(key);
			 System.out.println(key+ ":"+ value);
		 }
	 }
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		testMap(hashMap);
		testMap(linkedhashmap);
		testMap(treemap);
	}
}
