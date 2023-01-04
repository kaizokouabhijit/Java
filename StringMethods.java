package assignment;

public class StringMethods {

	public static void main(String [ ] args) {
		String s = "My name is Anthony Gonsalves ";
		
		String s1 = "Main duniya me akela hu";
		
		String s3 = "My name is Anthony Gonsalves";
		
		System.out.println(s.charAt(12));  // prints the character at index 12 or 13th character
		
		System.out.println(s.codePointAt(12)); //Returns the character (Unicode code point) at the specified index.
		System.out.println(s.codePointBefore(12));
		System.out.println(s.compareTo(s3));  // returns 0,positive or negative number as it compares two strings lexicographically
		System.out.println(s.contains("is Anthony"));  // returns boolean as it looks for a certain string pattern in the main string
		System.out.println(s.concat(s1));  // joins two strings together
		System.out.println(s.indexOf("is"));  // returns first occurence index of the string specified as argument
		
	}
}
