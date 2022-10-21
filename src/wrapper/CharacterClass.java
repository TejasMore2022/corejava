package wrapper;

public class CharacterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ar[] = {'w','F','h','T','e','3','U'};
		
		Character ch = new Character('7');
		ch = 'A';
		boolean fl1 = Character.isUpperCase(ch);
		System.out.println(fl1);
		boolean fl2 = Character.isLowerCase(ch);
		System.out.println(fl2);
		boolean fl3 = Character.isDigit(ch);
		System.out.println(fl3);
		

	}

}
