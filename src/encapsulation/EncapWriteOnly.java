package encapsulation;

public class EncapWriteOnly {
	// bean class
	
	private int rollNum;
	private String name;
	private float marks;
	
	public void setMarks(float marks) {
		
		if (marks<0)
		{
			this.marks = 0;
		}
		else if (marks>100)
		{
			this.marks = 100;
		}
		else
		{
			this.marks = marks;
		}		
		
	}
	
	
	public void setRollNum(int rollNum) {
		
		if (rollNum<=0)
		{
			System.out.println("You can not have roll num less than or equal to 0");
		}
		else
		{
			this.rollNum = rollNum;
		}
		
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
