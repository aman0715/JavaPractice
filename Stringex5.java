class Stringex5
{
  public static void main(String[] args)
  {
    String s="KMIITTK";
    char d[]=new char[20];
    char c[]=new char[20];
    //System.out.println(s);
    int a=s.length();
    for(int i=0;i<=a-1;i++)
    {
      int j=1;
      for(j=1;j<=a-1;j++)
      {
      if(s.charAt(i)==s.charAt(j))
      {
        d[i]=s.charAt(i);
      }
        else
        c[i]=s.charAt(i);
      }
    }
    for (int i=0;i<=a;i++)
    {
      System.out.print(c[i]);
    }
  }
}
