package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionOrCompileTileException {

	public static void main(String[] args) throws Exception {
		
		CheckedExceptionOrCompileTileException obj = new CheckedExceptionOrCompileTileException();
		obj.sample4();
		sample1();
		sample2();
		sample3();
	}
	
	
	public static void sample1() throws FileNotFoundException 
	{
		System.out.println("Before file not found exception");
		File f = new File("C:\\Users\\91992\\AG22\\AGCoreJava\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		System.out.println("After file not found exception");
		
	}
	
	public static void sample2() throws ClassNotFoundException
	{
		System.out.println("Before class not found exception");
		Class.forName("exception.UncheckedOrRuntimeException");
		System.out.println("After class not found exception");
	}
	
	public static void sample3() throws SQLException
	{
		System.out.println("Before SQL exception");
		DriverManager.getConnection("127.0. 0.1:336", "root", "root123");
		System.out.println("After SQL exception");
	}
	
	public void sample4() throws FileNotFoundException, ClassNotFoundException, SQLException
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
	
	

}
