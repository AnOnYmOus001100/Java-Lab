class Palindrome
{
public static void main(String[]args)
{
int number,reminder,reverse=0,original;
number=Integer.parseInt(args[0]);
original=number;
while(number != 0)
{
reminder=number % 10;
reverse=reverse*10+reminder;
number /=10;
}
if(original == reverse)
{
System.out.println(original + " is Palindrome Number");
}
else
{
System.out.println(original + " is not Palindrome Number");
}
}
}