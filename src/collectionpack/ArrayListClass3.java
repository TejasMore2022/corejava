package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import parameter.method.Student;

public class ArrayListClass3 {

	public static void main(String[] args) {	  
		List<Student> data = new ArrayList<>();
		
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Ajit";
		Student st2 = new Student();
		st2.rollNum = 22;
		st2.name = "Kiran";
		
		data.add(st2);
		data.add(st1);
		data.add(new Student());
		System.out.println(data);
		
		Student ss = data.get(0);
		
		System.out.println(ss.rollNum);
		System.out.println(ss.name);
		ss.displayeStudentInfo();
		
		for (Student each:data)
		{
			System.out.println(each.rollNum);
			System.out.println(each.name);
		}
		
		
	}

}
