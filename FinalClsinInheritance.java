//Class using final keyword 
final class Parent 
{ 
public void msg() 
{ 
System.out.println("this is parent  class");     
} 
} 
class Child extends Parent    
{ 
public void msg() 
{ 
System.out.println("this is child class"); 
} 
} 
class FinalClsinInheritance 
{ 
public static void main(String args[]) 
{ 
System.out.println("this is sample class"); 
Child obj=new Child(); 
obj.msg(); 
obj.msg(); 
} 
}