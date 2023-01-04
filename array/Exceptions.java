package array;
import java.util.*;

public class Exceptions {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();

if(a<0) {
	throw new ArithmeticException("Number cannot be less than 0");// anything after this line will be unreachable code
	// reason is, a new Object is created named ArithmeticException in the line above. So, the argument is passed to the ArithmeticException constructor and
	// that constructor should return after which the control goes to next line, here that doesn't happen
	
}
}
}
