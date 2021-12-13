class Throws
{
  static void check() throws ArithmeticException,ArrayIndexOutOfBoundsException
  {
    System.out.println("Inside check function");
    int n=0;
    int a[]={2,3};
    System.out.println(a[5]);
    System.out.println(30/n);
    //throw new ArithmeticException("error");
  }
  public static void main(String[] args)
  {
    try
    {
      check();
    }
    catch(ArithmeticException e)
    {
      System.out.println("Caught"+" "+e);
    }
  }
}
