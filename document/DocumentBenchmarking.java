package document;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/** A class for timing the EfficientDocument and BasicDocument classes
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 */

public class DocumentBenchmarking {
	
	public static final int TRIALS = 100;

	
	public static void main(String [] args) {

	   
	    int trials = 100;

	    // The text to test on
	    String textfile = "data/warAndPeace.txt";
		
	    // The amount of characters to increment each step
	    // You can play around with this
		int increment = 20000;

		// The number of steps to run.  
		// You can play around with this.
		int numSteps = 20;
		
		// THe number of characters to start with. 
		// You can play around with this.
		int start = 50000;
		
		System.out.print("NumberOfChars\tBasicTime\tEfficientTime\n");
		
		// Fill in the rest of this method so that it runs two loops
		// and prints out timing results as described in the assignment 
		// instructions and following the pseudocode below.
		for (int numToCheck = start; numToCheck < numSteps*increment + start; 
				numToCheck += increment)
		{
			 
			
			System.out.print(numToCheck + "\t\t");
			
			String text = getStringFromFile(textfile, numToCheck);
			
			long basicStartTime = System.nanoTime();
			
			for (int i = 0; i < trials; i++) {
				BasicDocument b = new BasicDocument(text);
				double basicFleschScore = b.getFleschScore();
			}
			
			long basicEndTime = System.nanoTime();
			
			double basicEstTime = (basicEndTime - basicStartTime) / 1000000000.0 / trials;
			
			System.out.format("%.11f\t", basicEstTime);
			
			long efficientStartTime = System.nanoTime();
			
			for (int i = 0; i < trials; i++) {
				EfficientDocument e = new EfficientDocument(text);
				double efficientFleschScore = e.getFleschScore();
			}
			
			long efficientEndTime = System.nanoTime();
			
			double efficientEstTime = (efficientEndTime - efficientStartTime) / 1000000000.0 / trials;
			
			System.out.format("%.11f\n", efficientEstTime);
			 
		}
	
	}
	
	/** Get a specified number of characters from a text file
	 * 
	 * @param filename The file to read from
	 * @param numChars The number of characters to read
	 * @return The text string from the file with the appropriate number of characters
	 */
	public static String getStringFromFile(String filename, int numChars) {
		
		StringBuffer s = new StringBuffer();
		try {
			FileInputStream inputFile= new FileInputStream(filename);
			InputStreamReader inputStream = new InputStreamReader(inputFile);
			BufferedReader bis = new BufferedReader(inputStream);
			int val;
			int count = 0;
			while ((val = bis.read()) != -1 && count < numChars) {
				s.append((char)val);
				count++;
			}
			if (count < numChars) {
				System.out.println("Warning: End of file reached at " + count + " characters.");
			}
			bis.close();
		}
		catch(Exception e)
		{
		  System.out.println(e);
		  System.exit(0);
		}
		
		
		return s.toString();
	}
	
}