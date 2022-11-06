package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListClass2 {

	public static void main(String[] args) {	  
		ArrayList<String> data = new ArrayList<>();
		String str = "Welcome";
		String str1 = new String("Hello");
		
		data.add(str);
		data.add(str1);
		data.add("KTCTC");
		
		System.out.println(data);
		
	}

}
