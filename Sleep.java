import java.lang.*;
class Sleep implements Runnable
{
  Thread t;
  public void run()
  {
    for (int i=0;i<20 ;i++ )
    {
      System.out.println(Thread.currentThread().getName()+" "+i);
      try
      {
        Thread.sleep(1000);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
    }
  }
  public static void main(String[] args)
  {
    Thread t=new Thread(new Sleep());
    t.start();
    Thread t2=new Thread(new Sleep());
    t2.start();
  }
}
