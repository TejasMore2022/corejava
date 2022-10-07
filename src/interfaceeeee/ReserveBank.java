package interfaceeeee;

public interface ReserveBank extends WorldBank{
	public final static int ABCD = 45;	
	public abstract void savingAccountCharges();	
	public abstract void currentAccountCharges();
	
	public static void  commonMethodforHomeLoan()
	{
		System.out.println("This is common static method from Interface");
	}
	
	public default void defaultMethodFromInterface()
	{
		System.out.println("default Method From Interface");
	}
	
}
