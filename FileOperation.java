package MyPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) {
		
		File in = new File("C:/input.txt"); //create the input file
		File out = new File("C:/output.txt"); //create the output file
		PrintWriter pw = null; //PrintWriter helps to write to a file
		
		Scanner scan = null;
		
		try
		{
			scan = new Scanner(in); //read from the file.
		}
		
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			System.err.println("Failed to Read from the File");
		}
		//Now write to the file.
		try
		{
			pw=new PrintWriter(out);
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.err.println("Failed to Write to the File");
			scan.close();
			System.exit(0);
		}
		
		catch(IOException e)
		{
			System.err.println("Failed to Write to the File");
			scan.close();
			System.exit(0);
		}
		
		while(scan.hasNext())
		{
			pw.print(scan.next() +" ");
		}
		scan.close();
		pw.close();

	}

}
