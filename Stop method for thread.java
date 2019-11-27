class Thread1 extends Thread{
public void run()
{
stop();
System.out.println("Welcome to Thread 1");
}
}
class Thread2 extends Thread{
public void run()
{

System.out.println("Welcome to Thread 2");
}
}

class Th21
{
public static void main(String args[])
{
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();

t1.start();
t2.start();
}

}