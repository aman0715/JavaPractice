/*input =Hello kmit Hello ngit
output =ngit olleH timk olleH

input = Make in india
outut = india ni Make

input= keshav memorial institute of Technology
output =Technology fo etutitsni lairomem keshav
*/
import java.util.Scanner;
class Exam2
{
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        String s;
        s=o.nextLine();
        int l=s.length();
        /*String[] s1=s.split(" ");
        int p=s1.length;
        String s2=s1[0];
        String s3=s1[p-1];*/
        String s4="";
        //String s5="";
        String str=s.substring(0,s.indexOf(" "));
        String str1=s.substring(s.indexOf(" "),s.lastIndexOf(" "));
        String str3=s.substring(s.lastIndexOf(" "),l);
        String s5=str3.trim();
        for(int i=str1.length()-1;i>0;i--)
        {
          s4=s4+str1.charAt(i);
        }
        char ch[];
        /*for (int i=1;i<p-2 ;i++ )
        {
        ch[]=s1[i].toCharArray();
        }
        for(int j=0;j<ch.length;j++)
        {
          char t=ch[j];
          ch[j]=ch[j+1];
          ch[j+1]=t;
        }
        new String(ch);*/
        /*for(int j=s4.length()-1;j>=0;j--)
        s5=s5+s4.charAt(j);*/
        System.out.println(s5+" "+s4+" "+str);
      }
}
/*String s4="";
char f=s.charAt(0);
char e=s.charAt(l-1);
//String s7=s;
//s.replace(f,e);
//s.replace(e,f);
for(int i=s.length()-2;i>0;i--)
{
  s4=s4+s.charAt(i);
}
System.out.println(s.charAt(l-1)+s4+s.charAt(0));
}*/
