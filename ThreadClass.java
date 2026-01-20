class AThread extends Thread 
{
public void run() 
{
for (int i = 1; i <= 10; i++) 
{
System.out.println("i=" + i);
}
}
}
class BThread extends Thread 
{
public void run() {
for (int j = 11; j <= 20; j++)
{
System.out.println("j=" + j);
}
}
}
class CThread extends Thread 
{
public void run()
{
for (int k = 21; k <= 30; k++)
{
System.out.println("k=" + k);
}
}
}
public class ThreadClass
{
public static void main(String args[])
{
AThread t1 = new AThread();
t1.start();
BThread t2 = new BThread();
t2.start();
CThread t3 = new CThread();
t3.start();
}
}
