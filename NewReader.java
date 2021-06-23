package javab.Java_basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NewReader {
	public static void main(String[] args) {
	String filename = "C:\Users\amani\OneDrive\Desktop\m.txt";
		File file = new File(filename);
		try (BufferedReader read2 = new BufferedReader(new FileReader(file))) {
			String text;
			while ((text = read2.readLine()) != null) {
				System.out.println(text);
			}
		} catch (FileNotFoundException e) {
			System.out.println("unable to find the file :" + file.toString());
		} catch (IOException e) {
			System.out.println("unable to read the file :" + file.toString());
		}

	}
}
