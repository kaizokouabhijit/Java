package newproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayLst {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> a =new ArrayList<Integer>();
        //System.out.println(a);
        a.add(9);
        a.add(0,6);
        a.add(10);
        a.remove(new Integer(6));
        System.out.println(a.size());
        a.clear();
        if(a.isEmpty()){
            System.out.println("List is empty");
        }
        else
            System.out.println("list is not empty");
        a.add(2);
        if(a.contains(2))
            System.out.println("Elements found");
        else
            System.out.println("Not found");
        Object b[] = a.toArray();
        for (Object c:b) {
            System.out.println(c);
        }

        Object d[]=a.toArray(new Object[a.size()]);
        for (Object e:d) {
            System.out.println(e);
        }
        System.out.println(a.get(0));
        a.set(0,99);
        System.out.println(a);
        a.clone();
        a.ensureCapacity(100);
        System.out.println(a);
        Integer r = new Integer(3);
        Object y = (Object) r;
        System.out.println(y);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        Iterator i = a.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        a.forEach(j -> System.out.println(i));
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
    }
}


