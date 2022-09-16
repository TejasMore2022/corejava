package operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		//  Arithmatic operator
		//   +,-,*,/,%
				
		String data = "Welcome" + " to";
		String str = "KTCTC";
		
		String ss = str + " "+data;
		System.out.println(ss);
		
		int a = 8;
		int b = 5;
		float x = 4.2f;
		String frt = str+a+b;
		System.out.println(frt);
		System.out.println(a+b+str);
		System.out.println(str+a+b);
		System.out.println(str+(a+b));
		
		
		float i = a%x;
		System.out.println(i);
		
		int h = a%b;
		
		System.out.println(h);
		
		float g = x/b;
		System.out.println(g);
		
		float f = a/b;
		System.out.println(f);
		
		int e = a*b;
		System.out.println(e);
		
		int d = a-b;
		System.out.println(d);
		
		int c = a+b;
		System.out.println(c);
		
		
	}

}
