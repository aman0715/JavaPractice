import java.util.*;
class ArrayList4
{
  public static void main(String[] args)
  {
    ArrayList<String> n=new ArrayList<String>();
    n.add("EIE");
    n.add("CSE");
    n.add("ECE");
    n.add("EIE");
    System.out.println(n);
    System.out.println(n.get(0));
    n.set(0,"FSB");
    System.out.println(n);
    n.remove(0);
    System.out.println(n);
    n.clear();
    System.out.println(n);
  }
}
