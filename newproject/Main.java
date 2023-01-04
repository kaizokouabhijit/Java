package newproject;

public class Main {
    int i;
    static int k;
    public void display(){
        System.out.println(this.i);
    }
    class Inner{
        int j;
        public void display(){
            System.out.println(this.j + " from the inner class");
        }
    }
    static class Staticinner{
        int l;
        public void display(){
            System.out.println(this.l + " from the static inner class");
        }
    }
    public static void main(String[] args) {
        Main obj = new Main();  // outer class object
        Main.Inner obj1 = obj.new Inner();       // inner class object is declared using outer class object
        Main.Staticinner obj2 = new Main.Staticinner();//for static inner class, obj can be declared using just outer.inner class name

        obj.i = 10;
        obj1.j = 13;
        obj2.l = 14;
        obj.display();
        obj1.display();//method overriding
        obj2.display();//method overriding
        Main.k = 15;// in the main method static variable of a class can be initialised using class.var
        System.out.println(k);


    }
}
