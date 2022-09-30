package scanner;

import java.util.Scanner;

public class UserDataCLass4 {

	public static void main(String[] args) {
		int pass=4567;
		
      Scanner sc = new Scanner(System.in);

      System.out.println("Please enter your password");
      
      int actual = sc.nextInt();
 
		if (actual==pass)
		{
			System.out.println("Your are logged in sucsessfully");
		}
		else
		{
			System.out.println("You have entered wrong password");
		}
		

	}

}
