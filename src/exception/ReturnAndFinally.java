package exception;

public class ReturnAndFinally {

	public static void main(String[] args) {

int z = addition();
System.out.println(z);

	}
	
	public static int addition()
	{		
		try {
			return 4;
			}
			catch (Exception e) {
				return 7;
			}
			finally
			{
				return 8;
			}
		
	}

}
