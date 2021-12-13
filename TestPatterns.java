import java.util.Scanner;
class TestPatterns
{
  static int x;
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    do
    {
      System.out.println("1.Number Square");
      System.out.println("2.8 pattern");
      System.out.println("3.Letter Triangle");
      System.out.println("4.");
      System.out.println("5.Exit");
      System.out.println("Enter your choice");
      x=s.nextInt();
      switch(x)
      {
        case 1:
          NumSquare n=new NumSquare();
          break;
        case 2:
          Eight e=new Eight();
          break;
        case 3:
          LetterTri l=new LetterTri();
          break;
        case 5:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice");
      }
    } while (true);

  }
}

class NumSquare
{
  NumSquare()
  {
    int i,j,n;int k=1;int a=1;
    System.out.println("Enter number of lines:");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {
        System.out.print();
      }
      System.out.println();
    }
  }
}

class Eight
{
  Eight()
  {
    int i,j,k,n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your choice");
    n=s.nextInt();
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=3;j++)
      {
        if(i==2 && j==2)
        System.out.print(" ");
        else if(i>2 && i<=n-1 && j==2)
        System.out.print(" ");
        else
        System.out.print("*");
      }
      System.out.println();
    }
    for(i=2;i<=n;i++)
    {
      for(j=1;j<=3;j++)
      {
        if(i==2 && j==2)
        System.out.print(" ");
        else if(i>2 && i<=n-1 && j==2)
        System.out.print(" ");
        else
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

class LetterTri
{
  LetterTri()
  {
    int n,i,j;int a=65;
    System.out.println("Enter number of lines");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for (i=1;i<=n;i++)
    {
      for (j=1;j<=i;j++)
      {
        if(i%2!=0)
        System.out.print((char)a);
        else
        System.out.print((char)a+1);
      }
      System.out.println();
    }
  }
}
