/*Author: Aparna Shukla*/
/*Program to Illustrate the two-dimensional Array using Dynamic Initialization*/
import java.util.Scanner;

public class twoDArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //User input for number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        //creation of 2D array with user-defined size
        int[][] arr = new int[rows][cols];

        //Dynamic Initialization of 2D array
        System.out.println("Array initialized with size: " + rows + "x" + cols);
        //Initializing a 2D array with user input
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print("Enter element at arr[" + i + "][" + j + "]= ");
                arr[i][j] = sc.nextInt();
            }
        }
        //Printing the elements of 2D array
        System.out.println("Elements of Array are:");   
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }//end of main
    
}//end of class
