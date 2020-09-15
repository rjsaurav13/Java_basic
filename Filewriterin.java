package javab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriterin {
	public static void main(String[] args) {
		File file =new File("name.txt");
		try(BufferedWriter buf= new BufferedWriter(new FileWriter(file))){
			buf.write("hello\n");
			buf.write("this\n");
			buf.write("is \n");
			buf.write("file\n");
			buf.write("writer\n");
			buf.write("in java\n");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
