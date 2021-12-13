import java.util.Scanner;
class Elseif
{
   //int a,b,c,d,e,m;
/*  Elseif()
  {
    //int a,b,c,d,e;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first subject marks:");
    a=s.nextInt();
    System.out.println("Enter second subject marks:");
    b=s.nextInt();
    System.out.println("Enter third subject marks:");
    c=s.nextInt();
    System.out.println("Enter fourth subject marks:");
    d=s.nextInt();
    System.out.println("Enter fifth subject marks:");
    e=s.nextInt();
  }*/
  public static void main(String[] args)
  {
    Elseif o=new Elseif();
    Const v=new Const();
    v.grade(v.a,v.b,v.c,v.d,v.e);
    v.grade(v.m);
    /*grade(o.a,o.b,o.c,o.d,o.e);
    grade(o.m);*/
  }
    /*public void grade(int m)
    {
      if (o.m>=60)
      {
        System.out.println("First Divison");
      }
      else if (o.m>=50)
      {
        System.out.println("Second Divison");
      }
      else if (o.m>=40)
      {
        System.out.println("Third Division");
      }
      else
      {
        System.out.println("Fail");
      }
    }
    public void grade(int a,int b,int c,int d,int e)
    {
      o.m=(o.a+o.b+o.c+o.d+o.e)/100;
      System.out.println("Total marks scored="+o.m);
    }*/
}
class Const
{
  static int a,b,c,d,e,m;
  Const()
  {
    int r=0;int t=0;int y=0;int u=0;int i=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter first subject marks:");
    r=s.nextInt();
    System.out.println("Enter second subject marks:");
    t=s.nextInt();
    System.out.println("Enter third subject marks:");
    y=s.nextInt();
    System.out.println("Enter fourth subject marks:");
    u=s.nextInt();
    System.out.println("Enter fifth subject marks:");
    i=s.nextInt();
    a=r;
    b=t;
    c=t;
    d=u;
    e=i;
  }
  public int grade(int a,int b,int c,int d,int e)
  {
    m=(a+b+c+d+e)/5;
    System.out.println("Total marks scored="+m);
    return m;
  }
  public void grade(int m)
  {
    Elseif w=new Elseif();
    if (m>=60)
    {
      System.out.println("First Divison");
    }
    else if (m>=50)
    {
      System.out.println("Second Divison");
    }
    else if (m>=40)
    {
      System.out.println("Third Division");
    }
    else
    {
      System.out.println("Fail");
    }
  }
}
