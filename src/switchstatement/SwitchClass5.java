package switchstatement;

public class SwitchClass5 {

	public static void main(String[] args) {

		String year = "FirstYear";
		String branch = "CIVIL";
		int age = 17;
		int choice = 1;

		switch (year) {

		case "FirstYear":
			System.out.println("You are first year student");

			if (choice == 1) {
				System.out.println("You will have Physics subject");
			} else {
				System.out.println("You will have Chemistry subject");
			}

			break;
		case "SecondYear":
			System.out.println("You are second year student");

			switch (branch) {
			case "Mech":
				System.out.println("Your subjects are TOM,SOM");

				break;
			case "CIVIL":
				System.out.println("Your subjects are MOS,TOS");

				break;
			case "Comp":
				System.out.println("Your subjects are Java,c++");

				break;
			default:
				System.out.println("Your branch is not present in Shree Ram collage of Engg");
				break;
			}

			break;
		case "ThirdYear":
			System.out.println("You are third year student");
			break;
		case "ForthYear":
			System.out.println("You are forth year student");
			break;

		default:
			System.out.println("You are YD student...");
			break;

		}
		System.out.println("After switch statement");

	}

}
