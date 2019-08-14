import java.util.Date;
class MyThreadNew extends Thread {
	Thread t;
	Date date;
	MyThreadNew()
	{
		t = new Thread(this);
		t.start();
	}
	MyThreadNew(String name)
	{
		t = new Thread(this, name);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				date = new Date();
				System.out.println("Time : " + date + " and My Thread : " + t.getName());
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread " + t.getName() + " interrupted.");
		}
	}
}
public class MyThreadChange {
	public static void main(String args[])
	{
		MyThreadNew T1 = new MyThreadNew();
		MyThreadNew T2 = new MyThreadNew("Testing_Thread");
	}
}
		