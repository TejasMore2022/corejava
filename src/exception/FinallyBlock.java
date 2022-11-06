package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		
	
		
		// TODO Auto-generated method stub
		int a = 0;
		int b = 8;
		int c;
		try {
		c = b/a;
		}
		catch (Exception e) {
			c = 33;
		}
		finally
		{
			System.out.println("This is finally block");
			c = 90;
			
		}
		
		System.out.println(c);

	}

}
