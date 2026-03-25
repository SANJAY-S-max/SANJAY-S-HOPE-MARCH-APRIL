import java.util.*;
public class Dsa_intro
{
    static Node newnode,start= null,end;
    public static void insert(int num)
    {
        newnode = new Node(num);
        if(start == null)
        {
            start=end = newnode;
        }
        else
        {
            
            end.next = newnode;
            end = newnode;
           
            
        }
        
    }
    public static void display()
    {
        newnode = start;
        while(newnode != null)
        {
            System.out.print(newnode.data + " ");
            newnode = newnode.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int num = sc.nextInt();
            if(num == -1)
            {
                break;
            }
            insert(num);
        }
        display();
        
    }
}
class Node
{
    int data;
    Node next;
    Node(int givendata)
    {
        data = givendata;
        next = null;
    }
}
