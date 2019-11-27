import java.util.Scanner;
class Exception
{
public static void main(String[]args)
{
int a,b;
System.out.println("Enter two number : ");
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
if(b>0)
{
System.out.println("Result is : "+(a/b));
}
else
{
System.out.println("Still running....");
}
}
}