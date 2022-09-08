package objectclass;

public class HumanBeing {
	int rollNum;
	String name = "KTCTC";
	float marks;
static int pqrs = 888;
	public static void main(String[] args) {	
		
		HumanBeing objO = new HumanBeing();
		HumanBeing oo = new HumanBeing();

        HumanBeing obj1 = objO;
        obj1 = oo;
        System.out.println(objO.pqrs);
        		
		objO.rollNum = 1;
		objO.name = "Amit";
		objO.marks = 56.3f;
		
		oo.rollNum =2;
		oo.name = "Chandu";
		oo.marks = 77.56f;
		System.out.println(HumanBeing.pqrs);
		
		System.out.println(obj1.marks);
		System.out.println(obj1.name);
		
		objO.rollNum = oo.rollNum;
		
		objO.humanBeingCanRun();
		objO.humanBeingPlaysSport();
		int z = objO.rollNum;
		System.out.println(z);	
		System.out.println(objO.name);
		System.out.println(objO.marks);
		
		System.out.println(oo.marks);
		System.out.println(oo.rollNum);
		System.out.println(oo.name);
		
		System.out.println(objO.pqrs);
		objO.humanBeingEatsFood();
  
	}
	
	
	public void humanBeingCanRun()
	{
		HumanBeing obj = new HumanBeing();
		System.out.println(obj.marks);
		System.out.println("human Being Can Run");
	}
	
	public void humanBeingPlaysSport()
	{
		System.out.println("Human being plays sport");
	}
	
	public static void humanBeingEatsFood()
	{
		System.out.println("human Being Eats Food");
	}

}

