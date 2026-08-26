/*Author: Aparna Shukla */
/*Factorial */
import java.util.Scanner;
public class Factorial 
{
    public static int factorial(int n) 
    {
        if (n == 0) 
        {
            return 1;
        } 
        else
        {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find factorial:");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}