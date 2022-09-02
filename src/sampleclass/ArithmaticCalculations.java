package sampleclass;

public class ArithmaticCalculations {
	
	static int aa = 89;
	static char ch = 'A';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa = 90;
		System.out.println(ArithmaticCalculations.aa);
		char cc = ArithmaticCalculations.ch;
		System.out.println(cc);
		
		System.out.println("This is main method");
      ArithmaticCalculations.addition();
      ArithmaticCalculations.substraction();
      ArithmaticCalculations.addition();
      addition();
      System.out.println("This is end line in main method");
	}
	
	public static void addition()
	{
		int a = 89;
	
		int b = 23;
		int c = a+b;
		System.out.println(aa);
		System.out.println(c);
		ArithmaticCalculations.substraction();
		
	}
	
	public static void substraction()
	{
		int a = 89;
		int b = 23;
		int c = a-b;
		
		System.out.println(c);
	}
	
	public void multiplication()
	{
		int a = 7;
		int b = 5;
		int c = a*b;
		System.out.println(c);
		
		
	}

}
