package assignment;
import java.util.*;

public class VectorDemo {
	
	

	public static void main(String [] args) {
	
Vector <Integer> v = new Vector<>();
v.add(1);
v.add(2);
v.add(3);

Iterator <Integer> it = v.iterator();
while(it.hasNext()) {
	
	System.out.println(it.next());	
}
ListIterator<Integer> li = v.listIterator(v.size());
while(li.hasPrevious()) {
	System.out.println(li.previous());
}


}
	
	}
