import java.util.Scanner;
import java.lang.Math;
class OverArea
{
  public static void main(String[] args)
  {
  int a,b,c;
  Tarea o=new Tarea();
  //o.area(3,5,6);
  //o.area(5,6);
  //o.area(5);
  Scanner s=new Scanner(System.in);
  System.out.println("Enter side of the triangle:");
  a=s.nextInt();
  o.area(a);
  System.out.println("Enter another side of the triangle:");
  b=s.nextInt();
  o.area(a,b);
  System.out.println("Enter third side of the triangle:");
  c=s.nextInt();
  o.area(a,b,c);
}
}

class Tarea
{
  public void area(int a,int b,int c)
  {
    double s,e,r;
    s=(a+b+c)/2;
    e=s*(s-a)*(s-b)*(s-c);
    r=Math.sqrt(e);
    System.out.println("Area of a triangle is:"+r);
  }
  public void area(int b,int h)
  {
    double e=(1/2.0f)*b*h;
    System.out.println("Area of a right angle triangle is:"+e);
  }
  public void area(int a)
  {
    double e;
    e=Math.pow(a,2)*(Math.sqrt(3)/4);
    System.out.println("Area of an equilateral triangle is:"+e);
  }
}
