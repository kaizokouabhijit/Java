package concurrency;

public class ThreadGroupDemo extends Thread{
    ThreadGroupDemo(ThreadGroup tg, String name)
    {
        super(tg, name);
    }
    public static void main(String[] args)
    {
        ThreadGroup tg = new ThreadGroup("GroupOfThread");
        ThreadGroupDemo t1 = new ThreadGroupDemo(tg, "Mythread");

        System.out.println(tg.activeCount());//returns number of runnable/ running threads
        System.out.println(tg.isDaemon());
        t1.start();



    }
}
