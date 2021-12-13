/*Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Example 1:
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
import java.util.*;
class SubStringLength
{
    public static void main(String args[])
    {
        FSB f=new FSB();
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        ArrayList<Character> st1=new ArrayList<Character>();
        int len=st.length();
        char stc[]=st.toCharArray();
        for(int i=0;i<len-1;i++)
        {
            for(int j=1;j<len-1;j++)
            {
                if(stc[i]!=stc[j])
                {
                    st1.add(stc[i]);
                    f.compare();
                }
            }
        }
        System.out.println(st1);
    }
    void compare()
    {

    }
}
