import java.lang.*;
class Buffera
{
public static void main(String[]args)
{
StringBuffer str=new StringBuffer("Welcome to java");
System.out.println(str.replace(8,10,"to"));
System.out.println(str.append("OK"));
System.out.println(str.insert(1,'H'));
System.out.println(str.delete(6,8));
System.out.println(str.reverse());
}
}