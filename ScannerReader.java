package javab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "C:/Users/amani/OneDrive/Desktop/m.txt";
		File file = new File(filename);
		 Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String Line = scanner.nextLine();
			System.out.println(Line);
 
		}
		scanner.close();
	}

}
