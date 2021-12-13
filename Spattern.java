/* Write a Java Program to Read a String from Input Console and print the Vowel's Pattern shown below?
Sample Input:-
automobile
Sample Output:-
a
au
auo
auoo
auooi
auooie
NOTE:- TestCases are Case-Sensitive, If no Vowel Pattern Exist Print -1.
*/
import java.util.Scanner;
class Spattern
{
  public static void main(String args[])
  {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      //char[] str2=str.toCharArray();
      String a="";
      for(int i=0;i<str.length();i++)
      {
          if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
          a=a+str.charAt(i);
      }
      if(a.length()==0)
      {
      System.out.println("-1");
      }
      //char[] b=a.toCharArray();
      for(int j=0;j<a.length();j++)
      {
          for(int k=0;k<=j;k++)
          {
              System.out.print(a.charAt(k));
          }
          System.out.println();
      }
  }
}
