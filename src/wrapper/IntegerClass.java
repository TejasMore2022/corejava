package wrapper;

public class IntegerClass {
	int tt = 54;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		int a = 90;
	   // int z = "67876";
	    System.out.println(a);
	
		IntegerClass obj = new IntegerClass();
		
		System.out.println(obj.tt);
		
		int htt = Integer.parseInt("3214");
		System.out.println(htt);
		Integer rt = new Integer("45678");
		System.out.println(rt);
		int dfg = rt;
		System.out.println(dfg);
		
		Integer bn = 78;
		System.out.println(bn);
		int yy = bn;
		System.out.println(yy);
		bn = 4444;
		System.out.println(bn);
		Integer aa = new Integer(44);
		int cc = aa.intValue();
		System.out.println(cc);
		
		Integer bb = aa.valueOf(45);
		
		Integer abc = aa;
		
		

	}
	
	
	

}


/*
  class Integer {
	  private final int value; 
	  public Integer(int a) { 
		  value = a; 
	  }
	  public int intValue()
	  {
		  return this.value;
	  }
	  

		public Integer valueOf(int z)
		{
			
			Integer oo = new Integer(z);
			
			return oo;
			
		}
  }
  */

 
 
