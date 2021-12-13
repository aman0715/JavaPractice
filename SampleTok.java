import java.util.*;
import javax.swing.*;
class SampleTok
{
  public static void main(String[] args)
 {
    String st=JOptionPane.showInputDialog(null,"Enter your name");
    StringTokenizer s=new StringTokenizer(st," " );
    int count=s.countTokens();
    System.out.println("no of tokens:" +count);
    while(s.hasMoreTokens())
    {
      System.out.println(s.nextToken());
    }
  }
}
