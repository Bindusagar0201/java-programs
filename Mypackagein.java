package myinterface;

interface interface1
{
public void see();
}
interface interface2
{
public void saw();
}
public class Mypackagein implements interface1,interface2
{
public void see()
{
System.out.println("hi prendsss");
}
public void saw()
{
System.out.println("bye prendsss");
}
}