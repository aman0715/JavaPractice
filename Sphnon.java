import java.util.Scanner;
class Sphnon
{
  int r;
  double a,v,pi=3.1415;
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the radius of the sphere:");
    Sphnon o =new Sphnon();
    o.r=s.nextInt();
    Volume vl=new Volume();
    vl.volume(o.r);
    Area ae=new Area();
    ae.area(o.r);
  }
}

class Volume
{
  //double v,pi=3.1415;
  public void volume(int r)
  {
    Sphnon e=new Sphnon();
    e.v=4/3*e.pi*r*r*r;
    System.out.println("Volume:"+e.v);
  }
}

class Area
{
  //double a,pi=3.1415;
  public void area(int r)
  {
    Sphnon m=new Sphnon();
    m.a=4/3*m.pi*r*r;
    System.out.println("Area:"+m.a);
  }
}
