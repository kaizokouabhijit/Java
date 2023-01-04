package concurrency;

public class SecondaryThread extends Thread{
	
	public void run() {
		System.out.println("Running from " +currentThread().getName());
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.println("Some other thread interrupted");
		}System.out.println("5 seconds over");
	}
}
