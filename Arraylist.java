package javab;

import java.util.ArrayList;

class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int sum =0;
		numbers.add(10);
		numbers.add(100);
		numbers.add(59);
		numbers.add(43);
		numbers.remove(1);
		//System.out.println(numbers.get(0));
		for(int i = 0; i < numbers.size();i++) {
			sum = sum +numbers.get(i);
			System.out.println(i+1+" "+sum);
		}
		
	}
}
