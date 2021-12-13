import java.util.*;
class HashT
{
  public static void main(String[] args)
  {
    Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
    ht.put(100,"EIE");
    ht.put(101,"ECE");
    ht.put(102,"IT");
    ht.put(103,"CSE");
    for(Map.Entry m:ht.entrySet())
    {
      System.out.println(m.getKey()+" "+m.getValue());
    }
    ht.remove(102);
    System.out.println("AFTER REMOVAL" +ht);
    System.out.println(ht.getOrDefault(106,"not found"));
    ht.putIfAbsent(104,"MECH");
    System.out.println(ht);
  }
}
