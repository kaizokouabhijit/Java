package inputoutputpackage;
import java.util.*;

public class QueueImp {

    static int front = -1;
    static int rear = -1;
    static int [] arr = new int [10];




    public static void add(int num) {

        if(front ==-1 && rear == -1) {
            System.out.println("empty queue");

            front = 0;
        }


        arr[++rear] = num;


    }
    public static void del() {

        if(front == rear) {
            int front = -1;
            int rear = -1;
        }


        System.out.println("Deleted element is :" +arr[front]);
        arr[front++] =0;


    }
    public static void display() {
        for (int i = front; i<=rear;i++) {
            System.out.println(arr[i]);
        }
    }
    public static void search(int d)
    {
        for(int i = front; i<=rear;i++)
        {
            if(arr[i] == d)
            {
                System.out.println("found at " + i + " position");
            }
        }
    }

    public static void main(String [] args) {

        add(3);
        add(5);
        add(4);
        del();
        add(6);
        add(7);
        display();
        search(4);


    }
}
