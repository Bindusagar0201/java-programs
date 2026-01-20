// 4. Implement the concept of constructor overloading 
import  java.util.*;
class Multiple
{
int a,b,c,d;
double x,y,z,j;
Multiple(int p,int q,int r)
{
a=p;
b=q;
c=r;
d=a*b*c;
System.out.println("multiplcaion of three number are"+d);
}
Multiple(double a,double b,double c)
{
x=a;
y=b;
z=c;
j=x*y*z;;
System.out.println("multiplcation of three number are"+j);
}
}
class Constructoroverloading
{ 
public static void main(String args[])
{
Multiple obj=new Multiple(1,2,4);
Multiple obj2=new Multiple(2.8,4.6,3.5);
}
}