//Reading data using the BufferedReader Class
import java.io.*;

public class BufferReadData
{
	public static void main(String[] args)throws Exception
	{
		int a, b;float sum;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first number:");
		a=Integer.parseInt(br.readLine());
		System.out.print("Enter second number:");
		b=Integer.parseInt(br.readLine());
		sum=a+b;
		System.out.println(a + " + " + b + "=" + sum);
		
	}//end of main

}//end of class