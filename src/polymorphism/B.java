package polymorphism;

public class B extends A{
	
	int bb =888;
	static int stBB = 555;
	int ab = 777;
	static int stIntab = 444;

	
	public static void main(String[] args) {
		
		A ab = new B();
		System.out.println(ab.aa);
		System.out.println(ab.stAA);
		System.out.println(ab.stIntab);
		System.out.println(ab.ab);
		ab.nonStaticMethodFromA();
		ab.staticMethodFromA();
		ab.stMethod();
		ab.nstMethod(45);
		
		
		
		
		
		
		B bb = new B();
		System.out.println(bb.aa);
		System.out.println(bb.ab);
		System.out.println(bb.stAA);
		System.out.println(bb.stBB);
		System.out.println(bb.bb);
		
		bb.nonStaticMethodFromA();
		bb.nonStaticMethodFromB();
		bb.staticMethodFromA();
		bb.staticMethodFromB();
		bb.stMethod();
		bb.nstMethod(3);
		
		
		
		A aa = new A();		
		System.out.println(aa.aa);
		System.out.println(aa.ab);
		System.out.println(aa.stAA);
		System.out.println(aa.stIntab);
		aa.staticMethodFromA();
		aa.stMethod();
		aa.nstMethod(3);
		aa.nonStaticMethodFromA();
		
	}

	
	public static void staticMethodFromB()
	{
		System.out.println("static Method From B");
		
	}
	
	
	public  void nonStaticMethodFromB()
	{
		System.out.println(" non static Method From B");
		
	}
	
	
	public static  void stMethod()
	{
		System.out.println("This static  method is from B");
		System.out.println("This static  method is from B");
	}
	@Override
	public  void nstMethod(int a)
	{
		System.out.println("This non static method is from B");
		System.out.println("This static  method is from B");
	}

}
