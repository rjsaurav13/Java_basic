package javab;

import java.util.Scanner;

class human {
	int age;
	int weight;
}

public class ClassWObj {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		human human1 = new human();
		human1.age = scanner.nextInt();
		human1.weight = scanner.nextInt();
		System.out.println(human1.age + " " + human1.weight);

		scanner.close();
	}
}
