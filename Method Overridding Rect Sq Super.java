class Box
{
double w,l;
Box(double a,double b)
{
w=a;
l=b;
}
void volume()
{
System.out.println(l*w);
}
}
class Rectangle extends Box
{
Rectangle(double a,double b)
{
super(a,b);
}
void volume()
{
System.out.println("Area of Rectangle is : "+(l*w));
}
}
class Square extends Box
{
Square(double a)
{
super(a,a);
}
void volume()
{
System.out.println("Area of Square is : "+(l*w));
}
}
class Main
{
public static void main(String[]args)
{
Rectangle r1= new Rectangle(5,10);
r1.volume();
Square s1= new Square(15);
s1.volume();
}
}