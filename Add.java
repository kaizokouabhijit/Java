package Interrfa;

import java.util.Scanner;

public abstract class Add implements Interface{
	int total = 0;

	@Override
	public void sum() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ënter 5 numbers only:");
		
		for (int i = 0;i<5;i++) {
			total = total + s.nextInt();
		}
		
		System.out.println("The sum is:" +total);
	}

}
