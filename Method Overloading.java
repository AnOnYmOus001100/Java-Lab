class Box
{
int length,height,width;
Box()
{
length=height=width=1;
}
void volume()
{
int vo=(length*height*width);
System.out.println("Volume : " +vo);
}
void volume(int val)
{
length=height=width=val;
int vo=(length*height*width);
System.out.println("Volume : " +vo);
}
void volume(int x,int y,int z)
{
	length=x;
	height=y;
	width=z;
int vo=(length*height*width);
System.out.println("Volume : "+vo);
}
public static void main(String[]args)
{
Box box=new Box();
box.volume();
box.volume(10);
box.volume(10,20,30);
}
}