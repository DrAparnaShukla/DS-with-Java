/*Author : Aparna Shukla */
/* Doubly Linked List Implementation */
/*Menu Driven Showing All cases of Insertion and Deletion in DLL    */
import java.util.Scanner;

//Template for Node of DLL
class Node  
{
    int data;
    Node next;
    Node prev;

    Node(int val) //Parameterized constructor
    {
        prev=null;
        data=val;
        next=null;
        
    }
}//end DLL node

class DLL   
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
                case 1: DLL_InsertMethods.insertNode(); break;//calling insertNode method of DLL_InsertMethods class
                case 2: DLL_DeleteMethods.deleteNode();break;//calling deleteNode method of DLL_DeleteMethods class
                case 3: traverseNode(); break;
                case 4: System.out.println("Terminating Program");
                        System.exit(0);
            }//end of switch
        }while(true);//end of main menu
    }// end of main method
/********************************************************* */
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
            }  //else
    }//end of traverseNode method   
}//end of Main class DLL 
/***********************************************************************/
/***********************************************************************/
//Class Contains All Insert methods of SLL
class DLL_InsertMethods
{
    
    //InsertNode Method Calling
    public static void insertNode()
    {
        DLL_InsertMethods insertobj=new DLL_InsertMethods(); //object of SLL_InsertMethods class to call insert methods
        System.out.print("Enter the value to be inserted::");
        int val=DLL.sc.nextInt();
        Node newNode=new Node(val); //Parameterized constructor called to create a new node
        if(DLL.head==null)
        {
            DLL.head=newNode;
            System.out.println("Node Inserted in Empty List");
        }
        else
        {
            //Menu Driven Insert Method 
            System.out.println(" ");
            System.out.println("Insert Choice from below Menu");
            System.out.println(" ");
            System.out.println("1: Insert Node at the beginning of a list");
            System.out.println("2: Insert Node at the middle of a list");
            System.out.println("3: Insert Node at the end of a list ");
            System.out.print("Enter your choice::");
            int ch=DLL.sc.nextInt();
            switch(ch)
            {
                case 1: insertobj.insertBeginNode(newNode); break; 
                case 2: insertobj.insertMiddleNode(newNode);break; 
                case 3: insertobj.insertEndNode(newNode); break; 
                default:System.out.println("Wrong Choice");                       
            }//end of switch
            System.out.println(" ");
            return; //return to main menu after inserting a node
        }//end else
    }//end of insertNode method

    void insertBeginNode(Node newNode)
    {
        //Insert Node at the beginning of a list
        newNode.next=DLL.head; //new node points to head
        DLL.head.prev=newNode; //Assiging new node as the previous node to the yet first node
        DLL.head=newNode; //head points to new node
        System.out.println("Node Inserted at the beginning of a list");
        System.out.println(" ");
    }//end of insertBeginNode method

    void insertMiddleNode(Node newNode)
    {
        //Insert Node at the middle of a list
        //User defined position to insert a node in a list
        System.out.print("Enter the position to insert a node::");
        int pos=DLL.sc.nextInt();
        if(pos<=0)
        {
            System.out.println("Invalid position");
            return;
        }
        Node temp=DLL.head;
        for(int i=1; i<pos && temp.next!=null; i++)
        {
            temp=temp.next; //traverse to the specified position
        }
        newNode.next=temp; //new node next points to the next node of the current node positioned
        newNode.prev=temp.prev;//new node prev points to the previous node of the current node positioned
        temp.prev.next=newNode; //positioned node previous node next points to new node
        temp.prev=newNode; //positioned node next node prev points to new node
        System.out.println("Node Inserted at the middle of a list");
        System.out.println(" ");
    }//end of insertMiddleNode method

    void insertEndNode(Node newNode)
    {
        //Insert Node at the end of a list
        Node temp=DLL.head;
        while(temp.next!=null)
        {
            temp=temp.next; //traverse to the last node
        }
        temp.next=newNode; //last node points to new node
        newNode.prev=temp; //new node prev points to the last node
        System.out.println("Node Inserted at the end of a list");
        System.out.println(" ");

    }//end of insertEndNode method

}//end of DLL_InsertMethods class
/***********************************************************************/
/***********************************************************************/
//Class Contains All Delete methods of DLL
class DLL_DeleteMethods
{
    //DeleteNode Method Calling
    public static void deleteNode()
    {
        DLL_DeleteMethods deleteobj=new DLL_DeleteMethods(); //object of DLL_DeleteMethods class to call delete methods
        if(DLL.head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
                System.out.println(" ");
                System.out.println("Delete Choice from below Menu");
                System.out.println(" ");
                System.out.println("1: Delete Node from the beginning of a list");
                System.out.println("2: Delete Node from the middle of a list");
                System.out.println("3: Delete Node from the end of a list ");
                System.out.print("Enter your choice::");
                int ch=DLL.sc.nextInt();
                switch(ch)
                {
                    case 1: deleteobj.deleteBeginNode(); break;
                    case 2: deleteobj.deleteMiddleNode();break;
                    case 3: deleteobj.deleteEndNode(); break;
                    default:System.out.println("Wrong Choice");                        
                }//end of switch
                System.out.println(" ");
                return; //return to main menu after deleting a node
           
        }
    }//end of deleteNode method

    void deleteBeginNode()
    {
        //Delete Node from the beginning of a list
        Node delnode=DLL.head;
        DLL.head=DLL.head.next; //head points to the next node
        if(DLL.head!=null)
        {
            DLL.head.prev=null; //head previous points to null
        }
        delnode=null; //delete the node 
        System.out.println("Node Deleted from the beginning of a list");
    }//end of deleteBeginNode method

    void deleteMiddleNode()
    {
        //Delete Node from the middle of a list
        //User defined position to delete a node in a list
        System.out.print("Enter the position to delete a node::");
        int pos=DLL.sc.nextInt();
        if(pos<=0)
        {
            System.out.println("Invalid position");
            return;
        }
        Node temp=DLL.head;
        for(int i=1; i<pos && temp.next!=null; i++)
        {
           temp=temp.next; //traverse to the specified position
        }
        if(temp.next==null)
        {
            System.out.println("Invalid position");
            return;
        }
        temp.prev.next=temp.next; //Node to be deleted's previous node's next points to deleted node next
        temp.next.prev=temp.prev; //Node to be deleted's next node's prev points to deleted node prev
        temp=null; //delete the node
        System.out.println("Node Deleted from the middle of a list");
    }//end of deleteMiddleNode method

    void deleteEndNode()
    {
        //Delete Node from the end of a list
        Node temp=DLL.head;
        while(temp.next!=null)
        {
             temp=temp.next; //traverse to the second last node
        }

        //if single node
        if(temp==DLL.head && temp.next==null)
        {
            DLL.head=null; //if only one node in the list, set head to null
            System.out.println("Last Node Deleted from the list");
        }
        else
        {
            temp.prev.next=null; //second last node points to null
            System.out.println("Node Deleted from the end of a list");
        }
     
    }//end of deleteEndNode method

}//end of DLL_DeleteMethods class
        