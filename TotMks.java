import java.util.Scanner;
abstract class Marks1
{
  double m[][]=new double[2][5];
  Marks1()
  {
    Scanner s=new Scanner(System.in);
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.println("Enter student "+(i+1)+" subject "+(j+1)+" marks");
        m[i][j]=s.nextInt();
      }
    }
  }
}
abstract class GraceMarks1 extends Marks1
{
  abstract void gracem1();
  abstract void display();
}
class TotMks extends GraceMarks1
{
  public static void main(String[] args)
  {
    TotMks t=new TotMks();
    t.totmks();
    t.gracem1();
    t.display();
  }
  void gracem1()
  {
    double a1=m[0][3];
    double a2=m[1][3];
    if(a1<40)
    {
      a1=a1+5;
      m[0][4]=1;
    }
    else
    {
      m[0][4]=0;
    }
    if(a2<40)
    {
      a2=a2+5;
      m[1][4]=1;
    }
    else
    {
      m[1][4]=0;
    }
    m[0][3]=a1;
    m[1][3]=a2;
  }
  void display()
  {
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<5;j++)
      {
        System.out.printf("%.2f   ",m[i][j]);
      }
      System.out.println();
    }
  }
  void totmks()
  {
    m[0][3]=(m[0][0]+m[0][1]+m[0][2])/3;
    m[1][3]=(m[1][0]+m[1][1]+m[1][2])/3;
  }
}
