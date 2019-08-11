package sync1;

import java.util.Scanner;

class Processor extends Thread
{
	private volatile boolean running = true;
	
	public void run ()
	{
		while (running)
		{
			System.out.println ("Hello");
			
			try
			{
				Thread.sleep(100);
				
			} catch (InterruptedException e)
			{
				System.out.println(e.toString());
			}
		}
	}
	
	public void shutdown ()
	{
		running = false;
	}
}

public class AppSync {
	public static void main(String[] args) {
		Processor proc1 = new Processor ();
		proc1.start();
		
		System.out.println("Press Return to stop");
		Scanner scn = new Scanner (System.in);
		
		scn.nextLine();
		proc1.shutdown();
		
	}
}
