package questions;
import java.util.*;

public class Armstrong {
	
	
	public static void main(String [] args) {
		int a, input, b, result =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check");
		a = sc.nextInt();
		input = a;
		while(a>0) {
		b = a%10;
		result += b*b*b;
		a = a/10;
		}
		
		if(result == input) {
			System.out.println("Armstrong number");
		}else {System.out.println("Not Armstrong");}
		
	}

}
