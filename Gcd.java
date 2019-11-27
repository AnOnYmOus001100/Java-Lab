import java.util.Scanner;
class Gcd
{
private static Scanner ob;
public static void main(String[]args)
{
int a,b,g=0,i;
ob= new Scanner(System.in);
a= ob.nextInt();
b= ob.nextInt();
for(i=1;i<=a && i<=b;i++)
{
if(a%i==0 && b%i==0)
g=i;
}
System.out.println("The Gcd is :" +g);
}
}