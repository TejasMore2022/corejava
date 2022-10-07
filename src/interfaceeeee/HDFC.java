package interfaceeeee;

public class HDFC implements ReserveBank{
	public static void main(String[] args) {
		
		WorldBank wdHdfc = new HDFC();
		wdHdfc.currencyConversionRate();
		
		ReserveBank rHDFC = new HDFC();
		rHDFC.currentAccountCharges();
		rHDFC.savingAccountCharges();
		System.out.println(rHDFC.ABCD);
		
		
		HDFC hdfc = new HDFC();
		
		System.out.println(hdfc.ABCD);
		hdfc.currentAccountCharges();
		hdfc.savingAccountCharges();
		hdfc.personalAccount();
		
	}

	
	public void savingAccountCharges() {
		System.out.println("HDFC charges 5000 for saving account");
		
	}

	@Override
	public void currentAccountCharges() {
		System.out.println("HDFC charges 10000 for current account");
		
	}
	
	public void personalAccount()
	{
		System.out.println("HDFC charges 20000 for personal account");
	}
	
	@Override
	public void currencyConversionRate() {
		System.out.println("HDFC charges 2% for currency exchange");
		
	}

}
