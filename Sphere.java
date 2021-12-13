import java.util.Scanner;
class Sphere
{
  public static void main(String args[])
  {
    int r;
    double a,v,pi=3.1415;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the radius of the sphere:");
    r=s.nextInt();
    a=4*pi*r*r;
    v=4/3*pi*r*r*r;
    System.out.println("Area of the sphere is:"+a);
    System.out.println("Volume of the sphere is:"+v);
  }
}
