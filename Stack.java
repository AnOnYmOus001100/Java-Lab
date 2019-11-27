import java.util.*;
class Stack
{
int stk[];
int top;
Stack()
{
stk = new int[10];
top = -1;
}
Stack(int size)
{
stk = new int[size];
top = -1;
}
void push(int x)
{
if(top== stk.length-1)
System.out.println("Stack is full.");
else
stk[++top] = x;
}
int pop()
{
if(top<0)
{
System.out.println("Stack is empty.");
return 0;
}
else
return stk[top--];
}
void display()
{
for (int i=0;i<=stk.length;i++)
{
System.out.println(stk[0]);
}
}
public static void main(String[]args)
{
int s,ch,n,p;
int f=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size :");
s = sc.nextInt();
Stack s1 = new Stack(s);
while(f==1)
{
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display");
System.out.println("4. Exit");
System.out.println("Enter your choice :");
ch = sc.nextInt();
switch(ch)
{
case 1: System.out.println("Enter the element to push");
n = sc.nextInt();
s1.push(n);
break;
case 2: p = s1.pop();
System.out.println("The popped element is" + p);
break;
case 3: s1.display();
break;
case 4: f=0;
break;
default: System.out.println("Your input is wrong");
}
}
}
}