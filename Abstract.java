class Abstract extends A
{
  void callme()
  {
    System.out.println("This is abstract method");
  }
  public static void main(String[] args)
  {
    Abstract a=new Abstract();
    a.callme();
    a.instance();
  }
}
abstract class A
{
  abstract  void callme();
  void instance()
  {
    System.out.println("This is instance method");
  }
}
