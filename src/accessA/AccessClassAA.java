package accessA;

public class AccessClassAA {
	public int publicInt = 77;
	private int privateInt = 23;
	int defaultInt = 67;
	protected int protectedInt = 890;
	
	public AccessClassAA()
	{
		System.out.println("Public constructor");
	}
	
	private AccessClassAA(boolean privateCon)
	{
		System.out.println("This is private constructor");
	}
	
	AccessClassAA(String defaultCon)
	{
		System.out.println("This is default constructor");
	}
	
	protected AccessClassAA(float protectedFloat)
	{
		System.out.println("Protected constructor");
		
	}
	

	public void publicMethod() {
		System.out.println("public Method");
	}

	private void privateMethod() {
		System.out.println("private Method");
	}

	void defaultMethod() {
		System.out.println("default Method");
	}

	protected void protectedMethod() {
		System.out.println("protected Method");
	}

	public static void main(String[] args) {
		AccessClassAA obj4 = new AccessClassAA("Default Cont");// default constructor
		AccessClassAA obj3 = new AccessClassAA(34.45f);	// protected	
		AccessClassAA obj2 = new AccessClassAA(true);// private constructor
		AccessClassAA obj = new AccessClassAA(); // public constructor
		System.out.println(obj.publicInt);
		System.out.println(obj.privateInt);
		System.out.println(obj.protectedInt);
		System.out.println(obj.defaultInt);
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
	}
	
}
