class Abc
{
final int x=10;
static int y=20;
}
class Bcd extends Abc
{
public static void main(String[]args)
{
Abc p= new Abc();
int a= p.x;
p.x= 20;
int b=y;
y=50;
System.out.println("The value of x is : "+p.x);
System.out.println("The value of y is : "+y);
}
}