import java.util.Scanner;
class Pattern1
{
  public static void main(String[] args)
  {
    int x;
    Scanner s=new Scanner(System.in);
    do
    {
      System.out.println(" ");
      System.out.println("1.Star Triangle");
      System.out.println("2.Number Triangle");
      System.out.println("3.Star Pyramid");
      System.out.println("4.Exit");
      System.out.println("Enter your choice");
      x=s.nextInt();
      switch (x)
      {
        case 1:
          Star p1= new Star();
          break;
        case 2:
          Num p2= new Num();
          break;
        case 3:
          Pyramid p3=new Pyramid();
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice");
      }
    } while (true);
  }
}

class Star
{
  Star()
  {
    int a,i,j;
    System.out.println("Enter the number of lines");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    for(i=1;i<=a;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

class Num
{
  Num()
  {
    int a,i,j;
    System.out.println("Enter the number of lines");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    for(i=1;i<=a;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}

class Pyramid
{
  Pyramid()
  {
    int a,i,j;int k=0;
    System.out.println("Enter the number of lines");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    for(i=1;i<=a;i++)
    {
      for (k=a-i;k>=1;k--)
      {
        System.out.print(" ");
      }
      for(j=1;j<=i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
