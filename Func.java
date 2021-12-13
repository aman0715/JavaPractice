import java.util.Scanner;
class Func
{
  static int a,l,b,p;
  public static void main(String[] args)
  {
    Scanner c=new Scanner(System.in);
    System.out.println("Enter the length of the rectangle");
    l=c.nextInt();
    System.out.println("Enter the breadth of the rectangle");
    b=c.nextInt();
    area();
    peri(l,b);
  }
  public static void area()
  {
    a=l*b;
    System.out.println("Area:"+a);
  }
  public static void peri(int l,int b)
  {
    p=2*(l+b);
    System.out.println("Perimeter:"+p);
  }
}
