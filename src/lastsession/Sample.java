package lastsession;

import java.util.ArrayList;

import parameter.method.Student;

public class Sample {

	public static void main(String[] args) {
		
		
		  float fl = 78.5f; 
		  int cc = 9;
		  
		  fl = cc; 
		  int aa = (int) fl;
		  
		//boolean gty =  (boolean) fl;
		 
		
		ArrayList<Object> data = new ArrayList<>();
		
		Integer a = new Integer(34);
		
		String str = new String("Welcome to KTCTC");
		
		Boolean bl = new Boolean(true);
		
		Student st = new Student();		
		
		data.add(a);
		data.add(str);
		data.add(bl);
		data.add(st);
		
		System.out.println(data);
		
		Student st3 = (Student) data.get(3);
		
		
		System.out.println(st3.name);
		Object oo = data.get(3);
		
		Student st2 = (Student) oo;
		
		System.out.println(st2.name);
		
		Object ss = data.get(1);
		
		String dd = (String) ss;
		System.out.println(dd.toUpperCase());
		System.out.println(ss);
			
		

	}

}
