package threadpackage;

public class Runnabledemo implements Runnable {

	public static void main(String [] args)
	{
		Runnable obj = new Runnabledemo();// ref variable of superclass creates object of subclass that then is used to initialise the obj of thread class
		
		Thread t = new Thread(obj);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From runnable interface run method");
		
	}
}


