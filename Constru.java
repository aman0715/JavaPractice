class Constru
{
  private int var1,var2;
  public Constru()
  {
    var2=10;
  }
  public Constru(int num)
  {
    var1=num+10;
  }
  public static void main(String[] args)
  {
    Constru o1=new Constru();
    System.out.println("var1="+o1.var1+" "+"var2="+o1.var2);
    Constru o2=new Constru(o1.var1);
    System.out.println("var1="+o2.var1+" "+"var2="+o2.var2);
  }
}
