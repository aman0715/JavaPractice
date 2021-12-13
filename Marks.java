import java.util.Scanner;
class Marks
{
  double m[][]=new double[2][5];
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
  double a1=(m[1][2]+m[1][2]+m[1][3])/3;
  double a2=(m[2][2]+m[2][2]+m[2][3])/3;
  void Gracem()
  {
    if(a1<40)
    {
      a1=a1+5;
      m[1][5]=1;
    }
    else
    {
      m[1][5]=0;
    }
    if(a2<40)
    {
      a2=a2+5;
      m[2][5]=1;
    }
    else
    {
      m[2][5]=0;
    }
    for(int i=0;i<2;i++)
    {
      for(int j=0;j<3;j++)
      {
        System.out.println(m[i][j]);
      }
    }
  }
}
class TotalMarks extends GraceMarks
{
  void percent()
  {
    m[1][4]=a1;
    m[2][4]=a2;
  }
  public static void main(String[] args)
  {
    //Marks q=new Marks();
    TotalMarks t1=new TotalMarks();
    t1.Gracem();
  }
}
