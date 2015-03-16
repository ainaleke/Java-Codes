package MyPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Remember collection interface 
		Collection<String> collection= new ArrayList<String>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next().toUpperCase());
		}

	}

}
