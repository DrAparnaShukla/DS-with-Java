/* Author: Aparna Shukla*/
/* Tower of Hanoi */
import java.util.Scanner;
class TowerofHanoi 
{
    static void towerOfHanoi(int n, char source, char auxiliary, char destination) 
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from source " + source + " to destination " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from source " + source + " to destination " + destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of disk:");
        int n=sc.nextInt(); // Number of disks
        towerOfHanoi(n, 'S', 'A', 'D'); // S, A and D are names of rods
       
    }
}
