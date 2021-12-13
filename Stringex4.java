class Stringex4
{
  public static void main(String[] args)
  {
    String s1="Virat";
    String s2="Virat";
    String s3=new String("Virat");
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s1.charAt(0));
    System.out.println(s1.equalsIgnoreCase("VIRAT"));
  }
}
