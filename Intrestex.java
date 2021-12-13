import java.lang.Math;
class Intrestex
{
  public static void main(String[] args)
  {
    SCintrest o=new SCintrest();
    o.intrest(100,20,1);
    o.intrest(100,20,2,6);
  }
}
class SCintrest
{
  public void intrest(double p,double t,double r)
  {
    double si;
    si=(p*t*r)/100;
    System.out.println("Simple Intrest is:"+si);
  }
  public void intrest(double p,double t,double r,double n)
  {
    double ci,c,a;
    ci=p*(1+r/n);
    a=n*t;
    c=Math.pow(ci,a);
    System.out.println("Compound Intrest is:"+c);
  }
}
