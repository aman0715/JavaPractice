/*Write a Java program to find the words which have a vowel as alternate
charaters in each word in input data.(If no such word exists print -1).

sample test case

input =iterate ovEr the EXAM results
output = iterate ovEr EXAM

input =ice and rice
output = ice rice
*/
import java.util.Scanner;
class StringExam
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String stra[]=new String[20];
        int c=0;
        stra[0]=str.substring(0,str.indexOf(" "));
        for(int i=2;i<str.length()-1;i++)
        {
            stra[i]=str.substring(str.indexOf(" "),str.indexOf(" "));
        }
        stra[stra.length]=str.substring(str.lastIndexOf(" "),str.length());
        for(int i=0;i<stra.length;i++)
        {
            int count=0;
            for(int j=0;j<stra[i].length();j=j+2)
            {
                if(stra[i].charAt(j)=='a'||stra[i].charAt(j)=='e'||stra[i].charAt(j)=='i'||stra[i].charAt(j)=='o'|stra[i].charAt(j)=='u'||stra[i].charAt(j)=='A'||stra[i].charAt(j)=='E'||stra[i].charAt(j)=='I'||stra[i].charAt(j)=='O'||stra[i].charAt(j)=='U')
                {
                    count++;
                }
            }
            if(count>0)
            System.out.print(stra[i]);
            else
            c++;
        }
        if(c==stra.length)
        System.out.println("-1");
    }
}
