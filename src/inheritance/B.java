package inheritance;

public class B extends A{
	
	int bb =888;
	static int stBB = 555;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void staticMethodFromB()
	{
		System.out.println("static Method From B");
		
	}
	
	
	public  void nonStaticMethodFromB()
	{
		System.out.println(" non static Method From B");
		
	}

}
