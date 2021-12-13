class TypePromotion
{
  public static void main(String[] args)
  {
    byte b=1;int i=12;float f=12.00f;
    Display o=new Display();
    o.disp(b,i);
    o.disp(b,i,f);
  }
}
class Display
{
  public void disp(int a,double b)
  {
    System.out.println("method a");
  }
  public void disp(int a,float b,double c)
  {
    System.out.println("method b");
  }
  public void disp(byte a,int c)
  {
    System.out.println("method c");
  }
}
