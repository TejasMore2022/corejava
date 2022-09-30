package scanner;

import java.util.Scanner;

public class UserDataCLass {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first Number for addition");
      int a = sc.nextInt();
      System.out.println("Enter second number ");
      
     int b =  sc.nextInt();
      
     int c = a+b;
      
      System.out.println("Addition ="+c);
		
		

	}

}
