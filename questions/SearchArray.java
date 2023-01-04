package questions;
import java.util.*;

//search array and reverse array both in this

public class SearchArray {

public static void main(String [] args) {
	
	
	Scanner sc = new Scanner(System.in);
	int counter=0;
	
	System.out.println("enter the size of array");
	int size = sc.nextInt();
	int [] arr = new int[size];
	
	System.out.println("Enter the array:");
	for(int i =0; i<size;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println("Enter the target of search:");
	int target = sc.nextInt();
	for (int i=0;i<size;i++)
	{
		if(arr[i] == target) 
		{
			System.out.println(i);
			counter=1;
			
		}
		
		
	}
	if(counter == 0) {
		System.out.println("Not found");
	}
	 
	int mid = arr.length / 2;

    int temp;
    int j = arr.length -1;

    for (int k = 0 ; k < mid; k++) {
        temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
        j--;
    }
    
    for (int a:arr) {
    	System.out.println(a);
    }
	}
	
}



	
	


