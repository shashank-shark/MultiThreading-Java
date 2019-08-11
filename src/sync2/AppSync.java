package sync2;

import java.util.Scanner;



public class AppSync {
	
	private int count  = 0;
	
	public static void main(String[] args) {
		AppSync app = new AppSync();
		app.doWork();
	}
	
	public synchronized void increment ()
	{
		count ++;
	}
	
	public void doWork ()
	{
		// work to be down here
		Thread t1 = new Thread (new Runnable() {
			public void run ()
			{
				for (int i = 0; i < 100000; i++)
				{
					increment();
				}
			} 
		});
		
		Thread t2 = new Thread (new Runnable() {
			public void run ()
			{
				for (int i = 0; i < 100000; i++)
				{
					increment();
				}
			}
		});
		
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		}catch (InterruptedException e)
		{
			System.out.println(e.toString());
		}

		
		System.out.println ("Count is    :     " + count);
	}
}
