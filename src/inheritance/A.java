package inheritance;

public class A {
	
	int aa =88;
	static int stAA = 55;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A aObj = new A();
		
		System.out.println(aObj.aa);
		System.out.println(aObj.stAA);
		aObj.nonStaticMethodFromA();
		aObj.staticMethodFromA();
		
		System.out.println(A.stAA);
		A.staticMethodFromA();
		
		B bObj = new B();
		System.out.println(bObj.aa);
		System.out.println(bObj.bb);
		System.out.println(bObj.stAA);
		System.out.println(bObj.stBB);
		bObj.nonStaticMethodFromA();
		bObj.nonStaticMethodFromB();
		bObj.staticMethodFromA();
		bObj.nonStaticMethodFromB();
		
		System.out.println(B.stAA);
		System.out.println(B.stBB);
		B.staticMethodFromA();
		B.staticMethodFromB();

	}
	
	
	public static void staticMethodFromA()
	{
		System.out.println("static Method From A");
		
	}
	
	
	public  void nonStaticMethodFromA()
	{
		System.out.println(" non static Method From A");
		
	}

}
