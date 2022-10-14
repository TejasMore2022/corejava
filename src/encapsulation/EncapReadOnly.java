package encapsulation;

public class EncapReadOnly {
	// bean class
	
	private int rollNum = 1;
	private String name ="KTCTC";
	private float marks = 80.3f;
	
	
	public int getRollNum() {
		return rollNum;
	}
	public String getName() {
		return name;
	}
	public float getMarks() {
		return marks;
	}
	
	
	
}
