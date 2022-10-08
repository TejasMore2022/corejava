package abstractclass;

public class Sample extends AbstractClass {
	
	 

	@Override
	public void sampleAbstractMethod() {

		System.out.println("Sample abstract method");
	}
	
	public static void main(String[] args) {
		
		ABClass abS = new Sample();
		abS.abstractMethodFromABCLass();
		
		
		AbstractClass asm = new Sample();
		asm.nonstaticMethod();
		asm.staticMethod();
		asm.sampleAbstractMethod();
		
		
		Sample sm = new Sample();
		sm.sampleAbstractMethod();
		sm.nonstaticMethod();
		sm.staticMethod();
		System.out.println(sm.abc);
		System.out.println(sm.IO);
		System.out.println(sm.pqr);
		System.out.println(sm.QWE);
		
	}

	@Override
	public void janDhanAccount() {
		System.out.println("Method from Interface");
		
	}


	

}
