package accessB;

import accessA.AccessClassAA;
import accessA.SampleClass;

public class AccessClassBA {
	public static void main(String[] args) {
		AccessClassAA obj4 = new AccessClassAA("Default Cont");// default constructor
		AccessClassAA obj3 = new AccessClassAA(34.45f);	// protected	
		AccessClassAA obj2 = new AccessClassAA(true);// private constructor
		
		AccessClassAA obj = new AccessClassAA();
		System.out.println(obj.publicInt);
		System.out.println(obj.privateInt);
		System.out.println(obj.protectedInt);
		System.out.println(obj.defaultInt);
		obj.publicMethod();
		obj.privateMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		SampleClass.sampleMethodOne();
	}

}
