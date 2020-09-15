package javab;

import java.util.Scanner;

public class SwitchCaseS {
	public static void main(String[] args) {
		int num, fnum, snum;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 1 for add\n 2 for sub\n 3 for multi\n 4 for division");
		num = scanner.nextInt();
		System.out.println("PLEASE ENTER FIRST NUMBER");
		fnum = scanner.nextInt();
		System.out.println("PLEASE ENTER SECOND NUMBER");
		snum = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println("Addition :" + (fnum + snum));
			break;
		case 2:
			System.out.println("Subtraction :" + (fnum - snum));
			break;
		case 3:
			System.out.println("Multiplication :" + (fnum * snum));
			break;
		case 4:
			System.out.println("Division :" + (fnum / snum));
			break;
		default:
			System.out.println("invalid entry");

		}
		scanner.close();
	}

}
