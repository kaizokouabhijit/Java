package assignment;
import java.util.*;



public class LstDemo {

	public static void main(String [] args) {
	List <Integer> lst = new ArrayList<>();
	lst.add(323);
	lst.add(231);
	lst.add(349);
	lst.add(356);
	
	//lst.add(null);
//	System.out.println(lst);
//	lst.remove(1);
//	lst.remove(2);
//	System.out.println(lst);
//	
	
	
//	lst1.add(9);
//	lst1.add(3);
	//lst.removeAll(lst1);
	//System.out.println(lst);
	
//	lst1.add(1);
	//System.out.println(lst1);
	
	//lst.retainAll(lst1);
	//System.out.println(lst);
	//System.out.println(lst1);
	
	
	//Collections.sort(lst);
	
	
 Comparator <Integer> com = new CompImpl();
 Collections.sort(lst,com);

	for(int i:lst) {
		System.out.println(i);
	}
 
 
	}
	
}
