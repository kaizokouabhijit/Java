package questions;

import java.util.Scanner;




public static void main(String [] args) {
		
		
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the Series are");
        for( int i =a, j=b ; i>=b&&j<=a ; i=i-2 ,j=j+2) {
        	System.out.print(i+" "+j+" ");
        }
	}

}
