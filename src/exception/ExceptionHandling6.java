package exception;

public class ExceptionHandling6 {

	static String str;

	public static void main(String[] args) {
		System.out.println("Before exception");
		int a = 20;
		int b = 0;
		int c = 0;
		char ch;
			try {
				try {
					c = a / b;
				} catch (ArithmeticException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ch = str.charAt(3);
				System.out.println("Inside try block");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		System.out.println(c);

		System.out.println("After exception");

	}

}
