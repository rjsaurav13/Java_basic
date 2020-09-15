package javab;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {

		int num;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("enter the code");
			num = scanner.nextInt();

		} while (num != 9);
		System.out.println("got number 9");
		scanner.close();
	}
}
