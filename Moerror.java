class Display
{
  public void disp1(char c)
   {
     System.out.println(c);
  }
  public int disp(char c)
  {
    System.out.println(c);
    return 10;
  }
}
class Moerror
{
  public static void main(String[] args)
  {
    int k;
    Display o=new Display();
    o.disp1('a');
    k=o.disp('a');
  }
}
