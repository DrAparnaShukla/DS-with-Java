/*Author: Aparna Shukla */
/*Fibonacci */
import java.util.Scanner;   
public class Fibonacci 
{
    public static int fibo(int n) 
    {
        if (n <= 1) 
        {
            return n;
        } 
        else
        {
            
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number of term to generate Fibonacci series:");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) 
        
        {
            System.out.print(fibo(i) + " ");
        } 
        System.out.println(" ");    
        int result = fibo(n);
        System.out.println("Fibonacci number of " + n + " term  is: " + result);
        sc.close();
    }
}

