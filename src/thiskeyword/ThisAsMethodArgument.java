package thiskeyword;

public class ThisAsMethodArgument {
	int a;
	static int stInt = 67;

	public static void main(String[] args) {

		ThisAsMethodArgument obj = new ThisAsMethodArgument();// 666
		ThisAsMethodArgument obj1 = new ThisAsMethodArgument();//777
		obj.nonStaticMethod();
		
		obj.sm(obj1);

	}

	public void nonStaticMethod() {
		
		sm(this);

	}

	public static void sm(ThisAsMethodArgument oo) {
		oo.a = 777;
		

	}
	
	

}
