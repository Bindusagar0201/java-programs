class Vehicle
{ 
 void run()
 {
 System.out.println(" Vehicle is running... ");
 } 
 void speedlimit()
 {
 System.out.println("Every vehicle has speed limit");
 }
} 
class Bike extends Vehicle
{ 
 void run()
 {
 System.out.println("Bike is running safely...");
 } 
void wheels()
 {
 System.out.println("Bike has two wheels");
 } 
}
class DMD
{
 public static void main(String args[])
 { 
 Vehicle obj1 = new Bike();//Yes it is allowed
 obj1.speedlimit();
obj1. run();
 //obj1.wheels(); // Not allowed
 } 
}