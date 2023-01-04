package Recursion;
import java.util.*;

public class Recursion {
	static int factorial(int n) {
		
		if(n == 0 || n == 1) {
			return 1;
		}
		return n*factorial(--n);
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose factorial has to be calculated:(less than 15)");
		int n = sc.nextInt();
		System.out.println("The factorial is : "+factorial(n));
		
		
		}
	}


