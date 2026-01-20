
class Apple
{
   String name="good" ;
Apple()
{
 System.out.println("Apple was sold...");
}
 void eat()
{
 System.out.println("apple  eat");
}
}
class Orange extends Apple
{
 String name="best";
 Orange()
{
  super();
  System.out.println("Orange was sold...");
}
 void eat()
{
 super.eat();
 System.out.println("orange  eat");
}
 void display()
{
  System.out.println(super.name);
  System.out.println(name);
}
}
class Super1
{
public static void main(String args[])
{
  Orange obj=new Orange();
  obj.eat();
  obj.display();
}
}