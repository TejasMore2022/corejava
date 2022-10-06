package superkeyword;

public class A {
	int ab = 88;
	static int stAb = 77;
	int pqrs = 45;
	public A(int a)
	{
		
		System.out.println("This is A constructor");
	}
	public static void staticMethod()
	{
		System.out.println("This is static method from A class");
	}
	
	
	public  void nonStaticMethod()
	{
		System.out.println("This is non Static method from A class");
	}
	
	public void commonMethod()
	{
		System.out.println("common method from A");
	}

}
