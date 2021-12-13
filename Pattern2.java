import java.util.Scanner;
class Pattern2
{
    public static void main(String args[])
    {
        int x;
        Scanner s=new Scanner(System.in);
        do
        {
            System.out.println();
            System.out.println("1.Half Diamond");
            System.out.println("2.Full Diamond");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            x=s.nextInt();
            switch(x)
            {
                case 1:
                    HalfDiamond h=new HalfDiamond();
                    break;
                case 2:
                    FullDiamond f=new FullDiamond();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(true);

    }
}

class HalfDiamond
{
    HalfDiamond()
    {
        int n,i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice of lines");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class FullDiamond
{
    FullDiamond()
    {
        int n,i,j,k;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice of lines");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(k=n;k>=i+1;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
              
                System.out.print(" *");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(j=n;j>i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
