/* WJP to Create two Threads one Thread name "Frwd" Prints Forward Direction &
   other Thread name "Rev" Prints in Reverse Direction of Multiplication Table upto 12 Values.
   Use Sleep method, First Thread Frwd sleeps 3sec and  Second Thread Rev sleeps 1sec.
Hint:- 1000ms=1secound.
Example:-
Sample Input:5
Sample Output:
5*1=5
5*2=10
5*12=60
5*11=55
5*3=15
5*4=20
5*5=25
5*10=50
5*9=45
5*8=40
5*6=30
5*7=35
*/
import java.util.*;
class ThreadExam
{
    public static int n;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        ForwardTh obj1=new ForwardTh();
        ReverseTh obj2=new ReverseTh();
        obj1.start();
        obj2.start();

    }
}
class ForwardTh extends Thread
{
    ThreadExam for_o=new ThreadExam();
    public void run()
    {
        for(int i=1;i<=6;i++)
        {
            if(i%3==0)
            {
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception x)
            {
                System.out.println("Error Occurred");}
            }
            System.out.println(for_o.n+"*"+i+"="+(for_o.n*i));

        }
    }
}
class ReverseTh extends Thread
{
    ThreadExam rev_o=new ThreadExam();
    public void run()
    {
        for(int i=12;i>=7;i--)
        {
            System.out.println(rev_o.n+"*"+i+"="+(rev_o.n*i));
            try
            {
                Thread.sleep(1000);

            }
            catch(Exception x)
            {
                System.out.println("Error Occurred");

            }
        }
    }
}
