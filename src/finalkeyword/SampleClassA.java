package finalkeyword;

public final class SampleClassA {
	static int abc = 6667;
	
	static final int stVariable;
    final int nonStVari;	
    static final float zz = 21;
    
    public SampleClassA(int aa)
    {
		this.nonStVari = aa;
		abc = 2323;	
    	
    }
    public SampleClassA()
    {
    	this.nonStVari = 444;
    	
    }
    
    static
    {
    	stVariable = 12;
    }    

	public static void main(String[] args) {
		
		
		int aaaa = SampleClassA.stVariable;
		
		final int z;
		
		z = 543;
		System.out.println(z);
		
		//SampleClassA.stVariable = 89;
		
		SampleClassA obj = new SampleClassA(24);
	//	obj.nonStVari = 454;
		
		SampleClassA oo = new SampleClassA(33);
		//oo.nonStVari = 3444;
		
	//	obj.nonStVari = 333;
		System.out.println(obj.nonStVari);
		System.out.println(obj.stVariable);
		System.out.println(SampleClassA.stVariable);		
		final int a = obj.nonStVari;
		
		System.out.println(a);
		//a = 6778887;
		final int b = z;		
		

	}
	
	public final void nonStaticMethod()
	{
		System.out.println("This is non static method");
		int c = 34+34;
		System.out.println(c);
	}
	
	public static final void staticMethod()
	{
		System.out.println("This is static method");
		int c = 34-4;
		System.out.println(c);
	}

}
