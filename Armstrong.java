package strong;
import java.lang.Math;
public class Armstrong
{
  public void arm(int a)
  {
    double b=0;int c=0;int d=a;
    while (a>0)
    {
      c=a%10;
      b=b+Math.pow(c,3);
      a=a/10;
    }
    if(d==b)
    System.out.println("Armstrong number");
    else
    System.out.println("Not an armstrong number");

  }
}
