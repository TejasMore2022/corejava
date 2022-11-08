package hashmappack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> data = new HashMap<>();

		data.put(1, "Amit");
		data.put(89, "Zakir");
		data.put(4, "Damodar");
		data.put(89, "YML");
		data.put(5, "Damodar");
		data.put(null, "Amar");
		data.put(null, "SAndip");
		data.put(44, null);
		data.put(55, null);
		
		
		String ss = data.get(89);
		System.out.println(ss);
		
		String dd = data.get(55);
		System.out.println(dd);
		
		data.remove(null);
		
		System.out.println(data.size());

		System.out.println(data);
		
		for (Entry<Integer, String> each:data.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
		}

	}



}
