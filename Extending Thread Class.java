class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread1 "+i);
		}
	}
}
class Thread2 extends Thread1
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread2 "+i);
		}
	}
}
class Main2
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}

