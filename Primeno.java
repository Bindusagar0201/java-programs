import java.util.Scanner;
class Primeno
{
public static void main(String args[])
{
int n,i,j,count;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
System.out.println("prime numbers are:");
for(i=2;i<=n;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
count++;
}
if(count==2)
System.out.println(i);
}
}
}
