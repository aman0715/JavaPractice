class Length
{
  int len=100;
}
class Breadth extends Length
{
  int bre=50;
}
class MultilevelInheri extends Breadth
{
  public static void main(String[] args)
  {
    MultilevelInheri m=new MultilevelInheri();
    m.disparea();
  }
  public void disparea()
  {
    System.out.println("Area="+(len*bre));
  }
}
