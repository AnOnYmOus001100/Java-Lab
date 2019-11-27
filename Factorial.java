import java.util.Scanner;
class Factorial
{
public static void main(String[]args)
{
int fact,i,a;
Scanner ob = new Scanner(System.in);
System.out.println("Enter The Number :");
a=ob.nextInt();
i=1;
fact=1;
while(i<=a)
{
fact=fact*i;
i++;
}
System.out.println(fact);
}
}