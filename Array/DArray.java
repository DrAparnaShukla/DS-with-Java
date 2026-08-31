/*Author: Aparna Shukla*/
/*Program to Illustrate the one-dimensional Array using Dynamic Initialization*/
import java.util.Scanner;

public class DArray 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Array initialized with size: " + size);
        //Initializing an array with user input
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Enter element at arr[" + i +"]= ");
            arr[i] = sc.nextInt();
        }
        //Printing the elements of array
        System.out.println("Elements of Array are:");   
        for (int i = 0; i < size; i++) 
        {
            System.out.println(arr[i]);
        }
    }//end of main
}//end of class
