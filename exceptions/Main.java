package exceptions;
import java.util.*;
// method will take 2 parameters a,b. Divide a by b. then call the method from main and print the answer.
public class Main {

	public static void Divide(int a, int b) {
		try {
			int result = a/b;
			System.out.println("Result is :"+ result);
		}
		
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
		
	
	
	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter two inputs one after the other:");
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b != (int)b || a!=(int)a ) throw new InputMismatchException("xyz");
		Divide(a,b);
		
		}
		catch( InputMismatchException e) {
			//System.out.println("Both inputs should be integers");

			System.out.println(e.printStackTrace());
		}	}
	}

		