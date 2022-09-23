package switchstatement;

public class SwitchClass3 {

	public static void main(String[] args) {

	char ch = 'o';
	
	if (ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
	{
		System.out.println("Provided character is wovel");
	}
	else
	{
		System.out.println("Provided character is consonent");
	}

		switch (ch) {
		
		case 'a':
			System.out.println("Provided character is wovel");
			break;
		case 'o':
			System.out.println("Provided character is wovel");
			break;
		case 'e':
			System.out.println("Provided character is wovel");
			break;
		case 'u':
			System.out.println("Provided character is wovel");
			break;
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
