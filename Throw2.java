import java.util.Scanner;
class Throw2
{
  static void validate(int n)
    {
      try
      {
        if(n<18)
        throw new ArithmeticException("not valid");
        else
        System.out.println("Welcome to vote");
      }
      catch(ArithmeticException e)
      {
        System.out.println(e);
      }
    }
  public static void main(String[] args)
  {
    int a;
    System.out.println("Enter the age");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    validate(a);
  }
}
