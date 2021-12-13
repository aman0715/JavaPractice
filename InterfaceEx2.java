import java.util.Scanner;
interface X
{
 void meth1();
}
interface Y
{
  void meth2();
}
class InterfaceEx2 implements X,Y
{
  public void meth1()
  {
    int n;
    System.out.println("Enter the number of lines:");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=n;j>=i;j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=1;i<=n-1;i++)
    {
      for(int j=1;j<=i+1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public void meth2()
  {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of lines");
    n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print(" ");
      }
      for(int j=n;j>=i;j--)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    for(int i=1;i<=n-1;i++)
    {
      for(int j=n-1;j>=i;j--)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=i+1;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args)
  {
    InterfaceEx2 i=new InterfaceEx2();
    i.meth1();
    i.meth2();
  }
}
