package concurrency;

public class xten extends Thread{
    public void run()
    {
        System.out.println("Priority is :" + currentThread().getPriority());
    }
        xten(String name)
        {
            super(name);
        }
    public static void main(String[] args) throws InterruptedException {


        System.out.println(currentThread().getPriority());
        xten obj = new xten("T1");
        obj.start();
        currentThread().join();

        System.out.println("Not executed");// doesn't get printed as the main method gets stuck at .join()
    }
}
