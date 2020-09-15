package javab;

import java.util.Scanner;

public class UsserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your age");
		int age =scanner.nextInt();
		double dnum=scanner.nextDouble();
		String name= scanner.nextLine();
		name=scanner.nextLine();
		scanner.close();
		System.out.println(age+" "+dnum+" "+" "+name);
		System.out.println(name.length());
	}
}
;