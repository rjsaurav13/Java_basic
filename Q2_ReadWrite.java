package javab.Java_basic;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q2_ReadWrite {

	    public static void main(String[] args)
	    {
	  
	        try {
	            File f1 = new File("C:\\\\Users\\\\amani\\\\eclipse-workspace-Java\\\\javab\\\\src\\\\javab\\\\Java_basic\\\\info.txt");
	            File f2 =  new File("C:\\\\Users\\\\amani\\\\eclipse-workspace-Java\\\\javab\\\\src\\\\javab\\\\Java_basic\\\\test.txt");
	            Scanner fl=null;
	            BufferedWriter sc = new BufferedWriter(new FileWriter(f2));
	            fl = new Scanner(f1);
	            System.out.println("Contents of the file are");
	            while(fl.hasNext())
	            {
	            	
	                String line=fl.nextLine();
	                System.out.println(line);
	                sc.write(line + System.getProperty("line.separator"));
	            
		        }
	            
	            sc.close();
	            fl.close();
	            System.out.println("\n\nFile copied properly");
	        }
	        catch (IOException e) {
	            System.out.println("There are some IOException");
	        }
	    }
	}


