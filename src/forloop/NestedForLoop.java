package forloop;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before for loop");
		
		AB:for (int i=0;i<2;i++)
		{
			
			System.out.println("outer for loop");
			
			pq:for (int j=0;j<2;j++)
			{
				System.out.println("inner for loop");				
				break AB;
			}
			
		}
		
		System.out.println("After for loop");

	}

}
