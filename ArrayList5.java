import java.util.*;
class ArrayList5
{
  public static void main(String[] args)
  {
    ArrayList<Integer> names=new ArrayList<Integer>();
    System.out.println("initial size:"+names.size());
    Scanner sc=new Scanner(System.in);
    /*for(int j=0;j<5;j++);
    {
      int s2=sc.nextInt();
      names.add(s2);
    }*/
    for(Integer j:names)
    {
      int s2=sc.nextInt();
      names.add(j);
    }
    System.out.println("Numbers in my ArrayList" +names);
  }
}
