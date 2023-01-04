package compare;

public class Student implements Comparable<Student>{  // Implements comparable interface with generic of student(Object)

// when using comparable interface, we should implement the compareTo in entity method	AS comparable interface is being implemented
	String name;
	int age;
	String gender;
	
	Student(String name, int age, String gender){
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}
	
	public int compareTo(Student inputStudent) {  // compareTo() method is used with generic object type Student, instead of String, int, char etc
		if(this.age == inputStudent.age) {
			return 0;
			
		}
		if(this.age < inputStudent.age) {
			return -1;
		
		}
		else {return 1;}
		
		}
	public String toString() {
		return (name +" "+age+" me rocks"+gender);
		
	}
	
	
	}

