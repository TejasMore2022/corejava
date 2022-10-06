package polymorphism;

public class MainOverload {

	public static void main(String[] args) {

		System.out.println("Actual main method");
		main();
	}

	public void main(int a) {
		System.out.println("A");
	}

	public static void main() {
		System.out.println("B");
	}

}
