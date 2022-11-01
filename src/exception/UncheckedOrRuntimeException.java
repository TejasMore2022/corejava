package exception;

import parameter.method.Student;

public class UncheckedOrRuntimeException {
static String str;
static Student st;
	public static void main(String[] args) {
		int a = 8;
		int b = 0;
		String data = "6787t";
		
		char cc = data.charAt(55);
		System.out.println(cc);
		
		char []ch = {'2','f','j'};
		ch[8] = 777;
		System.out.println(ch[10]);
		
		int num = Integer.parseInt(data);
		System.out.println(num);
		
		st.rollNum = 77;
		boolean ff = str.contains("ABC");
		System.out.println(ff);
		int c = a/b;		
		System.out.println(c);
		System.out.println("After exception line");

	}

}
