package forloop;

public class ForLoopCLass2 {

	public static void main(String[] args) {

		int arr[] = { 23, 2, 6, 77, 4 ,23};
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			if (i==2) {
			continue;
			
			}
			
			System.out.println("After continue");
		}
		
		sample:for (int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			continue;
			
		}
		
		
		
		
		
		
		System.out.println("After for loop");

	}

}
