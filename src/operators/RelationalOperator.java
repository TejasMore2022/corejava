package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		// Relational operator
		//   <,>,<=,>=,==,!=
		
		int a = -21;
		int b = 3;
		
		float x = 7.4f;
		float y = 3f;
		
		boolean f8 = b<y;
		System.out.println(f8);
		boolean f7 = x<y;
		System.out.println(f7);
		
		boolean f6 = a!=b;
		System.out.println(f6);
		
		boolean f5 = a==b;
		System.out.println(f5);
		
		boolean f4 = a>=b;
		System.out.println(f4);
		boolean f3 = a<=b;
		System.out.println(f3);
		
		boolean f2 = a>b;
		System.out.println(f2);
		
		boolean f1 = b<a;
		System.out.println(f1);
		

	}

}
