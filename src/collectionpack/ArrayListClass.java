package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListClass {

	public static void main(String[] args) {	  
		ArrayList<Integer> data = new ArrayList<>();
		ArrayList<Integer> data1 = new ArrayList<>();
		Integer a = new Integer(23);
		Integer b = new Integer(34);	
		//data.add(null);
		data.add(a);
		data.add(b);
		data1.add(a);
		data1.add(b);
		//data.add(null);
		boolean fl = data.equals(data1);
		System.out.println(fl);		
		data.add(new Integer(5));
		data.add(777);
		System.out.println(data);
		Integer t = data.get(2);
		System.out.println(t);
		Integer k = data.get(3);
		System.out.println(k);		
		int elements = data.size();
		System.out.println(elements);
		data.remove(3);
		System.out.println(data);
		data.add(a);
		data.add(b);
		data.add(2);		
		data.remove(a);
		System.out.println(data);
		Collections.sort(data);
		
		for (int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i));
		}
		
		for (int i=data.size()-1;i>=0;i--)
		{
			System.out.println(data.get(i));
		}
		
		for (Integer each:data)
		{
			System.out.println(each);
		}		
		
	}

}
