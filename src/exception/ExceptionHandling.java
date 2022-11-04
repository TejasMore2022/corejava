package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Before exception");
		int a = 20;
		int b = 0;
		int c = 0;
		
		try
		{
		 c = a / b;
		 System.out.println("Inside try block");
		}
		catch(ArithmeticException obj)
		{
			c = 99;
		}

		System.out.println(c);

		System.out.println("After exception");

	}
	
	

}
