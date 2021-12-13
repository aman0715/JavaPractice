class MethodThis
{
  int num;
  public static void main(String[] args)
  {
    MethodThis o=new MethodThis();
    o.method2();
  }
  void method1(int c)
  {
    int n=c;
    System.out.println("Inside method 1 "+n);
  }
  void method2()
  {
    num=10;
    System.out.println("Inside method 2");
    this.method1(this.num);
    method1(num);
  }
}
