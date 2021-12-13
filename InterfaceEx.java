interface Highest
{
  void suma();
}
interface Total
{
  void sumi();
}
abstract class EnterMarks implements Highest,Total
{
  //int a[][]=new int[2][3];
  int a[][]={{20,30,40},{30,50,60}};
}

class InterfaceEx extends EnterMarks
{
  public void suma()
  {
    int a1,a2;
    a1=a[0][0]+a[0][1]+a[0][2];
    a2=a[1][0]+a[1][1]+a[1][2];
    System.out.println("Total marks of first student are: "+a1);
    System.out.println("Total marks of second student are: "+a2);
  }
  public void sumi()
  {
    int a1,a2,a3;
    a1=a[0][0]+a[1][0];a2=a[0][1]+a[1][1];a3=a[0][2]+a[1][2];
    System.out.println("First subject total is: "+a1);
    System.out.println("Second subject total is: "+a2);
    System.out.println("Third subject total is: "+a3);
  }
  public static void main(String[] args)
  {
    InterfaceEx i=new InterfaceEx();
    i.suma();
    i.sumi();
  }
}
