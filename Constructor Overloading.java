class Box1
{
int length,heigth,width;
Box1()
{
length=heigth=width=1;
}
Box1(int a,int b,int c)
{
length=a;heigth=b;width=c;
}
Box1(int a)
{
length=heigth=width=a;
}
void volume()
{
int val=(length*heigth*width);
System.out.println("Volume : "+val);
}
public static void main(String[]args)
{
Box1 box= new Box1();
box.volume();
Box1 box1= new Box1(10);
box1.volume();
Box1 box2= new Box1(10,20,30);
box2.volume();
}
}