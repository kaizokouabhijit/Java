package synchronisedpackage;

import java.util.Currency;

class test
{
    public synchronized void display(String name)
    {
        for(int i=0;i<3;i++)
        {
            System.out.println(i + " " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Myclass extends Thread
{
    test t;
    Myclass(String name, test t)
    {
        super(name);
        this.t = t;
    }
    public void run()
    {
        t.display(currentThread().getName());
    }
}
public class SynchronizedTest {

    public static void main(String[] args)
    {
        test t = new test();
        Myclass t1 = new Myclass("one", t);
        Myclass t2 = new Myclass("Two", t);
        t1.start();
        t2.start();
    }
}
