
/*Author: Aparna Shukla */
/* Array Based Stack */
import java.util.Scanner;
class Stack
{
        int[] stackArr;
        int top;
        int MaxSize;
        void create()
        {   
            //Initially top is -1 to indicate stack is empty
            top=-1;

        }// create Method
        //Push Method
        void push(Scanner sc,int size)
        {
            
            if (top==size-1) //Check for overflow(Is Stack full)
                System.out.print("Overflow Occurs");
            else
            {
                System.out.print("Enter the value to be stacked:");
                int val=sc.nextInt();
                //Increment top and then store the value in stackArr
                top++;
                stackArr[top]=val;
                System.out.println("Value Pushed Succesfully");
            }
        }//end of push
        //Pop Method
        void pop(Scanner sc,int size)
        {
            if (top==-1) //Check for underflow(Is Stack empty)
                System.out.println("Underflow  Occurs:");
            else
            {
                //Print the value to be popped and then decrement top
                int val=stackArr[top];
                System.out.println("Successfully Popped value is " + val);
                top--;
            }
        }//end of pop
        //Peek Method
        void peek(Scanner sc,int size)
        {
            if (top==-1)
                System.out.println("Underflow  Occurs:");
            else
           {
                //Print the value to be peeked
                System.out.println("Topped value is " + stackArr[top]);
           }
        }//end of peek
        //Display Method
        void display(Scanner sc,int size)
        {
            if (top==-1)
                System.out.println("Stack is Empty");
            else
           {
                //Print the stacked values from top to bottom
                System.out.println(" ");
                System.out.println("Stacked Elements are:");
                for(int i=top;i>=0;i--)
                {
                    System.out.println(stackArr[i]);
                }
           }

        }//end of peek

}//end of Stack

public class StackArray
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            Stack st=new Stack();
            System.out.print("Enter size of an stack::");
            int MaxSize=sc.nextInt();
            //creating stack of size n
            st.stackArr=new int[MaxSize];
            //Empty STack Creation
            st.create();
            //Menu Creation
            do
            {
                System.out.println(" ");
                System.out.println("1: Push");
                System.out.println("2: Pop");
                System.out.println("3: Peek");
                System.out.println("4: Display");
                System.out.println("5: Exit");
                System.out.print("Enter your choice::");
                int ch=sc.nextInt();

                switch(ch)
                {
                    case 1:st.push(sc,MaxSize); break;
                    case 2:st.pop(sc,MaxSize);  break;
                    case 3:st.peek(sc,MaxSize); break;
                    case 4:st.display(sc,MaxSize); break;
                    case 5:System.out.println("Terminating the Program");
                           System.exit(0);
                }//end of awitch
            }while(true); //end of menu
        }//end of main
}//end of main