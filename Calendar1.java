import java.util.*;
class Calendar1
{
  public static void main(String[] args)
  {
    Calendar calendar=Calendar.getInstance();
    System.out.println("CURRENT CALENDAR'S YEAR:"+calendar.get(Calendar.YEAR));
    System.out.println("CURRENT CALENDAR'S DAY:"+calendar.get(Calendar.DATE));
    System.out.println("CURRENT minute:"+calendar.get(Calendar.MINUTE));
    System.out.println("CURRENT hour:"+calendar.get(Calendar.HOUR));
    System.out.println("CURRENT second:"+calendar.get(Calendar.SECOND));

  }
}
