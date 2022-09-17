package parameter.method;

public class ParamMethodClass2 {

	public static void main(String[] args) {
		byte z = 89;
		addition(z);
		ParamMethodClass2 ob = new ParamMethodClass2();
		Student oo = new Student();
		oo.rollNum = 99;
		oo.name = "Amar";
		ob.sampleMethod(oo);
		System.out.println(oo.name);
	}
	
	public static void addition (byte a)
	{
		System.out.println(a);
	}
	
	public void sampleMethod(Student obj)
	{		
		obj.displayeStudentInfo();
		obj.name = "KTCTC";
		Student oo = new Student();
		oo.rollNum = 77;
		oo.name = "Salman";
	}

}
