import strong.Armstrong;
import java.util.Scanner;
class ArmDemo
{
  public static void main(String[] args)
  {
    Armstrong obj=new Armstrong();
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Check whether armstrong number or not");
    n=s.nextInt();
    obj.arm(n);
  }
}
