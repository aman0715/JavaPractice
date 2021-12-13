class Overloadingc
{
  //int radius,length,breadth,height;
  double areac,arear,volume,pi=3.1415;
  Overloadingc(int r)
  {
    //radius=r;
    //double areac,pi=3.1415;
    areac=pi*r*r;
    System.out.println("Area of the circle is"+areac);
  }
  Overloadingc(int l,int b)
  {
    //double arear,pi=3.1415;
    //length=l;
    //breadth=b;
    arear=l*b;
    System.out.println("Area of the rectangle is:"+arear);
  }
  Overloadingc(int x,int y,int h)
  {
    //double volume,pi=3.1415;
    //length=x;
    //breadth=y;
    //height=h;
    volume=x*y*h;
    System.out.println("Volume of the cubiod is:"+volume);
  }
  public static void main(String[] args)
  {
    Overloadingc o1=new Overloadingc(20);
    Overloadingc o2=new Overloadingc(20,10);
    Overloadingc o3=new Overloadingc(20,10,5);
  }
}
