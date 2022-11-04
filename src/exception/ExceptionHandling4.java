package exception;

public class ExceptionHandling4 {

	static String str;
	public static void main(String[] args) {
		System.out.println("Before exception");
		int a = 20;
		int b = 0;
		int c = 0;
	char ch;
		try
		{
		 c = a / b;
		
		 System.out.println("Inside try block");
		}
		
		catch(ArithmeticException oo)
		{
			c = 99;
			
		}
      try
      {
		 ch = str.charAt(3);
      }
      catch(NullPointerException obj)
		{
		 System.out.println("String does not have any character sequence");
		}
		
		System.out.println(c);

		System.out.println("After exception");

	}
	
	

}
