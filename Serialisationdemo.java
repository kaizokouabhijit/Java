package inputoutputpackage;

import java.io.*;

public class Serialisationdemo implements Serializable {
    int id;
    transient String name;
    int salary;
    Serialisationdemo(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialisationdemo s = new Serialisationdemo(1, "Abhi", 3000);
        FileOutputStream fos = new FileOutputStream("C:/Users/abhijit.s/Downloads/abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        FileInputStream fis = new FileInputStream("C:/Users/abhijit.s/Downloads/abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        oos.writeObject(s);
        Serialisationdemo obj = (Serialisationdemo)ois.readObject();
        System.out.println(obj);

    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary
                ;
    }
}
