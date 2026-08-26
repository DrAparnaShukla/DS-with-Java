//Program to implement a user-defined one-dimensional array and find sum of integer array
 import java.util.Scanner;
class oneDArrayAdd
{
	public static void main(String args[])
	{
		// Scanner class object to read input
		Scanner scan=new Scanner(System.in);
		//User defined array size
		System.out.print("Enter the size of an array::");
		int size=scan.nextInt();
		//declaring and creating array objects
		int num[]=new int[size];
		
                for (int i=0;i<size; i++) 	
                {
			System.out.print("Enter value at num ["+ i + "]=");
                        int val=scan.nextInt();
			num[i]=val;
		}
		//Display 1D Array value
		for (int i=0;i<num.length; i++) 	
                {
			System.out.println(num[i]);
		}
		// Sum of Array element
		int total=0;
		for (int i=0;i<num.length; i++) 	
                {
			total=total+num[i];
		}
		System.out.println("The sum of array elements are " + total);

	}//end  main
}//end class