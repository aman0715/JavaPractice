/*Welcome to Practice Lab*/
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        int x;
        do
        {
        System.out.println("1.Display even numbers");
        System.out.println("2.Sum of first n numbers");
        System.out.println("3.Prime series");
        System.out.println("4.Exit");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice:");
        x=s.nextInt();
        switch(x)
        {
            case 1:
                PrintEven o=new PrintEven();
                break;
            case 2:
                Sum k=new Sum();
                break;
            case 3:
                Prime p=new Prime();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        }while(true);
    }
}

class PrintEven
{
    PrintEven()
    {
        int a=0;int i=1;
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        while(i<=a)
        {
            if (i%2==0)
            {
            System.out.println("Even number "+i);
            i++;
            }
            else
                i++;
        }
    }
}

class Sum
{
    Sum()
    {
        int a,b=0;int i=0;
        System.out.println("sum upto which number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        while(i!=a)
        {
         b=b+i;
         i++;
        }
        System.out.println("The sum of n numbers is:"+b);
    }
}

class Prime
{
    Prime()
    {
        int a,i,j;int count=0;
        i=j=1;
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Prime number series is:");
        /*for(i=1;i<=a;i++)
        {
            count=0;
            for (j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
            {
                System.out.println(i);
            }
        }*/
        while(i<=a)
        {
            j=1;
            count=0;
            while(j<=a)
            {
                if(i%j==0)
                count++;
                j++;
            }
            if(count==2)
            System.out.println(i);
            i++;
        }
    }
}
