package switchstatement;

public class SwitchClass4 {

	public static void main(String[] args) {

	char ch = 'A';
	
	

		switch (ch) {
		case 'A':
		case 'a':			
		case 'O':
		case 'o':			
		case 'e':
		case 'E':		
		case 'u':
		case 'U':			
		case 'I':
		case 'i':
			System.out.println("Provided character is wovel");
			break;
		
		default:
			System.out.println("Provided character is consonent");
			break;

		}
		
		
		System.out.println("After switch statement");

	}

}
