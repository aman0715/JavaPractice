import java.util.*;
class ArrayList3
{
  public static void main(String[] args)
  {
    ArrayList <Integer> n=new ArrayList <Integer>(Arrays.asList(10,30,40,10,60));
    Scanner s=new Scanner(System.in);
    int u=0;
    /*for(Integer i=5:n)
    {
      n.add(s.nextInt());
    }*/
    System.out.println("List is"+n);
    for(Integer i:n)
    {
        if(i==i+1)
        {
        u=-1;
        break;
        }
        else
        u=1;
    }
    if(u==-1)
    System.out.println("Not Unique");
    if(u==1)
    System.out.println("Unique");
    }
}
