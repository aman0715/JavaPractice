import java.util.Scanner;
class Arrays2
{
  int[] a=new int[5];
  Arrays2()
  {
    Scanner s=new Scanner(System.in);
    for(int i=0;i<=4;i++)
    {
      System.out.print("Enter a value:");
      System.out.println();
      a[i]=s.nextInt();
    }
  }
  public static void main(String[] args)
  {
    Minimum o=new Minimum();
    o.mini();
    Maximum m=new Maximum();
    m.maxi();
  }
}
class Minimum extends Arrays2
{
  int min=a[0];
  public void mini()
  {
  for (int i=1;i<a.length;i++)
  {
    if(a[i]<min)
      min=a[i];
  }
  System.out.println("Min element:"+min);
  }
}

class Maximum
{
  int max;
  public void maxi()
  {
  Arrays2 x=new Arrays2();
  max=x.a[0];
  for (int i=1;i<x.a.length;i++)
  {
    if(max<x.a[i])
      max=x.a[i];
  }
  System.out.println("Max element:"+max);
  }
}
