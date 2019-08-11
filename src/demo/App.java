package demo;



public class App {
	public static void main(String[] args) {
		Thread t1 = new Thread (new Runnable() {
			
			
			// run method
			public void run ()
			{
				for (int i = 0; i < 10; i++)
				{
					System.out.println("Hello Wold  " + i);
					try
					{
						Thread.sleep(100);	
					} catch (InterruptedException e)
					{
						System.out.println(e.toString());
					}
				}
			}
		});
		
		t1.start();
	}
}
