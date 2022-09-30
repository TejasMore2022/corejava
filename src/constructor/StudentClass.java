package constructor;

public class StudentClass {
	int rollNum;
	String name;

	public StudentClass() {
		
		rollNum = 1;
		name= "No Value";
		
		System.out.println("This is default constructor");
	}

	public StudentClass(int a) {
		rollNum = a;
		System.out.println("This is single parameterized constructor");
	}

	public StudentClass(int a, String str) {
		rollNum = a;
		name = str;

	}

	public StudentClass(String str, int a) {
		rollNum = a;
		name = str;

	}

	public static void main(String[] args) {

		StudentClass obj = new StudentClass();
		obj.rollNum = 88;
		obj.name = "Sachin";
		StudentClass obj1 = new StudentClass(23);
		StudentClass obj2 = new StudentClass(22, "Amit");
		StudentClass obj3 = new StudentClass(33, "Rajkumar");
		StudentClass obj4 = new StudentClass("KTCTC", 333);
		
		obj.sm();
		int z = obj.sm();
		obj.StudentClass();// this not constructor. This is method with same name as class name.
		obj.StudentClass();
		

	}

	public int sm() {
		System.out.println(rollNum);
		
		return 34;
	}
	
	public void StudentClass()
	{
		System.out.println("This is method with same name as class name");
	}

}
