class Thread1 implements Runnable{
public void run()
{

System.out.println("Welcome to Thread 1");
}
}
class Thread2 implements Runnable{
public void run()
{

System.out.println("Welcome to Thread 2");
}
}

class Rnabl
{
public static void main(String args[])
{
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();
Thread t = new Thread(t1);
Thread th = new Thread(t2);


t.start();
th.start();
}

}