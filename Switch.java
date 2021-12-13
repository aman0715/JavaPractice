import java.util.Scanner;
class Switch
{
  public static void main(String[] args)
  {
    char x;
    System.out.println("Enter a character:");
    Scanner s=new Scanner(System.in);
    x=s.next().charAt(0);
    switch (x)
    {
      case 'a':
      System.out.println("Given character is a vowel");
      break;
      case 'e':
      System.out.println("Given character is a vowel");
      break;
      case 'i':
      System.out.println("Given character is a vowel");
      break;
      case 'o':
      System.out.println("Given character is a vowel");
      break;
      case 'u':
      System.out.println("Given character is a vowel");
      break;
      default:
      System.out.println("Given character is a consonant");
      break;
    }
  }
}
