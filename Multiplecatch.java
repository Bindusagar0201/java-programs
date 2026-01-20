class Multiplecatch
{
public static void main(String args[]) 
{
try
{
int a;
a=90/0;
System.out.println(a);
}
catch (ArithmeticException e) 
{
System.out.println("Arithmetic Exception occurs");
}
catch (ArrayIndexOutOfBoundsException e) 
{
System.out.println("ArrayIndexOutOfBounds Exception occurs");
}
catch (Exception e)
{
System.out.println("Parent Exception occurs");
}
finally
{
System.out.println("....exception found....");
}
}
}


