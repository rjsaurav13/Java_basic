package javab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class Exceptions {
	public static void main(String[] args) {

		String filename = "C:/Users/amani/OneDrive/Desktop/m.txt";
		File file = new File(filename);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String Line = scanner.nextLine();
				System.out.println(Line);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (@SuppressWarnings("hiding") IOException e) {

			e.printStackTrace();
		}

	}

}
