package thiskeyword;

public class ThisAsReturnType {
	
	int a ;
	
	public static void main(String[] args) {
		
		ThisAsReturnType obj = new ThisAsReturnType();
		obj.nonstaticMrthod();
		System.out.println(obj.a);
		
	}
	
	
	public void nonstaticMrthod()
	{
		ThisAsReturnType oo = this.smMethod();
		
		System.out.println(oo.a);
	}
	
	
	public  ThisAsReturnType smMethod()
	{
		this.a = 44;
		
		return this;
	}

}
