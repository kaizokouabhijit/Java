package compare;
import java.util.*;

public class ComparatorExample implements Comparator<Student>{

	public int compare(Student first, Student second) {
		if(first.age == second.age) {
			return 0;
		}
		if(first.age < second.age) {
			return -1;
		}else {return 1;}
	}
}
