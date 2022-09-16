package variabletypes;

public class ArithMaticCalculation {
	int a;
	int b;
	static int z = 9;
	
	public void addition()
	{
		int c = a+b+z;
		
		System.out.println(c);
	}
	
	public void substraction()
	{
		int f = 88;
		
		int c = f - a + b-z;
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		
		ArithMaticCalculation obj = new ArithMaticCalculation();
		obj.addition();
		obj.a = 3;
		obj.b = 7;
		ArithMaticCalculation.z = 5;		
		obj.addition();
		obj.substraction();
		
	}

}
