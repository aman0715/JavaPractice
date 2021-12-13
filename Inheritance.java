import java.util.Scanner;
class Inheritance extends Hours
{
 public static void main(String[] args)
 {
  Inheritance i=new Inheritance();
  i.dispTime();
 }
 public void dispTime()
 {
   if(h<0||h>24||m<0||m>60||s<0||s>60)
    System.out.println("Not a valid time");
    else
    {
      int e=(h*3600)+(m*60)+s;
      System.out.print("The time is:");
      System.out.printf("%02d:%02d:%02d",h,m,s);
      System.out.println();
      System.out.println("Total seconds:"+e);
    }
 }
}
class Hours extends Minutes
{
  int h;
  Hours()
  {
    System.out.println("Enter hours:");
    Scanner s=new Scanner(System.in);
    h=s.nextInt();
    //this.h=h1;
  }
}
class Minutes extends Seconds
{
  int m;
  Minutes()
  {
    System.out.println("Enter minutes");
    Scanner s=new Scanner(System.in);
    m=s.nextInt();
    //this.m=m1;
  }
}
class Seconds
{
  int s;
  Seconds()
  {
    System.out.println("Enter seconds:");
    Scanner s=new Scanner(System.in);
    s=s.nextInt();
    //this.s=se;
  }
}
