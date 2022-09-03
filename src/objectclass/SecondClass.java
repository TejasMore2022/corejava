package objectclass;

public class SecondClass {
	int aa;

	public static void main(String[] args) {
		HumanBeing obj = new HumanBeing();
		System.out.println(obj.rollNum);
		
		obj.rollNum = 8;
		obj.name = "Sanket";
		obj.marks = 56.5f;
		obj.humanBeingCanRun();
		obj.humanBeingPlaysSport();
		obj.pqrs = 90;
		obj.humanBeingEatsFood();
		
	}
	
	

}
