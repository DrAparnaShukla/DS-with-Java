1/*Author : Aparna Shukla */
/* Singly Linked List Implementation */
/*Menu Driven Singly Linked List Implementation in Java*/

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
}//end SLL node

//Class SLL contains Main
class SLL   
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
                case 1: SLL_InsertMethods.insertNode(); break;//calling insertNode method of SLL_InsertMethods class
                case 2: SLL_DeleteMethods.deleteNode();break;//calling deleteNode method of SLL_DeleteMethods class
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
                while(temp!=null)
                {
                    System.out.print(temp.data+"->");
                    temp=temp.next; //traverse to the next node
                }
            }
        }//end of traverseNode method  
}//end of main CLass


//Class Contains All Insert methods of SLL
class SLL_InsertMethods
{
    
    //InsertNode Method Calling
    public static void insertNode()
    {
        SLL_InsertMethods insertobj=new SLL_InsertMethods(); //object of SLL_InsertMethods class to call insert methods
        System.out.print("Enter the value to be inserted::");
        int val=SLL.sc.nextInt();
        Node newNode=new Node(val); //Parameterized constructor called to create a new node
        if(SLL.head==null)
        {
            SLL.head=newNode;
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
                int ch=SLL.sc.nextInt();
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
        newNode.next=SLL.head; //new node points to head
        SLL.head=newNode; //head points to new node
        System.out.println("Node Inserted at the beginning of a list");
        System.out.println(" ");
    }//end of insertBeginNode method

    void insertMiddleNode(Node newNode)
    {
        //Insert Node at the middle of a list
        //User defined position to insert a node in a list
        System.out.print("Enter the position to insert a node::");
        int pos=SLL.sc.nextInt();
        if(pos<=0)
        {
            System.out.println("Invalid position");
            return;
        }
        Node temp=SLL.head;
        for(int i=1; i<pos-1 && temp.next!=null; i++)
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
        Node temp=SLL.head;
        while(temp.next!=null)
        {
            temp=temp.next; //traverse to the last node
        }
        temp.next=newNode; //last node points to new node
        System.out.println("Node Inserted at the end of a list");
        System.out.println(" ");

    }//end of insertEndNode method

}//end of SLL_InsertMethods class

//Class Contains All Delete methods of SLL
class SLL_DeleteMethods
{
    //DeleteNode Method Calling
    public static void deleteNode()
    {
         SLL_DeleteMethods deleteobj=new SLL_DeleteMethods(); //object of SLL_DeleteMethods class to call delete methods
        if(SLL.head==null)
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
                int ch=SLL.sc.nextInt();
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
        Node delnode=SLL.head;
        SLL.head=SLL.head.next; //head points to the next node
        delnode=null; //delete the node 
        System.out.println("Node Deleted from the beginning of a list");
    }//end of deleteBeginNode method

    void deleteMiddleNode()
    {
        //Delete Node from the middle of a list
        //User defined position to delete a node in a list
        System.out.print("Enter the position to delete a node::");
        int pos=SLL.sc.nextInt();
        if(pos<=0)
        {
            System.out.println("Invalid position");
            return;
        }
        Node temp=SLL.head, last=null;
        for(int i=1; i<pos && temp.next!=null; i++)
        {
            last=temp; //store the last node
            temp=temp.next; //traverse to the specified position
        }
        if(temp.next==null)
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
        Node temp=SLL.head, last=null;
        while(temp.next!=null)
        {
             last=temp; //store the last node
             temp=temp.next; //traverse to the second last node
        }

        //if single node
        if(last==null)
        {
            SLL.head=null; //if only one node in the list, set head to null
            System.out.println("Last Node Deleted from the list");
        }
        else
        {
            last.next=null; //second last node points to null
            System.out.println("Node Deleted from the end of a list");
        }
                
        
    }//end of deleteEndNode method

}//end of SLL_DeleteMethods class
        