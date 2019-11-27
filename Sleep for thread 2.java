class Thread1 extends Thread{
public void run()
{

System.out.println("Welcome to Thread 1");
}
}
class Thread2 extends Thread{
public void run()
{
try{

sleep(3000);
System.out.println("Waiting for 3sec due to Interruption");
}
catch(InterruptedException i)
{

}

System.out.println("Welcome to Thread 2");
}
}

class Th22
{
public static void main(String args[])
{
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();

t1.start();
t2.start();
}

}