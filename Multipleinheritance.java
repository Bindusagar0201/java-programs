class Base1
{
 public void basemsg()
{
 System.out.println("This is base class");
 }
 }  
class Base2
{
 public void basemsg()
 {
 System.out.println("This is base class");
 }
 }
 class Derived extends Base1, Base2 // Compile time error
 {
 public void derivemsg()
 {
 System.out.println("This is derived class");
 } 
 }
 class Multipleinheritance
{
 public static void main(String args[])
 {
 System.out.println(" Multiple inheritance program");
Derived obj=new Derived();
 obj.basemsg();
 obj.derivemsg();
}
}

