class AThread
{
 public void display()
{
 System.out.println("display uuuu");
}
}
class BThread extends AThread implements Runnable
{
 public void run()
{
 for(int j=11;j<=20;j++)
{
 System.out.println("j"+j);
}
}
}
class CThread implements Runnable
{
 public void run()
{
 for(int k=21;k<=30;k++){
 System.out.println("k"+k);
}
}
}
class RunnablessThread{
public static void main(String args[]){
  BThread obj2 = new BThread();
  Thread t2= new Thread(obj2);
  t2.start();
  obj2.display();
  CThread obj3 = new CThread();
  Thread t3= new Thread(obj3);
  t3.start();
}
}