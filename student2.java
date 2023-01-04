package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student2 implements Comparator<student2> {
    int marks;
    String name;
    Boolean hasPassed;
    student2(int marks, String name, Boolean hasPassed)
    {
        this.marks = marks;
        this.name = name;
        this.hasPassed = hasPassed;


    }


    public static void main(String[] args) {
        student2 s = new student2(10, "Abhijit", true);
        student2 s1 = new student2(20, "Rahul", false);
        student2 s2 = new student2(80, "Bijoy", true);
        student2 s3 = new student2(40, "Tharun", true);
        student2 s4 = new student2(99, "Namrata", false);

        ArrayList<student2> al = new ArrayList<>();
        al.add(s);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        Collections.sort(al, new student2(0,"0", true));
        System.out.println(al);


//        Iterator<student> i = al.iterator();
//
//        while(i.hasNext())
//        {
//
//            System.out.println(i.next()); along with the tostring overloaded method, will return the object details.
//
//        }

    }

    @Override
    public String toString() {
        return "student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", hasPassed=" + hasPassed +
                '}';
    }

    @Override
    public int compare(student2 o1, student2 o2) { // comparator interface method
        if(o1.marks == o2.marks)
        {
            return 0;
        }
        else if (o1.marks>o2.marks)
        {
            return 1;

        }
        else return -1;
    }

    

//    @Override
//    public int compareTo(student inputStudent) {  // compareTo() method is used with generic object type Student, instead of String, int, char etc
//        if(this.marks == inputStudent.marks) {
//            return 0;
//
//        }
//        if(this.marks < inputStudent.marks) {
//            return -1;
//
//        }
//        else
//        {
//            return 1;
//        }
//
//    }
}
