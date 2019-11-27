class Exc1
{
public static void main(String[]args)
{
int a=110,result=0;
try
{
result=a/Integer.parseInt(args[0]);
}
catch(ArithmeticException e)
{
System.out.println(result);
}
System.out.println("We are still running");
}
}