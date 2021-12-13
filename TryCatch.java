public class TryCatch
{
  public static void main(String[] args)
  {
    /*try
    {
      int num[]={1,2,3,4};
      System.out.println(num[5]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Exception Thrown:"+e);
    }
    System.out.println("Out of the block");*/
    int n1,n2;
    try
    {
      n1=2;
      n2=2/n1;
      int n[]={2,3,4};
      System.out.println("TB msg");
      System.out.println(n[4]);
    }
    catch(ArithmeticException w)
    {
      System.out.println("Error:Dont divide a number by zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Exception Thrown:"+e);
    }
    System.out.println("OUT");
  }
}
