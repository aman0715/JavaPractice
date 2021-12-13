class SuperKey extends Basec
{
  int n=200;
  SuperKey()
  {
    super();//Used in constructor as first sentence
    System.out.println("Child Constu");
  }
  void myMeth()
  {
    super.myMeth();//This will call myMeth() of Parent class
    System.out.println("this overriding method n "+n);
  }
  public static void main(String[] args)
  {
    SuperKey s=new SuperKey();
    s.myMeth();
    //super.myMeth(); non static can't be called
    //super(); Allowed only in constructor
  }
}
class Basec
{
  int n=100;
  Basec()
  {
    System.out.println("Parent Constu");
  }
  void myMeth()
  {
    System.out.println("BC overridden method");
  }
}
