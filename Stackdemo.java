
import java.util.*;

// create array of size n
// method for push, pop
//show overflow and underflow

public class Stackdemo {
	static int top = -1;
	static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("Enter the size of stack");
	}
	
//	static int maxsize;
	static int [] arr = new int[sc.nextInt()];
	
	
	
	
	
	public static void push(int num) {
		
		if (top >arr.length-1) {
			System.out.println("Overflow");
		}else {
			arr[++top] = num;
			System.out.println("Pushed element :"+arr[top]);
			
			
		}
	}
	public static void display() {
		System.out.println("The stack is:");
		for (int i=0;i<=top;i++) {
			
				System.out.println(arr[i]);
			
		}
	}
	
	public static void pop() {
		if(top ==-1) {
			System.out.println("Stack empty, nothing to pop");
		}
		else
		{
			System.out.println("Popped element : " +arr[top]);
			arr[top--] =0;
			
		}
	}
	public static void search(int num) 
	{
		int counter = 0;
		for (int i:arr) {
			if(i== num) {
				System.out.println("Found");
				counter = 1;
				break;
			}
			
		
			
		}
		if(counter!=1) {
			System.out.println("Not found");
		}
		
		
		
			
		
	}
	public static void peek() {
		if(top == -1) {
			System.out.println("Nothing to peek at yet");
	
		}
		else {System.out.println("Number at top after peek:" +arr[top]);}
	}
	
	
	public static void main(String [] args) {
	//	Scanner sc = new Scanner(System.in); 
	//	System.out.println("Enter the size of stack");
	//	maxsize = sc.nextInt();
		
		peek();
		push(5);
		push(7);
		pop();
		peek();
		display();
		search(6);

	}
	

}
