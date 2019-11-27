abstract class Boxx{
double l,b;
Boxx(double a,double c)
{
  l=a;
 b=c;
  }
 
abstract void area();
 
 
}
 
 class Rectangle extends Boxx{
 Rectangle(double a,double c)
 {
 super(a,c);
 }
 
 void area()
 {

 System.out.println("Area of Rectangle : "+l*b);
 }
 }
 
 class Square extends Boxx{
Square(double a)
 {
 super(a,a);
 }
 
 void area()
 {
 double ar=l*l;
 System.out.println("Area of Square : "+l*l);
 }
 }
  class Boxmain1{
  public static void main(String args[])
  {
 
  Rectangle r = new Rectangle(2,3);
  r.area();
   Square s = new Square(2);
   s.area();
   
 
  }
  }