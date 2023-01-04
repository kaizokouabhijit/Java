package concurrency;

import static java.lang.Thread.sleep;

class Runnabledemo extends Thread {
    Runnabledemo(String name)
    {
        super(name);
    }

    public static void main(String [] args) throws InterruptedException {
        Runnabledemo obj = new Runnabledemo("T1");// ref variable of superclass creates object of subclass that then is used to initialise the obj of thread class
        Runnabledemo obj1 = new Runnabledemo("T2");
        Runnabledemo obj2 = new Runnabledemo("T3");
        obj.setPriority(6);
        obj1.setPriority(2);
        obj2.setPriority(10);
        obj.start();
        obj.join();// due to the join method, obj's run method is completed first
        obj1.start();
        obj1.join(500);
        obj2.start();

    }
//currentThread() method of the thread class always points to the currently executing thread
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i =0; i<3;i++)
        {
            System.out.println(i + " " + currentThread().getName());
            //currentThread().getName() will only print the name... we can also use this keyword
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


