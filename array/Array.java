package array;
import java.util.*;
//find the number of appearances of each element in the array
public class Array {
	
public static void main(String [] args) {
	int [] a = {1,2,3,3,3,4,2,1,5};
	int [] b = new int[a.length];
	//we create another array with all zeros which become 1 when we see any element we have encountered before already and skip it.
		
	for (int i =0; i<a.length;i++) {
		if(b[i] == 1) {continue;}
		int count = 1;
		for (int j =i+1;j<a.length;j++) {
			if(a[i] == a[j]) {
				count++;
				b[j] =1;
				
			}
		}
		System.out.println("The number: "+ a[i] + " has occured " +count + " times");
	}
	
	
}
}
