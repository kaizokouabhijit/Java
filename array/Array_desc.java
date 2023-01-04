package array;
import java.util.*;

public class Array_desc {
public static void main(String [] args) {
	int temp;
	int [] a = {1,2,3,4,5,6,7,8,3,4,0};
	for(int i=0;i<a.length;i++) {
		for(int j =i+1; j<a.length;j++) {
			
			if(a[i]<a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
	for (int b:a) {
		System.out.print(b + " ");
	}
	
	//System.out.println(Arrays.toString(a));
	
}
}

