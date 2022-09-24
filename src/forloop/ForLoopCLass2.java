package forloop;

public class ForLoopCLass2 {

	public static void main(String[] args) {

		int arr[] = { 23, 2, 6, 77, 4 ,23};
		
		sample:for (int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
		
		
		System.out.println("After for loop");

	}

}
