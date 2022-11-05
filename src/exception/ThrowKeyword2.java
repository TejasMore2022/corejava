package exception;

import java.io.FileNotFoundException;

public class ThrowKeyword2 {

	public static void main(String[] args) throws  IllegalAgeException {
		// TODO Auto-generated method stub
		int age = 16;
		
		if (age>18)
		{
			System.out.println("You can vote");
		}
		else
		{
		
			throw new IllegalAgeException();
		}

	}

}
