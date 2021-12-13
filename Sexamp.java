import java.util.Scanner;
class Sexamp
{
private static int a,l,b,p;
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
   System.out.println("Enter the length of the rectangle");
   l=s.nextInt();
   System.out.println("Enter the breadth of the rectangle");
   b=s.nextInt();
   p=2*(l+b);
   System.out.println("Perimeter of the rectangle is"+p);
   a=l*b;
   System.out.println("Area of the rectangle is"+a);
}
}
