package MyPractice;

public class StringStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Hello";
		long start, stop; //initially start and stop variables.
		
		start = System.nanoTime();
		System.out.println(reverse_s(s));
		stop = System.nanoTime();
		System.out.println(stop-start);
		System.out.println("String Time is: " +(stop-start) +"ns");
		
		//Now compare the reverse algorithm with the StringBuffer class
		start =System.nanoTime();
		reverse_sb(s);
		stop=System.nanoTime();
		System.out.println("StringBuffer Time is: " +(stop-start) +"ns");

	}//End of main method
	
	public static String reverse_s(String w)
	{
		String u="";//= new String(); //Form new string u
		
		for(int i = w.length() - 1; i >=0; --i)
		{
			
			u +=w.charAt(i); //concatenate the strings together.
		}
		return u; //where u is the reversed string
	}
	
	public static String reverse_sb(String w)
	{
		StringBuffer ub = new StringBuffer(w.length());
		
		for(int i=w.length()- 1; i >=0; --i)
		{
			ub.append(w.charAt(i));
		}
		
		return ub.toString();
	}

}
