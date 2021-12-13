class X
{
  final void getM()
  {
    System.out.println("X called");
  }
}
class Y extends X
{
  void getM()
  {
    System.out.println("Y called");
  }
}
class Final
{
  final int hours=24;
  public static void main(String[] args)
  {
    final int var=5;
    //final int hours=24;
    //hours=25;
    System.out.println(var);
    Final f=new Final();
    System.out.println(f.hours);
  }
}
