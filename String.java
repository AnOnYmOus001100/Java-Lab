class Stringg
{
public static void main(String []args)
{
String s="Welcome To The Dark Web";
String s1="Hello";
String s2="hello";
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.startsWith("Welcome"));
System.out.println(s.startsWith("Web"));
System.out.println(s.endsWith("Web"));
System.out.println(s.charAt(1));
System.out.println(s.length());
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s.replace('T','d'));
System.out.println(s.substring(7,20));
}
}
