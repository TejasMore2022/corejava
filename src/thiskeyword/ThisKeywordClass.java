package thiskeyword;

public class ThisKeywordClass {

	int ab;
	int pq;
	static int stInt = 5;

	public ThisKeywordClass()
	{
		this.ab = 89;
	}
	
	
	public static void main(String[] args) {

		ThisKeywordClass obj = new ThisKeywordClass();
		obj.ab = 777;
		obj.nonStaticMethod();
		
		ThisKeywordClass oo = new ThisKeywordClass();
		
		oo.nonStaticMethod();
		
		ThisKeywordClass.staticMethod();

	}

	public void nonStaticMethod() {
		int ab = 89;
		System.out.println(ab);
		System.out.println(this.ab);
		System.out.println(pq);
		System.out.println(this.stInt);

	}
	
	public void sm(int ab)
	{
		this.ab = ab;
		
	}
	
	public static void staticMethod()
	{
		int ab = 89;
		System.out.println(ab);
		System.out.println(this.ab);
		System.out.println(pq);
		System.out.println(this.stInt);
	}

}
