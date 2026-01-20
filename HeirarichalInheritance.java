class Super
{
public void supermsg()
{
System.out.println("this is parent class ");
}
}
class Sub1 extends Super
{
public void sub1msg()
{
 System.out.println("this is child1  class");
}
}
class Sub2 extends Super
{
 public void submsg()
{
 System.out.println("this is child2 class");
}
}
class HeirarichalInheritance
{
public static void main(String[]args)
{
 System.out.println("Heirarichal inheritance program");
 Sub2 obj=new Sub2();
 obj.supermsg();
 obj.submsg();
 Sub1 obj1=new Sub1();
 obj1.sub1msg();
 obj1.supermsg();
}
}
