class ConstructThis
{
  ConstructThis()
  {
    this("ABCD");
    System.out.println("default constructor");
  }
  ConstructThis(String s)
  {
    System.out.println("parameterized constructor "+s);
  }
  public static void main(String[] args)
  {
    ConstructThis o=new ConstructThis();
  }
}
