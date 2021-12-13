/*Saddle point in a matrix

Given a matrix of m x n size, find saddle point of the matrix.
A saddle point is an element of the matrix such that it is the minimum element in its row and maximum in its column.

If No saddle point is found print -1

The First Line contains the size of the matrix ,
followed by the elements of first row ,followed by elements of second row and so on

input =
3 3
1 2 3
4 5 6
8 7 9
output = 7

Explanation
7 is minimum in its row and maximum in its column.

		In the first row 1 is the minimum element but in the respective column 1 is not the maximum number
		In the second row 4 is the minimum element but in the respective column 4 is not the maximum number
		In the third row 7 is the minimum element but in the respective column 7 is the maximum number
	so 7 is the saddle point of the matrix so prints 7


input
3 3
1 2 3
4 5 6
10 18 4
output = -1

Explanation : - In the first row 1 is the minimum element but in the respective column 1 is not the maximum number
			In the second row 4 is the minimum element but in the respective column 4 is not the maximum number
			In the third row 4 is the minimum element but in the respective column 4 is not the maximum number

So Prints -1
*/
import java.util.Scanner;
abstract class Saddle
{
    public abstract void compare(int a);
}
class SaddlePoint extends Saddle
{

    public static void main(String rgs[])
    {
        Scanner s=new Scanner(System.in);
        int rsize,csize;
        rsize=s.nextInt();
        csize=s.nextInt();
        int c=0;
        FSB f=new FSB();
        int m[][]=new int[rsize][csize];
        for(int i=0;i<rsize;i++)
         {
            for(int j=0;j<csize;j++)
         {
              m[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<rsize;i++)
        {
            for(int j=0;j<csize;j++)
            {
                if(m[i][j]<m[i+1][j+1])
                {

                }
            }
        }
        if(c==0)
        System.out.println("-1");
    }
    public void compare(int a)
    {
        for
    }
}
