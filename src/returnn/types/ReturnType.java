package returnn.types;

public class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa = {23,3,435,2,3,2};
		int[] bb = {33,32,2,5,7,5};
		ReturnType obj = new ReturnType();
		
		int []addition = obj.getAdditionOfTwoArrays(aa, bb);
		
		
		String data = obj.getConcate("ABCD", "PQRS");
		System.out.println(data);

		float ff = obj.getDevision(234.4f, 23.5f);
		System.out.println(ff);

		int z = getIntData(12, 22);
		System.out.println(z);
		int g = getIntData(34, 33);
		System.out.println(g);

	}

	public static int getIntData(int a, int b) {
		int c = a + b;
		int f = 78;

		return c;
	}

	public float getDevision(float a, float b) {

		float f = a / b;

		return f;
	}

	public String getConcate(String str, String ss) {
		String strr = str + ss + "GHGFHG";

		return strr;
	}

	public int[] getAdditionOfTwoArrays(int[] a, int[] b) {

		int[] add = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			add[i] = a[i] + b[i];
		}
		
		return add;

	}

}
