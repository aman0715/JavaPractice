import java.util.Scanner;
class Switch1
{
  public static int a,b;
  public static char c;
  Switch1()
  {
    int q=0; int w=0;
    char ch=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first number:");
    q=s.nextInt();
    System.out.println("Enter the operator");
    ch=s.next().charAt(0);
    System.out.println("Enter second number:");
    w=s.nextInt();
    a=q; b=w; c=ch;
  }
  public static void main(String[] args)
  {
    //Switch1 o=new Switch1();
    //w=o.a; p=o.b; x=o.c;
   Menu i=new Menu(c,a,b);
  }
}
class Menu
{
  Menu(char x,int w,int p)
  {
    //int w,p;
    Switch1 o=new Switch1();
    w=o.a; p=o.b; x=o.c;
    switch (x)
    {
     case '+':
       System.out.println(w+p);
       break;
     case '*':
       System.out.println(w*p);
       break;
     case '-':
       System.out.println(w-p);
       break;
     case '/':
       System.out.println(w/p);
       break;
     case '%':
       System.out.println(w%p);
       break;
     default:
       System.out.println("Wrong Choice");
       break;
    }
 }
}
