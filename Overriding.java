class Overriding
{
  public static void main(String[] args)
  {
    Animal a=new Animal();
    Herbivorous h=new Herbivorous();
    Carnivorous c=new Carnivorous();
    a.eat();
    h.eat();
    c.eat();
  }
}
class Animal
{
  protected  void eat()
  {
    System.out.println("Animals eat");
  }
}
class Herbivorous extends Animal
{
  public  void eat()
  {
    System.out.println("Veg");
  }
}
class Carnivorous extends Animal
{
  public void eat()
  {
    System.out.println("Non-veg");
  }
} जावा
