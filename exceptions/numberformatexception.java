package exceptions;
import java.util.*;


public class numberformatexception {
	public static void function(String s) throws NumberFormatException{
		if(s.charAt(0) == 'a' || s.charAt(0) == 'A') {     //s.startsWith(0) can be used as well, instead of charAt 
			
			
			System.out.println("Don't start with a");
		}
		else {
			System.out.println(s);
			}
	}
public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string");
	String s = sc.nextLine();
	try {
		function(s);
	}
	catch(NumberFormatException e) {
		System.out.println(Arrays.toString(e.getStackTrace()));
	}
	function(s);
	
}
}
