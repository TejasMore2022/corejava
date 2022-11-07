package collectionpack;

import java.util.Collections;
import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get method is not provided in Set as it does not maintain insertion order
		// We can not use Collection.sort for hash set
		HashSet<Integer> data = new HashSet<>();	
		HashSet<Integer> data1 = new HashSet<>();
		Integer a = new Integer(23);
		Integer b = new Integer(34);
		
		data.add(new Integer(33));
		data.add(a);
		data.add(b);
		data.add(null);
		data.add(null);
		data1.add(new Integer(3));
		data1.add(a);
		data1.add(b);		
		
		Integer z = getObjectAtmentionedIndexLocationFromSet(data, 2);
		System.out.println(z);
		
		boolean fl = data.equals(data1);
		System.out.println(fl);
		
		data.add(new Integer(78));
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
	
	public void removeObjectAtMentionedIndexLocationFromHashSet(HashSet<Integer> dd, int indexLoc)
	{
		int temp=0;
		Integer a = null;

		for (Integer each: dd)
		{
			if (temp==indexLoc)
			{
				dd.remove(each);
				break;
			}
			temp++;
		}	
		
	}
	
	public static  Integer getObjectAtmentionedIndexLocationFromSet(HashSet<Integer> dd, int indexLoc)
	{
		int temp=0;
		Integer a = null;

		for (Integer each: dd)
		{
			if (temp==indexLoc)
			{
				a = each;
				break;
			}
			temp++;
		}	
		
		return a;
		
	}

}
