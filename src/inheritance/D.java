package inheritance;

public class D extends A{
	
	int dd =888;
	static int stDD = 555;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D dObj = new D();
		System.out.println(dObj.aa);
		System.out.println(dObj.dd);
		System.out.println(dObj.stAA);
		
		
		dObj.nonStaticMethodFromA();
		dObj.nonStaticMethodFromD();
		
		dObj.staticMethodFromA();
		dObj.staticMethodFromD();
		

	}
	
	
	public static void staticMethodFromD()
	{
		System.out.println("static Method From D");
		
	}
	
	
	public  void nonStaticMethodFromD()
	{
		System.out.println(" non static Method From D");
		
	}

}
