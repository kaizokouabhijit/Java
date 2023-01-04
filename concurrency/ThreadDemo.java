package concurrency;

public class ThreadDemo {

	
	
	
	
	public static void main(String [] args) {
		System.out.println("Main thread");
		Thread threadObj = new SecondaryThread();
		threadObj.setName("Abhijit");
		
	
		threadObj.start();
		
		//	threadObj.run();
		// instead of .start, if we use .run() here, then there is no error, but the new thread is not created and this command
		//runs on main thread.
		
		new Thread() {
			public void run() {
				System.out.println("Anonymous class");
			}
		}.start();
		
		Thread myRunnable = new Thread(new MyRunnable() {@Override
		public void run() {
			
			System.out.println("Anonymous class in Runnable");
		}});
		myRunnable.start(); 
		
		System.out.println("Back to main thread");
		
		
		
			
	}
}
