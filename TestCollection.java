package MyPractice;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection
{

	public static void main(String[] args)
	{
		//implement an ArrayList Collection
		ArrayList<String> arrayListCollection1 = new ArrayList<String>();
		arrayListCollection1.add("New York");
		arrayListCollection1.add("Atlanta");
		arrayListCollection1.add("Madison");
		arrayListCollection1.add("Dallas");
		
		
	    System.out.println("A list of cities in collection1: ");
	    System.out.println(arrayListCollection1);
		
	    System.out.println("\nIs Dallas in collection1? " 
	      + arrayListCollection1.contains("Dallas"));
		arrayListCollection1.remove(0);
		System.out.println(arrayListCollection1);
		
		arrayListCollection1.add(0,"Texas");
		
		System.out.println(arrayListCollection1.get(1));

		ArrayList <String> arrayListCollection2 = new ArrayList<String>();
		
		ArrayList <String> c1 = (ArrayList<String>)(arrayListCollection1.clone());
		c1.addAll(arrayListCollection1);
		System.out.println("\nCities in collection1 and collection2: ");
		System.out.println(arrayListCollection2);
		System.out.println(arrayListCollection1.size());
		
		reverseArrayList(arrayListCollection1);
		
	}//end of maini method
	
	//create a method which reverses the values in the array List
	public static void reverseArrayList(ArrayList<String> arrayListCollection)
	{
		
		ArrayList <String> newArrayList= new ArrayList<String>();
		String temp;
		
		for(int i =arrayListCollection.size()-1;i>=0 ;i--)
		{
			//Now we reverse all the entries in this list
			temp=arrayListCollection.get(i);
			newArrayList.add(temp);
		}
		System.out.println(newArrayList);
		//return newArrayList;
		
	}//end of reverseArrayList Method
	
}//end of TestCollection Class
