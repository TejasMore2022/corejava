package ifstatements;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean f = false;
		boolean f1 = false;
		int b = 67;
		
		if (f1)
		{
			System.out.println("Inside if");
			
			if (f)
			{
				System.out.println("Inside inner if");
			}
			
			
		}
		
		if (f&&f1)
		{
			System.out.println("Inside inner if");
		}
		

	}

}
