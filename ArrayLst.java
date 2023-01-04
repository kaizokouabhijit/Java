package assignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


	public class ArrayLst {
	    public static void main(String[] args) {
	        //int arr[] = {1,2,3,4,5,6,7,8,9,10};
	        ArrayList<Integer> a =new ArrayList<>();
	        //System.out.println(a);
	        a.add(9);
	        a.add(0,6);
	        a.add(10);
	        a.add(9);
	       
	        
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
	     //   Collections.sort(a);
	        System.out.println(a);
	        Collections.sort(a,Collections.reverseOrder());
	        System.out.println(a);
	        ArrayLst arr = new ArrayLst();
	        arr.myfunc();
	        
	        
	    }
	    
	    class Person {
	    	String name;
	    	int id;
			public Person(String name, int id) {
				super();
				this.name = name;
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			@Override
			public String toString() {
				return "Person [name=" + name + ", id=" + id + "]";
			}
	    	
			
	    }
	    
	    public void myfunc() {
	    
	    Person p1 = new Person("Man",1);
	    Person p2 = new Person("Den",3);
	    //String a = "ff";
	    //ArrayList<Object> persons = new ArrayList<>();
	    //be as specific as you can be, like here we can use object class instead of Person when defining
	    // the ArrayList above, but if we do, then even the string a can be added to persons using .add(), even though it will be garbage value
	    ArrayList<Person> persons = new ArrayList<>();
	    persons.add(p1);
	    persons.add(p2);
	    Collections.sort(persons,(c,b)->b.name.compareTo(c.name));
	    System.out.println(persons);
	    }
	}


