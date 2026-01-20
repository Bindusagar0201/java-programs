// 3.2 StringBuffer

import java.lang.*;
class StringBufferMethods
{
public static void main(String args[])
{
StringBuffer i=new StringBuffer("sagar");
i.append("nani");
System.out.println("after append   "+i);
i.insert(5," bindu ");
System.out.println("after insert  "+i);
i.setCharAt(5,'a');
System.out.println("after char  "+i);
i.delete(0,5);
System.out.println("after delete  "+i);
i.replace(5,7, "hello");
System.out.println("after replace  "+i);
i.reverse();
System.out.println("after reverse  "+i);
System.out.println("lenght  "+i.length());
}
}