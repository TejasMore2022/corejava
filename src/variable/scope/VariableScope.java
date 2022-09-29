package variable.scope;

public class VariableScope {
	
	int instVari = 67;
	static int stVari=44;

	public static void main(String[] args) {
		int a=90;
		System.out.println(a);
		
		System.out.println(instVari);
		System.out.println(stVari);
		
		 if (a>3)
		 {
			 System.out.println(instVari);
				System.out.println(stVari);
		 }

	}
	
	public  void sampleNonstaticMethod()
	{
		
		System.out.println(instVari);
		System.out.println(stVari);
		int b = 88;
		System.out.println(b);
       for (int i=0;i>12;i++)
       {
    	   System.out.println(instVari);
   		System.out.println(stVari);
   		System.out.println(i);
    	   
    	   while(b>2)
    	   {
    		   System.out.println(zFor);
        	   System.out.println(b);
        	   System.out.println(i);
    	   }
    	   
    	   int zFor = 0;
    	   System.out.println(zFor);
    	   System.out.println(b);
    	   
    	    if (b>2)
    	    {    	    	
    	    	int sIf = 56;
    	    	System.out.println(sIf);
    	    	System.out.println(zFor);
    	    	   System.out.println(b);
    	    	   System.out.println(instVari);
    	   		System.out.println(stVari);
    	    }
    	    System.out.println(sIf);
       }
       
       System.out.println(i);
       System.out.println(zFor);
       System.out.println(sIf);
      
	}

}
