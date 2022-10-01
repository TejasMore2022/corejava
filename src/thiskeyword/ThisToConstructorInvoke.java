package thiskeyword;

public class ThisToConstructorInvoke {
	int rollNum;
	String name;

	public ThisToConstructorInvoke() {
		this(23);
		
		System.out.println("This is default constructor");
	}

	public ThisToConstructorInvoke(int a) {
		this(33,"KTCTC");
		rollNum = a;
		System.out.println("This is single parameterized constructor");
	}

	public ThisToConstructorInvoke(int a, String str) {
		this("AS",56);
		rollNum = a;
		name = str;

	}

	public ThisToConstructorInvoke(String str, int a) {
		
		rollNum = a;
		name = str;

	}

	public static void main(String[] args) {

		ThisToConstructorInvoke obj = new ThisToConstructorInvoke();
		
		

	}

	public int sm() {
		
		System.out.println(rollNum);
		
		return 34;
	}
	
	public void StudentClass()
	{
		System.out.println("This is method with same name as class name");
	}

}
