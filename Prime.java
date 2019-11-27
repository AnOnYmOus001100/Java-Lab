import java.util.Scanner;
class Prime
{
  public static void main(String args[])
  {
    int num, i, count=0;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a Number : ");
    num = ob.nextInt();
    for(i=2; i<num; i++)
    {
      if(num%i == 0)
      {
        count++;
        break;
      }
    }
    if(count == 0)
    {
     System.out.print("This is a Prime Number");
    }
    else
    {
       System.out.print("This is not a Prime Number");
    }
    }
}