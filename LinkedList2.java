/* Write a Java Program to Perform Single Linked List
Insertion-Begining, End and Position, Deletion -Begining, End and Position
Search, Update, Dispaly*/
import java.util.Scanner;
class LinkedList2
{
    int size=0;
    Node head=null;
    Node tail=null;
    Scanner s=new Scanner(System.in);
    public class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            next=null;
            this.data=data;
            size++;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        LinkedList2 d=new LinkedList2();
            System.out.println("1.Insert at begin");
            System.out.println("2.Insert at end");
            System.out.println("3.Insert at pos");
            System.out.println("4.Display");
            System.out.println("5.Delete");
            System.out.println("6.Update");
            System.out.println("7.Search");
            System.out.println("8.Exit");
        do
        {
            System.out.println("Enter your choice");
            int o=s.nextInt();
            switch(o)
            {
                case 1:
                    d.inatb();
                    break;
                case 2:
                    d.inate();
                    break;
                case 3:
                    d.inatpos();
                    break;
                case 4:
                    d.display();
                    break;
                case 5:
                    d.deletee();
                    break;
                case 6:
                    d.update();
                    break;
                case 7:
                    d.search();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid Choice");
            }
        }while(true);
    }
    void inatb()
    {
        System.out.println("enter data");
        int data=s.nextInt();
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            n.next=head;
            head=n;
        }
    }
    void inate()
    {
        System.out.println("Enter data");
        int data=s.nextInt();
        Node n=new Node(data);
        if(head==tail)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
    }
    void inatpos()
    {
        System.out.println("Enter position");
        int i=s.nextInt();
        if(i<0||i>size+1)
        {
            System.out.println("Enter valid position");
            return;
        }
        if(i==1)
        {
            inatb();
            return;
        }
        else
        {
            System.out.println("Enter data");
            int data=s.nextInt();
            Node n=new Node(data);
            Node cur=head;
            for(int j=1;j<i-1;j++)
            cur=cur.next;
            n.next=cur.next;
            cur.next=n;
        }
    }
    void display()
    {
        if(head==null)
        {
        System.out.println("List is empty");
        return;
        }
        Node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    void deletee()
    {
        System.out.println("Enter position");
        int i=s.nextInt();
        Node cur=head;
        if(head==null)
        {
        System.out.println("List is empty");
        return;
        }
        if(i<0||i>size+1)
        {
            System.out.println("Enter valid position");
            return;
        }
        if(i==1&&size==1)
        {
            head=null;
            tail=null;
            return;
        }
        if(i==1)
        {
            head=head.next;
            size--;
            return;
        }
        else
        {
            for(int j=1;j<i-1;i++)
            {
            cur=cur.next;
            }
            cur.next=cur.next.next;
            if(i==size)
            {
                tail=null;
            }
            size--;
        }
    }
    void search()
    {
        System.out.println("Enter element to be searched");
        int se=s.nextInt();
        Node cur=head;
        int u=0;
        for(cur=head;cur.next!=null;cur=cur.next)
        {
            if(cur.data==se)
            {
             u=1;
             break;
            }
        }
        if(u==1)
             System.out.println("Element found "+cur.data);
        else
            System.out.println("Data not found");
    }
    void update()
    {
         System.out.println("Enter element to be updated");
         int u=s.nextInt();
         System.out.println("Enter item to be updated");
         int dataa=s.nextInt();
         Node cur=head;
         for(cur=head;cur.next!=null;cur=cur.next)
        {
            if(cur.data==u)
            {
             u=1;
             break;
            }
        }
        if(u==1)
        {
             cur.data=dataa;
             display();
        }
        else
            System.out.println("Data not found");
    }
}
