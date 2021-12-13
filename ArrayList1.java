import java.util.*;
class ArrayList1
{
  public static void main(String[] args)
  {
    ArrayList <String> obj= new ArrayList<String>();
    /*add(obj) and add(index,obj) to added to the array list*/
    obj.add("Ajeet");
    obj.add("Harry");
    /*displaying*/
    System.out.println("After add the list is:"+obj);
    obj.add(0,"Rahul");
    obj.add(1,"Hari");
    System.out.println("After add the list is:"+obj);
    obj.remove("Harpreet");
    obj.remove("Harry");
    System.out.println("After remove the list is:"+obj);
    obj.remove(1);
    System.out.println("After add the list is:"+obj);
  }
}
