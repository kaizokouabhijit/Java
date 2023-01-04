package newproject;

public interface AnonymousBenefits {

    void display();

    public static void main(String[] args) {


        AnonymousBenefits obj = () -> {
            System.out.println("One of the benefits of anonymous class");
            System.out.println(" Even though AnonymousBenefits is an interface, we are able to create an object    ");
            System.out.println("The main reason we couldn't do it is because the method inside the interface had no implementation");
            System.out.println("But this way we are providing the body of the method. This is the benefit of Anonymous classes");
        };
        obj.display();
    }
}