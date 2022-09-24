package array;

import java.util.Arrays;
public class ArrayCLass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float flArr[] = new float[2];
		
		flArr[0] = 67.3f;
		flArr[1] = 66.23f;
		
		int acr[] = new int[3];
		
		acr[0] = 8;
		acr[1] = 5;
		acr[2] = 56;
		
     
		String[] arr = {"Hfllo", "welcome to", "KTCTC", "Hello"};
		String[] arr1= {"Hfllo", "welcome to", "KTCTC", "Hello"};
		
		boolean flag = Arrays.equals(arr, arr1);
		System.out.println(flag);
		
		System.out.println(arr.length);
		
		Arrays.sort(arr);
		
		
      sampleMethod(arr);
	}
	
	public static void sampleMethod(String[] stArr)
	{
		System.out.println(stArr[2]);
	}

}
