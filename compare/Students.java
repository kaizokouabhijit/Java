package compare;
import java.util.*;

public class ComparatorExample {
	public static void main(String [] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Äbdul", 24, "M"));
		studentList.add(new Student("Rahul", 24, "M"));
		studentList.add(new Student("Ravi", 24, "M"));
		studentList.add(new Student("Abhi", 26, "M"));
		studentList.add(new Student("Aditi", 22, "F"));
		Collections.sort(studentList, new ComparatorExample());
		System.out.println(studentList);
	}

}