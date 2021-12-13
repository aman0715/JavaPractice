/* Write a Program to Accept a String. Convert the String to Uppercase.
count and Display  number of double letter Sequences that Exist in the String
Sample Input: "SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE"
Sample Output: 4
Explanation:
FEEDING-2(E)
LITTLE-2(T)
RABBIT-2(B)
APPLE- 2(P)
Total 4 Times double letter Sequences Exists*/
import java.util.Scanner;
class Exam1
{
    public static void main(String args[])
    {
        String s;
        Scanner o=new Scanner(System.in);
        s=o.nextLine();
        String s1=s.toUpperCase();
        int q=s1.length();
        char[] s2=s1.toCharArray();
        int count1=0;
        for(int g=0;g<s1.length()-1;g++)
        {
            if(s2[g]==s2[g+1])
            count1++;
        }
        System.out.println(count1);
    }
}
