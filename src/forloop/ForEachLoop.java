package forloop;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char atr[] = {'s','a','t','u','5'};
		
		
		for (char each:atr)
		{
			if (each=='a'||each=='e'||each=='u'||each=='i'||each=='o')
			{
				System.out.println("Array has wovel");
				break;
			}
		}
		
		
		int add1[][] = {{12,3},{33,2}};
		
		for (int each[]:add1)
		{
			System.out.println(each[0]);
			System.out.println(each[1]);
		}
		
		
		String[] strArr = {"Hfllo", "welcome to", "KTCTC", "Hello"};
		
		for (String each:strArr)			
		{
			System.out.println(each);
		}
		
		
		
		char ch[] = {'a','z','h','A','3'};
		
		for (char each:ch)
		{
			if (each=='a'||each=='e'||each=='u'||each=='i'||each=='o')
			{
				System.out.println("Character is wovel");
			}
			else
			{
				System.out.println("Character is consonent");
			}
		}
		
		
		int arr[] = { 23, 2, 6, 77, 4 };
		
		for(int each:arr)
		{
			System.out.println("inside for each loop");
			System.out.println(each);
			
		}
		
		System.out.println("After for each");

	}

}
