import java.util.Scanner;
public class Swayam1
{
       public static void main(String[] args)
       {
       Scanner s = new Scanner(System.in);
       double radius= s.nextDouble();
       double perimeter;
       double area;
       area=Math.PI*Math.PI*radius;
       perimeter=2*Math.PI*radius;
       System.out.println(area);
       System.out.println(perimeter);
       }
}
