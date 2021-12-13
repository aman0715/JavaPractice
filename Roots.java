import java.lang.Math;
import java.util.Scanner;
class Roots
{
  public static void main(String[] args)
  {
    Quad o=new Quad();
    o.enter();
  }
}
class Quad
{
  double a,b,c,x,y,r1,r2;
  public void enter()
  {
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
  if(x<0)
  {
    System.out.println("Roots are imaginary");
  }
  else if (x==0)
  {
      System.out.println("Roots are real and equal");
      System.out.println("First root is:"+r1);
      System.out.println("Secomd root is:"+r2);
  }
  else
  {
    System.out.println("Roots are real and distinct");
    System.out.println("First root is:"+r1);
    System.out.println("Secomd root is:"+r2);
  }
  }
}
