import java.util.*;
class LinkedList1
{
  public static void main(String[] args)
  {
    LinkedList <String> obj= new LinkedList<String>();
    /*add(obj) and add(index,obj) to added to the array list*/
    obj.addLast("Ajeet");
    obj.add("Harry");
    obj.add("sfbafgfad");
    obj.add("dssgsgf");
    obj.addFirst("perry");
    System.out.println("After add the linked list is:"+obj);
    System.out.println("Third element:"+obj.get(3));
    obj.set(0,"Changed");
    System.out.println("first element after updating:"+obj);
    obj.removeFirst();
    System.out.println("first element after updating:"+obj);
  }
}
