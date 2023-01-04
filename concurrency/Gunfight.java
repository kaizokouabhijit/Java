package concurrency;

public class Gunfight {

	private int bullet = 40;
	synchronized public void fire (int BulletsProvided) {
		for(int i =1; i<=BulletsProvided; i++) {
			if(bullet ==0) {
				System.out.println("No bullets fired");
				System.out.println("Invoking the wait method");
			try {
				wait();
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Continuing");
			}
			bullet--;
		}
		System.out.println("Firing complete");
	}
synchronized public void reload() {
	System.out.println("Reloading the magazine and notifying the thread");
	bullet +=40;
	notify();
}

}
