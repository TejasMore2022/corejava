package inheritance;

public class C extends B{
	
	int cc =888;
	static int stCC = 555;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C cObj = new C();
		System.out.println(cObj.aa);
		System.out.println(cObj.bb);
		System.out.println(cObj.cc);
		System.out.println(cObj.stAA);
		System.out.println(cObj.stBB);
		System.out.println(cObj.stCC);
		
		cObj.nonStaticMethodFromA();
		cObj.nonStaticMethodFromB();
		cObj.nonStaticMethodFromC();
		
		cObj.staticMethodFromA();
		cObj.staticMethodFromB();
		cObj.staticMethodFromC();

	}
	
	
	public static void staticMethodFromC()
	{
		System.out.println("static Method From C");
		
	}
	
	
	public  void nonStaticMethodFromC()
	{
		System.out.println(" non static Method From C");
		
	}

}
