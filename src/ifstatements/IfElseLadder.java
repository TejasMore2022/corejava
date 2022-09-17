package ifstatements;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 45;
		
		if (marks<40)
		{
			System.out.println("You are Failed!!");
		}
		else if (marks>=40 && marks<50)
			{
				System.out.println("You are passed with second class");
			}
		else if (marks>=50 && marks<60)
				{
					System.out.println("You are passed with first class");
				}
		else if(marks>40)
		{
			System.out.println("You have Passed");
		}
		else if(marks>60&&marks<=100)
				{
					System.out.println("You passed with Destinction");
				}
		else
		{
			System.out.println("Invalid marks");
		}
			
			
		

	}

}
