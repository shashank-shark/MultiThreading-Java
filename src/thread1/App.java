package thread1;

class Runner extends Thread 
{
	public void run ()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Hello World  :  " + i);
			try
			{
				Thread.sleep(100);
				
			} catch (InterruptedException e)
			{
				System.out.println(e.toString());
			}
		}
	}
}

public class App {
	public static void main(String[] args) {
		// creating instance of Runner
		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
	}

}
