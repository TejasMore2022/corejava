package abstractclass;

public abstract class AbstractClass extends ABClass{
	
	int abc = 90;
	static int pqr = 78;
	final static int QWE = 33;	
	final int IO = 45;
	
	public AbstractClass()
	{
		System.out.println("This is default constructor...");
	}
	public AbstractClass(int a)
	{
		System.out.println("This is param  constructor...");
	}
	
	
	
	
	public abstract void sampleAbstractMethod();
	
	
	public void nonstaticMethod()
	{
		System.out.println("non static Method");
	}
	
	public static void staticMethod()
	{
		System.out.println("non Method");
	}
	
	public  void abstractMethodFromABCLass()
	{
		System.out.println("Abstract method from AB clas is implemented by another abstract class");
	}

}
