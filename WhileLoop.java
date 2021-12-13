import java.util.*;
class WhileLoop
{
  public static void main(String[] args)
  {
    ArrayList <Integer> n=new ArrayList<Integer>();
    n.add(14);
    n.add(140);
    n.add(104);
    n.add(1);
    System.out.println("Iterator");
    Iterator iter=n.iterator();
    while(iter.hasNext())
    System.out.println(iter.next());
    }
}
