import java.util.ArrayList;
import java.util.Iterator;



public class FinalTest {

	public static void main(String[] args) {
		
		int a=2;
		int b=1;
		System.out.println(b++);
		System.out.println(b);
		
		if(a==b++)
		{
			System.out.println("Yes I did it");
		}
		
		final Variable v= new Variable(5,7);
		System.out.println("Original x and y");
		System.out.println("x= "+v.x +" y = " +v.y);
		v.x=22;
		v.y=22;
		System.out.println("Modified x and y");
		System.out.println("x= "+v.x +" y = " +v.y);
		
		System.out.println("\n Change the Reference");
		//v= new Variable(100,100);
		
		ArrayList <Integer> myList= new ArrayList <Integer>();
		for(int i=0; i<6; i++)
		{
			myList.add(i);
		}
		//Initialize an Iterator
		Iterator<Integer> it= myList.iterator();
		while(it.hasNext()) //while values still remain in the iterator
		{
			System.out.println(it.next());
		}

	}

}
class Variable
{
	int x,y;
	Variable(){
		x=0;
		y=0;
	}
	Variable(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
