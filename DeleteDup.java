/* Write a Java program to delete duplicate elements from an array.
________________________________________________________________________________________
Explanation:
5                 // Size of an array
10 20 30 10 50    // Enter Elements in an array with Duplicates
10 20 30 50       // Display Elements without Duplicates
________________________________________________________________________________________
8
1 2 3 3 2 1 4 5
1 2 3 4 5
*/
import java.util.*;
class DeleteDup
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<l;i++)
        {
            b=s.nextInt();
            a.add(b);
        }
        for(int i=0;i<l;i++)
        {
          for(int j=0;j<l-1;j++)
          {
              if(a.indexOf(i)==a.indexOf(j))
              {
                a.remove(i);
              }
            }
        }
        System.out.print(a);
    }
}
/*class DeleteDup
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
            arr[i]=s.nextInt();
         for(int i=0;i<l;i++)
         {
             int c=0;
              for(int j=0;j<i;j++)
              {
                  if(arr[i]==arr[j])
                  {
                      c++;
                  }
              }
              if(c==0)
              System.out.print(arr[i]+" ");
         }
    }
}*/
