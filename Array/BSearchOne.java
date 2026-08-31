/*Author: Aparna Shukla*/
/*Program to Illustrate the Binary Search in One-dimensional Array */
import java.util.Scanner;
import java.util.Arrays;

public class BSearchOne 
{
    Scanner sc = new Scanner(System.in);

    public void binarySearch() 
    {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;

        System.out.println("Array initialized with size: " + size);
        System.out.println("Initialized Array in sorted order");
        // Initializing an array with user input
        for (i = 0; i < size; i++) {
            System.out.print("Enter element at arr[" + i + "]= ");
            arr[i] = sc.nextInt();
        }
        // Printing the elements of array
        System.out.println("Elements of Array are:");
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        // Sorting the array before performing binary search
        Arrays.sort(arr);
        
        // Printing the elements after sorting
        System.out.println("Elements of Array after sorting:");
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = size - 1;
        boolean found = false;

        while (low <= high) 
        {
            int mid = (low + high) / 2;
            if (arr[mid] == key) 
            {
                found = true;
                System.out.println(key + " is found in the array at position " + mid + " .");
                break;
            } 
            else if (arr[mid] < key) 
            {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }//end of while loop

        if (!found) {
            System.out.println(key + " is not found in the array.");
        }
    }//end of binarySearch

    public static void main(String[] args)
    {
        BSearchOne obj = new BSearchOne();  // Create an instance of BSearchOne
        obj.binarySearch();                 // Call the binarySearch method on the instance
    }
}
