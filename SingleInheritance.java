class Super
{
public void supermsg()
{
System.out.println("this is parent class");
}
}
class Sub extends Super
{
public void submsg()
{
System.out.println("this is child class");
}
}
class SingleInheritance
{
public static void main(String[]args)
{
System.out.println("single inheritance programs");
Sub obj=new Sub();
obj.supermsg();
obj.submsg();
}
}