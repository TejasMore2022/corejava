package finalkeyword;

public class ABClass extends SampleClassA{
	
	
	public  void nonStaticMethod()
	{
		System.out.println("This is non static method");
		int c = 34+34;
		System.out.println(c);
	}
	
	public static  void staticMethod()
	{
		System.out.println("This is static method");
		int c = 34-4;
		System.out.println(c);
	}

}
