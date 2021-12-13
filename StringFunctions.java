class StringFunctions
{
  public static void main(String[] args)
  {
    String s1="Virat";
    String s2="Ratata";
    String s3="rat";
    String s4="0123456789";
    System.out.println(s1.charAt(0));
    System.out.println(s1.equalsIgnoreCase("VIRAT"));
    System.out.println(s2.indexOf(s3));
    System.out.println(s2.indexOf('t'));
    System.out.println(s2.indexOf('t',4));
    System.out.println(s1.length());
    System.out.println(s4.substring(4));
    System.out.println(s4.substring(4,9));
  }
}
