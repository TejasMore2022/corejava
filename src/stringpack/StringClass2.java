package stringpack;

public class StringClass2 {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),split(" "),trim(),subString(),contains(),equals(),
				// concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		
    String str = "Welcome to KTCTC";
    String data = "Showing 1-10 of 220 records";    
    String str2 = "           Welcome     to            KTCTC              ";
    
    String ss6 = str.substring(2, 7);
    System.out.println(ss6);
    
    String ss5 = str.substring(14);
    System.out.println(ss5);
        String ss4 =  str2.trim();
        System.out.println(ss4);
		String[] ss3 = data.split(" ");
		String cnt = ss3[3];
		int count = Integer.parseInt(cnt);
		System.out.println(count);
		String ss[] = str.split("o");
		System.out.println(ss[0]);
		String ss2 = str.replace(" to ", "space 2 space");
		System.out.println(ss2);
		String ss1 = str.replace('t', 'Z');
		System.out.println(ss1);
		boolean fl2 = str.startsWith("Welcome to");
		System.out.println(fl2);
		boolean fl1 = str.endsWith(" to KTCTC");
		System.out.println(fl1);

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		int lng = str.length();
		System.out.println(lng);
		char ch = str.charAt(8);
		System.out.println(ch);

	}

}
