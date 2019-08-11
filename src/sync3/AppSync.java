package sync3;
import java.util.Scanner;

public class AppSync {
	
	private int count = 0;
	
	public static void main(String[] args) {
		AppSync app = new AppSync();
		app.doWork();
	}
	
	public void doWork()
	{
		Thread t1 = new Thread (new Runnable() {
			public void run()
			{
				
				for (int i = 0; i < 10000; i++)
				{
					count ++;
				}
				
			}
		});
		
		Thread t2 = new Thread (new Runnable() {
			public void run()
			{
				for (int i = 0; i < 10000; i++)
				{
					count ++;
				}
			}
		});
		
		t1.start();
		t2.start();
		
		System.out.println("Count is  : " + count);
	}
}
