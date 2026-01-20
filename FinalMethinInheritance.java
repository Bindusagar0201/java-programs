//Method using final keyword 
class Parent 
{ 
final public void msg() 
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
class FinalMethinInheritance 
{ 
public static void main(String args[]) 
{ 
System.out.println("this is sample class"); 
Child obj=new Child(); 
obj.msg(); 
obj.msg(); 
} 
} 
