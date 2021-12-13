/* Given an array nums, write a function to move all 0's to the end of it while maintaining
the relative order of the non-zero elements.

Example:
Input=5 //size
0 1 0 3 12
Output=1 3 12 0 0

Note:
1. if no Zeros are in array print -1
2. You must do this in-place without making a copy of the array.
3. Minimize the total number of operations.
*/
import java.util.*;
class RemoveZeros
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int l=s.nextInt();
    int b;
    ArrayList<Integer> a=new ArrayList<Integer>();
    for(int i=0;i<=l-1;i++)
    {
        b=s.nextInt();
        a.add(b);
    }
    
    }
}
/*class RemoveZeros
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b;
        int[] arr=new int[l];
        int count=0;
        for(int i=0;i<=l-1;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int j=0;j<=l-1;j++)
        {
            for(int k=0;k<l-1;k++)
            if(arr[k]==0)
            {
                arr[k]=arr[k+1];
                arr[k+1]=0;
                count++;
            }
        }
        if(count==0)
        System.out.println("-1");
        else
        for(int o=0;o<l;o++)
        System.out.print(arr[o]+" ");
    }
}*/
