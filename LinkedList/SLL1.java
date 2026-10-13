/*Author : Aparna Shukla */
/* Singly Linked List Implementation */
/*Insert at End and Delete from End */

import java.util.Scanner;

//Node class: only represents a single node. It knows about data and next.
class Node
{
    //singly node template
    int data;
    Node next;
}//end snode

//SLL class:manages the whole list. It keeps the head reference and contains operations such as insert, delete, search, and display.
public class SLL1
{
    //Creating head that point the first node of an existing list always
    static Node head;  //Automatically assign null to head 
    
    //for user defined values
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        
        //Menu Driven Linked LIst
        do
        {
            System.out.println("");
            System.out.println("1: Insert Node in a list");
            System.out.println("2: Delete Node from a list");
            System.out.println("3: Traverse Linked List ");
            System.out.println("4: Exit from Program");
            System.out.print("Enter your choice::");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: insertNode(); break;
                case 2: deleteNode();break;
                case 3: traverseNode(); break;
                case 4: System.out.println("Terminating Program");
                        System.exit(0);
            }//end of switch
        }while(true);//end of menu
    }// end of main

    //Linked List Method
    /*insertNode() Method at End of the List*/
    /*Create new node, fill new node and attach to the list */
    static void insertNode( )
    {
        
        System.out.print("Enter value to be inserted::");
        int val=sc.nextInt();

        //create a new node of class Node
        Node newNode=new Node();


        //Fill newly created node
        
        newNode.data=val;
        newNode.next=null;

        //Check if List is empty
        if(head==null)
        {
            //Add first node to the list by assigning its reference to head
            head=newNode;

        }
        else
        {
            //Insert Node at end
            //Temporary Node Creation
            Node temp=head;
            //Traverse to the last node
            while(temp.next!=null)
            {
                temp=temp.next;
            }//end of while 
            //Update last node next field with the yet new node 
            temp.next=newNode;
          
        }//end of else
    }//end insertNode()

    /*deleteNode() Method at Delete from the begining of the List*/
    static void deleteNode( )
    {

        //Check if List is empty: No deletion possible
        if(head==null)
        {
            System.out.println("List is Empty!!");
        }
        else
        {
            //Delete Node from begin
            //Create temporary node to hold the first node reference
            Node delnode=head, last=null;

            //Traverse to the last node in the list and preserve node reference before update
            while(delnode.next!=null)
            {

                last=delnode;
                delnode=delnode.next;
            }//end of while
            //Print node value to be deleted and Dellocate temp
            System.out.println("Deleted node value is "+ delnode.data);
            //if only one node
            if(delnode==head)
                head=null;
            else
                //Update Second last node as last node
                last.next=null;

        }//end of else
    }//end deleteNode()

   /*traverseNode() Method to traverse the whole linked list*/
    static void traverseNode( )
    {

        //Check if List is empty: No deletion possible
        if(head==null)
        {
            System.out.println("List is Empty!!");
        }
        else
        {
            //Traverse Node from begin
            //Assign first node reference from head to temp
            Node temp=head;
            System.out.println("Existing Linked List Elements are::");
            while (temp != null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }//end for loop
        }//end of else
    }//end traverseNode()
}//end of SLL1 Class

