import java.util.Scanner;
class VirtueSa1
{
  /*public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int count=0;
    String s1;
    s1=s.nextLine();
    String s2=s1.trim();
    //char j=(char)32;
    int a=s2.length();
    for(int i=0;i<a;i++)
    {
      if(s2.charAt(i)==' ' && )
      {
        count++;
      }
    }
    System.out.println("Number of words are: "+(count+1));
  }*/
  public static void main(String[] args)
  {
    Scanner o=new Scanner(System.in);
    String s;
    s=o.nextLine();
    s=s.trim();
    String[] arr=s.split(" ");
    int i=0;
    for(i=0;i<arr.length;i++)
    {
    System.out.println(arr[i]);
    }
    System.out.println(i);
  }
}
