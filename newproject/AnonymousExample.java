package newproject;

public class AnonymousExample {

    public static void add(int i ,int j){
        System.out.println(i+j);
    }

    public void display(){
        System.out.println("Earlier mobiles had only calling functionality");
    }
// this class has a display method, but we create another class inside main and override the display method
    public static void main(String[] args) {
        AnonymousExample obj = new AnonymousExample(){
            public void display(){// this is a class that has no name, hence it is called Anonymous class
                System.out.println("but nowadays, a mobile is basically a computer, a phone, a camera, a map");
            }
        };
        obj.display();
    short s = 10;
    add(s,15);
    }
}
