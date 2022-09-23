package switchstatement;

public class SwitchClass2 {

	public static void main(String[] args) {

		int a = 1; 

		switch (a) {
		
		case 22:
			System.out.println("user have given choice 22");
			break;
		case 1:
			System.out.println("user have given choice 1");
			break;
		case 2:
			System.out.println("user have given choice 2");
			break;
		case 20:
			System.out.println("user have given choice 20");
			break;
		
		default:
			System.out.println("This case is not present currently...");
			break;

		}
		
		
		System.out.println("After switch statement");

	}

}
