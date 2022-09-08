package variabletypes;

public class Student {
	
	int rollNum;
	String name;
	static String collageName;

	public static void main(String[] args) {
		
		 int pp = 90;
		System.out.println(pp);
		
		Student st1 = new Student();
		st1.rollNum =77;
		st1.name = "Amit";		
		Student st2 = new Student();
		st2.name = "Amol";
		st2.rollNum = 770;
		System.out.println(st1.name);
		System.out.println(st2.name);		
		
		st1.collageName = "ABCD";
		System.out.println(st1.collageName);
		System.out.println(st2.collageName);
		
		System.out.println(Student.collageName);
		
		Student.collageName = "BNJHY";
		System.out.println(st1.collageName);
		System.out.println(st2.collageName);
		
		System.out.println(Student.collageName);
		
		
		System.out.println("Hello");

	}
	
	public static void sampleMethod()
	{
		
		int zz = 67;
		
		System.out.println(zz);
		zz = 345;
		
	}

}
