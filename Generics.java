package javab;

import java.util.ArrayList;

public class Generics {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ram");
		list.add("sham");
		list.add("shaan");
		String name=list.get(0);
		System.out.println(name);
	}

}
