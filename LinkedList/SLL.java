/*Author : Aparna Shukla */
/* Singly Linked List Implementation */
/*Insert at Begin and Delete at Begin */

import java.util.Scanner;

//Node class: only represents a single node. It knows about data and next.
class Node
{
    //singly node template
    int data;
    Node next;
}//end snode

// class NodeOperation
// {
// }//end of Node Operation

//SLL class:manages the whole list. It keeps the head reference and contains operations such as insert, delete, search, and display.
public class SLL
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
    /*insertNode() Method at Begin of the List*/
    /*Create new node, fill new node and attach to the list */
    static void insertNode( )
    {
        System.out.print("Enter value to be inserted::");
        int val=sc.nextInt();

        //create a new node of class Node
        Node slnode=new Node();

        //Fill newly created node
        slnode.data=val;
        slnode.next=null;

        //Check if List is empty
        if(head==null)
        {
            //Add first node to the list by assigning its reference to head
            head=slnode;

        }
        else
        {
            //Insert Node at begin
            //Update new node next field with the yet new node i.e. Head value
            slnode.next=head;

            //Update head with the new node
            head=slnode;
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
            //Assign first node reference from head to temp
            Node temp=head;

            //Update head with the next field of yet first nodee
            head=head.next;

            //Print node value to be deleted and Dellocate temp
            System.out.println("Deleted node value is "+ temp.data);

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
}//end of SLL Class

