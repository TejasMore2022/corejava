package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionHandling {

	public static void main(String[] args) {
		
		sample1();
		ssMethod();
		try {
			sample3();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void sample1() 
	{
		System.out.println("Before file not found exception");
		File f = new File("C:\\Users\\91992\\AG22\\AGCoreJava\\KT.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found at mentioned location");
			e.printStackTrace();
		}
		System.out.println("After file not found exception");
		
	}
	
	public static void sample2() 
	{
		System.out.println("Before class not found exception");
		try {
			Class.forName("exception.UncheckedOrRuntimeException");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After class not found exception");
	}
	
	public static void sample3() throws SQLException
	{
		System.out.println("Before SQL exception");
		DriverManager.getConnection("127.0. 0.1:336", "root", "root123");
		System.out.println("After SQL exception");
	}
	
	public void sample4() throws Exception
	{
		System.out.println("Before file not found exception");
		File f = new File("C:\\Users\\91992\\AG22\\AGCoreJava\\KT1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception");
		System.out.println("Before class not found exception");
		Class.forName("exception.UncheckedOrRuntimeException");
		System.out.println("After class not found exception");
		System.out.println("Before SQL exception");
		DriverManager.getConnection("127.0. 0.1:336", "root", "root123");
		System.out.println("After SQL exception");
		
	}
	
	public static void ssMethod() throws NullPointerException
	{
		
	}
	
	

}
