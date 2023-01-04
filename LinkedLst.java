package assignment;
import java.util.*;

public class LinkedLst {

	public static void main(String [] args) {
	LinkedList <Integer> ll= new LinkedList<Integer>(); // even this is created using doublylinked list
	
	ll.add(1);
	ll.add(8);
	ll.add(6);
	ll.add(5);
	ll.add(4);
	ll.add(6);
	ll.add(6);
	
	ll.remove();
	ll.remove(4);
	LinkedList <Integer> ll2= new LinkedList<Integer>();
	ll2.add(6);
	ll.remove(ll2);// pass object as parameter and it will remove the object
	
	
	Object b[] = ll.toArray();
	for( Object i : b) {
		System.out.println(i);
	}
	
	
		System.out.println(ll.contains(ll2));
		
		System.out.println(ll.get(2));
		ll.set(5, 10);	
		System.out.println(ll);
		
		// Methods of linked lists
		// removeFirst/Last(), addFirst/Last(), peek(), poll(), pollFist()
		
		
		// the commented code below returns the same ll as objects.... Iterators do the same thing, I think
//		 Object d[]=ll.toArray(new Object[ll.size()]);
//	        for (Object e:d) {
//	            System.out.println(e);
//	            }
	        Iterator i = ll.iterator();
	        while(i.hasNext()) {
	        	System.out.println(i.next());
	        }
	
	        Collections.sort(ll);
	        System.out.println(ll);
	        
	        Collections.sort(ll, Collections.reverseOrder());
	        System.out.println(ll);
	        
	        LinkedLst arr = new LinkedLst();
	        arr.myfunc();
	       	
	}

	class Person{
		
		String name;
		int roll;
		public Person(String name, int roll) {
		
			this.name = name;
			this.roll = roll;
			}
		@Override
		public String toString() {
			return "Person [name=" + name + ", roll=" + roll + "]";
		}
		
	}
		public void myfunc() {
			Person p1 = new Person("Abhijit", 100);
			Person p2 = new Person("Rahul", 101);
			Person p3 = new Person("Bijoy", 102);
			
			ArrayList<Person> alp= new ArrayList<>();
			
			alp.add(p3);
			alp.add(p2);
			alp.add(p1);
			
			Collections.sort(alp,(a,b)->a.name.compareTo(b.name));
			System.out.println(alp);
			Collections.sort(alp,(c,d)->(d.roll - c.roll));
			System.out.println(alp);
									
		}	}


// always starts from first node,,,, Not for random access of nodes based on index
// adding element takes less time than arraylist as node can be inserted anywhere but the remaininig elements don't have to be shifted
// removal is faster as well
//Extra memory is reqd for storing the address of the next node


// DOUBLY LINKED LIST

 //Traversing  backword is possible
 // previous node is easily accessible
//java uses doubly linked list

