package stringpack;

public class StringClass {

	public static void main(String[] args) {

		String str = "Welcome";		
		String str1 = new String("Welcome");
		String str2 = "Welcome";
		String str3 = new String("Welcome");
		
		String str4 = new String("Welcome to");
		String str5 = "Welcome to";
		//str = "come";
		
		boolean flag1 = str==str1;
		System.out.println(flag1);
		boolean flag2 = str==str2;
		System.out.println(flag2);
		boolean flag3 = str1==str3;
		System.out.println(flag3);
		
	}

}
