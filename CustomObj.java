package javab;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class person {
	private int id;
	private String name;

	public person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id +" :"+name;
	}

}

public class CustomObj {
	public static void main(String[] args) {
		person per = new person(0,"s");
		person per1 = new person(1,"a");
		person per2 = new person(2,"u");
		person per3 = new person(3,"r");
		person per4 = new person(4,"a");
		person per5 = new person(5,"v");
		Map<person, Integer> map = new HashMap<person, Integer>();
		map.put(per, 1);
		map.put(per1, 2);
		map.put(per2, 3);
		map.put(per3, 4);
		map.put(per4, 5);
		map.put(per5, 6);
		for (person key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		Set<person> set = new LinkedHashSet<person>();
		set.add(per);
		set.add(per1);
		System.out.println(set);
	}
}
