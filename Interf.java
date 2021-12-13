interface Moveable
{
  int avg_speed=10;
  void move();
}
interface Fly
{
  int fly_speed=400;
  void fly();
}
class Interf implements Moveable,Fly
{
  public void move()
  {
    System.out.println("Average speed is: "+avg_speed);
  }
  public void fly()
  {
    System.out.println("Fly speed is: "+fly_speed);
  }
  public static void main(String[] args)
  {
    Interf i=new Interf();
    i.move();
    i.fly();
  }
}
