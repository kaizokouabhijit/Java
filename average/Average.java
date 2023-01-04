package average;
import java.util.*;
public  class Average {
	
	public static double average(int [] arr) {
		
		double sum =0;
		double average =0;
		for (int n:arr) {
			System.out.print(n + " ");
			sum = sum + n;
			
		}System.out.println();
	//	System.out.println("Average:" +(sum/arr.length));
		return (sum/arr.length);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number of inputs:");
		int input = sc.nextInt();
		int[] arr = new int [input];
		
		for (int i =0;i<input;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arr);// if you print just arr, then it returns address of first element of arr
		
		double res =average(arr);
		System.out.println(res);
		
		
			
	}
}
		
		