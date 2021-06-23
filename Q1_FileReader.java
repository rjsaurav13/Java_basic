package javab.Java_basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q1_FileReader {
	public static void main(String[] args) {

		try {
			File myObj = new File("C:\\Users\\amani\\eclipse-workspace-Java\\javab\\src\\javab\\Java_basic\\info.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}