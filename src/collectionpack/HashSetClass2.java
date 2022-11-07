package collectionpack;

import java.util.Collections;
import java.util.HashSet;

import parameter.method.Student;

public class HashSetClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get method is not provided in Set as it does not maintain insertion order
		// We can not use Collection.sort for hash set
		HashSet<Student> data = new HashSet<>();	
		Student st1 = new Student();
		st1.rollNum = 11;
		st1.name = "Ajit";
		Student st2 = new Student();
		st2.rollNum = 22;
		st2.name = "Kiran";
		
		data.add(st1);
		data.add(st2);
		
		for (Student each:data)
		{
			System.out.println(each.rollNum);
			System.out.println(each.name);
		}
		
		
	}

}
