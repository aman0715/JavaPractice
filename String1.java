import java.lang.*;
import java.util.Scanner;
class String1
{
  public static void main(String[] args)
  {
    Scanner o=new Scanner(System.in);
    String s;
    System.out.println("Enter a String:");
    s=o.nextLine();
    int count=0;
    for (int i=0;i<s.length() ;i++ )
    {
      for (int j=i+1;j<s.length();j++ )
      {
        if (s.charAt(i)==s.charAt(j))
        {
          count++;
        }
      }
    }
    if(count>0)
    {
      System.out.println("Not Unique");
    }
    else
    {
      System.out.println("Unique");
    }
  }
}
