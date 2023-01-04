package threadpackage;

public class threadingdemo extends Thread {

	public static void main(String[] args) {
		threadingdemo obj = new threadingdemo();
        obj.start(); // to move thread to running state,the thread then calls run() implicitly
    }
    public void run()
    {
        System.out.println("Run() method of main class called");
    }
}
