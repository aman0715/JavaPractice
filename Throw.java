class Throw
{
  static void a()
  {
    try
    {
      throw new ArithmeticException("demo");
    }
    catch(ArithmeticException e)
    {
      System.out.println("Exception caught");
    }
  }
  public static void main(String[] args)
  {
    a();
  }
}
