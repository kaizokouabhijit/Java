package questions;

import java.util.Scanner;

public class Pattern {
	
	
public static void main(String [] args) {
	
	int i,j,a, b =1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of lines to print:");
	a = sc.nextInt();
	
	for( i =1; i<=a;i++) {
		
		for (j =0;j<i;j++) {
			
			System.out.print((b++) + " ");
		}System.out.println();
	}
	
	
}
}
