//function illustration
import java.util.Scanner;

public class Sum
{
	public static int add(int a, int b)
	{
                
		return (a+b);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First NUmber:");
		int a=sc.nextInt();
		System.out.print("Enter Second NUmber:");
		int b=sc.nextInt();
		int c =add (a,b);
		System.out.print("Sum of " + a + " and " + b + " is " + c );
			
	}//end main
}//end of class