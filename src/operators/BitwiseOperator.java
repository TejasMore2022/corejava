package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// Bitwise Operators
		//   &,^,|
		
		int a = 4;// 0000 0000 0000 0000 0000 0000 0000 0100
		int b = 3;// 0000 0000 0000 0000 0000 0000 0000 0011
		
		
		int e = a^b;// 0000 0000 0000 0000 0000 0000 0000 0111
		System.out.println(e);
		
		int d = a|b; // 0000 0000 0000 0000 0000 0000 0000 0111
		System.out.println(d);
		
		int c = a&b; // 0000 0000 0000 0000 0000 0000 0000 0000
		System.out.println(c);
		
		
		
		

	}

}
