/*Author: Aparna Shukla */
/*Program to illustrate Static 1D Array */

public class SArray 
{
    public static void main(String args[])
    {
        //Array Declaration abd creation of size 5
        int arr[]=new int[5];
        //Array Initialization
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //Printing the elements of array
        System.out.println("Elements of Array are:");
        for(int i=0;i<5;i++)
            System.out.println(arr[i]);
    }
    
}
