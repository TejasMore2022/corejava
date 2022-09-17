package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		//Ternery Operators (if-then-else)
		 // ? :
		
		boolean flag = false;
		int a=8;
		int age = 17;
		
		String data = age>=18?"You can vote":"You can not vote";
		System.out.println(age>=18?"You can vote":"You can not vote");
		System.out.println(data);
		
		float ff = flag&&(a<0)?44.4f:55.4f;
		System.out.println(ff);
		
		char ch = (a>0)?'A':'b';
		System.out.println(ch);
		
		int c = flag?45:55;
		
		System.out.println(c);

	}

}
