package multithreadingdemo;

public class multithretest extends Thread {
    public static void main(String[] args) {
        multithretest obj = new multithretest();
        obj.start(); // to move thread to running state,the thread then calls run() implicitly
    }
    public void run()
    {
        System.out.println("Run() method of main class called");
    }
}
