//Program to implement a user-defined one-dimensional array[Dynamic Initialization]
 import java.util.Scanner;
class arrayTest3
{
	public static void main(String args[])
	{
		//declaring and creating array objects
		 num[]=new int[3];
		
		// Scanner class object to read input
		Scanner scan=new Scanner(System.in);
		
		// displaying default values
		System.out.println("Default Values of the Array:");
		
		for (int i=0;i<num.length; i++)
		{
			System.out.println(num[i]+"\t");
		}
		
		//Initializing an array
		System.out.println("Enter "+ num.length+ " integer values:");
		
		for (int i=0;i<num.length; i++)
		{
			num[i]=scan.nextInt();       //read input
		}
		
		//displaying the initialized value
		System.out.println("\n\n***Initialized Array***");
		System.out.println("\n\n***************");
		
		for (int i=0;i<num.length; i++)
		{
			System.out.println(num[i]+"\t");
		}
	}//end of main
}//end of class arrayTest3
