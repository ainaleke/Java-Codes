package HelloWorldPackage;

import java.util.Scanner;

public class Fibonacci {

	
	private static String fibonacciIndex;
		
		
	public static void main(String[] args) {
		long start,stop;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter an Index Number: ");
		start=System.nanoTime();
		int index=input.nextInt();
		/*for(int i=0;i<=index; i++)
		{
			if(i<index){
			System.out.print(fibonacci(i) +",");
			}
			else
				System.out.print(fibonacci(i) +"\n\n");
		}*/
		System.out.println("fibonacci(" +index+") = " +fibonacci(index) );
		stop=System.nanoTime();
		
		System.out.println("The result for fibonacci("+index +") is: " +fibonacci(index) );
		//System.out.println(fibnoacci(72));
		long elapsedTime=stop-start;
		double milliseconds=(double)elapsedTime/1000000;
		System.out.print("Time Elapsed is: " +milliseconds +" milliseconds");
		
	}
	
	public static long fibonacci(int index)
	{
		//Fibonacci.fibonacciIndex= index;
		if (index==0)
		{
			return 0;
		}
		else if(index==1)
		{
			return 1;
		}
		else //recursively compute the result for the fibonacci sequence
		
			return fibonacci(index-1) + fibonacci(index -2);
	 
	}

}
