package whileloop;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		
		String[] strArr = {"Hfllo", "welcome to", "KTCTC", "Hello"};
		int i=0;
		do
		{
			System.out.println(strArr[i]);
			i++;
			
		}
		while(i<strArr.length);
		
		do
		{
			System.out.println("Inside do while loop");
			a++;
		}while(a<10);

	}

}
