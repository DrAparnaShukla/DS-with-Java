/*Author : Aparna Shukla */
/* Singly Linked List Implementation */
/*Menu Driven Circular Singly Linked List Implementation in Java*/

import java.util.Scanner;

//Node class: only represents a single node. It knows about data and next.
class Node
{
    //singly node template
    int data;
    Node next;

    Node(int val) //Parameterized constructor
    {
        data=val;
        next=null;
    }
}//end CSLL node

//Class CSLL contains Main
class CSLL   
{
    //Creating head that point the first node of an existing list always
    static Node head;  //Automatically assign null to head 
    //for user defined values
    static Scanner sc=new Scanner(System.in);
    //Main Method
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
                case 1: CSLL_InsertMethods.insertNode(); break;//calling insertNode method of CSLL_InsertMethods class
                case 2: CSLL_DeleteMethods.deleteNode();break;//calling deleteNode method of CSLL_DeleteMethods class
                case 3: traverseNode(); break;
                case 4: System.out.println("Terminating Program");
                        System.exit(0);
            }//end of switch
        }while(true);//end of main menu
         
    }// end of main method

    static void traverseNode()
    {
        //Traverse the list
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node temp=head;
            System.out.println("Traversing the list");
            while(temp.next!=head)
            {
                System.out.print(temp.data+"->");
                temp=temp.next; //traverse to the next node
            }
            if (temp.next==head) //to print the last node
            {
                System.out.print(temp.data);
            }
        }
    }//end of traverseNode method  
}//end of main CLass


//Class Contains All Insert methods of CSLL
class CSLL_InsertMethods
{
    
    //InsertNode Method Calling
    public static void insertNode()
    {
        CSLL_InsertMethods insertobj=new CSLL_InsertMethods(); //object of CSLL_InsertMethods class to call insert methods
        System.out.print("Enter the value to be inserted::");
        int val=CSLL.sc.nextInt();
        Node newNode=new Node(val); //Parameterized constructor called to create a new node
        if(CSLL.head==null)
        {
            CSLL.head=newNode;
            newNode.next=CSLL.head;  //Making circular node
            System.out.println("Node Inserted in Empty List");
        }
        else
        {
            //Menu Driven Insert Method 
            System.out.println("Insert Choice from below Menu");
            System.out.println("1: Insert Node at the beginning of a list");
            System.out.println("2: Insert Node at the middle of a list");
            System.out.println("3: Insert Node at the end of a list ");
            System.out.print("Enter your choice::");
            int ch=CSLL.sc.nextInt();
            switch(ch)
            {
                case 1: insertobj.insertBeginNode(newNode); break; 
                case 2: insertobj.insertMiddleNode(newNode);break; 
                case 3: insertobj.insertEndNode(newNode); break; 
                default:System.out.println("Wrong Choice");                       
            }//end of switch
            return; //return to main menu after inserting a node
            
        }
    }//end of insertNode method

    void insertBeginNode(Node newNode)
    {
        //Insert Node at the beginning of a list
        newNode.next=CSLL.head; //new node points to head
        //Finding the last node to make it circular
        Node lastnode=CSLL.head;    
        while(lastnode.next!=CSLL.head)
        {
            lastnode=lastnode.next;
        }
        lastnode.next=newNode; //last node points to new node
        CSLL.head=newNode; //Update head to new node
        System.out.println("Node Inserted at the beginning of a list");
        System.out.println(" ");
    }//end of insertBeginNode method

    void insertMiddleNode(Node newNode)
    {
        //Insert Node at the middle of a list
        //User defined position to insert a node in a list
        System.out.print("Enter the position to insert a node::");
        int pos=CSLL.sc.nextInt();
        if(pos<=0)
        {
            System.out.println("Invalid position");
            return;
        }
        Node temp=CSLL.head;
        for(int i=1; i<pos-1 && temp.next!=CSLL.head; i++)
        {
            temp=temp.next; //traverse to the specified position
        }
        newNode.next=temp.next; //new node points to the next node
        temp.next=newNode; //current node points to new node
        System.out.println("Node Inserted at the middle of a list");
        System.out.println(" ");
    }//end of insertMiddleNode method

    void insertEndNode(Node newNode)
    {
        //Insert Node at the end of a list
        Node temp=CSLL.head;
        while(temp.next!=CSLL.head)
        {
            temp=temp.next; //traverse to the last node
        }
        temp.next=newNode; //last node points to new node
        newNode.next=CSLL.head; //new node points to head to make it circular
        System.out.println("Node Inserted at the end of a list");
        System.out.println(" ");

    }//end of insertEndNode method

}//end of CSLL_InsertMethods class

//Class Contains All Delete methods of CSLL
class CSLL_DeleteMethods
{
    //DeleteNode Method Calling
    public static void deleteNode()
    {
         CSLL_DeleteMethods deleteobj=new CSLL_DeleteMethods(); //object of CSLL_DeleteMethods class to call delete methods
        if(CSLL.head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            
                System.out.println("Delete Choice from below Menu");
                System.out.println("1: Delete Node from the beginning of a list");
                System.out.println("2: Delete Node from the middle of a list");
                System.out.println("3: Delete Node from the end of a list ");
                System.out.print("Enter your choice::");
                int ch=CSLL.sc.nextInt();
                switch(ch)
                {
                    case 1: deleteobj.deleteBeginNode(); break;
                    case 2: deleteobj.deleteMiddleNode();break;
                    case 3: deleteobj.deleteEndNode(); break;
                    default:System.out.println("Wrong Choice");                        
                }//end of switch
                return; //return to main menu after deleting a node
           
        }
    }//end of deleteNode method

    void deleteBeginNode()
    {
        //Delete Node from the beginning of a list
        Node delnode=CSLL.head;
        //Traversing to the last node to make it circular
        Node lastnode=CSLL.head;
        while(lastnode.next!=CSLL.head)
        {
            lastnode=lastnode.next;
        }
        lastnode.next=CSLL.head.next; //last node points to the second node
        CSLL.head=CSLL.head.next; //head points to the next node
        delnode=null; //dereference the node to be deleted
        System.out.println("Node Deleted from the beginning of a list");
    }//end of deleteBeginNode method

    void deleteMiddleNode()
    {
        //Delete Node from the middle of a list
        //User defined position to delete a node in a list
        System.out.print("Enter the position to delete a node::");
        int pos=CSLL.sc.nextInt();
        if(pos<=0)
        {
            System.out.println("Invalid position");
            return;
        }
        Node temp=CSLL.head, last=null;
        for(int i=1; i<pos && temp.next!=CSLL.head; i++)
        {
            last=temp; //store the last node
            temp=temp.next; //traverse to the specified position
        }
        if(temp.next==CSLL.head)
        {
            System.out.println("Invalid position");
            return;
        }
        last.next=temp.next; //current node points to the next node
        temp=null; //delete the node
        System.out.println("Node Deleted from the middle of a list");
    }//end of deleteMiddleNode method

    void deleteEndNode()
    {
        //Delete Node from the end of a list
        Node temp=CSLL.head, last=null;
        while(temp.next!=CSLL.head)
        {
             last=temp; //store the last node
             temp=temp.next; //traverse to the second last node
        }

        //if single node
        if(last==null)
        {
            CSLL.head=null; //if only one node in the list, set head to null
            System.out.println("Last Node Deleted from the list");
        }
        else
        {
            last.next=CSLL.head; //second last node points to head
            System.out.println("Node Deleted from the end of a list");
        }
    }//end of deleteEndNode method

}//end of CSLL_DeleteMethods class
        