package returnn.types;

import parameter.method.Student;

public class ReturnType2 {
	int aaa = 8;

	public static void main(String[] args) {
		
		ReturnType2 obj = new ReturnType2();
		
		ReturnType2 ob = obj.getCurrentCLassInstance();
		
		System.out.println(ob.aaa);
		
		Student ss = obj.getStudentObject();
		
		System.out.println(ss.rollNum);

	}

	public Student getStudentObject()
	{
		Student st1 = new Student();
		st1.name = "Anand";
		st1.rollNum = 67;
		
		return st1;	
		
	}
	
	public ReturnType2 getCurrentCLassInstance()
	{
		ReturnType2 oo = new ReturnType2();
		oo.aaa = 77777;
		
		return oo;
		
	}
	

}
