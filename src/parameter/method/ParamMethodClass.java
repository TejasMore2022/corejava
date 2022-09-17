package parameter.method;

public class ParamMethodClass {

	public static void main(String[] args) {
		ParamMethodClass obj = new ParamMethodClass();
		sampleAddition();
        addition(22);
        obj.conc("Elcome", 'A', 555, 44.44f, "Sample string");
        obj.substraction(23, 44);
        obj.substraction(33, 66);
        obj.devision(22, 2.3f);
        obj.devision(23, 12.4f);
	}
	
	public static void sampleAddition()
	{
		int c = 44+55;
		System.out.println(c);
	}
	
	public static void addition(int a)
	{
		int c = a+55;
		System.out.println(c);
	}
	
	public void substraction(int aa, int bb)
	{
		int c = aa-bb;
		System.out.println(c);
	}
	
	public void devision(int x, float y)
	{
		
		float c = x/y;
		System.out.println("Devision = "+c);
	}
	
	public void conc(String str1, char ch, int vv, float r, String str2)
	{
		String data = str1+ch+vv+str2+r;
		System.out.println(data);
		
	}

}
