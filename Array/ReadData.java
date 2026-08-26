//Reading data using Scanner Class
import java.util.Scanner;

public class ReadData
{
	public static void main(String[] args)
	{
		int a, b;float sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number:");
		a=sc.nextInt();
		System.out.print("Enter second number:");
		b=sc.nextInt();
		sum=a+b;
		System.out.println(a + " + " + b + "=" + sum);
		
	}//end of main

}//end of class