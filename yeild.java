class Thread1 extends Thread{
public void run()
{

for(int i=0;i<10;i++)
{
try{
if(i==3)
yield();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Welcome to Thread 1 after yield");
}
}
}
class Thread2 extends Thread{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Welcome to Thread 2 before yield");
}
}
}

class Th23
{
public static void main(String args[])
{
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();

t1.start();


t2.start();
}

}