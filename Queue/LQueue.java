/*Author: APARNA SHUKLA*/
/* Array based implementation of Queue */
import java.util.Scanner;
class que 
{   
    int front,rear;
    int MaxSize;
    int arr[];
}//end of que class

public class LQueue
{
    //Scanner class object for user defined values
    static Scanner sc=new Scanner(System.in);
    //que class object for queue operations
    static que q=new que();

    public static void main(String[] args)
    {
        System.out.println("Queue Implementation using Array");
        //Create an empty queue of user defined size
        createQueue( );
        //Menu Driven Queue
        do
        {
            System.out.println("");
            System.out.println("1: Enqueue into a queue");
            System.out.println("2: Dequeue from a queue");
            System.out.println("3: Traverse Queue");
            System.out.println("4: Exit from Queue Program");
            System.out.print("Enter your choice::");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: q.enqueue(); break;
                case 2: q.dequeue();break;
                //case 3: q.traverse(); break;
                case 4: System.out.println("Terminating Program");
                        System.exit(0);
            }//end of switch            
        }while(true); //end of menu
   }//end of main

    //Methods Calling for Queue Operations
    //Empty Queue Creation
   static void createQueue( )
   {
       System.out.print("Enter Queue Size: ");
       int MaxSize=sc.nextInt();
       q.arr=new int[MaxSize];  //Create an array of user defined size
       //set front and rear indices to -1 to indicate that the queue is empty
       q.front=-1;
       q.rear=-1;
   }//end of createQueue 

    //Enqueue Method: Insert an element at the rear of the queue
   static void enqueue( )
   {
       if(q.rear==q.MaxSize-1)   //check if queue is full i.e.  "Overflow"
       {
           System.out.println("Queue is Full");
           return;
       }
       else
       {
           System.out.print("Enter value to be inserted into a queue::");
           int val=sc.nextInt();
           q.rear++;                //Increment rear index
           q.arr[q.rear]=val;       //Insert value into the queue at rear index
           if(q.front==-1)          //If queue was empty, set front index to 0
               q.front=0;           //First element inserted into a queue, so set front index to 0
       }
   }//end of enqueue

    //Dequeue Method: Remove an element from the front of the queue
    static void dequeue( )
    {
         if(q.front==-1)         //check if queue is empty i.e.  "Underflow"
         {
              System.out.println("Queue is Empty");
              return;
         }
         else
         {
              int val=q.arr[q.front];            //Retrieve the value at front index
              System.out.println("Dequeued value: "+val);
              q.front++;                        //Increment front index to remove the element from the queue
              if(q.front== q.rear)                //If front index equals rear index, reset both indices to -1 since last element dequeued
              {
                  q.front=-1;
                  q.rear=-1;
              }
         }//end of else
    }//end of dequeue

    //Traverse Method: Display all elements in the queue
    static void traverse()
    {
        if(q.front==-1)         //check if queue is empty
        {
              System.out.println("Queue is Empty");
              return;
        }
        else
        {
            System.out.print("Queue elements: ");
            for(int i=q.front;i<=q.rear;i++)
            {
                System.out.print(q.arr[i]+" ");
            }
            System.out.println();
        }
    }//end of traverse

}//end of LQueue class