import java.util.Scanner;
import java.lang.Math;
class Throwsexample
{
  static void val(double a,double b,double c,double r1,double r2) throws ArithmeticException,Exception
  {
      if (a==0||b==0||c==0)
      {
        throw new ArithmeticException("Divide by zero not defined");
      }
      if (r1<0||r2<0)
      {
        throw new Exception("Root of negative number");
      }
      else
      System.out.println("root 1= "+r1+"root 2= "+r2);
    }
  public static void main(String[] args)
  {
    double a,b,c,x,y,r1,r2;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a value:");
    a=s.nextInt();
    System.out.println("Enter b value:");
    b=s.nextInt();
    System.out.println("Enter c value:");
    c=s.nextInt();
    x=(b*b-(4*a*c));
    y=Math.sqrt(x);
    r1=(-b+y)/2*a;
    r2=(-b-y)/2*a;
    try
    {
      val(a,b,c,r1,r2);
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
    catch(Exception z)
    {
      System.out.println(z);
    }
    System.out.println("a= "+a);
    System.out.println("b= "+b);
    System.out.println("c= "+c);
  }
}
