class Super
{
public void supermsg()
{
System.out.println("this is parent class ");
}
}
class Sub1 extends Super
{
 public void intermsg()
{
System.out.println("this is 1st sub class");
}
}
class Sub extends Sub1
{
 public void submsg()
{
 System.out.println("this is 2nd sub class");
}
}
class MultilevelInheritance
{
public static void main(String[]args)
{
 System.out.println("Multilevel inheritance program");
 Sub obj=new Sub();
 obj.supermsg();
 obj.intermsg();
 obj.submsg();
}
}

