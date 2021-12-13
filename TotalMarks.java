import java.util.Scanner;
class Marks
{
  double m[][]=new double[20][20];
  Marks()
  {
    Scanner s=new Scanner(System.in);
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.println("Enter student "+i+" subject "+j+" marks");
        m[i][j]=s.nextInt();
      }
    }
  }
}
class GraceMarks extends Marks
{
  double a1=(m[0][0]+m[0][1]+m[0][2])/3;
  double a2=(m[1][0]+m[1][1]+m[1][2])/3;
  final void gracem()
  {
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
    //System.out.println(m[1][4]);
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<5;j++)
      {
        System.out.print(m[i][j]+" ");
      }
      System.out.println();
    }
  }
}
class TotalMarks extends GraceMarks
{
  void percent()
  {
    m[0][3]=a1;
    m[1][3]=a2;
  }
  public static void main(String[] args)
  {
    //Marks q=new Marks();
    TotalMarks t1=new TotalMarks();
    t1.gracem();
  }
}
