package polymorphism;

public class C extends B{
	
	public  void nstMethod(int z)
	{
		System.out.println("This non static method is from C");
	}
	
	
	public static void main(String[] args) {
		
		B bc = new C();
		
		bc.nstMethod(22);
		
		A ac = new C();
		
		ac.nstMethod(44);
		
		A ab = new B();
		
		ab.nstMethod(23);
				
		
	}

}
