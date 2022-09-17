package ifstatements;

public class IfStatementClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before if statement");
		boolean flag = false;
		int a=0;
		
		if(flag)
		System.out.println("KTCTC1");		
		System.out.println("KTCTC2");
		
		
		if (a<10)
		{
			System.out.println("inside first If statement");
		}
		
		
		
		if(flag)
		{
			System.out.println("I am inside if statement");
			int c = a+45;
			System.out.println("Addition is = "+c);
			
		}
		
		
		System.out.println("After if statement");

	}

}
