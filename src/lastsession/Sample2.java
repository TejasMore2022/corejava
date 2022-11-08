package lastsession;

import java.util.ArrayList;

import parameter.method.Student;

public class Sample2 {

	public static void main(String[] args) {
		
		String data = "     Welcome to KTCTC. Count of Student is 45678   ";
		
		System.out.println(Integer.parseInt(data.trim().split(" ")[7]));
		
		
		String str = data.trim();
		
		String ss[] = str.split(" ");
		
		String count = ss[7];
		
		int cnt = Integer.parseInt(count);
		
		System.out.println(cnt);

	}

}
