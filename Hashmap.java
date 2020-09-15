package javab;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0,"S");
		map.put(1,"A");
		map.put(2,"U");
		map.put(3,"R");
		map.put(4,"A");
		map.put(5,"V");
	
		for(int i = 0; i <map.size();i++) {
			String text = map.get(i);
		System.out.print(text);
		}
	}

}
