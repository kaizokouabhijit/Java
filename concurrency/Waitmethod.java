package concurrency;

public class Waitmethod extends Thread {

	public static void main(String [] args) {
		Gunfight g = new Gunfight();
		
		new Thread() {
			public void run() {g.fire(60);}
		}.start();
		new Thread() {
			public void run() {g.reload();}
		}.start();
		
	}
}
