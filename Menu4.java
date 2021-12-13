import java.util.Scanner;
class Menu4
{
  public static void main(String[] args)
  {
    int x=0;
    System.out.println("1.Temperature Conversion");
    System.out.println("2.Add First and last digits of a 4 digit number");
    System.out.println("3.Reverse a three digit number");
    System.out.println("Enter your choice");
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    //Menu4 o=new Menu4();
    switch(x)
    {
      case 1:
        TempConversion p=new TempConversion();
        p.temp();
        break;
      case 2:
        FirstLast r=new FirstLast();
        break;
      case 3:
        Reverse q=new Reverse();
        q.rev();
        break;
      default:
        System.out.println("Invalid Choice");
    }
  }
}
class TempConversion
{
  void temp()
  {
    double c;
    System.out.println("Enter Temperature in degree Celcius");
    Scanner s=new Scanner(System.in);
    c=s.nextDouble();
    double f;
    f=(c*9)/5+32;
    System.out.println("Temperature in Fahrenheit:"+f);
  }
}
class FirstLast
{
  FirstLast()
  {
    int x,a;
    System.out.println("Enter a number");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if(a>999 && a<10000)
    {
      System.out.println("The four digit number is:"+a);
      x=(a%10)+(a/1000);
      System.out.println("Addition of first and second numbers is:"+x);
    }
    else
    {
      System.out.println("Not a four digit number");
    }
  }
}
class Reverse
{
  void rev()
  {
    int a;int i=0;int e=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a three digit number");
    a=s.nextInt();
    while(a!=0)
    {
      i=a%10;
      e=(e+i)*10;
      a=a/10;
    }
    System.out.println("The reversed three digit number is:"+(e/10));
  }
}
