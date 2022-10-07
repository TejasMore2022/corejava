package polymorphism;

public class A {
	
	int aa =88;
	final static int stAA = 55;
	int ab = 77;
	static int stIntab = 44;

	public static void main(String[] args) {
		int asd = 88;
	
	}
	
	
	public static void staticMethodFromA()
	{
		System.out.println("static Method From A");
		
	}
	
	
	public  void nonStaticMethodFromA()
	{
		System.out.println(" non static Method From A");
		
	}
	
	public static  void stMethod()
	{
		System.out.println("This static  method is from A");
	}
	
	public  void nstMethod(int z)
	{
		System.out.println("This non static method is from A");
	}

}
