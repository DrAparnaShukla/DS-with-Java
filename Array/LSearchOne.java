/*Author: Aparna Shukla*/
/*Program to Illustrate the Linear Search in One-dimensional Array */
import java.util.Scanner;

public class LSearchOne 
{
    Scanner sc = new Scanner(System.in);
    public void linearSearch()
    {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("Array initialized with size: " + size);
        //Initializing an array with user input
        for (i = 0; i < size; i++) 
        {
            System.out.print("Enter element at arr[" + i +"]= ");
            arr[i] = sc.nextInt();
        }
        //Printing the elements of array
        System.out.println("Elements of Array are:");   
        for ( i = 0; i < size; i++) 
        {
            System.out.println(arr[i]);
        }
        
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        
        boolean found = false;
        for (i = 0; i < size; i++) 
        {
            if (arr[i] == key) 
            {
                found = true;
                break;
            }
        }
        
        if (found) 
        {
            System.out.println(key + " is found in the array at position " + i + " .");
        } 
        else 
        {
            System.out.println(key + " is not found in the array.");
        }
    }//end of linearSearch

    public static void main(String[] args) 
    {
        LSearchOne obj = new LSearchOne(); // Create an instance of LSearchOne
        obj.linearSearch();                // Call the linearSearch method on the instance
    }//end of main

}//end of class
    

