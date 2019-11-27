class Box
{
double w,l;
Box(double w,double l)
{
this.w=w;
this.l=l;
}
void getval()
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
void getval()
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
void getval()
{
System.out.println("Area of Square is : "+(l*w));
}
}
class Main1
{
public static void main(String[]args)
{
Rectangle r1= new Rectangle(5,10);
r1.getval();
Square s1= new Square(15);
s1.getval();
}
}