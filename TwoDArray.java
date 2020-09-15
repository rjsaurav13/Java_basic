package javab;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length of row");
		int row = scanner.nextInt();
		System.out.println("enter the length of column");
		int col = scanner.nextInt();
		int[][] arra = new int[row][];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 10; j++) {
				arra[i][j] = scanner.nextInt();
			}
		}
		for (int k = 0; k < row; k++) {
			for (int l = 0; l < row; l++) {
				System.out.print(arra[k][l] + " ");
				
			}
			System.out.println(" ");
			System.out.println(arra[0][1]);
		}
		
		scanner.close();
	}
}
