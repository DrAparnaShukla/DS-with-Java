//function illustration
import java.util.Scanner;

public class PrintName
{
	public static void pName(String name)
	{
		System.out.println(name);
		return;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any Name:");
		String name=sc.next();
		pName(name);		
	}//end main
}//end of class