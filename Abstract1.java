import java.util.Scanner;
abstract class Shape
{
  protected abstract double getArea(double length);
  abstract double getPeri(double length);
}
class Square extends Shape
{
  double sarea,speri;
  public double getArea(double length)
  {
    sarea=length*length;
    return sarea;
  }
  double getPeri(double length)
  {
    speri=length*4;
    return speri;
  }
}
class Circle extends Shape
{
    double carea,cperi;
    public double getArea(double length)
    {
      carea=3.14*length*length;
      return carea;
    }
    double getPeri(double length)
    {
      cperi=length*2*3.14;
      return cperi;
    }
}
class Abstract1
{
  public static void main(String[] args)
  {
    double d;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter length");
    d=s.nextDouble();
    Circle c=new Circle();
    c.getArea(d);
    c.getPeri(d);
    System.out.println("Area of a Circle is:"+c.carea);
    System.out.println("perimeter of a Circle is:"+c.cperi);
    Square p=new Square();
    p.getArea(d);
    System.out.println("Area of square is:"+p.sarea);
    p.getPeri(d);
    System.out.println("perimeter of the square is:"+p.speri);
  }
}
