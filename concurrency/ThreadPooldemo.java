package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooldemo extends Thread{

    public void run()
    {
        for(int i =0; i<3;i++)
        {
            System.out.println("Thread: " + currentThread().getName() + " is running And  " + i);
            try {
                currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args)
    {
        //Take a constant
        // create a thread pool with number of max threads
        //create a task
        //pass the task to thread pool
        //close the thread pool
        final int FIXED_CAPACITY =5;
        ExecutorService exec = Executors.newFixedThreadPool(FIXED_CAPACITY);


         //   ThreadPooldemo [] obj = new ThreadPooldemo[FIXED_CAPACITY];
            for(int j=0; j<FIXED_CAPACITY;j++)
            {

                exec.execute(new ThreadPooldemo());
            }


        exec.shutdown();



        }
}
