import java.lang.Thread;
/*class Thread1 extends Thread
{
  public void run()
  {
    System.out.println("This starts");
    for (int i=0;i<10 ;i++ )
    {
      System.out.print("Q:"+i+"  ");
    }
  }
  public static void main(String[] args)
  {
    System.out.println("Before starting");
    Thread1 o=new Thread1();
    o.start();
    for (int i=0;i<50 ;i++ )
    {
      System.out.print("i:"+i+"  ");
    }
  }
}*/

class Thread1 extends Thread
{
  public void run()
  {
    System.out.println("Thread is running");
  }
  public static void main(String[] args)
  {
    Thread t=new Thread(new Thread1());
    t.start();
  }
}
