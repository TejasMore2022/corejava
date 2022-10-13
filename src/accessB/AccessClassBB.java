package accessB;

import accessA.AccessClassAA;

public class AccessClassBB extends AccessClassAA{
	
	public AccessClassBB()
	{
		super(34.5f);
	}
	
	public static void main(String[] args) {
		
		AccessClassAA obj4 = new AccessClassAA("Default Cont");// default constructor
		AccessClassAA obj3 = new AccessClassAA(34.45f);	// protected	
		AccessClassAA obj2 = new AccessClassAA(true);// private constructor
		
		AccessClassBB obj = new AccessClassBB();
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
