package superkeyword;

public class B extends A{
	int ab = 34534;
	static int stAb = 354345;
	
	public B()
	{
		super(3);
		System.out.println("This is B constructor");
	}
	
	public B(String str)
	{
		
		this();
		
	}
	
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.nonStaticMethod();
		
		}
	
	public static void staticMethod()
	{
		System.out.println("This is static method from B class");
	}
	
	
	public  void nonStaticMethod()
	{
		System.out.println("This is non Static method from B class");
		System.out.println(super.pqrs);
		System.out.println(super.ab);
		System.out.println(super.stAb);
		System.out.println(ab);
		System.out.println(stAb);
		super.commonMethod();
		commonMethod();
	}
	
	public void commonMethod()
	{
		System.out.println("common method from B");
	}

}
