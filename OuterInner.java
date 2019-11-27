class Outer
{
int x=100;
void test()
{
Inner ob=new Inner();
ob.display();
}
class Inner
{
int y=200;
void display()
{
System.out.println("x=" +x);
}
}
void show()
{
System.out.println("y=" +y);
}
}
class OuterInner
{
	public static void main(String[]args)
	{
       Outer o=new Outer();
       o.test();
    }
}