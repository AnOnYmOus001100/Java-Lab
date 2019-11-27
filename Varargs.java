class Varargs
{
static void test(int...v)
{
System.out.println("Number Of Arguments:"+v.length);
int sum=0;
for(int i:v)
{
sum=sum+i;
}
System.out.println("Sum IS :"+sum);
}
public static void main(String args[])
{
test();
test(10,20);
test(10,20,30,40,50);
}
}