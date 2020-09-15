package javab;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		  char[] a=scanner.next().toCharArray();
	      System.out.println();
		scanner.close();
		/*
		 * if (N % 2 == 0) {
				do {
					N = N / 2;
					if (N == 1) {
						System.out.println("YES");
						break;
					} else {
						System.out.println("NO");
						break;
					}
				} while (N == 1);
			} else if (N % 2 != 0) {
				do {
					N = 3 * N + 1 - N;
					if (N <= 1) {
						System.out.println("NO");
						break;
					} else {
						System.out.println("YES");
						break;
					}
				} while (N <= 1);
			}
		*/
	}

}
