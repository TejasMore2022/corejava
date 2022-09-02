package sampleclass;

public class SampleClass {
	static int z = 77;

	public static void main(String[] args) {		
		
		ArithmaticCalculations.addition();
		ArithmaticCalculations.substraction();
		System.out.println(ArithmaticCalculations.aa);
		char cc = ArithmaticCalculations.ch;
		System.out.println(cc);
		
		sampleMethodFromSampleClass();
		System.out.println(z);

	}
public static void sampleMethodFromSampleClass()
{
  System.out.println("sample Method From Sample Class");	
  System.out.println(z);
}
}
