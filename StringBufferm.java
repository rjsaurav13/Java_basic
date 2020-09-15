package javab;

import java.util.Scanner;

public class StringBufferm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuffer s2 = new StringBuffer(scanner.next());
		System.out.println(s2.reverse().toString());
		scanner.close();
	}

}
