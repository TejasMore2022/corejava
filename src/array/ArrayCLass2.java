package array;

import java.util.Arrays;
public class ArrayCLass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		boolean blArr[] = {true,true,false,true};
		
		System.out.println(blArr[2]);
		
		//Arrays.sort(blArr); we can not sort boolean values 
		
		
		char ch[] = {'a','z','h','A','3'};
		char ch1[] = {'a','z','h','A','3'};
		
		boolean flag = Arrays.equals(ch, ch1);
		System.out.println(flag);
		System.out.println(ch.length);
		
		System.out.println(ch[2]);
		
		ch[3] = 'Z';
		
		Arrays.sort(ch);
		
		

	}

}
