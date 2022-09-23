package array;

import java.util.Arrays;
public class ArrayCLass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		int b = 5;

		boolean f = a == b;

		int arr[] = { 23, 2, 6, 77, 4 };

		int arr1[] = { 23, 2, 6, 77, 4 };
		
		Arrays.sort(arr);
		
		boolean actFlag = Arrays.equals(arr, arr1);
		System.out.println(actFlag);
		
		
		

		boolean fr = arr[1] == a;
		System.out.println(fr);
		boolean fg = arr[0] == arr1[0];
		System.out.println(fg);

		int arr2[] = arr;

		boolean flag = arr == arr1;

		System.out.println(flag);

		boolean ff = arr == arr2;
		System.out.println(ff);

		int z = arr[1];
		System.out.println(z);

		System.out.println(arr[3]);

		arr[0] = 777;
		arr[0] = 666;
		arr[0] = 34;

		int ln = arr.length;
		System.out.println(ln);

	}

}
