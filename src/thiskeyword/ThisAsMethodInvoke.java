package thiskeyword;

public class ThisAsMethodInvoke {
	
	int ab;
	static int stAb;
	
	
	public ThisAsMethodInvoke()
	{
		this.nonstaticMethod();
		staticMethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsMethodInvoke obj = new ThisAsMethodInvoke();
		obj.ab = 888;
		
		obj.nonstaticMethod();

	}
	
	public void nonstaticMethod()
	{
		System.out.println(this.ab);
		this.sampleMethod();
		this.staticMethod();
		
	}
  public static void staticMethod()
  {
	  System.out.println("this is static method");
	  stMethod();
	  
  }
  public static void stMethod()
  {
	  System.out.println("Static st method");
  }
  
  public void sampleMethod()
  {
	  System.out.println("Sample non static method");
	  
	  System.out.println(this.ab);
	  
  }
}
