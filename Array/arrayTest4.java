//Program to implement a user-defined two-dimensional array
 import java.util.Scanner;
class arrayTest4
{
	public static void main(String args[])
	{
		//declaring and creating array objects
		int num[][]=new int[3][3];
		// Scanner class object to read input
		Scanner scan=new Scanner(System.in);
                for (int i=0;i<3; i++) 	
                {
			for(int j=0;j<3;j++)
			{
				System.out.print("Enter value at num ["+ i + "]["+j+"] =");
                                int val=scan.nextInt();
				num[i][j]=val;
				
			}
			System.out.println();
		}
		//Display 2D Array value
		for (int i=0;i<3; i++) 	
                {
			for(int j=0;j<3;j++)
			{
				System.out.print(num[i][j] +"\t");
			}
			System.out.println();
		}
	}//end  main
}//end class