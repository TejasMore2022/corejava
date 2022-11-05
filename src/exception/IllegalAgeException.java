package exception;

public class IllegalAgeException extends Exception{
	
	public IllegalAgeException()
	{
		super("Voting age should be greater than 18");
	}

}
