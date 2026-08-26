//Program to implement a user-defined two-dimensional array
 import java.util.Scanner;
class oneDArray
{
	public static void main(String args[])
	{
		//declaring and creating array objects
		int num[]=new int[3];
		// Scanner class object to read input
		Scanner scan=new Scanner(System.in);
                for (int i=0;i<3; i++) 	
                {
			System.out.print("Enter value at num ["+ i + "]=");
                        int val=scan.nextInt();
			num[i]=val;
		}
		//Display 1D Array value
		for (int i=0;i<3; i++) 	
                {
			System.out.println(num[i]);
			
		}
	}//end  main
}//end class