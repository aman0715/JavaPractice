public class TryCatch2
{
  public static void main(String[] args)
  {
    try
    {
      int a[]=new int[7];
      a[4]=30/0;
      System.out.println("TB msg");
    }
    catch(ArithmeticException w)
    {
      System.out.println("Error:Dont divide a number by zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Exception Thrown:"+e);
    }
    catch(Exception q)
    {
      System.out.println("Warning: Some other exception");
    }
    finally
    {
      System.out.println("In finally block");
    }
    System.out.println("Out of block");
  }
}
