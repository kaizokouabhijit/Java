package inputoutputpackage;

import java.io.Serializable;

class Animal{
    static int i =10;
    Animal()
    {
        System.out.println("From animal class");
    }
    void eat(){System.out.println("eating animal class");}
}
class Dog extends Animal{
    static int i = 20;
    Dog()
    {
        System.out.println("From Dog class");
    }
    void eat(){System.out.println("eating from dog class");}
}
class BabyDog extends Dog{
    static int i = 30;
    BabyDog()
    {
        System.out.println("From BabyDog class");
    }
    void eat(){System.out.println("eating from babydog class");}
    public static void main(String args[]){
        Animal a1,a2,a3;
        a1=new Animal();
        a1.eat();
        System.out.println();
        a2=new Dog();
        a2.eat();
        System.out.println();
        a3=new BabyDog();
        a3.eat();

        System.out.println();
        System.out.println(a1.i);
        System.out.println(a2.i);
        System.out.println(a3.i);



    }
}