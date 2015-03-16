package HelloWorldPackage;

public class RubberDuck extends Ducks{

	public static void main(String[] args)
	{
		
		RubberDuck newDuck= new RubberDuck();
		
		newDuck.fly();
	}
	
			
	}
class Ducks
{
	
	public void display(){}
	
	public void fly(){
		System.out.println("They can fly");
	}
}
