/*Trapping Rain Water:-
Given n non-negative integers representing an elevation map where the width of each
bar is 1, compute how much water it is able to trap after raining.
Detailed Example is given in Trapping Rain.jpg.
NOTE:-
1. Y-axis length=3units and X-axis unit=not Fixed
2. 1unit=1bar

Example:
Input: 0 1 0 2 1 0 1 3 2 1 2 1
Output: 6
Input: 0 2 0 2 0 1 2
Output: 7
*/

import java.util.*;
class TrappingRain
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int b=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> c=new ArrayList<Integer>();
        for(int i=0;i<l;i++)
        {
            b=s.nextInt();
            b=a.add(b);
        }
        for(int i=0;i<l;i++)
        {
            if(a.indexOf(i)==0)
            c.add(a.indexOf(i);
        }
        for(int i=0;i<;i++)
        {
            if(c.indexOf(i)!=0 && a.indexOf)

        }
    }
}
