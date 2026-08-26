// Arithmetic operators
public class ArithOperators
{
	public static void main(String[] args)
	{
		int x=10,y=20;
		float z;
		z=x+y;
                System.out.println("The arithmetic operations of numbers " + x + " and " + y);
		System.out.println("Add = " + z);
                if (x > y)
			z=x-y;
		else
			z=y-x;
		System.out.println("Sub = " + z);
		z=x*y;
		System.out.println("Mul = " + z);
		if (x > y)
			z=x/y;
		else
			z=y/x;

		System.out.println("Div = " + z);
	}
}
