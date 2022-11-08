package hashmappack;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> dd = getDetailsOfMentionedUser("");

		for (Entry<String, String> each:dd.entrySet())
		{
			System.out.println(each.getKey());
			System.out.println(each.getValue());
			
		}

	}
	
	public static HashMap<String, String> getDetailsOfMentionedUser(String email)
	{
		HashMap<String, String> data = new HashMap<>();
		data.put("FirstName", "Ciera");
		data.put("LaseName", "Vega");
		data.put("Age", "39");
		data.put("Email", "ciera@example.com");
		data.put("Salary", "10000");
		data.put("Department", "Insurance");
		
		
		return data;
	}

}
