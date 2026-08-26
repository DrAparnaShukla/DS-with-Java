//function illustration using calling function by class object
import java.util.Scanner;

public class MulFunction
{
	public int mul(int a, int b)
	{
                
		return (a*b);
	}
	public static void main(String[] args)
	{
		MulFunction m= new MulFunction();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First NUmber:");
		int a=sc.nextInt();
		System.out.print("Enter Second NUmber:");
		int b=sc.nextInt();
		int c =m.mul(a,b);
		System.out.print("Product of " + a + " and " + b + " is " + c );
			
	}//end main
}//end of class