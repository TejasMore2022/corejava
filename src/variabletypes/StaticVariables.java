package variabletypes;

public class StaticVariables {
	
	int ab = 78;
	static int pq = 88;

	public static void main(String[] args) {	
		
		StaticVariables.staticMethod();	
		
		  StaticVariables oo = new StaticVariables();
		  StaticVariables obj = new StaticVariables();		  
		  obj.nonStaticMethod();		  
		  oo.ab = 444;
		  StaticVariables.pq = 123;
		  oo.nonStaticMethod();
		  
		  System.out.println("KTCTC");
		 
		
		System.out.println("KTCTC");
		
		System.out.println(pq);
		

	}
	
	public static void staticMethod()
	{
		StaticVariables obj1 = new StaticVariables();
		
		System.out.println(obj1.ab);
		System.out.println(ab);
		
		System.out.println(pq);
		
	}
	
	public void nonStaticMethod()
	{
		System.out.println(ab);
		System.out.println(pq);
		staticMethod();
		
	}

}
