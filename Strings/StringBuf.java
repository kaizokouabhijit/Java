package Strings;

public class StringBuf {
	
	public static void main(String [] args) {
		StringBuffer s = new StringBuffer("My name is Anthony Gonsalves");
		StringBuffer s1 = new StringBuffer("My name is Anthony Goalves");
		System.out.println(s.append(", main duniya me akela hu"));
		s1.insert(2, " ek haseena thi");
		
		s1.delete(0, 2);
		System.out.println(s.substring(12));
		
		
		
	}

}
