//  Write a Java Program to demonstrate String and String Buffer class methods. 
import java.lang.*;
class StringMethods
{
public static void main(String args[])
{
 String nam="bindu sagar patro ";
// case conversion
System.out.println("upper case : "+nam.toUpperCase());
System.out.println("lower case : "+nam.toLowerCase());
// Whitespace removal
System.out.println("space : "+nam.trim());
// start and end check
System.out.println("start : "+nam.startsWith("b"));
System.out.println("start : "+nam.endsWith("o"));
//character access
System.out.println("char at 4 : "+nam.charAt(0));
System.out.println("char at 6 : "+nam.charAt(7));
//length
System.out.println("length : "+nam.length());
//index
System.out.println("index : "+nam.indexOf('r'));
//replace
System.out.println("replace : "+nam.replace('s','i'));
//substring
System.out.println("subs : "+nam.substring(0,4));
System.out.println("subs : "+nam.substring(0,6));
String s1="nani";
//equals
System.out.println("equal : "+nam.equals(s1));
System.out.println("equal : "+nam.equalsIgnoreCase(s1));
//contains
System.out.println("contains : "+nam.contains("tro"));
}
}
