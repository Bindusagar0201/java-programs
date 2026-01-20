// 23.Write a Java Program that prompts the user for an integer and then prints out all  the fibonacci series up to that Integer
//lab program 1
import java.util.Scanner;
class Fibonacci
{
public static void main(String args[])
{
int a,b,c,n;
a=0;
b=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
System.out.println("Fibonacci series are:");
for(int i=1;i<=n;i++)
{
System.out.println(a);
c=a+b;
a=b;
b=c;
}
}
}
