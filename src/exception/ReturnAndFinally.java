package exception;

public class ReturnAndFinally {

	public static void main(String[] args) {

int z = addition();
System.out.println(z);

	}
	
	public static int addition()
	{		
		try {
			System.out.println("egreqrtqe");
			return 4;
			}
			catch (Exception e) {
				System.out.println("adgfafdgf");
				return 7;
			}
			finally
			{
				return 8;
			}
		
		
		
	}
	
	public int ss(int a)
	{
		if(a<90)
		{
			return 3;
		}
		else
		{
			return 44;
		}
		
		
	}

}
