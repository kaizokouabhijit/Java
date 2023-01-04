package compare;
import java.util.*;

public class ComparableExample {
	public static void main(String [] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Äbdul", 24, "M"));
		studentList.add(new Student("Rahul", 24, "M"));
		studentList.add(new Student("Ravi", 24, "M"));
		studentList.add(new Student("Abhi", 26, "M"));
		studentList.add(new Student("Aditi", 22, "F"));
		Collections.sort(studentList);
		System.out.println(studentList);
	}

}
