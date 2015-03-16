package Practice;

import java.util.Arrays;
import java.util.Comparator;

public class SortArray 
{
	
	//Default Constructor 
	public SortArray()
	{
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Integer[] intSortArrayAscending = {25, 9, 23, 1, 4, 90, 99};
		Integer[] intSortArrayDescending = {25, 9, 23, 1, 4, 90, 99};
		Integer[] intSortArrayMixedMode = {25, 9, 23, 1, 4, 90, 99};
		
		/*Sort Array in Ascending Order */
		Arrays.sort(intSortArrayAscending); //takes in the Wrapper Class object for the Integer Wrapper class
        
		/* Print array */
		System.out.print("Ascending order: ");
		for(int i: intSortArrayAscending)
		{
			System.out.print(i +", "); //Print each of the elements in the Integer Wrapper class
		}
		System.out.println("\n-----------------------");
		
		/* Sort Array in Descending order */
		
		SortArray objSortArray = new SortArray();
		
		/*Use Comparator to sort Array in Descending order */
		
		Arrays.sort(intSortArrayDescending, objSortArray.comparatorDescending());
		
		/* Print Array */
		System.out.print("Descending order: ");
		for(int i: intSortArrayDescending)
		{
			System.out.print(i + ", "); //For each i in the intSortArray Object, print the values
		}
		
		System.out.println("\n----------------------------");
	}
	
	public Comparator comparatorDescending()
	{
		return new Comparator<Integer>()
		{
			
			@Override
			public int compare(Integer o1, Integer o2)
			{
				if(01 < 02)
				{
					return 1;
				}
				else 
				{
					return -1;
				}
			}
		};
	}

}
