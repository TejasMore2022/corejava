package collectionpack;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import parameter.method.Student;

public class TreeSetClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We can not add objects of user defined classes in tree set as tree set sorts data. It does not decides on which parameter it should sort object.
		TreeSet<Student> data = new TreeSet<>();	
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
