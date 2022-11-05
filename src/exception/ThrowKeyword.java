package exception;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 16;
		
		if (age>18)
		{
			System.out.println("You can vote");
		}
		else
		{
		
			throw new ArithmeticException();
		}

	}

}
