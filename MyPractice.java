package MyPractice;

public class MyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived obj1 = new Derived();
		
		Derived obj2= new Derived();
		
		if(obj1==obj2){
			System.out.println(true);
		}
		
		System.out.println(obj1.equals(obj2));

	}

}
class Base 
{
	
}
class Derived
{
	
}
