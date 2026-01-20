class AThread implements Runnable
{
 public void run()
{
 for(int i=1;i<=5;i++){
  System.out.println("i"+i);
}
}
}
class BThread implements Runnable
{
 public void run()
{
 for(int j=6;j<=10;j++){
  System.out.println("j"+j);
}
}
}
class CThread implements Runnable
{
 public void run()
{
 for(int k=11;k<=15;k++){
  System.out.println("k"+k);
}
}
}
class RunnableThread{
public static void main(String args[]){
  
  AThread obj1 = new AThread();
  Thread t1= new Thread(obj1);
  t1.start();
  BThread obj2 = new BThread();
  Thread t2= new Thread(obj2);
  t2.start();
  CThread obj3 = new CThread();
  Thread t3= new Thread(obj3);
  t3.start();
}
}