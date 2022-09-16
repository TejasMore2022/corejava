package operators;

public class UneryOperator {

	public static void main(String[] args) {
		// Unary operator
		//   exp++,exp--,++exp,--exp,~,!
		
		int a = 5;//6,5,6
		int b = 7;//6,7,6
		
		boolean flag = false;
		
		boolean ff2 = !(a>b);
		System.out.println(ff2);
		
		boolean ff = !flag;
		System.out.println(ff);
		
		int i = ~a;// a*-1 -1
		System.out.println(i);
		
		int h = --b+b++-a++-a--+b--+a++;//6+6-5-6+7+5
		System.out.println(h);// 18,20,16,13,23
		
		int g = ++a-b--+a--+a++;
		
		System.out.println(g);// 7, 11, 9 , 10
		
		int f = --b;
		System.out.println(f);
		System.out.println(b);
		
		int e = ++a;
		System.out.println(e);
		System.out.println(a);
		
		int d = b--;
		System.out.println(d);
		System.out.println(b);
		
		
		int c = a++;
		System.out.println(c);
		System.out.println(a);
		

	}

}
