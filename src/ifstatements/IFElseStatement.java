package ifstatements;

public class IFElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before if statement");
		boolean flag = true;
		int a = 0;
	
		if (flag) {
			
			if (a < 10) {
				System.out.println("inside first If statement");
			} else {
				System.out.println("Inside else of first statement");
				
				if(flag)
				{
					System.out.println("Inside else if");
				}
			}

		}

		if (flag) {
			System.out.println("I am inside if statement");
			int c = a + 45;
			System.out.println("Addition is = " + c);

		} else {
			System.out.println("Inside else of second if");
			int z = a - 34;
			System.out.println("Substraction is = " + z);
		}

		if (flag)
			System.out.println("KTCTC1");
		else
			System.out.println("KTCTC2");
		System.out.println("KTCTC3");

		System.out.println("After if statement");

	}

}
