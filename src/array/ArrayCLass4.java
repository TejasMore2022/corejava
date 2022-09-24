package array;

import java.util.Arrays;
public class ArrayCLass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add1[][] = {{12,3},{33,2}};
		int add2[][] = {{4,1},{8,20}};	
		
		int arr[][] = {{12,3},{33,2},{5,7}};
		int arr1[][] = {{12,3},{33,2},{5,7}};
		
		boolean flag = Arrays.equals(arr, arr1);
		System.out.println(flag);
		
		Arrays.sort(arr[1]);
		
		int[] z = arr[1];
		System.out.println(z[1]);
		
		System.out.println(arr[2][0]);
		
		arr[1][0] = 777;
		
		
		
	}

}
