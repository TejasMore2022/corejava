package polymorphism;

public class CompileTimePoly {

	public static void main(String[] args) {

		CompileTimePoly obj = new CompileTimePoly();
		obj.addition();
		obj.addition(23.3f);
	}

	public void addition() {
		int c = 88 + 33;
		System.out.println(c);
	}

	public void addition(int a) {
		int c = 88 + 33 + a;
		System.out.println(c);
	}
	
	public void addition(int[] a) {
		int c = 88 + 33 ;
		System.out.println(c);
	}

	public void addition(float z) {
		float c = 88 + 33 + z;
		System.out.println(c);
	}

	public void addition(float z, int a) {
		float c = a + z;
		System.out.println(c);
	}

	public static void addition(int z, float a) {
		float c = a + z;
		System.out.println(c);
	}

	public float addition(int z, float a, int aa) {
		float c = a + z + aa;
		System.out.println(c);
		return c;
	}

}
