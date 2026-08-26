//Program to implement a user-defined one-dimensional array and find sum of integer array
 import java.util.Scanner;
class DArraySum
{
	public void arrayInsert(int [] arr, int i, int val)
	{
		arr[i]=val;
		
	}//end of array add method

	public void arrayDisplay(int [] arr)
	{
		for (int i=0;i<arr.length; i++) 	
                {
			System.out.println(arr[i]);
		}

	}//end of array display method

	public void arraySum(int[] arr)
	{
		int total=0;
		for (int i=0;i<arr.length; i++) 	
                {
			total=total+arr[i];
		}
		System.out.println("The sum of array elements are " + total);
		
	}//end of array Sum method
		
}//end class ADD

//Main class
class oneDArraySum
{
	public static void main(String args[])
	{
		// Scanner class object to read input
		Scanner scan=new Scanner(System.in);

		//create class object
		DArraySum arsum=new DArraySum(); 
		
		//User defined array size
		System. out.print("Enter the size of an array::");
		int size=scan.nextInt();
		
		//declaring and creating array objects
		int num[]=new int[size];
                
		//call arrayInsert method
		for (int i=0;i<num.length; i++) 	
                {
			System.out.print("Enter value at num ["+ i + "]=");
                        int val=scan.nextInt();
			arsum.arrayInsert(num, i,val);

		}
                
		//call arrayDisplay method
		arsum.arrayDisplay(num);

		//call arraySum method
		arsum.arraySum(num);
	}//end  main method
}//end of main class