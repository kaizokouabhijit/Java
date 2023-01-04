package concurrency;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Daemondemo extends Thread{
    public static void main(String[] args) {
        Daemondemo thread1 = new Daemondemo();
        thread1.setDaemon(true);
        System.out.println(thread1.getPriority());
        thread1.setDaemon(false);
        System.out.println(thread1.isDaemon());

    }
}
