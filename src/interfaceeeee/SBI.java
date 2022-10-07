package interfaceeeee;

public class SBI implements ReserveBank,IndianGov{
	
	public static void main(String[] args) {
		ReserveBank rSbi = new SBI();
		System.out.println(rSbi.ABCD);
		rSbi.currentAccountCharges();
		rSbi.savingAccountCharges();
		rSbi.currencyConversionRate();
		// only Name of interface of interface can call static method from interface
		ReserveBank.commonMethodforHomeLoan();
		
		SBI sbi = new SBI();
		System.out.println(sbi.ABCD);
		sbi.savingAccountCharges();
		sbi.currentAccountCharges();
		sbi.janDhanAccountCharges();
		sbi.currencyConversionRate();
		
	}

	@Override
	public void savingAccountCharges() {
		System.out.println("SBI charges 1000 for saving account");
		
	}

	@Override
	public void currentAccountCharges() {
		System.out.println("SBI charges 5000 for current account");
		
	}
	
	public void janDhanAccountCharges()
	{
		System.out.println("SBI charges 0 for jan dhan account");
	}

	@Override
	public void currencyConversionRate() {
		System.out.println("SBI charges 1% for currency exchange");
		
	}

}
