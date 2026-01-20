abstract class Parent
{
abstract void teacher();
void student()
{
System.out.println("this is student");
}
}
class Child extends Parent
{
void teacher()
{
System.out.println("this is child");
}
}
class Abstractmethod
{
public static void main(String args[])
{
Child pra=new Child();
pra.student();
pra.teacher();
}
}