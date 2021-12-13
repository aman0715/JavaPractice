import java.util.Scanner;
class Clock2
{
  protected long time=0;
  public long getTime()
  {
    return this.time;
  }
  public long setTime(long Time)
  {
    this.time=Time;
    return time;
  }
}
class Clock extends Clock2
{
  public static void main(String[] args)
  {
    Clock c=new Clock();
    c.timing();
  }

  public void timing()
  {
    System.out.println("Enter time");
    Scanner s=new Scanner(System.in);
    long time=s.nextLong();
    time=s.nextLong(); //error: time has private access in Clock
    System.out.println("Time is:"+time);
    //setTime(time); //for private
    //System.out.println("Time is:"+getTime());
  }
}
