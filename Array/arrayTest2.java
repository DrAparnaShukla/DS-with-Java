//Program to implement a two-dimensional array
class arrayTest2
{
	public static void main(String args[])
	{
		//declaring and initialization of an array
		int num[ ][ ]={{2,4,6},{1,3,5}};    
		System.out.println("Given List:");
                for (int i=0; i<2; i++)
		{
                    for (int j=0; j<3; j++)
		            	System.out.print(num[i][j]+" ");
                    System.out.println(); 
		
		}//end of for loop
	}//end of main
}//end of class
