class ThisKey
{
  int a,b;
  public void data(int a,int b)
  {
    this.a=a;
    this.b=b;
    System.out.println("Value of a="+a);
    System.out.println("Value of b="+b);
  }
  public void data()
  {
    System.out.println("Value of a="+a);
    System.out.println("Value of b="+b);
  }
public static void main(String[] args)
 {
  ThisKey t=new ThisKey();
  t.data(2,3);
  t.data();
  }
}
