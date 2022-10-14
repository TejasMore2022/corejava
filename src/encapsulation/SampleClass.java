package encapsulation;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encap obj = new Encap();
		obj.asd = 34;
		System.out.println(obj.asd);
		obj.asd = -12;
		obj.setMarks(72);
		System.out.println(obj.getMarks());
		
		obj.setRollNum(-33);
		int az = obj.getRollNum();
		System.out.println(az);
	}

}
