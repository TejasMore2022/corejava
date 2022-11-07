package collectionpack;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// We can not add  null value in tree set as treeset sorts data in acending order
		TreeSet<Integer> data = new TreeSet<>();			
		Integer a = new Integer(23);
		Integer b = new Integer(34);		
		data.add(new Integer(9));
		data.add(a);
		data.add(b);
		//data.add(null);
		
		data.add(new Integer(5));
		data.add(a);
		data.add(b);
		System.out.println(data.size());
		data.remove(a);
		System.out.println(data);
		data.remove(33);
		
		for (Integer each: data)
		{
			System.out.println(each);
		}	
		

	}
	
	

}
